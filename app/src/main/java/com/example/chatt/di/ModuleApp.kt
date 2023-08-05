package com.example.chatt.di

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class ModuleApp {

    @Provides
    @Singleton
    fun authFirebase() : FirebaseAuth{
        return FirebaseAuth.getInstance()
    }
    @Provides
    @Singleton
    fun databaseProvider() : FirebaseDatabase {
        return Firebase.database
    }
    @Provides
    @Singleton
    fun fireStoresProviders() : FirebaseFirestore {
        return Firebase.firestore
    }

}
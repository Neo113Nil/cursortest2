package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import kotlin.coroutines.CoroutineContext;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Blocking"})
@DaggerGenerated
/* loaded from: classes4.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory implements Factory<DataStore<SessionData>> {
    private final javax.inject.a<Context> appContextProvider;
    private final javax.inject.a<CoroutineContext> blockingDispatcherProvider;
    private final javax.inject.a<SessionDataSerializer> sessionDataSerializerProvider;

    public FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory(javax.inject.a<Context> aVar, javax.inject.a<CoroutineContext> aVar2, javax.inject.a<SessionDataSerializer> aVar3) {
        this.appContextProvider = aVar;
        this.blockingDispatcherProvider = aVar2;
        this.sessionDataSerializerProvider = aVar3;
    }

    public static FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory create(javax.inject.a<Context> aVar, javax.inject.a<CoroutineContext> aVar2, javax.inject.a<SessionDataSerializer> aVar3) {
        return new FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory(aVar, aVar2, aVar3);
    }

    public static DataStore<SessionData> sessionDataStore(Context context, CoroutineContext coroutineContext, SessionDataSerializer sessionDataSerializer) {
        return (DataStore) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.sessionDataStore(context, coroutineContext, sessionDataSerializer));
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, javax.inject.a
    public DataStore<SessionData> get() {
        return sessionDataStore(this.appContextProvider.get(), this.blockingDispatcherProvider.get(), this.sessionDataSerializerProvider.get());
    }
}

package com.google.firebase.sessions;

/* loaded from: classes3.dex */
public final class SessionDatastoreImpl_Factory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.SessionDatastoreImpl> {
    private final javax.inject.Provider<kotlin.coroutines.CoroutineContext> backgroundDispatcherProvider;
    private final javax.inject.Provider<androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> dataStoreProvider;

    public SessionDatastoreImpl_Factory(javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider, javax.inject.Provider<androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> provider2) {
        this.backgroundDispatcherProvider = provider;
        this.dataStoreProvider = provider2;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.SessionDatastoreImpl get() {
        return newInstance(this.backgroundDispatcherProvider.get(), this.dataStoreProvider.get());
    }

    public static com.google.firebase.sessions.SessionDatastoreImpl_Factory create(javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider, javax.inject.Provider<androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> provider2) {
        return new com.google.firebase.sessions.SessionDatastoreImpl_Factory(provider, provider2);
    }

    public static com.google.firebase.sessions.SessionDatastoreImpl newInstance(kotlin.coroutines.CoroutineContext coroutineContext, androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        return new com.google.firebase.sessions.SessionDatastoreImpl(coroutineContext, dataStore);
    }
}

package com.google.firebase.sessions;

/* loaded from: classes3.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_SessionDetailsDataStoreFactory implements com.google.firebase.sessions.dagger.internal.Factory<androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> {
    private final javax.inject.Provider<android.content.Context> appContextProvider;

    public FirebaseSessionsComponent_MainModule_Companion_SessionDetailsDataStoreFactory(javax.inject.Provider<android.content.Context> provider) {
        this.appContextProvider = provider;
    }

    @Override // javax.inject.Provider
    public androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> get() {
        return sessionDetailsDataStore(this.appContextProvider.get());
    }

    public static com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_SessionDetailsDataStoreFactory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_SessionDetailsDataStoreFactory(provider);
    }

    public static androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> sessionDetailsDataStore(android.content.Context context) {
        return (androidx.datastore.core.DataStore) com.google.firebase.sessions.dagger.internal.Preconditions.checkNotNullFromProvides(com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.INSTANCE.sessionDetailsDataStore(context));
    }
}

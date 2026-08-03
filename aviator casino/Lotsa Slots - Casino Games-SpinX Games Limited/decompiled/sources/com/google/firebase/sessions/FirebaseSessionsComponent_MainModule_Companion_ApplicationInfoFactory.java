package com.google.firebase.sessions;

/* loaded from: classes3.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.ApplicationInfo> {
    private final javax.inject.Provider<com.google.firebase.FirebaseApp> firebaseAppProvider;

    public FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(javax.inject.Provider<com.google.firebase.FirebaseApp> provider) {
        this.firebaseAppProvider = provider;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.ApplicationInfo get() {
        return applicationInfo(this.firebaseAppProvider.get());
    }

    public static com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory create(javax.inject.Provider<com.google.firebase.FirebaseApp> provider) {
        return new com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(provider);
    }

    public static com.google.firebase.sessions.ApplicationInfo applicationInfo(com.google.firebase.FirebaseApp firebaseApp) {
        return (com.google.firebase.sessions.ApplicationInfo) com.google.firebase.sessions.dagger.internal.Preconditions.checkNotNullFromProvides(com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.INSTANCE.applicationInfo(firebaseApp));
    }
}

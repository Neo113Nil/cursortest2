package com.google.firebase.sessions;

/* loaded from: classes3.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.TimeProvider> {
    @Override // javax.inject.Provider
    public com.google.firebase.sessions.TimeProvider get() {
        return timeProvider();
    }

    public static com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory create() {
        return com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory.InstanceHolder.INSTANCE;
    }

    public static com.google.firebase.sessions.TimeProvider timeProvider() {
        return (com.google.firebase.sessions.TimeProvider) com.google.firebase.sessions.dagger.internal.Preconditions.checkNotNullFromProvides(com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.INSTANCE.timeProvider());
    }

    private static final class InstanceHolder {
        private static final com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory INSTANCE = new com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory();

        private InstanceHolder() {
        }
    }
}

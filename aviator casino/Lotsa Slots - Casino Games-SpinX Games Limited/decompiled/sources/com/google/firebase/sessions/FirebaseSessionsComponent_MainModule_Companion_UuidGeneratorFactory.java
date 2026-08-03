package com.google.firebase.sessions;

/* loaded from: classes3.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.UuidGenerator> {
    @Override // javax.inject.Provider
    public com.google.firebase.sessions.UuidGenerator get() {
        return uuidGenerator();
    }

    public static com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory create() {
        return com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory.InstanceHolder.INSTANCE;
    }

    public static com.google.firebase.sessions.UuidGenerator uuidGenerator() {
        return (com.google.firebase.sessions.UuidGenerator) com.google.firebase.sessions.dagger.internal.Preconditions.checkNotNullFromProvides(com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.INSTANCE.uuidGenerator());
    }

    private static final class InstanceHolder {
        private static final com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory INSTANCE = new com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory();

        private InstanceHolder() {
        }
    }
}

package com.google.firebase.sessions;

/* loaded from: classes3.dex */
public final class SessionGenerator_Factory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.SessionGenerator> {
    private final javax.inject.Provider<com.google.firebase.sessions.TimeProvider> timeProvider;
    private final javax.inject.Provider<com.google.firebase.sessions.UuidGenerator> uuidGeneratorProvider;

    public SessionGenerator_Factory(javax.inject.Provider<com.google.firebase.sessions.TimeProvider> provider, javax.inject.Provider<com.google.firebase.sessions.UuidGenerator> provider2) {
        this.timeProvider = provider;
        this.uuidGeneratorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.SessionGenerator get() {
        return newInstance(this.timeProvider.get(), this.uuidGeneratorProvider.get());
    }

    public static com.google.firebase.sessions.SessionGenerator_Factory create(javax.inject.Provider<com.google.firebase.sessions.TimeProvider> provider, javax.inject.Provider<com.google.firebase.sessions.UuidGenerator> provider2) {
        return new com.google.firebase.sessions.SessionGenerator_Factory(provider, provider2);
    }

    public static com.google.firebase.sessions.SessionGenerator newInstance(com.google.firebase.sessions.TimeProvider timeProvider, com.google.firebase.sessions.UuidGenerator uuidGenerator) {
        return new com.google.firebase.sessions.SessionGenerator(timeProvider, uuidGenerator);
    }
}

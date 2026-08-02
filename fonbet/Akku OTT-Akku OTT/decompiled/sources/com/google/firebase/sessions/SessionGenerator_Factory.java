package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes4.dex */
public final class SessionGenerator_Factory implements Factory<SessionGenerator> {
    private final javax.inject.a<TimeProvider> timeProvider;
    private final javax.inject.a<UuidGenerator> uuidGeneratorProvider;

    public SessionGenerator_Factory(javax.inject.a<TimeProvider> aVar, javax.inject.a<UuidGenerator> aVar2) {
        this.timeProvider = aVar;
        this.uuidGeneratorProvider = aVar2;
    }

    public static SessionGenerator_Factory create(javax.inject.a<TimeProvider> aVar, javax.inject.a<UuidGenerator> aVar2) {
        return new SessionGenerator_Factory(aVar, aVar2);
    }

    public static SessionGenerator newInstance(TimeProvider timeProvider, UuidGenerator uuidGenerator) {
        return new SessionGenerator(timeProvider, uuidGenerator);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, javax.inject.a
    public SessionGenerator get() {
        return newInstance(this.timeProvider.get(), this.uuidGeneratorProvider.get());
    }
}

package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes4.dex */
public final class SessionDataSerializer_Factory implements Factory<SessionDataSerializer> {
    private final javax.inject.a<SessionGenerator> sessionGeneratorProvider;

    public SessionDataSerializer_Factory(javax.inject.a<SessionGenerator> aVar) {
        this.sessionGeneratorProvider = aVar;
    }

    public static SessionDataSerializer_Factory create(javax.inject.a<SessionGenerator> aVar) {
        return new SessionDataSerializer_Factory(aVar);
    }

    public static SessionDataSerializer newInstance(SessionGenerator sessionGenerator) {
        return new SessionDataSerializer(sessionGenerator);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, javax.inject.a
    public SessionDataSerializer get() {
        return newInstance(this.sessionGeneratorProvider.get());
    }
}

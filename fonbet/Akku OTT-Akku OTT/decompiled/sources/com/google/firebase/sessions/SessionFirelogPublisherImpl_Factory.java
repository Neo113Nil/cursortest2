package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.coroutines.CoroutineContext;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Background"})
@DaggerGenerated
/* loaded from: classes4.dex */
public final class SessionFirelogPublisherImpl_Factory implements Factory<SessionFirelogPublisherImpl> {
    private final javax.inject.a<CoroutineContext> backgroundDispatcherProvider;
    private final javax.inject.a<EventGDTLoggerInterface> eventGDTLoggerProvider;
    private final javax.inject.a<FirebaseApp> firebaseAppProvider;
    private final javax.inject.a<FirebaseInstallationsApi> firebaseInstallationsProvider;
    private final javax.inject.a<SessionsSettings> sessionSettingsProvider;

    public SessionFirelogPublisherImpl_Factory(javax.inject.a<FirebaseApp> aVar, javax.inject.a<FirebaseInstallationsApi> aVar2, javax.inject.a<SessionsSettings> aVar3, javax.inject.a<EventGDTLoggerInterface> aVar4, javax.inject.a<CoroutineContext> aVar5) {
        this.firebaseAppProvider = aVar;
        this.firebaseInstallationsProvider = aVar2;
        this.sessionSettingsProvider = aVar3;
        this.eventGDTLoggerProvider = aVar4;
        this.backgroundDispatcherProvider = aVar5;
    }

    public static SessionFirelogPublisherImpl_Factory create(javax.inject.a<FirebaseApp> aVar, javax.inject.a<FirebaseInstallationsApi> aVar2, javax.inject.a<SessionsSettings> aVar3, javax.inject.a<EventGDTLoggerInterface> aVar4, javax.inject.a<CoroutineContext> aVar5) {
        return new SessionFirelogPublisherImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static SessionFirelogPublisherImpl newInstance(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, SessionsSettings sessionsSettings, EventGDTLoggerInterface eventGDTLoggerInterface, CoroutineContext coroutineContext) {
        return new SessionFirelogPublisherImpl(firebaseApp, firebaseInstallationsApi, sessionsSettings, eventGDTLoggerInterface, coroutineContext);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, javax.inject.a
    public SessionFirelogPublisherImpl get() {
        return newInstance(this.firebaseAppProvider.get(), this.firebaseInstallationsProvider.get(), this.sessionSettingsProvider.get(), this.eventGDTLoggerProvider.get(), this.backgroundDispatcherProvider.get());
    }
}

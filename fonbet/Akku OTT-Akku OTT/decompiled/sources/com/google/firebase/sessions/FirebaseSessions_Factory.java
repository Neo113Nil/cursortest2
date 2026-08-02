package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
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
public final class FirebaseSessions_Factory implements Factory<FirebaseSessions> {
    private final javax.inject.a<CoroutineContext> backgroundDispatcherProvider;
    private final javax.inject.a<FirebaseApp> firebaseAppProvider;
    private final javax.inject.a<SessionsActivityLifecycleCallbacks> sessionsActivityLifecycleCallbacksProvider;
    private final javax.inject.a<SessionsSettings> settingsProvider;

    public FirebaseSessions_Factory(javax.inject.a<FirebaseApp> aVar, javax.inject.a<SessionsSettings> aVar2, javax.inject.a<CoroutineContext> aVar3, javax.inject.a<SessionsActivityLifecycleCallbacks> aVar4) {
        this.firebaseAppProvider = aVar;
        this.settingsProvider = aVar2;
        this.backgroundDispatcherProvider = aVar3;
        this.sessionsActivityLifecycleCallbacksProvider = aVar4;
    }

    public static FirebaseSessions_Factory create(javax.inject.a<FirebaseApp> aVar, javax.inject.a<SessionsSettings> aVar2, javax.inject.a<CoroutineContext> aVar3, javax.inject.a<SessionsActivityLifecycleCallbacks> aVar4) {
        return new FirebaseSessions_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static FirebaseSessions newInstance(FirebaseApp firebaseApp, SessionsSettings sessionsSettings, CoroutineContext coroutineContext, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        return new FirebaseSessions(firebaseApp, sessionsSettings, coroutineContext, sessionsActivityLifecycleCallbacks);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, javax.inject.a
    public FirebaseSessions get() {
        return newInstance(this.firebaseAppProvider.get(), this.settingsProvider.get(), this.backgroundDispatcherProvider.get(), this.sessionsActivityLifecycleCallbacksProvider.get());
    }
}

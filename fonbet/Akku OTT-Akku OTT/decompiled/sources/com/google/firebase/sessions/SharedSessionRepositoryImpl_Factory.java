package com.google.firebase.sessions;

import androidx.datastore.core.DataStore;
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
public final class SharedSessionRepositoryImpl_Factory implements Factory<SharedSessionRepositoryImpl> {
    private final javax.inject.a<CoroutineContext> backgroundDispatcherProvider;
    private final javax.inject.a<ProcessDataManager> processDataManagerProvider;
    private final javax.inject.a<DataStore<SessionData>> sessionDataStoreProvider;
    private final javax.inject.a<SessionFirelogPublisher> sessionFirelogPublisherProvider;
    private final javax.inject.a<SessionGenerator> sessionGeneratorProvider;
    private final javax.inject.a<SessionsSettings> sessionsSettingsProvider;
    private final javax.inject.a<TimeProvider> timeProvider;

    public SharedSessionRepositoryImpl_Factory(javax.inject.a<SessionsSettings> aVar, javax.inject.a<SessionGenerator> aVar2, javax.inject.a<SessionFirelogPublisher> aVar3, javax.inject.a<TimeProvider> aVar4, javax.inject.a<DataStore<SessionData>> aVar5, javax.inject.a<ProcessDataManager> aVar6, javax.inject.a<CoroutineContext> aVar7) {
        this.sessionsSettingsProvider = aVar;
        this.sessionGeneratorProvider = aVar2;
        this.sessionFirelogPublisherProvider = aVar3;
        this.timeProvider = aVar4;
        this.sessionDataStoreProvider = aVar5;
        this.processDataManagerProvider = aVar6;
        this.backgroundDispatcherProvider = aVar7;
    }

    public static SharedSessionRepositoryImpl_Factory create(javax.inject.a<SessionsSettings> aVar, javax.inject.a<SessionGenerator> aVar2, javax.inject.a<SessionFirelogPublisher> aVar3, javax.inject.a<TimeProvider> aVar4, javax.inject.a<DataStore<SessionData>> aVar5, javax.inject.a<ProcessDataManager> aVar6, javax.inject.a<CoroutineContext> aVar7) {
        return new SharedSessionRepositoryImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static SharedSessionRepositoryImpl newInstance(SessionsSettings sessionsSettings, SessionGenerator sessionGenerator, SessionFirelogPublisher sessionFirelogPublisher, TimeProvider timeProvider, DataStore<SessionData> dataStore, ProcessDataManager processDataManager, CoroutineContext coroutineContext) {
        return new SharedSessionRepositoryImpl(sessionsSettings, sessionGenerator, sessionFirelogPublisher, timeProvider, dataStore, processDataManager, coroutineContext);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, javax.inject.a
    public SharedSessionRepositoryImpl get() {
        return newInstance(this.sessionsSettingsProvider.get(), this.sessionGeneratorProvider.get(), this.sessionFirelogPublisherProvider.get(), this.timeProvider.get(), this.sessionDataStoreProvider.get(), this.processDataManagerProvider.get(), this.backgroundDispatcherProvider.get());
    }
}

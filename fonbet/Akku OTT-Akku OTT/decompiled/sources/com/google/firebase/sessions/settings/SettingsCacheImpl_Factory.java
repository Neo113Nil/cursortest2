package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import javax.inject.a;
import kotlin.coroutines.CoroutineContext;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Background"})
@DaggerGenerated
/* loaded from: classes4.dex */
public final class SettingsCacheImpl_Factory implements Factory<SettingsCacheImpl> {
    private final a<CoroutineContext> backgroundDispatcherProvider;
    private final a<DataStore<SessionConfigs>> sessionConfigsDataStoreProvider;
    private final a<TimeProvider> timeProvider;

    public SettingsCacheImpl_Factory(a<CoroutineContext> aVar, a<TimeProvider> aVar2, a<DataStore<SessionConfigs>> aVar3) {
        this.backgroundDispatcherProvider = aVar;
        this.timeProvider = aVar2;
        this.sessionConfigsDataStoreProvider = aVar3;
    }

    public static SettingsCacheImpl_Factory create(a<CoroutineContext> aVar, a<TimeProvider> aVar2, a<DataStore<SessionConfigs>> aVar3) {
        return new SettingsCacheImpl_Factory(aVar, aVar2, aVar3);
    }

    public static SettingsCacheImpl newInstance(CoroutineContext coroutineContext, TimeProvider timeProvider, DataStore<SessionConfigs> dataStore) {
        return new SettingsCacheImpl(coroutineContext, timeProvider, dataStore);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, javax.inject.a
    public SettingsCacheImpl get() {
        return newInstance(this.backgroundDispatcherProvider.get(), this.timeProvider.get(), this.sessionConfigsDataStoreProvider.get());
    }
}

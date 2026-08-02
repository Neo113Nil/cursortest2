package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes4.dex */
public final class ProcessDataManagerImpl_Factory implements Factory<ProcessDataManagerImpl> {
    private final javax.inject.a<Context> appContextProvider;
    private final javax.inject.a<UuidGenerator> uuidGeneratorProvider;

    public ProcessDataManagerImpl_Factory(javax.inject.a<Context> aVar, javax.inject.a<UuidGenerator> aVar2) {
        this.appContextProvider = aVar;
        this.uuidGeneratorProvider = aVar2;
    }

    public static ProcessDataManagerImpl_Factory create(javax.inject.a<Context> aVar, javax.inject.a<UuidGenerator> aVar2) {
        return new ProcessDataManagerImpl_Factory(aVar, aVar2);
    }

    public static ProcessDataManagerImpl newInstance(Context context, UuidGenerator uuidGenerator) {
        return new ProcessDataManagerImpl(context, uuidGenerator);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, javax.inject.a
    public ProcessDataManagerImpl get() {
        return newInstance(this.appContextProvider.get(), this.uuidGeneratorProvider.get());
    }
}

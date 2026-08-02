package com.google.firebase.sessions;

import com.google.android.datatransport.i;
import com.google.firebase.inject.Provider;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes4.dex */
public final class EventGDTLogger_Factory implements Factory<EventGDTLogger> {
    private final javax.inject.a<Provider<i>> transportFactoryProvider;

    public EventGDTLogger_Factory(javax.inject.a<Provider<i>> aVar) {
        this.transportFactoryProvider = aVar;
    }

    public static EventGDTLogger_Factory create(javax.inject.a<Provider<i>> aVar) {
        return new EventGDTLogger_Factory(aVar);
    }

    public static EventGDTLogger newInstance(Provider<i> provider) {
        return new EventGDTLogger(provider);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, javax.inject.a
    public EventGDTLogger get() {
        return newInstance(this.transportFactoryProvider.get());
    }
}

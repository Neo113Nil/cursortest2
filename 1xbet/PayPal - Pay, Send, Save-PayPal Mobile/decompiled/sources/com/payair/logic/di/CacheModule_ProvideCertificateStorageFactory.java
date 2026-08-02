package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class CacheModule_ProvideCertificateStorageFactory implements dagger.internal.Factory<com.payair.logic.storage.implementation.CertificateStorage> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4401a;

    public CacheModule_ProvideCertificateStorageFactory(javax.inject.Provider<android.content.Context> provider) {
        this.f4401a = provider;
    }

    public static com.payair.logic.di.CacheModule_ProvideCertificateStorageFactory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.payair.logic.di.CacheModule_ProvideCertificateStorageFactory(provider);
    }

    public static com.payair.logic.storage.implementation.CertificateStorage provideCertificateStorage(android.content.Context context) {
        return (com.payair.logic.storage.implementation.CertificateStorage) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.CacheModule.INSTANCE.provideCertificateStorage(context));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.storage.implementation.CertificateStorage get() {
        return provideCertificateStorage((android.content.Context) this.f4401a.get());
    }
}

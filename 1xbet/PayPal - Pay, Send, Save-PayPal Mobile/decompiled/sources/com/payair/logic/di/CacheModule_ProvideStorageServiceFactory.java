package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class CacheModule_ProvideStorageServiceFactory implements dagger.internal.Factory<com.payair.logic.storage.StorageService> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4404a;

    public CacheModule_ProvideStorageServiceFactory(javax.inject.Provider<android.content.Context> provider) {
        this.f4404a = provider;
    }

    public static com.payair.logic.di.CacheModule_ProvideStorageServiceFactory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.payair.logic.di.CacheModule_ProvideStorageServiceFactory(provider);
    }

    public static com.payair.logic.storage.StorageService provideStorageService(android.content.Context context) {
        return (com.payair.logic.storage.StorageService) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.CacheModule.INSTANCE.provideStorageService(context));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.storage.StorageService get() {
        return provideStorageService((android.content.Context) this.f4404a.get());
    }
}

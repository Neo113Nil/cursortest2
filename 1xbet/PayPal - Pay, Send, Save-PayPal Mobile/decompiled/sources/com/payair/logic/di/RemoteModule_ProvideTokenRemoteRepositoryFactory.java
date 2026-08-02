package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class RemoteModule_ProvideTokenRemoteRepositoryFactory implements dagger.internal.Factory<com.payair.logic.remote.repositories.TokenRemoteRepository> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4428a;
    public final javax.inject.Provider b;

    public RemoteModule_ProvideTokenRemoteRepositoryFactory(javax.inject.Provider<com.payair.logic.remote.remoteServices.TokenService> provider, javax.inject.Provider<com.payair.logic.storage.StorageService> provider2) {
        this.f4428a = provider;
        this.b = provider2;
    }

    public static com.payair.logic.di.RemoteModule_ProvideTokenRemoteRepositoryFactory create(javax.inject.Provider<com.payair.logic.remote.remoteServices.TokenService> provider, javax.inject.Provider<com.payair.logic.storage.StorageService> provider2) {
        return new com.payair.logic.di.RemoteModule_ProvideTokenRemoteRepositoryFactory(provider, provider2);
    }

    public static com.payair.logic.remote.repositories.TokenRemoteRepository provideTokenRemoteRepository(com.payair.logic.remote.remoteServices.TokenService tokenService, com.payair.logic.storage.StorageService storageService) {
        return (com.payair.logic.remote.repositories.TokenRemoteRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.RemoteModule.INSTANCE.provideTokenRemoteRepository(tokenService, storageService));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.remote.repositories.TokenRemoteRepository get() {
        return provideTokenRemoteRepository((com.payair.logic.remote.remoteServices.TokenService) this.f4428a.get(), (com.payair.logic.storage.StorageService) this.b.get());
    }
}

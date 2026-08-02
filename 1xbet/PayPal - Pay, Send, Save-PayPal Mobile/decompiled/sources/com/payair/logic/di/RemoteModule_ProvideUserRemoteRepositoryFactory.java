package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class RemoteModule_ProvideUserRemoteRepositoryFactory implements dagger.internal.Factory<com.payair.logic.remote.repositories.UserRemoteRepository> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4432a;

    public RemoteModule_ProvideUserRemoteRepositoryFactory(javax.inject.Provider<com.payair.logic.remote.remoteServices.AssetsService> provider) {
        this.f4432a = provider;
    }

    public static com.payair.logic.di.RemoteModule_ProvideUserRemoteRepositoryFactory create(javax.inject.Provider<com.payair.logic.remote.remoteServices.AssetsService> provider) {
        return new com.payair.logic.di.RemoteModule_ProvideUserRemoteRepositoryFactory(provider);
    }

    public static com.payair.logic.remote.repositories.UserRemoteRepository provideUserRemoteRepository(com.payair.logic.remote.remoteServices.AssetsService assetsService) {
        return (com.payair.logic.remote.repositories.UserRemoteRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.RemoteModule.INSTANCE.provideUserRemoteRepository(assetsService));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.remote.repositories.UserRemoteRepository get() {
        return provideUserRemoteRepository((com.payair.logic.remote.remoteServices.AssetsService) this.f4432a.get());
    }
}

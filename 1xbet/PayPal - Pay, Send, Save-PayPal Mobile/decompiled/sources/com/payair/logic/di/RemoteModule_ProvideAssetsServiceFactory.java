package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class RemoteModule_ProvideAssetsServiceFactory implements dagger.internal.Factory<com.payair.logic.remote.remoteServices.AssetsService> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4424a;

    public RemoteModule_ProvideAssetsServiceFactory(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider) {
        this.f4424a = provider;
    }

    public static com.payair.logic.di.RemoteModule_ProvideAssetsServiceFactory create(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider) {
        return new com.payair.logic.di.RemoteModule_ProvideAssetsServiceFactory(provider);
    }

    public static com.payair.logic.remote.remoteServices.AssetsService provideAssetsService(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        return (com.payair.logic.remote.remoteServices.AssetsService) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.RemoteModule.INSTANCE.provideAssetsService(hceSDKInterface));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.remote.remoteServices.AssetsService get() {
        return provideAssetsService((com.payair.logic.implementation.HceSDKInterface) this.f4424a.get());
    }
}

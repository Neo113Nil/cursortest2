package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class RemoteModule_ProvideTokenServiceFactory implements dagger.internal.Factory<com.payair.logic.remote.remoteServices.TokenService> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4429a;

    public RemoteModule_ProvideTokenServiceFactory(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider) {
        this.f4429a = provider;
    }

    public static com.payair.logic.di.RemoteModule_ProvideTokenServiceFactory create(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider) {
        return new com.payair.logic.di.RemoteModule_ProvideTokenServiceFactory(provider);
    }

    public static com.payair.logic.remote.remoteServices.TokenService provideTokenService(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        return (com.payair.logic.remote.remoteServices.TokenService) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.RemoteModule.INSTANCE.provideTokenService(hceSDKInterface));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.remote.remoteServices.TokenService get() {
        return provideTokenService((com.payair.logic.implementation.HceSDKInterface) this.f4429a.get());
    }
}

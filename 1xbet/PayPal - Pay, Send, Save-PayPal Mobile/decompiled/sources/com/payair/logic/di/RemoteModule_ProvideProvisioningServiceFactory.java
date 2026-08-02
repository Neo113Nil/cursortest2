package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class RemoteModule_ProvideProvisioningServiceFactory implements dagger.internal.Factory<com.payair.logic.remote.remoteServices.ProvisioningService> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4426a;

    public RemoteModule_ProvideProvisioningServiceFactory(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider) {
        this.f4426a = provider;
    }

    public static com.payair.logic.di.RemoteModule_ProvideProvisioningServiceFactory create(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider) {
        return new com.payair.logic.di.RemoteModule_ProvideProvisioningServiceFactory(provider);
    }

    public static com.payair.logic.remote.remoteServices.ProvisioningService provideProvisioningService(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        return (com.payair.logic.remote.remoteServices.ProvisioningService) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.RemoteModule.INSTANCE.provideProvisioningService(hceSDKInterface));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.remote.remoteServices.ProvisioningService get() {
        return provideProvisioningService((com.payair.logic.implementation.HceSDKInterface) this.f4426a.get());
    }
}

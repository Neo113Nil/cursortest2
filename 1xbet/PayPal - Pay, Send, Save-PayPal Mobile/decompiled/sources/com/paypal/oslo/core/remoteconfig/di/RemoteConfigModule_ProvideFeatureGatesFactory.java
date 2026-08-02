package com.paypal.oslo.core.remoteconfig.di;

/* loaded from: classes5.dex */
public final class RemoteConfigModule_ProvideFeatureGatesFactory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;

    private RemoteConfigModule_ProvideFeatureGatesFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.contract.FeatureGate get() {
        return provideFeatureGates(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule_ProvideFeatureGatesFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        return new com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule_ProvideFeatureGatesFactory(provider, provider2);
    }

    public static com.paypal.oslo.core.remoteconfig.contract.FeatureGate provideFeatureGates(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState remoteConfigState, com.paypal.oslo.core.userstore.UserStore userStore) {
        return (com.paypal.oslo.core.remoteconfig.contract.FeatureGate) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule.INSTANCE.provideFeatureGates(remoteConfigState, userStore));
    }
}

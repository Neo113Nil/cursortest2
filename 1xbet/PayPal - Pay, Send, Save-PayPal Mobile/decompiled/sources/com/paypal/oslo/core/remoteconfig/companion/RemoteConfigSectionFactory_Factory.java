package com.paypal.oslo.core.remoteconfig.companion;

/* loaded from: classes10.dex */
public final class RemoteConfigSectionFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry> getHighSpeedVideoSizes;

    private RemoteConfigSectionFactory_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver> provider4) {
        return new com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory newInstance(com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry featureGateRegistry, com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry dynamicConfigRegistry, com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry experimentRegistry, com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver remoteConfigSectionResolver) {
        return new com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory(featureGateRegistry, dynamicConfigRegistry, experimentRegistry, remoteConfigSectionResolver);
    }
}

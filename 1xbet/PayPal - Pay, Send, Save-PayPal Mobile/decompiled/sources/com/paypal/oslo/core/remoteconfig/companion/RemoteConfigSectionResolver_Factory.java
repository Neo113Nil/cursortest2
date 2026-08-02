package com.paypal.oslo.core.remoteconfig.companion;

/* loaded from: classes10.dex */
public final class RemoteConfigSectionResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager> getHighSpeedVideoSizes;

    private RemoteConfigSectionResolver_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry> provider4) {
        return new com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver newInstance(com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager statsigOverrideManager, com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry featureGateRegistry, com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry dynamicConfigRegistry, com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry experimentRegistry) {
        return new com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver(statsigOverrideManager, featureGateRegistry, dynamicConfigRegistry, experimentRegistry);
    }
}

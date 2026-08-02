package com.paypal.oslo.core.remoteconfig.cdn;

/* loaded from: classes10.dex */
public final class ConfigSpecAutoRegistrar_Factory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.StatsigWrapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry> getHighSpeedVideoSizes;

    private ConfigSpecAutoRegistrar_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher> provider4, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.StatsigWrapper> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher> provider4, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.StatsigWrapper> provider5) {
        return new com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar newInstance(com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry featureGateRegistry, com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry dynamicConfigRegistry, com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry experimentRegistry, com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher statsigCdnFetcher, com.paypal.oslo.core.remoteconfig.StatsigWrapper statsigWrapper) {
        return new com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar(featureGateRegistry, dynamicConfigRegistry, experimentRegistry, statsigCdnFetcher, statsigWrapper);
    }
}

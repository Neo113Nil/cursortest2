package com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate;

/* loaded from: classes13.dex */
public final class FeatureGateManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoSizes;

    private FeatureGateManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        return new com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl(featureGate, checkoutLogger, analyticsTracer);
    }
}

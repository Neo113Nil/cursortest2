package com.paypal.oslo.feature.bnplacquisition.config;

/* loaded from: classes11.dex */
public final class CpiAvailabilityProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig> getHighSpeedVideoSizes;

    private CpiAvailabilityProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager> provider3) {
        return new com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider newInstance(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig supportedCpisConfig, com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider(configContext, supportedCpisConfig, featureGateManager);
    }
}

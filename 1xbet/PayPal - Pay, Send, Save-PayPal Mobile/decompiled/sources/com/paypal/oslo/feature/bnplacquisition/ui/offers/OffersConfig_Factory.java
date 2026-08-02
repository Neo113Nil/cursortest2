package com.paypal.oslo.feature.bnplacquisition.ui.offers;

/* loaded from: classes11.dex */
public final class OffersConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider> getHighSpeedVideoFpsRangesFor;

    private OffersConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig newInstance(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider cpiAvailabilityProvider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig(configContext, cpiAvailabilityProvider);
    }
}

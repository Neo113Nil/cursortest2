package com.paypal.oslo.feature.searchandintelligence.config;

/* loaded from: classes14.dex */
public final class SearchAndIntelligenceConfigManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.config.SearchAndIntelligenceConfigManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private SearchAndIntelligenceConfigManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.config.SearchAndIntelligenceConfigManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.config.SearchAndIntelligenceConfigManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2) {
        return new com.paypal.oslo.feature.searchandintelligence.config.SearchAndIntelligenceConfigManagerImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.searchandintelligence.config.SearchAndIntelligenceConfigManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.searchandintelligence.config.SearchAndIntelligenceConfigManagerImpl(featureGate, dynamicConfiguration);
    }
}

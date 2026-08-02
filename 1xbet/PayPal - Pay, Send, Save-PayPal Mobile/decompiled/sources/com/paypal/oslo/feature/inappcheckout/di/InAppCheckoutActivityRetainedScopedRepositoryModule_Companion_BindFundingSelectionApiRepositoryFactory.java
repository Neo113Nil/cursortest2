package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_BindFundingSelectionApiRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl> getHighSpeedVideoFpsRanges;

    private InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_BindFundingSelectionApiRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository get() {
        return bindFundingSelectionApiRepository(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_BindFundingSelectionApiRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_BindFundingSelectionApiRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository bindFundingSelectionApiRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl mockFundingSelectionApiRepositoryImpl, com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl fundingSelectionApiRepositoryImpl) {
        return (com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule.INSTANCE.bindFundingSelectionApiRepository(featureGateManager, mockFundingSelectionApiRepositoryImpl, fundingSelectionApiRepositoryImpl));
    }
}

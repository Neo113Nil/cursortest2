package com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi;

/* loaded from: classes12.dex */
public final class FundingOptionsComponentSideEffectsMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase> getHighSpeedVideoFpsRanges;

    private FundingOptionsComponentSideEffectsMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> provider3) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware newInstance(com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase fetchDebitCardFundingOptionsUseCase, com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware(fetchDebitCardFundingOptionsUseCase, debitCardFundingOptionsCache, featureGateManager);
    }
}

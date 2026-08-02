package com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi;

/* loaded from: classes12.dex */
public final class FundingSourceSelectorSideEffectsMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase> getHighSpeedVideoSizes;

    private FundingSourceSelectorSideEffectsMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> provider4) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware newInstance(com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase fetchDebitCardFundingOptionsUseCase, com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase setDebitCardFundingOptionsUseCase, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware(debitCardFundingOptionsCache, fetchDebitCardFundingOptionsUseCase, setDebitCardFundingOptionsUseCase, featureGateManager);
    }
}

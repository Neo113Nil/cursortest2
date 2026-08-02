package com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel;

/* loaded from: classes12.dex */
public final class FundingOptionsComponentViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware> getHighSpeedVideoSizes;

    private FundingOptionsComponentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> provider3) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel newInstance(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentReducer fundingOptionsComponentReducer, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware fundingOptionsComponentSideEffectsMiddleware, com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel(fundingOptionsComponentReducer, fundingOptionsComponentSideEffectsMiddleware, debitCardFundingOptionsCache);
    }
}

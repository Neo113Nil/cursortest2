package com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel;

/* loaded from: classes12.dex */
public final class FundingSourceSelectorViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel.FundingSourceSelectorViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware> getHighSpeedVideoSizes;

    private FundingSourceSelectorViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel.FundingSourceSelectorViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel.FundingSourceSelectorViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware> provider2) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel.FundingSourceSelectorViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel.FundingSourceSelectorViewModel newInstance(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorReducer fundingSourceSelectorReducer, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware fundingSourceSelectorSideEffectsMiddleware) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel.FundingSourceSelectorViewModel(fundingSourceSelectorReducer, fundingSourceSelectorSideEffectsMiddleware);
    }
}

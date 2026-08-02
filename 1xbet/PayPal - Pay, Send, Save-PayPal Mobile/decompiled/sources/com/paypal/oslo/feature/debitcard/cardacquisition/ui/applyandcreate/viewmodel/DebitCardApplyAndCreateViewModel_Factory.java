package com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel;

/* loaded from: classes12.dex */
public final class DebitCardApplyAndCreateViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateReducer> getHighSpeedVideoFpsRangesFor;

    private DebitCardApplyAndCreateViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> provider3) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel newInstance(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateReducer debitCardApplyAndCreateReducer, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware debitCardApplyAndCreateSideEffectsMiddleware, com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel(debitCardApplyAndCreateReducer, debitCardApplyAndCreateSideEffectsMiddleware, debitCardFundingOptionsCache);
    }
}

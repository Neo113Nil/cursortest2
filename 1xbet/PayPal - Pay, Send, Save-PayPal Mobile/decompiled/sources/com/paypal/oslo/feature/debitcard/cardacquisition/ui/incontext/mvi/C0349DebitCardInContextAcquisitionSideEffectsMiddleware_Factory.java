package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi;

/* renamed from: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> getHighSpeedVideoFpsRanges;

    private C0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware get(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), debitCardProductName);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.C0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> provider2) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.C0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware newInstance(com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase checkDebitCardEligibilityUseCase, com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware(checkDebitCardEligibilityUseCase, debitCardFundingOptionsCache, debitCardProductName);
    }
}

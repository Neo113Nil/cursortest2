package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi;

/* renamed from: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase> getHighSpeedVideoFpsRanges;

    private C0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware get(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), debitCardProductName);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.C0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase> provider) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.C0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware newInstance(com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase checkDebitCardEligibilityUseCase, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware(checkDebitCardEligibilityUseCase, debitCardProductName);
    }
}

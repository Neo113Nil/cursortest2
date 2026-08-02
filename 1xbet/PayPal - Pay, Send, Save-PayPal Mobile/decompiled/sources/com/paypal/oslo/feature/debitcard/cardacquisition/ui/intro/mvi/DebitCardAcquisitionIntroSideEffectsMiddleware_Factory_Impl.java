package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi;

/* loaded from: classes12.dex */
public final class DebitCardAcquisitionIntroSideEffectsMiddleware_Factory_Impl implements com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware.Factory {
    private final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.C0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory getHighSpeedVideoSizes;

    private DebitCardAcquisitionIntroSideEffectsMiddleware_Factory_Impl(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.C0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory c0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory) {
        this.getHighSpeedVideoSizes = c0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware.Factory
    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return this.getHighSpeedVideoSizes.get(debitCardProductName);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware.Factory> create(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.C0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory c0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware_Factory_Impl(c0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.C0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory c0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware_Factory_Impl(c0351DebitCardAcquisitionIntroSideEffectsMiddleware_Factory));
    }
}

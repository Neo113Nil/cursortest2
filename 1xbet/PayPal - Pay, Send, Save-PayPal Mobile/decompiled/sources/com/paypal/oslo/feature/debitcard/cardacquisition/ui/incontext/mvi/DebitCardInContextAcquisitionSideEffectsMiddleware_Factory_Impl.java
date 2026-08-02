package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi;

/* loaded from: classes12.dex */
public final class DebitCardInContextAcquisitionSideEffectsMiddleware_Factory_Impl implements com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware.Factory {
    private final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.C0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory getHighResolutionOutputSizeshNQ4ISI;

    private DebitCardInContextAcquisitionSideEffectsMiddleware_Factory_Impl(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.C0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory c0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware.Factory
    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(debitCardProductName);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware.Factory> create(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.C0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory c0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware_Factory_Impl(c0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.C0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory c0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware_Factory_Impl(c0349DebitCardInContextAcquisitionSideEffectsMiddleware_Factory));
    }
}

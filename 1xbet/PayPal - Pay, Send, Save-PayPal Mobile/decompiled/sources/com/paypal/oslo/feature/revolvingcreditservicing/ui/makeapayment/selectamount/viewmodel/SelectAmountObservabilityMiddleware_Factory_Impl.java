package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel;

/* loaded from: classes14.dex */
public final class SelectAmountObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.C0406SelectAmountObservabilityMiddleware_Factory getHighResolutionOutputSizeshNQ4ISI;

    private SelectAmountObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.C0406SelectAmountObservabilityMiddleware_Factory c0406SelectAmountObservabilityMiddleware_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0406SelectAmountObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.C0406SelectAmountObservabilityMiddleware_Factory c0406SelectAmountObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountObservabilityMiddleware_Factory_Impl(c0406SelectAmountObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.C0406SelectAmountObservabilityMiddleware_Factory c0406SelectAmountObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountObservabilityMiddleware_Factory_Impl(c0406SelectAmountObservabilityMiddleware_Factory));
    }
}

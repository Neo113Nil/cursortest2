package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel;

/* loaded from: classes14.dex */
public final class PaymentConfirmationObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.C0402PaymentConfirmationObservabilityMiddleware_Factory getHighSpeedVideoFpsRanges;

    private PaymentConfirmationObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.C0402PaymentConfirmationObservabilityMiddleware_Factory c0402PaymentConfirmationObservabilityMiddleware_Factory) {
        this.getHighSpeedVideoFpsRanges = c0402PaymentConfirmationObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighSpeedVideoFpsRanges.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.C0402PaymentConfirmationObservabilityMiddleware_Factory c0402PaymentConfirmationObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationObservabilityMiddleware_Factory_Impl(c0402PaymentConfirmationObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.C0402PaymentConfirmationObservabilityMiddleware_Factory c0402PaymentConfirmationObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationObservabilityMiddleware_Factory_Impl(c0402PaymentConfirmationObservabilityMiddleware_Factory));
    }
}

package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationObservabilityMiddleware_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0402PaymentConfirmationObservabilityMiddleware_Factory {
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationObservabilityMiddleware get(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return newInstance(creditProductIdentifier);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.C0402PaymentConfirmationObservabilityMiddleware_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.C0402PaymentConfirmationObservabilityMiddleware_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationObservabilityMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationObservabilityMiddleware(creditProductIdentifier);
    }

    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationObservabilityMiddleware_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.C0402PaymentConfirmationObservabilityMiddleware_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.C0402PaymentConfirmationObservabilityMiddleware_Factory();

        private InstanceHolder() {
        }
    }
}

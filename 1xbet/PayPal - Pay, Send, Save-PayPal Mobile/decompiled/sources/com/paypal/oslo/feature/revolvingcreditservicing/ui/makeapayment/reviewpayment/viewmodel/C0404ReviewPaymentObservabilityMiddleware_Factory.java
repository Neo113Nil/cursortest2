package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0404ReviewPaymentObservabilityMiddleware_Factory {
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware get(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return newInstance(creditProductIdentifier);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0404ReviewPaymentObservabilityMiddleware_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0404ReviewPaymentObservabilityMiddleware_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware(creditProductIdentifier);
    }

    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0404ReviewPaymentObservabilityMiddleware_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0404ReviewPaymentObservabilityMiddleware_Factory();

        private InstanceHolder() {
        }
    }
}

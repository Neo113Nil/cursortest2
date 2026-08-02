package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

/* loaded from: classes14.dex */
public final class ReviewPaymentObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0404ReviewPaymentObservabilityMiddleware_Factory getHighSpeedVideoSizes;

    private ReviewPaymentObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0404ReviewPaymentObservabilityMiddleware_Factory c0404ReviewPaymentObservabilityMiddleware_Factory) {
        this.getHighSpeedVideoSizes = c0404ReviewPaymentObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighSpeedVideoSizes.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0404ReviewPaymentObservabilityMiddleware_Factory c0404ReviewPaymentObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware_Factory_Impl(c0404ReviewPaymentObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0404ReviewPaymentObservabilityMiddleware_Factory c0404ReviewPaymentObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware_Factory_Impl(c0404ReviewPaymentObservabilityMiddleware_Factory));
    }
}

package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel;

/* loaded from: classes14.dex */
public final class PaymentSummaryObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.C0413PaymentSummaryObservabilityMiddleware_Factory getHighSpeedVideoSizes;

    private PaymentSummaryObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.C0413PaymentSummaryObservabilityMiddleware_Factory c0413PaymentSummaryObservabilityMiddleware_Factory) {
        this.getHighSpeedVideoSizes = c0413PaymentSummaryObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighSpeedVideoSizes.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.C0413PaymentSummaryObservabilityMiddleware_Factory c0413PaymentSummaryObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware_Factory_Impl(c0413PaymentSummaryObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.C0413PaymentSummaryObservabilityMiddleware_Factory c0413PaymentSummaryObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware_Factory_Impl(c0413PaymentSummaryObservabilityMiddleware_Factory));
    }
}

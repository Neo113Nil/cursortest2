package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel;

/* loaded from: classes14.dex */
public final class PaymentSummaryViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.C0414PaymentSummaryViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private PaymentSummaryViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.C0414PaymentSummaryViewModel_Factory c0414PaymentSummaryViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0414PaymentSummaryViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentSummaryNavigationArgs paymentSummaryNavigationArgs) {
        return this.getHighSpeedVideoFpsRangesFor.get(paymentSummaryNavigationArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.C0414PaymentSummaryViewModel_Factory c0414PaymentSummaryViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel_Factory_Impl(c0414PaymentSummaryViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.C0414PaymentSummaryViewModel_Factory c0414PaymentSummaryViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel_Factory_Impl(c0414PaymentSummaryViewModel_Factory));
    }
}

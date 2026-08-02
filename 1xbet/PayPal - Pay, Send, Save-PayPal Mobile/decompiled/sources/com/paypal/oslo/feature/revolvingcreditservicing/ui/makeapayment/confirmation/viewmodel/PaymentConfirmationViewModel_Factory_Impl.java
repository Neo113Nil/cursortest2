package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel;

/* loaded from: classes14.dex */
public final class PaymentConfirmationViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.C0403PaymentConfirmationViewModel_Factory getHighSpeedVideoFpsRanges;

    private PaymentConfirmationViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.C0403PaymentConfirmationViewModel_Factory c0403PaymentConfirmationViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0403PaymentConfirmationViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs paymentConfirmationArgs) {
        return this.getHighSpeedVideoFpsRanges.get(paymentConfirmationArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.C0403PaymentConfirmationViewModel_Factory c0403PaymentConfirmationViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel_Factory_Impl(c0403PaymentConfirmationViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.C0403PaymentConfirmationViewModel_Factory c0403PaymentConfirmationViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel_Factory_Impl(c0403PaymentConfirmationViewModel_Factory));
    }
}

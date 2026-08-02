package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

/* loaded from: classes14.dex */
public final class ReviewPaymentViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0405ReviewPaymentViewModel_Factory getHighSpeedVideoSizes;

    private ReviewPaymentViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0405ReviewPaymentViewModel_Factory c0405ReviewPaymentViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0405ReviewPaymentViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs) {
        return this.getHighSpeedVideoSizes.get(reviewPaymentArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0405ReviewPaymentViewModel_Factory c0405ReviewPaymentViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel_Factory_Impl(c0405ReviewPaymentViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0405ReviewPaymentViewModel_Factory c0405ReviewPaymentViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel_Factory_Impl(c0405ReviewPaymentViewModel_Factory));
    }
}

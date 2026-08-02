package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0405ReviewPaymentViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentFormatterMiddleware> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.PaymentValidationMiddleware> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware.Factory> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware> getHighSpeedVideoSizesFor;

    private C0405ReviewPaymentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentFormatterMiddleware> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.PaymentValidationMiddleware> provider5, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware.Factory> provider6) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizesFor = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getHighSpeedVideoSizes = provider6;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs) {
        return newInstance(reviewPaymentArgs, this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0405ReviewPaymentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentFormatterMiddleware> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.PaymentValidationMiddleware> provider5, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware.Factory> provider6) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.C0405ReviewPaymentViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentReducer reviewPaymentReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware makePaymentMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentFormatterMiddleware reviewPaymentFormatterMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware reviewPaymentUpdaterMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.PaymentValidationMiddleware paymentValidationMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentObservabilityMiddleware.Factory factory) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel(reviewPaymentArgs, reviewPaymentReducer, makePaymentMiddleware, reviewPaymentFormatterMiddleware, reviewPaymentUpdaterMiddleware, paymentValidationMiddleware, factory);
    }
}

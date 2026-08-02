package com.paypal.oslo.feature.qrc.ui.review;

/* loaded from: classes14.dex */
public final class PaymentReviewViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.GetQrcSessionUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.CancelQrCodePaymentUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.review.PaymentReviewReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.ConfirmQrCodePaymentUseCase> getHighSpeedVideoSizes;

    private PaymentReviewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.review.PaymentReviewReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.GetQrcSessionUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.ConfirmQrCodePaymentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.CancelQrCodePaymentUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.review.PaymentReviewReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.GetQrcSessionUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.ConfirmQrCodePaymentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.CancelQrCodePaymentUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase> provider5) {
        return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel newInstance(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewReducer paymentReviewReducer, com.paypal.oslo.feature.qrc.domain.usecase.GetQrcSessionUseCase getQrcSessionUseCase, com.paypal.oslo.feature.qrc.domain.usecase.ConfirmQrCodePaymentUseCase confirmQrCodePaymentUseCase, com.paypal.oslo.feature.qrc.domain.usecase.CancelQrCodePaymentUseCase cancelQrCodePaymentUseCase, com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase pollQrcSessionUseCase) {
        return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel(paymentReviewReducer, getQrcSessionUseCase, confirmQrCodePaymentUseCase, cancelQrCodePaymentUseCase, pollQrcSessionUseCase);
    }
}

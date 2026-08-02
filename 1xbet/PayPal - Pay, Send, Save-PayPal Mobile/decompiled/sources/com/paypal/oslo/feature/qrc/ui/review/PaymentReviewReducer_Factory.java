package com.paypal.oslo.feature.qrc.ui.review;

/* loaded from: classes14.dex */
public final class PaymentReviewReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.review.PaymentReviewReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper> getHighSpeedVideoFpsRanges;

    private PaymentReviewReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewReducer get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.qrc.ui.review.PaymentReviewReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper> provider) {
        return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewReducer_Factory(provider);
    }

    public static com.paypal.oslo.feature.qrc.ui.review.PaymentReviewReducer newInstance(com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper paymentReviewUiModelMapper) {
        return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewReducer(paymentReviewUiModelMapper);
    }
}

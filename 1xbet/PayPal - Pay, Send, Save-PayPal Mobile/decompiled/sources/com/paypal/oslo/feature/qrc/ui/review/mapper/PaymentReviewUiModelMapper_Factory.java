package com.paypal.oslo.feature.qrc.ui.review.mapper;

/* loaded from: classes14.dex */
public final class PaymentReviewUiModelMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper_Factory create() {
        return com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper newInstance() {
        return new com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper_Factory();

        private InstanceHolder() {
        }
    }
}

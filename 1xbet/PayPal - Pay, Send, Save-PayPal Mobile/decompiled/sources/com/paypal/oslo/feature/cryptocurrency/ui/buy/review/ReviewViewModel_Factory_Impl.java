package com.paypal.oslo.feature.cryptocurrency.ui.buy.review;

/* loaded from: classes12.dex */
public final class ReviewViewModel_Factory_Impl implements com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.Factory {
    private final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.C0338ReviewViewModel_Factory Camera2StreamConfigurationMap;

    private ReviewViewModel_Factory_Impl(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.C0338ReviewViewModel_Factory c0338ReviewViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0338ReviewViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.Factory
    public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel create(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewArgs reviewArgs) {
        return this.Camera2StreamConfigurationMap.get(reviewArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.Factory> create(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.C0338ReviewViewModel_Factory c0338ReviewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel_Factory_Impl(c0338ReviewViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.C0338ReviewViewModel_Factory c0338ReviewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel_Factory_Impl(c0338ReviewViewModel_Factory));
    }
}

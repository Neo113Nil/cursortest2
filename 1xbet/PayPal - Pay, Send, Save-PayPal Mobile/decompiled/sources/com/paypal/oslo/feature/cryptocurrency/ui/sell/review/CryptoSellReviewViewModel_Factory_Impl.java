package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

/* loaded from: classes12.dex */
public final class CryptoSellReviewViewModel_Factory_Impl implements com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel.Factory {
    private final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.C0347CryptoSellReviewViewModel_Factory getHighSpeedVideoFpsRanges;

    private CryptoSellReviewViewModel_Factory_Impl(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.C0347CryptoSellReviewViewModel_Factory c0347CryptoSellReviewViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0347CryptoSellReviewViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel.Factory
    public final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel create(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs cryptoSellReviewArgs) {
        return this.getHighSpeedVideoFpsRanges.get(cryptoSellReviewArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel.Factory> create(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.C0347CryptoSellReviewViewModel_Factory c0347CryptoSellReviewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel_Factory_Impl(c0347CryptoSellReviewViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.C0347CryptoSellReviewViewModel_Factory c0347CryptoSellReviewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel_Factory_Impl(c0347CryptoSellReviewViewModel_Factory));
    }
}

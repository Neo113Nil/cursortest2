package com.paypal.oslo.feature.paymentreadylite.data.datasource;

/* loaded from: classes13.dex */
public final class PaymentRecommendationLocalDataSourceImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyRecommendationDao> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyApiStatusDao> getHighSpeedVideoFpsRangesFor;

    private PaymentRecommendationLocalDataSourceImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyRecommendationDao> provider, dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyApiStatusDao> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyRecommendationDao> provider, dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyApiStatusDao> provider2) {
        return new com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl newInstance(com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyRecommendationDao paymentReadyRecommendationDao, com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyApiStatusDao paymentReadyApiStatusDao) {
        return new com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl(paymentReadyRecommendationDao, paymentReadyApiStatusDao);
    }
}

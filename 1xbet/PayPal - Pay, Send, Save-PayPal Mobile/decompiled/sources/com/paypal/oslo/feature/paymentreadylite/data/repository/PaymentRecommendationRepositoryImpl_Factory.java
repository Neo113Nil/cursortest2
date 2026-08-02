package com.paypal.oslo.feature.paymentreadylite.data.repository;

/* loaded from: classes13.dex */
public final class PaymentRecommendationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationRemoteDataSource> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSource> getHighSpeedVideoFpsRangesFor;

    private PaymentRecommendationRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationRemoteDataSource> provider, dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSource> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationRemoteDataSource> provider, dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSource> provider2) {
        return new com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl newInstance(com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationRemoteDataSource paymentRecommendationRemoteDataSource, com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSource paymentRecommendationLocalDataSource) {
        return new com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl(paymentRecommendationRemoteDataSource, paymentRecommendationLocalDataSource);
    }
}

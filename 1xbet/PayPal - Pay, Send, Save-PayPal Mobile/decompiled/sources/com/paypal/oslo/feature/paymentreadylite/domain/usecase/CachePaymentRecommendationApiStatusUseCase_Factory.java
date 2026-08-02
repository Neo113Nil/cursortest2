package com.paypal.oslo.feature.paymentreadylite.domain.usecase;

/* loaded from: classes13.dex */
public final class CachePaymentRecommendationApiStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paymentreadylite.domain.usecase.CachePaymentRecommendationApiStatusUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository> getHighSpeedVideoFpsRangesFor;

    private CachePaymentRecommendationApiStatusUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paymentreadylite.domain.usecase.CachePaymentRecommendationApiStatusUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.paymentreadylite.domain.usecase.CachePaymentRecommendationApiStatusUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository> provider) {
        return new com.paypal.oslo.feature.paymentreadylite.domain.usecase.CachePaymentRecommendationApiStatusUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.paymentreadylite.domain.usecase.CachePaymentRecommendationApiStatusUseCase newInstance(com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository paymentRecommendationRepository) {
        return new com.paypal.oslo.feature.paymentreadylite.domain.usecase.CachePaymentRecommendationApiStatusUseCase(paymentRecommendationRepository);
    }
}

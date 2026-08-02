package com.paypal.oslo.feature.paymentreadylite.domain.usecase;

/* loaded from: classes13.dex */
public final class CachePaymentRecommendationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paymentreadylite.domain.usecase.CachePaymentRecommendationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository> getHighSpeedVideoSizes;

    private CachePaymentRecommendationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paymentreadylite.domain.usecase.CachePaymentRecommendationUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.paymentreadylite.domain.usecase.CachePaymentRecommendationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository> provider) {
        return new com.paypal.oslo.feature.paymentreadylite.domain.usecase.CachePaymentRecommendationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.paymentreadylite.domain.usecase.CachePaymentRecommendationUseCase newInstance(com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository paymentRecommendationRepository) {
        return new com.paypal.oslo.feature.paymentreadylite.domain.usecase.CachePaymentRecommendationUseCase(paymentRecommendationRepository);
    }
}

package com.paypal.oslo.feature.paymentreadylite.domain.usecase;

/* loaded from: classes13.dex */
public final class GetLatestPaymentRecommendationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paymentreadylite.domain.usecase.GetLatestPaymentRecommendationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository> getHighSpeedVideoFpsRanges;

    private GetLatestPaymentRecommendationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paymentreadylite.domain.usecase.GetLatestPaymentRecommendationUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.paymentreadylite.domain.usecase.GetLatestPaymentRecommendationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository> provider) {
        return new com.paypal.oslo.feature.paymentreadylite.domain.usecase.GetLatestPaymentRecommendationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.paymentreadylite.domain.usecase.GetLatestPaymentRecommendationUseCase newInstance(com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository paymentRecommendationRepository) {
        return new com.paypal.oslo.feature.paymentreadylite.domain.usecase.GetLatestPaymentRecommendationUseCase(paymentRecommendationRepository);
    }
}

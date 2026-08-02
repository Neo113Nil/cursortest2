package com.paypal.oslo.feature.paymentreadylite.domain.usecase;

/* loaded from: classes13.dex */
public final class DeleteAllPaymentRecommendationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paymentreadylite.domain.usecase.DeleteAllPaymentRecommendationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository> Camera2StreamConfigurationMap;

    private DeleteAllPaymentRecommendationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paymentreadylite.domain.usecase.DeleteAllPaymentRecommendationUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.paymentreadylite.domain.usecase.DeleteAllPaymentRecommendationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository> provider) {
        return new com.paypal.oslo.feature.paymentreadylite.domain.usecase.DeleteAllPaymentRecommendationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.paymentreadylite.domain.usecase.DeleteAllPaymentRecommendationUseCase newInstance(com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository paymentRecommendationRepository) {
        return new com.paypal.oslo.feature.paymentreadylite.domain.usecase.DeleteAllPaymentRecommendationUseCase(paymentRecommendationRepository);
    }
}

package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class EvaluateProductOffersUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.EvaluateProductOffersUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.ProductOffersRepository> getHighSpeedVideoSizes;

    private EvaluateProductOffersUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.ProductOffersRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.EvaluateProductOffersUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.EvaluateProductOffersUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.ProductOffersRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.EvaluateProductOffersUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.EvaluateProductOffersUseCase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.ProductOffersRepository productOffersRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.EvaluateProductOffersUseCase(productOffersRepository);
    }
}

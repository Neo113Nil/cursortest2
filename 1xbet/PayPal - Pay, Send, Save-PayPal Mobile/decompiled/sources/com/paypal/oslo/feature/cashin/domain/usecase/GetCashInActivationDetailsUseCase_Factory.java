package com.paypal.oslo.feature.cashin.domain.usecase;

/* loaded from: classes11.dex */
public final class GetCashInActivationDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.domain.usecase.GetCashInActivationDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.ActivationRepository> getHighSpeedVideoFpsRanges;

    private GetCashInActivationDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.ActivationRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.domain.usecase.GetCashInActivationDetailsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetCashInActivationDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.ActivationRepository> provider) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetCashInActivationDetailsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetCashInActivationDetailsUseCase newInstance(com.paypal.oslo.feature.cashin.domain.repository.ActivationRepository activationRepository) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetCashInActivationDetailsUseCase(activationRepository);
    }
}

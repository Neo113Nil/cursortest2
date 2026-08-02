package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class UpdateApplicationAndFetchOffersUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> Camera2StreamConfigurationMap;

    private UpdateApplicationAndFetchOffersUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository updateApplicationRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase(updateApplicationRepository);
    }
}

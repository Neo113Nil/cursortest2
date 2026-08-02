package com.paypal.oslo.feature.cashin.domain.usecase;

/* loaded from: classes11.dex */
public final class GetCashInRetailersUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.domain.usecase.GetCashInRetailersUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.RetailerRepository> Camera2StreamConfigurationMap;

    private GetCashInRetailersUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.RetailerRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.domain.usecase.GetCashInRetailersUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetCashInRetailersUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.RetailerRepository> provider) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetCashInRetailersUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetCashInRetailersUseCase newInstance(com.paypal.oslo.feature.cashin.domain.repository.RetailerRepository retailerRepository) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetCashInRetailersUseCase(retailerRepository);
    }
}

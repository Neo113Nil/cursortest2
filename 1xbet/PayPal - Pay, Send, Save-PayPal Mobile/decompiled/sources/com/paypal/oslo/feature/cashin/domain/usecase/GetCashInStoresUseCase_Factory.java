package com.paypal.oslo.feature.cashin.domain.usecase;

/* loaded from: classes11.dex */
public final class GetCashInStoresUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.StoresRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetCashInStoresUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.StoresRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.StoresRepository> provider) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase newInstance(com.paypal.oslo.feature.cashin.domain.repository.StoresRepository storesRepository) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase(storesRepository);
    }
}

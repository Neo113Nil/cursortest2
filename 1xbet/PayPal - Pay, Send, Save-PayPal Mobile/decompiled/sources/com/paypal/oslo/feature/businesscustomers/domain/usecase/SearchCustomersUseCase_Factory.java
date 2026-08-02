package com.paypal.oslo.feature.businesscustomers.domain.usecase;

/* loaded from: classes11.dex */
public final class SearchCustomersUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesscustomers.domain.usecase.SearchCustomersUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository> Camera2StreamConfigurationMap;

    private SearchCustomersUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesscustomers.domain.usecase.SearchCustomersUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesscustomers.domain.usecase.SearchCustomersUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository> provider) {
        return new com.paypal.oslo.feature.businesscustomers.domain.usecase.SearchCustomersUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesscustomers.domain.usecase.SearchCustomersUseCase newInstance(com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository customersRepository) {
        return new com.paypal.oslo.feature.businesscustomers.domain.usecase.SearchCustomersUseCase(customersRepository);
    }
}

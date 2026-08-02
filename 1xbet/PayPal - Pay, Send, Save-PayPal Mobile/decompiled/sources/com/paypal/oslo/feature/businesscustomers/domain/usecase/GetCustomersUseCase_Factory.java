package com.paypal.oslo.feature.businesscustomers.domain.usecase;

/* loaded from: classes11.dex */
public final class GetCustomersUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetCustomersUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository> provider) {
        return new com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUseCase newInstance(com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository customersRepository) {
        return new com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUseCase(customersRepository);
    }
}

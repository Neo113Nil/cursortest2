package com.paypal.oslo.feature.businesscustomers.domain.usecase;

/* loaded from: classes11.dex */
public final class RemoveCustomerUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus> getHighSpeedVideoFpsRanges;

    private RemoveCustomerUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus> provider2) {
        return new com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase newInstance(com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository customersRepository, com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus customersUpdatesEventBus) {
        return new com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase(customersRepository, customersUpdatesEventBus);
    }
}

package com.paypal.oslo.feature.businesscustomers.domain.usecase;

/* loaded from: classes11.dex */
public final class GetCustomersUpdatesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus> Camera2StreamConfigurationMap;

    private GetCustomersUpdatesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus> provider) {
        return new com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase newInstance(com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus customersUpdatesEventBus) {
        return new com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase(customersUpdatesEventBus);
    }
}

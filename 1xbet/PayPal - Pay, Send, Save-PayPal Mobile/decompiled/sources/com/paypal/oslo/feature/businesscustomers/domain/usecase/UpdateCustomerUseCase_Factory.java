package com.paypal.oslo.feature.businesscustomers.domain.usecase;

/* loaded from: classes11.dex */
public final class UpdateCustomerUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository> getHighSpeedVideoSizes;

    private UpdateCustomerUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus> provider2) {
        return new com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase newInstance(com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository customersRepository, com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus customersUpdatesEventBus) {
        return new com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase(customersRepository, customersUpdatesEventBus);
    }
}

package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

/* loaded from: classes12.dex */
public final class GetAddressesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository> getHighSpeedVideoSizes;

    private GetAddressesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesUseCase newInstance(com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository addressRepository) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesUseCase(addressRepository);
    }
}

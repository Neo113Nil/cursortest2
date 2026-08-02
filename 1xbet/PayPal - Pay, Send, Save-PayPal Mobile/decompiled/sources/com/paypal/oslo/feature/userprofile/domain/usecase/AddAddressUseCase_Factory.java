package com.paypal.oslo.feature.userprofile.domain.usecase;

/* loaded from: classes15.dex */
public final class AddAddressUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.usecase.AddAddressUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository> getHighSpeedVideoFpsRanges;

    private AddAddressUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.usecase.AddAddressUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.AddAddressUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository> provider) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.AddAddressUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.AddAddressUseCase newInstance(com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository addressRepository) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.AddAddressUseCase(addressRepository);
    }
}

package com.paypal.oslo.feature.userprofile.domain.usecase;

/* loaded from: classes15.dex */
public final class GetAddressesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetAddressesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressesUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository> provider) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressesUseCase newInstance(com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository addressRepository) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressesUseCase(addressRepository);
    }
}

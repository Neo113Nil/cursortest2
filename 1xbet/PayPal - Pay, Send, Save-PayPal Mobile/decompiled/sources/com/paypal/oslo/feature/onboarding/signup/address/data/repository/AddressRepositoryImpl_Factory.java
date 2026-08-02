package com.paypal.oslo.feature.onboarding.signup.address.data.repository;

/* loaded from: classes13.dex */
public final class AddressRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.address.data.repository.AddressRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.service.AddressService> getHighSpeedVideoFpsRangesFor;

    private AddressRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.service.AddressService> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.address.data.repository.AddressRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.address.data.repository.AddressRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.service.AddressService> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.address.data.repository.AddressRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.address.data.repository.AddressRepositoryImpl newInstance(com.paypal.oslo.feature.onboarding.signup.address.domain.service.AddressService addressService) {
        return new com.paypal.oslo.feature.onboarding.signup.address.data.repository.AddressRepositoryImpl(addressService);
    }
}

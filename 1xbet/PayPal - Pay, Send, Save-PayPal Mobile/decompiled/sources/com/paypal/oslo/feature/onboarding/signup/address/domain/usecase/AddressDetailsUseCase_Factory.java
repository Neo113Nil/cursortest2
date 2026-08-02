package com.paypal.oslo.feature.onboarding.signup.address.domain.usecase;

/* loaded from: classes13.dex */
public final class AddressDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository> getHighSpeedVideoFpsRanges;

    private AddressDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressDetailsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressDetailsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressDetailsUseCase newInstance(com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository addressRepository) {
        return new com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressDetailsUseCase(addressRepository);
    }
}

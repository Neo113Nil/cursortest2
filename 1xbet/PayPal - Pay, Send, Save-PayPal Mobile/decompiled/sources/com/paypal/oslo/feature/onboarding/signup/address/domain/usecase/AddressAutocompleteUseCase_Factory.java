package com.paypal.oslo.feature.onboarding.signup.address.domain.usecase;

/* loaded from: classes13.dex */
public final class AddressAutocompleteUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressAutocompleteUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository> getHighSpeedVideoFpsRangesFor;

    private AddressAutocompleteUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressAutocompleteUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressAutocompleteUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressAutocompleteUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressAutocompleteUseCase newInstance(com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository addressRepository) {
        return new com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressAutocompleteUseCase(addressRepository);
    }
}

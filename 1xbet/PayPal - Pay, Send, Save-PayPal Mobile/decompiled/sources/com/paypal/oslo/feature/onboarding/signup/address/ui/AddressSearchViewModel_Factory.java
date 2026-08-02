package com.paypal.oslo.feature.onboarding.signup.address.ui;

/* loaded from: classes13.dex */
public final class AddressSearchViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressDetailsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.ui.ErrorMessageMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressAutocompleteUseCase> getHighSpeedVideoFpsRangesFor;

    private AddressSearchViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressAutocompleteUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressDetailsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.ui.ErrorMessageMapper> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressAutocompleteUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressDetailsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.ui.ErrorMessageMapper> provider3) {
        return new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel newInstance(com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressAutocompleteUseCase addressAutocompleteUseCase, com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressDetailsUseCase addressDetailsUseCase, com.paypal.oslo.feature.onboarding.errorstruct.ui.ErrorMessageMapper errorMessageMapper) {
        return new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel(addressAutocompleteUseCase, addressDetailsUseCase, errorMessageMapper);
    }
}

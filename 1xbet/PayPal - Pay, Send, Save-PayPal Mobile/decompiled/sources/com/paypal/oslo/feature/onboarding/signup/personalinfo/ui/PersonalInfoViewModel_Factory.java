package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui;

/* loaded from: classes13.dex */
public final class PersonalInfoViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateNameUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.UpdateSignupFieldUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCase> getHighSpeedVideoFpsRangesFor;

    private PersonalInfoViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateNameUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.UpdateSignupFieldUseCase> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateNameUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.UpdateSignupFieldUseCase> provider4) {
        return new com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel newInstance(com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager, com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateNameUseCase validateNameUseCase, com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCase validateAddressUseCase, com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.UpdateSignupFieldUseCase updateSignupFieldUseCase) {
        return new com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel(signupDataManager, validateNameUseCase, validateAddressUseCase, updateSignupFieldUseCase);
    }
}

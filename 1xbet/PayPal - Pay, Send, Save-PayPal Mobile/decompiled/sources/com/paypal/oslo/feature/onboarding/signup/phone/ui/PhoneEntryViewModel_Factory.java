package com.paypal.oslo.feature.onboarding.signup.phone.ui;

/* loaded from: classes13.dex */
public final class PhoneEntryViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> getHighSpeedVideoFpsRanges;

    private PhoneEntryViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel newInstance(com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel(signupDataManager);
    }
}

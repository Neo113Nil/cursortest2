package com.paypal.oslo.feature.onboarding.signup.email;

/* loaded from: classes13.dex */
public final class EmailCheckerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.EmailCheckSuccessMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailValidationService> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.EmailCheckErrorMapper> getHighSpeedVideoSizes;

    private EmailCheckerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailValidationService> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.EmailCheckSuccessMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.EmailCheckErrorMapper> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailValidationService> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.EmailCheckSuccessMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.EmailCheckErrorMapper> provider3) {
        return new com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl newInstance(dagger.Lazy<com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailValidationService> lazy, com.paypal.oslo.feature.onboarding.signup.email.EmailCheckSuccessMapper emailCheckSuccessMapper, com.paypal.oslo.feature.onboarding.signup.email.EmailCheckErrorMapper emailCheckErrorMapper) {
        return new com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl(lazy, emailCheckSuccessMapper, emailCheckErrorMapper);
    }
}

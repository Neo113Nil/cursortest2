package com.paypal.oslo.feature.onboarding.signup.email.ui;

/* loaded from: classes13.dex */
public final class EmailConfirmationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ConfirmEmailVerificationCodeUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlin.coroutines.CoroutineContext> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.RequestEmailVerificationCodeUseCase> getHighSpeedVideoSizes;

    private EmailConfirmationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.RequestEmailVerificationCodeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ConfirmEmailVerificationCodeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper> provider3, dagger.internal.Provider<kotlin.coroutines.CoroutineContext> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.RequestEmailVerificationCodeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ConfirmEmailVerificationCodeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper> provider3, dagger.internal.Provider<kotlin.coroutines.CoroutineContext> provider4) {
        return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel newInstance(com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.RequestEmailVerificationCodeUseCase requestEmailVerificationCodeUseCase, com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ConfirmEmailVerificationCodeUseCase confirmEmailVerificationCodeUseCase, com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper otpErrorDisplayMapper, kotlin.coroutines.CoroutineContext coroutineContext) {
        return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel(requestEmailVerificationCodeUseCase, confirmEmailVerificationCodeUseCase, otpErrorDisplayMapper, coroutineContext);
    }
}

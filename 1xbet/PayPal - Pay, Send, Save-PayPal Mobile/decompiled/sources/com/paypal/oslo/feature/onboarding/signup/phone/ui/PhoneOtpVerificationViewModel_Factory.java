package com.paypal.oslo.feature.onboarding.signup.phone.ui;

/* loaded from: classes13.dex */
public final class PhoneOtpVerificationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel> {
    private final dagger.internal.Provider<kotlin.coroutines.CoroutineContext> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.ConfirmPhoneVerificationCodeUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.RequestPhoneVerificationCodeUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StartSmsRetrieverUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StopSmsRetrieverUseCase> getOutputMinFrameDuration;

    private PhoneOtpVerificationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.RequestPhoneVerificationCodeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.ConfirmPhoneVerificationCodeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StartSmsRetrieverUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StopSmsRetrieverUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper> provider5, dagger.internal.Provider<kotlin.coroutines.CoroutineContext> provider6, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> provider7) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getInputFormats = provider3;
        this.getOutputMinFrameDuration = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.Camera2StreamConfigurationMap = provider6;
        this.getHighSpeedVideoSizes = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputFormats.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.RequestPhoneVerificationCodeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.ConfirmPhoneVerificationCodeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StartSmsRetrieverUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StopSmsRetrieverUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper> provider5, dagger.internal.Provider<kotlin.coroutines.CoroutineContext> provider6, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> provider7) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel newInstance(com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.RequestPhoneVerificationCodeUseCase requestPhoneVerificationCodeUseCase, com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.ConfirmPhoneVerificationCodeUseCase confirmPhoneVerificationCodeUseCase, com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StartSmsRetrieverUseCase startSmsRetrieverUseCase, com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StopSmsRetrieverUseCase stopSmsRetrieverUseCase, com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper otpErrorDisplayMapper, kotlin.coroutines.CoroutineContext coroutineContext, com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase formatAsTypedUseCase) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel(requestPhoneVerificationCodeUseCase, confirmPhoneVerificationCodeUseCase, startSmsRetrieverUseCase, stopSmsRetrieverUseCase, otpErrorDisplayMapper, coroutineContext, formatAsTypedUseCase);
    }
}

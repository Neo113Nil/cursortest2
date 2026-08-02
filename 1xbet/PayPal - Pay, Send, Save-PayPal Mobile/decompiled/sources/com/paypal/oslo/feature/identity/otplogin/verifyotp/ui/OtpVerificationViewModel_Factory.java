package com.paypal.oslo.feature.identity.otplogin.verifyotp.ui;

/* loaded from: classes12.dex */
public final class OtpVerificationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase.OtpVerificationUseCase> getHighSpeedVideoSizes;

    private OtpVerificationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase.OtpVerificationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase.OtpVerificationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer> provider4) {
        return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel newInstance(com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase.OtpVerificationUseCase otpVerificationUseCase, com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase otpGenerationUseCase, com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase mapToAuthOptionUseCase, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer otpVerificationReducer) {
        return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel(otpVerificationUseCase, otpGenerationUseCase, mapToAuthOptionUseCase, otpVerificationReducer);
    }
}

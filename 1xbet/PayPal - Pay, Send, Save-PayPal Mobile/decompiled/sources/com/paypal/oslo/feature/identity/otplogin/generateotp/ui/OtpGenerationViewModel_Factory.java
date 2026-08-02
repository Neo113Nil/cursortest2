package com.paypal.oslo.feature.identity.otplogin.generateotp.ui;

/* loaded from: classes12.dex */
public final class OtpGenerationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase> Camera2StreamConfigurationMap;

    private OtpGenerationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase> provider) {
        return new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel newInstance(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase otpGenerationUseCase) {
        return new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel(otpGenerationUseCase);
    }
}

package com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase;

/* loaded from: classes12.dex */
public final class OtpGenerationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.repository.OtpGenerationRepository> getHighSpeedVideoFpsRanges;

    private OtpGenerationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.repository.OtpGenerationRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.repository.OtpGenerationRepository> provider) {
        return new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase newInstance(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.repository.OtpGenerationRepository otpGenerationRepository) {
        return new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase(otpGenerationRepository);
    }
}

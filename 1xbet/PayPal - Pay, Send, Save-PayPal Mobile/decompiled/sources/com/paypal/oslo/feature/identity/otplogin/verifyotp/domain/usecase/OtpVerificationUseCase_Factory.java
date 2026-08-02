package com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase;

/* loaded from: classes12.dex */
public final class OtpVerificationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase.OtpVerificationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private OtpVerificationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase.OtpVerificationUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase.OtpVerificationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> provider) {
        return new com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase.OtpVerificationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase.OtpVerificationUseCase newInstance(com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase loginUseCase) {
        return new com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase.OtpVerificationUseCase(loginUseCase);
    }
}

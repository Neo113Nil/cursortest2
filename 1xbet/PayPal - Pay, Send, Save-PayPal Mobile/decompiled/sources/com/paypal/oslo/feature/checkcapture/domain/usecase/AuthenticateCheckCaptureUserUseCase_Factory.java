package com.paypal.oslo.feature.checkcapture.domain.usecase;

/* loaded from: classes11.dex */
public final class AuthenticateCheckCaptureUserUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.checkcapture.domain.usecase.AuthenticateCheckCaptureUserUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.domain.repository.CheckCaptureRepository> Camera2StreamConfigurationMap;

    private AuthenticateCheckCaptureUserUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.domain.repository.CheckCaptureRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.checkcapture.domain.usecase.AuthenticateCheckCaptureUserUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.checkcapture.domain.usecase.AuthenticateCheckCaptureUserUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.domain.repository.CheckCaptureRepository> provider) {
        return new com.paypal.oslo.feature.checkcapture.domain.usecase.AuthenticateCheckCaptureUserUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.checkcapture.domain.usecase.AuthenticateCheckCaptureUserUseCase newInstance(com.paypal.oslo.feature.checkcapture.domain.repository.CheckCaptureRepository checkCaptureRepository) {
        return new com.paypal.oslo.feature.checkcapture.domain.usecase.AuthenticateCheckCaptureUserUseCase(checkCaptureRepository);
    }
}

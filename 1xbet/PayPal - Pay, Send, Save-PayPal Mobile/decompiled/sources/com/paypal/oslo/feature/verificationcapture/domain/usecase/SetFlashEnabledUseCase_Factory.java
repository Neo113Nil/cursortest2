package com.paypal.oslo.feature.verificationcapture.domain.usecase;

/* loaded from: classes15.dex */
public final class SetFlashEnabledUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.domain.usecase.SetFlashEnabledUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository> Camera2StreamConfigurationMap;

    private SetFlashEnabledUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.domain.usecase.SetFlashEnabledUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.SetFlashEnabledUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository> provider) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.SetFlashEnabledUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.SetFlashEnabledUseCase newInstance(com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository idCaptureRepository) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.SetFlashEnabledUseCase(idCaptureRepository);
    }
}

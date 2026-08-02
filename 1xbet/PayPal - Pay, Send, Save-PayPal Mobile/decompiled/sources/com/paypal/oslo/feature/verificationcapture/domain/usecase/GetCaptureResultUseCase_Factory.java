package com.paypal.oslo.feature.verificationcapture.domain.usecase;

/* loaded from: classes15.dex */
public final class GetCaptureResultUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.domain.usecase.GetCaptureResultUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository> getHighSpeedVideoFpsRanges;

    private GetCaptureResultUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.domain.usecase.GetCaptureResultUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.GetCaptureResultUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository> provider) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.GetCaptureResultUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.GetCaptureResultUseCase newInstance(com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository idCaptureRepository) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.GetCaptureResultUseCase(idCaptureRepository);
    }
}

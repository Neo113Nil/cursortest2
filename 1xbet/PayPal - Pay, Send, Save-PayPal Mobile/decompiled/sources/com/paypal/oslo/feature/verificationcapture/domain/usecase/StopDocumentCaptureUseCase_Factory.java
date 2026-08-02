package com.paypal.oslo.feature.verificationcapture.domain.usecase;

/* loaded from: classes15.dex */
public final class StopDocumentCaptureUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.domain.usecase.StopDocumentCaptureUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository> getHighSpeedVideoSizes;

    private StopDocumentCaptureUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.domain.usecase.StopDocumentCaptureUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.StopDocumentCaptureUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository> provider) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.StopDocumentCaptureUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.StopDocumentCaptureUseCase newInstance(com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository idCaptureRepository) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.StopDocumentCaptureUseCase(idCaptureRepository);
    }
}

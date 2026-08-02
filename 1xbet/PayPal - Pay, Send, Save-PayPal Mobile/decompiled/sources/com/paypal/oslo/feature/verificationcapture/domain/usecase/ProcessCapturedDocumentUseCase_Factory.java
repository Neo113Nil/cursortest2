package com.paypal.oslo.feature.verificationcapture.domain.usecase;

/* loaded from: classes15.dex */
public final class ProcessCapturedDocumentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository> getHighSpeedVideoFpsRangesFor;

    private ProcessCapturedDocumentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository> provider) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase newInstance(com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository idCaptureRepository) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase(idCaptureRepository);
    }
}

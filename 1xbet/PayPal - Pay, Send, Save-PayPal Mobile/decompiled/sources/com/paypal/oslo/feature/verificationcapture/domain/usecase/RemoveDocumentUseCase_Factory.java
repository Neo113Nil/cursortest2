package com.paypal.oslo.feature.verificationcapture.domain.usecase;

/* loaded from: classes15.dex */
public final class RemoveDocumentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository> getHighSpeedVideoFpsRangesFor;

    private RemoveDocumentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository> provider) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase newInstance(com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase(verificationCaptureRepository);
    }
}

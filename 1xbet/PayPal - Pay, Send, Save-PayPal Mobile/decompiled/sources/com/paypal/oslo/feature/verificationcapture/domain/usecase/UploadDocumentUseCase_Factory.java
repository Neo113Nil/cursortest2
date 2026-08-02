package com.paypal.oslo.feature.verificationcapture.domain.usecase;

/* loaded from: classes15.dex */
public final class UploadDocumentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository> getHighSpeedVideoFpsRanges;

    private UploadDocumentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository> provider) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase newInstance(com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase(verificationCaptureRepository);
    }
}

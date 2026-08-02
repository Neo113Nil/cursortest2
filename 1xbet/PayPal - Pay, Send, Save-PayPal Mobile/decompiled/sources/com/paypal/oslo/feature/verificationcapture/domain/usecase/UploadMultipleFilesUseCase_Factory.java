package com.paypal.oslo.feature.verificationcapture.domain.usecase;

/* loaded from: classes15.dex */
public final class UploadMultipleFilesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadMultipleFilesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository> getHighResolutionOutputSizeshNQ4ISI;

    private UploadMultipleFilesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadMultipleFilesUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadMultipleFilesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository> provider) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadMultipleFilesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadMultipleFilesUseCase newInstance(com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadMultipleFilesUseCase(verificationCaptureRepository);
    }
}

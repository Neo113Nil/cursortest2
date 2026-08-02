package com.paypal.oslo.feature.verificationcapture.domain.usecase;

/* loaded from: classes15.dex */
public final class ValidateDocumentQualityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.DocumentValidationRepository> getHighSpeedVideoFpsRangesFor;

    private ValidateDocumentQualityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.DocumentValidationRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.DocumentValidationRepository> provider) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase newInstance(com.paypal.oslo.feature.verificationcapture.domain.repository.DocumentValidationRepository documentValidationRepository) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase(documentValidationRepository);
    }
}

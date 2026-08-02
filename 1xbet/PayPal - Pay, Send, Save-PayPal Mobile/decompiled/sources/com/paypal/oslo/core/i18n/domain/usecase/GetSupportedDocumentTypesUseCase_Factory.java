package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class GetSupportedDocumentTypesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.DocumentRepository> getHighSpeedVideoFpsRangesFor;

    private GetSupportedDocumentTypesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.DocumentRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.DocumentRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil> provider2) {
        return new com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase newInstance(com.paypal.oslo.core.i18n.domain.repository.DocumentRepository documentRepository, com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil documentTypeUtil) {
        return new com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase(documentRepository, documentTypeUtil);
    }
}

package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class DownloadDocumentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.DocumentRepository> getHighResolutionOutputSizeshNQ4ISI;

    private DownloadDocumentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.DocumentRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.DocumentRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.DocumentRepository documentRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase(documentRepository);
    }
}

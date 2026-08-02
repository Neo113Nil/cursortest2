package com.paypal.oslo.feature.bnplservicing.domain.usecase;

/* loaded from: classes11.dex */
public final class DownloadDocumentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.DownloadDocumentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository> getHighSpeedVideoFpsRanges;

    private DownloadDocumentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.DownloadDocumentUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.DownloadDocumentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository> provider) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.DownloadDocumentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.DownloadDocumentUseCase newInstance(com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository documentRepository) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.DownloadDocumentUseCase(documentRepository);
    }
}

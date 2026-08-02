package com.paypal.oslo.feature.bnplservicing.ui.document;

/* loaded from: classes11.dex */
public final class DocumentHalfSheetViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.DownloadDocumentUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.document.PdfViewerIntent> getHighSpeedVideoFpsRanges;

    private DocumentHalfSheetViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.DownloadDocumentUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.document.PdfViewerIntent> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.DownloadDocumentUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.document.PdfViewerIntent> provider2) {
        return new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel newInstance(com.paypal.oslo.feature.bnplservicing.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase, com.paypal.oslo.feature.bnplservicing.ui.document.PdfViewerIntent pdfViewerIntent) {
        return new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel(downloadDocumentUseCase, pdfViewerIntent);
    }
}

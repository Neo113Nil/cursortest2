package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents;

/* loaded from: classes11.dex */
public final class DocumentsHalfSheetViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase> getHighSpeedVideoFpsRangesFor;

    private DocumentsHalfSheetViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider3) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetReducer documentsHalfSheetReducer, com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel(documentsHalfSheetReducer, downloadDocumentUseCase, sessionStorage);
    }
}

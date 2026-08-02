package com.paypal.oslo.feature.bnplacquisition.ui.contentviewer;

/* loaded from: classes11.dex */
public final class ContentViewerViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiMapper> getHighSpeedVideoSizes;

    private ContentViewerViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiMapper> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiMapper> provider4) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer contentViewerReducer, com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiMapper contentViewerUiMapper) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel(contentViewerReducer, downloadDocumentUseCase, sessionStorage, contentViewerUiMapper);
    }
}

package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi;

/* loaded from: classes15.dex */
public final class TaxDocumentsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler> getHighSpeedVideoSizes;

    private TaxDocumentsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsReducer> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsReducer> provider5) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel newInstance(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider taxDocumentsUseCaseProvider, com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator downloadOrchestrator, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler deeplinkNavigationHandler, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsReducer taxDocumentsReducer) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel(userStore, taxDocumentsUseCaseProvider, downloadOrchestrator, deeplinkNavigationHandler, taxDocumentsReducer);
    }
}

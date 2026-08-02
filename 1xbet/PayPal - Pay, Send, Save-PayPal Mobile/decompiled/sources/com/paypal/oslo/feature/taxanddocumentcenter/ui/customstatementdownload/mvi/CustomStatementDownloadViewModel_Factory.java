package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi;

/* loaded from: classes15.dex */
public final class CustomStatementDownloadViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator> getHighSpeedVideoFpsRangesFor;

    private CustomStatementDownloadViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadReducer> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadReducer> provider3) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadViewModel newInstance(com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator downloadOrchestrator, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadReducer customStatementDownloadReducer) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadViewModel(downloadOrchestrator, appNavigator, customStatementDownloadReducer);
    }
}

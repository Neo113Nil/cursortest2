package com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0382AcquisitionWebViewViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewReducer> getHighSpeedVideoFpsRangesFor;

    private C0382AcquisitionWebViewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel get(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionWebViewNavigationArgs acquisitionWebViewNavigationArgs) {
        return newInstance(acquisitionWebViewNavigationArgs, this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.C0382AcquisitionWebViewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.C0382AcquisitionWebViewViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel newInstance(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionWebViewNavigationArgs acquisitionWebViewNavigationArgs, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewReducer acquisitionWebViewReducer, com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware acquisitionWebViewDownloadFileMiddleware) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel(acquisitionWebViewNavigationArgs, acquisitionWebViewReducer, webEnvironmentProvider, acquisitionWebViewDownloadFileMiddleware);
    }
}

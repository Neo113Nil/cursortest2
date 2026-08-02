package com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel;

/* loaded from: classes14.dex */
public final class AcquisitionWebViewDownloadFileMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase> Camera2StreamConfigurationMap;

    private AcquisitionWebViewDownloadFileMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase> provider) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase downloadFileUseCase) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware(downloadFileUseCase);
    }
}

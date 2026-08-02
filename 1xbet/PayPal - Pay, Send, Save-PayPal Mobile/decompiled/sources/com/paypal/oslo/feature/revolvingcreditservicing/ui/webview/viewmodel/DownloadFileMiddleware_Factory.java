package com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel;

/* loaded from: classes14.dex */
public final class DownloadFileMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase> getHighSpeedVideoFpsRanges;

    private DownloadFileMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase downloadFileUseCase) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware(downloadFileUseCase);
    }
}

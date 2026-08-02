package com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0429RevolvingCreditWebViewViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewObservabilityMiddleware.Factory> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware> getHighSpeedVideoFpsRangesFor;

    private C0429RevolvingCreditWebViewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewObservabilityMiddleware.Factory> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs revolvingCreditWebViewArgs) {
        return newInstance(revolvingCreditWebViewArgs, this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.C0429RevolvingCreditWebViewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewObservabilityMiddleware.Factory> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.C0429RevolvingCreditWebViewViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs revolvingCreditWebViewArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewReducer revolvingCreditWebViewReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware downloadFileMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewObservabilityMiddleware.Factory factory) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel(revolvingCreditWebViewArgs, revolvingCreditWebViewReducer, downloadFileMiddleware, factory);
    }
}

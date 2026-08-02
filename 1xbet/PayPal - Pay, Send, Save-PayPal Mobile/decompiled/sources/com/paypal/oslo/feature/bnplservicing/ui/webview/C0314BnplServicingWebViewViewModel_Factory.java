package com.paypal.oslo.feature.bnplservicing.ui.webview;

/* renamed from: com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0314BnplServicingWebViewViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewReducer> getHighSpeedVideoFpsRangesFor;

    private C0314BnplServicingWebViewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel get(com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUIModel bnplServicingWebViewUIModel) {
        return newInstance(bnplServicingWebViewUIModel, this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.webview.C0314BnplServicingWebViewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> provider2) {
        return new com.paypal.oslo.feature.bnplservicing.ui.webview.C0314BnplServicingWebViewViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel newInstance(com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUIModel bnplServicingWebViewUIModel, com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewReducer bnplServicingWebViewReducer, com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage bnplServicingSessionStorage) {
        return new com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel(bnplServicingWebViewUIModel, bnplServicingWebViewReducer, bnplServicingSessionStorage);
    }
}

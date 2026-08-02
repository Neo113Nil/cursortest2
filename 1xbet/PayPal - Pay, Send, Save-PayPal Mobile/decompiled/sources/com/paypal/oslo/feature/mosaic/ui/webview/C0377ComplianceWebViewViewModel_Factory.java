package com.paypal.oslo.feature.mosaic.ui.webview;

/* renamed from: com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C0377ComplianceWebViewViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl> getHighSpeedVideoFpsRangesFor;

    private C0377ComplianceWebViewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl> provider, dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewReducer> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    public final com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel get(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel complianceWebViewUIModel) {
        return newInstance(complianceWebViewUIModel, this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.mosaic.ui.webview.C0377ComplianceWebViewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl> provider, dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewReducer> provider2) {
        return new com.paypal.oslo.feature.mosaic.ui.webview.C0377ComplianceWebViewViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel newInstance(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel complianceWebViewUIModel, com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl mosaicWebViewBuildUrl, com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewReducer complianceWebViewReducer) {
        return new com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel(complianceWebViewUIModel, mosaicWebViewBuildUrl, complianceWebViewReducer);
    }
}

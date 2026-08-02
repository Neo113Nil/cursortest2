package com.paypal.oslo.feature.mosaic.ui.webview;

/* loaded from: classes13.dex */
public final class ComplianceWebViewViewModel_Factory_Impl implements com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel.Factory {
    private final com.paypal.oslo.feature.mosaic.ui.webview.C0377ComplianceWebViewViewModel_Factory Camera2StreamConfigurationMap;

    private ComplianceWebViewViewModel_Factory_Impl(com.paypal.oslo.feature.mosaic.ui.webview.C0377ComplianceWebViewViewModel_Factory c0377ComplianceWebViewViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0377ComplianceWebViewViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel.Factory
    public final com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel create(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel complianceWebViewUIModel) {
        return this.Camera2StreamConfigurationMap.get(complianceWebViewUIModel);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel.Factory> create(com.paypal.oslo.feature.mosaic.ui.webview.C0377ComplianceWebViewViewModel_Factory c0377ComplianceWebViewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel_Factory_Impl(c0377ComplianceWebViewViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.mosaic.ui.webview.C0377ComplianceWebViewViewModel_Factory c0377ComplianceWebViewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel_Factory_Impl(c0377ComplianceWebViewViewModel_Factory));
    }
}

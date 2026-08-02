package com.paypal.oslo.feature.bnplservicing.ui.webview;

/* loaded from: classes11.dex */
public final class BnplServicingWebViewViewModel_Factory_Impl implements com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel.Factory {
    private final com.paypal.oslo.feature.bnplservicing.ui.webview.C0314BnplServicingWebViewViewModel_Factory getHighSpeedVideoSizes;

    private BnplServicingWebViewViewModel_Factory_Impl(com.paypal.oslo.feature.bnplservicing.ui.webview.C0314BnplServicingWebViewViewModel_Factory c0314BnplServicingWebViewViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0314BnplServicingWebViewViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel.Factory
    public final com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel create(com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUIModel bnplServicingWebViewUIModel) {
        return this.getHighSpeedVideoSizes.get(bnplServicingWebViewUIModel);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel.Factory> create(com.paypal.oslo.feature.bnplservicing.ui.webview.C0314BnplServicingWebViewViewModel_Factory c0314BnplServicingWebViewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel_Factory_Impl(c0314BnplServicingWebViewViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.bnplservicing.ui.webview.C0314BnplServicingWebViewViewModel_Factory c0314BnplServicingWebViewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel_Factory_Impl(c0314BnplServicingWebViewViewModel_Factory));
    }
}

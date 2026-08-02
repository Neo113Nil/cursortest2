package com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel;

/* loaded from: classes14.dex */
public final class RevolvingCreditWebViewViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.C0429RevolvingCreditWebViewViewModel_Factory Camera2StreamConfigurationMap;

    private RevolvingCreditWebViewViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.C0429RevolvingCreditWebViewViewModel_Factory c0429RevolvingCreditWebViewViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0429RevolvingCreditWebViewViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs revolvingCreditWebViewArgs) {
        return this.Camera2StreamConfigurationMap.get(revolvingCreditWebViewArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.C0429RevolvingCreditWebViewViewModel_Factory c0429RevolvingCreditWebViewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel_Factory_Impl(c0429RevolvingCreditWebViewViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.C0429RevolvingCreditWebViewViewModel_Factory c0429RevolvingCreditWebViewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel_Factory_Impl(c0429RevolvingCreditWebViewViewModel_Factory));
    }
}

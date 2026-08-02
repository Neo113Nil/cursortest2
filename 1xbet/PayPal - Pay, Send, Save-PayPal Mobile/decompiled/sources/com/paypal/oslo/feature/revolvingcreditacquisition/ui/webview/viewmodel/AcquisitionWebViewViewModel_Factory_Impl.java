package com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel;

/* loaded from: classes14.dex */
public final class AcquisitionWebViewViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.C0382AcquisitionWebViewViewModel_Factory Camera2StreamConfigurationMap;

    private AcquisitionWebViewViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.C0382AcquisitionWebViewViewModel_Factory c0382AcquisitionWebViewViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0382AcquisitionWebViewViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel create(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionWebViewNavigationArgs acquisitionWebViewNavigationArgs) {
        return this.Camera2StreamConfigurationMap.get(acquisitionWebViewNavigationArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.C0382AcquisitionWebViewViewModel_Factory c0382AcquisitionWebViewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel_Factory_Impl(c0382AcquisitionWebViewViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.C0382AcquisitionWebViewViewModel_Factory c0382AcquisitionWebViewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel_Factory_Impl(c0382AcquisitionWebViewViewModel_Factory));
    }
}

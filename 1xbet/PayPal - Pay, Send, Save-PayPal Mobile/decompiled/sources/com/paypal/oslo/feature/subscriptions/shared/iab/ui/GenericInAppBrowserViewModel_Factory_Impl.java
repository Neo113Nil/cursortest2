package com.paypal.oslo.feature.subscriptions.shared.iab.ui;

/* loaded from: classes15.dex */
public final class GenericInAppBrowserViewModel_Factory_Impl implements com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.Factory {
    private final com.paypal.oslo.feature.subscriptions.shared.iab.ui.C0435GenericInAppBrowserViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private GenericInAppBrowserViewModel_Factory_Impl(com.paypal.oslo.feature.subscriptions.shared.iab.ui.C0435GenericInAppBrowserViewModel_Factory c0435GenericInAppBrowserViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0435GenericInAppBrowserViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.Factory
    public final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel create(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserArgs genericInAppBrowserArgs) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(genericInAppBrowserArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.Factory> create(com.paypal.oslo.feature.subscriptions.shared.iab.ui.C0435GenericInAppBrowserViewModel_Factory c0435GenericInAppBrowserViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel_Factory_Impl(c0435GenericInAppBrowserViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.subscriptions.shared.iab.ui.C0435GenericInAppBrowserViewModel_Factory c0435GenericInAppBrowserViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel_Factory_Impl(c0435GenericInAppBrowserViewModel_Factory));
    }
}

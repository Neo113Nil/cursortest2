package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation;

/* loaded from: classes15.dex */
public final class DeeplinkNavigationHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> getHighResolutionOutputSizeshNQ4ISI;

    private DeeplinkNavigationHandler_Factory(dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler newInstance(com.paypal.oslo.core.deeplink.DeeplinkResolver deeplinkResolver, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler(deeplinkResolver, appNavigator);
    }
}

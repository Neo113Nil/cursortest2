package com.paypal.oslo.feature.bnplacquisition.ui.utils;

/* loaded from: classes11.dex */
public final class UrlMaker_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.utils.UrlMaker> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> getHighSpeedVideoFpsRangesFor;

    private UrlMaker_Factory(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.utils.UrlMaker get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.utils.UrlMaker_Factory create(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider3) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.utils.UrlMaker_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.utils.UrlMaker newInstance(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.utils.UrlMaker(webEnvironmentProvider, userStore, localeInformation);
    }
}

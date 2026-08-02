package com.paypal.oslo.feature.mosaic.ui.webview;

/* loaded from: classes13.dex */
public final class MosaicWebViewBuildUrl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig> getHighSpeedVideoFpsRangesFor;

    private MosaicWebViewBuildUrl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider3) {
        return new com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl newInstance(com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider, com.paypal.oslo.core.appidentity.domain.AppInformation appInformation) {
        return new com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl(remoteConfigConfig, localeProvider, appInformation);
    }
}

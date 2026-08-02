package com.paypal.oslo.feature.debitcard.shared.ui.webview.utils;

/* loaded from: classes12.dex */
public final class DebitCardWebViewUrlBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighSpeedVideoFpsRanges;

    private DebitCardWebViewUrlBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder newInstance(com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder(remoteConfigConfig, localeInformation);
    }
}

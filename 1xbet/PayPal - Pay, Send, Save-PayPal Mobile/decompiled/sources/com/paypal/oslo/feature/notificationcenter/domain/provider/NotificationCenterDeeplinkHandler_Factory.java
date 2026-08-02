package com.paypal.oslo.feature.notificationcenter.domain.provider;

/* loaded from: classes13.dex */
public final class NotificationCenterDeeplinkHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator> getHighSpeedVideoSizes;

    private NotificationCenterDeeplinkHandler_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> provider2, dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator> provider3, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> provider2, dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator> provider3, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer> provider4) {
        return new com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.deeplink.DeeplinkResolver deeplinkResolver, com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator deeplinkValidator, com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer openWebDeeplinkNormalizer) {
        return new com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler(appNavigator, deeplinkResolver, deeplinkValidator, openWebDeeplinkNormalizer);
    }
}

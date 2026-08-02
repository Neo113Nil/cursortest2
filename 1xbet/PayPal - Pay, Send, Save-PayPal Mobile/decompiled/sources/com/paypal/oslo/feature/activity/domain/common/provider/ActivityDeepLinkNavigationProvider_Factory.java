package com.paypal.oslo.feature.activity.domain.common.provider;

/* loaded from: classes10.dex */
public final class ActivityDeepLinkNavigationProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> getHighSpeedVideoFpsRanges;

    private ActivityDeepLinkNavigationProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> provider2) {
        return new com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider newInstance(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.core.deeplink.DeeplinkResolver deeplinkResolver) {
        return new com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider(activityComposeConfig, deeplinkResolver);
    }
}

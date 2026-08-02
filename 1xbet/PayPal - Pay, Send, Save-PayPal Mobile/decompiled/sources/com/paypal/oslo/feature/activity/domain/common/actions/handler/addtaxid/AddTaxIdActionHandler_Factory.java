package com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid;

/* loaded from: classes10.dex */
public final class AddTaxIdActionHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider> getHighSpeedVideoFpsRangesFor;

    private AddTaxIdActionHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider> provider2) {
        return new com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler newInstance(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider activityDeepLinkNavigationProvider) {
        return new com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler(activityComposeConfig, activityDeepLinkNavigationProvider);
    }
}

package com.paypal.oslo.feature.paypalassistant.linkhandler;

/* loaded from: classes13.dex */
public final class PPALinkManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paypalassistant.linkhandler.PPALinkManager> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler> getHighSpeedVideoSizes;

    private PPALinkManager_Factory(dagger.internal.Provider<com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler> provider, dagger.internal.Provider<com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paypalassistant.linkhandler.PPALinkManager get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.paypalassistant.linkhandler.PPALinkManager_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler> provider, dagger.internal.Provider<com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider3) {
        return new com.paypal.oslo.feature.paypalassistant.linkhandler.PPALinkManager_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.paypalassistant.linkhandler.PPALinkManager newInstance(com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler webSchemeHandler, com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler fallbackSchemeHandler, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.paypalassistant.linkhandler.PPALinkManager(webSchemeHandler, fallbackSchemeHandler, appNavigator);
    }
}

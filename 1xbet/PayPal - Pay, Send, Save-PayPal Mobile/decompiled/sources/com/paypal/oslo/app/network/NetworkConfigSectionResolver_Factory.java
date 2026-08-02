package com.paypal.oslo.app.network;

/* loaded from: classes10.dex */
public final class NetworkConfigSectionResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.app.network.NetworkConfigSectionResolver> {
    private final dagger.internal.Provider<com.paypal.oslo.app.network.NetworkLoggingLevelSetter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.app.network.ChuckerSetter> getHighSpeedVideoFpsRangesFor;

    private NetworkConfigSectionResolver_Factory(dagger.internal.Provider<com.paypal.oslo.app.network.NetworkLoggingLevelSetter> provider, dagger.internal.Provider<com.paypal.oslo.app.network.ChuckerSetter> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.network.NetworkConfigSectionResolver get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.app.network.NetworkConfigSectionResolver_Factory create(dagger.internal.Provider<com.paypal.oslo.app.network.NetworkLoggingLevelSetter> provider, dagger.internal.Provider<com.paypal.oslo.app.network.ChuckerSetter> provider2) {
        return new com.paypal.oslo.app.network.NetworkConfigSectionResolver_Factory(provider, provider2);
    }

    public static com.paypal.oslo.app.network.NetworkConfigSectionResolver newInstance(com.paypal.oslo.app.network.NetworkLoggingLevelSetter networkLoggingLevelSetter, com.paypal.oslo.app.network.ChuckerSetter chuckerSetter) {
        return new com.paypal.oslo.app.network.NetworkConfigSectionResolver(networkLoggingLevelSetter, chuckerSetter);
    }
}

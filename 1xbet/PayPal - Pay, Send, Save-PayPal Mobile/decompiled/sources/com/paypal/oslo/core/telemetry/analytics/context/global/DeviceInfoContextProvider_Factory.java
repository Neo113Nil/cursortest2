package com.paypal.oslo.core.telemetry.analytics.context.global;

/* loaded from: classes10.dex */
public final class DeviceInfoContextProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.context.global.DeviceInfoContextProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> getHighSpeedVideoSizes;

    private DeviceInfoContextProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.context.global.DeviceInfoContextProvider get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.DeviceInfoContextProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> provider) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.DeviceInfoContextProvider_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.DeviceInfoContextProvider newInstance(com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.DeviceInfoContextProvider(appIdentity);
    }
}

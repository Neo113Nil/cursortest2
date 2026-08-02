package com.paypal.oslo.core.telemetry.analytics.context.global;

/* loaded from: classes10.dex */
public final class SessionLaunchTrafficSourceContextProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.context.global.SessionLaunchTrafficSourceContextProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.SessionLaunchSourceProvider> getHighSpeedVideoSizes;

    private SessionLaunchTrafficSourceContextProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.SessionLaunchSourceProvider> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.context.global.SessionLaunchTrafficSourceContextProvider get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.SessionLaunchTrafficSourceContextProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.SessionLaunchSourceProvider> provider) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.SessionLaunchTrafficSourceContextProvider_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.SessionLaunchTrafficSourceContextProvider newInstance(com.paypal.oslo.core.telemetry.analytics.SessionLaunchSourceProvider sessionLaunchSourceProvider) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.SessionLaunchTrafficSourceContextProvider(sessionLaunchSourceProvider);
    }
}

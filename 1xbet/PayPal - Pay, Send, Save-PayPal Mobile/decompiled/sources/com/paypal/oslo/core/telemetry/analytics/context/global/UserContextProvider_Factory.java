package com.paypal.oslo.core.telemetry.analytics.context.global;

/* loaded from: classes10.dex */
public final class UserContextProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoFpsRanges;

    private UserContextProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider newInstance(com.paypal.oslo.core.userstore.UserStore userStore, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider(userStore, coroutineScope);
    }
}

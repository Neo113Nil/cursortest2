package com.paypal.oslo.app.launch;

/* loaded from: classes10.dex */
public final class SessionLaunchSourceProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.app.launch.AppLaunchSourceProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoFpsRangesFor;

    private SessionLaunchSourceProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.app.launch.AppLaunchSourceProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.app.launch.AppLaunchSourceProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl newInstance(com.paypal.oslo.app.launch.AppLaunchSourceProvider appLaunchSourceProvider, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl(appLaunchSourceProvider, coroutineScope);
    }
}

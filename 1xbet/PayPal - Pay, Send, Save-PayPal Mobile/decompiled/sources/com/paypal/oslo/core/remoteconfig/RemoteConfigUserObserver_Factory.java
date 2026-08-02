package com.paypal.oslo.core.remoteconfig;

/* loaded from: classes10.dex */
public final class RemoteConfigUserObserver_Factory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.StatsigWrapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoSizes;

    private RemoteConfigUserObserver_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.StatsigWrapper> provider3, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.StatsigWrapper> provider3, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> provider4) {
        return new com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver newInstance(com.paypal.oslo.core.userstore.UserStore userStore, kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.core.remoteconfig.StatsigWrapper statsigWrapper, com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity) {
        return new com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver(userStore, coroutineScope, statsigWrapper, appIdentity);
    }
}

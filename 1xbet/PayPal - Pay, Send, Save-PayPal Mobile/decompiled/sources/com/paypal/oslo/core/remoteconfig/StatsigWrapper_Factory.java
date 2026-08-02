package com.paypal.oslo.core.remoteconfig;

/* loaded from: classes10.dex */
public final class StatsigWrapper_Factory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.StatsigWrapper> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> getHighSpeedVideoFpsRanges;

    private StatsigWrapper_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.StatsigWrapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.remoteconfig.StatsigWrapper_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3) {
        return new com.paypal.oslo.core.remoteconfig.StatsigWrapper_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.remoteconfig.StatsigWrapper newInstance(com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder remoteConfigStateHolder, com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.core.remoteconfig.StatsigWrapper(remoteConfigStateHolder, appIdentity, userStore);
    }
}

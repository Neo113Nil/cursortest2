package com.paypal.oslo.core.remoteconfig.di;

/* loaded from: classes5.dex */
public final class RemoteConfigModule_ProvideRemoteConfigStateFactory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder> getHighSpeedVideoFpsRanges;

    private RemoteConfigModule_ProvideRemoteConfigStateFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState get() {
        return provideRemoteConfigState(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule_ProvideRemoteConfigStateFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder> provider) {
        return new com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule_ProvideRemoteConfigStateFactory(provider);
    }

    public static com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState provideRemoteConfigState(com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder remoteConfigStateHolder) {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule.INSTANCE.provideRemoteConfigState(remoteConfigStateHolder));
    }
}

package com.paypal.oslo.feature.balance.di.network;

/* loaded from: classes11.dex */
public final class RemoteConfigModule_ProvideBalanceRemoteConfigFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.remoteconfig.BalanceRemoteConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private RemoteConfigModule_ProvideBalanceRemoteConfigFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.remoteconfig.BalanceRemoteConfig get() {
        return provideBalanceRemoteConfig(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.di.network.RemoteConfigModule_ProvideBalanceRemoteConfigFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.balance.di.network.RemoteConfigModule_ProvideBalanceRemoteConfigFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.remoteconfig.BalanceRemoteConfig provideBalanceRemoteConfig(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return (com.paypal.oslo.feature.balance.domain.remoteconfig.BalanceRemoteConfig) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.network.RemoteConfigModule.INSTANCE.provideBalanceRemoteConfig(featureGate));
    }
}

package com.paypal.oslo.feature.balance.di.network;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/balance/di/network/RemoteConfigModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/feature/balance/domain/remoteconfig/BalanceRemoteConfig;", "provideBalanceRemoteConfig", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)Lcom/paypal/oslo/feature/balance/domain/remoteconfig/BalanceRemoteConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class RemoteConfigModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.balance.di.network.RemoteConfigModule INSTANCE = new com.paypal.oslo.feature.balance.di.network.RemoteConfigModule();

    private RemoteConfigModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.balance.domain.remoteconfig.BalanceRemoteConfig provideBalanceRemoteConfig(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        return new com.paypal.oslo.feature.balance.data.repository.BalanceRemoteConfigImpl(featureGate);
    }
}

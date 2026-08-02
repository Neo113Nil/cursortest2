package com.paypal.oslo.core.network.connectivity.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/connectivity/di/ConnectivityModule;", "", "Lcom/paypal/oslo/core/network/connectivity/DefaultNetworkStateProvider;", "impl", "Lcom/paypal/oslo/core/network/connectivity/NetworkStateProvider;", "bindNetworkStateProvider", "(Lcom/paypal/oslo/core/network/connectivity/DefaultNetworkStateProvider;)Lcom/paypal/oslo/core/network/connectivity/NetworkStateProvider;", "Lcom/paypal/oslo/core/network/connectivity/DefaultNetworkConnectivityChecker;", "Lcom/paypal/oslo/core/network/connectivity/NetworkConnectivityChecker;", "bindNetworkConnectivityChecker", "(Lcom/paypal/oslo/core/network/connectivity/DefaultNetworkConnectivityChecker;)Lcom/paypal/oslo/core/network/connectivity/NetworkConnectivityChecker;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface ConnectivityModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker bindNetworkConnectivityChecker(com.paypal.oslo.core.network.connectivity.DefaultNetworkConnectivityChecker impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.network.connectivity.NetworkStateProvider bindNetworkStateProvider(com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider impl);
}

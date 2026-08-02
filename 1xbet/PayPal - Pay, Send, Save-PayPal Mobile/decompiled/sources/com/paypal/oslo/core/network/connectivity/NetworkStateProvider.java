package com.paypal.oslo.core.network.connectivity;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/connectivity/NetworkStateProvider;", "", "Lcom/paypal/oslo/core/network/connectivity/NetworkState;", "currentState", "()Lcom/paypal/oslo/core/network/connectivity/NetworkState;", "Lkotlinx/coroutines/flow/StateFlow;", "observeState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface NetworkStateProvider {
    com.paypal.oslo.core.network.connectivity.NetworkState currentState();

    kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.network.connectivity.NetworkState> observeState();
}

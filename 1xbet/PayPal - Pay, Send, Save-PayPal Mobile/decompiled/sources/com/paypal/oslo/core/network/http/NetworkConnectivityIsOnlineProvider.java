package com.paypal.oslo.core.network.http;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/network/http/NetworkConnectivityIsOnlineProvider;", "Lkotlin/Function0;", "", "Lcom/paypal/oslo/core/network/connectivity/NetworkConnectivityChecker;", "checker", "<init>", "(Lcom/paypal/oslo/core/network/connectivity/NetworkConnectivityChecker;)V", "invoke", "()Ljava/lang/Boolean;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/network/connectivity/NetworkConnectivityChecker;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkConnectivityIsOnlineProvider implements kotlin.jvm.functions.Function0<java.lang.Boolean> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker Camera2StreamConfigurationMap;

    public NetworkConnectivityIsOnlineProvider(com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker networkConnectivityChecker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkConnectivityChecker, "");
        this.Camera2StreamConfigurationMap = networkConnectivityChecker;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Boolean invoke() {
        return java.lang.Boolean.valueOf(this.Camera2StreamConfigurationMap.isConnected());
    }
}

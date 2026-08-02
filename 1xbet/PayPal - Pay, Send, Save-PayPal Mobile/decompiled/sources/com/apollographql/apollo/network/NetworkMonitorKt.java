package com.apollographql.apollo.network;

@kotlin.Metadata(d1 = {"com/apollographql/apollo/network/NetworkMonitorKt__NetworkMonitorKt", "com/apollographql/apollo/network/NetworkMonitorKt__NetworkMonitor_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkMonitorKt {
    public static final com.apollographql.apollo.network.NetworkMonitor NetworkMonitor(android.content.Context context) {
        return com.apollographql.apollo.network.NetworkMonitorKt__NetworkMonitor_androidKt.NetworkMonitor(context);
    }

    public static final java.lang.Object waitForNetwork(com.apollographql.apollo.network.NetworkMonitor networkMonitor, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return com.apollographql.apollo.network.NetworkMonitorKt__NetworkMonitorKt.waitForNetwork(networkMonitor, continuation);
    }
}

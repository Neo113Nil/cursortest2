package com.apollographql.apollo.network;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "p0", "Lcom/apollographql/apollo/network/NetworkMonitor;", "NetworkMonitor", "(Landroid/content/Context;)Lcom/apollographql/apollo/network/NetworkMonitor;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/apollographql/apollo/network/NetworkMonitorKt")
/* loaded from: classes7.dex */
final /* synthetic */ class NetworkMonitorKt__NetworkMonitor_androidKt {
    public static final com.apollographql.apollo.network.NetworkMonitor NetworkMonitor(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.apollographql.apollo.network.DefaultNetworkMonitor(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.network.NetworkMonitorKt__NetworkMonitor_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.apollographql.apollo.network.NetworkObserver networkObserver;
                networkObserver = com.apollographql.apollo.network.NetworkObserver_androidKt.networkObserver(context);
                return networkObserver;
            }
        });
    }
}

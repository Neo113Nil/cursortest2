package com.apollographql.apollo.network;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/apollographql/apollo/network/NetworkMonitor;", "", "waitForNetwork", "(Lcom/apollographql/apollo/network/NetworkMonitor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/apollographql/apollo/network/NetworkMonitorKt")
/* loaded from: classes3.dex */
final /* synthetic */ class NetworkMonitorKt__NetworkMonitorKt {
    public static final java.lang.Object waitForNetwork(com.apollographql.apollo.network.NetworkMonitor networkMonitor, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.collect(kotlinx.coroutines.flow.FlowKt.takeWhile(networkMonitor.isOnline(), new com.apollographql.apollo.network.NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2(null)), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }
}

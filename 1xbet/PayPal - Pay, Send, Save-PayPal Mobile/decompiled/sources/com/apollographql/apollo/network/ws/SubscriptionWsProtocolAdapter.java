package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\b\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\b\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/apollographql/apollo/network/ws/SubscriptionWsProtocolAdapter;", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;)V", "", "connectionInit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "", "messageMap", "handleServerMessage", "(Ljava/util/Map;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "startOperation", "(Lcom/apollographql/apollo/api/ApolloRequest;)V", "stopOperation", "Lcom/apollographql/apollo/network/ws/SubscriptionWsProtocol;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/network/ws/SubscriptionWsProtocol;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class SubscriptionWsProtocolAdapter extends com.apollographql.apollo.network.ws.WsProtocol {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.ws.SubscriptionWsProtocol getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionWsProtocolAdapter(com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener) {
        super(webSocketConnection, listener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getHighSpeedVideoFpsRanges = new com.apollographql.apollo.network.ws.SubscriptionWsProtocol(webSocketConnection, listener, 0L, null, null, 28, null);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public void handleServerMessage(java.util.Map<java.lang.String, ? extends java.lang.Object> messageMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageMap, "");
        this.getHighSpeedVideoFpsRanges.handleServerMessage(messageMap);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public <D extends com.apollographql.apollo.api.Operation.Data> void startOperation(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.getHighSpeedVideoFpsRanges.startOperation(request);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public <D extends com.apollographql.apollo.api.Operation.Data> void stopOperation(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.getHighSpeedVideoFpsRanges.stopOperation(request);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public java.lang.Object connectionInit(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object connectionInit = this.getHighSpeedVideoFpsRanges.connectionInit(continuation);
        return connectionInit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? connectionInit : kotlin.Unit.INSTANCE;
    }
}

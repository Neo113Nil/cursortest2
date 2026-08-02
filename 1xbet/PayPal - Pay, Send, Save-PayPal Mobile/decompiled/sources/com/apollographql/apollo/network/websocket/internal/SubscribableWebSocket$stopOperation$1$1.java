package com.apollographql.apollo.network.websocket.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$stopOperation$1$1", f = "SubscribableWebSocket.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class SubscribableWebSocket$stopOperation$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.network.websocket.WebSocket webSocket;
        com.apollographql.apollo.network.websocket.WsProtocol wsProtocol;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        webSocket = this.Camera2StreamConfigurationMap.getOutputStallDuration;
        wsProtocol = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
        com.apollographql.apollo.network.websocket.internal.SubscribableWebSocketKt.access$send(webSocket, wsProtocol.operationStop(this.getHighSpeedVideoFpsRangesFor));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$stopOperation$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$stopOperation$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribableWebSocket$stopOperation$1$1(com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket subscribableWebSocket, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$stopOperation$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = subscribableWebSocket;
        this.getHighSpeedVideoFpsRangesFor = apolloRequest;
    }
}

package com.apollographql.apollo.network.websocket.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onOpen$1$1", f = "SubscribableWebSocket.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class SubscribableWebSocket$onOpen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.network.websocket.WebSocket webSocket;
        com.apollographql.apollo.network.websocket.WsProtocol wsProtocol;
        com.apollographql.apollo.network.websocket.WebSocket webSocket2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            webSocket = this.Camera2StreamConfigurationMap.getOutputStallDuration;
            wsProtocol = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = webSocket;
            this.getHighSpeedVideoFpsRanges = 1;
            java.lang.Object connectionInit = wsProtocol.connectionInit(this);
            if (connectionInit == coroutine_suspended) {
                return coroutine_suspended;
            }
            webSocket2 = webSocket;
            obj = connectionInit;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            webSocket2 = (com.apollographql.apollo.network.websocket.WebSocket) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.apollographql.apollo.network.websocket.internal.SubscribableWebSocketKt.access$send(webSocket2, (com.apollographql.apollo.network.websocket.ClientMessage) obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onOpen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onOpen$1$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribableWebSocket$onOpen$1$1(com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket subscribableWebSocket, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onOpen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = subscribableWebSocket;
    }
}

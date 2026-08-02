package com.apollographql.apollo.network.websocket.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$startOperation$1$1", f = "SubscribableWebSocket.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class SubscribableWebSocket$startOperation$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.network.websocket.WebSocket webSocket;
        com.apollographql.apollo.network.websocket.WsProtocol wsProtocol;
        com.apollographql.apollo.network.websocket.WebSocket webSocket2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            webSocket = this.getHighSpeedVideoSizes.getOutputStallDuration;
            wsProtocol = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = webSocket;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            java.lang.Object operationStart = wsProtocol.operationStart(this.getHighSpeedVideoFpsRangesFor, this);
            if (operationStart == coroutine_suspended) {
                return coroutine_suspended;
            }
            webSocket2 = webSocket;
            obj = operationStart;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            webSocket2 = (com.apollographql.apollo.network.websocket.WebSocket) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.apollographql.apollo.network.websocket.internal.SubscribableWebSocketKt.access$send(webSocket2, (com.apollographql.apollo.network.websocket.ClientMessage) obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$startOperation$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$startOperation$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribableWebSocket$startOperation$1$1(com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket subscribableWebSocket, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$startOperation$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = subscribableWebSocket;
        this.getHighSpeedVideoFpsRangesFor = apolloRequest;
    }
}

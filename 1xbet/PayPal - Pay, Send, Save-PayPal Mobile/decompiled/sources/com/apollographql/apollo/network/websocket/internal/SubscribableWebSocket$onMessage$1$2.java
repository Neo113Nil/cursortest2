package com.apollographql.apollo.network.websocket.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onMessage$1$2", f = "SubscribableWebSocket.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class SubscribableWebSocket$onMessage$1$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0056 -> B:5:0x0059). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        java.util.Iterator it;
        com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket subscribableWebSocket;
        com.apollographql.apollo.network.websocket.WsProtocol wsProtocol;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            list = this.Camera2StreamConfigurationMap.getOutputSizeshNQ4ISI;
            com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket subscribableWebSocket2 = this.Camera2StreamConfigurationMap;
            it = list.iterator();
            subscribableWebSocket = subscribableWebSocket2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.apollographql.apollo.network.websocket.WebSocket webSocket = (com.apollographql.apollo.network.websocket.WebSocket) this.getHighResolutionOutputSizeshNQ4ISI;
            it = (java.util.Iterator) this.getHighSpeedVideoFpsRangesFor;
            subscribableWebSocket = (com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            com.apollographql.apollo.network.websocket.internal.SubscribableWebSocketKt.access$send(webSocket, (com.apollographql.apollo.network.websocket.ClientMessage) obj);
            if (it.hasNext()) {
                com.apollographql.apollo.api.ApolloRequest apolloRequest = (com.apollographql.apollo.api.ApolloRequest) it.next();
                webSocket = subscribableWebSocket.getOutputStallDuration;
                wsProtocol = subscribableWebSocket.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRanges = subscribableWebSocket;
                this.getHighSpeedVideoFpsRangesFor = it;
                this.getHighResolutionOutputSizeshNQ4ISI = webSocket;
                this.getHighSpeedVideoSizes = 1;
                obj = wsProtocol.operationStart(apolloRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                com.apollographql.apollo.network.websocket.internal.SubscribableWebSocketKt.access$send(webSocket, (com.apollographql.apollo.network.websocket.ClientMessage) obj);
                if (it.hasNext()) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onMessage$1$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onMessage$1$2(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribableWebSocket$onMessage$1$2(com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket subscribableWebSocket, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onMessage$1$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = subscribableWebSocket;
    }
}

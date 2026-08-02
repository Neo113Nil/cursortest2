package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$3", f = "WebSocketNetworkTransport.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class WebSocketNetworkTransport$execute$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.network.ws.internal.Event>, com.apollographql.apollo.network.ws.internal.Event, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        boolean z = true;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
            com.apollographql.apollo.network.ws.internal.Event event = (com.apollographql.apollo.network.ws.internal.Event) this.getHighSpeedVideoFpsRanges;
            if (!(event instanceof com.apollographql.apollo.network.ws.internal.OperationComplete) && !(event instanceof com.apollographql.apollo.network.ws.internal.ConnectionReEstablished)) {
                if (event instanceof com.apollographql.apollo.network.ws.internal.NetworkError) {
                    this.getHighSpeedVideoSizes = null;
                    this.Camera2StreamConfigurationMap = 1;
                } else if (event instanceof com.apollographql.apollo.network.ws.internal.GeneralError) {
                    java.lang.String name2 = this.getHighResolutionOutputSizeshNQ4ISI.getOperation().name();
                    java.util.Map<java.lang.String, java.lang.Object> payload = ((com.apollographql.apollo.network.ws.internal.GeneralError) event).getPayload();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Received general error while executing operation ");
                    sb.append(name2);
                    sb.append(": ");
                    sb.append(payload);
                    java.lang.System.out.println((java.lang.Object) sb.toString());
                } else {
                    this.getHighSpeedVideoSizes = null;
                    this.Camera2StreamConfigurationMap = 2;
                }
                return coroutine_suspended;
            }
            z = false;
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            z = false;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.network.ws.internal.Event> flowCollector, com.apollographql.apollo.network.ws.internal.Event event, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$3 webSocketNetworkTransport$execute$3 = new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$3(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        webSocketNetworkTransport$execute$3.getHighSpeedVideoSizes = flowCollector;
        webSocketNetworkTransport$execute$3.getHighSpeedVideoFpsRanges = event;
        return webSocketNetworkTransport$execute$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketNetworkTransport$execute$3(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$3> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = apolloRequest;
    }
}

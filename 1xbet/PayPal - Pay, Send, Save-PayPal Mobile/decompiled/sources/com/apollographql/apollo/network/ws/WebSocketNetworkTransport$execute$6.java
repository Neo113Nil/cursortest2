package com.apollographql.apollo.network.ws;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$6", f = "WebSocketNetworkTransport.kt", i = {}, l = {com.visa.cbp.getCertUsage.setODAData}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class WebSocketNetworkTransport$execute$6<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.network.ws.WebSocketNetworkTransport getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            channel = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
            this.Camera2StreamConfigurationMap = 1;
            if (channel.send(new com.apollographql.apollo.network.ws.internal.StopOperation(this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$6(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketNetworkTransport$execute$6(com.apollographql.apollo.network.ws.WebSocketNetworkTransport webSocketNetworkTransport, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$6> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = webSocketNetworkTransport;
        this.getHighSpeedVideoFpsRangesFor = apolloRequest;
    }
}

package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$4", f = "WebSocketNetworkTransport.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class WebSocketNetworkTransport$supervise$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.network.ws.WsProtocol> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.network.ws.WebSocketNetworkTransport getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            j = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.apollographql.apollo.network.ws.WebSocketNetworkTransport.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$4) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$4(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketNetworkTransport$supervise$4(com.apollographql.apollo.network.ws.WebSocketNetworkTransport webSocketNetworkTransport, kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.network.ws.WsProtocol> objectRef, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef2, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef3, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$4> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = webSocketNetworkTransport;
        this.Camera2StreamConfigurationMap = objectRef;
        this.getHighSpeedVideoFpsRangesFor = objectRef2;
        this.getHighSpeedVideoSizes = objectRef3;
    }
}

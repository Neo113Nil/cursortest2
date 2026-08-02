package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$2", f = "GraphQLWsProtocol.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class GraphQLWsProtocol$connectionInit$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.network.ws.GraphQLWsProtocol getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = this.getHighSpeedVideoFpsRanges.receiveMessageMap(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Object obj2 = ((java.util.Map) obj).get("type");
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj2, "connection_ack")) {
            return kotlin.Unit.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj2, "ping")) {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap();
        } else {
            java.lang.System.out.println((java.lang.Object) "unknown graphql-ws message while waiting for connection_ack: '".concat(java.lang.String.valueOf(obj2)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$2(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLWsProtocol$connectionInit$2(com.apollographql.apollo.network.ws.GraphQLWsProtocol graphQLWsProtocol, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = graphQLWsProtocol;
    }
}

package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$create$connectionPayload$1", f = "GraphQLWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class GraphQLWsProtocol$Factory$create$connectionPayload$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> {
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> continuation) {
        return ((com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$create$connectionPayload$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$create$connectionPayload$1(continuation);
    }

    GraphQLWsProtocol$Factory$create$connectionPayload$1(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$create$connectionPayload$1> continuation) {
        super(1, continuation);
    }
}

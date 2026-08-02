package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$2", f = "AppSyncWsProtocol.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AppSyncWsProtocol$connectionInit$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.network.ws.AppSyncWsProtocol Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            obj = this.Camera2StreamConfigurationMap.receiveMessageMap(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.lang.Object obj2 = map.get("type");
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj2, "connection_ack")) {
            return kotlin.Unit.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj2, "connection_error")) {
            throw new com.apollographql.apollo.exception.ApolloNetworkException("Connection error:\n".concat(java.lang.String.valueOf(map)), null, 2, null);
        }
        java.lang.System.out.println((java.lang.Object) "unknown AppSync message while waiting for connection_ack: '".concat(java.lang.String.valueOf(obj2)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$2(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSyncWsProtocol$connectionInit$2(com.apollographql.apollo.network.ws.AppSyncWsProtocol appSyncWsProtocol, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = appSyncWsProtocol;
    }
}

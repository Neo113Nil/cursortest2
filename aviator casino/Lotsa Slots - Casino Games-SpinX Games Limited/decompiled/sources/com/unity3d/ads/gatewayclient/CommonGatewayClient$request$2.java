package com.unity3d.ads.gatewayclient;

/* compiled from: CommonGatewayClient.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", f = "CommonGatewayClient.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CommonGatewayClient$request$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse>, java.lang.Object> {
    final /* synthetic */ com.unity3d.ads.core.data.model.OperationType $operationType;
    final /* synthetic */ gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest $request;
    final /* synthetic */ com.unity3d.ads.gatewayclient.RequestPolicy $requestPolicy;
    final /* synthetic */ java.lang.String $url;
    int label;
    final /* synthetic */ com.unity3d.ads.gatewayclient.CommonGatewayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonGatewayClient$request$2(com.unity3d.ads.gatewayclient.CommonGatewayClient commonGatewayClient, java.lang.String str, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest, com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, com.unity3d.ads.core.data.model.OperationType operationType, kotlin.coroutines.Continuation<? super com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2> continuation) {
        super(2, continuation);
        this.this$0 = commonGatewayClient;
        this.$url = str;
        this.$request = universalRequest;
        this.$requestPolicy = requestPolicy;
        this.$operationType = operationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2(this.this$0, this.$url, this.$request, this.$requestPolicy, this.$operationType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> continuation) {
        return ((com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.executeWithRetry(this.$url, this.$request, this.$requestPolicy, this.$operationType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}

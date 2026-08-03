package com.unity3d.ads.gatewayclient;

/* compiled from: CommonGatewayClient.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {118, 119}, m = "executeRequest", n = {"this", "httpRequest", "operationType", "retryCount", "startTime", "this", "operationType", "retryCount", "startTime"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes5.dex */
final class CommonGatewayClient$executeRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.gatewayclient.CommonGatewayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonGatewayClient$executeRequest$1(com.unity3d.ads.gatewayclient.CommonGatewayClient commonGatewayClient, kotlin.coroutines.Continuation<? super com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1> continuation) {
        super(continuation);
        this.this$0 = commonGatewayClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object executeRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeRequest = this.this$0.executeRequest(null, 0, null, this);
        return executeRequest;
    }
}

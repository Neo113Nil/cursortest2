package com.unity3d.ads.core.domain;

/* compiled from: AndroidRefresh.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidRefresh$invoke$2", f = "AndroidRefresh.kt", i = {}, l = {26, 28}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidRefresh$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse>, java.lang.Object> {
    final /* synthetic */ com.google.protobuf.ByteString $adDataRefreshToken;
    final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidRefresh$invoke$2(com.unity3d.ads.core.domain.AndroidRefresh androidRefresh, com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidRefresh$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = androidRefresh;
        this.$adDataRefreshToken = byteString;
        this.$opportunityId = byteString2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.domain.AndroidRefresh$invoke$2(this.this$0, this.$adDataRefreshToken, this.$opportunityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse> continuation) {
        return ((com.unity3d.ads.core.domain.AndroidRefresh$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.domain.GetAdDataRefreshRequest getAdDataRefreshRequest;
        com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;
        com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getAdDataRefreshRequest = this.this$0.getAdDataRefreshRequest;
            this.label = 1;
            obj = getAdDataRefreshRequest.invoke(this.$adDataRefreshToken, this.$opportunityId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getAdDataRefreshResponse();
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj;
        getRequestPolicy = this.this$0.getRequestPolicy;
        com.unity3d.ads.gatewayclient.RequestPolicy invoke = getRequestPolicy.invoke();
        gatewayClient = this.this$0.gatewayClient;
        this.label = 2;
        obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke, com.unity3d.ads.core.data.model.OperationType.REFRESH, this, 1, null);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getAdDataRefreshResponse();
    }
}

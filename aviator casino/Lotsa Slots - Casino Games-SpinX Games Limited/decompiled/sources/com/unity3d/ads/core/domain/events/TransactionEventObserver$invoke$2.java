package com.unity3d.ads.core.domain.events;

/* compiled from: TransactionEventObserver.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "currentTransactionEventRequest", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", i = {1}, l = {35, 36, 44}, m = "invokeSuspend", n = {"fullRequest"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class TransactionEventObserver$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.events.TransactionEventObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionEventObserver$invoke$2(com.unity3d.ads.core.domain.events.TransactionEventObserver transactionEventObserver, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = transactionEventObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2 transactionEventObserver$invoke$2 = new com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2(this.this$0, continuation);
        transactionEventObserver$invoke$2.L$0 = obj;
        return transactionEventObserver$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2) create(transactionEventRequest, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008a A[Catch: UnityAdsNetworkException -> 0x00b4, TRY_LEAVE, TryCatch #0 {UnityAdsNetworkException -> 0x00b4, blocks: (B:7:0x0011, B:14:0x0022, B:15:0x0082, B:17:0x008a, B:20:0x0026, B:21:0x005b, B:25:0x0031), top: B:2:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest;
        com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
        com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;
        com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.L$0;
            gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
            gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
            gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
            _create.setTransactionEventRequest(transactionEventRequest);
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
            getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
            this.label = 1;
            obj = getUniversalRequestForPayLoad.invoke(_build, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                universalRequest = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getError() != null) {
                    byteStringDataSource = this.this$0.iapTransactionStore;
                    com.google.protobuf.ByteString byteString = universalRequest.getSharedData().getTimestamps().getTimestamp().toByteString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString, "fullRequest.sharedData.t….timestamp.toByteString()");
                    this.L$0 = null;
                    this.label = 3;
                    if (byteStringDataSource.set(byteString, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        universalRequest = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj;
        gatewayClient = this.this$0.gatewayClient;
        getRequestPolicy = this.this$0.getRequestPolicy;
        this.L$0 = universalRequest;
        this.label = 2;
        obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, getRequestPolicy.invoke(), com.unity3d.ads.core.data.model.OperationType.TRANSACTION_EVENT, this, 1, null);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getError() != null) {
        }
        return kotlin.Unit.INSTANCE;
    }
}

package com.unity3d.ads.core.domain.scar;

/* compiled from: HandleAndroidGetTokenRequest.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/HandleAndroidGetTokenRequest;", "Lcom/unity3d/ads/core/domain/scar/HandleGetTokenRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getHbTokenEventRequest", "Lcom/unity3d/ads/core/domain/scar/GetHbTokenEventRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/domain/scar/GetHbTokenEventRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;)V", "invoke", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "tokenId", "Lcom/google/protobuf/ByteString;", "biddingSignals", "Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;", "(Lcom/google/protobuf/ByteString;Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HandleAndroidGetTokenRequest implements com.unity3d.ads.core.domain.scar.HandleGetTokenRequest {
    private final com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
    private final com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest getHbTokenEventRequest;
    private final com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public HandleAndroidGetTokenRequest(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest getHbTokenEventRequest, com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy, com.unity3d.ads.gatewayclient.GatewayClient gatewayClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getHbTokenEventRequest, "getHbTokenEventRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getHbTokenEventRequest = getHbTokenEventRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d A[PHI: r12
      0x009d: PHI (r12v10 java.lang.Object) = (r12v9 java.lang.Object), (r12v1 java.lang.Object) binds: [B:18:0x009a, B:11:0x002d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.unity3d.ads.core.domain.scar.HandleGetTokenRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(com.google.protobuf.ByteString byteString, com.unity3d.services.ads.gmascar.models.BiddingSignals biddingSignals, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> continuation) {
        com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1 handleAndroidGetTokenRequest$invoke$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest handleAndroidGetTokenRequest;
        if (continuation instanceof com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1) {
            handleAndroidGetTokenRequest$invoke$1 = (com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1) continuation;
            if ((handleAndroidGetTokenRequest$invoke$1.label & Integer.MIN_VALUE) != 0) {
                handleAndroidGetTokenRequest$invoke$1.label -= Integer.MIN_VALUE;
                com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1 handleAndroidGetTokenRequest$invoke$12 = handleAndroidGetTokenRequest$invoke$1;
                obj = handleAndroidGetTokenRequest$invoke$12.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = handleAndroidGetTokenRequest$invoke$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest getHbTokenEventRequest = this.getHbTokenEventRequest;
                    handleAndroidGetTokenRequest$invoke$12.L$0 = this;
                    handleAndroidGetTokenRequest$invoke$12.label = 1;
                    obj = getHbTokenEventRequest.invoke(byteString, biddingSignals, handleAndroidGetTokenRequest$invoke$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    handleAndroidGetTokenRequest = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.ResultKt.throwOnFailure(obj);
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        handleAndroidGetTokenRequest = (com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest) handleAndroidGetTokenRequest$invoke$12.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.unity3d.ads.gatewayclient.RequestPolicy invoke = handleAndroidGetTokenRequest.getRequestPolicy.invoke();
                        com.unity3d.ads.gatewayclient.GatewayClient gatewayClient = handleAndroidGetTokenRequest.gatewayClient;
                        com.unity3d.ads.core.data.model.OperationType operationType = com.unity3d.ads.core.data.model.OperationType.GET_TOKEN;
                        handleAndroidGetTokenRequest$invoke$12.L$0 = null;
                        handleAndroidGetTokenRequest$invoke$12.label = 3;
                        obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj, invoke, operationType, handleAndroidGetTokenRequest$invoke$12, 1, null);
                        return obj == coroutine_suspended ? coroutine_suspended : obj;
                    }
                    handleAndroidGetTokenRequest = (com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest) handleAndroidGetTokenRequest$invoke$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
                _create.setGetTokenEventRequest((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) obj);
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = handleAndroidGetTokenRequest.getUniversalRequestForPayLoad;
                handleAndroidGetTokenRequest$invoke$12.L$0 = handleAndroidGetTokenRequest;
                handleAndroidGetTokenRequest$invoke$12.label = 2;
                obj = getUniversalRequestForPayLoad.invoke(_build, handleAndroidGetTokenRequest$invoke$12);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                com.unity3d.ads.gatewayclient.RequestPolicy invoke2 = handleAndroidGetTokenRequest.getRequestPolicy.invoke();
                com.unity3d.ads.gatewayclient.GatewayClient gatewayClient2 = handleAndroidGetTokenRequest.gatewayClient;
                com.unity3d.ads.core.data.model.OperationType operationType2 = com.unity3d.ads.core.data.model.OperationType.GET_TOKEN;
                handleAndroidGetTokenRequest$invoke$12.L$0 = null;
                handleAndroidGetTokenRequest$invoke$12.label = 3;
                obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient2, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj, invoke2, operationType2, handleAndroidGetTokenRequest$invoke$12, 1, null);
                if (obj == coroutine_suspended) {
                }
            }
        }
        handleAndroidGetTokenRequest$invoke$1 = new com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1(this, continuation);
        com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1 handleAndroidGetTokenRequest$invoke$122 = handleAndroidGetTokenRequest$invoke$1;
        obj = handleAndroidGetTokenRequest$invoke$122.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = handleAndroidGetTokenRequest$invoke$122.label;
        if (i != 0) {
        }
        gatewayprotocol.v1.UniversalRequestKt universalRequestKt2 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setGetTokenEventRequest((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) obj);
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
        com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = handleAndroidGetTokenRequest.getUniversalRequestForPayLoad;
        handleAndroidGetTokenRequest$invoke$122.L$0 = handleAndroidGetTokenRequest;
        handleAndroidGetTokenRequest$invoke$122.label = 2;
        obj = getUniversalRequestForPayLoad2.invoke(_build2, handleAndroidGetTokenRequest$invoke$122);
        if (obj == coroutine_suspended) {
        }
        com.unity3d.ads.gatewayclient.RequestPolicy invoke22 = handleAndroidGetTokenRequest.getRequestPolicy.invoke();
        com.unity3d.ads.gatewayclient.GatewayClient gatewayClient22 = handleAndroidGetTokenRequest.gatewayClient;
        com.unity3d.ads.core.data.model.OperationType operationType22 = com.unity3d.ads.core.data.model.OperationType.GET_TOKEN;
        handleAndroidGetTokenRequest$invoke$122.L$0 = null;
        handleAndroidGetTokenRequest$invoke$122.label = 3;
        obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient22, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj, invoke22, operationType22, handleAndroidGetTokenRequest$invoke$122, 1, null);
        if (obj == coroutine_suspended) {
        }
    }
}

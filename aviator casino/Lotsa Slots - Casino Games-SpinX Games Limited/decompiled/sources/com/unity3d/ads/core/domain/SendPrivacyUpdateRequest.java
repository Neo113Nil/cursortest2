package com.unity3d.ads.core.domain;

/* compiled from: SendPrivacyUpdateRequest.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/SendPrivacyUpdateRequest;", "", "getPrivacyUpdateRequest", "Lcom/unity3d/ads/core/domain/GetPrivacyUpdateRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "(Lcom/unity3d/ads/core/domain/GetPrivacyUpdateRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;)V", "invoke", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "privacyUpdateVersion", "", "privacyUpdateContent", "Lcom/google/protobuf/ByteString;", "(ILcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SendPrivacyUpdateRequest {
    private final com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
    private final com.unity3d.ads.core.domain.GetPrivacyUpdateRequest getPrivacyUpdateRequest;
    private final com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;

    public SendPrivacyUpdateRequest(com.unity3d.ads.core.domain.GetPrivacyUpdateRequest getPrivacyUpdateRequest, com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy, com.unity3d.ads.gatewayclient.GatewayClient gatewayClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPrivacyUpdateRequest, "getPrivacyUpdateRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        this.getPrivacyUpdateRequest = getPrivacyUpdateRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(int i, com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse> continuation) {
        com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1 sendPrivacyUpdateRequest$invoke$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i2;
        com.unity3d.ads.core.domain.SendPrivacyUpdateRequest sendPrivacyUpdateRequest;
        if (continuation instanceof com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1) {
            sendPrivacyUpdateRequest$invoke$1 = (com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1) continuation;
            if ((sendPrivacyUpdateRequest$invoke$1.label & Integer.MIN_VALUE) != 0) {
                sendPrivacyUpdateRequest$invoke$1.label -= Integer.MIN_VALUE;
                com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1 sendPrivacyUpdateRequest$invoke$12 = sendPrivacyUpdateRequest$invoke$1;
                obj = sendPrivacyUpdateRequest$invoke$12.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = sendPrivacyUpdateRequest$invoke$12.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.domain.GetPrivacyUpdateRequest getPrivacyUpdateRequest = this.getPrivacyUpdateRequest;
                    sendPrivacyUpdateRequest$invoke$12.L$0 = this;
                    sendPrivacyUpdateRequest$invoke$12.label = 1;
                    obj = getPrivacyUpdateRequest.invoke(i, byteString, sendPrivacyUpdateRequest$invoke$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sendPrivacyUpdateRequest = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getPrivacyUpdateResponse();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacyUpdateResponse, "response.payload.privacyUpdateResponse");
                        return privacyUpdateResponse;
                    }
                    sendPrivacyUpdateRequest = (com.unity3d.ads.core.domain.SendPrivacyUpdateRequest) sendPrivacyUpdateRequest$invoke$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.unity3d.ads.gatewayclient.RequestPolicy invoke = sendPrivacyUpdateRequest.getRequestPolicy.invoke();
                com.unity3d.ads.gatewayclient.GatewayClient gatewayClient = sendPrivacyUpdateRequest.gatewayClient;
                com.unity3d.ads.core.data.model.OperationType operationType = com.unity3d.ads.core.data.model.OperationType.PRIVACY_UPDATE;
                sendPrivacyUpdateRequest$invoke$12.L$0 = null;
                sendPrivacyUpdateRequest$invoke$12.label = 2;
                obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj, invoke, operationType, sendPrivacyUpdateRequest$invoke$12, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse2 = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getPrivacyUpdateResponse();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacyUpdateResponse2, "response.payload.privacyUpdateResponse");
                return privacyUpdateResponse2;
            }
        }
        sendPrivacyUpdateRequest$invoke$1 = new com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1(this, continuation);
        com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1 sendPrivacyUpdateRequest$invoke$122 = sendPrivacyUpdateRequest$invoke$1;
        obj = sendPrivacyUpdateRequest$invoke$122.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = sendPrivacyUpdateRequest$invoke$122.label;
        if (i2 != 0) {
        }
        com.unity3d.ads.gatewayclient.RequestPolicy invoke2 = sendPrivacyUpdateRequest.getRequestPolicy.invoke();
        com.unity3d.ads.gatewayclient.GatewayClient gatewayClient2 = sendPrivacyUpdateRequest.gatewayClient;
        com.unity3d.ads.core.data.model.OperationType operationType2 = com.unity3d.ads.core.data.model.OperationType.PRIVACY_UPDATE;
        sendPrivacyUpdateRequest$invoke$122.L$0 = null;
        sendPrivacyUpdateRequest$invoke$122.label = 2;
        obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient2, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj, invoke2, operationType2, sendPrivacyUpdateRequest$invoke$122, 1, null);
        if (obj == coroutine_suspended) {
        }
        gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse22 = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getPrivacyUpdateResponse();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacyUpdateResponse22, "response.payload.privacyUpdateResponse");
        return privacyUpdateResponse22;
    }
}

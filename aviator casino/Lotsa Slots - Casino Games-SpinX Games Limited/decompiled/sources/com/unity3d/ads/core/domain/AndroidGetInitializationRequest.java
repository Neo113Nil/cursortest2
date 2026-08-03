package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetInitializationRequest.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationRequest;", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "getInitializationRequestPayload", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "(Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetInitializationRequest implements com.unity3d.ads.core.domain.GetInitializationRequest {
    private final com.unity3d.ads.core.domain.GetInitializationRequestPayload getInitializationRequestPayload;
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public AndroidGetInitializationRequest(com.unity3d.ads.core.domain.GetInitializationRequestPayload getInitializationRequestPayload, com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializationRequestPayload, "getInitializationRequestPayload");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        this.getInitializationRequestPayload = getInitializationRequestPayload;
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0076 A[PHI: r8
      0x0076: PHI (r8v8 java.lang.Object) = (r8v7 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0073, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> continuation) {
        com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1 androidGetInitializationRequest$invoke$1;
        int i;
        com.unity3d.ads.core.domain.AndroidGetInitializationRequest androidGetInitializationRequest;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1) {
            androidGetInitializationRequest$invoke$1 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1) continuation;
            if ((androidGetInitializationRequest$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetInitializationRequest$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidGetInitializationRequest$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetInitializationRequest$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.domain.GetInitializationRequestPayload getInitializationRequestPayload = this.getInitializationRequestPayload;
                    androidGetInitializationRequest$invoke$1.L$0 = this;
                    androidGetInitializationRequest$invoke$1.label = 1;
                    obj = getInitializationRequestPayload.invoke(androidGetInitializationRequest$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidGetInitializationRequest = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidGetInitializationRequest = (com.unity3d.ads.core.domain.AndroidGetInitializationRequest) androidGetInitializationRequest$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
                _create.setInitializationRequest((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) obj);
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetInitializationRequest.getUniversalRequestForPayLoad;
                androidGetInitializationRequest$invoke$1.L$0 = null;
                androidGetInitializationRequest$invoke$1.label = 2;
                obj = getUniversalRequestForPayLoad.invoke(_build, androidGetInitializationRequest$invoke$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        androidGetInitializationRequest$invoke$1 = new com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1(this, continuation);
        java.lang.Object obj2 = androidGetInitializationRequest$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetInitializationRequest$invoke$1.label;
        if (i != 0) {
        }
        gatewayprotocol.v1.UniversalRequestKt universalRequestKt2 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setInitializationRequest((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) obj2);
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
        com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = androidGetInitializationRequest.getUniversalRequestForPayLoad;
        androidGetInitializationRequest$invoke$1.L$0 = null;
        androidGetInitializationRequest$invoke$1.label = 2;
        obj2 = getUniversalRequestForPayLoad2.invoke(_build2, androidGetInitializationRequest$invoke$1);
        if (obj2 != coroutine_suspended2) {
        }
    }
}

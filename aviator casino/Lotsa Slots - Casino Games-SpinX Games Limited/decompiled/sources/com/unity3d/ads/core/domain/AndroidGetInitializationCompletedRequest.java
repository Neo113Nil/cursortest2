package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetInitializationCompletedRequest.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetInitializationCompletedRequest implements com.unity3d.ads.core.domain.GetInitializationCompletedRequest {
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public AndroidGetInitializationCompletedRequest(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ae A[PHI: r9
      0x00ae: PHI (r9v12 java.lang.Object) = (r9v11 java.lang.Object), (r9v1 java.lang.Object) binds: [B:17:0x00ab, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.unity3d.ads.core.domain.GetInitializationCompletedRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> continuation) {
        com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1 androidGetInitializationCompletedRequest$invoke$1;
        int i;
        gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl _create;
        com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest androidGetInitializationCompletedRequest;
        gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl dsl;
        gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl dsl2;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1) {
            androidGetInitializationCompletedRequest$invoke$1 = (com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1) continuation;
            if ((androidGetInitializationCompletedRequest$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetInitializationCompletedRequest$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidGetInitializationCompletedRequest$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetInitializationCompletedRequest$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.Companion companion = gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder newBuilder = gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                    _create = companion._create(newBuilder);
                    com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetInitializationCompletedRequest$invoke$1.L$0 = this;
                    androidGetInitializationCompletedRequest$invoke$1.L$1 = _create;
                    androidGetInitializationCompletedRequest$invoke$1.L$2 = _create;
                    androidGetInitializationCompletedRequest$invoke$1.L$3 = _create;
                    androidGetInitializationCompletedRequest$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetInitializationCompletedRequest$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidGetInitializationCompletedRequest = this;
                    dsl = _create;
                    dsl2 = dsl;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    _create = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) androidGetInitializationCompletedRequest$invoke$1.L$3;
                    dsl = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) androidGetInitializationCompletedRequest$invoke$1.L$2;
                    dsl2 = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) androidGetInitializationCompletedRequest$invoke$1.L$1;
                    androidGetInitializationCompletedRequest = (com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest) androidGetInitializationCompletedRequest$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                _create.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl.setDynamicDeviceInfo(androidGetInitializationCompletedRequest.deviceInfoRepository.getDynamicDeviceInfo());
                gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest _build = dsl2._build();
                gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder()");
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
                _create2.setInitializationCompletedEventRequest(_build);
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetInitializationCompletedRequest.getUniversalRequestForPayLoad;
                androidGetInitializationCompletedRequest$invoke$1.L$0 = null;
                androidGetInitializationCompletedRequest$invoke$1.L$1 = null;
                androidGetInitializationCompletedRequest$invoke$1.L$2 = null;
                androidGetInitializationCompletedRequest$invoke$1.L$3 = null;
                androidGetInitializationCompletedRequest$invoke$1.label = 2;
                obj = getUniversalRequestForPayLoad.invoke(_build2, androidGetInitializationCompletedRequest$invoke$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        androidGetInitializationCompletedRequest$invoke$1 = new com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1(this, continuation);
        java.lang.Object obj2 = androidGetInitializationCompletedRequest$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetInitializationCompletedRequest$invoke$1.label;
        if (i != 0) {
        }
        _create.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2);
        dsl.setDynamicDeviceInfo(androidGetInitializationCompletedRequest.deviceInfoRepository.getDynamicDeviceInfo());
        gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest _build3 = dsl2._build();
        gatewayprotocol.v1.UniversalRequestKt universalRequestKt2 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion22 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder22 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder22, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create22 = companion22._create(newBuilder22);
        _create22.setInitializationCompletedEventRequest(_build3);
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload _build22 = _create22._build();
        com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = androidGetInitializationCompletedRequest.getUniversalRequestForPayLoad;
        androidGetInitializationCompletedRequest$invoke$1.L$0 = null;
        androidGetInitializationCompletedRequest$invoke$1.L$1 = null;
        androidGetInitializationCompletedRequest$invoke$1.L$2 = null;
        androidGetInitializationCompletedRequest$invoke$1.L$3 = null;
        androidGetInitializationCompletedRequest$invoke$1.label = 2;
        obj2 = getUniversalRequestForPayLoad2.invoke(_build22, androidGetInitializationCompletedRequest$invoke$1);
        if (obj2 != coroutine_suspended2) {
        }
    }
}

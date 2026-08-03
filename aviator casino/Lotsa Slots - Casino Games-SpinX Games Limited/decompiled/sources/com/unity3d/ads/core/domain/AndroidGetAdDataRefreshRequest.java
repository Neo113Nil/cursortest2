package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetAdDataRefreshRequest.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdDataRefreshRequest;", "Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "opportunityId", "Lcom/google/protobuf/ByteString;", "refreshToken", "(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetAdDataRefreshRequest implements com.unity3d.ads.core.domain.GetAdDataRefreshRequest {
    private final com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidGetAdDataRefreshRequest(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e0 A[PHI: r11
      0x00e0: PHI (r11v10 java.lang.Object) = (r11v9 java.lang.Object), (r11v1 java.lang.Object) binds: [B:20:0x00dd, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.unity3d.ads.core.domain.GetAdDataRefreshRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> continuation) {
        com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest$invoke$1 androidGetAdDataRefreshRequest$invoke$1;
        int i;
        com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest androidGetAdDataRefreshRequest;
        com.google.protobuf.ByteString byteString3;
        com.google.protobuf.ByteString byteString4;
        gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl dsl;
        gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl dsl2;
        gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl dsl3;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest$invoke$1) {
            androidGetAdDataRefreshRequest$invoke$1 = (com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest$invoke$1) continuation;
            if ((androidGetAdDataRefreshRequest$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetAdDataRefreshRequest$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidGetAdDataRefreshRequest$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetAdDataRefreshRequest$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl.Companion companion = gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder newBuilder = gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                    gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl _create = companion._create(newBuilder);
                    _create.setSessionCounters(this.sessionRepository.getSessionCounters());
                    com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetAdDataRefreshRequest$invoke$1.L$0 = this;
                    androidGetAdDataRefreshRequest$invoke$1.L$1 = byteString;
                    androidGetAdDataRefreshRequest$invoke$1.L$2 = byteString2;
                    androidGetAdDataRefreshRequest$invoke$1.L$3 = _create;
                    androidGetAdDataRefreshRequest$invoke$1.L$4 = _create;
                    androidGetAdDataRefreshRequest$invoke$1.L$5 = _create;
                    androidGetAdDataRefreshRequest$invoke$1.label = 1;
                    java.lang.Object staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(androidGetAdDataRefreshRequest$invoke$1);
                    if (staticDeviceInfo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidGetAdDataRefreshRequest = this;
                    byteString3 = byteString;
                    byteString4 = byteString2;
                    dsl = _create;
                    dsl2 = dsl;
                    obj = staticDeviceInfo;
                    dsl3 = dsl2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl = (gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl) androidGetAdDataRefreshRequest$invoke$1.L$5;
                    dsl2 = (gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl) androidGetAdDataRefreshRequest$invoke$1.L$4;
                    dsl3 = (gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl) androidGetAdDataRefreshRequest$invoke$1.L$3;
                    byteString4 = (com.google.protobuf.ByteString) androidGetAdDataRefreshRequest$invoke$1.L$2;
                    byteString3 = (com.google.protobuf.ByteString) androidGetAdDataRefreshRequest$invoke$1.L$1;
                    androidGetAdDataRefreshRequest = (com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest) androidGetAdDataRefreshRequest$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                dsl.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl2.setDynamicDeviceInfo(androidGetAdDataRefreshRequest.deviceInfoRepository.getDynamicDeviceInfo());
                dsl2.setImpressionOpportunityId(byteString3);
                dsl2.setCampaignState(androidGetAdDataRefreshRequest.campaignRepository.getCampaignState());
                if (!byteString4.isEmpty()) {
                    dsl2.setAdDataRefreshToken(byteString4);
                }
                gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest _build = dsl3._build();
                gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder()");
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
                _create2.setAdDataRefreshRequest(_build);
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetAdDataRefreshRequest.getUniversalRequestForPayLoad;
                androidGetAdDataRefreshRequest$invoke$1.L$0 = null;
                androidGetAdDataRefreshRequest$invoke$1.L$1 = null;
                androidGetAdDataRefreshRequest$invoke$1.L$2 = null;
                androidGetAdDataRefreshRequest$invoke$1.L$3 = null;
                androidGetAdDataRefreshRequest$invoke$1.L$4 = null;
                androidGetAdDataRefreshRequest$invoke$1.L$5 = null;
                androidGetAdDataRefreshRequest$invoke$1.label = 2;
                obj = getUniversalRequestForPayLoad.invoke(_build2, androidGetAdDataRefreshRequest$invoke$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        androidGetAdDataRefreshRequest$invoke$1 = new com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest$invoke$1(this, continuation);
        java.lang.Object obj2 = androidGetAdDataRefreshRequest$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetAdDataRefreshRequest$invoke$1.label;
        if (i != 0) {
        }
        dsl.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2);
        dsl2.setDynamicDeviceInfo(androidGetAdDataRefreshRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setImpressionOpportunityId(byteString3);
        dsl2.setCampaignState(androidGetAdDataRefreshRequest.campaignRepository.getCampaignState());
        if (!byteString4.isEmpty()) {
        }
        gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest _build3 = dsl3._build();
        gatewayprotocol.v1.UniversalRequestKt universalRequestKt2 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion22 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder22 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder22, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create22 = companion22._create(newBuilder22);
        _create22.setAdDataRefreshRequest(_build3);
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload _build22 = _create22._build();
        com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = androidGetAdDataRefreshRequest.getUniversalRequestForPayLoad;
        androidGetAdDataRefreshRequest$invoke$1.L$0 = null;
        androidGetAdDataRefreshRequest$invoke$1.L$1 = null;
        androidGetAdDataRefreshRequest$invoke$1.L$2 = null;
        androidGetAdDataRefreshRequest$invoke$1.L$3 = null;
        androidGetAdDataRefreshRequest$invoke$1.L$4 = null;
        androidGetAdDataRefreshRequest$invoke$1.L$5 = null;
        androidGetAdDataRefreshRequest$invoke$1.label = 2;
        obj2 = getUniversalRequestForPayLoad2.invoke(_build22, androidGetAdDataRefreshRequest$invoke$1);
        if (obj2 != coroutine_suspended2) {
        }
    }
}

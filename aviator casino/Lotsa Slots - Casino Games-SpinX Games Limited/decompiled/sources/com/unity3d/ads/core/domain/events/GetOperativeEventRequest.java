package com.unity3d.ads.core.domain.events;

/* compiled from: GetOperativeEventRequest.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJE\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/events/GetOperativeEventRequest;", "", "generateByteStringId", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "(Lcom/unity3d/ads/core/domain/GetByteStringId;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;)V", "invoke", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEventType", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;", "loadTrackingToken", "Lcom/google/protobuf/ByteString;", "opportunityId", "additionalEventData", "playerServerId", "", "adFormat", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetOperativeEventRequest {
    private final com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetByteStringId generateByteStringId;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public GetOperativeEventRequest(com.unity3d.ads.core.domain.GetByteStringId generateByteStringId, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateByteStringId, "generateByteStringId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        this.generateByteStringId = generateByteStringId;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType, com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2, com.google.protobuf.ByteString byteString3, java.lang.String str, gatewayprotocol.v1.AdFormatOuterClass.AdFormat adFormat, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest> continuation) {
        com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1 getOperativeEventRequest$invoke$1;
        int i;
        com.unity3d.ads.core.domain.events.GetOperativeEventRequest getOperativeEventRequest;
        gatewayprotocol.v1.OperativeEventRequestKt.Dsl dsl;
        gatewayprotocol.v1.OperativeEventRequestKt.Dsl dsl2;
        gatewayprotocol.v1.OperativeEventRequestKt.Dsl dsl3;
        if (continuation instanceof com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1) {
            getOperativeEventRequest$invoke$1 = (com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1) continuation;
            if ((getOperativeEventRequest$invoke$1.label & Integer.MIN_VALUE) != 0) {
                getOperativeEventRequest$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = getOperativeEventRequest$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getOperativeEventRequest$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    gatewayprotocol.v1.OperativeEventRequestKt.Dsl.Companion companion = gatewayprotocol.v1.OperativeEventRequestKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder newBuilder = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                    gatewayprotocol.v1.OperativeEventRequestKt.Dsl _create = companion._create(newBuilder);
                    _create.setEventId(this.generateByteStringId.invoke());
                    _create.setEventType(operativeEventType);
                    _create.setImpressionOpportunityId(byteString2);
                    _create.setTrackingToken(byteString);
                    _create.setAdditionalData(byteString3);
                    if (str != null) {
                        _create.setSid(str);
                    }
                    _create.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                    com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    getOperativeEventRequest$invoke$1.L$0 = this;
                    getOperativeEventRequest$invoke$1.L$1 = adFormat;
                    getOperativeEventRequest$invoke$1.L$2 = _create;
                    getOperativeEventRequest$invoke$1.L$3 = _create;
                    getOperativeEventRequest$invoke$1.L$4 = _create;
                    getOperativeEventRequest$invoke$1.label = 1;
                    java.lang.Object staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(getOperativeEventRequest$invoke$1);
                    if (staticDeviceInfo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getOperativeEventRequest = this;
                    dsl = _create;
                    dsl2 = dsl;
                    obj = staticDeviceInfo;
                    dsl3 = dsl2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl3 = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) getOperativeEventRequest$invoke$1.L$4;
                    dsl = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) getOperativeEventRequest$invoke$1.L$3;
                    dsl2 = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) getOperativeEventRequest$invoke$1.L$2;
                    adFormat = (gatewayprotocol.v1.AdFormatOuterClass.AdFormat) getOperativeEventRequest$invoke$1.L$1;
                    getOperativeEventRequest = (com.unity3d.ads.core.domain.events.GetOperativeEventRequest) getOperativeEventRequest$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                dsl3.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl.setSessionCounters(getOperativeEventRequest.sessionRepository.getSessionCounters());
                dsl.setCampaignState(getOperativeEventRequest.campaignRepository.getCampaignState());
                if (adFormat != null) {
                    dsl.setAdFormat(adFormat);
                }
                return dsl2._build();
            }
        }
        getOperativeEventRequest$invoke$1 = new com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1(this, continuation);
        java.lang.Object obj2 = getOperativeEventRequest$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getOperativeEventRequest$invoke$1.label;
        if (i != 0) {
        }
        dsl3.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2);
        dsl.setSessionCounters(getOperativeEventRequest.sessionRepository.getSessionCounters());
        dsl.setCampaignState(getOperativeEventRequest.campaignRepository.getCampaignState());
        if (adFormat != null) {
        }
        return dsl2._build();
    }
}

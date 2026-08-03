package com.unity3d.ads.core.domain.events;

/* compiled from: GetOperativeEventApi.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JI\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0013J)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\fH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "", "operativeEventRepository", "Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "operativeEventRequest", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventRequest;", "(Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;Lcom/unity3d/ads/core/domain/events/GetOperativeEventRequest;)V", "invoke", "", "operativeEventType", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;", "opportunityId", "Lcom/google/protobuf/ByteString;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "additionalEventData", "playerServerId", "", "adFormat", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;Lcom/unity3d/ads/core/data/model/AdObject;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetOperativeEventApi {
    private final com.unity3d.ads.core.data.repository.OperativeEventRepository operativeEventRepository;
    private final com.unity3d.ads.core.domain.events.GetOperativeEventRequest operativeEventRequest;

    public GetOperativeEventApi(com.unity3d.ads.core.data.repository.OperativeEventRepository operativeEventRepository, com.unity3d.ads.core.domain.events.GetOperativeEventRequest operativeEventRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventRepository, "operativeEventRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventRequest, "operativeEventRequest");
        this.operativeEventRepository = operativeEventRepository;
        this.operativeEventRequest = operativeEventRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType, com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2, com.google.protobuf.ByteString byteString3, java.lang.String str, gatewayprotocol.v1.AdFormatOuterClass.AdFormat adFormat, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 getOperativeEventApi$invoke$1;
        int i;
        com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi;
        if (continuation instanceof com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1) {
            getOperativeEventApi$invoke$1 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1) continuation;
            if ((getOperativeEventApi$invoke$1.label & Integer.MIN_VALUE) != 0) {
                getOperativeEventApi$invoke$1.label -= Integer.MIN_VALUE;
                com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 getOperativeEventApi$invoke$12 = getOperativeEventApi$invoke$1;
                java.lang.Object obj = getOperativeEventApi$invoke$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getOperativeEventApi$invoke$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.domain.events.GetOperativeEventRequest getOperativeEventRequest = this.operativeEventRequest;
                    getOperativeEventApi$invoke$12.L$0 = this;
                    getOperativeEventApi$invoke$12.label = 1;
                    obj = getOperativeEventRequest.invoke(operativeEventType, byteString2, byteString, byteString3, str, adFormat, getOperativeEventApi$invoke$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getOperativeEventApi = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getOperativeEventApi = (com.unity3d.ads.core.domain.events.GetOperativeEventApi) getOperativeEventApi$invoke$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                getOperativeEventApi.operativeEventRepository.addOperativeEvent((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) obj);
                return kotlin.Unit.INSTANCE;
            }
        }
        getOperativeEventApi$invoke$1 = new com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1(this, continuation);
        com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 getOperativeEventApi$invoke$122 = getOperativeEventApi$invoke$1;
        java.lang.Object obj2 = getOperativeEventApi$invoke$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getOperativeEventApi$invoke$122.label;
        if (i != 0) {
        }
        getOperativeEventApi.operativeEventRepository.addOperativeEvent((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) obj2);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType, com.unity3d.ads.core.data.model.AdObject adObject, com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object invoke = invoke(operativeEventType, adObject.getOpportunityId(), adObject.getTrackingToken(), byteString, adObject.getPlayerServerId(), (adObject.getAdType() == gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER ? this : null) != null ? gatewayprotocol.v1.AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER : null, continuation);
        return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
    }
}

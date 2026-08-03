package com.unity3d.ads.core.domain.events;

/* compiled from: GetDiagnosticEventRequest.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J~\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0086\u0002¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "", "getSharedDataTimestamps", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "(Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;)V", "uniqueId", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "invoke", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", com.ironsource.X3.i.j0, "", "tags", "", "intTags", "value", "", "hb", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "placement", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "tokenNumber", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Ljava/lang/Integer;)Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetDiagnosticEventRequest {
    private final com.unity3d.ads.core.domain.GetSharedDataTimestamps getSharedDataTimestamps;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> uniqueId;

    public GetDiagnosticEventRequest(com.unity3d.ads.core.domain.GetSharedDataTimestamps getSharedDataTimestamps) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.uniqueId = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(-1);
    }

    public final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(java.lang.String eventName, java.util.Map<java.lang.String, java.lang.String> tags, java.util.Map<java.lang.String, java.lang.Integer> intTags, java.lang.Double value, java.lang.Boolean hb, com.google.protobuf.ByteString opportunityId, java.lang.String placement, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType adType, java.lang.Integer tokenNumber) {
        java.lang.Integer value2;
        java.lang.Integer valueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
        gatewayprotocol.v1.DiagnosticEventKt.Dsl.Companion companion = gatewayprotocol.v1.DiagnosticEventKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder newBuilder = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        gatewayprotocol.v1.DiagnosticEventKt.Dsl _create = companion._create(newBuilder);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> mutableStateFlow = this.uniqueId;
        do {
            value2 = mutableStateFlow.getValue();
            valueOf = java.lang.Integer.valueOf(value2.intValue() + 1);
        } while (!mutableStateFlow.compareAndSet(value2, valueOf));
        _create.setEventId(valueOf.intValue());
        _create.setEventType(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM);
        _create.setTimestamps(this.getSharedDataTimestamps.invoke());
        _create.setCustomEventType(eventName);
        if (tags != null) {
            _create.putAllStringTags(_create.getStringTagsMap(), tags);
        }
        if (intTags != null) {
            _create.putAllIntTags(_create.getIntTagsMap(), intTags);
        }
        if (value != null) {
            _create.setTimeValue(value.doubleValue());
        }
        if (hb != null) {
            _create.setIsHeaderBidding(hb.booleanValue());
        }
        if (opportunityId != null) {
            _create.setImpressionOpportunityId(opportunityId);
        }
        if (placement != null) {
            _create.setPlacementId(placement);
        }
        if (adType != null) {
            _create.setAdType(adType);
        }
        if (tokenNumber != null) {
            _create.setHeaderBiddingTokenNumber(tokenNumber.intValue());
        }
        return _create._build();
    }
}

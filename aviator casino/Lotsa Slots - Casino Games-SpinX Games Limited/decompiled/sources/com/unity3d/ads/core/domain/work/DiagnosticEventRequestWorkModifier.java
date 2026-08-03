package com.unity3d.ads.core.domain.work;

/* compiled from: DiagnosticEventRequestWorkModifier.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "universalRequest", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiagnosticEventRequestWorkModifier {
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public DiagnosticEventRequestWorkModifier(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    public final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest invoke(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequest, "universalRequest");
        gatewayprotocol.v1.UniversalRequestKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder builder = universalRequest.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.Dsl _create = companion._create(builder);
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload = _create.getPayload();
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder2 = payload.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder2, "this.toBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(builder2);
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = _create2.getDiagnosticEventRequest();
        gatewayprotocol.v1.DiagnosticEventRequestKt.Dsl.Companion companion3 = gatewayprotocol.v1.DiagnosticEventRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder3 = diagnosticEventRequest.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder3, "this.toBuilder()");
        gatewayprotocol.v1.DiagnosticEventRequestKt.Dsl _create3 = companion3._create(builder3);
        com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> batch = _create3.getBatch();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(batch, 10));
        for (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent : batch) {
            gatewayprotocol.v1.DiagnosticEventKt.Dsl.Companion companion4 = gatewayprotocol.v1.DiagnosticEventKt.Dsl.INSTANCE;
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder4 = diagnosticEvent.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder4, "this.toBuilder()");
            gatewayprotocol.v1.DiagnosticEventKt.Dsl _create4 = companion4._create(builder4);
            _create4.putStringTags(_create4.getStringTagsMap(), "same_session", java.lang.String.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(universalRequest.getSharedData().getSessionToken(), this.sessionRepository.getSessionToken())));
            arrayList.add(_create4._build());
        }
        _create3.clearBatch(_create3.getBatch());
        _create3.addAllBatch(_create3.getBatch(), arrayList);
        _create2.setDiagnosticEventRequest(_create3._build());
        _create.setPayload(_create2._build());
        return _create._build();
    }
}

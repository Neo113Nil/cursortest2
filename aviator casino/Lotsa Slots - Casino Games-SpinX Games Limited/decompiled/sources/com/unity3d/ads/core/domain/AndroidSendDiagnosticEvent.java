package com.unity3d.ads.core.domain;

/* compiled from: AndroidSendDiagnosticEvent.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ`\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidSendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "getDiagnosticEventRequest", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "(Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;)V", "invoke", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "value", "", "tags", "", "intTags", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "tokenNumber", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidSendDiagnosticEvent implements com.unity3d.ads.core.domain.SendDiagnosticEvent {
    private final com.unity3d.ads.core.data.repository.DiagnosticEventRepository diagnosticEventRepository;
    private final com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest getDiagnosticEventRequest;
    private final com.unity3d.ads.core.data.datasource.LifecycleDataSource lifecycleDataSource;

    public AndroidSendDiagnosticEvent(com.unity3d.ads.core.data.repository.DiagnosticEventRepository diagnosticEventRepository, com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest getDiagnosticEventRequest, com.unity3d.ads.core.data.datasource.LifecycleDataSource lifecycleDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.lifecycleDataSource = lifecycleDataSource;
    }

    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(java.lang.String event, java.lang.Double value, java.util.Map<java.lang.String, java.lang.String> tags, java.util.Map<java.lang.String, java.lang.Integer> intTags, com.unity3d.ads.core.data.model.AdObject adObject, java.lang.Integer tokenNumber) {
        java.util.LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        java.lang.Boolean valueOf = adObject != null ? java.lang.Boolean.valueOf(adObject.isHeaderBidding()) : null;
        com.google.protobuf.ByteString opportunityId = adObject != null ? adObject.getOpportunityId() : null;
        java.lang.String placementId = adObject != null ? adObject.getPlacementId() : null;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType adType = adObject != null ? adObject.getAdType() : null;
        if (tags == null || (linkedHashMap = kotlin.collections.MapsKt.toMutableMap(tags)) == null) {
            linkedHashMap = new java.util.LinkedHashMap();
        }
        java.util.Map<java.lang.String, java.lang.String> map = linkedHashMap;
        if (adObject != null && adObject.isScarAd()) {
            map.put("scar", "true");
        }
        if (adObject != null && adObject.isOfferwallAd()) {
            map.put("offerwall", "true");
        }
        map.put("app_active", java.lang.String.valueOf(this.lifecycleDataSource.appIsForeground()));
        this.diagnosticEventRepository.addDiagnosticEvent(this.getDiagnosticEventRequest.invoke(event, map, intTags, value, valueOf, opportunityId, placementId, adType, tokenNumber));
    }
}

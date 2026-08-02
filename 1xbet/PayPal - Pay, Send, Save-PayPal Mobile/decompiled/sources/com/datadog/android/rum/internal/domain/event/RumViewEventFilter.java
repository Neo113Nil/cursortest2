package com.datadog.android.rum.internal.domain.event;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumViewEventFilter;", "", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "", "Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "eventMetaDeserializer", "<init>", "(Lcom/datadog/android/core/internal/persistence/Deserializer;)V", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batch", "filterOutRedundantViewEvents", "(Ljava/util/List;)Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumViewEventFilter {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.Deserializer<byte[], com.datadog.android.rum.internal.domain.event.RumEventMeta> getHighSpeedVideoFpsRanges;

    public RumViewEventFilter(com.datadog.android.core.internal.persistence.Deserializer<byte[], com.datadog.android.rum.internal.domain.event.RumEventMeta> deserializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        this.getHighSpeedVideoFpsRanges = deserializer;
    }

    public final java.util.List<com.datadog.android.api.storage.RawBatchEvent> filterOutRedundantViewEvents(java.util.List<com.datadog.android.api.storage.RawBatchEvent> batch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batch, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.List<com.datadog.android.api.storage.RawBatchEvent> list = batch;
        for (com.datadog.android.api.storage.RawBatchEvent rawBatchEvent : list) {
            com.datadog.android.rum.internal.domain.event.RumEventMeta deserialize = this.getHighSpeedVideoFpsRanges.deserialize(rawBatchEvent.getMetadata());
            if (deserialize instanceof com.datadog.android.rum.internal.domain.event.RumEventMeta.View) {
                kotlin.Pair pair = kotlin.TuplesKt.to(rawBatchEvent, deserialize);
                linkedHashMap2.put(pair.getFirst(), pair.getSecond());
                com.datadog.android.rum.internal.domain.event.RumEventMeta.View view = (com.datadog.android.rum.internal.domain.event.RumEventMeta.View) deserialize;
                java.lang.String viewId = view.getViewId();
                long documentVersion = view.getDocumentVersion();
                java.lang.Long l = (java.lang.Long) linkedHashMap.get(viewId);
                if (l == null) {
                    linkedHashMap.put(viewId, java.lang.Long.valueOf(documentVersion));
                } else {
                    linkedHashMap.put(viewId, java.lang.Long.valueOf(java.lang.Math.max(documentVersion, l.longValue())));
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            com.datadog.android.api.storage.RawBatchEvent rawBatchEvent2 = (com.datadog.android.api.storage.RawBatchEvent) obj;
            if (linkedHashMap2.containsKey(rawBatchEvent2)) {
                com.datadog.android.rum.internal.domain.event.RumEventMeta.View view2 = (com.datadog.android.rum.internal.domain.event.RumEventMeta.View) kotlin.collections.MapsKt.getValue(linkedHashMap2, rawBatchEvent2);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view2.getHasAccessibility(), java.lang.Boolean.TRUE) && view2.getDocumentVersion() != ((java.lang.Number) kotlin.collections.MapsKt.getValue(linkedHashMap, view2.getViewId())).longValue()) {
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}

package com.datadog.android.sessionreplay.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/SessionReplayRecordCallback;", "Lcom/datadog/android/sessionreplay/internal/RecordCallback;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "featureSdkCore", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "Lcom/datadog/android/sessionreplay/internal/processor/EnrichedRecord;", "record", "", "onRecordForViewSent", "(Lcom/datadog/android/sessionreplay/internal/processor/EnrichedRecord;)V", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SessionReplayRecordCallback implements com.datadog.android.sessionreplay.internal.RecordCallback {
    public static final java.lang.String HAS_REPLAY_KEY = "has_replay";
    public static final java.lang.String VIEW_RECORDS_COUNT_KEY = "records_count";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getHighResolutionOutputSizeshNQ4ISI;

    public SessionReplayRecordCallback(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        this.getHighResolutionOutputSizeshNQ4ISI = featureSdkCore;
    }

    @Override // com.datadog.android.sessionreplay.internal.RecordCallback
    public final void onRecordForViewSent(final com.datadog.android.sessionreplay.internal.processor.EnrichedRecord record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        final int size = record.getRecords().size();
        if (size > 0) {
            this.getHighResolutionOutputSizeshNQ4ISI.updateFeatureContext("session-replay", false, new kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit>() { // from class: com.datadog.android.sessionreplay.internal.SessionReplayRecordCallback$onRecordForViewSent$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.util.Map<java.lang.String, java.lang.Object> map) {
                    getHighSpeedVideoFpsRangesFor(map);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.Object> map) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                    java.lang.String viewId = com.datadog.android.sessionreplay.internal.processor.EnrichedRecord.this.getViewId();
                    java.lang.Object obj = map.get(viewId);
                    java.util.LinkedHashMap linkedHashMap = kotlin.jvm.internal.TypeIntrinsics.isMutableMap(obj) ? (java.util.Map) obj : null;
                    if (linkedHashMap == null) {
                        linkedHashMap = new java.util.LinkedHashMap();
                    }
                    linkedHashMap.put("has_replay", java.lang.Boolean.TRUE);
                    com.datadog.android.sessionreplay.internal.SessionReplayRecordCallback.access$updateRecordsCount(this, linkedHashMap, size);
                    map.put(viewId, linkedHashMap);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
    }

    public static final /* synthetic */ void access$updateRecordsCount(com.datadog.android.sessionreplay.internal.SessionReplayRecordCallback sessionReplayRecordCallback, java.util.Map map, int i) {
        java.lang.Object obj = map.get("records_count");
        java.lang.Long l = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
        map.put("records_count", java.lang.Long.valueOf((l != null ? l.longValue() : 0L) + i));
    }
}

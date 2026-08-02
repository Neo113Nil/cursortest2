package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/TrackLatencyRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/TrackLatencyRepository;", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/TimeProvider;", "timeProvider", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/LatencyPairReportCallback;", "reportCallback", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/util/TimeProvider;Lcom/paypal/oslo/feature/inappcheckout/domain/repository/LatencyPairReportCallback;)V", "", "eventName", "", "timestampMillis", "", "recordEvent", "(Ljava/lang/String;Ljava/lang/Long;)V", "clearEvents", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/TimeProvider;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/LatencyPairReportCallback;", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/LatencyEventPair;", "Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TrackLatencyRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.TrackLatencyRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.repository.LatencyPairReportCallback getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.util.TimeProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEventPair> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Long> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public TrackLatencyRepositoryImpl(com.paypal.oslo.feature.inappcheckout.domain.util.TimeProvider timeProvider, com.paypal.oslo.feature.inappcheckout.domain.repository.LatencyPairReportCallback latencyPairReportCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        this.getHighSpeedVideoFpsRanges = timeProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = latencyPairReportCallback;
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashSet();
    }

    public /* synthetic */ TrackLatencyRepositoryImpl(com.paypal.oslo.feature.inappcheckout.domain.util.TimeProvider timeProvider, com.paypal.oslo.feature.inappcheckout.domain.repository.LatencyPairReportCallback latencyPairReportCallback, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(timeProvider, (i & 2) != 0 ? null : latencyPairReportCallback);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.TrackLatencyRepository
    public final void recordEvent(java.lang.String eventName, java.lang.Long timestampMillis) {
        boolean z;
        boolean z2;
        java.lang.String str;
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
            long longValue = timestampMillis != null ? timestampMillis.longValue() : this.getHighSpeedVideoFpsRanges.currentTimeMillis();
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEventPair> trackedEventPairs = com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEventPairKt.getTrackedEventPairs();
            if (!(trackedEventPairs instanceof java.util.Collection) || !trackedEventPairs.isEmpty()) {
                java.util.Iterator<T> it = trackedEventPairs.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEventPair) it.next()).getStartEvent(), eventName)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEventPair> trackedEventPairs2 = com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEventPairKt.getTrackedEventPairs();
            if (!(trackedEventPairs2 instanceof java.util.Collection) || !trackedEventPairs2.isEmpty()) {
                java.util.Iterator<T> it2 = trackedEventPairs2.iterator();
                while (it2.hasNext()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEventPair) it2.next()).getEndEvent(), eventName)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z && z2) {
                str = "start/end";
            } else if (z) {
                str = com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START;
            } else if (z2) {
                str = "end";
            } else {
                str = "unknown";
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Latency event recorded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", eventName), kotlin.TuplesKt.to("type", str), kotlin.TuplesKt.to("timestamp", java.lang.String.valueOf(longValue))), null, 4, null);
            this.getHighSpeedVideoFpsRangesFor.put(eventName, java.lang.Long.valueOf(longValue));
            if (z2) {
                java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEventPair> trackedEventPairs3 = com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEventPairKt.getTrackedEventPairs();
                java.util.ArrayList<com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEventPair> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : trackedEventPairs3) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEventPair) obj).getEndEvent(), eventName)) {
                        arrayList.add(obj);
                    }
                }
                for (com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEventPair latencyEventPair : arrayList) {
                    if (!this.Camera2StreamConfigurationMap.contains(latencyEventPair)) {
                        java.lang.Long l = this.getHighSpeedVideoFpsRangesFor.get(latencyEventPair.getStartEvent());
                        if (l != null) {
                            long longValue2 = longValue - l.longValue();
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Latency pair completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("startEvent", latencyEventPair.getStartEvent()), kotlin.TuplesKt.to("endEvent", latencyEventPair.getEndEvent()), kotlin.TuplesKt.to("durationMs", java.lang.String.valueOf(longValue2))), null, 4, null);
                            com.paypal.oslo.feature.inappcheckout.domain.repository.LatencyPairReportCallback latencyPairReportCallback = this.getHighResolutionOutputSizeshNQ4ISI;
                            if (latencyPairReportCallback != null) {
                                latencyPairReportCallback.onPairReported(latencyEventPair, longValue2);
                            }
                            this.Camera2StreamConfigurationMap.add(latencyEventPair);
                        } else {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "End event received but start event not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("startEvent", latencyEventPair.getStartEvent()), kotlin.TuplesKt.to("endEvent", eventName)), null, 4, null);
                        }
                    }
                }
            }
        }
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.TrackLatencyRepository
    public final void clearEvents() {
        synchronized (this) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Clearing all latency event timestamps", null, null, 6, null);
            this.getHighSpeedVideoFpsRangesFor.clear();
            this.Camera2StreamConfigurationMap.clear();
        }
    }
}

package com.datadog.android.rum.internal.metric;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 52\u00020\u0001:\u0003567B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010(\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010!\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010*\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00100R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\"R\u0016\u00104\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010'"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionEndedMetric;", "", "", "sessionId", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "startReason", "", "ntpOffsetAtStartMs", "", "hasTrackBackgroundEventsEnabled", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;JZ)V", "sdkErrorKind", "", "onErrorTracked", "(Ljava/lang/String;)V", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "missedEventType", "onMissedEventTracked", "(Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;)V", "onSessionReplaySkippedFrameTracked", "()V", "onSessionStopped", "Lcom/datadog/android/rum/model/ViewEvent;", "rumViewEvent", "onViewTracked", "(Lcom/datadog/android/rum/model/ViewEvent;)Z", "ntpOffsetAtEndMs", "", "toMetricAttributes", "(J)Ljava/util/Map;", "", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$TrackedView;", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$TrackedView;", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getOutputFormats", "J", "getHighSpeedVideoSizesFor", "Ljava/lang/String;", "getInputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "getOutputMinFrameDuration", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "getInputFormats", "getOutputSizes", "Companion", "MissedEventType", "TrackedView"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SessionEndedMetric {
    public static final java.lang.String DURATION_KEY = "duration";
    public static final java.lang.String HAS_BACKGROUND_EVENTS_TRACKING_ENABLED_KEY = "has_background_events_tracking_enabled";
    public static final java.lang.String METRIC_TYPE_KEY = "metric_type";
    public static final java.lang.String METRIC_TYPE_VALUE = "rum session ended";
    public static final java.lang.String NO_VIEW_EVENTS_COUNT_ACTIONS_KEY = "actions";
    public static final java.lang.String NO_VIEW_EVENTS_COUNT_ERRORS_KEY = "errors";
    public static final java.lang.String NO_VIEW_EVENTS_COUNT_KEY = "no_view_events_count";
    public static final java.lang.String NO_VIEW_EVENTS_COUNT_LONG_TASKS_KEY = "long_tasks";
    public static final java.lang.String NO_VIEW_EVENTS_COUNT_RESOURCES_KEY = "resources";
    public static final java.lang.String NTP_OFFSET_AT_END_KEY = "at_end";
    public static final java.lang.String NTP_OFFSET_AT_START_KEY = "at_start";
    public static final java.lang.String NTP_OFFSET_KEY = "ntp_offset";
    public static final java.lang.String PRECONDITION_KEY = "precondition";
    public static final java.lang.String PROCESS_TYPE_KEY = "process_type";
    public static final java.lang.String PROCESS_TYPE_VALUE = "app";
    public static final java.lang.String RSE_KEY = "rse";
    public static final java.lang.String RUM_SESSION_ENDED_METRIC_NAME = "[Mobile Metric] RUM Session Ended";
    public static final java.lang.String SDK_ERRORS_COUNT_BY_KIND_KEY = "by_kind";
    public static final java.lang.String SDK_ERRORS_COUNT_KEY = "sdk_errors_count";
    public static final java.lang.String SDK_ERRORS_COUNT_TOTAL_KEY = "total";
    public static final java.lang.String SDK_ERROR_DEFAULT_KIND = "Empty error kind";
    public static final java.lang.String SESSION_REPLAY_SKIPPED_FRAMES_COUNT = "sr_skipped_frames_count";
    public static final java.lang.String VIEW_COUNTS_APP_LAUNCH_KEY = "app_launch";
    public static final java.lang.String VIEW_COUNTS_BG_KEY = "background";
    public static final java.lang.String VIEW_COUNTS_KEY = "views_count";
    public static final java.lang.String VIEW_COUNTS_TOTAL_KEY = "total";
    public static final java.lang.String VIEW_COUNT_WITH_HAS_REPLAY = "with_has_replay";
    public static final java.lang.String WAS_STOPPED_KEY = "was_stopped";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType, java.lang.Integer> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.lang.String getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView> getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicInteger getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason getInputFormats;
    private boolean getOutputSizes;

    public SessionEndedMetric(java.lang.String str, com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason, long j, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        this.getInputSizeshNQ4ISI = str;
        this.getInputFormats = startReason;
        this.getHighSpeedVideoSizesFor = j;
        this.getHighSpeedVideoSizes = z;
        this.getOutputMinFrameDuration = new java.util.LinkedHashMap();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
        this.getOutputFormats = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public final boolean onViewTracked(com.datadog.android.rum.model.ViewEvent rumViewEvent) {
        java.lang.String url;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumViewEvent, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(rumViewEvent.getSession().getId(), this.getInputSizeshNQ4ISI)) {
            return false;
        }
        com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView trackedView = this.getOutputMinFrameDuration.get(rumViewEvent.getView().getId());
        if (trackedView == null || (url = trackedView.getViewUrl()) == null) {
            url = rumViewEvent.getView().getUrl();
        }
        java.lang.String str = url;
        com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView trackedView2 = this.getOutputMinFrameDuration.get(rumViewEvent.getView().getId());
        long startMs = trackedView2 != null ? trackedView2.getStartMs() : rumViewEvent.getDate();
        long timeSpent = rumViewEvent.getView().getTimeSpent();
        java.lang.Boolean hasReplay = rumViewEvent.getSession().getHasReplay();
        com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView trackedView3 = new com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView(str, startMs, timeSpent, hasReplay != null ? hasReplay.booleanValue() : false);
        this.getOutputMinFrameDuration.put(rumViewEvent.getView().getId(), trackedView3);
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = trackedView3;
        }
        this.Camera2StreamConfigurationMap = trackedView3;
        return true;
    }

    public final void onErrorTracked(java.lang.String sdkErrorKind) {
        if (sdkErrorKind == null) {
            sdkErrorKind = SDK_ERROR_DEFAULT_KIND;
        }
        java.util.Map<java.lang.String, java.lang.Integer> map = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Integer num = map.get(sdkErrorKind);
        map.put(sdkErrorKind, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    public final void onSessionStopped() {
        this.getOutputSizes = true;
    }

    public final void onMissedEventTracked(com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType missedEventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missedEventType, "");
        java.util.Map<com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType, java.lang.Integer> map = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Integer num = map.get(missedEventType);
        map.put(missedEventType, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    public final void onSessionReplaySkippedFrameTracked() {
        this.getOutputFormats.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01c3 A[LOOP:0: B:24:0x01bd->B:26:0x01c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.Map<java.lang.String, java.lang.Object> toMetricAttributes(long ntpOffsetAtEndMs) {
        long j;
        java.util.Collection<com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView> values;
        java.util.Iterator<T> it;
        int i;
        java.util.Collection<com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView> values2;
        java.util.Iterator<T> it2;
        int i2;
        java.util.Collection<com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView> values3;
        java.util.Iterator<T> it3;
        int i3;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("metric_type", METRIC_TYPE_VALUE);
        kotlin.Pair[] pairArr2 = new kotlin.Pair[10];
        pairArr2[0] = kotlin.TuplesKt.to(PROCESS_TYPE_KEY, PROCESS_TYPE_VALUE);
        pairArr2[1] = kotlin.TuplesKt.to(PRECONDITION_KEY, this.getInputFormats.getAsString());
        com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView trackedView = this.Camera2StreamConfigurationMap;
        if (trackedView != null) {
            com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView trackedView2 = this.getHighSpeedVideoFpsRanges;
            java.lang.Long valueOf = trackedView2 != null ? java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(trackedView.getStartMs() - trackedView2.getStartMs()) + trackedView.getDurationNs()) : null;
            if (valueOf != null) {
                j = valueOf.longValue();
                pairArr2[2] = kotlin.TuplesKt.to("duration", java.lang.Long.valueOf(j));
                pairArr2[3] = kotlin.TuplesKt.to(WAS_STOPPED_KEY, java.lang.Boolean.valueOf(this.getOutputSizes));
                kotlin.Pair[] pairArr3 = new kotlin.Pair[4];
                pairArr3[0] = kotlin.TuplesKt.to("total", java.lang.Integer.valueOf(this.getOutputMinFrameDuration.size()));
                values = this.getOutputMinFrameDuration.values();
                if ((values instanceof java.util.Collection) || !values.isEmpty()) {
                    it = values.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView) it.next()).getViewUrl(), com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.RUM_BACKGROUND_VIEW_URL) && (i = i + 1) < 0) {
                            kotlin.collections.CollectionsKt.throwCountOverflow();
                        }
                    }
                } else {
                    i = 0;
                }
                pairArr3[1] = kotlin.TuplesKt.to(VIEW_COUNTS_BG_KEY, java.lang.Integer.valueOf(i));
                values2 = this.getOutputMinFrameDuration.values();
                if ((values2 instanceof java.util.Collection) || !values2.isEmpty()) {
                    it2 = values2.iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView) it2.next()).getViewUrl(), com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.RUM_APP_LAUNCH_VIEW_URL) && (i2 = i2 + 1) < 0) {
                            kotlin.collections.CollectionsKt.throwCountOverflow();
                        }
                    }
                } else {
                    i2 = 0;
                }
                pairArr3[2] = kotlin.TuplesKt.to(VIEW_COUNTS_APP_LAUNCH_KEY, java.lang.Integer.valueOf(i2));
                values3 = this.getOutputMinFrameDuration.values();
                if ((values3 instanceof java.util.Collection) || !values3.isEmpty()) {
                    it3 = values3.iterator();
                    i3 = 0;
                    while (it3.hasNext()) {
                        if (((com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView) it3.next()).getHasReplay() && (i3 = i3 + 1) < 0) {
                            kotlin.collections.CollectionsKt.throwCountOverflow();
                        }
                    }
                } else {
                    i3 = 0;
                }
                pairArr3[3] = kotlin.TuplesKt.to(VIEW_COUNT_WITH_HAS_REPLAY, java.lang.Integer.valueOf(i3));
                pairArr2[4] = kotlin.TuplesKt.to(VIEW_COUNTS_KEY, kotlin.collections.MapsKt.mapOf(pairArr3));
                kotlin.Pair[] pairArr4 = new kotlin.Pair[2];
                pairArr4[0] = kotlin.TuplesKt.to("total", java.lang.Integer.valueOf(kotlin.collections.CollectionsKt.sumOfInt(this.getHighResolutionOutputSizeshNQ4ISI.values())));
                java.util.List<java.util.Map.Entry> subList = kotlin.collections.CollectionsKt.sortedWith(this.getHighResolutionOutputSizeshNQ4ISI.entrySet(), new java.util.Comparator() { // from class: com.datadog.android.rum.internal.metric.SessionEndedMetric$resolveTop5ErrorsByKind$$inlined$sortedByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Integer) ((java.util.Map.Entry) t2).getValue(), (java.lang.Integer) ((java.util.Map.Entry) t).getValue());
                    }
                }).subList(0, kotlin.ranges.RangesKt.coerceAtMost(5, this.getHighResolutionOutputSizeshNQ4ISI.size()));
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subList, 10)), 16));
                for (java.util.Map.Entry entry : subList) {
                    kotlin.Pair pair = kotlin.TuplesKt.to(new kotlin.text.Regex("[^\\w']+").replace((java.lang.String) entry.getKey(), "_"), entry.getValue());
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                pairArr4[1] = kotlin.TuplesKt.to(SDK_ERRORS_COUNT_BY_KIND_KEY, linkedHashMap);
                pairArr2[5] = kotlin.TuplesKt.to(SDK_ERRORS_COUNT_KEY, kotlin.collections.MapsKt.mapOf(pairArr4));
                kotlin.Pair[] pairArr5 = new kotlin.Pair[4];
                java.lang.Integer num = this.getHighSpeedVideoFpsRangesFor.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.ACTION);
                pairArr5[0] = kotlin.TuplesKt.to(NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, java.lang.Integer.valueOf(num == null ? num.intValue() : 0));
                java.lang.Integer num2 = this.getHighSpeedVideoFpsRangesFor.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.RESOURCE);
                pairArr5[1] = kotlin.TuplesKt.to(NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, java.lang.Integer.valueOf(num2 == null ? num2.intValue() : 0));
                java.lang.Integer num3 = this.getHighSpeedVideoFpsRangesFor.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.ERROR);
                pairArr5[2] = kotlin.TuplesKt.to(NO_VIEW_EVENTS_COUNT_ERRORS_KEY, java.lang.Integer.valueOf(num3 == null ? num3.intValue() : 0));
                java.lang.Integer num4 = this.getHighSpeedVideoFpsRangesFor.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.LONG_TASK);
                pairArr5[3] = kotlin.TuplesKt.to(NO_VIEW_EVENTS_COUNT_LONG_TASKS_KEY, java.lang.Integer.valueOf(num4 == null ? num4.intValue() : 0));
                pairArr2[6] = kotlin.TuplesKt.to(NO_VIEW_EVENTS_COUNT_KEY, kotlin.collections.MapsKt.mapOf(pairArr5));
                pairArr2[7] = kotlin.TuplesKt.to(HAS_BACKGROUND_EVENTS_TRACKING_ENABLED_KEY, java.lang.Boolean.valueOf(this.getHighSpeedVideoSizes));
                pairArr2[8] = kotlin.TuplesKt.to(NTP_OFFSET_KEY, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(NTP_OFFSET_AT_START_KEY, java.lang.Long.valueOf(this.getHighSpeedVideoSizesFor)), kotlin.TuplesKt.to(NTP_OFFSET_AT_END_KEY, java.lang.Long.valueOf(ntpOffsetAtEndMs))));
                pairArr2[9] = kotlin.TuplesKt.to(SESSION_REPLAY_SKIPPED_FRAMES_COUNT, java.lang.Integer.valueOf(this.getOutputFormats.get()));
                pairArr[1] = kotlin.TuplesKt.to(RSE_KEY, kotlin.collections.MapsKt.mapOf(pairArr2));
                return kotlin.collections.MapsKt.mapOf(pairArr);
            }
        }
        j = 0;
        pairArr2[2] = kotlin.TuplesKt.to("duration", java.lang.Long.valueOf(j));
        pairArr2[3] = kotlin.TuplesKt.to(WAS_STOPPED_KEY, java.lang.Boolean.valueOf(this.getOutputSizes));
        kotlin.Pair[] pairArr32 = new kotlin.Pair[4];
        pairArr32[0] = kotlin.TuplesKt.to("total", java.lang.Integer.valueOf(this.getOutputMinFrameDuration.size()));
        values = this.getOutputMinFrameDuration.values();
        if (values instanceof java.util.Collection) {
        }
        it = values.iterator();
        i = 0;
        while (it.hasNext()) {
        }
        pairArr32[1] = kotlin.TuplesKt.to(VIEW_COUNTS_BG_KEY, java.lang.Integer.valueOf(i));
        values2 = this.getOutputMinFrameDuration.values();
        if (values2 instanceof java.util.Collection) {
        }
        it2 = values2.iterator();
        i2 = 0;
        while (it2.hasNext()) {
        }
        pairArr32[2] = kotlin.TuplesKt.to(VIEW_COUNTS_APP_LAUNCH_KEY, java.lang.Integer.valueOf(i2));
        values3 = this.getOutputMinFrameDuration.values();
        if (values3 instanceof java.util.Collection) {
        }
        it3 = values3.iterator();
        i3 = 0;
        while (it3.hasNext()) {
        }
        pairArr32[3] = kotlin.TuplesKt.to(VIEW_COUNT_WITH_HAS_REPLAY, java.lang.Integer.valueOf(i3));
        pairArr2[4] = kotlin.TuplesKt.to(VIEW_COUNTS_KEY, kotlin.collections.MapsKt.mapOf(pairArr32));
        kotlin.Pair[] pairArr42 = new kotlin.Pair[2];
        pairArr42[0] = kotlin.TuplesKt.to("total", java.lang.Integer.valueOf(kotlin.collections.CollectionsKt.sumOfInt(this.getHighResolutionOutputSizeshNQ4ISI.values())));
        java.util.List<java.util.Map.Entry> subList2 = kotlin.collections.CollectionsKt.sortedWith(this.getHighResolutionOutputSizeshNQ4ISI.entrySet(), new java.util.Comparator() { // from class: com.datadog.android.rum.internal.metric.SessionEndedMetric$resolveTop5ErrorsByKind$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Integer) ((java.util.Map.Entry) t2).getValue(), (java.lang.Integer) ((java.util.Map.Entry) t).getValue());
            }
        }).subList(0, kotlin.ranges.RangesKt.coerceAtMost(5, this.getHighResolutionOutputSizeshNQ4ISI.size()));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subList2, 10)), 16));
        while (r3.hasNext()) {
        }
        pairArr42[1] = kotlin.TuplesKt.to(SDK_ERRORS_COUNT_BY_KIND_KEY, linkedHashMap2);
        pairArr2[5] = kotlin.TuplesKt.to(SDK_ERRORS_COUNT_KEY, kotlin.collections.MapsKt.mapOf(pairArr42));
        kotlin.Pair[] pairArr52 = new kotlin.Pair[4];
        java.lang.Integer num5 = this.getHighSpeedVideoFpsRangesFor.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.ACTION);
        pairArr52[0] = kotlin.TuplesKt.to(NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, java.lang.Integer.valueOf(num5 == null ? num5.intValue() : 0));
        java.lang.Integer num22 = this.getHighSpeedVideoFpsRangesFor.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.RESOURCE);
        pairArr52[1] = kotlin.TuplesKt.to(NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, java.lang.Integer.valueOf(num22 == null ? num22.intValue() : 0));
        java.lang.Integer num32 = this.getHighSpeedVideoFpsRangesFor.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.ERROR);
        pairArr52[2] = kotlin.TuplesKt.to(NO_VIEW_EVENTS_COUNT_ERRORS_KEY, java.lang.Integer.valueOf(num32 == null ? num32.intValue() : 0));
        java.lang.Integer num42 = this.getHighSpeedVideoFpsRangesFor.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.LONG_TASK);
        pairArr52[3] = kotlin.TuplesKt.to(NO_VIEW_EVENTS_COUNT_LONG_TASKS_KEY, java.lang.Integer.valueOf(num42 == null ? num42.intValue() : 0));
        pairArr2[6] = kotlin.TuplesKt.to(NO_VIEW_EVENTS_COUNT_KEY, kotlin.collections.MapsKt.mapOf(pairArr52));
        pairArr2[7] = kotlin.TuplesKt.to(HAS_BACKGROUND_EVENTS_TRACKING_ENABLED_KEY, java.lang.Boolean.valueOf(this.getHighSpeedVideoSizes));
        pairArr2[8] = kotlin.TuplesKt.to(NTP_OFFSET_KEY, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(NTP_OFFSET_AT_START_KEY, java.lang.Long.valueOf(this.getHighSpeedVideoSizesFor)), kotlin.TuplesKt.to(NTP_OFFSET_AT_END_KEY, java.lang.Long.valueOf(ntpOffsetAtEndMs))));
        pairArr2[9] = kotlin.TuplesKt.to(SESSION_REPLAY_SKIPPED_FRAMES_COUNT, java.lang.Integer.valueOf(this.getOutputFormats.get()));
        pairArr[1] = kotlin.TuplesKt.to(RSE_KEY, kotlin.collections.MapsKt.mapOf(pairArr2));
        return kotlin.collections.MapsKt.mapOf(pairArr);
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$TrackedView;", "", "", "viewUrl", "", "startMs", "durationNs", "", "hasReplay", "<init>", "(Ljava/lang/String;JJZ)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;JJZ)Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$TrackedView;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "J", "getDurationNs", "Z", "getHasReplay", "getStartMs", "Ljava/lang/String;", "getViewUrl"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TrackedView {
        private final long durationNs;
        private final boolean hasReplay;
        private final long startMs;
        private final java.lang.String viewUrl;

        public TrackedView(java.lang.String str, long j, long j2, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.viewUrl = str;
            this.startMs = j;
            this.durationNs = j2;
            this.hasReplay = z;
        }

        public final java.lang.String getViewUrl() {
            return this.viewUrl;
        }

        public final long getStartMs() {
            return this.startMs;
        }

        public final long getDurationNs() {
            return this.durationNs;
        }

        public final boolean getHasReplay() {
            return this.hasReplay;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.viewUrl;
            long j = this.startMs;
            long j2 = this.durationNs;
            boolean z = this.hasReplay;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TrackedView(viewUrl=");
            sb.append(str);
            sb.append(", startMs=");
            sb.append(j);
            sb.append(", durationNs=");
            sb.append(j2);
            sb.append(", hasReplay=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.viewUrl.hashCode() * 31) + java.lang.Long.hashCode(this.startMs)) * 31) + java.lang.Long.hashCode(this.durationNs)) * 31) + java.lang.Boolean.hashCode(this.hasReplay);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView)) {
                return false;
            }
            com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView trackedView = (com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.viewUrl, trackedView.viewUrl) && this.startMs == trackedView.startMs && this.durationNs == trackedView.durationNs && this.hasReplay == trackedView.hasReplay;
        }

        public final com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView copy(java.lang.String viewUrl, long startMs, long durationNs, boolean hasReplay) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewUrl, "");
            return new com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView(viewUrl, startMs, durationNs, hasReplay);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasReplay() {
            return this.hasReplay;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDurationNs() {
            return this.durationNs;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStartMs() {
            return this.startMs;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getViewUrl() {
            return this.viewUrl;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView copy$default(com.datadog.android.rum.internal.metric.SessionEndedMetric.TrackedView trackedView, java.lang.String str, long j, long j2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = trackedView.viewUrl;
            }
            if ((i & 2) != 0) {
                j = trackedView.startMs;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = trackedView.durationNs;
            }
            long j4 = j2;
            if ((i & 8) != 0) {
                z = trackedView.hasReplay;
            }
            return trackedView.copy(str, j3, j4, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ACTION", "RESOURCE", "ERROR", "LONG_TASK"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum MissedEventType {
        ACTION,
        RESOURCE,
        ERROR,
        LONG_TASK;


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.Companion INSTANCE = new com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType$Companion;", "", "<init>", "()V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "rawEvent", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "fromRawEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;)Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType fromRawEvent(com.datadog.android.rum.internal.domain.scope.RumRawEvent rawEvent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawEvent, "");
                if ((rawEvent instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError) || (rawEvent instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError)) {
                    return com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.ERROR;
                }
                if (rawEvent instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction) {
                    return com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.ACTION;
                }
                if (rawEvent instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource) {
                    return com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.RESOURCE;
                }
                if (rawEvent instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddLongTask) {
                    return com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.LONG_TASK;
                }
                return null;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}

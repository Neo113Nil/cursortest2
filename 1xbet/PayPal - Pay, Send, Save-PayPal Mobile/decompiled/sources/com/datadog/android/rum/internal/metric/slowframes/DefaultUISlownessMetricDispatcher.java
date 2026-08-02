package com.datadog.android.rum.internal.metric.slowframes;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u0001:\u0002 !B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001f"}, d2 = {"Lcom/datadog/android/rum/internal/metric/slowframes/DefaultUISlownessMetricDispatcher;", "Lcom/datadog/android/rum/internal/metric/slowframes/UISlownessMetricDispatcher;", "Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;", "config", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "samplingRate", "<init>", "(Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;Lcom/datadog/android/api/InternalLogger;F)V", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "", "incrementIgnoredFrameCount", "(Ljava/lang/String;)V", "incrementMissedFrameCount", "incrementSlowFrameCount", "onViewCreated", "", "viewDurationNs", "sendMetric", "(Ljava/lang/String;J)V", "Camera2StreamConfigurationMap", "Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/datadog/android/rum/internal/metric/slowframes/DefaultUISlownessMetricDispatcher$SlowFramesTelemetry;", "Ljava/util/concurrent/ConcurrentHashMap;", "Companion", "SlowFramesTelemetry"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultUISlownessMetricDispatcher implements com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher {
    public static final java.lang.String KEY_CONFIG = "config";
    public static final java.lang.String KEY_COUNT = "count";
    public static final java.lang.String KEY_IGNORED_COUNT = "ignored_count";
    public static final java.lang.String KEY_MAX_COUNT = "max_count";
    public static final java.lang.String KEY_MAX_DURATION = "max_duration";
    public static final java.lang.String KEY_METRIC_TYPE = "metric_type";
    public static final java.lang.String KEY_MISSED_COUNT = "missed_count";
    public static final java.lang.String KEY_RUM_UI_SLOWNESS = "rum_ui_slowness";
    public static final java.lang.String KEY_SLOW_FRAMES = "slow_frames";
    public static final java.lang.String KEY_SLOW_FRAME_THRESHOLD = "slow_frame_threshold";
    public static final java.lang.String KEY_VIEW_DURATION = "view_duration";
    public static final java.lang.String KEY_VIEW_MIN_DURATION = "view_min_duration";
    public static final java.lang.String UI_SLOWNESS_MESSAGE = "[Mobile Metric] RUM UI Slowness";
    public static final java.lang.String VALUE_METRIC_TYPE = "rum ui slowness";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.rum.configuration.SlowFramesConfiguration getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.SlowFramesTelemetry> getHighResolutionOutputSizeshNQ4ISI;

    public DefaultUISlownessMetricDispatcher(com.datadog.android.rum.configuration.SlowFramesConfiguration slowFramesConfiguration, com.datadog.android.api.InternalLogger internalLogger, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slowFramesConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRanges = slowFramesConfiguration;
        this.Camera2StreamConfigurationMap = internalLogger;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.ConcurrentHashMap<>();
    }

    public /* synthetic */ DefaultUISlownessMetricDispatcher(com.datadog.android.rum.configuration.SlowFramesConfiguration slowFramesConfiguration, com.datadog.android.api.InternalLogger internalLogger, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(slowFramesConfiguration, internalLogger, (i & 4) != 0 ? 0.75f : f);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/datadog/android/rum/internal/metric/slowframes/DefaultUISlownessMetricDispatcher$SlowFramesTelemetry;", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "slowFramesCount", "ignoredFramesCount", "missedFrameCount", "<init>", "(Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;)V", "component1", "()Ljava/util/concurrent/atomic/AtomicInteger;", "component2", "component3", "copy", "(Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;)Lcom/datadog/android/rum/internal/metric/slowframes/DefaultUISlownessMetricDispatcher$SlowFramesTelemetry;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "getIgnoredFramesCount", "getMissedFrameCount", "getSlowFramesCount"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SlowFramesTelemetry {
        private final java.util.concurrent.atomic.AtomicInteger ignoredFramesCount;
        private final java.util.concurrent.atomic.AtomicInteger missedFrameCount;
        private final java.util.concurrent.atomic.AtomicInteger slowFramesCount;

        public SlowFramesTelemetry(java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.atomic.AtomicInteger atomicInteger2, java.util.concurrent.atomic.AtomicInteger atomicInteger3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInteger, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInteger2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInteger3, "");
            this.slowFramesCount = atomicInteger;
            this.ignoredFramesCount = atomicInteger2;
            this.missedFrameCount = atomicInteger3;
        }

        public /* synthetic */ SlowFramesTelemetry(java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.atomic.AtomicInteger atomicInteger2, java.util.concurrent.atomic.AtomicInteger atomicInteger3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new java.util.concurrent.atomic.AtomicInteger(0) : atomicInteger, (i & 2) != 0 ? new java.util.concurrent.atomic.AtomicInteger(0) : atomicInteger2, (i & 4) != 0 ? new java.util.concurrent.atomic.AtomicInteger(0) : atomicInteger3);
        }

        public final java.util.concurrent.atomic.AtomicInteger getSlowFramesCount() {
            return this.slowFramesCount;
        }

        public final java.util.concurrent.atomic.AtomicInteger getIgnoredFramesCount() {
            return this.ignoredFramesCount;
        }

        public final java.util.concurrent.atomic.AtomicInteger getMissedFrameCount() {
            return this.missedFrameCount;
        }

        public final java.lang.String toString() {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.slowFramesCount;
            java.util.concurrent.atomic.AtomicInteger atomicInteger2 = this.ignoredFramesCount;
            java.util.concurrent.atomic.AtomicInteger atomicInteger3 = this.missedFrameCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SlowFramesTelemetry(slowFramesCount=");
            sb.append(atomicInteger);
            sb.append(", ignoredFramesCount=");
            sb.append(atomicInteger2);
            sb.append(", missedFrameCount=");
            sb.append(atomicInteger3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.slowFramesCount.hashCode() * 31) + this.ignoredFramesCount.hashCode()) * 31) + this.missedFrameCount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.SlowFramesTelemetry)) {
                return false;
            }
            com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.SlowFramesTelemetry slowFramesTelemetry = (com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.SlowFramesTelemetry) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.slowFramesCount, slowFramesTelemetry.slowFramesCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.ignoredFramesCount, slowFramesTelemetry.ignoredFramesCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.missedFrameCount, slowFramesTelemetry.missedFrameCount);
        }

        public final com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.SlowFramesTelemetry copy(java.util.concurrent.atomic.AtomicInteger slowFramesCount, java.util.concurrent.atomic.AtomicInteger ignoredFramesCount, java.util.concurrent.atomic.AtomicInteger missedFrameCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slowFramesCount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ignoredFramesCount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missedFrameCount, "");
            return new com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.SlowFramesTelemetry(slowFramesCount, ignoredFramesCount, missedFrameCount);
        }

        /* renamed from: component3, reason: from getter */
        public final java.util.concurrent.atomic.AtomicInteger getMissedFrameCount() {
            return this.missedFrameCount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.util.concurrent.atomic.AtomicInteger getIgnoredFramesCount() {
            return this.ignoredFramesCount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.util.concurrent.atomic.AtomicInteger getSlowFramesCount() {
            return this.slowFramesCount;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.SlowFramesTelemetry copy$default(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.SlowFramesTelemetry slowFramesTelemetry, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.atomic.AtomicInteger atomicInteger2, java.util.concurrent.atomic.AtomicInteger atomicInteger3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                atomicInteger = slowFramesTelemetry.slowFramesCount;
            }
            if ((i & 2) != 0) {
                atomicInteger2 = slowFramesTelemetry.ignoredFramesCount;
            }
            if ((i & 4) != 0) {
                atomicInteger3 = slowFramesTelemetry.missedFrameCount;
            }
            return slowFramesTelemetry.copy(atomicInteger, atomicInteger2, atomicInteger3);
        }

        public SlowFramesTelemetry() {
            this(null, null, null, 7, null);
        }
    }

    @Override // com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher
    public final void onViewCreated(java.lang.String viewId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        this.getHighResolutionOutputSizeshNQ4ISI.putIfAbsent(viewId, new com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.SlowFramesTelemetry(null, null, null, 7, null));
    }

    @Override // com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher
    public final void incrementSlowFrameCount(java.lang.String viewId) {
        java.util.concurrent.atomic.AtomicInteger slowFramesCount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.SlowFramesTelemetry slowFramesTelemetry = this.getHighResolutionOutputSizeshNQ4ISI.get(viewId);
        if (slowFramesTelemetry == null || (slowFramesCount = slowFramesTelemetry.getSlowFramesCount()) == null) {
            return;
        }
        slowFramesCount.incrementAndGet();
    }

    @Override // com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher
    public final void incrementIgnoredFrameCount(java.lang.String viewId) {
        java.util.concurrent.atomic.AtomicInteger ignoredFramesCount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.SlowFramesTelemetry slowFramesTelemetry = this.getHighResolutionOutputSizeshNQ4ISI.get(viewId);
        if (slowFramesTelemetry == null || (ignoredFramesCount = slowFramesTelemetry.getIgnoredFramesCount()) == null) {
            return;
        }
        ignoredFramesCount.incrementAndGet();
    }

    @Override // com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher
    public final void incrementMissedFrameCount(java.lang.String viewId) {
        java.util.concurrent.atomic.AtomicInteger missedFrameCount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.SlowFramesTelemetry slowFramesTelemetry = this.getHighResolutionOutputSizeshNQ4ISI.get(viewId);
        if (slowFramesTelemetry == null || (missedFrameCount = slowFramesTelemetry.getMissedFrameCount()) == null) {
            return;
        }
        missedFrameCount.incrementAndGet();
    }

    @Override // com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher
    public final void sendMetric(final java.lang.String viewId, long viewDurationNs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.SlowFramesTelemetry remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(viewId);
        if (remove == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher$sendMetric$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "No telemetry found for viewId=".concat(java.lang.String.valueOf(viewId));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return;
        }
        com.datadog.android.api.InternalLogger internalLogger = this.Camera2StreamConfigurationMap;
        float f = this.getHighSpeedVideoFpsRangesFor;
        int i = remove.getSlowFramesCount().get();
        int i2 = remove.getIgnoredFramesCount().get();
        int i3 = remove.getMissedFrameCount().get();
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("metric_type", VALUE_METRIC_TYPE);
        java.util.Map createMapBuilder2 = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder2.put(KEY_VIEW_DURATION, java.lang.Long.valueOf(viewDurationNs));
        java.util.Map createMapBuilder3 = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder3.put(KEY_COUNT, java.lang.Integer.valueOf(i));
        createMapBuilder3.put(KEY_IGNORED_COUNT, java.lang.Integer.valueOf(i2));
        createMapBuilder3.put(KEY_MISSED_COUNT, java.lang.Integer.valueOf(i3));
        java.util.Map createMapBuilder4 = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder4.put(KEY_MAX_COUNT, java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges.getMaxSlowFramesAmount$dd_sdk_android_rum_release()));
        createMapBuilder4.put(KEY_SLOW_FRAME_THRESHOLD, java.lang.Float.valueOf(2.0f));
        createMapBuilder4.put(KEY_MAX_DURATION, java.lang.Long.valueOf(this.getHighSpeedVideoFpsRanges.getMaxSlowFrameThresholdNs$dd_sdk_android_rum_release()));
        createMapBuilder4.put(KEY_VIEW_MIN_DURATION, java.lang.Long.valueOf(this.getHighSpeedVideoFpsRanges.getMinViewLifetimeThresholdNs$dd_sdk_android_rum_release()));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        createMapBuilder3.put("config", kotlin.collections.MapsKt.build(createMapBuilder4));
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        createMapBuilder2.put(KEY_SLOW_FRAMES, kotlin.collections.MapsKt.build(createMapBuilder3));
        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
        createMapBuilder.put(KEY_RUM_UI_SLOWNESS, kotlin.collections.MapsKt.build(createMapBuilder2));
        com.datadog.android.api.InternalLogger.DefaultImpls.logMetric$default(internalLogger, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher$sendMetric$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.UI_SLOWNESS_MESSAGE;
            }
        }, kotlin.collections.MapsKt.build(createMapBuilder), f, null, 8, null);
    }
}

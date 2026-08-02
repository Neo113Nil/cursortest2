package com.datadog.android.rum.internal.startup;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumAppStartupTelemetryReporterImpl;", "Lcom/datadog/android/rum/internal/startup/RumAppStartupTelemetryReporter;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "appStartupTimeNs", "contentProviderCreationTimeNs", "", "processStartImportance", "<init>", "(Lcom/datadog/android/api/InternalLogger;JJI)V", "Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;", "info", "indexInSession", "", "reportTTID", "(Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;I)V", "getHighSpeedVideoFpsRangesFor", "J", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumAppStartupTelemetryReporterImpl implements com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporter {
    public static final java.lang.String KEY_APP_LAUNCH_TTID = "app_launch_ttid";
    public static final java.lang.String KEY_CP_PROCESS_START_DIFF_NS = "cp_process_start_diff_ns";
    public static final java.lang.String KEY_GAP_NS = "app_start_activity_on_create_gap_ns";
    public static final java.lang.String KEY_HAS_SAVED_INSTANCE_STATE = "has_saved_instance_state";
    public static final java.lang.String KEY_INDEX_IN_SESSION = "index_in_session";
    public static final java.lang.String KEY_METRIC_TYPE = "metric_type";
    public static final java.lang.String KEY_PROCESS_START_IMPORTANCE = "process_start_importance";
    public static final java.lang.String KEY_SCENARIO = "scenario";
    public static final java.lang.String KEY_TTID_DURATION_NS = "duration_ns";
    public static final java.lang.String KEY_WAS_FORWARDED = "was_forwarded";
    public static final java.lang.String METRIC_NAME = "[Mobile Metric] App Launch TTID";
    public static final java.lang.String METRIC_TYPE_VALUE = "app launch ttid";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    public RumAppStartupTelemetryReporterImpl(com.datadog.android.api.InternalLogger internalLogger, long j, long j2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoSizes = internalLogger;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighResolutionOutputSizeshNQ4ISI = j2;
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporter
    public final void reportTTID(com.datadog.android.rum.internal.startup.RumTTIDInfo info, int indexInSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        com.datadog.android.api.InternalLogger internalLogger = this.getHighSpeedVideoSizes;
        com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl$reportTTID$1 rumAppStartupTelemetryReporterImpl$reportTTID$1 = new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl$reportTTID$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.METRIC_NAME;
            }
        };
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("metric_type", METRIC_TYPE_VALUE);
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put(KEY_SCENARIO, com.datadog.android.rum.internal.startup.RumStartupScenarioKt.getName(info.getScenario()));
        createMapBuilder.put(KEY_TTID_DURATION_NS, java.lang.Long.valueOf(info.getDurationNs()));
        createMapBuilder.put(KEY_INDEX_IN_SESSION, java.lang.Integer.valueOf(indexInSession));
        createMapBuilder.put(KEY_CP_PROCESS_START_DIFF_NS, java.lang.Long.valueOf(this.getHighResolutionOutputSizeshNQ4ISI - this.getHighSpeedVideoFpsRanges));
        createMapBuilder.put(KEY_PROCESS_START_IMPORTANCE, java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        createMapBuilder.put(KEY_HAS_SAVED_INSTANCE_STATE, java.lang.Boolean.valueOf(info.getScenario().getHasSavedInstanceStateBundle()));
        createMapBuilder.put(KEY_WAS_FORWARDED, java.lang.Boolean.valueOf(info.getWasForwarded()));
        java.lang.Long appStartActivityOnCreateGapNs = com.datadog.android.rum.internal.startup.RumStartupScenarioKt.getAppStartActivityOnCreateGapNs(info.getScenario());
        if (appStartActivityOnCreateGapNs != null) {
            createMapBuilder.put(KEY_GAP_NS, java.lang.Long.valueOf(appStartActivityOnCreateGapNs.longValue()));
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        pairArr[1] = kotlin.TuplesKt.to(KEY_APP_LAUNCH_TTID, kotlin.collections.MapsKt.build(createMapBuilder));
        com.datadog.android.api.InternalLogger.DefaultImpls.logMetric$default(internalLogger, rumAppStartupTelemetryReporterImpl$reportTTID$1, kotlin.collections.MapsKt.mapOf(pairArr), 15.0f, null, 8, null);
    }
}

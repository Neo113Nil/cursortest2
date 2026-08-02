package com.datadog.android.rum.internal.startup;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001>B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJo\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\"\u0010\u0015\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0004\u0012\u00020\f0\u0012j\u0002`\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJo\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00102\"\u0010\u0015\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0004\u0012\u00020\f0\u0012j\u0002`\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001bH\u0016¢\u0006\u0004\b!\u0010\"Jw\u0010,\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00102\"\u0010$\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0004\u0012\u00020\f0\u0012j\u0002`\u00142\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010&\u001a\u00020\u00192\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00105R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0016\u0010<\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010=\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010:"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumSessionScopeStartupManagerImpl;", "Lcom/datadog/android/rum/internal/startup/RumSessionScopeStartupManager;", "Lcom/datadog/android/rum/internal/domain/scope/RumVitalAppLaunchEventHelper;", "rumVitalAppLaunchEventHelper", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/startup/RumAppStartupTelemetryReporter;", "rumAppStartupTelemetryReporter", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumVitalAppLaunchEventHelper;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/rum/internal/startup/RumAppStartupTelemetryReporter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartEvent;", "event", "", "onAppStartEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartEvent;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTFDEvent;", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "Lcom/datadog/android/api/feature/EventWriteScope;", "writeScope", "Lcom/datadog/android/api/storage/DataWriter;", "", "writer", "Lcom/datadog/android/rum/internal/domain/RumContext;", "rumContext", "", "", "customAttributes", "onTTFDEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTFDEvent;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;Lcom/datadog/android/rum/internal/domain/RumContext;Ljava/util/Map;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTIDEvent;", "onTTIDEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTIDEvent;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;Lcom/datadog/android/rum/internal/domain/RumContext;Ljava/util/Map;)V", "p0", "p1", "p2", "p3", "p4", "", "p5", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "p6", "getHighSpeedVideoFpsRangesFor", "(Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;Lcom/datadog/android/rum/internal/domain/RumContext;Ljava/util/Map;JLcom/datadog/android/rum/internal/startup/RumStartupScenario;)V", "", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/rum/internal/startup/RumAppStartupTelemetryReporter;", "Lcom/datadog/android/rum/internal/domain/scope/RumVitalAppLaunchEventHelper;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/core/InternalSdkCore;", "", "getInputFormats", "Z", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration", "getInputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumSessionScopeStartupManagerImpl implements com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl.Companion INSTANCE = new com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl.Companion(null);
    private static final long MAX_TTFD_DURATION_NS;
    private static final long MAX_TTID_DURATION_NS;
    public static final java.lang.String REPORT_APP_FULLY_DISPLAYED_CALLED_BEFORE_TTID_MESSAGE = "RumMonitor.reportAppFullyDisplayed was called before TTID was computed, will report TTID as TTFD.";
    public static final java.lang.String REPORT_APP_FULLY_DISPLAYED_CALLED_TOO_EARLY_MESSAGE = "RumMonitor.reportAppFullyDisplayed was called before the application launch was detected, ignoring it.";
    public static final java.lang.String TTFD_TOO_LARGE_MESSAGE = "TTFD value is too large, skipping it";
    public static final java.lang.String TTID_TOO_LARGE_MESSAGE = "TTID value is too large, skipping it";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporter getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.datadog.android.rum.internal.startup.RumStartupScenario Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.core.InternalSdkCore getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.scope.RumVitalAppLaunchEventHelper getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private boolean getInputFormats;

    public RumSessionScopeStartupManagerImpl(com.datadog.android.rum.internal.domain.scope.RumVitalAppLaunchEventHelper rumVitalAppLaunchEventHelper, com.datadog.android.core.InternalSdkCore internalSdkCore, com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporter rumAppStartupTelemetryReporter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumVitalAppLaunchEventHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumAppStartupTelemetryReporter, "");
        this.getHighSpeedVideoFpsRanges = rumVitalAppLaunchEventHelper;
        this.getHighSpeedVideoFpsRangesFor = internalSdkCore;
        this.getHighResolutionOutputSizeshNQ4ISI = rumAppStartupTelemetryReporter;
    }

    @Override // com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager
    public final void onAppStartEvent(com.datadog.android.rum.internal.domain.scope.RumRawEvent.AppStartEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.Camera2StreamConfigurationMap = event.getScenario();
        this.getHighSpeedVideoSizesFor = false;
        this.getOutputMinFrameDuration = false;
        this.getHighSpeedVideoSizes++;
    }

    @Override // com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager
    public final void onTTIDEvent(com.datadog.android.rum.internal.domain.scope.RumRawEvent.AppStartTTIDEvent event, com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> writeScope, com.datadog.android.api.storage.DataWriter<java.lang.Object> writer, com.datadog.android.rum.internal.domain.RumContext rumContext, java.util.Map<java.lang.String, ? extends java.lang.Object> customAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAttributes, "");
        this.getOutputMinFrameDuration = true;
        this.getHighResolutionOutputSizeshNQ4ISI.reportTTID(event.getInfo(), this.getHighSpeedVideoSizes - 1);
        if (this.getInputSizeshNQ4ISI) {
            return;
        }
        this.getInputSizeshNQ4ISI = true;
        com.datadog.android.rum.internal.domain.scope.RumVitalAppLaunchEventHelper rumVitalAppLaunchEventHelper = this.getHighSpeedVideoFpsRanges;
        long timestamp = event.getInfo().getScenario().getInitialTime().getTimestamp();
        long serverTimeOffsetMs = this.getHighSpeedVideoFpsRangesFor.getTime().getServerTimeOffsetMs();
        java.util.Map<java.lang.String, ? extends java.lang.Object> emptyMap = kotlin.collections.MapsKt.emptyMap();
        long durationNs = event.getInfo().getDurationNs();
        com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric appLaunchMetric = com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric.TTID;
        com.datadog.android.rum.internal.startup.RumStartupScenario scenario = event.getInfo().getScenario();
        java.util.Map<java.lang.String, java.lang.Object> map = datadogContext.getFeaturesContext().get("profiling");
        final com.datadog.android.rum.model.VitalAppLaunchEvent newVitalAppLaunchEvent = rumVitalAppLaunchEventHelper.newVitalAppLaunchEvent(serverTimeOffsetMs + timestamp, datadogContext, emptyMap, customAttributes, null, rumContext, durationNs, scenario, appLaunchMetric, kotlin.jvm.internal.Intrinsics.areEqual(map != null ? map.get("profiler_is_running") : null, java.lang.Boolean.TRUE) ? com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus.RUNNING : null);
        com.datadog.android.api.feature.FeatureScope feature = this.getHighSpeedVideoFpsRangesFor.getFeature("profiling");
        if (feature != null) {
            feature.sendEvent(new com.datadog.android.internal.profiling.ProfilerStopEvent.TTID(new com.datadog.android.internal.profiling.TTIDRumContext(rumContext.getApplicationId(), rumContext.getSessionId(), newVitalAppLaunchEvent.getVital().getId(), newVitalAppLaunchEvent.getVital().getName(), rumContext.getViewId(), rumContext.getViewName())));
        }
        if (newVitalAppLaunchEvent.getVital().getDuration().longValue() > MAX_TTID_DURATION_NS) {
            this.getHighSpeedVideoFpsRangesFor.getInternalLogger().log(com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0<java.lang.String>) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl$sendTTIDEvent$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl.TTID_TOO_LARGE_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
        } else {
            com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation$default(this.getHighSpeedVideoFpsRangesFor, datadogContext, writeScope, writer, null, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl$sendTTIDEvent$2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.datadog.android.rum.model.VitalAppLaunchEvent.this;
                }

                {
                    super(0);
                }
            }, 8, null).submit();
        }
        if (this.getHighSpeedVideoSizesFor) {
            getHighSpeedVideoFpsRangesFor(datadogContext, writeScope, writer, rumContext, customAttributes, event.getInfo().getDurationNs(), event.getInfo().getScenario());
        }
    }

    @Override // com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager
    public final void onTTFDEvent(com.datadog.android.rum.internal.domain.scope.RumRawEvent.AppStartTTFDEvent event, com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> writeScope, com.datadog.android.api.storage.DataWriter<java.lang.Object> writer, com.datadog.android.rum.internal.domain.RumContext rumContext, java.util.Map<java.lang.String, ? extends java.lang.Object> customAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAttributes, "");
        if (this.getInputFormats) {
            return;
        }
        this.getInputFormats = true;
        com.datadog.android.rum.internal.startup.RumStartupScenario rumStartupScenario = this.Camera2StreamConfigurationMap;
        if (rumStartupScenario == null) {
            this.getHighSpeedVideoFpsRangesFor.getInternalLogger().log(com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0<java.lang.String>) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl$onTTFDEvent$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl.REPORT_APP_FULLY_DISPLAYED_CALLED_TOO_EARLY_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
            return;
        }
        this.getHighSpeedVideoSizesFor = true;
        if (!this.getOutputMinFrameDuration) {
            this.getHighSpeedVideoFpsRangesFor.getInternalLogger().log(com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0<java.lang.String>) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl$onTTFDEvent$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl.REPORT_APP_FULLY_DISPLAYED_CALLED_BEFORE_TTID_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
        } else {
            getHighSpeedVideoFpsRangesFor(datadogContext, writeScope, writer, rumContext, customAttributes, event.getEventTime().getNanoTime() - rumStartupScenario.getInitialTime().getNanoTime(), rumStartupScenario);
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(final com.datadog.android.api.context.DatadogContext p0, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> p1, com.datadog.android.api.storage.DataWriter<java.lang.Object> p2, final com.datadog.android.rum.internal.domain.RumContext p3, final java.util.Map<java.lang.String, ? extends java.lang.Object> p4, final long p5, final com.datadog.android.rum.internal.startup.RumStartupScenario p6) {
        if (p5 > MAX_TTFD_DURATION_NS) {
            this.getHighSpeedVideoFpsRangesFor.getInternalLogger().log(com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0<java.lang.String>) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl$sendTTFDEvent$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl.TTFD_TOO_LARGE_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
        } else {
            com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation$default(this.getHighSpeedVideoFpsRangesFor, p0, p1, p2, null, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl$sendTTFDEvent$2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    com.datadog.android.rum.internal.domain.scope.RumVitalAppLaunchEventHelper rumVitalAppLaunchEventHelper;
                    com.datadog.android.core.InternalSdkCore internalSdkCore;
                    rumVitalAppLaunchEventHelper = com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl.this.getHighSpeedVideoFpsRanges;
                    long timestamp = p6.getInitialTime().getTimestamp();
                    internalSdkCore = com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl.this.getHighSpeedVideoFpsRangesFor;
                    long serverTimeOffsetMs = internalSdkCore.getTime().getServerTimeOffsetMs();
                    return rumVitalAppLaunchEventHelper.newVitalAppLaunchEvent(timestamp + serverTimeOffsetMs, p0, kotlin.collections.MapsKt.emptyMap(), p4, null, p3, p5, p6, com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric.TTFD, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, 8, null).submit();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0010\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumSessionScopeStartupManagerImpl$Companion;", "", "<init>", "()V", "", "MAX_TTFD_DURATION_NS", "J", "getMAX_TTFD_DURATION_NS$dd_sdk_android_rum_release", "()J", "MAX_TTID_DURATION_NS", "getMAX_TTID_DURATION_NS$dd_sdk_android_rum_release", "", "REPORT_APP_FULLY_DISPLAYED_CALLED_BEFORE_TTID_MESSAGE", "Ljava/lang/String;", "REPORT_APP_FULLY_DISPLAYED_CALLED_TOO_EARLY_MESSAGE", "TTFD_TOO_LARGE_MESSAGE", "TTID_TOO_LARGE_MESSAGE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long getMAX_TTID_DURATION_NS$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl.MAX_TTID_DURATION_NS;
        }

        public final long getMAX_TTFD_DURATION_NS$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl.MAX_TTFD_DURATION_NS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        MAX_TTID_DURATION_NS = kotlin.time.Duration.m23955getInWholeNanosecondsimpl(kotlin.time.DurationKt.toDuration(1, kotlin.time.DurationUnit.MINUTES));
        kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
        MAX_TTFD_DURATION_NS = kotlin.time.Duration.m23955getInWholeNanosecondsimpl(kotlin.time.DurationKt.toDuration(90, kotlin.time.DurationUnit.SECONDS));
    }
}

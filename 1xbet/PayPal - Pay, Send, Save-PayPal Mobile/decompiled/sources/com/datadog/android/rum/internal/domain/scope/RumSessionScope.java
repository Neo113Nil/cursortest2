package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u0088\u00012\u00020\u0001:\u0006\u0088\u0001\u0089\u0001\u008a\u0001Bí\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0 \u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010'\u001a\u00020%\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103JS\u0010@\u001a\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\"\u0010<\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:08\u0012\u0004\u0012\u00020:08j\u0002`;2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010H\u001a\u00020:2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IR\u0016\u0010M\u001a\u0004\u0018\u00010J8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001a\u0010\u000b\u001a\u00020\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010CR*\u0010Q\u001a\u0004\u0018\u00010P8\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bW\u0010X\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010\u0010\u001a\u00020\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010Y\u001a\u0004\bZ\u0010[R\"\u0010B\u001a\u00020\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bB\u0010N\u001a\u0004\b\\\u0010C\"\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020>0b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010cR\u001a\u0010\u0002\u001a\u00020\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0002\u0010d\u001a\u0004\be\u0010fR\u0018\u0010g\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\"\u0010p\u001a\u00020\b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0014\u0010v\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010z\u001a\u0004\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010m\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bo\u0010wR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010{\u001a\u0004\b|\u0010}R\u0014\u0010x\u001a\u00020_8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bz\u0010aR'\u0010\u007f\u001a\u00020~8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0087\u0001\u001a\u00020F8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sessionEndedMetricDispatcher", "Lcom/datadog/android/core/sampling/Sampler;", "", "sessionSampler", "", "backgroundTrackingEnabled", "trackFrustrations", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "viewChangedListener", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "cpuVitalMonitor", "memoryVitalMonitor", "frameRateVitalMonitor", "Lcom/datadog/android/rum/RumSessionListener;", "sessionListener", "applicationDisplayed", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "networkSettledResourceIdentifier", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "lastInteractionIdentifier", "Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "slowFramesListener", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "accessibilitySnapshotManager", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/battery/BatteryInfo;", "batteryInfoProvider", "Lcom/datadog/android/rum/internal/domain/display/DisplayInfo;", "displayInfoProvider", "", "sessionInactivityNanos", "sessionMaxDurationNanos", "Lcom/datadog/android/rum/RumSessionType;", "rumSessionTypeOverride", "Lkotlin/Function0;", "Lcom/datadog/android/rum/internal/startup/RumSessionScopeStartupManager;", "rumSessionScopeStartupManagerFactory", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;Lcom/datadog/android/core/sampling/Sampler;ZZLcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/RumSessionListener;ZLcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;Lcom/datadog/android/rum/internal/domain/InfoProvider;Lcom/datadog/android/rum/internal/domain/InfoProvider;JJLcom/datadog/android/rum/RumSessionType;Lkotlin/jvm/functions/Function0;Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;)V", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getRumContext", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "event", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "", "Lcom/datadog/android/api/feature/EventWriteScope;", "writeScope", "Lcom/datadog/android/api/storage/DataWriter;", "", "writer", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "isActive", "()Z", "Lcom/datadog/android/rum/internal/domain/Time;", "p0", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "p1", "getHighSpeedVideoSizes", "(Lcom/datadog/android/rum/internal/domain/Time;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "getActiveView$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "activeView", "Z", "getBackgroundTrackingEnabled$dd_sdk_android_rum_release", "Lcom/datadog/android/rum/internal/domain/scope/RumViewManagerScope;", "childScope", "Lcom/datadog/android/rum/internal/domain/scope/RumViewManagerScope;", "getChildScope$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumViewManagerScope;", "setChildScope$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/scope/RumViewManagerScope;)V", "getChildScope$dd_sdk_android_rum_release$annotations", "()V", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "isActive$dd_sdk_android_rum_release", "setActive$dd_sdk_android_rum_release", "(Z)V", "Ljava/util/concurrent/atomic/AtomicLong;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/atomic/AtomicLong;", "Lcom/datadog/android/api/storage/NoOpDataWriter;", "Lcom/datadog/android/api/storage/NoOpDataWriter;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "getParentScope", "()Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/rum/internal/startup/RumSessionScopeStartupManager;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/core/InternalSdkCore;", "getInputSizeshNQ4ISI", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "getHighSpeedVideoSizesFor", "sessionId", "Ljava/lang/String;", "getSessionId$dd_sdk_android_rum_release", "()Ljava/lang/String;", "setSessionId$dd_sdk_android_rum_release", "(Ljava/lang/String;)V", "getOutputFormats", "J", "getOutputMinFrameDuration", "Lcom/datadog/android/rum/RumSessionListener;", "getInputFormats", "Lcom/datadog/android/core/sampling/Sampler;", "getSessionSampler$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/sampling/Sampler;", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "sessionState", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "getSessionState$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "setSessionState$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;)V", "getOutputStallDuration", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "getOutputMinFrameDurationlomOqCM", "Companion", "StartReason", "State"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumSessionScope implements com.datadog.android.rum.internal.domain.scope.RumScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.domain.scope.RumSessionScope.Companion INSTANCE = new com.datadog.android.rum.internal.domain.scope.RumSessionScope.Companion(null);
    private static final long DEFAULT_SESSION_INACTIVITY_NS = java.util.concurrent.TimeUnit.MINUTES.toNanos(15);
    private static final long DEFAULT_SESSION_MAX_DURATION_NS = java.util.concurrent.TimeUnit.HOURS.toNanos(4);
    public static final java.lang.String RUM_KEEP_SESSION_BUS_MESSAGE_KEY = "keepSession";
    public static final java.lang.String RUM_SESSION_ID_BUS_MESSAGE_KEY = "sessionId";
    public static final java.lang.String RUM_SESSION_RENEWED_BUS_MESSAGE = "rum_session_renewed";
    public static final java.lang.String SESSION_REPLAY_BUS_MESSAGE_TYPE_KEY = "type";
    private final kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager> Camera2StreamConfigurationMap;
    private final boolean backgroundTrackingEnabled;
    private com.datadog.android.rum.internal.domain.scope.RumViewManagerScope childScope;
    private final com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver;
    private final com.datadog.android.core.InternalSdkCore getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges;
    private com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager getHighSpeedVideoFpsRangesFor;
    private final com.datadog.android.api.storage.NoOpDataWriter<java.lang.Object> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final long getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicLong getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.metric.SessionMetricDispatcher getHighSpeedVideoSizesFor;
    private final long getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.datadog.android.rum.RumSessionListener getInputFormats;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason getOutputMinFrameDurationlomOqCM;
    private boolean isActive;
    private final com.datadog.android.rum.internal.domain.scope.RumScope parentScope;
    private java.lang.String sessionId;
    private final com.datadog.android.core.sampling.Sampler<java.lang.String> sessionSampler;
    private com.datadog.android.rum.internal.domain.scope.RumSessionScope.State sessionState;

    public static /* synthetic */ void getChildScope$dd_sdk_android_rum_release$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RumSessionScope(com.datadog.android.rum.internal.domain.scope.RumScope rumScope, com.datadog.android.core.InternalSdkCore internalSdkCore, com.datadog.android.rum.internal.metric.SessionMetricDispatcher sessionMetricDispatcher, com.datadog.android.core.sampling.Sampler<java.lang.String> sampler, boolean z, boolean z2, com.datadog.android.rum.internal.domain.scope.RumViewChangedListener rumViewChangedListener, com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor2, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor3, com.datadog.android.rum.RumSessionListener rumSessionListener, boolean z3, com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier, com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier, com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener slowFramesListener, com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager accessibilitySnapshotManager, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> infoProvider, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> infoProvider2, long j, long j2, com.datadog.android.rum.RumSessionType rumSessionType, kotlin.jvm.functions.Function0<? extends com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager> function0, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionMetricDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sampler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstPartyHostHeaderTypeResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialResourceIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilitySnapshotManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
        this.parentScope = rumScope;
        this.getHighResolutionOutputSizeshNQ4ISI = internalSdkCore;
        this.getHighSpeedVideoSizesFor = sessionMetricDispatcher;
        this.sessionSampler = sampler;
        this.backgroundTrackingEnabled = z;
        this.firstPartyHostHeaderTypeResolver = firstPartyHostHeaderTypeResolver;
        this.getInputFormats = rumSessionListener;
        this.getOutputFormats = j;
        this.getInputSizeshNQ4ISI = j2;
        this.Camera2StreamConfigurationMap = function0;
        this.sessionId = com.datadog.android.rum.internal.domain.RumContext.INSTANCE.getNULL_UUID();
        this.sessionState = com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.NOT_TRACKED;
        this.getOutputMinFrameDurationlomOqCM = com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.USER_APP_LAUNCH;
        this.isActive = true;
        this.getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicLong(internalSdkCore.getTimeProvider().getDeviceElapsedTimeNanos());
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong(0L);
        this.getHighSpeedVideoSizes = new com.datadog.android.api.storage.NoOpDataWriter<>();
        com.datadog.android.rum.internal.domain.scope.RumSessionScope rumSessionScope = this;
        java.lang.Float sampleRate = sampler.getSampleRate();
        this.childScope = new com.datadog.android.rum.internal.domain.scope.RumViewManagerScope(rumSessionScope, internalSdkCore, sessionMetricDispatcher, z, z2, rumViewChangedListener, firstPartyHostHeaderTypeResolver, vitalMonitor, vitalMonitor2, vitalMonitor3, z3, sampleRate != null ? sampleRate.floatValue() : 100.0f, initialResourceIdentifier, slowFramesListener, lastInteractionIdentifier, rumSessionType, accessibilitySnapshotManager, infoProvider, infoProvider2, insightsCollector);
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final java.util.Map<java.lang.String, java.lang.Object> getCustomAttributes() {
        return com.datadog.android.rum.internal.domain.scope.RumScope.DefaultImpls.getCustomAttributes(this);
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final com.datadog.android.rum.internal.domain.scope.RumScope getParentScope() {
        return this.parentScope;
    }

    public final com.datadog.android.core.sampling.Sampler<java.lang.String> getSessionSampler$dd_sdk_android_rum_release() {
        return this.sessionSampler;
    }

    /* renamed from: getBackgroundTrackingEnabled$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getBackgroundTrackingEnabled() {
        return this.backgroundTrackingEnabled;
    }

    /* renamed from: getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver getFirstPartyHostHeaderTypeResolver() {
        return this.firstPartyHostHeaderTypeResolver;
    }

    public /* synthetic */ RumSessionScope(com.datadog.android.rum.internal.domain.scope.RumScope rumScope, com.datadog.android.core.InternalSdkCore internalSdkCore, com.datadog.android.rum.internal.metric.SessionMetricDispatcher sessionMetricDispatcher, com.datadog.android.core.sampling.Sampler sampler, boolean z, boolean z2, com.datadog.android.rum.internal.domain.scope.RumViewChangedListener rumViewChangedListener, com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor2, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor3, com.datadog.android.rum.RumSessionListener rumSessionListener, boolean z3, com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier, com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier, com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener slowFramesListener, com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager accessibilitySnapshotManager, com.datadog.android.rum.internal.domain.InfoProvider infoProvider, com.datadog.android.rum.internal.domain.InfoProvider infoProvider2, long j, long j2, com.datadog.android.rum.RumSessionType rumSessionType, kotlin.jvm.functions.Function0 function0, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(rumScope, internalSdkCore, sessionMetricDispatcher, sampler, z, z2, rumViewChangedListener, firstPartyHostHeaderTypeResolver, vitalMonitor, vitalMonitor2, vitalMonitor3, rumSessionListener, z3, initialResourceIdentifier, lastInteractionIdentifier, slowFramesListener, accessibilitySnapshotManager, infoProvider, infoProvider2, (i & 524288) != 0 ? DEFAULT_SESSION_INACTIVITY_NS : j, (i & 1048576) != 0 ? DEFAULT_SESSION_MAX_DURATION_NS : j2, rumSessionType, function0, insightsCollector);
    }

    /* renamed from: getSessionId$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId$dd_sdk_android_rum_release(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.sessionId = str;
    }

    /* renamed from: getSessionState$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.domain.scope.RumSessionScope.State getSessionState() {
        return this.sessionState;
    }

    public final void setSessionState$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.scope.RumSessionScope.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.sessionState = state;
    }

    public final boolean isActive$dd_sdk_android_rum_release() {
        return this.isActive;
    }

    public final void setActive$dd_sdk_android_rum_release(boolean z) {
        this.isActive = z;
    }

    /* renamed from: getChildScope$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.domain.scope.RumViewManagerScope getChildScope() {
        return this.childScope;
    }

    public final void setChildScope$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.scope.RumViewManagerScope rumViewManagerScope) {
        this.childScope = rumViewManagerScope;
    }

    public final com.datadog.android.rum.internal.domain.scope.RumViewScope getActiveView$dd_sdk_android_rum_release() {
        com.datadog.android.rum.internal.domain.scope.RumViewManagerScope rumViewManagerScope;
        if (!getIsActive() || (rumViewManagerScope = this.childScope) == null || rumViewManagerScope == null) {
            return null;
        }
        return rumViewManagerScope.getActiveView$dd_sdk_android_rum_release();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "asString", "Ljava/lang/String;", "getAsString", "()Ljava/lang/String;", "Companion", "NOT_TRACKED", "TRACKED", "EXPIRED"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum State {
        NOT_TRACKED("NOT_TRACKED"),
        TRACKED("TRACKED"),
        EXPIRED("EXPIRED");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.Companion INSTANCE = new com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.Companion(null);
        private final java.lang.String asString;

        State(java.lang.String str) {
            this.asString = str;
        }

        public final java.lang.String getAsString() {
            return this.asString;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State$Companion;", "", "<init>", "()V", "", "string", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "fromString", "(Ljava/lang/String;)Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final com.datadog.android.rum.internal.domain.scope.RumSessionScope.State fromString(java.lang.String string) {
                for (com.datadog.android.rum.internal.domain.scope.RumSessionScope.State state : com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(state.getAsString(), string)) {
                        return state;
                    }
                }
                return null;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "asString", "Ljava/lang/String;", "getAsString", "()Ljava/lang/String;", "Companion", "USER_APP_LAUNCH", "INACTIVITY_TIMEOUT", "MAX_DURATION", "BACKGROUND_LAUNCH", "PREWARM", "FROM_NON_INTERACTIVE_SESSION", "EXPLICIT_STOP"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum StartReason {
        USER_APP_LAUNCH("user_app_launch"),
        INACTIVITY_TIMEOUT("inactivity_timeout"),
        MAX_DURATION(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_MAX_DURATION),
        BACKGROUND_LAUNCH("background_launch"),
        PREWARM("prewarm"),
        FROM_NON_INTERACTIVE_SESSION("from_non_interactive_session"),
        EXPLICIT_STOP("explicit_stop");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.Companion INSTANCE = new com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.Companion(null);
        private final java.lang.String asString;

        StartReason(java.lang.String str) {
            this.asString = str;
        }

        public final java.lang.String getAsString() {
            return this.asString;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason$Companion;", "", "<init>", "()V", "", "string", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "fromString", "(Ljava/lang/String;)Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason fromString(java.lang.String string) {
                for (com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason : com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(startReason.getAsString(), string)) {
                        return startReason;
                    }
                }
                return null;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111  */
    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.datadog.android.rum.internal.domain.scope.RumScope handleEvent(com.datadog.android.rum.internal.domain.scope.RumRawEvent event, com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> writeScope, com.datadog.android.api.storage.DataWriter<java.lang.Object> writer) {
        com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason;
        com.datadog.android.api.feature.FeatureScope feature;
        com.datadog.android.rum.internal.domain.scope.RumViewScope activeView$dd_sdk_android_rum_release;
        com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager rumSessionScopeStartupManager;
        com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager rumSessionScopeStartupManager2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResetSession) {
            getHighSpeedVideoSizes(event.getEventTime(), com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.EXPLICIT_STOP);
        } else if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopSession) {
            this.isActive = false;
            this.getHighSpeedVideoSizesFor.onSessionStopped(this.sessionId);
        }
        long deviceElapsedTimeNanos = this.getHighResolutionOutputSizeshNQ4ISI.getTimeProvider().getDeviceElapsedTimeNanos();
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, com.datadog.android.rum.internal.domain.RumContext.INSTANCE.getNULL_UUID());
        boolean z = deviceElapsedTimeNanos - this.getHighSpeedVideoFpsRanges.get() >= this.getOutputFormats;
        boolean z2 = deviceElapsedTimeNanos - this.getOutputMinFrameDuration.get() >= this.getInputSizeshNQ4ISI;
        boolean z3 = (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView) || (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction);
        boolean contains = kotlin.collections.ArraysKt.contains(com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.INSTANCE.getValidBackgroundEventTypes$dd_sdk_android_rum_release(), event.getClass());
        boolean z4 = event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.SdkInit;
        boolean z5 = z4 && ((com.datadog.android.rum.internal.domain.scope.RumRawEvent.SdkInit) event).isAppInForeground();
        boolean z6 = z4 && !((com.datadog.android.rum.internal.domain.scope.RumRawEvent.SdkInit) event).isAppInForeground();
        if (z || z2 || !this.isActive) {
            this.getHighSpeedVideoSizesFor.endMetric(this.sessionId, this.getHighResolutionOutputSizeshNQ4ISI.getTime().getServerTimeOffsetMs());
        }
        if (!z3 && !z5) {
            if (z) {
                if (this.backgroundTrackingEnabled && (contains || z6)) {
                    getHighSpeedVideoSizes(event.getEventTime(), com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.BACKGROUND_LAUNCH);
                } else {
                    this.sessionState = com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.EXPIRED;
                }
            } else if (z2) {
                getHighSpeedVideoSizes(event.getEventTime(), com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.MAX_DURATION);
            }
            com.datadog.android.rum.internal.domain.scope.RumSessionScope.State state = this.sessionState;
            java.lang.String str = this.sessionId;
            boolean z7 = state != com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.TRACKED;
            feature = this.getHighResolutionOutputSizeshNQ4ISI.getFeature("session-replay");
            if (feature != null) {
                feature.sendEvent(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", "rum_session_renewed"), kotlin.TuplesKt.to("keepSession", java.lang.Boolean.valueOf(z7)), kotlin.TuplesKt.to("sessionId", str)));
            }
            com.datadog.android.api.storage.DataWriter<java.lang.Object> dataWriter = this.sessionState == com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.TRACKED ? this.getHighSpeedVideoSizes : writer;
            activeView$dd_sdk_android_rum_release = getActiveView$dd_sdk_android_rum_release();
            if (activeView$dd_sdk_android_rum_release != null || (r2 = activeView$dd_sdk_android_rum_release.getRumContext()) == null) {
                com.datadog.android.rum.internal.domain.RumContext rumContext = getRumContext();
            }
            com.datadog.android.rum.internal.domain.RumContext rumContext2 = rumContext;
            if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AppStartTTIDEvent)) {
                if (this.sessionState == com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.TRACKED) {
                    com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager rumSessionScopeStartupManager3 = this.getHighSpeedVideoFpsRangesFor;
                    if (rumSessionScopeStartupManager3 != null) {
                        rumSessionScopeStartupManager3.onTTIDEvent((com.datadog.android.rum.internal.domain.scope.RumRawEvent.AppStartTTIDEvent) event, datadogContext, writeScope, dataWriter, rumContext2, getCustomAttributes());
                    }
                } else {
                    com.datadog.android.api.feature.FeatureScope feature2 = this.getHighResolutionOutputSizeshNQ4ISI.getFeature("profiling");
                    if (feature2 != null) {
                        feature2.sendEvent(new com.datadog.android.internal.profiling.ProfilerStopEvent.TTID(null, 1, null));
                    }
                }
            } else if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AppStartEvent) {
                if (this.sessionState == com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.TRACKED && (rumSessionScopeStartupManager2 = this.getHighSpeedVideoFpsRangesFor) != null) {
                    rumSessionScopeStartupManager2.onAppStartEvent((com.datadog.android.rum.internal.domain.scope.RumRawEvent.AppStartEvent) event);
                }
            } else if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AppStartTTFDEvent) {
                if (this.sessionState == com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.TRACKED && (rumSessionScopeStartupManager = this.getHighSpeedVideoFpsRangesFor) != null) {
                    rumSessionScopeStartupManager.onTTFDEvent((com.datadog.android.rum.internal.domain.scope.RumRawEvent.AppStartTTFDEvent) event, datadogContext, writeScope, dataWriter, rumContext2, getCustomAttributes());
                }
            } else if (!z4) {
                com.datadog.android.rum.internal.domain.scope.RumViewManagerScope rumViewManagerScope = this.childScope;
                com.datadog.android.rum.internal.domain.scope.RumScope handleEvent = rumViewManagerScope != null ? rumViewManagerScope.handleEvent(event, datadogContext, writeScope, dataWriter) : null;
                this.childScope = handleEvent instanceof com.datadog.android.rum.internal.domain.scope.RumViewManagerScope ? (com.datadog.android.rum.internal.domain.scope.RumViewManagerScope) handleEvent : null;
            }
            if (this.isActive && this.childScope == null) {
                return null;
            }
            return this;
        }
        if (areEqual || z || z2) {
            if (areEqual) {
                startReason = com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.USER_APP_LAUNCH;
            } else if (z) {
                startReason = com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.INACTIVITY_TIMEOUT;
            } else {
                startReason = com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.MAX_DURATION;
            }
            getHighSpeedVideoSizes(event.getEventTime(), startReason);
        }
        this.getHighSpeedVideoFpsRanges.set(deviceElapsedTimeNanos);
        com.datadog.android.rum.internal.domain.scope.RumSessionScope.State state2 = this.sessionState;
        java.lang.String str2 = this.sessionId;
        if (state2 != com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.TRACKED) {
        }
        feature = this.getHighResolutionOutputSizeshNQ4ISI.getFeature("session-replay");
        if (feature != null) {
        }
        if (this.sessionState == com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.TRACKED) {
        }
        activeView$dd_sdk_android_rum_release = getActiveView$dd_sdk_android_rum_release();
        if (activeView$dd_sdk_android_rum_release != null) {
        }
        com.datadog.android.rum.internal.domain.RumContext rumContext3 = getRumContext();
        com.datadog.android.rum.internal.domain.RumContext rumContext22 = rumContext3;
        if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AppStartTTIDEvent)) {
        }
        if (this.isActive) {
        }
        return this;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final com.datadog.android.rum.internal.domain.RumContext getRumContext() {
        com.datadog.android.rum.internal.domain.RumContext copy;
        copy = r2.copy((r34 & 1) != 0 ? r2.applicationId : null, (r34 & 2) != 0 ? r2.sessionId : this.sessionId, (r34 & 4) != 0 ? r2.isSessionActive : this.isActive, (r34 & 8) != 0 ? r2.viewId : null, (r34 & 16) != 0 ? r2.viewName : null, (r34 & 32) != 0 ? r2.viewUrl : null, (r34 & 64) != 0 ? r2.actionId : null, (r34 & 128) != 0 ? r2.sessionState : this.sessionState, (r34 & 256) != 0 ? r2.sessionStartReason : this.getOutputMinFrameDurationlomOqCM, (r34 & 512) != 0 ? r2.viewType : null, (r34 & 1024) != 0 ? r2.syntheticsTestId : null, (r34 & 2048) != 0 ? r2.syntheticsResultId : null, (r34 & 4096) != 0 ? r2.viewTimestamp : 0L, (r34 & 8192) != 0 ? r2.viewTimestampOffset : 0L, (r34 & 16384) != 0 ? getParentScope().getRumContext().hasReplay : false);
        return copy;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    private final void getHighSpeedVideoSizes(com.datadog.android.rum.internal.domain.Time p0, com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason p1) {
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        boolean sample = this.sessionSampler.sample(obj);
        this.getOutputMinFrameDurationlomOqCM = p1;
        this.sessionState = sample ? com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.TRACKED : com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.NOT_TRACKED;
        this.sessionId = obj;
        this.getOutputMinFrameDuration.set(p0.getNanoTime());
        this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.invoke();
        com.datadog.android.rum.internal.domain.scope.RumViewManagerScope rumViewManagerScope = this.childScope;
        if (rumViewManagerScope != null) {
            rumViewManagerScope.renewViewScopes$dd_sdk_android_rum_release(p0);
        }
        if (sample) {
            this.getHighSpeedVideoSizesFor.startMetric(this.sessionId, p1, this.getHighResolutionOutputSizeshNQ4ISI.getTime().getServerTimeOffsetMs(), this.backgroundTrackingEnabled);
        }
        com.datadog.android.rum.RumSessionListener rumSessionListener = this.getInputFormats;
        if (rumSessionListener != null) {
            rumSessionListener.onSessionStarted(this.sessionId, !sample);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0010\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$Companion;", "", "<init>", "()V", "", "DEFAULT_SESSION_INACTIVITY_NS", "J", "getDEFAULT_SESSION_INACTIVITY_NS$dd_sdk_android_rum_release", "()J", "DEFAULT_SESSION_MAX_DURATION_NS", "getDEFAULT_SESSION_MAX_DURATION_NS$dd_sdk_android_rum_release", "", "RUM_KEEP_SESSION_BUS_MESSAGE_KEY", "Ljava/lang/String;", "RUM_SESSION_ID_BUS_MESSAGE_KEY", "RUM_SESSION_RENEWED_BUS_MESSAGE", "SESSION_REPLAY_BUS_MESSAGE_TYPE_KEY"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long getDEFAULT_SESSION_INACTIVITY_NS$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.domain.scope.RumSessionScope.DEFAULT_SESSION_INACTIVITY_NS;
        }

        public final long getDEFAULT_SESSION_MAX_DURATION_NS$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.domain.scope.RumSessionScope.DEFAULT_SESSION_MAX_DURATION_NS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

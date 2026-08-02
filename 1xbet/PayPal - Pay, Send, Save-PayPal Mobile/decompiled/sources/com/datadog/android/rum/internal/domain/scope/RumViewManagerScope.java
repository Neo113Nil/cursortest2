package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000 w2\u00020\u0001:\u0001wB»\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*JS\u00107\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\"\u00103\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/\u0012\u0004\u0012\u0002010/j\u0002`22\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u0002012\u0006\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u0004\u0018\u00010B8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\"\u0010\u0012\u001a\u00020\u00078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u0010:\"\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010LR \u0010N\u001a\b\u0012\u0004\u0012\u00020B0M8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010RR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\"0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010LR\u001a\u0010\r\u001a\u00020\f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bW\u0010RR\u001a\u0010\u0016\u001a\u00020\u00158\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010W\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020^8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bX\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\\\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b`\u0010RR\u001a\u0010\u0002\u001a\u00020\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0002\u0010c\u001a\u0004\bd\u0010eR\u0016\u0010h\u001a\u0004\u0018\u00010\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001a\u0010\u0014\u001a\u00020\u00138\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010i\u001a\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010f\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010l\u001a\u0004\u0018\u00010\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\"\u0010r\u001a\u00020\u00078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\br\u0010F\u001a\u0004\bs\u0010:\"\u0004\bt\u0010IR\u0014\u0010p\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bh\u0010FR\u0016\u0010u\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bu\u0010v"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewManagerScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sessionEndedMetricDispatcher", "", "backgroundTrackingEnabled", "trackFrustrations", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "viewChangedListener", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "cpuVitalMonitor", "memoryVitalMonitor", "frameRateVitalMonitor", "applicationDisplayed", "", "sampleRate", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "initialResourceIdentifier", "Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "slowFramesListener", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "lastInteractionIdentifier", "Lcom/datadog/android/rum/RumSessionType;", "rumSessionTypeOverride", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "accessibilitySnapshotManager", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/battery/BatteryInfo;", "batteryInfoProvider", "Lcom/datadog/android/rum/internal/domain/display/DisplayInfo;", "displayInfoProvider", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;ZZLcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;ZFLcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;Lcom/datadog/android/rum/RumSessionType;Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;Lcom/datadog/android/rum/internal/domain/InfoProvider;Lcom/datadog/android/rum/internal/domain/InfoProvider;Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;)V", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getRumContext", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "event", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "", "Lcom/datadog/android/api/feature/EventWriteScope;", "writeScope", "Lcom/datadog/android/api/storage/DataWriter;", "", "writer", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "isActive", "()Z", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "renewViewScopes$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/Time;)V", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "getActiveView$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "activeView", "Z", "getApplicationDisplayed$dd_sdk_android_rum_release", "setApplicationDisplayed$dd_sdk_android_rum_release", "(Z)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "", "childrenScopes", "Ljava/util/List;", "getChildrenScopes$dd_sdk_android_rum_release", "()Ljava/util/List;", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "getHighSpeedVideoSizes", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getInputSizeshNQ4ISI", "getInputFormats", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "getInitialResourceIdentifier$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "getOutputFormats", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/rum/internal/domain/Time;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "getParentScope", "()Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "getOutputStallDuration", "Lcom/datadog/android/rum/RumSessionType;", "getOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSampleRate$dd_sdk_android_rum_release", "()F", "getOutputStallDurationlomOqCM", "Lcom/datadog/android/core/InternalSdkCore;", "getOutputSizes", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "getOutputMinFrameDurationlomOqCM", "Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "stopped", "getStopped$dd_sdk_android_rum_release", "setStopped$dd_sdk_android_rum_release", "getValidOutputFormatsForInputhNQ4ISI", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumViewManagerScope implements com.datadog.android.rum.internal.domain.scope.RumScope {
    public static final java.lang.String ATTR_GAP_BETWEEN_VIEWS = "view_gap";
    public static final java.lang.String MESSAGE_MISSING_VIEW = "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
    public static final java.lang.String MESSAGE_UNKNOWN_MISSED_TYPE = "An RUM event was detected, but no view is active, its missed type is unknown";
    public static final java.lang.String MULTIPLE_ACTIVE_VIEWS_ERROR = "Multiple views are active at the same time, this shouldn't happen.";
    public static final java.lang.String NO_ACTIVE_VIEW_FOR_LOADING_TIME_WARNING_MESSAGE = "No active view found to add the loading time.";
    public static final java.lang.String RUM_APP_LAUNCH_VIEW_ID = "com.datadog.application-launch.view";
    public static final java.lang.String RUM_APP_LAUNCH_VIEW_NAME = "ApplicationLaunch";
    public static final java.lang.String RUM_APP_LAUNCH_VIEW_URL = "com/datadog/application-launch/view";
    public static final java.lang.String RUM_BACKGROUND_VIEW_ID = "com.datadog.background.view";
    public static final java.lang.String RUM_BACKGROUND_VIEW_NAME = "Background";
    public static final java.lang.String RUM_BACKGROUND_VIEW_URL = "com/datadog/background/view";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> getHighSpeedVideoFpsRanges;
    private boolean applicationDisplayed;
    private final java.util.List<com.datadog.android.rum.internal.domain.scope.RumViewScope> childrenScopes;
    private final com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.vitals.VitalMonitor getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> getHighResolutionOutputSizeshNQ4ISI;
    private com.datadog.android.rum.internal.domain.Time getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.vitals.VitalMonitor getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.vitals.VitalMonitor getOutputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener getOutputStallDurationlomOqCM;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.metric.SessionMetricDispatcher getOutputStallDuration;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final com.datadog.android.rum.RumSessionType getOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final com.datadog.android.core.InternalSdkCore getOutputSizes;
    private final com.datadog.android.rum.internal.domain.scope.RumViewChangedListener getValidOutputFormatsForInputhNQ4ISI;
    private final com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier;
    private final com.datadog.android.rum.internal.domain.scope.RumScope parentScope;
    private final float sampleRate;
    private boolean stopped;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.Companion INSTANCE = new com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.Companion(null);
    private static final java.lang.Class<?>[] validBackgroundEventTypes = {com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartFeatureOperation.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation.class};
    private static final java.lang.Class<?>[] silentOrphanEventTypes = {com.datadog.android.rum.internal.domain.scope.RumRawEvent.ApplicationStarted.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResetSession.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionDropped.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionSent.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorDropped.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorSent.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskDropped.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskSent.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceDropped.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceSent.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdatePerformanceMetric.class, com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdateExternalRefreshRate.class};
    private static final long THREE_SECONDS_GAP_NS = java.util.concurrent.TimeUnit.SECONDS.toNanos(3);

    public RumViewManagerScope(com.datadog.android.rum.internal.domain.scope.RumScope rumScope, com.datadog.android.core.InternalSdkCore internalSdkCore, com.datadog.android.rum.internal.metric.SessionMetricDispatcher sessionMetricDispatcher, boolean z, boolean z2, com.datadog.android.rum.internal.domain.scope.RumViewChangedListener rumViewChangedListener, com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor2, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor3, boolean z3, float f, com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier, com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener slowFramesListener, com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier, com.datadog.android.rum.RumSessionType rumSessionType, com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager accessibilitySnapshotManager, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> infoProvider, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> infoProvider2, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionMetricDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstPartyHostHeaderTypeResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialResourceIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilitySnapshotManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
        this.parentScope = rumScope;
        this.getOutputSizes = internalSdkCore;
        this.getOutputStallDuration = sessionMetricDispatcher;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getOutputMinFrameDurationlomOqCM = z2;
        this.getValidOutputFormatsForInputhNQ4ISI = rumViewChangedListener;
        this.firstPartyHostHeaderTypeResolver = firstPartyHostHeaderTypeResolver;
        this.getHighSpeedVideoSizes = vitalMonitor;
        this.getOutputFormats = vitalMonitor2;
        this.getInputFormats = vitalMonitor3;
        this.applicationDisplayed = z3;
        this.sampleRate = f;
        this.initialResourceIdentifier = initialResourceIdentifier;
        this.getOutputStallDurationlomOqCM = slowFramesListener;
        this.getOutputSizeshNQ4ISI = rumSessionType;
        this.Camera2StreamConfigurationMap = accessibilitySnapshotManager;
        this.getHighSpeedVideoFpsRanges = infoProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = infoProvider2;
        this.getInputSizeshNQ4ISI = insightsCollector;
        this.getOutputMinFrameDuration = new com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver(internalSdkCore.getInternalLogger(), null, lastInteractionIdentifier, 2, null);
        this.childrenScopes = new java.util.ArrayList();
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final java.util.Map<java.lang.String, java.lang.Object> getCustomAttributes() {
        return com.datadog.android.rum.internal.domain.scope.RumScope.DefaultImpls.getCustomAttributes(this);
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final com.datadog.android.rum.internal.domain.scope.RumScope getParentScope() {
        return this.parentScope;
    }

    /* renamed from: getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver getFirstPartyHostHeaderTypeResolver() {
        return this.firstPartyHostHeaderTypeResolver;
    }

    /* renamed from: getApplicationDisplayed$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getApplicationDisplayed() {
        return this.applicationDisplayed;
    }

    public final void setApplicationDisplayed$dd_sdk_android_rum_release(boolean z) {
        this.applicationDisplayed = z;
    }

    /* renamed from: getSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: getInitialResourceIdentifier$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier getInitialResourceIdentifier() {
        return this.initialResourceIdentifier;
    }

    public final java.util.List<com.datadog.android.rum.internal.domain.scope.RumViewScope> getChildrenScopes$dd_sdk_android_rum_release() {
        return this.childrenScopes;
    }

    public final com.datadog.android.rum.internal.domain.scope.RumViewScope getActiveView$dd_sdk_android_rum_release() {
        if (!getIsActive()) {
            return null;
        }
        java.util.List<com.datadog.android.rum.internal.domain.scope.RumViewScope> list = this.childrenScopes;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.datadog.android.rum.internal.domain.scope.RumViewScope) obj).getIsActive()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.size() > 1) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$activeView$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.MULTIPLE_ACTIVE_VIEWS_ERROR;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        return (com.datadog.android.rum.internal.domain.scope.RumViewScope) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) arrayList2);
    }

    /* renamed from: getStopped$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getStopped() {
        return this.stopped;
    }

    public final void setStopped$dd_sdk_android_rum_release(boolean z) {
        this.stopped = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ac, code lost:
    
        if (r5 == 0) goto L75;
     */
    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.datadog.android.rum.internal.domain.scope.RumScope handleEvent(final com.datadog.android.rum.internal.domain.scope.RumRawEvent event, com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> writeScope, com.datadog.android.api.storage.DataWriter<java.lang.Object> writer) {
        kotlin.Unit unit;
        com.datadog.android.rum.internal.domain.scope.RumScopeKey key;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        if ((event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ApplicationStarted) && !this.applicationDisplayed && !this.stopped) {
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.ApplicationStarted applicationStarted = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.ApplicationStarted) event;
            com.datadog.android.rum.internal.domain.Time eventTime = applicationStarted.getEventTime();
            com.datadog.android.rum.internal.domain.scope.RumViewType rumViewType = com.datadog.android.rum.internal.domain.scope.RumViewType.APPLICATION_LAUNCH;
            com.datadog.android.rum.internal.domain.scope.RumViewManagerScope rumViewManagerScope = this;
            com.datadog.android.rum.internal.domain.scope.RumViewScope rumViewScope = new com.datadog.android.rum.internal.domain.scope.RumViewScope(rumViewManagerScope, this.getOutputSizes, this.getOutputStallDuration, new com.datadog.android.rum.internal.domain.scope.RumScopeKey(RUM_APP_LAUNCH_VIEW_ID, RUM_APP_LAUNCH_VIEW_URL, RUM_APP_LAUNCH_VIEW_NAME), eventTime, kotlin.collections.MapsKt.emptyMap(), this.getValidOutputFormatsForInputhNQ4ISI, this.firstPartyHostHeaderTypeResolver, new com.datadog.android.rum.internal.vitals.NoOpVitalMonitor(), new com.datadog.android.rum.internal.vitals.NoOpVitalMonitor(), new com.datadog.android.rum.internal.vitals.NoOpVitalMonitor(), null, rumViewType, this.getOutputMinFrameDurationlomOqCM, this.sampleRate, this.getOutputMinFrameDuration, new com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver(this.initialResourceIdentifier, this.getOutputSizes.getInternalLogger()), this.getOutputStallDurationlomOqCM, new com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher(rumViewType, this.getOutputSizes.getInternalLogger(), null, 0.0f, 12, null), this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, 2048, null);
            this.applicationDisplayed = true;
            rumViewScope.handleEvent(applicationStarted, datadogContext, writeScope, writer);
            this.childrenScopes.add(rumViewScope);
            return rumViewManagerScope;
        }
        final boolean isEmpty = this.childrenScopes.isEmpty();
        java.util.Iterator<com.datadog.android.rum.internal.domain.scope.RumViewScope> it = this.childrenScopes.iterator();
        boolean z = false;
        while (true) {
            java.lang.String str = null;
            if (!it.hasNext()) {
                break;
            }
            com.datadog.android.rum.internal.domain.scope.RumViewScope next = it.next();
            z |= next.getIsActive();
            if ((event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView) && next.getIsActive()) {
                com.datadog.android.rum.internal.domain.scope.RumViewScope rumViewScope2 = next instanceof com.datadog.android.rum.internal.domain.scope.RumViewScope ? next : null;
                if (rumViewScope2 != null && (key = rumViewScope2.getKey()) != null) {
                    str = key.getId();
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(str, ((com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView) event).getKey().getId())) {
                    this.getHighSpeedVideoSizesFor = event.getEventTime();
                }
            }
            if (next.handleEvent(event, datadogContext, writeScope, writer) == null) {
                it.remove();
            }
        }
        boolean z2 = event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewLoadingTime;
        if (z2 && !z) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$delegateToChildren$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.NO_ACTIVE_VIEW_FOR_LOADING_TIME_WARNING_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            com.datadog.android.api.InternalLogger.DefaultImpls.logApiUsage$default(this.getOutputSizes.getInternalLogger(), 0.0f, new kotlin.jvm.functions.Function0<com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$delegateToChildren$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage invoke() {
                    boolean overwrite = ((com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewLoadingTime) com.datadog.android.rum.internal.domain.scope.RumRawEvent.this).getOverwrite();
                    boolean z3 = isEmpty;
                    return new com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddViewLoadingTime(overwrite, z3, !z3, null, 8, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, 1, null);
        }
        if ((event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView) && !this.stopped) {
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView startView = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView) event;
            com.datadog.android.rum.internal.domain.scope.RumViewScope fromEvent$dd_sdk_android_rum_release = com.datadog.android.rum.internal.domain.scope.RumViewScope.INSTANCE.fromEvent$dd_sdk_android_rum_release(this, this.getOutputStallDuration, this.getOutputSizes, startView, this.getValidOutputFormatsForInputhNQ4ISI, this.firstPartyHostHeaderTypeResolver, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getInputFormats, this.getOutputMinFrameDurationlomOqCM, this.sampleRate, this.getOutputMinFrameDuration, this.initialResourceIdentifier, this.getOutputStallDurationlomOqCM, this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI);
            this.applicationDisplayed = true;
            this.childrenScopes.add(fromEvent$dd_sdk_android_rum_release);
            com.datadog.android.rum.internal.domain.scope.RumViewChangedListener rumViewChangedListener = this.getValidOutputFormatsForInputhNQ4ISI;
            if (rumViewChangedListener != null) {
                rumViewChangedListener.onViewChanged(new com.datadog.android.rum.internal.domain.scope.RumViewInfo(startView.getKey(), startView.getAttributes(), true));
            }
            java.util.Iterator<T> it2 = this.childrenScopes.iterator();
            while (it2.hasNext()) {
                com.datadog.android.rum.internal.domain.scope.RumViewScope.sendViewUpdate$dd_sdk_android_rum_release$default((com.datadog.android.rum.internal.domain.scope.RumViewScope) it2.next(), event, datadogContext, writeScope, writer, null, 16, null);
            }
            com.datadog.android.rum.internal.domain.Time time = this.getHighSpeedVideoSizesFor;
            if (time != null) {
                final long nanoTime = event.getEventTime().getNanoTime() - time.getNanoTime();
                if (1 <= nanoTime && nanoTime < THREE_SECONDS_GAP_NS) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.logMetric$default(this.getOutputSizes.getInternalLogger(), new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleEvent$1$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String format = java.lang.String.format(java.util.Locale.US, "[Mobile Metric] Gap between views", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(nanoTime)}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            return format;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(ATTR_GAP_BETWEEN_VIEWS, java.lang.Long.valueOf(nanoTime))), com.datadog.android.core.metrics.MethodCallSamplingRate.MEDIUM.getRate(), null, 8, null);
                } else if (nanoTime < 0) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.logMetric$default(this.getOutputSizes.getInternalLogger(), new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleEvent$1$2
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String format = java.lang.String.format(java.util.Locale.US, "[Mobile Metric] Negative gap between views", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(nanoTime)}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            return format;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(ATTR_GAP_BETWEEN_VIEWS, java.lang.Long.valueOf(nanoTime))), com.datadog.android.core.metrics.MethodCallSamplingRate.MEDIUM.getRate(), null, 8, null);
                }
            }
            this.getHighSpeedVideoSizesFor = null;
        } else if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopSession) {
            this.stopped = true;
        } else {
            java.util.List<com.datadog.android.rum.internal.domain.scope.RumViewScope> list = this.childrenScopes;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it3 = list.iterator();
                int i = 0;
                while (it3.hasNext()) {
                    if (((com.datadog.android.rum.internal.domain.scope.RumViewScope) it3.next()).getIsActive() && (i = i + 1) < 0) {
                        kotlin.collections.CollectionsKt.throwCountOverflow();
                    }
                }
            }
            boolean z3 = com.datadog.android.rum.DdRumContentProvider.INSTANCE.getProcessImportance() == 100;
            if (z2) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleOrphanEvent$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.MESSAGE_MISSING_VIEW;
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            } else {
                if (!this.applicationDisplayed && z3) {
                    if (!kotlin.collections.ArraysKt.contains(silentOrphanEventTypes, event.getClass())) {
                        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleOrphanEvent$2
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                            public final java.lang.String invoke() {
                                return com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.MESSAGE_MISSING_VIEW;
                            }
                        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    }
                } else if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError) || !(((com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError) event).getThrowable() instanceof com.datadog.android.rum.internal.anr.ANRException)) {
                    boolean contains = kotlin.collections.ArraysKt.contains(validBackgroundEventTypes, event.getClass());
                    boolean contains2 = kotlin.collections.ArraysKt.contains(silentOrphanEventTypes, event.getClass());
                    if (contains && this.getHighSpeedVideoFpsRangesFor) {
                        com.datadog.android.rum.internal.domain.scope.RumViewType rumViewType2 = com.datadog.android.rum.internal.domain.scope.RumViewType.BACKGROUND;
                        com.datadog.android.rum.internal.domain.scope.RumViewScope rumViewScope3 = new com.datadog.android.rum.internal.domain.scope.RumViewScope(this, this.getOutputSizes, this.getOutputStallDuration, new com.datadog.android.rum.internal.domain.scope.RumScopeKey(RUM_BACKGROUND_VIEW_ID, RUM_BACKGROUND_VIEW_URL, RUM_BACKGROUND_VIEW_NAME), event.getEventTime(), kotlin.collections.MapsKt.emptyMap(), this.getValidOutputFormatsForInputhNQ4ISI, this.firstPartyHostHeaderTypeResolver, new com.datadog.android.rum.internal.vitals.NoOpVitalMonitor(), new com.datadog.android.rum.internal.vitals.NoOpVitalMonitor(), new com.datadog.android.rum.internal.vitals.NoOpVitalMonitor(), null, rumViewType2, this.getOutputMinFrameDurationlomOqCM, this.sampleRate, this.getOutputMinFrameDuration, new com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver(this.initialResourceIdentifier, this.getOutputSizes.getInternalLogger()), this.getOutputStallDurationlomOqCM, new com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher(rumViewType2, this.getOutputSizes.getInternalLogger(), null, 0.0f, 12, null), this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, 2048, null);
                        rumViewScope3.handleEvent(event, datadogContext, writeScope, writer);
                        this.childrenScopes.add(rumViewScope3);
                        this.getHighSpeedVideoSizesFor = null;
                    } else if (!contains2) {
                        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                            public final java.lang.String invoke() {
                                return com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.MESSAGE_MISSING_VIEW;
                            }
                        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    }
                }
                com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType fromRawEvent = com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType.INSTANCE.fromRawEvent(event);
                if (fromRawEvent != null) {
                    this.getOutputStallDuration.onMissedEventTracked(getParentScope().getGetHighSpeedVideoSizes().getSessionId(), fromRawEvent);
                    unit = kotlin.Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleOrphanEvent$4
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.MESSAGE_UNKNOWN_MISSED_TYPE;
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                }
            }
        }
        if (this.stopped && this.childrenScopes.isEmpty()) {
            return null;
        }
        return this;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* renamed from: getRumContext */
    public final com.datadog.android.rum.internal.domain.RumContext getGetHighSpeedVideoSizes() {
        return getParentScope().getGetHighSpeedVideoSizes();
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* renamed from: isActive */
    public final boolean getIsActive() {
        return !this.stopped;
    }

    public final void renewViewScopes$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.Time eventTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
        java.util.List<com.datadog.android.rum.internal.domain.scope.RumViewScope> list = this.childrenScopes;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.datadog.android.rum.internal.domain.scope.RumViewScope) it.next()).renew$dd_sdk_android_rum_release(eventTime));
        }
        this.childrenScopes.clear();
        this.childrenScopes.addAll(arrayList);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00118\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewManagerScope$Companion;", "", "<init>", "()V", "", "ATTR_GAP_BETWEEN_VIEWS", "Ljava/lang/String;", "MESSAGE_MISSING_VIEW", "MESSAGE_UNKNOWN_MISSED_TYPE", "MULTIPLE_ACTIVE_VIEWS_ERROR", "NO_ACTIVE_VIEW_FOR_LOADING_TIME_WARNING_MESSAGE", "RUM_APP_LAUNCH_VIEW_ID", "RUM_APP_LAUNCH_VIEW_NAME", "RUM_APP_LAUNCH_VIEW_URL", "RUM_BACKGROUND_VIEW_ID", "RUM_BACKGROUND_VIEW_NAME", "RUM_BACKGROUND_VIEW_URL", "", "THREE_SECONDS_GAP_NS", "J", "getTHREE_SECONDS_GAP_NS$dd_sdk_android_rum_release", "()J", "", "Ljava/lang/Class;", "silentOrphanEventTypes", "[Ljava/lang/Class;", "getSilentOrphanEventTypes$dd_sdk_android_rum_release", "()[Ljava/lang/Class;", "validBackgroundEventTypes", "getValidBackgroundEventTypes$dd_sdk_android_rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.Class<?>[] getValidBackgroundEventTypes$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.validBackgroundEventTypes;
        }

        public final java.lang.Class<?>[] getSilentOrphanEventTypes$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.silentOrphanEventTypes;
        }

        public final long getTHREE_SECONDS_GAP_NS$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.THREE_SECONDS_GAP_NS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

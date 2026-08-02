package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b,\b\u0000\u0018\u0000 \u0083\u00012\u00020\u00012\u00020\u0002:\u0002\u0083\u0001BÇ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0 \u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+JQ\u00108\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\"\u00104\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200\u0012\u0004\u0012\u00020200j\u0002`32\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u0001060:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?JQ\u0010D\u001a\u00020\u00012\u0006\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020.2\"\u0010B\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200\u0012\u0004\u0012\u00020200j\u0002`32\f\u0010C\u001a\b\u0012\u0004\u0012\u00020605H\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\tH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u0002022\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0013\u0010R\u001a\u0004\u0018\u00010O8G¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010\n\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010S\u001a\u0004\bT\u0010GR\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bU\u0010VR \u0010X\u001a\b\u0012\u0004\u0012\u00020O0W8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010\\R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020#0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b]\u0010VR\u0014\u0010U\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u0010^R\u0014\u0010`\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b_\u0010\\R\u001a\u0010\u0017\u001a\u00020\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010a\u001a\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010d\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bg\u0010SR\u0018\u0010_\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010hR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010i\u001a\u0004\bj\u0010kR\u0014\u0010g\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bf\u0010\\R\u001c\u0010l\u001a\u0004\u0018\u00010\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0016\u0010r\u001a\u00020=8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010v\u001a\u0004\u0018\u00010\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010p\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bu\u0010xR\u0014\u0010s\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\br\u0010yR\u0016\u0010|\u001a\u0004\u0018\u00010\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bz\u0010{R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010}\u001a\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b|\u0010\u0080\u0001R\u001b\u0010\u000b\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\r\n\u0004\b\u000b\u0010S\u001a\u0005\b\u0082\u0001\u0010G"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumApplicationScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY, "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/core/sampling/Sampler;", "sessionSampler", "", "backgroundTrackingEnabled", "trackFrustrations", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "cpuVitalMonitor", "memoryVitalMonitor", "frameRateVitalMonitor", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sessionEndedMetricDispatcher", "Lcom/datadog/android/rum/RumSessionListener;", "sessionListener", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "initialResourceIdentifier", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "lastInteractionIdentifier", "Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "slowFramesListener", "Lcom/datadog/android/rum/RumSessionType;", "rumSessionTypeOverride", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "accessibilitySnapshotManager", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/battery/BatteryInfo;", "batteryInfoProvider", "Lcom/datadog/android/rum/internal/domain/display/DisplayInfo;", "displayInfoProvider", "Lkotlin/Function0;", "Lcom/datadog/android/rum/internal/startup/RumSessionScopeStartupManager;", "rumSessionScopeStartupManagerFactory", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "<init>", "(Ljava/lang/String;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/core/sampling/Sampler;ZZLcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;Lcom/datadog/android/rum/RumSessionListener;Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;Lcom/datadog/android/rum/RumSessionType;Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;Lcom/datadog/android/rum/internal/domain/InfoProvider;Lcom/datadog/android/rum/internal/domain/InfoProvider;Lkotlin/jvm/functions/Function0;Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "p0", "Lcom/datadog/android/api/context/DatadogContext;", "p1", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "", "Lcom/datadog/android/api/feature/EventWriteScope;", "p2", "Lcom/datadog/android/api/storage/DataWriter;", "", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;)V", "", "getCustomAttributes", "()Ljava/util/Map;", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getRumContext", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "event", "datadogContext", "writeScope", "writer", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "isActive", "()Z", "Lcom/datadog/android/rum/internal/domain/scope/RumViewInfo;", "viewInfo", "onViewChanged", "(Lcom/datadog/android/rum/internal/domain/scope/RumViewInfo;)V", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope;", "getActiveSession", "()Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope;", "activeSession", "Z", "getBackgroundTrackingEnabled$dd_sdk_android_rum_release", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "", "childScopes", "Ljava/util/List;", "getChildScopes$dd_sdk_android_rum_release", "()Ljava/util/List;", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "getHighSpeedVideoSizes", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getOutputFormats", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "getInitialResourceIdentifier$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "getInputSizeshNQ4ISI", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "getInputFormats", "getOutputMinFrameDuration", "Lcom/datadog/android/rum/internal/domain/scope/RumViewInfo;", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "getLastInteractionIdentifier$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "parentScope", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "getParentScope", "()Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "getOutputStallDurationlomOqCM", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getOutputSizes", "getOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getOutputMinFrameDurationlomOqCM", "getOutputStallDuration", "Lcom/datadog/android/rum/RumSessionType;", "Lcom/datadog/android/core/InternalSdkCore;", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "getValidOutputFormatsForInputhNQ4ISI", "Lcom/datadog/android/rum/RumSessionListener;", "unwrapAs", "Lcom/datadog/android/core/sampling/Sampler;", "getSessionSampler$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/sampling/Sampler;", "Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "isOutputSupportedFor", "getTrackFrustrations$dd_sdk_android_rum_release", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumApplicationScope implements com.datadog.android.rum.internal.domain.scope.RumScope, com.datadog.android.rum.internal.domain.scope.RumViewChangedListener {
    public static final java.lang.String MULTIPLE_ACTIVE_SESSIONS_ERROR = "Application has multiple active sessions, this shouldn't happen.";
    public static final java.lang.String MULTIPLE_ACTIVE_SESSIONS_SESSION_START_ERROR = "Application has multiple active sessions when starting a new session";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.vitals.VitalMonitor getHighSpeedVideoSizes;
    private final boolean backgroundTrackingEnabled;
    private final java.util.List<com.datadog.android.rum.internal.domain.scope.RumSessionScope> childScopes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private com.datadog.android.rum.internal.domain.scope.RumViewInfo getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.vitals.VitalMonitor getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.vitals.VitalMonitor getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.datadog.android.core.InternalSdkCore getOutputStallDurationlomOqCM;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.metric.SessionMetricDispatcher getOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager> getOutputMinFrameDurationlomOqCM;
    private final com.datadog.android.rum.RumSessionType getOutputStallDuration;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private com.datadog.android.rum.internal.domain.RumContext getOutputSizes;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.rum.RumSessionListener unwrapAs;
    private final com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier;
    private final com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier;
    private final com.datadog.android.rum.internal.domain.scope.RumScope parentScope;
    private final com.datadog.android.core.sampling.Sampler<java.lang.String> sessionSampler;
    private final boolean trackFrustrations;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener isOutputSupportedFor;

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* renamed from: isActive */
    public final boolean getIsActive() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RumApplicationScope(java.lang.String str, com.datadog.android.core.InternalSdkCore internalSdkCore, com.datadog.android.core.sampling.Sampler<java.lang.String> sampler, boolean z, boolean z2, com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor2, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor3, com.datadog.android.rum.internal.metric.SessionMetricDispatcher sessionMetricDispatcher, com.datadog.android.rum.RumSessionListener rumSessionListener, com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier, com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier, com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener slowFramesListener, com.datadog.android.rum.RumSessionType rumSessionType, com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager accessibilitySnapshotManager, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> infoProvider, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> infoProvider2, kotlin.jvm.functions.Function0<? extends com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager> function0, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sampler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstPartyHostHeaderTypeResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionMetricDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialResourceIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilitySnapshotManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
        this.getOutputStallDurationlomOqCM = internalSdkCore;
        this.sessionSampler = sampler;
        this.backgroundTrackingEnabled = z;
        this.trackFrustrations = z2;
        this.getHighSpeedVideoFpsRangesFor = firstPartyHostHeaderTypeResolver;
        this.getHighSpeedVideoSizes = vitalMonitor;
        this.getOutputMinFrameDuration = vitalMonitor2;
        this.getHighSpeedVideoSizesFor = vitalMonitor3;
        this.getOutputSizeshNQ4ISI = sessionMetricDispatcher;
        this.unwrapAs = rumSessionListener;
        this.initialResourceIdentifier = initialResourceIdentifier;
        this.lastInteractionIdentifier = lastInteractionIdentifier;
        this.isOutputSupportedFor = slowFramesListener;
        this.getOutputStallDuration = rumSessionType;
        this.Camera2StreamConfigurationMap = accessibilitySnapshotManager;
        this.getHighResolutionOutputSizeshNQ4ISI = infoProvider;
        this.getHighSpeedVideoFpsRanges = infoProvider2;
        this.getOutputMinFrameDurationlomOqCM = function0;
        this.getInputFormats = insightsCollector;
        this.getOutputSizes = new com.datadog.android.rum.internal.domain.RumContext(str, null, false, null, null, null, null, null, null, null, null, null, 0L, 0L, false, org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_NEXT, null);
        this.childScopes = kotlin.collections.CollectionsKt.mutableListOf(new com.datadog.android.rum.internal.domain.scope.RumSessionScope(this, internalSdkCore, sessionMetricDispatcher, sampler, z, z2, this, firstPartyHostHeaderTypeResolver, vitalMonitor, vitalMonitor2, vitalMonitor3, rumSessionListener, false, initialResourceIdentifier, lastInteractionIdentifier, slowFramesListener, accessibilitySnapshotManager, infoProvider, infoProvider2, 0L, 0L, rumSessionType, function0, insightsCollector, 1572864, null));
    }

    public final com.datadog.android.core.sampling.Sampler<java.lang.String> getSessionSampler$dd_sdk_android_rum_release() {
        return this.sessionSampler;
    }

    /* renamed from: getBackgroundTrackingEnabled$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getBackgroundTrackingEnabled() {
        return this.backgroundTrackingEnabled;
    }

    /* renamed from: getTrackFrustrations$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getTrackFrustrations() {
        return this.trackFrustrations;
    }

    /* renamed from: getInitialResourceIdentifier$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier getInitialResourceIdentifier() {
        return this.initialResourceIdentifier;
    }

    /* renamed from: getLastInteractionIdentifier$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier getLastInteractionIdentifier() {
        return this.lastInteractionIdentifier;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final com.datadog.android.rum.internal.domain.scope.RumScope getParentScope() {
        return this.parentScope;
    }

    public final java.util.List<com.datadog.android.rum.internal.domain.scope.RumSessionScope> getChildScopes$dd_sdk_android_rum_release() {
        return this.childScopes;
    }

    public final com.datadog.android.rum.internal.domain.scope.RumSessionScope getActiveSession() {
        java.util.List<com.datadog.android.rum.internal.domain.scope.RumSessionScope> list = this.childScopes;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.datadog.android.rum.internal.domain.scope.RumSessionScope) obj).getIsActive()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.size() > 1) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputStallDurationlomOqCM.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumApplicationScope$activeSession$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.domain.scope.RumApplicationScope.MULTIPLE_ACTIVE_SESSIONS_ERROR;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        return (com.datadog.android.rum.internal.domain.scope.RumSessionScope) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) arrayList2);
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final com.datadog.android.rum.internal.domain.scope.RumScope handleEvent(com.datadog.android.rum.internal.domain.scope.RumRawEvent event, com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> writeScope, com.datadog.android.api.storage.DataWriter<java.lang.Object> writer) {
        com.datadog.android.rum.internal.domain.scope.RumViewInfo rumViewInfo;
        com.datadog.android.rum.internal.domain.RumContext copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetSyntheticsTestAttribute) {
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetSyntheticsTestAttribute setSyntheticsTestAttribute = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetSyntheticsTestAttribute) event;
            copy = r6.copy((r34 & 1) != 0 ? r6.applicationId : null, (r34 & 2) != 0 ? r6.sessionId : null, (r34 & 4) != 0 ? r6.isSessionActive : false, (r34 & 8) != 0 ? r6.viewId : null, (r34 & 16) != 0 ? r6.viewName : null, (r34 & 32) != 0 ? r6.viewUrl : null, (r34 & 64) != 0 ? r6.actionId : null, (r34 & 128) != 0 ? r6.sessionState : null, (r34 & 256) != 0 ? r6.sessionStartReason : null, (r34 & 512) != 0 ? r6.viewType : null, (r34 & 1024) != 0 ? r6.syntheticsTestId : setSyntheticsTestAttribute.getTestId(), (r34 & 2048) != 0 ? r6.syntheticsResultId : setSyntheticsTestAttribute.getResultId(), (r34 & 4096) != 0 ? r6.viewTimestamp : 0L, (r34 & 8192) != 0 ? r6.viewTimestampOffset : 0L, (r34 & 16384) != 0 ? this.getOutputSizes.hasReplay : false);
            this.getOutputSizes = copy;
        }
        boolean z = event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView;
        boolean z2 = z || (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction);
        if (getActiveSession() == null && z2) {
            com.datadog.android.rum.internal.domain.scope.RumSessionScope rumSessionScope = new com.datadog.android.rum.internal.domain.scope.RumSessionScope(this, this.getOutputStallDurationlomOqCM, this.getOutputSizeshNQ4ISI, this.sessionSampler, this.backgroundTrackingEnabled, this.trackFrustrations, this, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.unwrapAs, true, this.initialResourceIdentifier, this.lastInteractionIdentifier, this.isOutputSupportedFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, 0L, 0L, this.getOutputStallDuration, this.getOutputMinFrameDurationlomOqCM, this.getInputFormats, 1572864, null);
            this.childScopes.add(rumSessionScope);
            if (!z && (rumViewInfo = this.getOutputFormats) != null) {
                rumSessionScope.handleEvent(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView(rumViewInfo.getKey(), rumViewInfo.getAttributes(), null, 4, null), datadogContext, writeScope, writer);
            }
            java.util.List<com.datadog.android.rum.internal.domain.scope.RumSessionScope> list = this.childScopes;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((com.datadog.android.rum.internal.domain.scope.RumSessionScope) obj).getIsActive()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() > 1) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputStallDurationlomOqCM.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumApplicationScope$startNewSession$3
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.rum.internal.domain.scope.RumApplicationScope.MULTIPLE_ACTIVE_SESSIONS_SESSION_START_ERROR;
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
        }
        if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.SdkInit) && !this.getInputSizeshNQ4ISI) {
            com.datadog.android.rum.internal.domain.Time eventTime = event.getEventTime();
            if (com.datadog.android.rum.DdRumContentProvider.INSTANCE.getProcessImportance() == 100) {
                long appStartTimeNs = this.getOutputStallDurationlomOqCM.getAppStartTimeNs();
                getHighResolutionOutputSizeshNQ4ISI(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ApplicationStarted(new com.datadog.android.rum.internal.domain.Time(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis((java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(eventTime.getTimestamp()) - eventTime.getNanoTime()) + appStartTimeNs), appStartTimeNs), eventTime.getNanoTime() - appStartTimeNs), datadogContext, writeScope, writer);
                this.getInputSizeshNQ4ISI = true;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI(event, datadogContext, writeScope, writer);
        return this;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* renamed from: getRumContext, reason: from getter */
    public final com.datadog.android.rum.internal.domain.RumContext getGetOutputSizes() {
        return this.getOutputSizes;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final java.util.Map<java.lang.String, java.lang.Object> getCustomAttributes() {
        return com.datadog.android.rum.GlobalRumMonitor.get(this.getOutputStallDurationlomOqCM).getAttributes();
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumViewChangedListener
    public final void onViewChanged(com.datadog.android.rum.internal.domain.scope.RumViewInfo viewInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewInfo, "");
        if (viewInfo.isActive()) {
            this.getOutputFormats = viewInfo;
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.rum.internal.domain.scope.RumRawEvent p0, com.datadog.android.api.context.DatadogContext p1, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> p2, com.datadog.android.api.storage.DataWriter<java.lang.Object> p3) {
        java.util.Iterator<com.datadog.android.rum.internal.domain.scope.RumSessionScope> it = this.childScopes.iterator();
        while (it.hasNext()) {
            if (it.next().handleEvent(p0, p1, p2, p3) == null) {
                it.remove();
            }
        }
    }
}

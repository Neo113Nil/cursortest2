package com.datadog.android.rum;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lcom/datadog/android/rum/_RumInternalProxy;", "", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "rumMonitor", "<init>", "(Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;)V", "", "durationNs", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "", "addLongTask", "(JLjava/lang/String;)V", "Landroid/app/Activity;", "activity", "enableJankStatsTracking", "(Landroid/app/Activity;)V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "setInternalViewAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", "testId", "resultId", "setSyntheticsAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "setSyntheticsAttributeFromIntent", "(Landroid/content/Intent;)V", "", "frameTimeSeconds", "updateExternalRefreshRate", "(D)V", "Lcom/datadog/android/rum/RumPerformanceMetric;", "metric", "updatePerformanceMetric", "(Lcom/datadog/android/rum/RumPerformanceMetric;D)V", "", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _RumInternalProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum._RumInternalProxy.Companion INSTANCE = new com.datadog.android.rum._RumInternalProxy.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.monitor.AdvancedRumMonitor getHighSpeedVideoFpsRangesFor;

    public _RumInternalProxy(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
        this.getHighSpeedVideoFpsRangesFor = advancedRumMonitor;
    }

    public final void addLongTask(long durationNs, java.lang.String target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        this.getHighSpeedVideoFpsRangesFor.addLongTask(durationNs, target);
    }

    public final void updatePerformanceMetric(com.datadog.android.rum.RumPerformanceMetric metric, double value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metric, "");
        this.getHighSpeedVideoFpsRangesFor.updatePerformanceMetric(metric, value);
    }

    public final void updateExternalRefreshRate(double frameTimeSeconds) {
        this.getHighSpeedVideoFpsRangesFor.updateExternalRefreshRate(frameTimeSeconds);
    }

    public final void setInternalViewAttribute(java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.getHighSpeedVideoFpsRangesFor.setInternalViewAttribute(key, value);
    }

    public final void setSyntheticsAttribute(java.lang.String testId, java.lang.String resultId) {
        java.lang.String str;
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = true;
        java.lang.String str2 = testId;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2) || (str = resultId) == null || kotlin.text.StringsKt.isBlank(str)) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.setSyntheticsAttribute(testId, resultId);
    }

    public final void enableJankStatsTracking(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        this.getHighSpeedVideoFpsRangesFor.enableJankStatsTracking(activity);
    }

    public final void setSyntheticsAttributeFromIntent(android.content.Intent intent) {
        android.os.Bundle bundle;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        try {
            bundle = intent.getExtras();
        } catch (java.lang.Exception unused) {
            bundle = null;
        }
        setSyntheticsAttribute(bundle != null ? bundle.getString(com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy.EXTRA_SYNTHETICS_TEST_ID) : null, bundle != null ? bundle.getString(com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy.EXTRA_SYNTHETICS_RESULT_ID) : null);
    }

    @kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0015J)\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J#\u0010/\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,¢\u0006\u0004\b/\u00100"}, d2 = {"Lcom/datadog/android/rum/_RumInternalProxy$Companion;", "", "<init>", "()V", "", "name", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;", "libraryType", "Lcom/datadog/android/rum/configuration/RumNetworkInstrumentationConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/datadog/android/rum/internal/net/RumNetworkInstrumentation;", "createRumNetworkInstrumentation", "(Ljava/lang/String;Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;Lcom/datadog/android/rum/configuration/RumNetworkInstrumentationConfiguration;)Lcom/datadog/android/rum/internal/net/RumNetworkInstrumentation;", "Lcom/datadog/android/rum/resource/ResourceHeadersExtractor;", "extractor", "", "", "headers", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "extractRequestHeaders", "(Lcom/datadog/android/rum/resource/ResourceHeadersExtractor;Ljava/util/Map;Lcom/datadog/android/api/InternalLogger;)Ljava/util/Map;", "extractResponseHeaders", "Lcom/datadog/android/rum/RumConfiguration$Builder;", "builder", "additionalConfig", "setAdditionalConfiguration", "(Lcom/datadog/android/rum/RumConfiguration$Builder;Ljava/util/Map;)Lcom/datadog/android/rum/RumConfiguration$Builder;", "Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;", "composeActionTrackingStrategy", "setComposeActionTrackingStrategy", "(Lcom/datadog/android/rum/RumConfiguration$Builder;Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;)Lcom/datadog/android/rum/RumConfiguration$Builder;", "", "disable", "setDisableJankStats", "(Lcom/datadog/android/rum/RumConfiguration$Builder;Z)Lcom/datadog/android/rum/RumConfiguration$Builder;", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "setInsightsCollector", "(Lcom/datadog/android/rum/RumConfiguration$Builder;Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;)Lcom/datadog/android/rum/RumConfiguration$Builder;", "Lcom/datadog/android/rum/RumSessionType;", "rumSessionTypeOverride", "setRumSessionTypeOverride", "(Lcom/datadog/android/rum/RumConfiguration$Builder;Lcom/datadog/android/rum/RumSessionType;)Lcom/datadog/android/rum/RumConfiguration$Builder;", "Lcom/datadog/android/event/EventMapper;", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "eventMapper", "setTelemetryConfigurationEventMapper", "(Lcom/datadog/android/rum/RumConfiguration$Builder;Lcom/datadog/android/event/EventMapper;)Lcom/datadog/android/rum/RumConfiguration$Builder;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.rum.RumConfiguration.Builder setTelemetryConfigurationEventMapper(com.datadog.android.rum.RumConfiguration.Builder builder, com.datadog.android.event.EventMapper<com.datadog.android.telemetry.model.TelemetryConfigurationEvent> eventMapper) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper, "");
            return builder.setTelemetryConfigurationEventMapper$dd_sdk_android_rum_release(eventMapper);
        }

        public final com.datadog.android.rum.RumConfiguration.Builder setAdditionalConfiguration(com.datadog.android.rum.RumConfiguration.Builder builder, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalConfig, "");
            return builder.setAdditionalConfiguration$dd_sdk_android_rum_release(additionalConfig);
        }

        public final com.datadog.android.rum.RumConfiguration.Builder setComposeActionTrackingStrategy(com.datadog.android.rum.RumConfiguration.Builder builder, com.datadog.android.rum.tracking.ActionTrackingStrategy composeActionTrackingStrategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composeActionTrackingStrategy, "");
            return builder.setComposeActionTrackingStrategy$dd_sdk_android_rum_release(composeActionTrackingStrategy);
        }

        public final com.datadog.android.rum.RumConfiguration.Builder setRumSessionTypeOverride(com.datadog.android.rum.RumConfiguration.Builder builder, com.datadog.android.rum.RumSessionType rumSessionTypeOverride) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumSessionTypeOverride, "");
            return builder.setRumSessionTypeOverride$dd_sdk_android_rum_release(rumSessionTypeOverride);
        }

        public final com.datadog.android.rum.RumConfiguration.Builder setDisableJankStats(com.datadog.android.rum.RumConfiguration.Builder builder, boolean disable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            return builder.setDisableJankStats$dd_sdk_android_rum_release(disable);
        }

        public final com.datadog.android.rum.RumConfiguration.Builder setInsightsCollector(com.datadog.android.rum.RumConfiguration.Builder builder, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
            return builder.setInsightsCollector$dd_sdk_android_rum_release(insightsCollector);
        }

        public final com.datadog.android.rum.internal.net.RumNetworkInstrumentation createRumNetworkInstrumentation(java.lang.String name2, com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType libraryType, com.datadog.android.rum.configuration.RumNetworkInstrumentationConfiguration configuration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
            return configuration.createInstrumentation$dd_sdk_android_rum_release(name2, libraryType);
        }

        public final java.util.Map<java.lang.String, java.lang.String> extractRequestHeaders(com.datadog.android.rum.resource.ResourceHeadersExtractor extractor, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, com.datadog.android.api.InternalLogger internalLogger) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extractor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
            return extractor.extractRequestHeaders$dd_sdk_android_rum_release(headers, internalLogger);
        }

        public final java.util.Map<java.lang.String, java.lang.String> extractResponseHeaders(com.datadog.android.rum.resource.ResourceHeadersExtractor extractor, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, com.datadog.android.api.InternalLogger internalLogger) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extractor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
            return extractor.extractResponseHeaders$dd_sdk_android_rum_release(headers, internalLogger);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

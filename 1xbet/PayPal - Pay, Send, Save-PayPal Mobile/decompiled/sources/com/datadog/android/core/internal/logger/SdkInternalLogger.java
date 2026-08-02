package com.datadog.android.core.internal.logger;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000 F2\u00020\u0001:\u0001FB3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\tJW\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J]\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u001cJ%\u0010!\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004H\u0016¢\u0006\u0004\b!\u0010\"JE\u0010$\u001a\u00020\u00172\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b&\u0010'JM\u0010/\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00102\u0006\u0010,\u001a\u00020\u00122\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0-H\u0002¢\u0006\u0004\b/\u00100J1\u00106\u001a\u0004\u0018\u0001052\u0006\u00101\u001a\u00020\u000e2\u0006\u00103\u001a\u0002022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u00107J\u0013\u0010/\u001a\u000208*\u00020\nH\u0002¢\u0006\u0004\b/\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000e0-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000e0-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010?R\u0016\u0010@\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bE\u0010="}, d2 = {"Lcom/datadog/android/core/internal/logger/SdkInternalLogger;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lkotlin/Function0;", "Lcom/datadog/android/core/internal/logger/LogcatLogHandler;", "userLogHandlerFactory", "maintainerLogHandlerFactory", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lcom/datadog/android/api/InternalLogger$Level;", "level", "Lcom/datadog/android/api/InternalLogger$Target;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "", "messageBuilder", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "onlyOnce", "", "", "additionalProperties", "", "log", "(Lcom/datadog/android/api/InternalLogger$Level;Lcom/datadog/android/api/InternalLogger$Target;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "targets", "(Lcom/datadog/android/api/InternalLogger$Level;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "samplingRate", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "apiUsageEventBuilder", "logApiUsage", "(FLkotlin/jvm/functions/Function0;)V", "creationSampleRate", "logMetric", "(Lkotlin/jvm/functions/Function0;Ljava/util/Map;FLjava/lang/Float;)V", "sample", "(F)Z", "p0", "p1", "p2", "p3", "p4", "", "p5", "Camera2StreamConfigurationMap", "(Lcom/datadog/android/core/internal/logger/LogcatLogHandler;Lcom/datadog/android/api/InternalLogger$Level;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ZLjava/util/Set;)V", "callerClass", "Lcom/datadog/android/core/metrics/TelemetryMetricType;", "metric", "operationName", "Lcom/datadog/android/core/metrics/PerformanceMetric;", "startPerformanceMeasure", "(Ljava/lang/String;Lcom/datadog/android/core/metrics/TelemetryMetricType;FLjava/lang/String;)Lcom/datadog/android/core/metrics/PerformanceMetric;", "", "(Lcom/datadog/android/api/InternalLogger$Level;)I", "maintainerLogger", "Lcom/datadog/android/core/internal/logger/LogcatLogHandler;", "getMaintainerLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/logger/LogcatLogHandler;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "userLogger", "getUserLogger$dd_sdk_android_core_release", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SdkInternalLogger implements com.datadog.android.api.InternalLogger {
    public static final java.lang.String DEV_LOG_TAG = "Datadog";
    public static final java.lang.String SDK_LOG_TAG = "DD_LOG";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
    private final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> Camera2StreamConfigurationMap;
    private final com.datadog.android.core.internal.logger.LogcatLogHandler maintainerLogger;
    private final com.datadog.android.core.internal.logger.LogcatLogHandler userLogger;

    public SdkInternalLogger(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, kotlin.jvm.functions.Function0<com.datadog.android.core.internal.logger.LogcatLogHandler> function0, kotlin.jvm.functions.Function0<com.datadog.android.core.internal.logger.LogcatLogHandler> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.getHighSpeedVideoSizes = featureSdkCore;
        this.userLogger = function0.invoke();
        this.maintainerLogger = function02.invoke();
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashSet();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashSet();
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashSet();
    }

    public /* synthetic */ SdkInternalLogger(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.android.core.internal.logger.SdkInternalLogger.AnonymousClass1 anonymousClass1, com.datadog.android.core.internal.logger.SdkInternalLogger.AnonymousClass2 anonymousClass2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(featureSdkCore, (i & 2) != 0 ? new kotlin.jvm.functions.Function0<com.datadog.android.core.internal.logger.LogcatLogHandler>() { // from class: com.datadog.android.core.internal.logger.SdkInternalLogger.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.core.internal.logger.LogcatLogHandler invoke() {
                return new com.datadog.android.core.internal.logger.LogcatLogHandler(com.datadog.android.core.internal.logger.SdkInternalLogger.DEV_LOG_TAG, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean>() { // from class: com.datadog.android.core.internal.logger.SdkInternalLogger.1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num) {
                        return getHighSpeedVideoFpsRangesFor(num.intValue());
                    }

                    public final java.lang.Boolean getHighSpeedVideoFpsRangesFor(int i2) {
                        return java.lang.Boolean.valueOf(i2 >= com.datadog.android.Datadog.getVerbosity());
                    }
                });
            }
        } : anonymousClass1, (i & 4) != 0 ? new kotlin.jvm.functions.Function0<com.datadog.android.core.internal.logger.LogcatLogHandler>() { // from class: com.datadog.android.core.internal.logger.SdkInternalLogger.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.core.internal.logger.LogcatLogHandler invoke() {
                java.lang.Boolean bool = com.datadog.android.BuildConfig.LOGCAT_ENABLED;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
                kotlin.jvm.functions.Function1 function1 = null;
                java.lang.Object[] objArr = 0;
                if (bool.booleanValue()) {
                    return new com.datadog.android.core.internal.logger.LogcatLogHandler(com.datadog.android.core.internal.logger.SdkInternalLogger.SDK_LOG_TAG, function1, 2, objArr == true ? 1 : 0);
                }
                return null;
            }
        } : anonymousClass2);
    }

    /* renamed from: getUserLogger$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.logger.LogcatLogHandler getUserLogger() {
        return this.userLogger;
    }

    /* renamed from: getMaintainerLogger$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.logger.LogcatLogHandler getMaintainerLogger() {
        return this.maintainerLogger;
    }

    @Override // com.datadog.android.api.InternalLogger
    public final void log(com.datadog.android.api.InternalLogger.Level level, com.datadog.android.api.InternalLogger.Target target, kotlin.jvm.functions.Function0<java.lang.String> messageBuilder, java.lang.Throwable throwable, boolean onlyOnce, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalProperties) {
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore;
        com.datadog.android.api.feature.FeatureScope feature;
        com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error error;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageBuilder, "");
        int i = com.datadog.android.core.internal.logger.SdkInternalLogger.WhenMappings.$EnumSwitchMapping$0[target.ordinal()];
        if (i == 1) {
            Camera2StreamConfigurationMap(this.userLogger, level, messageBuilder, throwable, onlyOnce, this.getHighSpeedVideoFpsRanges);
            return;
        }
        if (i == 2) {
            com.datadog.android.core.internal.logger.LogcatLogHandler logcatLogHandler = this.maintainerLogger;
            if (logcatLogHandler != null) {
                Camera2StreamConfigurationMap(logcatLogHandler, level, messageBuilder, throwable, onlyOnce, this.getHighResolutionOutputSizeshNQ4ISI);
                return;
            }
            return;
        }
        if (i != 3 || (featureSdkCore = this.getHighSpeedVideoSizes) == null || (feature = featureSdkCore.getFeature("rum")) == null) {
            return;
        }
        java.lang.String invoke = messageBuilder.invoke();
        if (onlyOnce) {
            if (this.Camera2StreamConfigurationMap.contains(invoke)) {
                return;
            } else {
                this.Camera2StreamConfigurationMap.add(invoke);
            }
        }
        if (level == com.datadog.android.api.InternalLogger.Level.ERROR || level == com.datadog.android.api.InternalLogger.Level.WARN || throwable != null) {
            error = new com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error(invoke, additionalProperties, throwable, null, null, 24, null);
        } else {
            error = new com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Debug(invoke, additionalProperties);
        }
        feature.sendEvent(error);
    }

    @Override // com.datadog.android.api.InternalLogger
    public final void log(com.datadog.android.api.InternalLogger.Level level, java.util.List<? extends com.datadog.android.api.InternalLogger.Target> targets, kotlin.jvm.functions.Function0<java.lang.String> messageBuilder, java.lang.Throwable throwable, boolean onlyOnce, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targets, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageBuilder, "");
        java.util.Iterator<T> it = targets.iterator();
        while (it.hasNext()) {
            log(level, (com.datadog.android.api.InternalLogger.Target) it.next(), messageBuilder, throwable, onlyOnce, additionalProperties);
        }
    }

    @Override // com.datadog.android.api.InternalLogger
    public final void logMetric(kotlin.jvm.functions.Function0<java.lang.String> messageBuilder, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalProperties, float samplingRate, java.lang.Float creationSampleRate) {
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore;
        com.datadog.android.api.feature.FeatureScope feature;
        com.datadog.android.core.internal.CoreFeature coreFeature$dd_sdk_android_core_release;
        java.lang.Float metricTelemetrySampleRateBypass;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore2 = this.getHighSpeedVideoSizes;
        com.datadog.android.core.internal.DatadogCore datadogCore = featureSdkCore2 instanceof com.datadog.android.core.internal.DatadogCore ? (com.datadog.android.core.internal.DatadogCore) featureSdkCore2 : null;
        if (datadogCore != null && (coreFeature$dd_sdk_android_core_release = datadogCore.getCoreFeature$dd_sdk_android_core_release()) != null && (metricTelemetrySampleRateBypass = coreFeature$dd_sdk_android_core_release.getMetricTelemetrySampleRateBypass()) != null) {
            samplingRate = metricTelemetrySampleRateBypass.floatValue();
        }
        if (!sample(samplingRate) || (featureSdkCore = this.getHighSpeedVideoSizes) == null || (feature = featureSdkCore.getFeature("rum")) == null) {
            return;
        }
        feature.sendEvent(new com.datadog.android.internal.telemetry.InternalTelemetryEvent.Metric(messageBuilder.invoke(), com.datadog.android.internal.attributes.LocalAttributeKt.enrichWithNonNullAttribute(com.datadog.android.internal.attributes.LocalAttributeKt.enrichWithNonNullAttribute(kotlin.collections.MapsKt.toMutableMap(additionalProperties), com.datadog.android.internal.attributes.LocalAttribute.Key.CREATION_SAMPLING_RATE, creationSampleRate), com.datadog.android.internal.attributes.LocalAttribute.Key.REPORTING_SAMPLING_RATE, java.lang.Float.valueOf(samplingRate))));
    }

    @Override // com.datadog.android.api.InternalLogger
    public final com.datadog.android.core.metrics.PerformanceMetric startPerformanceMeasure(java.lang.String callerClass, com.datadog.android.core.metrics.TelemetryMetricType metric, float samplingRate, java.lang.String operationName) {
        com.datadog.android.internal.time.DefaultTimeProvider defaultTimeProvider;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callerClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metric, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        if (!sample(samplingRate)) {
            return null;
        }
        if (com.datadog.android.core.internal.logger.SdkInternalLogger.WhenMappings.$EnumSwitchMapping$1[metric.ordinal()] != 1) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.datadog.android.core.internal.logger.SdkInternalLogger sdkInternalLogger = this;
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = this.getHighSpeedVideoSizes;
        if (featureSdkCore == null || (defaultTimeProvider = featureSdkCore.getTimeProvider()) == null) {
            defaultTimeProvider = new com.datadog.android.internal.time.DefaultTimeProvider();
        }
        return new com.datadog.android.core.internal.metrics.MethodCalledTelemetry(sdkInternalLogger, operationName, callerClass, samplingRate, defaultTimeProvider);
    }

    @Override // com.datadog.android.api.InternalLogger
    public final void logApiUsage(float samplingRate, kotlin.jvm.functions.Function0<? extends com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage> apiUsageEventBuilder) {
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore;
        com.datadog.android.api.feature.FeatureScope feature;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiUsageEventBuilder, "");
        if (!sample(samplingRate) || (featureSdkCore = this.getHighSpeedVideoSizes) == null || (feature = featureSdkCore.getFeature("rum")) == null) {
            return;
        }
        com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage invoke = apiUsageEventBuilder.invoke();
        com.datadog.android.internal.attributes.LocalAttributeKt.enrichWithNonNullAttribute(invoke.getAdditionalProperties(), com.datadog.android.internal.attributes.LocalAttribute.Key.REPORTING_SAMPLING_RATE, java.lang.Float.valueOf(samplingRate));
        feature.sendEvent(invoke);
    }

    public final boolean sample(float samplingRate) {
        return new com.datadog.android.core.sampling.RateBasedSampler(samplingRate).sample(kotlin.Unit.INSTANCE);
    }

    private final void Camera2StreamConfigurationMap(com.datadog.android.core.internal.logger.LogcatLogHandler p0, com.datadog.android.api.InternalLogger.Level p1, kotlin.jvm.functions.Function0<java.lang.String> p2, java.lang.Throwable p3, boolean p4, java.util.Set<java.lang.String> p5) {
        if (p0.canLog(Camera2StreamConfigurationMap(p1))) {
            java.lang.String invoke = p2.invoke();
            com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = this.getHighSpeedVideoSizes;
            java.lang.String name2 = featureSdkCore != null ? featureSdkCore.getName() : null;
            if (name2 != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
                sb.append(name2);
                sb.append("]: ");
                sb.append(invoke);
                invoke = sb.toString();
            }
            if (p4) {
                if (p5.contains(invoke)) {
                    return;
                } else {
                    p5.add(invoke);
                }
            }
            p0.log(Camera2StreamConfigurationMap(p1), invoke, p3);
        }
    }

    private static int Camera2StreamConfigurationMap(com.datadog.android.api.InternalLogger.Level level) {
        int i = com.datadog.android.core.internal.logger.SdkInternalLogger.WhenMappings.$EnumSwitchMapping$2[level.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.datadog.android.api.InternalLogger.Target.values().length];
            try {
                iArr[com.datadog.android.api.InternalLogger.Target.USER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.api.InternalLogger.Target.MAINTAINER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.datadog.android.api.InternalLogger.Target.TELEMETRY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.datadog.android.core.metrics.TelemetryMetricType.values().length];
            try {
                iArr2[com.datadog.android.core.metrics.TelemetryMetricType.MethodCalled.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.datadog.android.api.InternalLogger.Level.values().length];
            try {
                iArr3[com.datadog.android.api.InternalLogger.Level.VERBOSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr3[com.datadog.android.api.InternalLogger.Level.DEBUG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[com.datadog.android.api.InternalLogger.Level.INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[com.datadog.android.api.InternalLogger.Level.WARN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[com.datadog.android.api.InternalLogger.Level.ERROR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}

package com.datadog.android.rum.internal.metric;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0016\u0010\u001f\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0014\u0010$\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/datadog/android/rum/internal/metric/ViewEndedMetricDispatcher;", "Lcom/datadog/android/rum/internal/metric/ViewMetricDispatcher;", "Lcom/datadog/android/rum/internal/domain/scope/RumViewType;", "viewType", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/internal/attributes/ViewScopeInstrumentationType;", "instrumentationType", "", "samplingRate", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumViewType;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/internal/attributes/ViewScopeInstrumentationType;F)V", "", "newDuration", "", "onDurationResolved", "(J)V", "newLoadingTime", "onViewLoadingTimeResolved", "Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsState;", "invState", "tnsState", "sendViewEnded", "(Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsState;Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsState;)V", "Camera2StreamConfigurationMap", "Ljava/lang/Long;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/internal/attributes/ViewScopeInstrumentationType;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoSizes", "", "Z", "getOutputMinFrameDuration", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getInputSizeshNQ4ISI", "getOutputFormats", "Lcom/datadog/android/rum/internal/domain/scope/RumViewType;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewEndedMetricDispatcher implements com.datadog.android.rum.internal.metric.ViewMetricDispatcher {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.Companion INSTANCE = new com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.Companion(null);
    public static final java.lang.String KEY_CONFIG = "config";
    public static final java.lang.String KEY_DURATION = "duration";
    public static final java.lang.String KEY_INSTRUMENTATION_TYPE = "instrumentation_type";
    public static final java.lang.String KEY_INTERACTION_TO_NEXT_VIEW = "inv";
    public static final java.lang.String KEY_LOADING_TIME = "loading_time";
    public static final java.lang.String KEY_METRIC_TYPE = "metric_type";
    public static final java.lang.String KEY_NO_VALUE_REASON = "no_value_reason";
    public static final java.lang.String KEY_RUM_VIEW_ENDED = "rve";
    public static final java.lang.String KEY_TIME_TO_NETWORK_SETTLED = "tns";
    public static final java.lang.String KEY_VALUE = "value";
    public static final java.lang.String KEY_VIEW_TYPE = "view_type";
    public static final java.lang.String VIEW_ENDED_MESSAGE = "[Mobile Metric] RUM View Ended";
    private java.lang.Long Camera2StreamConfigurationMap;
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.internal.attributes.ViewScopeInstrumentationType getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.Long getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.scope.RumViewType getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final float getInputSizeshNQ4ISI;

    public ViewEndedMetricDispatcher(com.datadog.android.rum.internal.domain.scope.RumViewType rumViewType, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.attributes.ViewScopeInstrumentationType.Native r4, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumViewType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getOutputMinFrameDuration = rumViewType;
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
        this.getInputSizeshNQ4ISI = f;
        this.getHighSpeedVideoFpsRangesFor = r4 == null ? com.datadog.android.internal.attributes.ViewScopeInstrumentationType.Native.MANUAL : r4;
    }

    public /* synthetic */ ViewEndedMetricDispatcher(com.datadog.android.rum.internal.domain.scope.RumViewType rumViewType, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.attributes.ViewScopeInstrumentationType viewScopeInstrumentationType, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(rumViewType, internalLogger, (i & 4) != 0 ? null : viewScopeInstrumentationType, (i & 8) != 0 ? 0.75f : f);
    }

    @Override // com.datadog.android.rum.internal.metric.ViewMetricDispatcher
    public final void sendViewEnded(com.datadog.android.rum.internal.metric.ViewInitializationMetricsState invState, com.datadog.android.rum.internal.metric.ViewInitializationMetricsState tnsState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tnsState, "");
        if (this.getHighSpeedVideoSizes) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher$sendViewEnded$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Trying to send 'view ended' more than once";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return;
        }
        com.datadog.android.api.InternalLogger internalLogger = this.getHighResolutionOutputSizeshNQ4ISI;
        com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher$sendViewEnded$2 viewEndedMetricDispatcher$sendViewEnded$2 = new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher$sendViewEnded$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.VIEW_ENDED_MESSAGE;
            }
        };
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("metric_type", "rum view ended");
        java.util.Map createMapBuilder2 = kotlin.collections.MapsKt.createMapBuilder();
        com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.Companion companion = INSTANCE;
        com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.Companion.access$putNonNull(companion, createMapBuilder2, "duration", this.Camera2StreamConfigurationMap);
        if (this.getHighSpeedVideoFpsRanges != null) {
            java.util.Map createMapBuilder3 = kotlin.collections.MapsKt.createMapBuilder();
            createMapBuilder3.put(KEY_VALUE, this.getHighSpeedVideoFpsRanges);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            createMapBuilder2.put(KEY_LOADING_TIME, kotlin.collections.MapsKt.build(createMapBuilder3));
        }
        createMapBuilder2.put("view_type", companion.toAttributeValue$dd_sdk_android_rum_release(this.getOutputMinFrameDuration));
        java.util.Map createMapBuilder4 = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder4.put(KEY_VALUE, tnsState.getInitializationTime());
        createMapBuilder4.put("config", companion.toAttributeValue$dd_sdk_android_rum_release(tnsState.getConfig()));
        if (tnsState.getInitializationTime() == null) {
            com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.Companion.access$putNonNull(companion, createMapBuilder4, KEY_NO_VALUE_REASON, companion.toAttributeValue$dd_sdk_android_rum_release(tnsState.getNoValueReason()));
        }
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        createMapBuilder2.put(KEY_TIME_TO_NETWORK_SETTLED, kotlin.collections.MapsKt.build(createMapBuilder4));
        java.util.Map createMapBuilder5 = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder5.put(KEY_VALUE, invState.getInitializationTime());
        createMapBuilder5.put("config", companion.toAttributeValue$dd_sdk_android_rum_release(invState.getConfig()));
        if (invState.getInitializationTime() == null) {
            com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.Companion.access$putNonNull(companion, createMapBuilder5, KEY_NO_VALUE_REASON, companion.toAttributeValue$dd_sdk_android_rum_release(invState.getNoValueReason()));
        }
        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
        createMapBuilder2.put(KEY_INTERACTION_TO_NEXT_VIEW, kotlin.collections.MapsKt.build(createMapBuilder5));
        createMapBuilder2.put(KEY_INSTRUMENTATION_TYPE, this.getHighSpeedVideoFpsRangesFor.getValue());
        createMapBuilder.put(KEY_RUM_VIEW_ENDED, kotlin.collections.MapsKt.build(createMapBuilder2));
        com.datadog.android.api.InternalLogger.DefaultImpls.logMetric$default(internalLogger, viewEndedMetricDispatcher$sendViewEnded$2, kotlin.collections.MapsKt.build(createMapBuilder), this.getInputSizeshNQ4ISI, null, 8, null);
        this.getHighSpeedVideoSizes = true;
    }

    @Override // com.datadog.android.rum.internal.metric.ViewMetricDispatcher
    public final void onDurationResolved(long newDuration) {
        this.Camera2StreamConfigurationMap = java.lang.Long.valueOf(newDuration);
    }

    @Override // com.datadog.android.rum.internal.metric.ViewMetricDispatcher
    public final void onViewLoadingTimeResolved(long newLoadingTime) {
        this.getHighSpeedVideoFpsRanges = java.lang.Long.valueOf(newLoadingTime);
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0007\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/internal/metric/ViewEndedMetricDispatcher$Companion;", "", "<init>", "()V", "Lcom/datadog/android/rum/internal/domain/scope/RumViewType;", "viewType", "", "toAttributeValue$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/scope/RumViewType;)Ljava/lang/String;", "Lcom/datadog/android/rum/internal/metric/NoValueReason;", "reason", "(Lcom/datadog/android/rum/internal/metric/NoValueReason;)Ljava/lang/String;", "Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsConfig;", "config", "(Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsConfig;)Ljava/lang/String;", "KEY_CONFIG", "Ljava/lang/String;", "KEY_DURATION", "KEY_INSTRUMENTATION_TYPE", "KEY_INTERACTION_TO_NEXT_VIEW", "KEY_LOADING_TIME", "KEY_METRIC_TYPE", "KEY_NO_VALUE_REASON", "KEY_RUM_VIEW_ENDED", "KEY_TIME_TO_NETWORK_SETTLED", "KEY_VALUE", "KEY_VIEW_TYPE", "VIEW_ENDED_MESSAGE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String toAttributeValue$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.scope.RumViewType viewType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewType, "");
            int i = com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.Companion.WhenMappings.$EnumSwitchMapping$0[viewType.ordinal()];
            if (i == 1 || i == 2) {
                return io.reactivex.annotations.SchedulerSupport.CUSTOM;
            }
            if (i == 3) {
                return com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY;
            }
            if (i == 4) {
                return "application_launch";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public final java.lang.String toAttributeValue$dd_sdk_android_rum_release(com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            int i = com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.Companion.WhenMappings.$EnumSwitchMapping$1[config.ordinal()];
            if (i == 1) {
                return "disabled";
            }
            if (i == 2) {
                return io.reactivex.annotations.SchedulerSupport.CUSTOM;
            }
            if (i == 3) {
                return "time_based_default";
            }
            if (i == 4) {
                return "time_based_custom";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public final java.lang.String toAttributeValue$dd_sdk_android_rum_release(com.datadog.android.rum.internal.metric.NoValueReason reason) {
            if (reason == null) {
                return "unknown";
            }
            if (reason instanceof com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView) {
                int i = com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.Companion.WhenMappings.$EnumSwitchMapping$2[((com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView) reason).ordinal()];
                if (i == 1) {
                    return "unknown";
                }
                if (i == 2) {
                    return "no_previous_view";
                }
                if (i == 3) {
                    return "no_action";
                }
                if (i == 4) {
                    return "no_eligible_action";
                }
                if (i == 5) {
                    return "disabled";
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (!(reason instanceof com.datadog.android.rum.internal.metric.NoValueReason.TimeToNetworkSettle)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            int i2 = com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.Companion.WhenMappings.$EnumSwitchMapping$3[((com.datadog.android.rum.internal.metric.NoValueReason.TimeToNetworkSettle) reason).ordinal()];
            if (i2 == 1) {
                return "unknown";
            }
            if (i2 == 2) {
                return "not_settled_yet";
            }
            if (i2 == 3) {
                return "no_resources";
            }
            if (i2 == 4) {
                return "no_initial_resources";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public static final /* synthetic */ void access$putNonNull(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.Companion companion, java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            if (obj2 != null) {
                map.put(obj, obj2);
            }
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;
            public static final /* synthetic */ int[] $EnumSwitchMapping$3;

            static {
                int[] iArr = new int[com.datadog.android.rum.internal.domain.scope.RumViewType.values().length];
                try {
                    iArr[com.datadog.android.rum.internal.domain.scope.RumViewType.NONE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.datadog.android.rum.internal.domain.scope.RumViewType.FOREGROUND.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.datadog.android.rum.internal.domain.scope.RumViewType.BACKGROUND.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.datadog.android.rum.internal.domain.scope.RumViewType.APPLICATION_LAUNCH.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig.values().length];
                try {
                    iArr2[com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig.DISABLED.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr2[com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig.CUSTOM.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr2[com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig.TIME_BASED_DEFAULT.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr2[com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig.TIME_BASED_CUSTOM.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView.values().length];
                try {
                    iArr3[com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView.UNKNOWN.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused9) {
                }
                try {
                    iArr3[com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView.NO_PREVIOUS_VIEW.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused10) {
                }
                try {
                    iArr3[com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView.NO_ACTION.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused11) {
                }
                try {
                    iArr3[com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView.NO_ELIGIBLE_ACTION.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused12) {
                }
                try {
                    iArr3[com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView.DISABLED.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused13) {
                }
                $EnumSwitchMapping$2 = iArr3;
                int[] iArr4 = new int[com.datadog.android.rum.internal.metric.NoValueReason.TimeToNetworkSettle.values().length];
                try {
                    iArr4[com.datadog.android.rum.internal.metric.NoValueReason.TimeToNetworkSettle.UNKNOWN.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused14) {
                }
                try {
                    iArr4[com.datadog.android.rum.internal.metric.NoValueReason.TimeToNetworkSettle.NOT_SETTLED_YET.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused15) {
                }
                try {
                    iArr4[com.datadog.android.rum.internal.metric.NoValueReason.TimeToNetworkSettle.NO_RESOURCES.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused16) {
                }
                try {
                    iArr4[com.datadog.android.rum.internal.metric.NoValueReason.TimeToNetworkSettle.NO_INITIAL_RESOURCES.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused17) {
                }
                $EnumSwitchMapping$3 = iArr4;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

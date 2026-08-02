package com.datadog.android.rum.internal.metric.interactiontonextview;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u000fH\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b$\u0010 J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010%R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R0\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100*j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R0\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130*j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0013`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-"}, d2 = {"Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionIngestionValidator;", "ingestionValidator", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "lastInteractionIdentifier", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionIngestionValidator;Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;)V", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsState;", "getState", "(Ljava/lang/String;)Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsState;", "", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InternalInteractionContext;", "lasInteractions$dd_sdk_android_rum_release", "()Ljava/util/Map;", "", "lastViewCreatedTimestamps$dd_sdk_android_rum_release", "context", "", "onActionSent", "(Lcom/datadog/android/rum/internal/metric/interactiontonextview/InternalInteractionContext;)V", "timestamp", "onViewCreated", "(Ljava/lang/String;J)V", "getHighSpeedVideoSizes", "()V", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/lang/Long;", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;J)Lcom/datadog/android/rum/internal/metric/interactiontonextview/InternalInteractionContext;", "resolveMetric", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionIngestionValidator;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/getHighSpeedVideoSizes;", "Camera2StreamConfigurationMap", "Ljava/util/LinkedHashMap;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InteractionToNextViewMetricResolver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver.Companion INSTANCE = new com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver.Companion(null);
    public static final int MAX_ENTRIES = 4;
    private final java.util.LinkedHashMap<java.lang.String, com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext> Camera2StreamConfigurationMap;
    private final java.util.LinkedHashMap<java.lang.String, java.lang.Long> getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRanges;
    private final com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier getHighSpeedVideoFpsRangesFor;
    private final com.datadog.android.rum.internal.metric.interactiontonextview.InteractionIngestionValidator getHighSpeedVideoSizes;

    public InteractionToNextViewMetricResolver(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.rum.internal.metric.interactiontonextview.InteractionIngestionValidator interactionIngestionValidator, com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionIngestionValidator, "");
        this.getHighSpeedVideoFpsRanges = internalLogger;
        this.getHighSpeedVideoSizes = interactionIngestionValidator;
        this.getHighSpeedVideoFpsRangesFor = lastInteractionIdentifier;
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap<>();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap<>();
    }

    public /* synthetic */ InteractionToNextViewMetricResolver(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.rum.internal.metric.interactiontonextview.ActionTypeInteractionValidator actionTypeInteractionValidator, com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier timeBasedInteractionIdentifier, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, (i & 2) != 0 ? new com.datadog.android.rum.internal.metric.interactiontonextview.ActionTypeInteractionValidator() : actionTypeInteractionValidator, (i & 4) != 0 ? new com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier(0L, 1, null) : timeBasedInteractionIdentifier);
    }

    public final void onViewCreated(java.lang.String viewId, long timestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.put(viewId, java.lang.Long.valueOf(timestamp));
        getHighSpeedVideoSizes();
    }

    public final void onActionSent(com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            return;
        }
        if (this.getHighSpeedVideoSizes.validate(context)) {
            this.Camera2StreamConfigurationMap.put(context.getViewId$dd_sdk_android_rum_release(), context);
        }
        getHighSpeedVideoSizes();
    }

    public final java.lang.Long resolveMetric(final java.lang.String viewId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        getHighSpeedVideoSizes();
        java.lang.Long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(viewId);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            long longValue = highResolutionOutputSizeshNQ4ISI.longValue();
            java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(viewId);
            com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext highSpeedVideoFpsRangesFor = highSpeedVideoSizes != null ? getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, longValue) : null;
            if (highSpeedVideoFpsRangesFor != null) {
                long eventCreatedAtNanos$dd_sdk_android_rum_release = longValue - highSpeedVideoFpsRangesFor.getEventCreatedAtNanos$dd_sdk_android_rum_release();
                if (eventCreatedAtNanos$dd_sdk_android_rum_release > 0) {
                    return java.lang.Long.valueOf(eventCreatedAtNanos$dd_sdk_android_rum_release);
                }
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver$resolveMetric$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "[ViewNetworkSettledMetric] The difference between the last interaction and the current view is negative for viewId:".concat(java.lang.String.valueOf(viewId));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
        }
        return null;
    }

    public final com.datadog.android.rum.internal.metric.ViewInitializationMetricsState getState(java.lang.String viewId) {
        com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig viewInitializationMetricsConfig;
        com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView interactionToNextView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        java.lang.Long resolveMetric = resolveMetric(viewId);
        com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier = this.getHighSpeedVideoFpsRangesFor;
        if (lastInteractionIdentifier == null || (viewInitializationMetricsConfig = com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver.Companion.access$toConfig(INSTANCE, lastInteractionIdentifier)) == null) {
            viewInitializationMetricsConfig = com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig.DISABLED;
        }
        if (resolveMetric != null) {
            interactionToNextView = null;
        } else if (this.getHighSpeedVideoFpsRangesFor == null) {
            interactionToNextView = com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView.DISABLED;
        } else {
            java.lang.Long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(viewId);
            if (highResolutionOutputSizeshNQ4ISI == null) {
                interactionToNextView = com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView.UNKNOWN;
            } else {
                long longValue = highResolutionOutputSizeshNQ4ISI.longValue();
                java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(viewId);
                if (highSpeedVideoSizes == null) {
                    interactionToNextView = com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView.NO_PREVIOUS_VIEW;
                } else if (this.Camera2StreamConfigurationMap.get(highSpeedVideoSizes) == null) {
                    interactionToNextView = com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView.NO_ACTION;
                } else if (getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, longValue) == null) {
                    interactionToNextView = com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView.NO_ELIGIBLE_ACTION;
                } else {
                    interactionToNextView = com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView.UNKNOWN;
                }
            }
        }
        return new com.datadog.android.rum.internal.metric.ViewInitializationMetricsState(resolveMetric, viewInitializationMetricsConfig, interactionToNextView);
    }

    private final void getHighSpeedVideoSizes() {
        while (this.Camera2StreamConfigurationMap.entrySet().size() > 4) {
            java.util.Set<java.util.Map.Entry<java.lang.String, com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext>> entrySet = this.Camera2StreamConfigurationMap.entrySet();
            java.util.Set<java.util.Map.Entry<java.lang.String, com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext>> entrySet2 = this.Camera2StreamConfigurationMap.entrySet();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet2, "");
            entrySet.remove(kotlin.collections.CollectionsKt.first(entrySet2));
        }
        while (this.getHighResolutionOutputSizeshNQ4ISI.entrySet().size() > 4) {
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> linkedHashMap = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.Set<java.lang.String> keySet = linkedHashMap.keySet();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "");
            linkedHashMap.remove(kotlin.collections.CollectionsKt.first(keySet));
        }
    }

    private final java.lang.Long getHighResolutionOutputSizeshNQ4ISI(final java.lang.String p0) {
        java.lang.Long l = this.getHighResolutionOutputSizeshNQ4ISI.get(p0);
        if (l == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver$resolveCurrentViewCreationTimestamp$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "[ViewNetworkSettledMetric] The view was not yet created for this viewId:".concat(java.lang.String.valueOf(p0));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        return l;
    }

    private final com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext getHighSpeedVideoFpsRangesFor(java.lang.String p0, long p1) {
        com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext internalInteractionContext;
        com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier = this.getHighSpeedVideoFpsRangesFor;
        if (lastInteractionIdentifier == null || (internalInteractionContext = this.Camera2StreamConfigurationMap.get(p0)) == null) {
            return null;
        }
        com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver.Companion companion = INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(internalInteractionContext, "");
        if (lastInteractionIdentifier.validate(com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver.Companion.access$toPreviousViewLastInteractionContext(companion, internalInteractionContext, p1))) {
            return internalInteractionContext;
        }
        return null;
    }

    private final java.lang.String getHighSpeedVideoSizes(java.lang.String p0) {
        java.util.Set<java.lang.String> keySet = this.getHighResolutionOutputSizeshNQ4ISI.keySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "");
        int indexOf = kotlin.collections.CollectionsKt.indexOf(keySet, p0);
        java.util.Set<java.lang.String> keySet2 = this.getHighResolutionOutputSizeshNQ4ISI.keySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet2, "");
        return (java.lang.String) kotlin.collections.CollectionsKt.elementAtOrNull(keySet2, indexOf - 1);
    }

    public final java.util.Map<java.lang.String, com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext> lasInteractions$dd_sdk_android_rum_release() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.Map<java.lang.String, java.lang.Long> lastViewCreatedTimestamps$dd_sdk_android_rum_release() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver$Companion;", "", "<init>", "()V", "", "MAX_ENTRIES", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig access$toConfig(com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver.Companion companion, com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier) {
            if (!(lastInteractionIdentifier instanceof com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier)) {
                return com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig.CUSTOM;
            }
            if (((com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier) lastInteractionIdentifier).defaultThresholdUsed$dd_sdk_android_rum_release()) {
                return com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig.TIME_BASED_DEFAULT;
            }
            return com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig.TIME_BASED_CUSTOM;
        }

        public static final /* synthetic */ com.datadog.android.rum.metric.interactiontonextview.PreviousViewLastInteractionContext access$toPreviousViewLastInteractionContext(com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver.Companion companion, com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext internalInteractionContext, long j) {
            return new com.datadog.android.rum.metric.interactiontonextview.PreviousViewLastInteractionContext(internalInteractionContext.getActionType$dd_sdk_android_rum_release(), internalInteractionContext.getEventCreatedAtNanos$dd_sdk_android_rum_release(), java.lang.Long.valueOf(j));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

package com.datadog.android.rum.internal.domain.event;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\b\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u008f\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0001\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u0001HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u009a\u0001\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u0004\u0018\u00010\u00022\u0006\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0007¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u0018R\u0014\u00104\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b5\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b6\u0010\u0018R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b7\u0010\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b8\u0010\u0018R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b9\u0010\u0018R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b:\u0010\u0018"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventMapper;", "Lcom/datadog/android/event/EventMapper;", "", "Lcom/datadog/android/rum/model/ViewEvent;", "viewEventMapper", "Lcom/datadog/android/rum/model/ErrorEvent;", "errorEventMapper", "Lcom/datadog/android/rum/model/ResourceEvent;", "resourceEventMapper", "Lcom/datadog/android/rum/model/ActionEvent;", "actionEventMapper", "Lcom/datadog/android/rum/model/LongTaskEvent;", "longTaskEventMapper", "Lcom/datadog/android/rum/model/VitalOperationStepEvent;", "vitalOperationStepEventMapper", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent;", "vitalAppLaunchEventMapper", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "telemetryConfigurationMapper", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/api/InternalLogger;)V", "component1", "()Lcom/datadog/android/event/EventMapper;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/rum/internal/domain/event/RumEventMapper;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "event", "map", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/event/EventMapper;", "getActionEventMapper", "getErrorEventMapper", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoSizes", "getLongTaskEventMapper", "getResourceEventMapper", "getTelemetryConfigurationMapper", "getViewEventMapper", "getVitalAppLaunchEventMapper", "getVitalOperationStepEventMapper", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RumEventMapper implements com.datadog.android.event.EventMapper<java.lang.Object> {
    public static final java.lang.String EVENT_NULL_WARNING_MESSAGE = "RumEventMapper: the returned mapped object was null. This event will be dropped: %s";
    public static final java.lang.String NOT_SAME_EVENT_INSTANCE_WARNING_MESSAGE = "RumEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s";
    public static final java.lang.String NO_DROPPING_FATAL_ERRORS_WARNING_MESSAGE = "RumEventMapper: the return from the ErrorEvent mapper was null for a crash. Dropping crashes in from the event mapper is not supported. The original event object will be used instead.";
    public static final java.lang.String NO_EVENT_MAPPER_ASSIGNED_WARNING_MESSAGE = "RumEventMapper: there was no EventMapper assigned for RUM event type: %s";
    public static final java.lang.String VIEW_EVENT_NULL_WARNING_MESSAGE = "RumEventMapper: the returned mapped ViewEvent was null. The original event object will be used instead: %s";
    private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ActionEvent> actionEventMapper;
    private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ErrorEvent> errorEventMapper;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;
    private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.LongTaskEvent> longTaskEventMapper;
    private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ResourceEvent> resourceEventMapper;
    private final com.datadog.android.event.EventMapper<com.datadog.android.telemetry.model.TelemetryConfigurationEvent> telemetryConfigurationMapper;
    private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ViewEvent> viewEventMapper;
    private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalAppLaunchEvent> vitalAppLaunchEventMapper;
    private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalOperationStepEvent> vitalOperationStepEventMapper;

    public RumEventMapper(com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ViewEvent> eventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ErrorEvent> eventMapper2, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ResourceEvent> eventMapper3, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ActionEvent> eventMapper4, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.LongTaskEvent> eventMapper5, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalOperationStepEvent> eventMapper6, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalAppLaunchEvent> eventMapper7, com.datadog.android.event.EventMapper<com.datadog.android.telemetry.model.TelemetryConfigurationEvent> eventMapper8, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.viewEventMapper = eventMapper;
        this.errorEventMapper = eventMapper2;
        this.resourceEventMapper = eventMapper3;
        this.actionEventMapper = eventMapper4;
        this.longTaskEventMapper = eventMapper5;
        this.vitalOperationStepEventMapper = eventMapper6;
        this.vitalAppLaunchEventMapper = eventMapper7;
        this.telemetryConfigurationMapper = eventMapper8;
        this.getHighSpeedVideoSizes = internalLogger;
    }

    public /* synthetic */ RumEventMapper(com.datadog.android.event.EventMapper eventMapper, com.datadog.android.event.EventMapper eventMapper2, com.datadog.android.event.EventMapper eventMapper3, com.datadog.android.event.EventMapper eventMapper4, com.datadog.android.event.EventMapper eventMapper5, com.datadog.android.event.EventMapper eventMapper6, com.datadog.android.event.EventMapper eventMapper7, com.datadog.android.event.EventMapper eventMapper8, com.datadog.android.api.InternalLogger internalLogger, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.datadog.android.event.NoOpEventMapper() : eventMapper, (i & 2) != 0 ? new com.datadog.android.event.NoOpEventMapper() : eventMapper2, (i & 4) != 0 ? new com.datadog.android.event.NoOpEventMapper() : eventMapper3, (i & 8) != 0 ? new com.datadog.android.event.NoOpEventMapper() : eventMapper4, (i & 16) != 0 ? new com.datadog.android.event.NoOpEventMapper() : eventMapper5, (i & 32) != 0 ? new com.datadog.android.event.NoOpEventMapper() : eventMapper6, (i & 64) != 0 ? new com.datadog.android.event.NoOpEventMapper() : eventMapper7, (i & 128) != 0 ? new com.datadog.android.event.NoOpEventMapper() : eventMapper8, internalLogger);
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ViewEvent> getViewEventMapper() {
        return this.viewEventMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ErrorEvent> getErrorEventMapper() {
        return this.errorEventMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ResourceEvent> getResourceEventMapper() {
        return this.resourceEventMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ActionEvent> getActionEventMapper() {
        return this.actionEventMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.LongTaskEvent> getLongTaskEventMapper() {
        return this.longTaskEventMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalOperationStepEvent> getVitalOperationStepEventMapper() {
        return this.vitalOperationStepEventMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalAppLaunchEvent> getVitalAppLaunchEventMapper() {
        return this.vitalAppLaunchEventMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.telemetry.model.TelemetryConfigurationEvent> getTelemetryConfigurationMapper() {
        return this.telemetryConfigurationMapper;
    }

    @Override // com.datadog.android.event.EventMapper
    public final java.lang.Object map(final java.lang.Object event) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        boolean z = event instanceof com.datadog.android.rum.model.ViewEvent;
        if (z) {
            obj = this.viewEventMapper.map(event);
        } else if (event instanceof com.datadog.android.rum.model.ActionEvent) {
            obj = this.actionEventMapper.map(event);
        } else if (event instanceof com.datadog.android.rum.model.ErrorEvent) {
            com.datadog.android.rum.model.ErrorEvent errorEvent = (com.datadog.android.rum.model.ErrorEvent) event;
            if (kotlin.jvm.internal.Intrinsics.areEqual(errorEvent.getError().isCrash(), java.lang.Boolean.TRUE)) {
                com.datadog.android.rum.model.ErrorEvent map = this.errorEventMapper.map(event);
                if (map == null) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMapper$mapRumEvent$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return com.datadog.android.rum.internal.domain.event.RumEventMapper.NO_DROPPING_FATAL_ERRORS_WARNING_MESSAGE;
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    obj = errorEvent;
                } else {
                    obj = map;
                }
            } else {
                obj = this.errorEventMapper.map(event);
            }
        } else if (event instanceof com.datadog.android.rum.model.ResourceEvent) {
            obj = this.resourceEventMapper.map(event);
        } else if (event instanceof com.datadog.android.rum.model.LongTaskEvent) {
            obj = this.longTaskEventMapper.map(event);
        } else if (event instanceof com.datadog.android.rum.model.VitalOperationStepEvent) {
            obj = this.vitalOperationStepEventMapper.map(event);
        } else if (event instanceof com.datadog.android.rum.model.VitalAppLaunchEvent) {
            obj = this.vitalAppLaunchEventMapper.map(event);
        } else if (event instanceof com.datadog.android.telemetry.model.TelemetryConfigurationEvent) {
            obj = this.telemetryConfigurationMapper.map(event);
        } else {
            if (!(event instanceof com.datadog.android.telemetry.model.TelemetryDebugEvent) && !(event instanceof com.datadog.android.telemetry.model.TelemetryUsageEvent) && !(event instanceof com.datadog.android.telemetry.model.TelemetryErrorEvent)) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMapper$mapRumEvent$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.domain.event.RumEventMapper.NO_EVENT_MAPPER_ASSIGNED_WARNING_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{event.getClass().getSimpleName()}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
            obj = event;
        }
        if (z && (obj == null || obj != event)) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMapper$resolveEvent$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.domain.event.RumEventMapper.VIEW_EVENT_NULL_WARNING_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{event}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else {
            if (obj == null) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMapper$resolveEvent$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.domain.event.RumEventMapper.EVENT_NULL_WARNING_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{event}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                return null;
            }
            if (obj != event) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMapper$resolveEvent$3
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.domain.event.RumEventMapper.NOT_SAME_EVENT_INSTANCE_WARNING_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{event}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                return null;
            }
        }
        return event;
    }

    public final java.lang.String toString() {
        com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ViewEvent> eventMapper = this.viewEventMapper;
        com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ErrorEvent> eventMapper2 = this.errorEventMapper;
        com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ResourceEvent> eventMapper3 = this.resourceEventMapper;
        com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ActionEvent> eventMapper4 = this.actionEventMapper;
        com.datadog.android.event.EventMapper<com.datadog.android.rum.model.LongTaskEvent> eventMapper5 = this.longTaskEventMapper;
        com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalOperationStepEvent> eventMapper6 = this.vitalOperationStepEventMapper;
        com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalAppLaunchEvent> eventMapper7 = this.vitalAppLaunchEventMapper;
        com.datadog.android.event.EventMapper<com.datadog.android.telemetry.model.TelemetryConfigurationEvent> eventMapper8 = this.telemetryConfigurationMapper;
        com.datadog.android.api.InternalLogger internalLogger = this.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RumEventMapper(viewEventMapper=");
        sb.append(eventMapper);
        sb.append(", errorEventMapper=");
        sb.append(eventMapper2);
        sb.append(", resourceEventMapper=");
        sb.append(eventMapper3);
        sb.append(", actionEventMapper=");
        sb.append(eventMapper4);
        sb.append(", longTaskEventMapper=");
        sb.append(eventMapper5);
        sb.append(", vitalOperationStepEventMapper=");
        sb.append(eventMapper6);
        sb.append(", vitalAppLaunchEventMapper=");
        sb.append(eventMapper7);
        sb.append(", telemetryConfigurationMapper=");
        sb.append(eventMapper8);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(internalLogger);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((this.viewEventMapper.hashCode() * 31) + this.errorEventMapper.hashCode()) * 31) + this.resourceEventMapper.hashCode()) * 31) + this.actionEventMapper.hashCode()) * 31) + this.longTaskEventMapper.hashCode()) * 31) + this.vitalOperationStepEventMapper.hashCode()) * 31) + this.vitalAppLaunchEventMapper.hashCode()) * 31) + this.telemetryConfigurationMapper.hashCode()) * 31) + this.getHighSpeedVideoSizes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.domain.event.RumEventMapper)) {
            return false;
        }
        com.datadog.android.rum.internal.domain.event.RumEventMapper rumEventMapper = (com.datadog.android.rum.internal.domain.event.RumEventMapper) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.viewEventMapper, rumEventMapper.viewEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorEventMapper, rumEventMapper.errorEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.resourceEventMapper, rumEventMapper.resourceEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionEventMapper, rumEventMapper.actionEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.longTaskEventMapper, rumEventMapper.longTaskEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.vitalOperationStepEventMapper, rumEventMapper.vitalOperationStepEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.vitalAppLaunchEventMapper, rumEventMapper.vitalAppLaunchEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.telemetryConfigurationMapper, rumEventMapper.telemetryConfigurationMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, rumEventMapper.getHighSpeedVideoSizes);
    }

    public final com.datadog.android.rum.internal.domain.event.RumEventMapper copy(com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ViewEvent> viewEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ErrorEvent> errorEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ResourceEvent> resourceEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ActionEvent> actionEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.LongTaskEvent> longTaskEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalOperationStepEvent> vitalOperationStepEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalAppLaunchEvent> vitalAppLaunchEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.telemetry.model.TelemetryConfigurationEvent> telemetryConfigurationMapper, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewEventMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorEventMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceEventMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionEventMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longTaskEventMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalOperationStepEventMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalAppLaunchEventMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryConfigurationMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return new com.datadog.android.rum.internal.domain.event.RumEventMapper(viewEventMapper, errorEventMapper, resourceEventMapper, actionEventMapper, longTaskEventMapper, vitalOperationStepEventMapper, vitalAppLaunchEventMapper, telemetryConfigurationMapper, internalLogger);
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.telemetry.model.TelemetryConfigurationEvent> component8() {
        return this.telemetryConfigurationMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalAppLaunchEvent> component7() {
        return this.vitalAppLaunchEventMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalOperationStepEvent> component6() {
        return this.vitalOperationStepEventMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.LongTaskEvent> component5() {
        return this.longTaskEventMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ActionEvent> component4() {
        return this.actionEventMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ResourceEvent> component3() {
        return this.resourceEventMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ErrorEvent> component2() {
        return this.errorEventMapper;
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ViewEvent> component1() {
        return this.viewEventMapper;
    }
}

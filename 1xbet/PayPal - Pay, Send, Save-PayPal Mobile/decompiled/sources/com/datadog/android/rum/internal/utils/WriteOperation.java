package com.datadog.android.rum.internal.utils;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\"\u0010\u0006\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\u0010\u0011J\u001a\u0010\u001a\u001a\u00020\t2\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0002J-\u0010\u0014\u001a\u00020\u00002%\u0010\u001e\u001a!\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\u0018J-\u0010\u0019\u001a\u00020\u00002%\u0010\u001e\u001a!\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\u0018J\u0006\u0010\u001f\u001a\u00020\tR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\u0014\u001a!\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R-\u0010\u0019\u001a!\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/internal/utils/WriteOperation;", "", "sdkCore", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "datadogContext", "Lcom/datadog/android/api/context/DatadogContext;", "writeScope", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "", "Lcom/datadog/android/api/feature/EventWriteScope;", "rumDataWriter", "Lcom/datadog/android/api/storage/DataWriter;", "eventType", "Lcom/datadog/android/api/storage/EventType;", "eventSource", "Lkotlin/Function0;", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;Lcom/datadog/android/api/storage/EventType;Lkotlin/jvm/functions/Function0;)V", "advancedRumMonitor", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "onError", "Lkotlin/ParameterName;", "name", "rumMonitor", "Lcom/datadog/android/rum/internal/utils/EventOutcomeAction;", "onSuccess", "notifyEventWriteFailure", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "action", "submit", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WriteOperation {
    public static final java.lang.String NO_ERROR_CALLBACK_PROVIDED_WARNING = "Write operation failed, but no onError callback was provided.";
    public static final java.lang.String WRITE_OPERATION_FAILED_ERROR = "Write operation failed.";
    public static final java.lang.String WRITE_OPERATION_IGNORED = "Write operation ignored, session is expired or RUM feature is disabled.";
    private final com.datadog.android.api.storage.EventType Camera2StreamConfigurationMap;
    private final com.datadog.android.api.context.DatadogContext getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.jvm.functions.Function1<? super com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit> getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function0<java.lang.Object> getHighSpeedVideoFpsRangesFor;
    private final com.datadog.android.rum.internal.monitor.AdvancedRumMonitor getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> getInputFormats;
    private final com.datadog.android.api.feature.FeatureSdkCore getInputSizeshNQ4ISI;
    private final com.datadog.android.api.storage.DataWriter<java.lang.Object> getOutputFormats;
    private kotlin.jvm.functions.Function1<? super com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit> getOutputMinFrameDuration;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.utils.WriteOperation.Companion INSTANCE = new com.datadog.android.rum.internal.utils.WriteOperation.Companion(null);
    private static final kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit> NO_OP_EVENT_OUTCOME_ACTION = new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.utils.WriteOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
            getHighSpeedVideoFpsRanges(advancedRumMonitor);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoFpsRanges(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public WriteOperation(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> function1, com.datadog.android.api.storage.DataWriter<java.lang.Object> dataWriter, com.datadog.android.api.storage.EventType eventType, kotlin.jvm.functions.Function0<? extends java.lang.Object> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getInputSizeshNQ4ISI = featureSdkCore;
        this.getHighResolutionOutputSizeshNQ4ISI = datadogContext;
        this.getInputFormats = function1;
        this.getOutputFormats = dataWriter;
        this.Camera2StreamConfigurationMap = eventType;
        this.getHighSpeedVideoFpsRangesFor = function0;
        com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get(featureSdkCore);
        this.getHighSpeedVideoSizes = rumMonitor instanceof com.datadog.android.rum.internal.monitor.AdvancedRumMonitor ? (com.datadog.android.rum.internal.monitor.AdvancedRumMonitor) rumMonitor : null;
        kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit> function12 = NO_OP_EVENT_OUTCOME_ACTION;
        this.getHighSpeedVideoFpsRanges = function12;
        this.getOutputMinFrameDuration = function12;
    }

    public final com.datadog.android.rum.internal.utils.WriteOperation onError(kotlin.jvm.functions.Function1<? super com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        this.getHighSpeedVideoFpsRanges = action;
        return this;
    }

    public final com.datadog.android.rum.internal.utils.WriteOperation onSuccess(kotlin.jvm.functions.Function1<? super com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        this.getOutputMinFrameDuration = action;
        return this;
    }

    public final void submit() {
        this.getInputFormats.invoke(new kotlin.jvm.functions.Function1<com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.utils.WriteOperation$submit$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                getHighSpeedVideoFpsRanges(eventBatchWriter);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                com.datadog.android.api.storage.DataWriter dataWriter;
                kotlin.jvm.functions.Function0 function0;
                com.datadog.android.api.storage.DataWriter dataWriter2;
                com.datadog.android.api.storage.EventType eventType;
                com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor;
                kotlin.jvm.functions.Function1 function1;
                com.datadog.android.api.feature.FeatureSdkCore featureSdkCore;
                com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor2;
                kotlin.jvm.functions.Function1 function12;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBatchWriter, "");
                dataWriter = com.datadog.android.rum.internal.utils.WriteOperation.this.getOutputFormats;
                if (dataWriter instanceof com.datadog.android.api.storage.NoOpDataWriter) {
                    featureSdkCore = com.datadog.android.rum.internal.utils.WriteOperation.this.getInputSizeshNQ4ISI;
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(featureSdkCore.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.utils.WriteOperation$submit$1.1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return com.datadog.android.rum.internal.utils.WriteOperation.WRITE_OPERATION_IGNORED;
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    advancedRumMonitor2 = com.datadog.android.rum.internal.utils.WriteOperation.this.getHighSpeedVideoSizes;
                    if (advancedRumMonitor2 != null) {
                        function12 = com.datadog.android.rum.internal.utils.WriteOperation.this.getHighSpeedVideoFpsRanges;
                        function12.invoke(advancedRumMonitor2);
                        return;
                    }
                    return;
                }
                try {
                    function0 = com.datadog.android.rum.internal.utils.WriteOperation.this.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object invoke = function0.invoke();
                    dataWriter2 = com.datadog.android.rum.internal.utils.WriteOperation.this.getOutputFormats;
                    eventType = com.datadog.android.rum.internal.utils.WriteOperation.this.Camera2StreamConfigurationMap;
                    if (dataWriter2.write(eventBatchWriter, invoke, eventType)) {
                        advancedRumMonitor = com.datadog.android.rum.internal.utils.WriteOperation.this.getHighSpeedVideoSizes;
                        if (advancedRumMonitor != null) {
                            function1 = com.datadog.android.rum.internal.utils.WriteOperation.this.getOutputMinFrameDuration;
                            function1.invoke(advancedRumMonitor);
                            return;
                        }
                        return;
                    }
                    com.datadog.android.rum.internal.utils.WriteOperation.this.Camera2StreamConfigurationMap(null);
                } catch (java.lang.Exception e) {
                    com.datadog.android.rum.internal.utils.WriteOperation.this.Camera2StreamConfigurationMap(e);
                }
            }

            {
                super(1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(java.lang.Exception exc) {
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(com.datadog.android.api.InternalLogger.Target.USER);
        if (exc != null) {
            mutableListOf.add(com.datadog.android.api.InternalLogger.Target.TELEMETRY);
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getInputSizeshNQ4ISI.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, mutableListOf, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.utils.WriteOperation$notifyEventWriteFailure$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.rum.internal.utils.WriteOperation.WRITE_OPERATION_FAILED_ERROR;
            }
        }, (java.lang.Throwable) exc, false, (java.util.Map) null, 48, (java.lang.Object) null);
        com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor = this.getHighSpeedVideoSizes;
        if (advancedRumMonitor != null) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, NO_OP_EVENT_OUTCOME_ACTION)) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getInputSizeshNQ4ISI.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.utils.WriteOperation$notifyEventWriteFailure$2$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.rum.internal.utils.WriteOperation.NO_ERROR_CALLBACK_PROVIDED_WARNING;
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
            this.getHighSpeedVideoFpsRanges.invoke(advancedRumMonitor);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R,\u0010\f\u001a\u0017\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n0\u0007j\u0002`\u000b8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006"}, d2 = {"Lcom/datadog/android/rum/internal/utils/WriteOperation$Companion;", "", "<init>", "()V", "", "NO_ERROR_CALLBACK_PROVIDED_WARNING", "Ljava/lang/String;", "Lkotlin/Function1;", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "Lkotlin/ParameterName;", "", "Lcom/datadog/android/rum/internal/utils/EventOutcomeAction;", "NO_OP_EVENT_OUTCOME_ACTION", "Lkotlin/jvm/functions/Function1;", "getNO_OP_EVENT_OUTCOME_ACTION", "()Lkotlin/jvm/functions/Function1;", "WRITE_OPERATION_FAILED_ERROR", "WRITE_OPERATION_IGNORED"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit> getNO_OP_EVENT_OUTCOME_ACTION() {
            return com.datadog.android.rum.internal.utils.WriteOperation.NO_OP_EVENT_OUTCOME_ACTION;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

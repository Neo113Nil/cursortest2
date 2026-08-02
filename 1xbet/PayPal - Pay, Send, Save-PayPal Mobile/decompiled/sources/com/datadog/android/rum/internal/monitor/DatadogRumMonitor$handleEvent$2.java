package com.datadog.android.rum.internal.monitor;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\"\u0010\u0006\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "p0", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "", "Lcom/datadog/android/api/feature/EventWriteScope;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DatadogRumMonitor$handleEvent$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<com.datadog.android.api.context.DatadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit>, kotlin.Unit> {
    final /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.datadog.android.rum.internal.monitor.DatadogRumMonitor Camera2StreamConfigurationMap;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit> function1) {
        getHighResolutionOutputSizeshNQ4ISI(datadogContext, function1);
        return kotlin.Unit.INSTANCE;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(final com.datadog.android.api.context.DatadogContext datadogContext, final kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> function1) {
        com.datadog.android.core.InternalSdkCore internalSdkCore;
        com.datadog.android.core.InternalSdkCore internalSdkCore2;
        com.datadog.android.core.InternalSdkCore internalSdkCore3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (this.Camera2StreamConfigurationMap.getExecutorService().isShutdown()) {
            return;
        }
        java.util.concurrent.ExecutorService executorService = this.Camera2StreamConfigurationMap.getExecutorService();
        internalSdkCore = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
        com.datadog.android.api.InternalLogger internalLogger = internalSdkCore.getInternalLogger();
        java.lang.String valueOf = java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(this.$getHighSpeedVideoFpsRangesFor.getClass()).getSimpleName());
        final com.datadog.android.rum.internal.monitor.DatadogRumMonitor datadogRumMonitor = this.Camera2StreamConfigurationMap;
        final com.datadog.android.rum.internal.domain.scope.RumRawEvent rumRawEvent = this.$getHighSpeedVideoFpsRangesFor;
        java.util.concurrent.Future submitSafe = com.datadog.android.core.internal.utils.ConcurrencyExtKt.submitSafe(executorService, "Rum event handling", internalLogger, new com.datadog.android.internal.thread.NamedCallable(valueOf, new java.util.concurrent.Callable() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$handleEvent$2$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.datadog.android.rum.internal.domain.RumContext highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = com.datadog.android.rum.internal.monitor.DatadogRumMonitor$handleEvent$2.getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.rum.internal.monitor.DatadogRumMonitor.this, rumRawEvent, datadogContext, function1);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }));
        internalSdkCore2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
        final com.datadog.android.rum.internal.domain.RumContext rumContext = (com.datadog.android.rum.internal.domain.RumContext) com.datadog.android.core.internal.utils.ConcurrencyExtKt.getSafe(submitSafe, "Rum get context", internalSdkCore2.getInternalLogger());
        if (rumContext != null) {
            internalSdkCore3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            internalSdkCore3.updateFeatureContext("rum", false, new kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$handleEvent$2.1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.util.Map<java.lang.String, java.lang.Object> map) {
                    getHighSpeedVideoSizes(map);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(java.util.Map<java.lang.String, java.lang.Object> map) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                    map.putAll(com.datadog.android.rum.internal.domain.RumContext.this.toMap());
                }

                {
                    super(1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.datadog.android.rum.internal.domain.RumContext getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.rum.internal.monitor.DatadogRumMonitor datadogRumMonitor, com.datadog.android.rum.internal.domain.scope.RumRawEvent rumRawEvent, com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1 function1) {
        com.datadog.android.rum.internal.domain.RumContext highResolutionOutputSizeshNQ4ISI;
        synchronized (datadogRumMonitor.getRootScope()) {
            com.datadog.android.rum.internal.monitor.DatadogRumMonitor.access$handleEventWithMethodCallPerf(datadogRumMonitor, rumRawEvent, datadogContext, function1);
            datadogRumMonitor.notifyDebugListenerWithState$dd_sdk_android_rum_release();
            highResolutionOutputSizeshNQ4ISI = datadogRumMonitor.getHighResolutionOutputSizeshNQ4ISI();
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatadogRumMonitor$handleEvent$2(com.datadog.android.rum.internal.monitor.DatadogRumMonitor datadogRumMonitor, com.datadog.android.rum.internal.domain.scope.RumRawEvent rumRawEvent) {
        super(2);
        this.Camera2StreamConfigurationMap = datadogRumMonitor;
        this.$getHighSpeedVideoFpsRangesFor = rumRawEvent;
    }
}

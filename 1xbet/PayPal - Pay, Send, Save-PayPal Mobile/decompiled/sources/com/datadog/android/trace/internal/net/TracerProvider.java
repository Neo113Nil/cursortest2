package com.datadog.android.trace.internal.net;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB9\b\u0000\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R,\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/trace/internal/net/TracerProvider;", "", "Lkotlin/Function2;", "Lcom/datadog/android/api/SdkCore;", "", "Lcom/datadog/android/trace/TracingHeaderType;", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "localTracerFactory", "Lkotlin/Function0;", "globalTracerProvider", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "localHeaderTypes", "", "networkingLibraryName", "provideTracer", "(Lcom/datadog/android/core/InternalSdkCore;Ljava/util/Set;Ljava/lang/String;)Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicReference;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TracerProvider {
    public static final java.lang.String WARNING_DEFAULT_TRACER = "You added a ApmNetworkInstrumentation to your %s instrumentation, but you didn't register any DatadogTracer. We automatically created a local tracer for you.";
    public static final java.lang.String WARNING_TRACING_DISABLED = "You added a ApmNetworkInstrumentation to your %s, but you did not enable the TracingFeature. Your requests won't be traced.";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<com.datadog.android.trace.api.tracer.DatadogTracer> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<com.datadog.android.api.SdkCore, java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>, com.datadog.android.trace.api.tracer.DatadogTracer> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<com.datadog.android.trace.api.tracer.DatadogTracer> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public TracerProvider(kotlin.jvm.functions.Function2<? super com.datadog.android.api.SdkCore, ? super java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>, ? extends com.datadog.android.trace.api.tracer.DatadogTracer> function2, kotlin.jvm.functions.Function0<? extends com.datadog.android.trace.api.tracer.DatadogTracer> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public final com.datadog.android.trace.api.tracer.DatadogTracer provideTracer(com.datadog.android.core.InternalSdkCore sdkCore, java.util.Set<? extends com.datadog.android.trace.TracingHeaderType> localHeaderTypes, final java.lang.String networkingLibraryName) {
        com.datadog.android.trace.api.tracer.DatadogTracer invoke;
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localHeaderTypes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkingLibraryName, "");
            com.datadog.android.api.feature.FeatureScope feature = sdkCore.getFeature("tracing");
            invoke = this.getHighSpeedVideoFpsRangesFor.invoke();
            if (feature == null) {
                com.datadog.android.api.InternalLoggerKt.logToUser(sdkCore.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, true, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.internal.net.TracerProvider$provideTracer$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.trace.internal.net.TracerProvider.WARNING_TRACING_DISABLED, java.util.Arrays.copyOf(new java.lang.Object[]{networkingLibraryName}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                });
                invoke = null;
            } else if (invoke != null) {
                this.getHighSpeedVideoSizes.set(null);
            } else {
                if (this.getHighSpeedVideoSizes.get() == null) {
                    androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, null, this.getHighSpeedVideoFpsRanges.invoke(sdkCore, kotlin.collections.SetsKt.plus((java.util.Set) localHeaderTypes, (java.lang.Iterable) sdkCore.getFirstPartyHostResolver().getAllHeaderTypes())));
                    com.datadog.android.api.InternalLoggerKt.logToUser$default(sdkCore.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, false, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.internal.net.TracerProvider$provideTracer$2
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.trace.internal.net.TracerProvider.WARNING_DEFAULT_TRACER, java.util.Arrays.copyOf(new java.lang.Object[]{networkingLibraryName}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            return format;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, 2, null);
                }
                invoke = this.getHighSpeedVideoSizes.get();
            }
        }
        return invoke;
    }
}

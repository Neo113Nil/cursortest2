package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010\"J\u0015\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R*\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(8\u0007@AX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R$\u00103\u001a\u0004\u0018\u00010\u001f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogTracingToolkit;", "", "<init>", "()V", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "tracer", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "span", "", "asyncPropagating", "Lcom/datadog/android/trace/api/scope/DatadogScope;", "activateSpan", "(Lcom/datadog/android/trace/api/tracer/DatadogTracer;Lcom/datadog/android/trace/api/span/DatadogSpan;Z)Lcom/datadog/android/trace/api/scope/DatadogScope;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "errorPriority", "", "addThrowable", "(Lcom/datadog/android/trace/api/span/DatadogSpan;Ljava/lang/Throwable;B)V", "", "name", "Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/datadog/android/trace/internal/ApmNetworkInstrumentation;", "createApmNetworkInstrumentation", "(Ljava/lang/String;Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;)Lcom/datadog/android/trace/internal/ApmNetworkInstrumentation;", "oldHeader", "newHeader", "mergeBaggage", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "builder", "setSdkV2Compatible", "(Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "setTraceId128BitGenerationEnabled", "Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "context", "setTracingSamplingPriorityIfNecessary", "(Lcom/datadog/android/trace/api/span/DatadogSpanContext;)V", "Lcom/datadog/android/trace/internal/DatadogPropagationHelper;", "<set-?>", "propagationHelper", "Lcom/datadog/android/trace/internal/DatadogPropagationHelper;", "getPropagationHelper", "()Lcom/datadog/android/trace/internal/DatadogPropagationHelper;", "setPropagationHelper$dd_sdk_android_trace_release", "(Lcom/datadog/android/trace/internal/DatadogPropagationHelper;)V", "Lcom/datadog/android/trace/internal/DatadogSpanIdConverter;", "spanIdConverter", "Lcom/datadog/android/trace/internal/DatadogSpanIdConverter;", "testBuilderProvider", "Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "getTestBuilderProvider$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "setTestBuilderProvider$dd_sdk_android_trace_release", "(Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatadogTracingToolkit {
    private static com.datadog.android.trace.api.tracer.DatadogTracerBuilder testBuilderProvider;
    public static final com.datadog.android.trace.internal.DatadogTracingToolkit INSTANCE = new com.datadog.android.trace.internal.DatadogTracingToolkit();
    public static final com.datadog.android.trace.internal.DatadogSpanIdConverter spanIdConverter = new com.datadog.android.trace.internal.DatadogSpanIdConverter();
    private static com.datadog.android.trace.internal.DatadogPropagationHelper propagationHelper = new com.datadog.android.trace.internal.DatadogPropagationHelper();

    private DatadogTracingToolkit() {
    }

    public final com.datadog.android.trace.internal.DatadogPropagationHelper getPropagationHelper() {
        return propagationHelper;
    }

    public final void setPropagationHelper$dd_sdk_android_trace_release(com.datadog.android.trace.internal.DatadogPropagationHelper datadogPropagationHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogPropagationHelper, "");
        propagationHelper = datadogPropagationHelper;
    }

    public final com.datadog.android.trace.api.tracer.DatadogTracerBuilder getTestBuilderProvider$dd_sdk_android_trace_release() {
        return testBuilderProvider;
    }

    public final void setTestBuilderProvider$dd_sdk_android_trace_release(com.datadog.android.trace.api.tracer.DatadogTracerBuilder datadogTracerBuilder) {
        testBuilderProvider = datadogTracerBuilder;
    }

    public final void setTracingSamplingPriorityIfNecessary(com.datadog.android.trace.api.span.DatadogSpanContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.datadog.android.trace.internal.DatadogSpanContextAdapter datadogSpanContextAdapter = context instanceof com.datadog.android.trace.internal.DatadogSpanContextAdapter ? (com.datadog.android.trace.internal.DatadogSpanContextAdapter) context : null;
        if (datadogSpanContextAdapter != null) {
            datadogSpanContextAdapter.setTracingSamplingPriorityIfNecessary$dd_sdk_android_trace_release();
        }
    }

    public final com.datadog.android.trace.api.tracer.DatadogTracerBuilder setTraceId128BitGenerationEnabled(com.datadog.android.trace.api.tracer.DatadogTracerBuilder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.datadog.android.trace.internal.DatadogTracerBuilderAdapter datadogTracerBuilderAdapter = builder instanceof com.datadog.android.trace.internal.DatadogTracerBuilderAdapter ? (com.datadog.android.trace.internal.DatadogTracerBuilderAdapter) builder : null;
        if (datadogTracerBuilderAdapter != null) {
            datadogTracerBuilderAdapter.setTraceId128BitGenerationEnabled$dd_sdk_android_trace_release(true);
        }
        return builder;
    }

    public final com.datadog.android.trace.api.tracer.DatadogTracerBuilder setSdkV2Compatible(com.datadog.android.trace.api.tracer.DatadogTracerBuilder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.datadog.android.trace.internal.DatadogTracerBuilderAdapter datadogTracerBuilderAdapter = builder instanceof com.datadog.android.trace.internal.DatadogTracerBuilderAdapter ? (com.datadog.android.trace.internal.DatadogTracerBuilderAdapter) builder : null;
        if (datadogTracerBuilderAdapter != null) {
            datadogTracerBuilderAdapter.setSdkV2Compatible$dd_sdk_android_trace_release();
        }
        return builder;
    }

    @kotlin.jvm.JvmStatic
    public static final void addThrowable(com.datadog.android.trace.api.span.DatadogSpan span, java.lang.Throwable throwable, byte errorPriority) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        com.datadog.android.trace.internal.DatadogSpanAdapter datadogSpanAdapter = span instanceof com.datadog.android.trace.internal.DatadogSpanAdapter ? (com.datadog.android.trace.internal.DatadogSpanAdapter) span : null;
        if (datadogSpanAdapter != null) {
            datadogSpanAdapter.addThrowable$dd_sdk_android_trace_release(throwable, errorPriority);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.trace.api.scope.DatadogScope activateSpan(com.datadog.android.trace.api.tracer.DatadogTracer tracer, com.datadog.android.trace.api.span.DatadogSpan span, boolean asyncPropagating) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
        com.datadog.android.trace.internal.DatadogTracerAdapter datadogTracerAdapter = tracer instanceof com.datadog.android.trace.internal.DatadogTracerAdapter ? (com.datadog.android.trace.internal.DatadogTracerAdapter) tracer : null;
        if (datadogTracerAdapter != null) {
            return datadogTracerAdapter.activateSpan$dd_sdk_android_trace_release(span, asyncPropagating);
        }
        return null;
    }

    public final java.lang.String mergeBaggage(java.lang.String oldHeader, java.lang.String newHeader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newHeader, "");
        java.lang.String obj = com.datadog.trace.core.propagation.Baggage.from(oldHeader).mergeWith(com.datadog.trace.core.propagation.Baggage.from(newHeader)).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final com.datadog.android.trace.internal.ApmNetworkInstrumentation createApmNetworkInstrumentation(java.lang.String name2, com.datadog.android.trace.ApmNetworkInstrumentationConfiguration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        return com.datadog.android.trace.ApmNetworkInstrumentationConfiguration.INSTANCE.createInstrumentation$dd_sdk_android_trace_release(configuration, name2);
    }
}

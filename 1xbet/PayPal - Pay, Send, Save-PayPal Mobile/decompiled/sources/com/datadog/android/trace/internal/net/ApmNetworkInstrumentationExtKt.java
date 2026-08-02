package com.datadog.android.trace.internal.net;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u000e\u001a\u00020\u0000*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0016\u001a\u00020\u0001*\u0004\u0018\u00010\u00158AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/trace/api/span/DatadogSpan;", "", "isSampled", "Lcom/datadog/android/core/sampling/Sampler;", "traceSampler", "", "applyPriority", "(Lcom/datadog/android/trace/api/span/DatadogSpan;ZLcom/datadog/android/core/sampling/Sampler;)V", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "request", "", "networkInstrumentationName", "traceOrigin", "buildSpan", "(Lcom/datadog/android/trace/api/tracer/DatadogTracer;Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/trace/api/span/DatadogSpan;", "canSendSpan", "finishRumAware", "(Lcom/datadog/android/trace/api/span/DatadogSpan;ZZ)V", "sample", "(Lcom/datadog/android/trace/api/span/DatadogSpan;Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;Lcom/datadog/android/core/sampling/Sampler;)Z", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "isRumEnabled", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)Z"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApmNetworkInstrumentationExtKt {
    public static final boolean isRumEnabled(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
        return (featureSdkCore != null ? featureSdkCore.getFeature("rum") : null) != null;
    }

    public static final void applyPriority(com.datadog.android.trace.api.span.DatadogSpan datadogSpan, boolean z, com.datadog.android.core.sampling.Sampler<com.datadog.android.trace.api.span.DatadogSpan> sampler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogSpan, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sampler, "");
        com.datadog.android.trace.api.span.DatadogSpanContext context = datadogSpan.context();
        if (context.setSamplingPriority(z ? 1 : 0)) {
            context.setMetric("_dd.agent_psr", (sampler.getSampleRate() != null ? r6.floatValue() : 0.0f) / 100.0d);
        }
    }

    public static final boolean sample(com.datadog.android.trace.api.span.DatadogSpan datadogSpan, com.datadog.android.api.instrumentation.network.HttpRequestInfo httpRequestInfo, com.datadog.android.core.sampling.Sampler<com.datadog.android.trace.api.span.DatadogSpan> sampler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogSpan, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sampler, "");
        java.lang.Integer samplingPriority = datadogSpan.getSamplingPriority();
        if (samplingPriority != null) {
            return samplingPriority.intValue() > 0;
        }
        java.lang.Boolean extractSamplingDecision = com.datadog.android.trace.internal.DatadogTracingToolkit.INSTANCE.getPropagationHelper().extractSamplingDecision(httpRequestInfo);
        return extractSamplingDecision != null ? extractSamplingDecision.booleanValue() : sampler.sample(datadogSpan);
    }

    public static final void finishRumAware(com.datadog.android.trace.api.span.DatadogSpan datadogSpan, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogSpan, "");
        if (z2 && z) {
            datadogSpan.finish();
        } else {
            datadogSpan.drop();
        }
    }

    public static final com.datadog.android.trace.api.span.DatadogSpan buildSpan(com.datadog.android.trace.api.tracer.DatadogTracer datadogTracer, com.datadog.android.api.instrumentation.network.HttpRequestInfo httpRequestInfo, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogTracer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.datadog.android.trace.api.span.DatadogSpanContext extractParentContext = com.datadog.android.trace.internal.DatadogTracingToolkit.INSTANCE.getPropagationHelper().extractParentContext(datadogTracer, httpRequestInfo);
        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.trace.internal.ApmNetworkInstrumentation.SPAN_NAME, java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        com.datadog.android.trace.api.span.DatadogSpan start = datadogTracer.buildSpan(format).withOrigin(str2).withParentContext(extractParentContext).start();
        start.setResourceName(kotlin.text.StringsKt.substringBefore$default(httpRequestInfo.getUrl(), '?', (java.lang.String) null, 2, (java.lang.Object) null));
        start.setTag("http.url", httpRequestInfo.getUrl());
        start.setTag("http.method", httpRequestInfo.getMethod());
        start.setTag("span.kind", "client");
        return start;
    }
}

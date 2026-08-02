package com.datadog.trace.api;

/* loaded from: classes3.dex */
public interface TraceConfig {
    java.util.Map<java.lang.String, java.lang.String> getBaggageMapping();

    java.util.Map<java.lang.String, java.lang.String> getRequestHeaderTags();

    java.util.Map<java.lang.String, java.lang.String> getResponseHeaderTags();

    java.util.Map<java.lang.String, java.lang.String> getServiceMapping();

    java.util.List<? extends com.datadog.trace.api.sampling.SamplingRule.SpanSamplingRule> getSpanSamplingRules();

    java.lang.Double getTraceSampleRate();

    java.util.List<? extends com.datadog.trace.api.sampling.SamplingRule.TraceSamplingRule> getTraceSamplingRules();

    boolean isDataStreamsEnabled();

    boolean isLogsInjectionEnabled();

    boolean isRuntimeMetricsEnabled();
}

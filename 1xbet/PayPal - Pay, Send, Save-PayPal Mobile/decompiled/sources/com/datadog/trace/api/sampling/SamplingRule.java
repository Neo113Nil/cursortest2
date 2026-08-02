package com.datadog.trace.api.sampling;

/* loaded from: classes3.dex */
public interface SamplingRule {
    public static final java.lang.String MATCH_ALL = "*";

    public interface SpanSamplingRule extends com.datadog.trace.api.sampling.SamplingRule {
        int getMaxPerSecond();
    }

    public interface TraceSamplingRule extends com.datadog.trace.api.sampling.SamplingRule {
    }

    java.lang.String getName();

    java.lang.String getResource();

    double getSampleRate();

    java.lang.String getService();

    java.util.Map<java.lang.String, java.lang.String> getTags();

    static java.lang.String normalizeGlob(java.lang.String str) {
        return (str == null || "*".equals(str)) ? "*" : str;
    }
}

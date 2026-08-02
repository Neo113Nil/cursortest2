package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public interface AgentSpanLink {
    public static final byte DEFAULT_FLAGS = 0;
    public static final byte SAMPLED_FLAG = 1;

    public interface Attributes {
        java.util.Map<java.lang.String, java.lang.String> asMap();

        boolean isEmpty();
    }

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink.Attributes attributes();

    long spanId();

    byte traceFlags();

    com.datadog.trace.api.DDTraceId traceId();

    java.lang.String traceState();
}

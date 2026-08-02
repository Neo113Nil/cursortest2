package com.datadog.trace.api.profiling;

/* loaded from: classes8.dex */
public interface ProfilingContext {
    default void clearContextValue(com.datadog.trace.api.profiling.ProfilingContextAttribute profilingContextAttribute) {
    }

    default void clearContextValue(java.lang.String str) {
    }

    default void setContextValue(com.datadog.trace.api.profiling.ProfilingContextAttribute profilingContextAttribute, java.lang.String str) {
    }

    default void setContextValue(java.lang.String str, java.lang.String str2) {
    }
}

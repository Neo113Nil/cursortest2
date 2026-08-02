package com.datadog.trace.api.profiling;

/* loaded from: classes3.dex */
public interface Profiling {

    /* loaded from: classes8.dex */
    public static final class NoOp implements com.datadog.trace.api.profiling.Profiling {
        public static final com.datadog.trace.api.profiling.Profiling.NoOp INSTANCE = new com.datadog.trace.api.profiling.Profiling.NoOp();
    }

    default com.datadog.trace.api.profiling.ProfilingScope newScope() {
        return com.datadog.trace.api.profiling.ProfilingScope.NO_OP;
    }

    default com.datadog.trace.api.profiling.ProfilingContextAttribute createContextAttribute(java.lang.String str) {
        return com.datadog.trace.api.profiling.ProfilingContextAttribute.NoOp.INSTANCE;
    }
}

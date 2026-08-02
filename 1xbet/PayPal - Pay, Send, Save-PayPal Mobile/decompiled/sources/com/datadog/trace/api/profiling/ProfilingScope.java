package com.datadog.trace.api.profiling;

/* loaded from: classes8.dex */
public interface ProfilingScope extends java.lang.AutoCloseable, com.datadog.trace.api.profiling.ProfilingContext {
    public static final com.datadog.trace.api.profiling.ProfilingScope NO_OP = new com.datadog.trace.api.profiling.ProfilingScope() { // from class: com.datadog.trace.api.profiling.ProfilingScope$$ExternalSyntheticLambda0
        @Override // com.datadog.trace.api.profiling.ProfilingScope, java.lang.AutoCloseable
        public final void close() {
            com.datadog.trace.api.profiling.ProfilingScope.lambda$static$0();
        }
    };

    static /* synthetic */ void lambda$static$0() {
    }

    @Override // java.lang.AutoCloseable
    void close();
}

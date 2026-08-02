package com.datadog.trace.api.profiling;

/* loaded from: classes8.dex */
public interface Timing extends java.lang.AutoCloseable {

    public static class NoOp implements com.datadog.trace.api.profiling.Timing, com.datadog.trace.api.profiling.QueueTiming {
        public static final com.datadog.trace.api.profiling.Timing INSTANCE = new com.datadog.trace.api.profiling.Timing.NoOp();

        @Override // com.datadog.trace.api.profiling.Timing, java.lang.AutoCloseable
        public void close() {
        }

        @Override // com.datadog.trace.api.profiling.QueueTiming
        public void setScheduler(java.lang.Class<?> cls) {
        }

        @Override // com.datadog.trace.api.profiling.QueueTiming
        public void setTask(java.lang.Object obj) {
        }
    }

    @Override // java.lang.AutoCloseable
    void close();
}

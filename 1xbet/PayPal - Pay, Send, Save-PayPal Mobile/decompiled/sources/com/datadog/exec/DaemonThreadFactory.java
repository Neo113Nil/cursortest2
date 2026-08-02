package com.datadog.exec;

/* loaded from: classes8.dex */
public final class DaemonThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    public static final com.datadog.exec.DaemonThreadFactory TRACE_PROCESSOR = new com.datadog.exec.DaemonThreadFactory("dd-trace-processor");
    public static final com.datadog.exec.DaemonThreadFactory TRACE_WRITER = new com.datadog.exec.DaemonThreadFactory("dd-trace-writer");
    public static final com.datadog.exec.DaemonThreadFactory TASK_SCHEDULER = new com.datadog.exec.DaemonThreadFactory("dd-task-scheduler");

    public DaemonThreadFactory(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, this.getHighResolutionOutputSizeshNQ4ISI);
        thread.setDaemon(true);
        thread.setContextClassLoader(null);
        return thread;
    }
}

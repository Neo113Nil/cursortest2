package com.datadog.trace.util;

/* loaded from: classes3.dex */
public final class AgentThreadFactory implements java.util.concurrent.ThreadFactory {
    public static final java.lang.ThreadGroup AGENT_THREAD_GROUP = new java.lang.ThreadGroup("dd-trace-java");
    public static final long THREAD_JOIN_TIMOUT_MS = 800;
    private final com.datadog.trace.util.AgentThreadFactory.AgentThread getHighSpeedVideoFpsRanges;

    public enum AgentThread {
        TASK_SCHEDULER("dd-task-scheduler"),
        TRACE_STARTUP("dd-agent-startup-datadog-tracer"),
        TRACE_MONITOR("dd-trace-monitor"),
        TRACE_PROCESSOR("dd-trace-processor"),
        SPAN_SAMPLING_PROCESSOR("dd-span-sampling-processor"),
        TRACE_CASSANDRA_ASYNC_SESSION("dd-cassandra-session-executor"),
        METRICS_AGGREGATOR("dd-metrics-aggregator"),
        STATSD_CLIENT("dd-statsd-client"),
        JMX_STARTUP("dd-agent-startup-jmxfetch"),
        JMX_COLLECTOR("dd-jmx-collector"),
        PROFILER_STARTUP("dd-agent-startup-datadog-profiler"),
        PROFILER_RECORDING_SCHEDULER("dd-profiler-recording-scheduler"),
        PROFILER_HTTP_DISPATCHER("dd-profiler-http-dispatcher"),
        APPSEC_HTTP_DISPATCHER("dd-appsec-http-dispatcher"),
        TELEMETRY("dd-telemetry"),
        FLEET_MANAGEMENT_POLLER("dd-fleet-management-poller"),
        REMOTE_CONFIG("dd-remote-config"),
        TRACER_FLARE("dd-tracer-flare"),
        CWS_TLS("dd-cws-tls"),
        PROCESS_SUPERVISOR("dd-process-supervisor"),
        DEBUGGER_HTTP_DISPATCHER("dd-debugger-upload-http-dispatcher");

        public final java.lang.String threadName;

        AgentThread(java.lang.String str) {
            this.threadName = str;
        }
    }

    public AgentThreadFactory(com.datadog.trace.util.AgentThreadFactory.AgentThread agentThread) {
        this.getHighSpeedVideoFpsRanges = agentThread;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return newAgentThread(this.getHighSpeedVideoFpsRanges, runnable);
    }

    public static java.lang.Thread newAgentThread(com.datadog.trace.util.AgentThreadFactory.AgentThread agentThread, java.lang.Runnable runnable) {
        return newAgentThread(agentThread, null, runnable, true);
    }

    public static java.lang.Thread newAgentThread(com.datadog.trace.util.AgentThreadFactory.AgentThread agentThread, java.lang.Runnable runnable, boolean z) {
        return newAgentThread(agentThread, null, runnable, z);
    }

    public static java.lang.Thread newAgentThread(final com.datadog.trace.util.AgentThreadFactory.AgentThread agentThread, java.lang.String str, final java.lang.Runnable runnable, boolean z) {
        java.lang.String str2;
        if (str != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(agentThread.threadName);
            sb.append(str);
            str2 = sb.toString();
        } else {
            str2 = agentThread.threadName;
        }
        java.lang.Thread thread = new java.lang.Thread(AGENT_THREAD_GROUP, runnable, str2);
        thread.setDaemon(z);
        thread.setContextClassLoader(null);
        thread.setUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: com.datadog.trace.util.AgentThreadFactory.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(java.lang.Thread thread2, java.lang.Throwable th) {
                com.datadog.trace.logger.LoggerFactory.getLogger(runnable.getClass()).error("Uncaught exception {} in {}", th, agentThread.threadName, th);
            }
        });
        return thread;
    }
}

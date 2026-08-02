package com.datadog.trace.api.profiling;

/* loaded from: classes8.dex */
public interface QueueTiming extends com.datadog.trace.api.profiling.Timing {
    void setScheduler(java.lang.Class<?> cls);

    void setTask(java.lang.Object obj);
}

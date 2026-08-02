package com.datadog.trace.api.profiling;

/* loaded from: classes8.dex */
public interface ProfilingSnapshot extends com.datadog.trace.api.profiling.ObservableType {

    public enum Kind {
        PERIODIC,
        ON_SHUTDOWN
    }
}

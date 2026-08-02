package com.datadog.trace.api.profiling;

/* loaded from: classes8.dex */
public abstract class RecordingData implements com.datadog.trace.api.profiling.ProfilingSnapshot {
    protected final java.time.Instant end;
    protected final com.datadog.trace.api.profiling.ProfilingSnapshot.Kind kind;
    protected final java.time.Instant start;

    public abstract java.lang.String getName();

    public abstract com.datadog.trace.api.profiling.RecordingInputStream getStream() throws java.io.IOException;

    public abstract void release();

    public RecordingData(java.time.Instant instant, java.time.Instant instant2, com.datadog.trace.api.profiling.ProfilingSnapshot.Kind kind) {
        this.start = instant;
        this.end = instant2;
        this.kind = kind;
    }

    public final java.time.Instant getStart() {
        return this.start;
    }

    public final java.time.Instant getEnd() {
        return this.end;
    }

    public final com.datadog.trace.api.profiling.ProfilingSnapshot.Kind getKind() {
        return this.kind;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("name=");
        sb.append(getName());
        sb.append(", kind=");
        sb.append(getKind());
        return sb.toString();
    }
}

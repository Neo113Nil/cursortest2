package com.datadog.trace.monitor;

/* loaded from: classes3.dex */
public class NoOpRecording extends com.datadog.trace.monitor.Recording {
    public static final com.datadog.trace.monitor.Recording NO_OP = new com.datadog.trace.monitor.NoOpRecording();

    @Override // com.datadog.trace.monitor.Recording
    public void flush() {
    }

    @Override // com.datadog.trace.monitor.Recording
    public void reset() {
    }

    @Override // com.datadog.trace.monitor.Recording
    public com.datadog.trace.monitor.Recording start() {
        return this;
    }

    @Override // com.datadog.trace.monitor.Recording
    public void stop() {
    }
}

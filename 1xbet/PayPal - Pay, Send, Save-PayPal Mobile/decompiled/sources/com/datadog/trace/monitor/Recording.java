package com.datadog.trace.monitor;

/* loaded from: classes3.dex */
public abstract class Recording implements java.lang.AutoCloseable {
    public abstract void flush();

    public abstract void reset();

    public abstract com.datadog.trace.monitor.Recording start();

    public abstract void stop();

    @Override // java.lang.AutoCloseable
    public void close() {
        stop();
    }
}

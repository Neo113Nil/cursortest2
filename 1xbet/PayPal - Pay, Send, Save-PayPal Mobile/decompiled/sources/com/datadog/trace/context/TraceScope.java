package com.datadog.trace.context;

/* loaded from: classes3.dex */
public interface TraceScope extends java.io.Closeable {

    /* loaded from: classes8.dex */
    public interface Continuation {
        com.datadog.trace.context.TraceScope activate();

        void cancel();
    }

    com.datadog.trace.context.TraceScope.Continuation capture();

    com.datadog.trace.context.TraceScope.Continuation captureConcurrent();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean isAsyncPropagating();

    void setAsyncPropagation(boolean z);
}

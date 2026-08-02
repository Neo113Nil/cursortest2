package com.datadog.trace.common.writer;

/* loaded from: classes3.dex */
public interface Writer extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean flush();

    void incrementDropCounts(int i);

    void start();

    void write(java.util.List<com.datadog.trace.core.DDSpan> list);
}

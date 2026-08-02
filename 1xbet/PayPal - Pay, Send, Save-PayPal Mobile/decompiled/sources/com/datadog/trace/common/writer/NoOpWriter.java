package com.datadog.trace.common.writer;

/* loaded from: classes3.dex */
public class NoOpWriter implements com.datadog.trace.common.writer.Writer {
    @Override // com.datadog.trace.common.writer.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.datadog.trace.common.writer.Writer
    public boolean flush() {
        return true;
    }

    @Override // com.datadog.trace.common.writer.Writer
    public void incrementDropCounts(int i) {
    }

    @Override // com.datadog.trace.common.writer.Writer
    public void start() {
    }

    @Override // com.datadog.trace.common.writer.Writer
    public void write(java.util.List<com.datadog.trace.core.DDSpan> list) {
    }
}

package com.datadog.trace.api;

/* loaded from: classes3.dex */
final class NoOpStatsDClient implements com.datadog.trace.api.StatsDClient {
    @Override // com.datadog.trace.api.StatsDClient, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.datadog.trace.api.StatsDClient
    public final void count(java.lang.String str, long j, java.lang.String... strArr) {
    }

    @Override // com.datadog.trace.api.StatsDClient
    public final void distribution(java.lang.String str, double d, java.lang.String... strArr) {
    }

    @Override // com.datadog.trace.api.StatsDClient
    public final void distribution(java.lang.String str, long j, java.lang.String... strArr) {
    }

    @Override // com.datadog.trace.api.StatsDClient
    public final void error(java.lang.Exception exc) {
    }

    @Override // com.datadog.trace.api.StatsDClient
    public final void gauge(java.lang.String str, double d, java.lang.String... strArr) {
    }

    @Override // com.datadog.trace.api.StatsDClient
    public final void gauge(java.lang.String str, long j, java.lang.String... strArr) {
    }

    @Override // com.datadog.trace.api.StatsDClient
    public final int getErrorCount() {
        return 0;
    }

    @Override // com.datadog.trace.api.StatsDClient
    public final void histogram(java.lang.String str, double d, java.lang.String... strArr) {
    }

    @Override // com.datadog.trace.api.StatsDClient
    public final void histogram(java.lang.String str, long j, java.lang.String... strArr) {
    }

    @Override // com.datadog.trace.api.StatsDClient
    public final void incrementCounter(java.lang.String str, java.lang.String... strArr) {
    }

    @Override // com.datadog.trace.api.StatsDClient
    public final void serviceCheck(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String... strArr) {
    }

    NoOpStatsDClient() {
    }
}

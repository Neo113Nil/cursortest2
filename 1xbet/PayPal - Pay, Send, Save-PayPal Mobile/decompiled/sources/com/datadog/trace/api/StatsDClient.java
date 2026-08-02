package com.datadog.trace.api;

/* loaded from: classes3.dex */
public interface StatsDClient extends java.io.Closeable {
    public static final com.datadog.trace.api.StatsDClient NO_OP = new com.datadog.trace.api.NoOpStatsDClient();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void count(java.lang.String str, long j, java.lang.String... strArr);

    void distribution(java.lang.String str, double d, java.lang.String... strArr);

    void distribution(java.lang.String str, long j, java.lang.String... strArr);

    void error(java.lang.Exception exc);

    void gauge(java.lang.String str, double d, java.lang.String... strArr);

    void gauge(java.lang.String str, long j, java.lang.String... strArr);

    int getErrorCount();

    void histogram(java.lang.String str, double d, java.lang.String... strArr);

    void histogram(java.lang.String str, long j, java.lang.String... strArr);

    void incrementCounter(java.lang.String str, java.lang.String... strArr);

    void serviceCheck(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String... strArr);
}

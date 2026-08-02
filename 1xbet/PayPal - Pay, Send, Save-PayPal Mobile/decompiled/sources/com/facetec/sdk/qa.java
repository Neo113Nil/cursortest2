package com.facetec.sdk;

/* loaded from: classes8.dex */
public interface qa extends java.io.Closeable, java.io.Flushable {
    void c(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws java.io.IOException;

    com.facetec.sdk.qe d();

    void flush() throws java.io.IOException;
}

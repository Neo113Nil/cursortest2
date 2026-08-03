package com.inmobi.media;

/* loaded from: classes5.dex */
public final class K5 implements java.io.Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.InputStream[] f4794a;

    public K5(java.io.InputStream[] inputStreamArr) {
        this.f4794a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (java.io.InputStream inputStream : this.f4794a) {
            com.inmobi.media.AbstractC2758sl.a(inputStream);
        }
    }
}

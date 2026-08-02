package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ly implements java.io.Closeable, java.io.Flushable {

    /* renamed from: a, reason: collision with root package name */
    public static int f3635a;
    public static int e;
    private com.facetec.sdk.np b;
    final com.facetec.sdk.no d;

    @Override // java.io.Flushable
    public final void flush() throws java.io.IOException {
        this.b.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.b.close();
    }

    public static int d() {
        int i = e;
        e = i + 1;
        if (i % 9617497 != 0) {
            return f3635a;
        }
        int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
        f3635a = uptimeMillis;
        return uptimeMillis;
    }
}

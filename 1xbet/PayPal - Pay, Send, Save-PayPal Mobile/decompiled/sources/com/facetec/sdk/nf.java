package com.facetec.sdk;

/* loaded from: classes8.dex */
public abstract class nf implements java.io.Closeable {
    public abstract com.facetec.sdk.pr b();

    public abstract long d();

    @javax.annotation.Nullable
    public abstract com.facetec.sdk.mr e();

    public final java.lang.String a() throws java.io.IOException {
        com.facetec.sdk.pr b = b();
        try {
            com.facetec.sdk.mr e = e();
            return b.d(com.facetec.sdk.nh.d(b, e != null ? e.b(com.facetec.sdk.nh.f3678a) : com.facetec.sdk.nh.f3678a));
        } finally {
            com.facetec.sdk.nh.c(b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.facetec.sdk.nh.c(b());
    }
}

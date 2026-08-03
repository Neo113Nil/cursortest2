package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class Cq {
    public static final java.util.concurrent.atomic.AtomicLong A07 = new java.util.concurrent.atomic.AtomicLong();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final android.net.Uri A04;
    public final com.facebook.ads.redexgen.core.C04565i A05;
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Cq(long j, com.facebook.ads.redexgen.core.C04565i c04565i, long j2) {
        this(j, c04565i, r4, java.util.Collections.emptyMap(), j2, 0L, 0L);
        android.net.Uri uri;
        if (c04565i != null) {
            uri = c04565i.A06;
        } else {
            uri = null;
        }
    }

    public Cq(long j, com.facebook.ads.redexgen.core.C04565i c04565i, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaders, long j2, long j3, long j4) {
        this.A03 = j;
        this.A05 = c04565i;
        this.A04 = uri;
        this.A06 = responseHeaders;
        this.A01 = j2;
        this.A02 = j3;
        this.A00 = j4;
    }

    public static long A00() {
        return A07.getAndIncrement();
    }
}

package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0598Bk {
    public final com.facebook.ads.redexgen.core.C6 A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest A07;

    public C0598Bk(com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3) {
        this(downloadRequest, i, j, j2, j3, i2, i3, new com.facebook.ads.redexgen.core.C6());
    }

    public C0598Bk(com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3, com.facebook.ads.redexgen.core.C6 c6) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(c6);
        com.facebook.ads.redexgen.core.AbstractC04203y.A07((i3 == 0) == (i != 4));
        if (i2 != 0) {
            com.facebook.ads.redexgen.core.AbstractC04203y.A07((i == 2 || i == 0) ? false : true);
        }
        this.A07 = downloadRequest;
        this.A02 = i;
        this.A05 = j;
        this.A06 = j2;
        this.A04 = j3;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = c6;
    }

    public final float A00() {
        return this.A00.A00;
    }

    public final long A01() {
        return this.A00.A01;
    }

    public final boolean A02() {
        return this.A02 == 3 || this.A02 == 4;
    }
}

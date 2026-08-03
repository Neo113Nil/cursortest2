package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.9m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05569m extends com.facebook.ads.androidx.media3.common.Timeline {
    public static byte[] A0D;
    public static final com.facebook.ads.redexgen.core.C2185q7 A0E;
    public static final java.lang.Object A0F;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final com.facebook.ads.redexgen.core.C2188qA A07;
    public final com.facebook.ads.redexgen.core.C2185q7 A08;
    public final java.lang.Object A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A0D = new byte[]{-79, -57, -52, -59, -54, -61, -82, -61, -48, -57, -51, -62, -78, -57, -53, -61, -54, -57, -52, -61};
    }

    static {
        A01();
        A0F = new java.lang.Object();
        A0E = new com.facebook.ads.redexgen.core.C03922u().A03(A00(0, 20, 44)).A00(android.net.Uri.EMPTY).A05();
    }

    public C05569m(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, java.lang.Object obj, com.facebook.ads.redexgen.core.C2185q7 c2185q7, com.facebook.ads.redexgen.core.C2188qA c2188qA) {
        this.A02 = j;
        this.A06 = j2;
        this.A00 = j3;
        this.A01 = j4;
        this.A04 = j5;
        this.A05 = j6;
        this.A03 = j7;
        this.A0B = z;
        this.A0A = z2;
        this.A0C = z3;
        this.A09 = obj;
        this.A08 = (com.facebook.ads.redexgen.core.C2185q7) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c2185q7);
        this.A07 = c2188qA;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C05569m(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, java.lang.Object obj, com.facebook.ads.redexgen.core.C2185q7 c2185q7) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, c2185q7, r0);
        com.facebook.ads.redexgen.core.C2188qA c2188qA;
        if (z3) {
            c2188qA = c2185q7.A02;
        } else {
            c2188qA = null;
        }
    }

    public C05569m(long j, boolean z, boolean z2, boolean z3, java.lang.Object obj, com.facebook.ads.redexgen.core.C2185q7 c2185q7) {
        this(j, j, 0L, 0L, z, z2, z3, obj, c2185q7);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0A(java.lang.Object obj) {
        return A0F.equals(obj) ? 0 : -1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final com.facebook.ads.redexgen.core.C2163pl A0I(int i, com.facebook.ads.redexgen.core.C2163pl c2163pl, boolean z) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A00(i, 0, 1);
        return c2163pl.A0F(null, z ? A0F : null, 0, this.A01, -this.A05);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final com.facebook.ads.redexgen.core.C2161pj A0L(int i, com.facebook.ads.redexgen.core.C2161pj c2161pj, long j) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A00(i, 0, 1);
        long j2 = this.A03;
        if (this.A0A && !this.A0C && j != 0) {
            if (this.A04 == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            } else {
                j2 += j;
                if (j2 > this.A04) {
                    j2 = -9223372036854775807L;
                }
            }
        }
        return c2161pj.A07(com.facebook.ads.redexgen.core.C2161pj.A0K, this.A08, this.A09, this.A02, this.A06, -9223372036854775807L, this.A0B, this.A0A, null, j2, this.A04, 0, 0, this.A05);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final java.lang.Object A0M(int i) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A00(i, 0, 1);
        return A0F;
    }
}

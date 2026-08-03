package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8V, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8V implements com.facebook.ads.redexgen.core.InterfaceC1960mF {
    public static byte[] A04;
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.C8V A00(long j, long j2, com.facebook.ads.redexgen.core.HN hn, com.facebook.ads.redexgen.core.C04434v c04434v) {
        int A0I;
        long j3 = j2;
        c04434v.A0g(10);
        int A0C = c04434v.A0C();
        if (A0C <= 0) {
            return null;
        }
        int i = hn.A03;
        long A0U = com.facebook.ads.redexgen.core.C5C.A0U(A0C, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int A0M = c04434v.A0M();
        int A0M2 = c04434v.A0M();
        int A0M3 = c04434v.A0M();
        c04434v.A0g(2);
        long j4 = j3 + hn.A02;
        long[] jArr = new long[A0M];
        long[] jArr2 = new long[A0M];
        for (int i2 = 0; i2 < A0M; i2++) {
            jArr[i2] = (i2 * A0U) / A0M;
            jArr2[i2] = java.lang.Math.max(j3, j4);
            switch (A0M3) {
                case 1:
                    A0I = c04434v.A0I();
                    break;
                case 2:
                    A0I = c04434v.A0M();
                    break;
                case 3:
                    A0I = c04434v.A0K();
                    break;
                case 4:
                    A0I = c04434v.A0L();
                    break;
                default:
                    return null;
            }
            j3 += A0I * A0M2;
        }
        if (j != -1 && j != j3) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A01(27, 10, 89), A01(2, 25, 50) + j + A01(0, 2, 80) + j3);
        }
        return new com.facebook.ads.redexgen.core.C8V(jArr, jArr2, A0U, j3);
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 43);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-89, -101, -77, -97, -81, -90, 125, -63, -66, -47, -66, 125, -48, -58, -41, -62, 125, -54, -58, -48, -54, -66, -47, -64, -59, -105, 125, -38, -26, -10, -19, -41, -23, -23, -17, -23, -10};
    }

    public C8V(long[] jArr, long[] jArr2, long j, long j2) {
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1960mF
    public final long A7j() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final com.facebook.ads.redexgen.core.HX A91(long j) {
        int A0L = com.facebook.ads.redexgen.core.C5C.A0L(this.A03, j, true, true);
        com.facebook.ads.redexgen.core.HZ hz = new com.facebook.ads.redexgen.core.HZ(this.A03[A0L], this.A02[A0L]);
        if (hz.A01 < j) {
            int tableIndex = this.A03.length;
            if (A0L != tableIndex - 1) {
                int tableIndex2 = A0L + 1;
                long j2 = this.A03[tableIndex2];
                int tableIndex3 = A0L + 1;
                com.facebook.ads.redexgen.core.HZ nextSeekPoint = new com.facebook.ads.redexgen.core.HZ(j2, this.A02[tableIndex3]);
                return new com.facebook.ads.redexgen.core.HX(hz, nextSeekPoint);
            }
        }
        return new com.facebook.ads.redexgen.core.HX(hz);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1960mF
    public final long A9H(long j) {
        return this.A03[com.facebook.ads.redexgen.core.C5C.A0L(this.A02, j, true, true)];
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return true;
    }
}

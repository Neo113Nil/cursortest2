package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class H2 {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"uP2VmRjmPrkQ", "gRGWgf4lLYF9Rif8PQPDNbGokb9BUMtV", "bSjOyzwe8Lqn79dPeHIi8kfJVgfNJaEZ", "7R1XMZQjg8S2TiXm1wE8kLqT1leJFKD3", "sD", "qKJRf3b", "Q40N8hoONMcQBFaHNU", "iAP6W7CwppN1UlUQVXHbR"};
    public com.facebook.ads.redexgen.core.C0736Gw A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.C1994n0 A02;
    public final com.facebook.ads.redexgen.core.H1 A03;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 35);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 45, 47, kotlin.io.encoding.Base64.padSymbol, 43};
    }

    static {
        A03();
    }

    public H2(com.facebook.ads.redexgen.core.InterfaceC0737Gx interfaceC0737Gx, com.facebook.ads.redexgen.core.H1 h1, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.A03 = h1;
        this.A01 = i;
        this.A02 = new com.facebook.ads.redexgen.core.C1994n0(interfaceC0737Gx, j, j2, j3, j4, j5, j6);
    }

    private final int A00(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, long j, com.facebook.ads.redexgen.core.HV hv) {
        if (j != interfaceC1987ms.A8n()) {
            hv.A00 = j;
            return 1;
        }
        if (A05[5].length() != 7) {
            throw new java.lang.RuntimeException();
        }
        A05[4] = "eb0wJDSKJb6zWnRAqReB9UTGfXv";
        return 0;
    }

    private final com.facebook.ads.redexgen.core.C0736Gw A01(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long A052 = this.A02.A05(j);
        j2 = this.A02.A05;
        j3 = this.A02.A02;
        j4 = this.A02.A04;
        j5 = this.A02.A01;
        j6 = this.A02.A00;
        return new com.facebook.ads.redexgen.core.C0736Gw(j, A052, j2, j3, j4, j5, j6);
    }

    private final void A04(boolean z, long j) {
        this.A00 = null;
        this.A03.AFs();
    }

    private final boolean A05(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, long j) throws java.io.IOException {
        long A8n = j - interfaceC1987ms.A8n();
        if (A8n >= 0 && A8n <= android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            interfaceC1987ms.AK3((int) A8n);
            return true;
        }
        return false;
    }

    public final int A06(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        long A01;
        long A00;
        long A02;
        long A042;
        int i;
        long j;
        long j2;
        long j3;
        long floorPosition;
        long j4;
        long j5;
        long j6;
        while (true) {
            com.facebook.ads.redexgen.core.C0736Gw c0736Gw = (com.facebook.ads.redexgen.core.C0736Gw) com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A00);
            A01 = c0736Gw.A01();
            A00 = c0736Gw.A00();
            A02 = c0736Gw.A02();
            if (A00 - A01 <= this.A01) {
                A04(false, A01);
                java.lang.String[] strArr = A05;
                if (strArr[3].charAt(1) != strArr[1].charAt(1)) {
                    throw new java.lang.RuntimeException();
                }
                A05[5] = "cjf3Phs";
                return A00(interfaceC1987ms, A01, hv);
            }
            if (!A05(interfaceC1987ms, A02)) {
                return A00(interfaceC1987ms, A02, hv);
            }
            interfaceC1987ms.AIl();
            com.facebook.ads.redexgen.core.H1 h1 = this.A03;
            A042 = c0736Gw.A04();
            com.facebook.ads.redexgen.core.C0739Gz AIw = h1.AIw(interfaceC1987ms, A042);
            i = AIw.A00;
            switch (i) {
                case -3:
                    A04(false, A02);
                    return A00(interfaceC1987ms, A02, hv);
                case -2:
                    j5 = AIw.A02;
                    j6 = AIw.A01;
                    c0736Gw.A0D(j5, j6);
                    break;
                case -1:
                    j = AIw.A02;
                    j2 = AIw.A01;
                    c0736Gw.A0C(j, j2);
                    break;
                case 0:
                    j3 = AIw.A01;
                    A05(interfaceC1987ms, j3);
                    floorPosition = AIw.A01;
                    A04(true, floorPosition);
                    j4 = AIw.A01;
                    return A00(interfaceC1987ms, j4, hv);
                default:
                    throw new java.lang.IllegalStateException(A02(0, 12, 109));
            }
        }
    }

    public final com.facebook.ads.redexgen.core.C1994n0 A07() {
        return this.A02;
    }

    public final void A08(long j) {
        long A03;
        if (this.A00 != null) {
            A03 = this.A00.A03();
            if (A03 == j) {
                return;
            }
        }
        this.A00 = A01(j);
    }

    public final boolean A09() {
        return this.A00 != null;
    }
}

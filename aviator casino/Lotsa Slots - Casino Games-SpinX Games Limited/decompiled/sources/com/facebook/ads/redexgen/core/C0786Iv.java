package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Iv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0786Iv {
    public static byte[] A09;
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final com.facebook.ads.redexgen.core.C04434v A06;
    public final com.facebook.ads.redexgen.core.C04434v A07;
    public final boolean A08;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-42, -39, -30, -29, -28, -49, -45, -40, -27, -34, -37, -112, -35, -27, -29, -28, -112, -46, -43, -112, -95};
    }

    public C0786Iv(com.facebook.ads.redexgen.core.C04434v c04434v, com.facebook.ads.redexgen.core.C04434v c04434v2, boolean z) throws com.facebook.ads.redexgen.core.C3K {
        this.A07 = c04434v;
        this.A06 = c04434v2;
        this.A08 = z;
        c04434v2.A0f(12);
        this.A05 = c04434v2.A0L();
        c04434v.A0f(12);
        this.A04 = c04434v.A0L();
        com.facebook.ads.redexgen.core.HB.A01(c04434v.A0C() == 1, A00(0, 21, 34));
        this.A00 = -1;
    }

    public final boolean A02() {
        long A0Q;
        int i;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == this.A05) {
            return false;
        }
        if (this.A08) {
            A0Q = this.A06.A0R();
        } else {
            A0Q = this.A06.A0Q();
        }
        this.A02 = A0Q;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0L();
            this.A07.A0g(4);
            int i3 = this.A04 - 1;
            this.A04 = i3;
            if (i3 > 0) {
                i = this.A07.A0L() - 1;
            } else {
                i = -1;
            }
            this.A03 = i;
        }
        return true;
    }
}

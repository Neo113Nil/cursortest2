package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Sv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1040Sv {
    public static byte[] A09;
    public com.facebook.ads.redexgen.core.T3 A01;
    public final int A04;
    public final int A05;
    public final java.lang.String A06;
    public final java.lang.String A07;
    public final java.lang.String A08;
    public float A00 = -1.0f;
    public java.lang.String A02 = A00(0, 4, 75);
    public boolean A03 = false;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{7, 10, -4, -1};
    }

    public C1040Sv(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3) {
        this.A08 = str;
        this.A04 = i;
        this.A05 = i2;
        this.A07 = str2;
        this.A06 = str3;
    }
}

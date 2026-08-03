package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0674El {
    public static byte[] A03;
    public final int A00;
    public final com.facebook.ads.redexgen.core.C2159pg A01;
    public final int[] A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 82);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, 4, 3, -12, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, 36, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, 3, 43, 46, 50, 55, -34, 50, 48, com.google.common.base.Ascii.US, 33, 41, 49, -34, com.google.common.base.Ascii.US, 48, 35, -34, 44, 45, 50, -34, com.google.common.base.Ascii.US, 42, 42, 45, 53, 35, 34};
    }

    public C0674El(com.facebook.ads.redexgen.core.C2159pg c2159pg, int... iArr) {
        this(c2159pg, iArr, 0);
    }

    public C0674El(com.facebook.ads.redexgen.core.C2159pg c2159pg, int[] iArr, int i) {
        if (iArr.length == 0) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A08(A00(0, 13, 94), A00(13, 28, 108), new java.lang.IllegalArgumentException());
        }
        this.A01 = c2159pg;
        this.A02 = iArr;
        this.A00 = i;
    }
}

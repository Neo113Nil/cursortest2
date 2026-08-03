package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05468y extends java.lang.Exception {
    public static byte[] A03;
    public final int A00;
    public final com.facebook.ads.redexgen.core.C2196qI A01;
    public final boolean A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-26, com.google.common.base.Ascii.SUB, 9, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC4, -7, com.google.common.base.Ascii.ETB, 6, 8, com.google.common.base.Ascii.DLE, -59, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, 10, -59, com.google.common.base.Ascii.VT, 6, com.google.common.base.Ascii.SO, 17, 10, 9, -33, -59};
    }

    public C05468y(int i, com.facebook.ads.redexgen.core.C2196qI c2196qI, boolean z) {
        super(A00(0, 25, 91) + i);
        this.A02 = z;
        this.A00 = i;
        this.A01 = c2196qI;
    }
}

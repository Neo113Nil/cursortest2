package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class BX extends java.lang.Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, 19, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, 82, 6, com.google.common.base.Ascii.GS, 82, 3, 7, com.google.common.base.Ascii.ETB, 0, com.google.common.base.Ascii.VT, 82, 7, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, 0, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.NAK, 82, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ESC, 19, 82, 17, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, 17, 1};
    }

    public BX(java.lang.Throwable th) {
        super(A00(0, 39, 35), th);
    }
}

package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AL extends com.facebook.ads.redexgen.core.C2122p5 {
    public static byte[] A01;
    public final java.lang.String A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-11, com.google.common.base.Ascii.SUB, 34, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DLE, -52, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, 32, 17, com.google.common.base.Ascii.SUB, 32, -52, 32, 37, com.google.common.base.Ascii.FS, 17, -26, -52};
    }

    public AL(java.lang.String str, com.facebook.ads.redexgen.core.C04565i c04565i) {
        super(A01(0, 22, 85) + str, c04565i, 2003, 1);
        this.A00 = str;
    }
}

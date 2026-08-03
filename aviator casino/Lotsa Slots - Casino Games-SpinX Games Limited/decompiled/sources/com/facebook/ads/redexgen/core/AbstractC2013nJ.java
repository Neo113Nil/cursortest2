package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.nJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2013nJ {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{96, 35, 33, 46, 46, 47, 52, 96, 34, 37, 96, 46, 37, 39, 33, 52, 41, 54, 37, 96, 34, 53, 52, 96, 55, 33, 51, 122, 96, 43, 120, 99, 122, 122, 0, 1, 78, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SI, 2, 2, com.google.common.base.Ascii.GS, 78, com.google.common.base.Ascii.SUB, 1, 78, 0, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SUB, 70, 71, 78, com.google.common.base.Ascii.GS, 7, 0, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT, 78, com.google.common.base.Ascii.SUB, 6, com.google.common.base.Ascii.VT, 78, 2, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, 78, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SI, 2, 2, 78, com.google.common.base.Ascii.SUB, 1, 78, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.VT, 3, 1, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.VT, 70, 71, 10, 17, 8, 8, 68, com.google.common.base.Ascii.SI, 1, com.google.common.base.Ascii.GS, 68, com.google.common.base.Ascii.CR, 10, 68, 1, 10, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.GS, 94, 68, 10, 17, 8, 8, 89, com.google.common.base.Ascii.US, 4, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.GS, 81, 7, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.GS, 4, com.google.common.base.Ascii.DC4, 81, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.US, 81, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.US, 5, 3, 8, 75, 81};
    }

    public static int A00(int value, java.lang.String name) {
        if (value >= 0) {
            return value;
        }
        throw new java.lang.IllegalArgumentException(name + A01(0, 29, 23) + value);
    }

    public static void A03(java.lang.Object key, java.lang.Object value) {
        if (key != null) {
            if (value != null) {
                return;
            } else {
                throw new java.lang.NullPointerException(A01(108, 21, 38) + key + A01(29, 5, 65));
            }
        }
        throw new java.lang.NullPointerException(A01(84, 24, 51) + value);
    }

    public static void A04(boolean canRemove) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A0F(canRemove, A01(34, 50, 57));
    }
}

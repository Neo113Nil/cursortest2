package com.facebook.ads.redexgen.core;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\b\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"", "", "<init>", "toString", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.qq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2223qq {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"e7AwhByPjRPUw6TPvHQ97hdZd1", "BA53CFSFXKNaueAmPJEc9hkRINMpWiHX", "eg", "BOBLIBOzzfVObnmt242WmA3oiPmYKJxA", "5X54btT7YSWi6fK", "vwsHu7ibsWkpW0OsiHz", "pfFn7t8nBopYri9", "k"};
    public static final com.facebook.ads.redexgen.core.C2223qq A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            java.lang.String[] strArr = A01;
            if (strArr[3].charAt(0) != strArr[1].charAt(0)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[4] = "yY0Pcbq111zueav";
            strArr2[6] = "lktBBxSgK8ahxIm";
            copyOfRange[i4] = (byte) (i5 ^ 81);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.US, 4, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, 94, 37, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, 4};
    }

    static {
        A01();
        A02 = new com.facebook.ads.redexgen.core.C2223qq();
    }

    public final java.lang.String toString() {
        return A00(0, 11, 33);
    }
}

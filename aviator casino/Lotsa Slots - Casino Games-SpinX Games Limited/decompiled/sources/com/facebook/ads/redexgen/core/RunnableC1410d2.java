package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.d2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1410d2 implements java.lang.Runnable {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"cNFcWbBTlC21yVLFwbr", "9GV2E8F9E2oE8CHXfnhYKiZsDK3egbEW", "QOwDSeu1r9UmOYKCJ4q7pu", "wLxLWw50lPgC4sAeZiCwv7pW84ixD2Ig", "u8mrTBG1NeFkrttZ2j0LSs7yOPehuw8f", "R35JTbeYnLlLSORxODVCOg1", "dSDMu8RDcGvfG7f91Jn", "vgGOrZScmi2DEwHan2nQobkknD6iF2"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04605m A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{121, 70, 75, 74, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, Byte.MAX_VALUE, 67, 78, 86, 77, 78, 76, 68, 106, 93, 93, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 93};
    }

    static {
        A01();
    }

    public RunnableC1410d2(com.facebook.ads.redexgen.core.C04605m c04605m) {
        this.A00 = c04605m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0I(A00(0, 18, 33));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            if (A02[3].charAt(14) != 'A') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[2] = "BiobfU8eOeDJTRwO1wDdFp";
            strArr[5] = "4fmLJ7Dm7W0RRBNKueLwAfq";
        }
    }
}

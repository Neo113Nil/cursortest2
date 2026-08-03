package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Oh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0927Oh {
    public static com.facebook.ads.redexgen.core.C0926Og A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"g", "j", "XC0Rp", "xmnbF", "ZVN1dtOIFAKzm8JTATZerxuQP9zv55g", "kSPLn3WG70", "", ""};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            java.lang.String[] strArr = A02;
            if (strArr[6].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[1] = "w";
            strArr2[0] = "P";
            copyOfRange[i4] = (byte) (i5 ^ 92);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, 90, 88, com.google.common.base.Ascii.ESC, 83, 84, 86, 80, 87, 90, 90, 94, com.google.common.base.Ascii.ESC, 84, 81, 70, com.google.common.base.Ascii.ESC, 116, 113, 106, 103, 112, 101, 122, 103, 97, 124, 123, 114, 106, 118, 122, 123, 115, 124, 114};
    }

    static {
        A02();
    }

    public static com.facebook.ads.redexgen.core.C0926Og A00(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (A00 == null) {
            synchronized (com.facebook.ads.redexgen.core.C0926Og.class) {
                if (A00 == null) {
                    A00 = new com.facebook.ads.redexgen.core.C0926Og(new com.facebook.ads.redexgen.core.C1724iB(c1632ge.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A01(0, 36, 105), c1632ge), 0)));
                }
            }
        }
        return A00;
    }
}

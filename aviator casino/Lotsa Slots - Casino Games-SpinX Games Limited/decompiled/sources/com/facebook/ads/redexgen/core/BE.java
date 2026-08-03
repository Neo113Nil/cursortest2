package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class BE<V> implements com.facebook.ads.redexgen.core.InterfaceC1877ku<java.util.List<V>>, java.io.Serializable {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"e5wnLSIbQxkq8Zb8jKmA", "K5DmaQySCrjWvleFa", "LWuY7vQYlXU7vsjuD", "M7ok9ovwGeM", "5nYOTBMz755", "tdWE3UbGCkl2", "in1BIrIvXgLkxgASW", "Nc3XS6cKk9DYxfmxbznhVqbsdMI4LYY"};
    public final int A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            if (A02[0].length() != 20) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[3] = "LeP2zF5PzD6";
            strArr[4] = "FkYvCPAL8bA";
            copyOfRange[i4] = (byte) (i5 - 73);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {10, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, 10, 8, com.google.common.base.Ascii.EM, 10, 9, -5, 6, 17, com.google.common.base.Ascii.SUB, 10, com.google.common.base.Ascii.CAN, -11, 10, com.google.common.base.Ascii.ETB, -16, 10, com.google.common.base.Ascii.RS};
        java.lang.String[] strArr = A02;
        if (strArr[2].length() != strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[3] = "U6hTL0roTrM";
        strArr2[4] = "z8jhm3qQIoz";
        A01 = bArr;
    }

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.MultimapBuilder$ArrayListSupplier<V> */
    public BE(int expectedValuesPerKey) {
        this.A00 = com.facebook.ads.redexgen.core.AbstractC2013nJ.A00(expectedValuesPerKey, A00(0, 20, 92));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.MultimapBuilder$ArrayListSupplier<V> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1877ku
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final java.util.List<V> get() {
        return new java.util.ArrayList(this.A00);
    }
}

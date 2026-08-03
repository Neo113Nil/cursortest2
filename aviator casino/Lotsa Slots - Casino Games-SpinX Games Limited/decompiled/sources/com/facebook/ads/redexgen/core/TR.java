package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class TR {
    public static byte[] A03;
    public final java.lang.String A00;
    public final java.lang.String A01;
    public final java.util.Map<java.lang.String, java.lang.String> A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{8, 101, 2, 0, com.google.common.base.Ascii.DC4, 6, 9, com.google.common.base.Ascii.NAK, 62, 4, com.google.common.base.Ascii.EM, 2, 4, 17, com.google.common.base.Ascii.NAK, 8, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, 5, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT};
    }

    public TR(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> mStaticEnvironmentData) {
        this(str, mStaticEnvironmentData, false);
    }

    public TR(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
        this.A01 = str;
        this.A02 = map;
        this.A00 = z ? A00(1, 1, 37) : A00(0, 1, 73);
    }

    public final java.util.Map<java.lang.String, java.lang.String> A02() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(A00(18, 10, 31), this.A01);
        hashMap.put(A00(2, 16, 16), this.A00);
        java.util.Map<java.lang.String, java.lang.String> data = this.A02;
        hashMap.putAll(data);
        return hashMap;
    }
}

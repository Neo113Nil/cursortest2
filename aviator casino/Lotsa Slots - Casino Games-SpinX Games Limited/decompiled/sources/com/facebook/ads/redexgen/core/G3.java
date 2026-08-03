package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class G3 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"C9RGb7NCXIcFkq487TbtOiV6wJyl5V", "dIw4BKlzmuU3zMuMzRjmW2qgnJuCAgWy", "9uTfiPT", "rJUClzDzuXOVG7xlKmzeqZnP5Peloa5p", "Z", "9S6veErjLDkLbxAihnisBS", "TmmUyGbb1uzRJUdaHSZi2e0nreAYvBIE", "B53ji15DIU9T3sUrLFCN0rmnX0Pwja5D"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 94;
            if (A01[0].length() != 30) {
                throw new java.lang.RuntimeException();
            }
            A01[0] = "TD1mTFY2qo3QaoZPZEPw0mbH2R8uHE";
            copyOfRange[i4] = (byte) i5;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {com.google.common.base.Ascii.DC4, 51, 59, 62, 55, 54, 114, 38, kotlin.io.encoding.Base64.padSymbol, 114, 49, 51, 62, 62, 114, 1, 39, 32, 52, 51, 49, 55, 124, 33, 55, 38, com.google.common.base.Ascii.DC4, 32, 51, 63, 55, 0, 51, 38, 55, 77, 114, Byte.MAX_VALUE, 126, 116, 93, 105, 122, 118, 126, 73, 126, 119, 126, 122, 104, 126, 83, 126, 119, 107, 126, 105};
        if (A01[2].length() != 7) {
            throw new java.lang.RuntimeException();
        }
        A01[5] = "Lq9CeCJTygMtbBn2m02oyI";
        A00 = bArr;
    }

    static {
        A01();
    }

    public static void A02(android.view.Surface surface, float f) {
        int compatibility;
        if (f == 0.0f) {
            compatibility = 0;
        } else {
            compatibility = 1;
        }
        try {
            surface.setFrameRate(f, compatibility);
        } catch (java.lang.IllegalStateException e) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A08(A00(35, 23, 69), A00(0, 35, 12), e);
        }
    }
}

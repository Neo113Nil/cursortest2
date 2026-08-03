package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1156Xm {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 67);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-33, -41, -37, -38, -41, -39};
    }

    public static android.os.Bundle A00(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.facebook.ads.redexgen.core.AbstractC0920Oa.A01, A01(0, 6, 102));
        bundle.putString(com.facebook.ads.redexgen.core.AbstractC0920Oa.A00, str);
        return bundle;
    }
}

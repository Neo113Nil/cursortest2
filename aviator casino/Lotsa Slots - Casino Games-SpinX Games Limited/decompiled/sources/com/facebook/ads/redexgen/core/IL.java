package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class IL extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"mPUp", "QaVG6HdjpkfaxAZj0g", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "awRGdU6dgRZhiPVlhe", "rFOzx0t9VnUrXKVKNhKeQ4JnbF82l9OW", "Jupus4hVDLzI", "SNB8L6kKTybUpjfk2kEtWCUyw", "zmy1APRNrfa5"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5S A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 26);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -4, -9, -8, 2, -77, 10, -12, 6, -77, 1, -8, 9, -8, 5, -77, 3, 5, -8, 3, -12, 5, -8, -9};
    }

    static {
        A01();
    }

    public IL(com.facebook.ads.redexgen.core.C5S c5s) {
        this.A00 = c5s;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        boolean z;
        z = this.A00.A0C;
        if (!z) {
            com.facebook.ads.redexgen.core.C5S c5s = this.A00;
            java.lang.String[] strArr = A02;
            if (strArr[2].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[3] = "r7zn";
            c5s.A0S(A00(0, 24, 121));
        }
    }
}

package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2171pt implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"aC8uc30vckBh0ldJ8CsDkWWGmQgl7sOm", "2", "dPCbCdxH5PRV4edn", "QHj", "dDf", "KHWYQA", "nwDl9CeJStZlhkBKgBcw2akg3aHE6X2p", "I5"};
    public static final java.lang.String A02;
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.AbstractC2171pt> A03;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 9);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-126, -101, -104, -101, -100, -92, -101, 77, Byte.MAX_VALUE, -114, -95, -106, -101, -108, -127, -90, -99, -110, 103, 77};
    }

    static {
        A07();
        A02 = com.facebook.ads.redexgen.core.C5C.A0h(0);
        A03 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pu
            @Override // com.facebook.ads.redexgen.core.AnonymousClass23
            public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
                com.facebook.ads.redexgen.core.AbstractC2171pt A04;
                A04 = com.facebook.ads.redexgen.core.AbstractC2171pt.A04(bundle);
                return A04;
            }
        };
    }

    public static com.facebook.ads.redexgen.core.AbstractC2171pt A04(android.os.Bundle bundle) {
        int i = bundle.getInt(A02, -1);
        switch (i) {
            case 0:
                return com.facebook.ads.redexgen.core.AX.A02.A6f(bundle);
            case 1:
                com.facebook.ads.redexgen.core.AV A6f = com.facebook.ads.redexgen.core.AV.A02.A6f(bundle);
                if (A01[6].charAt(2) != 'F') {
                    java.lang.String[] strArr = A01;
                    strArr[7] = "RK";
                    strArr[1] = "0";
                    return A6f;
                }
                break;
            case 2:
                return com.facebook.ads.redexgen.core.AU.A04.A6f(bundle);
            case 3:
                com.facebook.ads.redexgen.core.AT A6f2 = com.facebook.ads.redexgen.core.AT.A02.A6f(bundle);
                if (A01[6].charAt(2) != 'F') {
                    java.lang.String[] strArr2 = A01;
                    strArr2[7] = "Vr";
                    strArr2[1] = "2";
                    return A6f2;
                }
                break;
            default:
                throw new java.lang.IllegalArgumentException(A06(0, 20, 36) + i);
        }
        throw new java.lang.RuntimeException();
    }
}

package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AU extends com.facebook.ads.redexgen.core.AbstractC2171pt {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"Ze0y2PQb31vngbi38k5mfZCC", "5", "jLmR5cr6Hwks3p4PsKfIxGU921nipvRD", "Pp3qhBBlWU8bouyoK5QiOWA", "ww40dK", "331B", "UQZ2ltoBgBcCSgXWY09raSZ", "C"};
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.AU> A04;
    public static final java.lang.String A05;
    public static final java.lang.String A06;
    public final float A00;
    public final int A01;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A03;
            if (strArr[5].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            A03[4] = "26ayShss4mhG1SZ6mAOlhU0";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
            i4++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-108, -120, -97, 122, -101, -120, -103, -102, 71, -108, -100, -102, -101, 71, -119, -116, 71, -120, 71, -105, -106, -102, -112, -101, -112, -99, -116, 71, -112, -107, -101, -116, -114, -116, -103, -68, -67, -86, -69, -101, -86, -67, -78, -73, -80, 105, -78, -68, 105, -72, -66, -67, 105, -72, -81, 105, -69, -86, -73, -80, -82, 105, -92, 121, 117, 105, -74, -86, -63, -100, -67, -86, -69, -68, -90};
    }

    static {
        A03();
        A05 = com.facebook.ads.redexgen.core.C5C.A0h(1);
        A06 = com.facebook.ads.redexgen.core.C5C.A0h(2);
        A04 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.ps
            @Override // com.facebook.ads.redexgen.core.AnonymousClass23
            public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
                com.facebook.ads.redexgen.core.AU A00;
                A00 = com.facebook.ads.redexgen.core.AU.A00(bundle);
                return A00;
            }
        };
    }

    public AU(int i) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A09(i > 0, A02(0, 35, 26));
        this.A01 = i;
        this.A00 = -1.0f;
    }

    public AU(int i, float f) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A09(i > 0, A02(0, 35, 26));
        com.facebook.ads.redexgen.core.AbstractC04203y.A09(f >= 0.0f && f <= ((float) i), A02(35, 40, 60));
        this.A01 = i;
        this.A00 = f;
    }

    public static com.facebook.ads.redexgen.core.AU A00(android.os.Bundle bundle) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(bundle.getInt(com.facebook.ads.redexgen.core.AbstractC2171pt.A02, -1) == 2);
        int i = bundle.getInt(A05, 5);
        float starRating = bundle.getFloat(A06, -1.0f);
        if (starRating == -1.0f) {
            return new com.facebook.ads.redexgen.core.AU(i);
        }
        return new com.facebook.ads.redexgen.core.AU(i, starRating);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.facebook.ads.redexgen.core.AU)) {
            return false;
        }
        com.facebook.ads.redexgen.core.AU au = (com.facebook.ads.redexgen.core.AU) obj;
        return this.A01 == au.A01 && this.A00 == au.A00;
    }

    public final int hashCode() {
        return com.facebook.ads.redexgen.core.CB.A00(java.lang.Integer.valueOf(this.A01), java.lang.Float.valueOf(this.A00));
    }
}

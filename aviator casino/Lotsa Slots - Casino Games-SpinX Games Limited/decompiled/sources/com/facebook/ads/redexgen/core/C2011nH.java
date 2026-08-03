package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2011nH implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;
    public static java.lang.String[] A04 = {"0EeRaofkOnG82pPuB", "jcjJv", "T4n", "y6LXg9kPowsRJwalOEx6K", "cypgHvauDeb", "sGCac32Lryl6ta5A9qPel0ZSNDpSTc", "mAWrtqCYM7sM8yItQ0fM", "xdW2EE8FfL1ekapcbmlM6yOkR5Ux1S1"};
    public static final java.lang.String A06 = com.facebook.ads.redexgen.core.C5C.A0h(0);
    public static final java.lang.String A07 = com.facebook.ads.redexgen.core.C5C.A0h(1);
    public static final java.lang.String A08 = com.facebook.ads.redexgen.core.C5C.A0h(2);
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2011nH> A05 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.nI
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            return com.facebook.ads.redexgen.core.C2011nH.A00(bundle);
        }
    };

    public C2011nH(int i, int[] iArr, int i2) {
        this.A00 = i;
        this.A03 = java.util.Arrays.copyOf(iArr, iArr.length);
        this.A01 = iArr.length;
        this.A02 = i2;
        java.util.Arrays.sort(this.A03);
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.C2011nH A00(android.os.Bundle bundle) {
        int i = bundle.getInt(A06, -1);
        int[] tracks = bundle.getIntArray(A07);
        int trackType = bundle.getInt(A08, -1);
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(i >= 0 && trackType >= 0);
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(tracks);
        return new com.facebook.ads.redexgen.core.C2011nH(i, tracks, trackType);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        java.lang.String[] strArr = A04;
        if (strArr[5].length() == strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        A04[6] = "RoyHwRFBbL3TyB1YuYs";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C2011nH c2011nH = (com.facebook.ads.redexgen.core.C2011nH) obj;
        if (this.A00 == c2011nH.A00 && java.util.Arrays.equals(this.A03, c2011nH.A03) && this.A02 == c2011nH.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.A00 * 31) + java.util.Arrays.hashCode(this.A03)) * 31;
        int hash = this.A02;
        return hashCode + hash;
    }
}

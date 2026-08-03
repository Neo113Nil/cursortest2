package com.facebook.ads.redexgen.core;

@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* renamed from: com.facebook.ads.redexgen.X.mE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1959mE extends com.facebook.ads.redexgen.core.AbstractC0785Iu {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"GA2pmS7X4ROGOgByNCdi18taC", "aAh4RNygY6pz4IdlAQ9iIXEvCFWWkzLF", "JuodTrkofMpjka010", "J1Lmlws0eqmUUC5GC3jhEdxTYojxk4jf", "6Ya7uqSvo", "3XyRCMiSsp8rG7f8J4q6xkUhsqnZzFaE", "VspF2Q", "vTSdivoAe22KROlTGGoK4NP8GmV"};
    public final long A00;
    public final java.util.List<com.facebook.ads.redexgen.core.C1959mE> A01;
    public final java.util.List<com.facebook.ads.redexgen.core.C1958mD> A02;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 84);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{68, 7, com.google.common.base.Ascii.VT, 10, com.google.common.base.Ascii.DLE, 5, com.google.common.base.Ascii.CR, 10, 1, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, 94, 68, 105, 37, 44, 40, 63, 44, 58, 115, 105};
    }

    static {
        A05();
    }

    public C1959mE(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new java.util.ArrayList();
        this.A01 = new java.util.ArrayList();
    }

    public final com.facebook.ads.redexgen.core.C1959mE A06(int i) {
        int size = this.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.facebook.ads.redexgen.core.C1959mE c1959mE = this.A01.get(i2);
            int i3 = A04[7].length();
            if (i3 == 3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A04;
            strArr[1] = "n49CDGF4gSULbNzRfDOXSmTNWTogkE10";
            strArr[3] = "P3Agw1JJwclCkyu9DcuVtuUqOjxfkaYK";
            com.facebook.ads.redexgen.core.C1959mE c1959mE2 = c1959mE;
            int childrenSize = ((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1959mE2).A00;
            if (childrenSize == i) {
                return c1959mE2;
            }
        }
        if (A04[4].length() == 14) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[1] = "eWhxbLiQvYVwUHrDqb1spRuVxj0ikF7I";
        strArr2[3] = "G0JrlMiW26lgTwAQcPtVzhOkcvjPkvCh";
        return null;
    }

    public final com.facebook.ads.redexgen.core.C1958mD A07(int i) {
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.facebook.ads.redexgen.core.C1958mD c1958mD = this.A02.get(i2);
            java.lang.String[] strArr = A04;
            java.lang.String str = strArr[2];
            java.lang.String str2 = strArr[0];
            int i3 = str.length();
            int childrenSize = str2.length();
            if (i3 == childrenSize) {
                throw new java.lang.RuntimeException();
            }
            A04[5] = "r5cbbIuLaeCnR7fWkiITKmUfsEKVcSuB";
            int childrenSize2 = ((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1958mD).A00;
            if (childrenSize2 == i) {
                return c1958mD;
            }
        }
        return null;
    }

    public final void A08(com.facebook.ads.redexgen.core.C1959mE c1959mE) {
        this.A01.add(c1959mE);
    }

    public final void A09(com.facebook.ads.redexgen.core.C1958mD c1958mD) {
        this.A02.add(c1958mD);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0785Iu
    public final java.lang.String toString() {
        return com.facebook.ads.redexgen.core.AbstractC0785Iu.A02(super.A00) + A04(13, 9, 29) + java.util.Arrays.toString(this.A02.toArray()) + A04(0, 13, 48) + java.util.Arrays.toString(this.A01.toArray());
    }
}

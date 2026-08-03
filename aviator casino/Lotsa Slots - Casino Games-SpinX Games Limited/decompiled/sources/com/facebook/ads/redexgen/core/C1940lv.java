package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1940lv extends com.facebook.ads.redexgen.core.AbstractC0792Jb {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"llfHvvp5w7AsdcfCf5e", "amqCmPcUyTwYr5NdTloeCtiw", "0NAIhycYLxj75", "dj34azdkZPKXRKaV6TbpL4Sg", "ijcAEj6S85lKiCQyoflHjypUMqTEGqRn", "eY0hdp8", "jqGnWXF3Z8AkxtecEpgwxV1mUEmkJWKs", "4zwbE0EN4gXO5y3Vp0p"};
    public static final byte[] A03;
    public static final byte[] A04;
    public boolean A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 125);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-1, 19, 2, 7, com.google.common.base.Ascii.CR, -51, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SO, 19, 17};
    }

    static {
        A01();
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
        A03 = new byte[]{79, 112, 117, 115, 84, 97, 103, 115};
    }

    public static boolean A02(com.facebook.ads.redexgen.core.C04434v c04434v) {
        return A03(c04434v, A04);
    }

    public static boolean A03(com.facebook.ads.redexgen.core.C04434v c04434v, byte[] bArr) {
        if (c04434v.A07() < bArr.length) {
            return false;
        }
        int A09 = c04434v.A09();
        int startPosition = bArr.length;
        byte[] header = new byte[startPosition];
        int startPosition2 = bArr.length;
        c04434v.A0k(header, 0, startPosition2);
        c04434v.A0f(A09);
        return java.util.Arrays.equals(header, bArr);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0792Jb
    public final long A09(com.facebook.ads.redexgen.core.C04434v c04434v) {
        return A06(com.facebook.ads.redexgen.core.HT.A05(c04434v.A0l()));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0792Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0792Jb
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public final boolean A0C(com.facebook.ads.redexgen.core.C04434v c04434v, long j, com.facebook.ads.redexgen.core.C0791Ja c0791Ja) throws com.facebook.ads.redexgen.core.C3K {
        if (A03(c04434v, A04)) {
            byte[] headerBytes = java.util.Arrays.copyOf(c04434v.A0l(), c04434v.A0A());
            int A012 = com.facebook.ads.redexgen.core.HT.A01(headerBytes);
            java.util.List<byte[]> A06 = com.facebook.ads.redexgen.core.HT.A06(headerBytes);
            if (c0791Ja.A00 != null) {
                return true;
            }
            c0791Ja.A00 = new com.facebook.ads.redexgen.core.C03872p().A11(A00(0, 10, 33)).A0b(A012).A0m(48000).A12(A06).A14();
            return true;
        }
        if (A03(c04434v, A03)) {
            com.facebook.ads.redexgen.core.AbstractC04203y.A02(c0791Ja.A00);
            if (this.A00) {
                return true;
            }
            this.A00 = true;
            c04434v.A0g(A03.length);
            com.facebook.ads.redexgen.core.C0747Hh commentHeader = com.facebook.ads.redexgen.core.AbstractC0750Hk.A05(c04434v, false, false);
            com.facebook.ads.androidx.media3.common.Metadata A022 = com.facebook.ads.redexgen.core.AbstractC0750Hk.A02(com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A02(commentHeader.A02));
            if (A022 == null) {
                return true;
            }
            com.facebook.ads.redexgen.core.C03872p A07 = c0791Ja.A00.A07();
            java.lang.String[] strArr = A02;
            if (strArr[3].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[3] = "80vtnZ0VGuLh5BtNytGnkcmL";
            strArr2[1] = "kfnMkjsOg47yHVBMKsSTRfGb";
            c0791Ja.A00 = A07.A0v(A022.A04(c0791Ja.A00.A0P)).A14();
            return true;
        }
        com.facebook.ads.redexgen.core.AbstractC04203y.A02(c0791Ja.A00);
        return false;
    }
}

package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class HJ {
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"Hy9erbcn1CD2Cs5ZlmG25MdtXf", "HOFQhwFeFgK1hjIc7qCVfLVKe4hb2KPj", "rEWyESjnSr6bXcR3qBgtsTRMI2K9qdSB", "BvL17bJBTlRgAjITBDDuBrnomI", "AZrfJovBkJndynqGcgKN1LZzk8fHrrw4", "fdLmSfOckTno1kV1pYqKvwBW8a156Tx5", "emxoz2tvvjMM3L", "p0b9qfAXEvDLZmNF0KID"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final com.facebook.ads.redexgen.core.HI A0A;
    public final com.facebook.ads.androidx.media3.common.Metadata A0B;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 61);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{com.google.common.base.Ascii.VT, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SO, 3, 5, 69, com.google.common.base.Ascii.FF, 6, com.google.common.base.Ascii.VT, 9};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final com.facebook.ads.redexgen.core.HJ A0A(java.util.List<com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame> list) {
        return new com.facebook.ads.redexgen.core.HJ(this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09, this.A0A, A02(new com.facebook.ads.androidx.media3.common.Metadata(list)));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final com.facebook.ads.redexgen.core.HJ A0B(java.util.List<java.lang.String> list) {
        return new com.facebook.ads.redexgen.core.HJ(this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09, this.A0A, A02(com.facebook.ads.redexgen.core.AbstractC0750Hk.A02(list)));
    }

    static {
        A04();
    }

    public HJ(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, com.facebook.ads.redexgen.core.HI hi, com.facebook.ads.androidx.media3.common.Metadata metadata) {
        this.A05 = i;
        this.A03 = i2;
        this.A06 = i3;
        this.A04 = i4;
        this.A07 = i5;
        this.A08 = A01(i5);
        this.A02 = i6;
        this.A00 = i7;
        this.A01 = A00(i7);
        this.A09 = j;
        this.A0A = hi;
        this.A0B = metadata;
    }

    public HJ(byte[] bArr, int i) {
        com.facebook.ads.redexgen.core.C04424u c04424u = new com.facebook.ads.redexgen.core.C04424u(bArr);
        c04424u.A08(i * 8);
        this.A05 = c04424u.A04(16);
        this.A03 = c04424u.A04(16);
        this.A06 = c04424u.A04(24);
        this.A04 = c04424u.A04(24);
        this.A07 = c04424u.A04(20);
        this.A08 = A01(this.A07);
        this.A02 = c04424u.A04(3) + 1;
        this.A00 = c04424u.A04(5) + 1;
        this.A01 = A00(this.A00);
        this.A09 = c04424u.A05(36);
        this.A0A = null;
        this.A0B = null;
    }

    public static int A00(int i) {
        switch (i) {
            case 8:
                if (A0D[6].length() != 28) {
                    java.lang.String[] strArr = A0D;
                    strArr[5] = "V04NPWFEbILAkvleA9Xxz0FwJQ4eDV3p";
                    strArr[4] = "3QJh7HKROfuZmn4fVSBdYwrM5PNWxwSf";
                    return 1;
                }
                java.lang.String[] strArr2 = A0D;
                strArr2[3] = "IuGfV3sFLU7aLzdayuZ51nmzsb";
                strArr2[0] = "kvaRWCMq8GtPZOTZqMfFBSkWA2";
                return 1;
            case 12:
                return 2;
            case 16:
                return 4;
            case 20:
                if (A0D[7].length() != 20) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr3 = A0D;
                strArr3[3] = "GVm7TyTvdgGXuIF1m2KSKJr8Vg";
                strArr3[0] = "pCX2CyoVa54AgSUVxisn2xa5Aw";
                return 5;
            case 24:
                return 6;
            default:
                return -1;
        }
    }

    public static int A01(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private final com.facebook.ads.androidx.media3.common.Metadata A02(com.facebook.ads.androidx.media3.common.Metadata metadata) {
        return this.A0B == null ? metadata : this.A0B.A04(metadata);
    }

    public final long A05() {
        long j;
        if (this.A04 > 0) {
            return ((this.A04 + this.A06) / 2) + 1;
        }
        if (this.A05 == this.A03 && this.A05 > 0) {
            j = this.A05;
        } else {
            j = android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        long j2 = this.A02 * j;
        long blockSizeSamples = this.A00;
        return ((j2 * blockSizeSamples) / 8) + 64;
    }

    public final long A06() {
        if (this.A09 == 0) {
            return -9223372036854775807L;
        }
        return (this.A09 * 1000000) / this.A07;
    }

    public final long A07(long j) {
        long sampleNumber = com.facebook.ads.redexgen.core.C5C.A0T((this.A07 * j) / 1000000, 0L, this.A09 - 1);
        return sampleNumber;
    }

    public final com.facebook.ads.redexgen.core.C2196qI A08(byte[] bArr, com.facebook.ads.androidx.media3.common.Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.A04 > 0 ? this.A04 : -1;
        com.facebook.ads.androidx.media3.common.Metadata A02 = A02(metadata);
        com.facebook.ads.redexgen.core.C03872p A0h = new com.facebook.ads.redexgen.core.C03872p().A11(A03(0, 10, 87)).A0h(i);
        int maxInputSize = this.A02;
        com.facebook.ads.redexgen.core.C03872p A0b = A0h.A0b(maxInputSize);
        int maxInputSize2 = this.A07;
        return A0b.A0m(maxInputSize2).A12(java.util.Collections.singletonList(bArr)).A0v(A02).A14();
    }

    public final com.facebook.ads.redexgen.core.HJ A09(com.facebook.ads.redexgen.core.HI hi) {
        return new com.facebook.ads.redexgen.core.HJ(this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09, hi, this.A0B);
    }
}

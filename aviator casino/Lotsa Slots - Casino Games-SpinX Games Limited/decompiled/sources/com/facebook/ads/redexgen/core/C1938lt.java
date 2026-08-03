package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1938lt extends com.facebook.ads.redexgen.core.AbstractC0792Jb {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE, "OXoEHzgO5FTzqO33f", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT};
    public int A00;
    public com.facebook.ads.redexgen.core.C0747Hh A01;
    public com.facebook.ads.redexgen.core.C0749Hj A02;
    public com.facebook.ads.redexgen.core.C0793Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final com.facebook.ads.redexgen.core.C0793Jc A02(com.facebook.ads.redexgen.core.C04434v c04434v) throws java.io.IOException {
        if (this.A02 == null) {
            this.A02 = com.facebook.ads.redexgen.core.AbstractC0750Hk.A06(c04434v);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = com.facebook.ads.redexgen.core.AbstractC0750Hk.A04(c04434v);
            return null;
        }
        com.facebook.ads.redexgen.core.C0749Hj c0749Hj = this.A02;
        com.facebook.ads.redexgen.core.C0747Hh c0747Hh = this.A01;
        byte[] bArr = new byte[c04434v.A0A()];
        java.lang.System.arraycopy(c04434v.A0l(), 0, bArr, 0, c04434v.A0A());
        return new com.facebook.ads.redexgen.core.C0793Jc(c0749Hj, c0747Hh, bArr, com.facebook.ads.redexgen.core.AbstractC0750Hk.A0D(c04434v, c0749Hj.A05), com.facebook.ads.redexgen.core.AbstractC0750Hk.A00(r6.length - 1));
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-108, -88, -105, -100, -94, 98, -87, -94, -91, -107, -100, -90};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b, com.facebook.ads.redexgen.core.C0793Jc c0793Jc) {
        if (!c0793Jc.A04[A00(b, c0793Jc.A00, 1)].A03) {
            int modeNumber = c0793Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c0793Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(com.facebook.ads.redexgen.core.C04434v c04434v, long j) {
        if (c04434v.A08() < c04434v.A0A() + 4) {
            c04434v.A0i(java.util.Arrays.copyOf(c04434v.A0l(), c04434v.A0A() + 4));
        } else {
            c04434v.A0e(c04434v.A0A() + 4);
        }
        byte[] A0l = c04434v.A0l();
        A0l[c04434v.A0A() - 4] = (byte) (j & 255);
        A0l[c04434v.A0A() - 3] = (byte) ((j >>> 8) & 255);
        A0l[c04434v.A0A() - 2] = (byte) ((j >>> 16) & 255);
        A0l[c04434v.A0A() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(com.facebook.ads.redexgen.core.C04434v c04434v) {
        try {
            return com.facebook.ads.redexgen.core.AbstractC0750Hk.A0C(1, c04434v, true);
        } catch (com.facebook.ads.redexgen.core.C3K unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0792Jb
    public final long A09(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int i = 0;
        if ((c04434v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b = c04434v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b, (com.facebook.ads.redexgen.core.C0793Jc) com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c04434v, i);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0792Jb
    public final void A0A(long j) {
        super.A0A(j);
        this.A04 = j != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0792Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0792Jb
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(com.facebook.ads.redexgen.core.C04434v c04434v, long j, com.facebook.ads.redexgen.core.C0791Ja c0791Ja) throws java.io.IOException {
        if (this.A03 != null) {
            com.facebook.ads.redexgen.core.AbstractC04203y.A01(c0791Ja.A00);
            return false;
        }
        this.A03 = A02(c04434v);
        if (this.A03 == null) {
            return true;
        }
        com.facebook.ads.redexgen.core.C0793Jc c0793Jc = this.A03;
        com.facebook.ads.redexgen.core.C0749Hj c0749Hj = c0793Jc.A02;
        java.util.ArrayList<byte[]> codecInitializationData = new java.util.ArrayList<>();
        codecInitializationData.add(c0749Hj.A09);
        codecInitializationData.add(c0793Jc.A03);
        c0791Ja.A00 = new com.facebook.ads.redexgen.core.C03872p().A11(A03(0, 12, 22)).A0a(c0749Hj.A02).A0j(c0749Hj.A00).A0b(c0749Hj.A05).A0m(c0749Hj.A06).A12(codecInitializationData).A0v(com.facebook.ads.redexgen.core.AbstractC0750Hk.A02(com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A02(c0793Jc.A01.A02))).A14();
        return true;
    }
}

package com.facebook.ads.redexgen.core;

@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
/* renamed from: com.facebook.ads.redexgen.X.5f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04535f {
    public static byte[] A0A;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public android.net.Uri A05;
    public com.facebook.ads.redexgen.core.ML A06;
    public java.lang.String A07;
    public java.util.Map<java.lang.String, java.lang.String> A08;
    public byte[] A09;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-35, -15, -18, -87, -2, -5, -14, -87, -10, -2, -4, -3, -87, -21, -18, -87, -4, -18, -3, -73};
    }

    public C04535f() {
        this.A01 = 1;
        this.A08 = java.util.Collections.emptyMap();
        this.A02 = -1L;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public C04535f(com.facebook.ads.redexgen.core.C04565i c04565i) {
        this.A05 = c04565i.A06;
        this.A04 = c04565i.A05;
        this.A01 = c04565i.A01;
        this.A09 = c04565i.A0A;
        this.A08 = c04565i.A09;
        this.A03 = c04565i.A04;
        this.A02 = c04565i.A03;
        this.A07 = c04565i.A08;
        this.A00 = c04565i.A00;
        this.A06 = c04565i.A07;
    }

    public final com.facebook.ads.redexgen.core.C04535f A02(int i) {
        this.A00 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04535f A03(long j) {
        this.A02 = j;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04535f A04(long j) {
        this.A03 = j;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04535f A05(long j) {
        this.A04 = j;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04535f A06(android.net.Uri uri) {
        this.A05 = uri;
        return this;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public final com.facebook.ads.redexgen.core.C04535f A07(com.facebook.ads.redexgen.core.ML ml) {
        this.A06 = ml;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04535f A08(java.lang.String str) {
        this.A07 = str;
        return this;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D50990955; Ensure that fbDataSpecExtension is not null")
    public final com.facebook.ads.redexgen.core.C04565i A09() {
        com.facebook.ads.redexgen.core.ML ml;
        com.facebook.ads.redexgen.core.AbstractC04203y.A03(this.A05, A00(0, 20, 122));
        android.net.Uri uri = this.A05;
        long j = this.A04;
        int i = this.A01;
        byte[] bArr = this.A09;
        java.util.Map<java.lang.String, java.lang.String> map = this.A08;
        long j2 = this.A03;
        long j3 = this.A02;
        java.lang.String str = this.A07;
        int i2 = this.A00;
        if (this.A06 != null) {
            ml = this.A06;
        } else {
            ml = new com.facebook.ads.redexgen.core.ML();
        }
        return new com.facebook.ads.redexgen.core.C04565i(uri, j, i, bArr, map, j2, j3, str, i2, ml);
    }
}

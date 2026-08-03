package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.n7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2001n7 {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"unLJAGqnT9K2C6pR52hzklfZHwTRg6Yr", "LeSEUls9Myr0akOYyr4ALINYOEymKOkL", "W8GYPv6JCblyMHrg4mb8qhrlE9HlP5p8", "LeDDfwbzgRXTDhaT1cwFWvWAB6ITTWPz", "taf7WKL89SeyG6P6BerDozU5lBYArJ2v", "", "BSTJObkWS6NqTAYjIRk7bCGrxc9Lgut2", "ohz3nwuOVveogY5495fLWWA936p3Bkwf"};
    public static final com.facebook.ads.redexgen.core.FJ A05;
    public static final com.facebook.ads.redexgen.core.FJ A06;
    public static final com.facebook.ads.redexgen.core.FJ A07;
    public static final com.facebook.ads.redexgen.core.FJ A08;
    public com.facebook.ads.redexgen.core.FK<? extends com.facebook.ads.redexgen.core.FL> A00;
    public java.io.IOException A01;
    public final com.facebook.ads.redexgen.core.InterfaceExecutorC0690Fb A02;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A03 = new byte[]{62, 3, com.google.common.base.Ascii.DC4, 43, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, 2, com.google.common.base.Ascii.RS, 9, 65, 55, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, 9, 65};
    }

    static {
        A07();
        A07 = A01(false, -9223372036854775807L);
        A08 = A01(true, -9223372036854775807L);
        A05 = new com.facebook.ads.redexgen.core.FJ(2, -9223372036854775807L);
        A06 = new com.facebook.ads.redexgen.core.FJ(3, -9223372036854775807L);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"MERGED"})
    public C2001n7(com.facebook.ads.redexgen.core.InterfaceExecutorC0690Fb interfaceExecutorC0690Fb) {
        this.A02 = interfaceExecutorC0690Fb;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"MERGED"})
    public C2001n7(java.lang.String str) {
        this(com.facebook.ads.redexgen.core.AbstractC0689Fa.A00(com.facebook.ads.redexgen.core.C5C.A0u(A06(0, 17, 64) + str), new com.facebook.ads.redexgen.core.AnonymousClass49() { // from class: com.facebook.ads.redexgen.X.n8
            @Override // com.facebook.ads.redexgen.core.AnonymousClass49
            public final void A39(java.lang.Object obj) {
                ((java.util.concurrent.ExecutorService) obj).shutdown();
            }
        }));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FI != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.FL> */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D14742363 Needed to accept supplied looper for Exo2DashLiveManifestFetcher manifest loading")
    private final <T extends com.facebook.ads.redexgen.core.FL> long A00(android.os.Looper looper, T t, com.facebook.ads.redexgen.core.FI<T> fi, int i) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(looper != null);
        this.A01 = null;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        new com.facebook.ads.redexgen.core.FK(this, looper, t, fi, i, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public static com.facebook.ads.redexgen.core.FJ A01(boolean z, long j) {
        return new com.facebook.ads.redexgen.core.FJ(z ? 1 : 0, j);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FI != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.FL> */
    public final <T extends com.facebook.ads.redexgen.core.FL> long A08(T t, com.facebook.ads.redexgen.core.FI<T> fi, int i) {
        android.os.Looper looper = (android.os.Looper) com.facebook.ads.redexgen.core.AbstractC04203y.A02(android.os.Looper.myLooper());
        return A00(looper, t, fi, i);
    }

    public final void A09() {
        ((com.facebook.ads.redexgen.core.FK) com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A00)).A07(false);
    }

    public final void A0A() {
        this.A01 = null;
    }

    public final void A0B(int i) throws java.io.IOException {
        if (this.A01 == null) {
            if (this.A00 != null) {
                com.facebook.ads.redexgen.core.FK<? extends com.facebook.ads.redexgen.core.FL> fk = this.A00;
                if (i == Integer.MIN_VALUE) {
                    com.facebook.ads.redexgen.core.FK<? extends com.facebook.ads.redexgen.core.FL> fk2 = this.A00;
                    java.lang.String[] strArr = A04;
                    if (strArr[6].charAt(7) == strArr[1].charAt(7)) {
                        throw new java.lang.RuntimeException();
                    }
                    A04[2] = "wo2YdO45DQEJfRTdGKzxAcazBLTDj4mX";
                    i = fk2.A06;
                }
                fk.A05(i);
                return;
            }
            return;
        }
        throw this.A01;
    }

    public final void A0C(com.facebook.ads.redexgen.core.FM fm) {
        if (this.A00 != null) {
            com.facebook.ads.redexgen.core.FK<? extends com.facebook.ads.redexgen.core.FL> fk = this.A00;
            java.lang.String[] strArr = A04;
            if (strArr[5].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[4] = "XVuhTdSnDMDRP6HltjyP328n9S8al0u6";
            strArr2[0] = "1piWh3nqPhJ4K6qVEs9qRP5dHkNT6n7u";
            fk.A07(true);
        }
        if (fm != null) {
            this.A02.execute(new com.facebook.ads.redexgen.core.FN(fm));
        }
        this.A02.AHb();
    }

    public final boolean A0D() {
        return this.A01 != null;
    }

    public final boolean A0E() {
        return this.A00 != null;
    }
}

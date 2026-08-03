package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class SX {
    public final long A00;
    public final com.facebook.ads.redexgen.core.SW A01;
    public final java.lang.String A02;
    public final boolean A03;

    public SX(java.lang.String str, boolean z, com.facebook.ads.redexgen.core.SW sw) {
        this(str, z, sw, java.lang.System.currentTimeMillis());
    }

    public SX(java.lang.String str, boolean z, com.facebook.ads.redexgen.core.SW sw, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = sw;
        this.A00 = j;
    }

    public static com.facebook.ads.redexgen.core.SX A00() {
        return new com.facebook.ads.redexgen.core.SX("", true, com.facebook.ads.redexgen.core.SW.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.SW A02() {
        return this.A01;
    }

    public final java.lang.String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}

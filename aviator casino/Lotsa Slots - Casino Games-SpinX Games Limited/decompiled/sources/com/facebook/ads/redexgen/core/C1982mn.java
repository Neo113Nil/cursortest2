package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.mn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1982mn implements com.facebook.ads.redexgen.core.HY {
    public final long A00;
    public final com.facebook.ads.redexgen.core.HX A01;

    public C1982mn(long j) {
        this(j, 0L);
    }

    public C1982mn(long j, long j2) {
        this.A00 = j;
        this.A01 = new com.facebook.ads.redexgen.core.HX(j2 == 0 ? com.facebook.ads.redexgen.core.HZ.A04 : new com.facebook.ads.redexgen.core.HZ(0L, j2));
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final com.facebook.ads.redexgen.core.HX A91(long j) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return false;
    }
}

package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1854kV implements com.facebook.ads.redexgen.core.C5V {
    public com.facebook.ads.redexgen.core.MP A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final com.facebook.ads.redexgen.core.C1854kV A00(com.facebook.ads.redexgen.core.MP mp) {
        this.A02 = mp;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C5V
    public final com.facebook.ads.redexgen.core.C1853kU A5H() {
        return new com.facebook.ads.redexgen.core.C1853kU((com.facebook.ads.redexgen.core.MP) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A02), this.A01, this.A00);
    }
}

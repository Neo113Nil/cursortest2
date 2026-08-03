package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0592Be extends com.facebook.ads.redexgen.core.AbstractC2048ns {
    public C0592Be() {
        super(null);
    }

    private final com.facebook.ads.redexgen.core.AbstractC2048ns A00(int result) {
        com.facebook.ads.redexgen.core.AbstractC2048ns abstractC2048ns;
        com.facebook.ads.redexgen.core.AbstractC2048ns abstractC2048ns2;
        com.facebook.ads.redexgen.core.AbstractC2048ns abstractC2048ns3;
        if (result < 0) {
            abstractC2048ns3 = com.facebook.ads.redexgen.core.AbstractC2048ns.A02;
            return abstractC2048ns3;
        }
        if (result > 0) {
            abstractC2048ns2 = com.facebook.ads.redexgen.core.AbstractC2048ns.A01;
            return abstractC2048ns2;
        }
        abstractC2048ns = com.facebook.ads.redexgen.core.AbstractC2048ns.A00;
        return abstractC2048ns;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2048ns
    public final int A05() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2048ns
    public final com.facebook.ads.redexgen.core.AbstractC2048ns A06(int left, int right) {
        return A00(java.lang.Integer.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2048ns
    public final com.facebook.ads.redexgen.core.AbstractC2048ns A07(long left, long right) {
        return A00(java.lang.Long.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2048ns
    public final <T> com.facebook.ads.redexgen.core.AbstractC2048ns A08(@com.google.common.collect.ParametricNullness T left, @com.google.common.collect.ParametricNullness T right, java.util.Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2048ns
    public final com.facebook.ads.redexgen.core.AbstractC2048ns A09(boolean left, boolean right) {
        return A00(java.lang.Boolean.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2048ns
    public final com.facebook.ads.redexgen.core.AbstractC2048ns A0A(boolean left, boolean right) {
        return A00(java.lang.Boolean.compare(right, left));
    }
}

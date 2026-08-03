package com.facebook.ads.redexgen.core;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.kp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1873kp {
    public final int A00;
    public final com.facebook.ads.redexgen.core.CC A01;
    public final com.facebook.ads.redexgen.core.InterfaceC1872ko A02;
    public final boolean A03;

    public C1873kp(com.facebook.ads.redexgen.core.InterfaceC1872ko strategy) {
        this(strategy, false, com.facebook.ads.redexgen.core.CC.A03(), Integer.MAX_VALUE);
    }

    public C1873kp(com.facebook.ads.redexgen.core.InterfaceC1872ko strategy, boolean omitEmptyStrings, com.facebook.ads.redexgen.core.CC trimmer, int limit) {
        this.A02 = strategy;
        this.A03 = omitEmptyStrings;
        this.A01 = trimmer;
        this.A00 = limit;
    }

    public static com.facebook.ads.redexgen.core.C1873kp A02(char separator) {
        return A03(com.facebook.ads.redexgen.core.CC.A02(separator));
    }

    public static com.facebook.ads.redexgen.core.C1873kp A03(final com.facebook.ads.redexgen.core.CC separatorMatcher) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(separatorMatcher);
        return new com.facebook.ads.redexgen.core.C1873kp(new com.facebook.ads.redexgen.core.C3(separatorMatcher));
    }

    private java.util.Iterator<java.lang.String> A04(java.lang.CharSequence sequence) {
        return this.A02.AAl(this, sequence);
    }

    public final java.util.List<java.lang.String> A06(java.lang.CharSequence sequence) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(sequence);
        java.util.Iterator<java.lang.String> A04 = A04(sequence);
        java.util.List<java.lang.String> result = new java.util.ArrayList<>();
        while (A04.hasNext()) {
            result.add(A04.next());
        }
        return java.util.Collections.unmodifiableList(result);
    }
}

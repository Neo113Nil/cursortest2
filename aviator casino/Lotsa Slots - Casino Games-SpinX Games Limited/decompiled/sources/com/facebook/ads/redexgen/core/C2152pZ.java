package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2152pZ implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public final int A00;
    public final com.facebook.ads.redexgen.core.C2159pg A01;
    public final boolean A02;
    public final int[] A03;
    public final boolean[] A04;
    public static final java.lang.String A07 = com.facebook.ads.redexgen.core.C5C.A0h(0);
    public static final java.lang.String A09 = com.facebook.ads.redexgen.core.C5C.A0h(1);
    public static final java.lang.String A08 = com.facebook.ads.redexgen.core.C5C.A0h(3);
    public static final java.lang.String A06 = com.facebook.ads.redexgen.core.C5C.A0h(4);
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2152pZ> A05 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pa
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            return com.facebook.ads.redexgen.core.C2152pZ.A00(bundle);
        }
    };

    public C2152pZ(com.facebook.ads.redexgen.core.C2159pg c2159pg, boolean z, int[] iArr, boolean[] zArr) {
        this.A00 = c2159pg.A01;
        boolean z2 = false;
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(this.A00 == iArr.length && this.A00 == zArr.length);
        this.A01 = c2159pg;
        if (z && this.A00 > 1) {
            z2 = true;
        }
        this.A02 = z2;
        this.A03 = (int[]) iArr.clone();
        this.A04 = (boolean[]) zArr.clone();
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.C2152pZ A00(android.os.Bundle bundle) {
        com.facebook.ads.redexgen.core.C2159pg A6f = com.facebook.ads.redexgen.core.C2159pg.A06.A6f((android.os.Bundle) com.facebook.ads.redexgen.core.AbstractC04203y.A01(bundle.getBundle(A07)));
        int[] iArr = (int[]) com.facebook.ads.redexgen.core.AbstractC1859ka.A00(bundle.getIntArray(A09), new int[A6f.A01]);
        boolean[] selected = (boolean[]) com.facebook.ads.redexgen.core.AbstractC1859ka.A00(bundle.getBooleanArray(A08), new boolean[A6f.A01]);
        return new com.facebook.ads.redexgen.core.C2152pZ(A6f, bundle.getBoolean(A06, false), iArr, selected);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C2152pZ c2152pZ = (com.facebook.ads.redexgen.core.C2152pZ) obj;
        if (this.A02 == c2152pZ.A02 && this.A01.equals(c2152pZ.A01) && java.util.Arrays.equals(this.A03, c2152pZ.A03) && java.util.Arrays.equals(this.A04, c2152pZ.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + (this.A02 ? 1 : 0)) * 31) + java.util.Arrays.hashCode(this.A03)) * 31) + java.util.Arrays.hashCode(this.A04);
    }
}

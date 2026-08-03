package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2157pe implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public final com.facebook.ads.redexgen.core.C2159pg A00;
    public final com.facebook.ads.redexgen.core.BP<java.lang.Integer> A01;
    public static final java.lang.String A04 = com.facebook.ads.redexgen.core.C5C.A0h(0);
    public static final java.lang.String A03 = com.facebook.ads.redexgen.core.C5C.A0h(1);
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2157pe> A02 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pf
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            return com.facebook.ads.redexgen.core.C2157pe.A00(bundle);
        }
    };

    public C2157pe(com.facebook.ads.redexgen.core.C2159pg c2159pg, java.util.List<java.lang.Integer> trackIndices) {
        if (trackIndices.isEmpty() || (((java.lang.Integer) java.util.Collections.min(trackIndices)).intValue() >= 0 && ((java.lang.Integer) java.util.Collections.max(trackIndices)).intValue() < c2159pg.A01)) {
            this.A00 = c2159pg;
            this.A01 = com.facebook.ads.redexgen.core.BP.A05(trackIndices);
            return;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.C2157pe A00(android.os.Bundle bundle) {
        return new com.facebook.ads.redexgen.core.C2157pe(com.facebook.ads.redexgen.core.C2159pg.A06.A6f((android.os.Bundle) com.facebook.ads.redexgen.core.AbstractC04203y.A01(bundle.getBundle(A04))), com.facebook.ads.redexgen.core.AbstractC0580As.A09((int[]) com.facebook.ads.redexgen.core.AbstractC04203y.A01(bundle.getIntArray(A03))));
    }

    public final int A01() {
        return this.A00.A02;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C2157pe c2157pe = (com.facebook.ads.redexgen.core.C2157pe) obj;
        return this.A00.equals(c2157pe.A00) && this.A01.equals(c2157pe.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }
}

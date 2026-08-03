package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AX extends com.facebook.ads.redexgen.core.AbstractC2171pt {
    public final boolean A00;
    public final boolean A01;
    public static final java.lang.String A04 = com.facebook.ads.redexgen.core.C5C.A0h(1);
    public static final java.lang.String A03 = com.facebook.ads.redexgen.core.C5C.A0h(2);
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.AX> A02 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qH
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            com.facebook.ads.redexgen.core.AX A00;
            A00 = com.facebook.ads.redexgen.core.AX.A00(bundle);
            return A00;
        }
    };

    public AX() {
        this.A01 = false;
        this.A00 = false;
    }

    public AX(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }

    public static com.facebook.ads.redexgen.core.AX A00(android.os.Bundle bundle) {
        boolean isRated = bundle.getInt(com.facebook.ads.redexgen.core.AbstractC2171pt.A02, -1) == 0;
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(isRated);
        boolean isRated2 = bundle.getBoolean(A04, false);
        if (isRated2) {
            return new com.facebook.ads.redexgen.core.AX(bundle.getBoolean(A03, false));
        }
        return new com.facebook.ads.redexgen.core.AX();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.facebook.ads.redexgen.core.AX)) {
            return false;
        }
        com.facebook.ads.redexgen.core.AX ax = (com.facebook.ads.redexgen.core.AX) obj;
        return this.A00 == ax.A00 && this.A01 == ax.A01;
    }

    public final int hashCode() {
        return com.facebook.ads.redexgen.core.CB.A00(java.lang.Boolean.valueOf(this.A01), java.lang.Boolean.valueOf(this.A00));
    }
}

package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AT extends com.facebook.ads.redexgen.core.AbstractC2171pt {
    public final boolean A00;
    public final boolean A01;
    public static final java.lang.String A04 = com.facebook.ads.redexgen.core.C5C.A0h(1);
    public static final java.lang.String A03 = com.facebook.ads.redexgen.core.C5C.A0h(2);
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.AT> A02 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pr
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            com.facebook.ads.redexgen.core.AT A00;
            A00 = com.facebook.ads.redexgen.core.AT.A00(bundle);
            return A00;
        }
    };

    public AT() {
        this.A01 = false;
        this.A00 = false;
    }

    public AT(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }

    public static com.facebook.ads.redexgen.core.AT A00(android.os.Bundle bundle) {
        boolean rated = bundle.getInt(com.facebook.ads.redexgen.core.AbstractC2171pt.A02, -1) == 3;
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(rated);
        boolean rated2 = bundle.getBoolean(A04, false);
        if (rated2) {
            return new com.facebook.ads.redexgen.core.AT(bundle.getBoolean(A03, false));
        }
        return new com.facebook.ads.redexgen.core.AT();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.facebook.ads.redexgen.core.AT)) {
            return false;
        }
        com.facebook.ads.redexgen.core.AT at = (com.facebook.ads.redexgen.core.AT) obj;
        return this.A00 == at.A00 && this.A01 == at.A01;
    }

    public final int hashCode() {
        return com.facebook.ads.redexgen.core.CB.A00(java.lang.Boolean.valueOf(this.A01), java.lang.Boolean.valueOf(this.A00));
    }
}

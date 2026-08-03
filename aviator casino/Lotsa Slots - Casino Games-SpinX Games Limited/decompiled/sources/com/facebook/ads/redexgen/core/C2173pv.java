package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2173pv implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public final com.facebook.ads.redexgen.core.C03852n A00;
    public static java.lang.String[] A01 = {"mula3CidaM", "QXZvrsMqvoQg77WBvlve", "clHaL9AVxqL", "4", "dTVzaj3Js", "vbPIPyw6rptXOUyrUErD6RaDDuBNyqsV", "dqUk2BmO1rRhKnsvPvl2vnYni3", "mE8b9jVFwC8HjBTnnlrMONG37KhdcP6J"};
    public static final com.facebook.ads.redexgen.core.C2173pv A03 = new com.facebook.ads.redexgen.core.C3P().A04();
    public static final java.lang.String A04 = com.facebook.ads.redexgen.core.C5C.A0h(0);
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2173pv> A02 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pw
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            com.facebook.ads.redexgen.core.C2173pv A012;
            A012 = com.facebook.ads.redexgen.core.C2173pv.A01(bundle);
            return A012;
        }
    };

    public C2173pv(com.facebook.ads.redexgen.core.C03852n c03852n) {
        this.A00 = c03852n;
    }

    public static com.facebook.ads.redexgen.core.C2173pv A01(android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.Integer> integerArrayList = bundle.getIntegerArrayList(A04);
        if (integerArrayList == null) {
            return A03;
        }
        com.facebook.ads.redexgen.core.C3P c3p = new com.facebook.ads.redexgen.core.C3P();
        int i = 0;
        while (true) {
            int size = integerArrayList.size();
            if (A01[7].charAt(28) != 'c') {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "mp2TMNIiilctnlK0CRpdI2bFoWxScr6M";
            if (i < size) {
                c3p.A00(integerArrayList.get(i).intValue());
                i++;
            } else {
                return c3p.A04();
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (!(obj instanceof com.facebook.ads.redexgen.core.C2173pv)) {
                return false;
            }
            return this.A00.equals(((com.facebook.ads.redexgen.core.C2173pv) obj).A00);
        }
        if (A01[5].charAt(22) == 'S') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[2] = "64Urjp6xISM";
        strArr[0] = "9byEEtKTR1";
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}

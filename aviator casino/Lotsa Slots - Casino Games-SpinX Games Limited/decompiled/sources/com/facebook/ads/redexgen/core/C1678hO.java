package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1678hO extends com.facebook.ads.redexgen.core.WP {
    public static java.lang.String[] A01 = {"12g74Y80MldwuLH5Sc5BNMhqIci3y3n7", "gYGMtvDgCappq8Eqx1aX2vuQToh52UHd", "GlXHohOtVJhIOcbHhrFcSUyeAoJlZUN4", "CknPoCaYYZqOx1VHoQWkocTpfCeiqOL0", "IgiYYUSARpIlAyCBMTexeC9bH0PhGiJU", "Cia0Frm0699G8jcollxZnIfMYARIEex0", "Mzdi9MK983UUFZlepuPfFCQdgw1DK7MX", "jSW62lJNNGtUKopGO2HTdr7H5wR53AmM"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1676hM A00;

    public C1678hO(com.facebook.ads.redexgen.core.C1676hM c1676hM) {
        this.A00 = c1676hM;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        com.facebook.ads.redexgen.core.C0997Rd c0997Rd;
        com.facebook.ads.redexgen.core.C0997Rd c0997Rd2;
        com.facebook.ads.redexgen.core.C0997Rd c0997Rd3;
        c0997Rd = this.A00.A01;
        if (c0997Rd.A06() != null) {
            c0997Rd2 = this.A00.A01;
            java.lang.String[] strArr = A01;
            if (strArr[3].charAt(29) == strArr[0].charAt(29)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[3] = "nnCrEA10h1A2hd08C5n1xIwFCKPiTwdC";
            strArr2[0] = "49SRRBhRmQihygS20ldMlh5Gkuzwxt90";
            com.facebook.ads.AdListener A06 = c0997Rd2.A06();
            c0997Rd3 = this.A00.A01;
            A06.onAdClicked(c0997Rd3.A07());
        }
    }
}

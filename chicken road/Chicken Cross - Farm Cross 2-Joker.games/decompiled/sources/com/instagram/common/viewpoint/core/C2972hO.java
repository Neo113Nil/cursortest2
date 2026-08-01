package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2972hO extends WP {
    public static String[] A01 = {"12g74Y80MldwuLH5Sc5BNMhqIci3y3n7", "gYGMtvDgCappq8Eqx1aX2vuQToh52UHd", "GlXHohOtVJhIOcbHhrFcSUyeAoJlZUN4", "CknPoCaYYZqOx1VHoQWkocTpfCeiqOL0", "IgiYYUSARpIlAyCBMTexeC9bH0PhGiJU", "Cia0Frm0699G8jcollxZnIfMYARIEex0", "Mzdi9MK983UUFZlepuPfFCQdgw1DK7MX", "jSW62lJNNGtUKopGO2HTdr7H5wR53AmM"};
    public final /* synthetic */ C2970hM A00;

    public C2972hO(C2970hM c2970hM) {
        this.A00 = c2970hM;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        C2291Rd c2291Rd;
        C2291Rd c2291Rd2;
        C2291Rd c2291Rd3;
        c2291Rd = this.A00.A01;
        if (c2291Rd.A06() != null) {
            c2291Rd2 = this.A00.A01;
            String[] strArr = A01;
            if (strArr[3].charAt(29) == strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "nnCrEA10h1A2hd08C5n1xIwFCKPiTwdC";
            strArr2[0] = "49SRRBhRmQihygS20ldMlh5Gkuzwxt90";
            AdListener A06 = c2291Rd2.A06();
            c2291Rd3 = this.A00.A01;
            A06.onAdClicked(c2291Rd3.A07());
        }
    }
}

package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.fs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1308fs extends AbstractRunnableC0827Vg {
    public static String[] A01 = {"12g74Y80MldwuLH5Sc5BNMhqIci3y3n7", "gYGMtvDgCappq8Eqx1aX2vuQToh52UHd", "GlXHohOtVJhIOcbHhrFcSUyeAoJlZUN4", "CknPoCaYYZqOx1VHoQWkocTpfCeiqOL0", "IgiYYUSARpIlAyCBMTexeC9bH0PhGiJU", "Cia0Frm0699G8jcollxZnIfMYARIEex0", "Mzdi9MK983UUFZlepuPfFCQdgw1DK7MX", "jSW62lJNNGtUKopGO2HTdr7H5wR53AmM"};
    public final /* synthetic */ C1306fq A00;

    public C1308fs(C1306fq c1306fq) {
        this.A00 = c1306fq;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0827Vg
    public final void A01() {
        C0719Qz c0719Qz;
        C0719Qz c0719Qz2;
        C0719Qz c0719Qz3;
        c0719Qz = this.A00.A01;
        if (c0719Qz.A06() != null) {
            c0719Qz2 = this.A00.A01;
            String[] strArr = A01;
            if (strArr[3].charAt(29) == strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "nnCrEA10h1A2hd08C5n1xIwFCKPiTwdC";
            strArr2[0] = "49SRRBhRmQihygS20ldMlh5Gkuzwxt90";
            AdListener A06 = c0719Qz2.A06();
            c0719Qz3 = this.A00.A01;
            A06.onAdClicked(c0719Qz3.A07());
        }
    }
}

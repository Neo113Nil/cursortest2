package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class PT implements com.facebook.ads.redexgen.core.InterfaceC1170Ya {
    public static java.lang.String[] A02 = {"YUGwJzzikBNzfLIllCMdkir2Jyj8DuFq", "ntVfVONdyCctXWp", "AonpNDk7AlTTh7WnvPqW51ITIbVwFUJp", "NJZ9S98WzFijxyBcJxql7T6JOIFmEfw7", "8QFO", "nOxceDp", "zcnAPzBVA2CXXQsDQKs94da1Vf1b77Qu", "s6TvhQwfXdUE9Ss2QaqLkXkKVbAwWXrL"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0998Re A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.PJ A01;

    public PT(com.facebook.ads.redexgen.core.PJ pj, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        this.A01 = pj;
        this.A00 = c0998Re;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1170Ya
    public final void ACl(com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb) {
        if (abstractC1171Yb.getToolbarActionMode() == 8) {
            this.A01.A0d();
            return;
        }
        this.A01.A0G.A04(com.facebook.ads.redexgen.core.VH.A07, null);
        if (this.A01.A0l()) {
            return;
        }
        com.facebook.ads.redexgen.core.PJ pj = this.A01;
        if (A02[3].charAt(29) != 'f') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[0] = "pLKL5MIsKfCUMWoMxvxDNCAoAO8BGlnS";
        strArr[7] = "7PsgTAKpTeXTqL7VuWAjeXRdKL6HZN4L";
        if (pj.A0i()) {
            this.A01.A0h(this.A00);
        } else {
            this.A01.A0E.A0F().AB0();
            this.A00.finish(1);
        }
    }
}

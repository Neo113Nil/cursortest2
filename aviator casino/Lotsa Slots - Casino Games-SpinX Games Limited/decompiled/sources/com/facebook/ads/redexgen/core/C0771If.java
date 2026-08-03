package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.If, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0771If implements com.facebook.ads.redexgen.core.XN {
    public static java.lang.String[] A01 = {"72ztA7TlK5AWnMBFqm0ulEGrNikWU87c", "q9jSjTIXJJeud4mNFdEJpcs0aBWF", "6LBG7Z", "4a80CIrFExPHnWcdf8FRxARvXokzjsAY", "hmt020juZcOK2XVUFVfIwXvCI0upMeB5", "bPuxHbTn8HkB22ksZqTc8mW6RF8jNMxu", "KvPASdtvPFN6v", "W7wSubo8j20OAA03KxoOzu7JM99EpBz5"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04555h A00;

    public C0771If(com.facebook.ads.redexgen.core.C04555h c04555h) {
        this.A00 = c04555h;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3;
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c32;
        com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm;
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c33;
        com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm2;
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb;
        com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm3;
        int i;
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c34;
        com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm4;
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb2;
        abstractC1349c3 = this.A00.A01;
        if (abstractC1349c3 instanceof com.facebook.ads.redexgen.core.C0819Kc) {
            abstractC1349c34 = this.A00.A01;
            if (abstractC1349c34.A1M()) {
                interfaceC1456dm4 = this.A00.A07;
                interfaceC1456dm4.AFw(true);
                abstractC1171Yb2 = this.A00.A06;
                abstractC1171Yb2.setToolbarActionMode(1);
                interfaceC1456dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1456dm3.ADc(i);
            }
        }
        abstractC1349c32 = this.A00.A01;
        if (abstractC1349c32 instanceof com.facebook.ads.redexgen.core.C0799Ji) {
            abstractC1349c33 = this.A00.A01;
            if (abstractC1349c33.A1M()) {
                interfaceC1456dm2 = this.A00.A07;
                interfaceC1456dm2.AFw(true);
                abstractC1171Yb = this.A00.A06;
                abstractC1171Yb.setToolbarActionMode(1);
                interfaceC1456dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1456dm3.ADc(i);
            }
        }
        interfaceC1456dm = this.A00.A07;
        java.lang.String[] strArr = A01;
        if (strArr[4].charAt(11) == strArr[3].charAt(11)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[5] = "jNYMJATRfaQqNW2YkrgQ7vcVmM2IUm0K";
        strArr2[0] = "cX4sd5TjwRWpCL8J3hPSalfD2n4ZIotM";
        interfaceC1456dm.AFw(false);
        interfaceC1456dm3 = this.A00.A07;
        i = this.A00.A03;
        interfaceC1456dm3.ADc(i);
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm;
        int i;
        com.facebook.ads.redexgen.core.DZ dz;
        com.facebook.ads.redexgen.core.DZ dz2;
        int i2;
        interfaceC1456dm = this.A00.A07;
        i = this.A00.A03;
        interfaceC1456dm.ADw(i - f);
        dz = this.A00.A02;
        if (dz != null) {
            dz2 = this.A00.A02;
            i2 = this.A00.A03;
            dz2.A07((int) (i2 - f));
        }
    }
}

package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.If, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2065If implements XN {
    public static String[] A01 = {"72ztA7TlK5AWnMBFqm0ulEGrNikWU87c", "q9jSjTIXJJeud4mNFdEJpcs0aBWF", "6LBG7Z", "4a80CIrFExPHnWcdf8FRxARvXokzjsAY", "hmt020juZcOK2XVUFVfIwXvCI0upMeB5", "bPuxHbTn8HkB22ksZqTc8mW6RF8jNMxu", "KvPASdtvPFN6v", "W7wSubo8j20OAA03KxoOzu7JM99EpBz5"};
    public final /* synthetic */ C17495h A00;

    public C2065If(C17495h c17495h) {
        this.A00 = c17495h;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        AbstractC2643c3 abstractC2643c3;
        AbstractC2643c3 abstractC2643c32;
        InterfaceC2750dm interfaceC2750dm;
        AbstractC2643c3 abstractC2643c33;
        InterfaceC2750dm interfaceC2750dm2;
        AbstractC2465Yb abstractC2465Yb;
        InterfaceC2750dm interfaceC2750dm3;
        int i;
        AbstractC2643c3 abstractC2643c34;
        InterfaceC2750dm interfaceC2750dm4;
        AbstractC2465Yb abstractC2465Yb2;
        abstractC2643c3 = this.A00.A01;
        if (abstractC2643c3 instanceof C2113Kc) {
            abstractC2643c34 = this.A00.A01;
            if (abstractC2643c34.A1M()) {
                interfaceC2750dm4 = this.A00.A07;
                interfaceC2750dm4.AFw(true);
                abstractC2465Yb2 = this.A00.A06;
                abstractC2465Yb2.setToolbarActionMode(1);
                interfaceC2750dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC2750dm3.ADc(i);
            }
        }
        abstractC2643c32 = this.A00.A01;
        if (abstractC2643c32 instanceof C2093Ji) {
            abstractC2643c33 = this.A00.A01;
            if (abstractC2643c33.A1M()) {
                interfaceC2750dm2 = this.A00.A07;
                interfaceC2750dm2.AFw(true);
                abstractC2465Yb = this.A00.A06;
                abstractC2465Yb.setToolbarActionMode(1);
                interfaceC2750dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC2750dm3.ADc(i);
            }
        }
        interfaceC2750dm = this.A00.A07;
        String[] strArr = A01;
        if (strArr[4].charAt(11) == strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "jNYMJATRfaQqNW2YkrgQ7vcVmM2IUm0K";
        strArr2[0] = "cX4sd5TjwRWpCL8J3hPSalfD2n4ZIotM";
        interfaceC2750dm.AFw(false);
        interfaceC2750dm3 = this.A00.A07;
        i = this.A00.A03;
        interfaceC2750dm3.ADc(i);
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f) {
        InterfaceC2750dm interfaceC2750dm;
        int i;
        DZ dz;
        DZ dz2;
        int i2;
        interfaceC2750dm = this.A00.A07;
        i = this.A00.A03;
        interfaceC2750dm.ADw(i - f);
        dz = this.A00.A02;
        if (dz != null) {
            dz2 = this.A00.A02;
            i2 = this.A00.A03;
            dz2.A07((int) (i2 - f));
        }
    }
}

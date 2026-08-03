package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Nw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0916Nw implements com.facebook.ads.redexgen.core.InterfaceC1170Ya {
    public static java.lang.String[] A01 = {"dAENZa04S5kpLZ1505OVGzU", "BCWAX", "x4EBtM5L1", "d5mzvX7vdf5oGTbdkf23a85QS6J33UuP", "T3xMk8xyeuXfnP2cHDF22zgmf4sSWk7a", "D6RnJQb1nSkQk7teZoJG77p", "lMrZ8D5HcAsH09zpnUIM78ubrFXrhoz6", "r7D6OIPJDO7XxyVdFUwVLtQI1zZlrgYr"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.NO A00;

    public C0916Nw(com.facebook.ads.redexgen.core.NO no) {
        this.A00 = no;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1170Ya
    public final void ACl(com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb) {
        boolean A0Y;
        boolean z;
        com.facebook.ads.redexgen.core.VI vi;
        com.facebook.ads.redexgen.core.C0908No c0908No;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
        com.facebook.ads.redexgen.core.ZU zu;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        boolean A0X;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        com.facebook.ads.redexgen.core.C1328bi c1328bi;
        A0Y = this.A00.A0Y();
        if (A0Y) {
            atomicBoolean2 = this.A00.A0b;
            if (!atomicBoolean2.get()) {
                c1328bi = this.A00.A0Z;
                c1328bi.A07(this.A00);
                return;
            }
        }
        com.facebook.ads.redexgen.core.NO no = this.A00;
        if (A01[4].charAt(5) == '8') {
            A01[1] = "011C";
            z = no.A0d;
            if (z) {
                atomicBoolean = this.A00.A0b;
                if (!atomicBoolean.get()) {
                    A0X = this.A00.A0X();
                    if (A0X) {
                        this.A00.A0g.setToolbarActionMode(0);
                        this.A00.A0N();
                        return;
                    }
                }
            }
            vi = this.A00.A0T;
            vi.A04(com.facebook.ads.redexgen.core.VH.A07, null);
            c0908No = this.A00.A0P;
            if (c0908No.A0c()) {
                c1636gi2 = this.A00.A0R;
                c1636gi2.A0F().AEO();
            }
            c1636gi = this.A00.A0R;
            c1636gi.A0F().AB0();
            interfaceC1177Yh = this.A00.A0W;
            zu = this.A00.A0X;
            java.lang.String A7w = zu.A7w();
            if (A01[6].charAt(7) != 'V') {
                java.lang.String[] strArr = A01;
                strArr[3] = "iNY9OvP3hEWy4eydF9NsffnrPtCfLtIx";
                strArr[7] = "zl19Behk0RYI4HrdG27XeFY6Dxp3Bz2i";
                interfaceC1177Yh.A4j(A7w);
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }
}

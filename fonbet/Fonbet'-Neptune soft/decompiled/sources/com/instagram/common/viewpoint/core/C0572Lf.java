package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Lf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0572Lf implements InterfaceC0882Xl {
    public static String[] A01 = {"dAENZa04S5kpLZ1505OVGzU", "BCWAX", "x4EBtM5L1", "d5mzvX7vdf5oGTbdkf23a85QS6J33UuP", "T3xMk8xyeuXfnP2cHDF22zgmf4sSWk7a", "D6RnJQb1nSkQk7teZoJG77p", "lMrZ8D5HcAsH09zpnUIM78ubrFXrhoz6", "r7D6OIPJDO7XxyVdFUwVLtQI1zZlrgYr"};
    public final /* synthetic */ C0569Lc A00;

    public C0572Lf(C0569Lc c0569Lc) {
        this.A00 = c0569Lc;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0882Xl
    public final void ACC(AbstractC0883Xm abstractC0883Xm) {
        boolean A0W;
        boolean z;
        C0796Ua c0796Ua;
        NB nb;
        InterfaceC0884Xn interfaceC0884Xn;
        YY yy;
        C1153dL c1153dL;
        AtomicBoolean atomicBoolean;
        boolean A0V;
        AtomicBoolean atomicBoolean2;
        C0965aI c0965aI;
        A0W = this.A00.A0W();
        if (A0W) {
            atomicBoolean2 = this.A00.A0V;
            if (!atomicBoolean2.get()) {
                c0965aI = this.A00.A0T;
                c0965aI.A07(this.A00);
                return;
            }
        }
        C0569Lc c0569Lc = this.A00;
        if (A01[4].charAt(5) == '8') {
            A01[1] = "011C";
            z = c0569Lc.A0X;
            if (z) {
                atomicBoolean = this.A00.A0V;
                if (!atomicBoolean.get()) {
                    A0V = this.A00.A0V();
                    if (A0V) {
                        this.A00.A0a.setToolbarActionMode(0);
                        this.A00.A0L();
                        return;
                    }
                }
            }
            c0796Ua = this.A00.A0N;
            c0796Ua.A04(UZ.A07, null);
            nb = this.A00.A0J;
            if (nb.A0P()) {
                c1153dL = this.A00.A0L;
                c1153dL.A0F().ADk();
            }
            interfaceC0884Xn = this.A00.A0Q;
            C0569Lc c0569Lc2 = this.A00;
            if (A01[2].length() == 9) {
                A01[6] = "SsRiNY9tvP3hEWy4eyTF9NsffnrPtCfL";
                yy = c0569Lc2.A0R;
                interfaceC0884Xn.A4b(yy.A7o());
                return;
            }
        }
        throw new RuntimeException();
    }
}

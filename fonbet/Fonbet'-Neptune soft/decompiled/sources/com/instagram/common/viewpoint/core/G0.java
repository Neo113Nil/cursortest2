package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class G0 implements InterfaceC1100cT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0436Fy A01;

    public G0(C0436Fy c0436Fy, int i) {
        this.A01 = c0436Fy;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1100cT
    public final void ABr() {
        this.A01.A0E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1100cT
    public final void ACZ() {
        this.A01.A0V(false, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1100cT
    public final void ACy(int i) {
        C0436Fy.A02(this.A01, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1100cT
    public final void ADI(float f) {
        boolean z;
        z = this.A01.A08;
        if (!z) {
            this.A01.A0J(f);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1100cT
    public final void AFE(boolean z) {
        this.A01.A0U(z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1100cT
    public final void AFg(String str) {
        C1153dL c1153dL;
        InterfaceC0884Xn interfaceC0884Xn;
        YY yy;
        c1153dL = this.A01.A0D;
        c1153dL.A0F().A3S(str);
        interfaceC0884Xn = this.A01.A0I;
        yy = this.A01.A0J;
        interfaceC0884Xn.A4b(yy.A7t());
        this.A01.A0K(3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1100cT
    public final void AJr() {
        AbstractC0883Xm abstractC0883Xm;
        AbstractC0883Xm abstractC0883Xm2;
        this.A01.setUnskippableSecondsComplete(false);
        abstractC0883Xm = this.A01.A0H;
        abstractC0883Xm.setProgressImmediate(0.0f);
        abstractC0883Xm2 = this.A01.A0H;
        abstractC0883Xm2.setToolbarActionMode(2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1100cT
    public final void AJs(float f) {
        AbstractC0883Xm abstractC0883Xm;
        abstractC0883Xm = this.A01.A0H;
        abstractC0883Xm.setProgress(100.0f * f);
    }
}

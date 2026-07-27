package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2015Gh implements InterfaceC2750dm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2012Ge A01;

    public C2015Gh(C2012Ge c2012Ge, int i) {
        this.A01 = c2012Ge;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2750dm
    public final void ACQ() {
        this.A01.A0G();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2750dm
    public final void ADA() {
        this.A01.A0X(false, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2750dm
    public final void ADc(int i) {
        C2012Ge.A03(this.A01, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2750dm
    public final void ADw(float f) {
        boolean z;
        z = this.A01.A08;
        if (!z) {
            this.A01.A0L(f);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2750dm
    public final void AFw(boolean z) {
        this.A01.A0W(z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2750dm
    public final void AGQ(String str) {
        C2930gi c2930gi;
        C3089jT c3089jT;
        InterfaceC2471Yh interfaceC2471Yh;
        ZU zu;
        int i;
        C3089jT c3089jT2;
        C2930gi c2930gi2;
        c2930gi = this.A01.A0D;
        c2930gi.A0F().A3a(str);
        c3089jT = this.A01.A0A;
        if (c3089jT.A2H()) {
            i = this.A01.A00;
            c3089jT2 = this.A01.A0A;
            if (i < c3089jT2.A23()) {
                c2930gi2 = this.A01.A0D;
                c2930gi2.A0F().AC2();
                this.A01.A0X(false, this.A00);
                return;
            }
        }
        interfaceC2471Yh = this.A01.A0I;
        zu = this.A01.A0J;
        interfaceC2471Yh.A4j(zu.A81());
        this.A01.A0M(3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2750dm
    public final void AKc() {
        AbstractC2465Yb abstractC2465Yb;
        AbstractC2465Yb abstractC2465Yb2;
        this.A01.setUnskippableSecondsComplete(false);
        abstractC2465Yb = this.A01.A0H;
        abstractC2465Yb.setProgressImmediate(0.0f);
        abstractC2465Yb2 = this.A01.A0H;
        abstractC2465Yb2.setToolbarActionMode(2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2750dm
    public final void AKd(float f) {
        AbstractC2465Yb abstractC2465Yb;
        abstractC2465Yb = this.A01.A0H;
        abstractC2465Yb.setProgress(100.0f * f);
    }
}

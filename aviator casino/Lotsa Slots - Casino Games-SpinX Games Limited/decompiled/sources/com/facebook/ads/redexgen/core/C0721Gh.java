package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0721Gh implements com.facebook.ads.redexgen.core.InterfaceC1456dm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0718Ge A01;

    public C0721Gh(com.facebook.ads.redexgen.core.C0718Ge c0718Ge, int i) {
        this.A01 = c0718Ge;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1456dm
    public final void ACQ() {
        this.A01.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1456dm
    public final void ADA() {
        this.A01.A0X(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1456dm
    public final void ADc(int i) {
        com.facebook.ads.redexgen.core.C0718Ge.A03(this.A01, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1456dm
    public final void ADw(float f) {
        boolean z;
        z = this.A01.A08;
        if (!z) {
            this.A01.A0L(f);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1456dm
    public final void AFw(boolean z) {
        this.A01.A0W(z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1456dm
    public final void AGQ(java.lang.String str) {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C1795jT c1795jT;
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
        com.facebook.ads.redexgen.core.ZU zu;
        int i;
        com.facebook.ads.redexgen.core.C1795jT c1795jT2;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        c1636gi = this.A01.A0D;
        c1636gi.A0F().A3a(str);
        c1795jT = this.A01.A0A;
        if (c1795jT.A2H()) {
            i = this.A01.A00;
            c1795jT2 = this.A01.A0A;
            if (i < c1795jT2.A23()) {
                c1636gi2 = this.A01.A0D;
                c1636gi2.A0F().AC2();
                this.A01.A0X(false, this.A00);
                return;
            }
        }
        interfaceC1177Yh = this.A01.A0I;
        zu = this.A01.A0J;
        interfaceC1177Yh.A4j(zu.A81());
        this.A01.A0M(3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1456dm
    public final void AKc() {
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb;
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb2;
        this.A01.setUnskippableSecondsComplete(false);
        abstractC1171Yb = this.A01.A0H;
        abstractC1171Yb.setProgressImmediate(0.0f);
        abstractC1171Yb2 = this.A01.A0H;
        abstractC1171Yb2.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1456dm
    public final void AKd(float f) {
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb;
        abstractC1171Yb = this.A01.A0H;
        abstractC1171Yb.setProgress(100.0f * f);
    }
}

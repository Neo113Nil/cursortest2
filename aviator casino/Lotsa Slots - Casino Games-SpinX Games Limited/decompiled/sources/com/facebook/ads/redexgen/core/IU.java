package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class IU implements com.facebook.ads.redexgen.core.XN {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5S A00;

    public IU(com.facebook.ads.redexgen.core.C5S c5s) {
        this.A00 = c5s;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm;
        int i;
        com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm2;
        interfaceC1456dm = this.A00.A0P;
        i = this.A00.A0F;
        interfaceC1456dm.ADc(i);
        interfaceC1456dm2 = this.A00.A0P;
        interfaceC1456dm2.ADA();
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        int i;
        boolean z;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
        int duration;
        boolean z2;
        int i2;
        com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm;
        i = this.A00.A0F;
        float f2 = i - f;
        z = this.A00.A0d;
        if (z) {
            duration = 0;
        } else {
            c0673Ek = this.A00.A0S;
            duration = c0673Ek.getDuration();
        }
        float totalForce = f2 + duration;
        z2 = this.A00.A0d;
        if (z2) {
            i2 = this.A00.A0F;
        } else {
            i2 = this.A00.A0E;
        }
        float seenTime = i2;
        float totalForce2 = totalForce / seenTime;
        interfaceC1456dm = this.A00.A0P;
        interfaceC1456dm.AKd(totalForce2);
    }
}

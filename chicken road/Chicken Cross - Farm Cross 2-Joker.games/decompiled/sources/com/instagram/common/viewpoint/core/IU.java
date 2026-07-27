package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class IU implements XN {
    public final /* synthetic */ C5S A00;

    public IU(C5S c5s) {
        this.A00 = c5s;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        InterfaceC2750dm interfaceC2750dm;
        int i;
        InterfaceC2750dm interfaceC2750dm2;
        interfaceC2750dm = this.A00.A0P;
        i = this.A00.A0F;
        interfaceC2750dm.ADc(i);
        interfaceC2750dm2 = this.A00.A0P;
        interfaceC2750dm2.ADA();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f) {
        int i;
        boolean z;
        C1967Ek c1967Ek;
        int duration;
        boolean z2;
        int i2;
        InterfaceC2750dm interfaceC2750dm;
        i = this.A00.A0F;
        float f2 = i - f;
        z = this.A00.A0d;
        if (z) {
            duration = 0;
        } else {
            c1967Ek = this.A00.A0S;
            duration = c1967Ek.getDuration();
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
        interfaceC2750dm = this.A00.A0P;
        interfaceC2750dm.AKd(totalForce2);
    }
}

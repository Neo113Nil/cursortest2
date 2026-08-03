package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0713Fz implements com.facebook.ads.redexgen.core.InterfaceC1400cs {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0712Fy A00;

    public C0713Fz(com.facebook.ads.redexgen.core.C0712Fy c0712Fy) {
        this.A00 = c0712Fy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400cs
    public final void AGW(android.view.View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400cs
    public final void AGY(android.view.View view) {
        com.facebook.ads.redexgen.core.AbstractC0797Jg abstractC0797Jg = (com.facebook.ads.redexgen.core.AbstractC0797Jg) view;
        abstractC0797Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((java.lang.Integer) abstractC0797Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}

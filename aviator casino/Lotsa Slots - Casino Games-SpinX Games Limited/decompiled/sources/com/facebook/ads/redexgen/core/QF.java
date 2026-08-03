package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QF implements com.facebook.ads.redexgen.core.InterfaceC1161Xr {
    public final com.facebook.ads.redexgen.core.C1160Xq A00;
    public final com.facebook.ads.redexgen.core.InterfaceC1161Xr A01;

    public QF(com.facebook.ads.redexgen.core.InterfaceC1161Xr interfaceC1161Xr, int i, int i2) {
        this.A01 = interfaceC1161Xr;
        this.A00 = new com.facebook.ads.redexgen.core.C1160Xq(i, i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1161Xr
    public final void AH8(java.lang.String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() == null) {
            return;
        }
        A08 = com.facebook.ads.redexgen.core.AbstractC1163Xt.A08(this.A00);
        if (A08) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1161Xr
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = com.facebook.ads.redexgen.core.AbstractC1163Xt.A08(this.A00);
            if (A08) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}

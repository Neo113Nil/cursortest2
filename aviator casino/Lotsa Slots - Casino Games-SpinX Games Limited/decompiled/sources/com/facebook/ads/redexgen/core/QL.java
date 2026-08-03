package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QL implements com.facebook.ads.redexgen.core.InterfaceC1161Xr {
    public int A00;
    public final com.facebook.ads.redexgen.core.InterfaceC1161Xr A01;
    public final com.facebook.ads.redexgen.core.InterfaceC1161Xr A02;

    public QL(com.facebook.ads.redexgen.core.InterfaceC1161Xr interfaceC1161Xr, int i, com.facebook.ads.redexgen.core.InterfaceC1161Xr interfaceC1161Xr2) {
        this.A01 = interfaceC1161Xr;
        this.A00 = i;
        this.A02 = interfaceC1161Xr2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1161Xr
    public final void AH8(java.lang.String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AH8(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1161Xr
    public final void flush() {
        this.A02.flush();
    }
}

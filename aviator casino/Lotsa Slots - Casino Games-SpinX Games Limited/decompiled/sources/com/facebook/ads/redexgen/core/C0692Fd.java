package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0692Fd implements com.facebook.ads.redexgen.core.InterfaceC1004Rk {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0998Re A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4T A01;

    public C0692Fd(com.facebook.ads.redexgen.core.C4T c4t, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        this.A01 = c4t;
        this.A00 = c0998Re;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1004Rk
    public final boolean AAI() {
        boolean A0j;
        boolean A0k;
        if (!this.A01.A0i()) {
            A0j = this.A01.A0j();
            if (A0j) {
                return true;
            }
            A0k = this.A01.A0k();
            return A0k;
        }
        this.A01.A0h(this.A00);
        return true;
    }
}

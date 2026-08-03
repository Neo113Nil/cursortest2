package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1702hn implements com.facebook.ads.redexgen.core.RR {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7M A00;

    public C1702hn(com.facebook.ads.redexgen.core.C7M c7m) {
        this.A00 = c7m;
    }

    @Override // com.facebook.ads.redexgen.core.RR
    public final void AH9(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.C0991Qx c0991Qx, com.facebook.ads.redexgen.core.C0991Qx c0991Qx2) {
        this.A00.A1l(rk, c0991Qx, c0991Qx2);
    }

    @Override // com.facebook.ads.redexgen.core.RR
    public final void AHB(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.C0991Qx c0991Qx, com.facebook.ads.redexgen.core.C0991Qx c0991Qx2) {
        this.A00.A0r.A0Y(rk);
        this.A00.A1m(rk, c0991Qx, c0991Qx2);
    }

    @Override // com.facebook.ads.redexgen.core.RR
    public final void AHD(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.C0991Qx c0991Qx, com.facebook.ads.redexgen.core.C0991Qx c0991Qx2) {
        rk.A0d(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0R(rk, rk, c0991Qx, c0991Qx2)) {
                this.A00.A1O();
            }
        } else {
            if (!this.A00.A05.A0Q(rk, c0991Qx, c0991Qx2)) {
                return;
            }
            this.A00.A1O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.RR
    public final void AKZ(com.facebook.ads.redexgen.core.RK rk) {
        this.A00.A06.A1F(rk.A0H, this.A00.A0r);
    }
}

package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0870Mb implements com.facebook.ads.redexgen.core.XN {
    public final /* synthetic */ com.facebook.ads.redexgen.core.MW A00;

    public C0870Mb(com.facebook.ads.redexgen.core.MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C0870Mb(com.facebook.ads.redexgen.core.MW mw, com.facebook.ads.redexgen.core.C0881Mm c0881Mm) {
        this(mw);
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        boolean z;
        com.facebook.ads.redexgen.core.C0908No c0908No;
        boolean z2;
        this.A00.A0D();
        atomicBoolean = this.A00.A0R;
        if (!atomicBoolean.get()) {
            z = this.A00.A0T;
            if (!z) {
                z2 = this.A00.A0D;
                if (z2) {
                    this.A00.A0U.setToolbarActionMode(0);
                    return;
                }
            }
            c0908No = this.A00.A0H;
            if (c0908No.A0V()) {
                this.A00.A0U.setToolbarActionMode(1);
            } else {
                this.A00.A0U.setToolbarActionMode(0);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        com.facebook.ads.redexgen.core.C0908No c0908No;
        com.facebook.ads.redexgen.core.C0908No c0908No2;
        c0908No = this.A00.A0H;
        if (c0908No.A0A() > 0) {
            c0908No2 = this.A00.A0H;
            if (f == c0908No2.A0A()) {
                this.A00.A0U.setToolbarActionMode(8);
            }
        }
    }
}

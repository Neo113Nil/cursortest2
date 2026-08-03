package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class X0 {
    public static final com.facebook.ads.redexgen.core.X0 A04 = new com.facebook.ads.redexgen.core.X0(new com.facebook.ads.redexgen.core.C0993Qz(), new com.facebook.ads.redexgen.core.C0989Qv());
    public final com.facebook.ads.redexgen.core.InterfaceC1143Wz A02;
    public final com.facebook.ads.redexgen.core.Y0 A03;
    public boolean A01 = true;
    public long A00 = -1;

    public X0(com.facebook.ads.redexgen.core.Y0 y0, com.facebook.ads.redexgen.core.InterfaceC1143Wz interfaceC1143Wz) {
        this.A03 = y0;
        this.A02 = interfaceC1143Wz;
    }

    public static com.facebook.ads.redexgen.core.X0 A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A5n();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        android.app.Activity lastResumedActivity = this.A02.A8M();
        boolean z = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (com.facebook.ads.redexgen.core.X0.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A5n() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}

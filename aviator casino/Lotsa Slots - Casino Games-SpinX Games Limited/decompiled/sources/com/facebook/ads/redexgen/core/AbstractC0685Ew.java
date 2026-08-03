package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0685Ew {
    public com.facebook.ads.redexgen.core.InterfaceC0684Ev A00;
    public com.facebook.ads.redexgen.core.F6 A01;

    public abstract boolean A0Y();

    public abstract com.facebook.ads.redexgen.core.C0686Ex A0b(com.facebook.ads.redexgen.core.InterfaceC05157p[] interfaceC05157pArr, com.facebook.ads.redexgen.core.C2026nW c2026nW, com.facebook.ads.redexgen.core.C2044no c2044no, com.facebook.ads.androidx.media3.common.Timeline timeline) throws com.facebook.ads.redexgen.core.AD;

    public abstract void A0c(java.lang.Object obj);

    public final com.facebook.ads.redexgen.core.F6 A00() {
        return (com.facebook.ads.redexgen.core.F6) com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(com.facebook.ads.redexgen.core.InterfaceC0684Ev interfaceC0684Ev, com.facebook.ads.redexgen.core.F6 f6) {
        this.A00 = interfaceC0684Ev;
        this.A01 = f6;
    }
}

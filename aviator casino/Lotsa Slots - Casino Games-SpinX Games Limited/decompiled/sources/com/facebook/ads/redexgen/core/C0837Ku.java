package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ku, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0837Ku implements com.facebook.ads.redexgen.core.YI {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1311bR A00;

    public C0837Ku(com.facebook.ads.redexgen.core.C1311bR c1311bR) {
        this.A00 = c1311bR;
    }

    @Override // com.facebook.ads.redexgen.core.YI
    public final void AFx() {
        boolean z;
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr;
        z = this.A00.A09;
        if (!z) {
            return;
        }
        viewOnClickListenerC0834Kr = this.A00.A08;
        viewOnClickListenerC0834Kr.performClick();
    }

    @Override // com.facebook.ads.redexgen.core.YI
    public final void AG8() {
        this.A00.A04();
    }
}

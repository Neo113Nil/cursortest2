package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ku, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2131Ku implements YI {
    public final /* synthetic */ C2605bR A00;

    public C2131Ku(C2605bR c2605bR) {
        this.A00 = c2605bR;
    }

    @Override // com.instagram.common.viewpoint.core.YI
    public final void AFx() {
        boolean z;
        ViewOnClickListenerC2128Kr viewOnClickListenerC2128Kr;
        z = this.A00.A09;
        if (!z) {
            return;
        }
        viewOnClickListenerC2128Kr = this.A00.A08;
        viewOnClickListenerC2128Kr.performClick();
    }

    @Override // com.instagram.common.viewpoint.core.YI
    public final void AG8() {
        this.A00.A04();
    }
}

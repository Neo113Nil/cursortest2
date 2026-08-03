package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C04193x extends com.facebook.ads.redexgen.core.E2 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0649Dm A00;

    public C04193x(com.facebook.ads.redexgen.core.C0649Dm c0649Dm) {
        this.A00 = c0649Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean A0G;
        android.os.Handler handler;
        int i;
        boolean z4;
        boolean A0G2;
        boolean z5;
        z = this.A00.A03;
        if (z) {
            z5 = this.A00.A02;
            if (z5) {
                return;
            }
        }
        z2 = this.A00.A05;
        if (!z2) {
            return;
        }
        z3 = this.A00.A04;
        if (!z3) {
            return;
        }
        this.A00.A05 = false;
        A0G = this.A00.A0G(com.facebook.ads.redexgen.core.EnumC1549fJ.A03);
        if (!A0G) {
            z4 = this.A00.A06;
            if (!z4) {
                A0G2 = this.A00.A0G(com.facebook.ads.redexgen.core.EnumC1549fJ.A02);
                if (!A0G2) {
                    return;
                }
                this.A00.A03();
                this.A00.A06(true, true);
                return;
            }
        }
        this.A00.A06 = false;
        handler = this.A00.A07;
        com.facebook.ads.redexgen.core.C0651Do c0651Do = new com.facebook.ads.redexgen.core.C0651Do(this);
        i = this.A00.A00;
        handler.postDelayed(c0651Do, i);
    }
}

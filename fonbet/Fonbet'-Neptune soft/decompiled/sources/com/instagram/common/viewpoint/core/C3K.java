package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C3K extends DP {
    public final /* synthetic */ D9 A00;

    public C3K(D9 d9) {
        this.A00 = d9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DQ dq) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean A0G;
        Handler handler;
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
        A0G = this.A00.A0G(EnumC1194e1.A03);
        if (!A0G) {
            z4 = this.A00.A06;
            if (!z4) {
                A0G2 = this.A00.A0G(EnumC1194e1.A02);
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
        DB db = new DB(this);
        i = this.A00.A00;
        handler.postDelayed(db, i);
    }
}

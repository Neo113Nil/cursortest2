package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2007Fz implements InterfaceC2694cs {
    public final /* synthetic */ C2006Fy A00;

    public C2007Fz(C2006Fy c2006Fy) {
        this.A00 = c2006Fy;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2694cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2694cs
    public final void AGY(View view) {
        AbstractC2091Jg abstractC2091Jg = (AbstractC2091Jg) view;
        abstractC2091Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC2091Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}

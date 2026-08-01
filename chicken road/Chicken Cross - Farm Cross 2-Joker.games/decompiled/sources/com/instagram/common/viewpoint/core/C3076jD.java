package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.jD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3076jD implements InterfaceC2328Sp {
    public final /* synthetic */ AbstractC3095jd A00;
    public final /* synthetic */ InterfaceC2207Nt A01;
    public final /* synthetic */ C2208Nu A02;
    public final /* synthetic */ C2930gi A03;
    public final /* synthetic */ boolean A04;

    public C3076jD(C2208Nu c2208Nu, C2930gi c2930gi, boolean z, AbstractC3095jd abstractC3095jd, InterfaceC2207Nt interfaceC2207Nt) {
        this.A02 = c2208Nu;
        this.A03 = c2930gi;
        this.A04 = z;
        this.A00 = abstractC3095jd;
        this.A01 = interfaceC2207Nt;
    }

    private void A00(boolean z) {
        ArrayList arrayList;
        if (z) {
            if (C2380Up.A1q(this.A03) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(AbstractC2715dD.A01(this.A03, this.A00, 1, new C3077jE(this)));
                return;
            } else {
                this.A01.ACp();
                return;
            }
        }
        this.A01.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2328Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2328Sp
    public final void ADT() {
        A00(true);
    }
}

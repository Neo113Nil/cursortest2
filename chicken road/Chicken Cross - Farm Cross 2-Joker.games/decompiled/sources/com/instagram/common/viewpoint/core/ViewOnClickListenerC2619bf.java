package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2619bf implements View.OnClickListener {
    public final /* synthetic */ C2622bi A00;

    public ViewOnClickListenerC2619bf(C2622bi c2622bi) {
        this.A00 = c2622bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2621bh interfaceC2621bh;
        AbstractC2465Yb abstractC2465Yb;
        List list;
        C1967Ek c1967Ek;
        C1967Ek c1967Ek2;
        C1967Ek c1967Ek3;
        AbstractC2465Yb abstractC2465Yb2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2621bh = this.A00.A05;
            interfaceC2621bh.AEm();
            abstractC2465Yb = this.A00.A00;
            if (abstractC2465Yb != null) {
                abstractC2465Yb2 = this.A00.A00;
                YB.A0L(abstractC2465Yb2);
            }
            list = this.A00.A07;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                YB.A0O((View) it.next(), 0);
            }
            YB.A0J(this.A00);
            c1967Ek = this.A00.A06;
            if (c1967Ek == null) {
                return;
            }
            c1967Ek2 = this.A00.A06;
            YB.A0O(c1967Ek2, 0);
            c1967Ek3 = this.A00.A06;
            c1967Ek3.A0e(EnumC2817et.A02, 14);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

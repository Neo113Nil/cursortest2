package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1325bf implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1328bi A00;

    public ViewOnClickListenerC1325bf(com.facebook.ads.redexgen.core.C1328bi c1328bi) {
        this.A00 = c1328bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.InterfaceC1327bh interfaceC1327bh;
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb;
        java.util.List list;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek2;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek3;
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            interfaceC1327bh = this.A00.A05;
            interfaceC1327bh.AEm();
            abstractC1171Yb = this.A00.A00;
            if (abstractC1171Yb != null) {
                abstractC1171Yb2 = this.A00.A00;
                com.facebook.ads.redexgen.core.YB.A0L(abstractC1171Yb2);
            }
            list = this.A00.A07;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.facebook.ads.redexgen.core.YB.A0O((android.view.View) it.next(), 0);
            }
            com.facebook.ads.redexgen.core.YB.A0J(this.A00);
            c0673Ek = this.A00.A06;
            if (c0673Ek == null) {
                return;
            }
            c0673Ek2 = this.A00.A06;
            com.facebook.ads.redexgen.core.YB.A0O(c0673Ek2, 0);
            c0673Ek3 = this.A00.A06;
            c0673Ek3.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 14);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}

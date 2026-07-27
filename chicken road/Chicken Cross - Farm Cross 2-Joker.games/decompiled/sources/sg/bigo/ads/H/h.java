package sg.bigo.ads.H;

import android.content.Context;
import sg.bigo.ads.Y0.D;
import sg.bigo.ads.api.popup.PopupAd;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.C5185l1;

/* loaded from: classes3.dex */
public final class h extends C5185l1 implements PopupAd {
    public h(sg.bigo.ads.P.j jVar) {
        super(jVar);
    }

    @Override // sg.bigo.ads.h.C5185l1, sg.bigo.ads.h.AbstractC5163f0
    public final Class B() {
        return A() ? ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.W.e())).o() ? sg.bigo.ads.B.c.class : s.class : q.class;
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0
    public final void a(Context context) {
        if (D.a(context, B(), this)) {
            return;
        }
        b(2004, 0, "This ad cannot be open");
    }
}

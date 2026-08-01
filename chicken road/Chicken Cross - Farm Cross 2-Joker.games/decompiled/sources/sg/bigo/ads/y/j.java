package sg.bigo.ads.y;

import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.E0.p;
import sg.bigo.ads.R;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.U.r;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.T;

/* loaded from: classes3.dex */
public final class j extends i {
    public TextView t;
    public TextView u;

    public j(sg.bigo.ads.C.l lVar, q qVar, r rVar) {
        super(lVar, qVar, rVar);
    }

    @Override // sg.bigo.ads.y.i
    public final void d(AbstractC5144a1 abstractC5144a1) {
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            this.t = (TextView) viewGroup.findViewById(R.id.inter_title);
            this.u = (TextView) this.l.findViewById(R.id.inter_description);
            TextView textView = this.t;
            if (textView != null) {
                T.a(textView, p.b(-234881024));
            }
            TextView textView2 = this.u;
            if (textView2 == null) {
                return;
            }
            T.a(textView2, p.b(-234881024));
        }
    }

    @Override // sg.bigo.ads.y.i
    public final int f() {
        return R.layout.bigo_ad_view_click_guide_1;
    }

    @Override // sg.bigo.ads.y.i
    public final boolean i() {
        r rVar = this.i;
        return rVar != null && rVar.b > 960;
    }
}

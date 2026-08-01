package sg.bigo.ads.B;

import android.app.Activity;
import android.view.View;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.n.AbstractC5391n;
import sg.bigo.ads.n.V0;
import sg.bigo.ads.n.W0;

/* loaded from: classes3.dex */
public final class c extends b {
    public W0 u;

    public c(Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.B.b, sg.bigo.ads.h.AbstractC5151c0
    public final int G() {
        return R.layout.bigo_ad_activity_popup_vpaid;
    }

    @Override // sg.bigo.ads.B.b, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void g(int i) {
        super.g(i);
        View findViewById = this.f12687a.findViewById(R.id.inter_container);
        View findViewById2 = this.f12687a.findViewById(R.id.media_layout);
        if (this.u == null) {
            this.u = AbstractC5391n.a(this.l, this.r, 0);
        }
        this.u.getClass();
        X.a(findViewById, new V0(findViewById, findViewById2));
        if (this.u == null) {
            this.u = AbstractC5391n.a(this.l, this.r, 0);
        }
        this.u.e(this.m);
    }
}

package sg.bigo.ads.m;

import android.view.ViewGroup;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* loaded from: classes3.dex */
public class o0 extends m0 {
    public o0(sg.bigo.ads.C.l lVar, sg.bigo.ads.T0.q qVar) {
        super(lVar, qVar);
    }

    @Override // sg.bigo.ads.m.m0, sg.bigo.ads.H.p
    public final void a(AdCountDownButton adCountDownButton, ViewGroup viewGroup, sg.bigo.ads.H.n nVar) {
        Integer a2;
        if (viewGroup == null) {
            return;
        }
        if (this.t == null) {
            this.t = new sg.bigo.ads.H.g();
        }
        sg.bigo.ads.H.g gVar = this.t;
        sg.bigo.ads.H.f fVar = gVar.e;
        int i = 0;
        if (fVar != null) {
            fVar.a();
            gVar.f = false;
        }
        sg.bigo.ads.H.g gVar2 = this.t;
        sg.bigo.ads.T0.q qVar = this.q;
        if (qVar != null && (a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.force_staying_time"))) != null) {
            i = a2.intValue();
        }
        gVar2.a(viewGroup, i, nVar);
    }
}

package sg.bigo.ads.n;

import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class Z0 extends W0 {
    public Z0(sg.bigo.ads.C.l lVar, sg.bigo.ads.T0.q qVar) {
        super(lVar, qVar);
    }

    @Override // sg.bigo.ads.n.W0
    public final sg.bigo.ads.K0.E g(ViewGroup viewGroup) {
        long j;
        View findViewById = viewGroup != null ? viewGroup.findViewById(R.id.inter_ad_info) : null;
        if (findViewById == null) {
            return null;
        }
        sg.bigo.ads.T0.q qVar = this.v;
        if (qVar != null) {
            j = (sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_show_time")) != null ? r0.intValue() : 0) * 1000;
        } else {
            j = 0;
        }
        return new Y0(this, j, findViewById, viewGroup);
    }
}

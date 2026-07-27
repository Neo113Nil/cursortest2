package sg.bigo.ads.m;

import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class n0 extends m0 {
    public n0(sg.bigo.ads.C.l lVar, sg.bigo.ads.T0.q qVar) {
        super(lVar, qVar);
    }

    @Override // sg.bigo.ads.m.m0, sg.bigo.ads.H.p
    public final void d(ViewGroup viewGroup) {
        View findViewById;
        super.d(viewGroup);
        if (!this.v || viewGroup == null || (findViewById = viewGroup.findViewById(R.id.inter_btn_cta)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }
}

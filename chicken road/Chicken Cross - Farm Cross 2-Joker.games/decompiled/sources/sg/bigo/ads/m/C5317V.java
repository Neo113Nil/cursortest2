package sg.bigo.ads.m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.u.C5485f;

/* renamed from: sg.bigo.ads.m.V, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5317V extends C5314S {
    public C5317V(sg.bigo.ads.C.l lVar, int i, sg.bigo.ads.T0.q qVar, C5485f c5485f, sg.bigo.ads.q.o oVar) {
        super(lVar, i, qVar, c5485f, oVar);
    }

    @Override // sg.bigo.ads.m.C5314S, sg.bigo.ads.m.AbstractC5325d
    public final void e(AbstractC5144a1 abstractC5144a1) {
        super.e(abstractC5144a1);
        if (this.e == null) {
            return;
        }
        View findViewById = this.k.findViewById(R.id.inter_btn_cta_layout);
        Button button = (Button) this.k.findViewById(R.id.inter_btn_cta);
        if (button == null) {
            return;
        }
        button.postDelayed(new RunnableC5316U(this, button, d(abstractC5144a1), findViewById), Math.max(1, 1) * 1000);
    }

    @Override // sg.bigo.ads.m.C5314S, sg.bigo.ads.m.AbstractC5325d
    public final int f() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_7;
    }

    @Override // sg.bigo.ads.m.C5314S, sg.bigo.ads.m.e0
    public final void g(AbstractC5144a1 abstractC5144a1) {
        super.g(abstractC5144a1);
        this.r.setVisibility(4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
        marginLayoutParams.topMargin = AbstractC4963u.a(this.l.getContext(), 0);
        this.l.setLayoutParams(marginLayoutParams);
    }
}

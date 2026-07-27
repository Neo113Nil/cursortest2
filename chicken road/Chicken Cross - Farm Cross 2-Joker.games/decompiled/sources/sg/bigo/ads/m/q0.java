package sg.bigo.ads.m;

import android.view.ViewGroup;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class q0 extends sg.bigo.ads.E0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0 f13097a;

    public q0(y0 y0Var) {
        this.f13097a = y0Var;
    }

    @Override // sg.bigo.ads.E0.k
    public final void a(int i) {
        Integer a2;
        Integer a3;
        ViewGroup viewGroup;
        y0 y0Var = this.f13097a;
        int intValue = (y0Var.j() || (y0Var instanceof z0) ? (a2 = sg.bigo.ads.K0.z.a(y0Var.e.a("multi_ads_endpage.guide_click"))) == null : (a2 = sg.bigo.ads.K0.z.a(y0Var.e.a("endpage.guide_click"))) == null) ? 0 : a2.intValue();
        if (intValue > 0) {
            int intValue2 = (y0Var.j() || (y0Var instanceof z0) ? (a3 = sg.bigo.ads.K0.z.a(y0Var.e.a("multi_ads_endpage.guide_click_timing"))) == null : (a3 = sg.bigo.ads.K0.z.a(y0Var.e.a("endpage.guide_click_timing"))) == null) ? 0 : a3.intValue();
            ViewGroup m = y0Var.m();
            ViewGroup viewGroup2 = (ViewGroup) y0Var.p.findViewById(R.id.inter_btn_cta_layout);
            if (m != null) {
                viewGroup = (ViewGroup) m.findViewById(R.id.inter_btn_cta_layout);
                m.setClipChildren(false);
            } else {
                viewGroup = null;
            }
            ViewGroup viewGroup3 = viewGroup;
            if (viewGroup2 != null) {
                y0Var.p.setClipChildren(false);
                viewGroup2.postDelayed(new r0(y0Var, intValue, viewGroup2, viewGroup3, m), intValue2 * 1000);
            }
        }
    }
}

package sg.bigo.ads.m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.E1;

/* loaded from: classes3.dex */
public final class z0 extends y0 {
    public boolean x;

    public z0(sg.bigo.ads.C.l lVar, sg.bigo.ads.T0.q qVar, sg.bigo.ads.q.o oVar) {
        super(lVar, qVar, oVar);
        this.x = false;
        this.u = false;
    }

    @Override // sg.bigo.ads.m.y0, sg.bigo.ads.h.O1
    public final boolean a(AbstractC5144a1 abstractC5144a1, ViewGroup viewGroup, ViewGroup viewGroup2, E1 e1, int i, int i2, int i3, View... viewArr) {
        return a(this.d, abstractC5144a1, viewGroup, viewGroup2, i, 13, i3, viewArr);
    }

    @Override // sg.bigo.ads.m.y0, sg.bigo.ads.m.AbstractC5325d
    public final void f(AbstractC5144a1 abstractC5144a1) {
        ViewGroup viewGroup;
        this.x = this.d.k.e.getResources().getDisplayMetrics().heightPixels <= 2000;
        super.f(abstractC5144a1);
        ViewGroup viewGroup2 = this.k;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundColor(0);
            ViewGroup viewGroup3 = (ViewGroup) this.k.findViewById(R.id.bigo_ad_bottom_privacy_content);
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
            ViewGroup viewGroup4 = (ViewGroup) this.k.findViewById(R.id.bigo_ad_inter_layout_end_page);
            if (viewGroup4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup4.getLayoutParams();
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            }
            String str = this.d.d.g;
            if (sg.bigo.ads.K0.I.a((CharSequence) str) || (viewGroup = this.j) == null) {
                return;
            }
            Context context = viewGroup.getContext();
            sg.bigo.ads.L0.C.a(context, this.j, new sg.bigo.ads.L0.C(str, context));
        }
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final boolean j() {
        return true;
    }

    @Override // sg.bigo.ads.m.y0
    public final int k() {
        return 13;
    }

    @Override // sg.bigo.ads.m.y0
    public final int l() {
        return 20;
    }

    @Override // sg.bigo.ads.m.y0
    public final int o() {
        return this.x ? 138 : 142;
    }

    @Override // sg.bigo.ads.m.y0
    public final void a(boolean z, boolean z2) {
        if (this.x) {
            if (z) {
                ViewGroup viewGroup = (ViewGroup) this.j.findViewById(R.id.bigo_ad_end_page_content);
                if (viewGroup != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                    marginLayoutParams.topMargin = AbstractC4963u.a(viewGroup.getContext(), 146);
                    viewGroup.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            }
            if (z2) {
                ViewGroup viewGroup2 = (ViewGroup) this.j.findViewById(R.id.bigo_ad_end_page_content);
                if (viewGroup2 != null) {
                    int a2 = AbstractC4963u.a(viewGroup2.getContext(), 10);
                    int a3 = AbstractC4963u.a(viewGroup2.getContext(), 20);
                    viewGroup2.setPadding(a3, a2, a3, a2);
                }
                View findViewById = this.j.findViewById(R.id.inter_icon);
                if (findViewById != null) {
                    findViewById.setTranslationY(AbstractC4963u.a(findViewById.getContext(), -80));
                }
            }
        }
    }
}

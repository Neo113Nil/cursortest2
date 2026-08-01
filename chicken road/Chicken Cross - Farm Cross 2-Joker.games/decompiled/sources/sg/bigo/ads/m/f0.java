package sg.bigo.ads.m;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.E1;

/* loaded from: classes3.dex */
public final class f0 extends y0 {
    public boolean A;
    public ViewGroup x;
    public final sg.bigo.ads.E.d y;
    public boolean z;

    public f0(sg.bigo.ads.C.l lVar, sg.bigo.ads.T0.q qVar, sg.bigo.ads.q.o oVar) {
        super(lVar, qVar, oVar);
        this.y = (sg.bigo.ads.E.d) lVar;
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("multi_ads_endpage.ad_component_layout"));
        this.o = a2 != null ? a2.intValue() : 0;
    }

    @Override // sg.bigo.ads.m.y0, sg.bigo.ads.h.O1
    public final boolean a(AbstractC5144a1 abstractC5144a1, ViewGroup viewGroup, ViewGroup viewGroup2, E1 e1, int i, int i2, int i3, View... viewArr) {
        sg.bigo.ads.C.l c = this.y.c(0);
        if (c != null) {
            a(c, abstractC5144a1, viewGroup, this.p, i, 13, i3, viewArr);
        } else {
            this.p.setVisibility(8);
        }
        sg.bigo.ads.C.l c2 = this.y.c(1);
        if (c2 != null) {
            a(c2, abstractC5144a1, viewGroup, this.x, i, 13, i3, viewArr);
        } else {
            this.x.setVisibility(8);
        }
        return true;
    }

    @Override // sg.bigo.ads.m.y0, sg.bigo.ads.m.AbstractC5325d
    public final void e(AbstractC5144a1 abstractC5144a1) {
        super.e(abstractC5144a1);
        a((Button) this.x.findViewById(R.id.inter_btn_cta), abstractC5144a1);
    }

    @Override // sg.bigo.ads.m.y0, sg.bigo.ads.m.AbstractC5325d
    public final int f() {
        return R.layout.bigo_ad_activity_interstitial_multi_mix_end;
    }

    @Override // sg.bigo.ads.m.y0
    public final int k() {
        return 13;
    }

    @Override // sg.bigo.ads.m.y0
    public final ViewGroup m() {
        return this.x;
    }

    @Override // sg.bigo.ads.m.y0
    public final sg.bigo.ads.C.l n() {
        sg.bigo.ads.E.d dVar = this.y;
        if (dVar != null) {
            return dVar.c(0);
        }
        return null;
    }

    @Override // sg.bigo.ads.m.y0
    public final void p() {
        ViewGroup viewGroup;
        sg.bigo.ads.d1.u uVar;
        super.p();
        if (this.z) {
            return;
        }
        ViewGroup viewGroup2 = this.x;
        View findViewWithTag = viewGroup2 != null ? viewGroup2.findViewWithTag(9) : null;
        if (this.q && findViewWithTag != null) {
            this.z = true;
            viewGroup = this.j;
            uVar = this.y.c(1);
        } else {
            if (findViewWithTag == null) {
                return;
            }
            this.z = true;
            viewGroup = this.j;
            uVar = AbstractC5144a1.p;
        }
        sg.bigo.ads.C.f.a(viewGroup, findViewWithTag, 13, uVar, this.r);
    }

    @Override // sg.bigo.ads.m.y0
    public final void a(boolean z) {
        super.a(z);
        if (this.A) {
            return;
        }
        this.A = true;
        if (z) {
            sg.bigo.ads.C.f.a(this.j, this.x, 13, this.y.c(1), this.r);
        } else {
            sg.bigo.ads.C.f.a(this.j, this.x, 13, AbstractC5144a1.p, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    @Override // sg.bigo.ads.m.y0, sg.bigo.ads.m.AbstractC5325d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AbstractC5144a1 abstractC5144a1) {
        ViewGroup viewGroup;
        int i;
        ViewGroup viewGroup2;
        super.f(abstractC5144a1);
        int i2 = this.o;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        viewGroup = this.k;
                        i = R.id.bigo_ad_end_stub_2_half_wrap;
                        this.x = (ViewGroup) ((ViewStub) viewGroup.findViewById(i)).inflate();
                        if (1 == this.o && (viewGroup2 = this.x) != null) {
                            ((ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams()).topMargin = AbstractC4963u.a(this.k.getContext(), 58);
                        }
                        y0.a((ViewGroup) this.x.findViewById(R.id.bigo_ad_inter_layout_end_page));
                    }
                }
            }
            ViewGroup viewGroup3 = (ViewGroup) ((ViewStub) this.k.findViewById(R.id.bigo_ad_end_stub_2_img_wrap)).inflate();
            this.x = viewGroup3;
            a(abstractC5144a1, viewGroup3, this.y.c(1));
            if (1 == this.o) {
                ((ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams()).topMargin = AbstractC4963u.a(this.k.getContext(), 58);
            }
            y0.a((ViewGroup) this.x.findViewById(R.id.bigo_ad_inter_layout_end_page));
        }
        viewGroup = this.k;
        i = R.id.bigo_ad_end_stub_2_all_wrap;
        this.x = (ViewGroup) ((ViewStub) viewGroup.findViewById(i)).inflate();
        if (1 == this.o) {
        }
        y0.a((ViewGroup) this.x.findViewById(R.id.bigo_ad_inter_layout_end_page));
    }
}

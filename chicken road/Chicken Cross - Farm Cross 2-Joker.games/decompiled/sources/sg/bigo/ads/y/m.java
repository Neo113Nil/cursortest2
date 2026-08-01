package sg.bigo.ads.y;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.U.r;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5204s;
import sg.bigo.ads.h.EnumC5207t;

/* loaded from: classes3.dex */
public final class m extends l {
    public IconListView w;

    public m(sg.bigo.ads.C.l lVar, q qVar, r rVar) {
        super(lVar, qVar, rVar);
    }

    @Override // sg.bigo.ads.y.l, sg.bigo.ads.y.i
    public final void a(int i, boolean z, boolean z2) {
        super.a(i, z, z2);
        q qVar = this.e;
        boolean z3 = true;
        if (qVar != null) {
            Integer a2 = z.a(qVar.a("layer.ad_component_clickable_switch"));
            if ((a2 != null ? a2.intValue() : 0) != 1) {
                z3 = false;
            }
        }
        View view = this.t;
        if (view != null) {
            sg.bigo.ads.C.f.a(view, 18);
            ViewGroup viewGroup = this.k;
            if (z3) {
                sg.bigo.ads.C.f.a(viewGroup, this.t, 8, this.d, i);
            } else {
                sg.bigo.ads.C.f.a(viewGroup, this.t, 8, AbstractC5144a1.p, 0);
            }
        }
        IconListView iconListView = this.w;
        if (iconListView != null) {
            List<sg.bigo.ads.v.g> items = iconListView.getItems();
            for (int i2 = 0; items != null && i2 < items.size(); i2++) {
                sg.bigo.ads.v.g gVar = items.get(i2);
                sg.bigo.ads.C.f.a(gVar.d, 26);
                sg.bigo.ads.C.f.a(this.k, gVar.d, 8, this.d, i);
                sg.bigo.ads.C.f.a(gVar.g, 26);
                sg.bigo.ads.C.f.a(this.k, gVar.g, 8, this.d, i);
            }
        }
    }

    @Override // sg.bigo.ads.y.l, sg.bigo.ads.y.i
    public final void d(AbstractC5144a1 abstractC5144a1) {
        IconListView iconListView;
        int i;
        super.d(abstractC5144a1);
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_description);
        EnumC5207t enumC5207t = EnumC5207t.f;
        enumC5207t.a(null, textView);
        IconListView iconListView2 = (IconListView) this.l.findViewById(R.id.inter_download_msg);
        this.w = iconListView2;
        iconListView2.a(this.j);
        if (A.a(this.w.getItems())) {
            iconListView = this.w;
            i = 8;
        } else {
            iconListView = this.w;
            i = 0;
        }
        iconListView.setVisibility(i);
        int a2 = AbstractC4963u.a(this.l.getContext(), 16);
        View view = this.t;
        if (view != null) {
            float f = a2;
            view.setBackground(AbstractC4962t.a(f, f, f, f, (Rect) null, -1));
            enumC5207t.a(this.t);
        }
        a(abstractC5144a1, this.v);
    }

    @Override // sg.bigo.ads.y.l, sg.bigo.ads.y.i
    public final int f() {
        return R.layout.bigo_ad_view_click_guide_3;
    }

    @Override // sg.bigo.ads.y.l
    public final EnumC5207t j() {
        return EnumC5207t.f;
    }

    @Override // sg.bigo.ads.y.l
    public final void a(AbstractC5144a1 abstractC5144a1, Rect rect) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.w.getLayoutParams();
        layoutParams.addRule(3, this.u.getId());
        layoutParams.addRule(2, 0);
        this.w.requestLayout();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.o.getLayoutParams();
        layoutParams2.addRule(12, 0);
        layoutParams2.addRule(3, (A.a(this.w.getItems()) ? this.u : this.w).getId());
        this.o.requestLayout();
        r a2 = a(abstractC5144a1);
        int a3 = AbstractC4963u.a(this.u.getContext(), 16);
        int width = rect.width();
        int height = rect.height();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.u.getLayoutParams();
        layoutParams3.addRule(2, 0);
        int i = a2.f12567a;
        int i2 = a2.b;
        int i3 = (int) (((width * 1.0f) * i2) / i);
        if (i3 <= height) {
            layoutParams3.height = i3;
        } else {
            int i4 = a3 * 2;
            layoutParams3.height = r.a(i, i2, width - i4, height - i4).b + i4;
            ((ViewGroup.MarginLayoutParams) this.n.getLayoutParams()).setMargins(a3, a3, a3, a3);
            this.n.requestLayout();
        }
        this.u.requestLayout();
    }

    @Override // sg.bigo.ads.y.l, sg.bigo.ads.y.i
    public final void a(AbstractC5204s abstractC5204s) {
        TextView textView;
        super.a(abstractC5204s);
        ViewGroup viewGroup = this.l;
        if (viewGroup == null || (textView = (TextView) viewGroup.findViewById(R.id.inter_company)) == null) {
            return;
        }
        textView.setTextColor(c(abstractC5204s));
    }
}

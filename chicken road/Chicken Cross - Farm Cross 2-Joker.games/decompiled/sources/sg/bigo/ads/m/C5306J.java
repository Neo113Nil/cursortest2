package sg.bigo.ads.m;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.EnumC5207t;
import sg.bigo.ads.h.Z0;

/* renamed from: sg.bigo.ads.m.J, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5306J extends C5305I {
    public IconListView v;

    public C5306J(sg.bigo.ads.C.l lVar, int i, sg.bigo.ads.T0.q qVar, sg.bigo.ads.q.o oVar) {
        super(lVar, i, qVar, oVar);
    }

    @Override // sg.bigo.ads.m.C5305I
    public final void a(int i) {
        TextView textView;
        super.a(i);
        EnumC5207t.f.a(this.u);
        ViewGroup viewGroup = this.k;
        if (viewGroup == null || (textView = (TextView) viewGroup.findViewById(R.id.inter_company)) == null) {
            return;
        }
        textView.setTextColor(i);
    }

    @Override // sg.bigo.ads.m.C5305I, sg.bigo.ads.m.AbstractC5325d
    public final int f() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_19;
    }

    @Override // sg.bigo.ads.m.C5305I
    public final EnumC5207t k() {
        return EnumC5207t.f;
    }

    @Override // sg.bigo.ads.m.C5305I, sg.bigo.ads.m.AbstractC5325d
    public final void a(int i, boolean z, boolean z2) {
        sg.bigo.ads.C.f.a(this.s, 5);
        sg.bigo.ads.C.f.a(this.t, 5);
        if (z) {
            sg.bigo.ads.C.f.a(this.j, this.s, 4, this.d, i);
            sg.bigo.ads.C.f.a(this.j, this.t, 4, this.d, i);
        } else {
            ViewGroup viewGroup = this.j;
            RoundedImageView roundedImageView = this.s;
            Z0 z0 = AbstractC5144a1.p;
            sg.bigo.ads.C.f.a(viewGroup, roundedImageView, 4, z0, 0);
            sg.bigo.ads.C.f.a(this.j, this.t, 4, z0, 0);
        }
        sg.bigo.ads.C.f.a(this.k, 9);
        ViewGroup viewGroup2 = this.j;
        if (z2) {
            sg.bigo.ads.C.f.a(viewGroup2, this.k, 4, this.d, i);
        } else {
            sg.bigo.ads.C.f.a(viewGroup2, this.k, 4, AbstractC5144a1.p, 0);
        }
        sg.bigo.ads.T0.q qVar = this.e;
        boolean z3 = true;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ad_component_clickable_switch"));
            if ((a2 != null ? a2.intValue() : 0) != 1) {
                z3 = false;
            }
        }
        View view = this.o;
        if (view != null) {
            sg.bigo.ads.C.f.a(view, 18);
            ViewGroup viewGroup3 = this.j;
            if (z3) {
                sg.bigo.ads.C.f.a(viewGroup3, this.o, 8, this.d, i);
            } else {
                sg.bigo.ads.C.f.a(viewGroup3, this.o, 8, AbstractC5144a1.p, 0);
            }
        }
        IconListView iconListView = this.v;
        if (iconListView != null) {
            List<sg.bigo.ads.v.g> items = iconListView.getItems();
            for (int i2 = 0; items != null && i2 < items.size(); i2++) {
                sg.bigo.ads.v.g gVar = items.get(i2);
                sg.bigo.ads.C.f.a(gVar.d, 26);
                sg.bigo.ads.C.f.a(this.j, gVar.d, 8, this.d, i);
                sg.bigo.ads.C.f.a(gVar.g, 26);
                sg.bigo.ads.C.f.a(this.j, gVar.g, 8, this.d, i);
            }
        }
    }

    @Override // sg.bigo.ads.m.C5305I, sg.bigo.ads.m.AbstractC5325d
    public final void f(AbstractC5144a1 abstractC5144a1) {
        IconListView iconListView;
        int i;
        super.f(abstractC5144a1);
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_description);
        EnumC5207t enumC5207t = EnumC5207t.f;
        enumC5207t.a(null, textView);
        IconListView iconListView2 = (IconListView) this.k.findViewById(R.id.inter_download_msg);
        this.v = iconListView2;
        iconListView2.a(this.i);
        if (sg.bigo.ads.K0.A.a(this.v.getItems())) {
            iconListView = this.v;
            i = 8;
        } else {
            iconListView = this.v;
            i = 0;
        }
        iconListView.setVisibility(i);
        int a2 = AbstractC4963u.a(this.k.getContext(), 16);
        View view = this.o;
        if (view != null) {
            float f = a2;
            view.setBackground(AbstractC4962t.a(f, f, f, f, (Rect) null, -1));
            enumC5207t.a(this.o);
        }
        a(abstractC5144a1, this.t);
    }

    @Override // sg.bigo.ads.m.C5305I
    public final void a(AbstractC5144a1 abstractC5144a1, Rect rect) {
        sg.bigo.ads.U.r a2 = a(abstractC5144a1);
        int a3 = AbstractC4963u.a(this.r.getContext(), 16);
        int width = rect.width();
        int height = rect.height();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.r.getLayoutParams();
        int i = a2.f12567a;
        int i2 = a2.b;
        int i3 = (int) (((width * 1.0f) * i2) / i);
        if (i3 <= height) {
            layoutParams.height = i3;
        } else {
            int i4 = a3 * 2;
            layoutParams.height = sg.bigo.ads.U.r.a(i, i2, width - i4, height - i4).b + i4;
            ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).setMargins(a3, a3, a3, a3);
            this.s.requestLayout();
        }
        this.r.requestLayout();
    }
}

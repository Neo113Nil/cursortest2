package sg.bigo.ads.y;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.U.r;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5204s;
import sg.bigo.ads.h.EnumC5207t;

/* loaded from: classes3.dex */
public class l extends i {
    public View t;
    public View u;
    public RoundedImageView v;

    public l(sg.bigo.ads.C.l lVar, q qVar, r rVar) {
        super(lVar, qVar, rVar);
    }

    @Override // sg.bigo.ads.y.i
    public void a(int i, boolean z, boolean z2) {
        super.a(i, z, z2);
        sg.bigo.ads.C.f.a(this.v, 5);
        RoundedImageView roundedImageView = this.v;
        if (roundedImageView != null) {
            if (z) {
                sg.bigo.ads.C.f.a(this.k, roundedImageView, 10, this.d, i);
            } else {
                sg.bigo.ads.C.f.a(this.k, roundedImageView, 10, AbstractC5144a1.p, 0);
            }
        }
    }

    @Override // sg.bigo.ads.y.i
    public final void b(AbstractC5204s abstractC5204s) {
        super.b(abstractC5204s);
        RoundedImageView roundedImageView = this.n;
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(AbstractC4963u.a(roundedImageView.getContext(), 8));
        }
    }

    @Override // sg.bigo.ads.h.O1
    public final boolean d() {
        InterfaceC5087a interfaceC5087a;
        sg.bigo.ads.C.l lVar = this.d;
        if (lVar == null || (interfaceC5087a = (InterfaceC5087a) lVar.e()) == null) {
            return true;
        }
        return ((sg.bigo.ads.U0.k) interfaceC5087a).p();
    }

    @Override // sg.bigo.ads.y.i
    public int f() {
        return R.layout.bigo_ad_view_click_guide_2;
    }

    @Override // sg.bigo.ads.y.i
    public final void g() {
        super.g();
        EnumC5207t j = j();
        RoundedImageView roundedImageView = this.m;
        j.getClass();
        if (roundedImageView == null) {
            return;
        }
        roundedImageView.setCornerRadius(AbstractC4963u.a(roundedImageView.getContext(), 8));
    }

    @Override // sg.bigo.ads.y.i
    public final boolean i() {
        return false;
    }

    public EnumC5207t j() {
        return EnumC5207t.i;
    }

    public void a(AbstractC5144a1 abstractC5144a1, Rect rect) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.o.getLayoutParams();
        layoutParams.addRule(12, 0);
        layoutParams.addRule(3, this.u.getId());
        this.o.requestLayout();
        r a2 = a(abstractC5144a1);
        int a3 = AbstractC4963u.a(this.u.getContext(), 16);
        int width = rect.width();
        int height = rect.height();
        int i = a3 * 2;
        int i2 = width - i;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.u.getLayoutParams();
        layoutParams2.addRule(2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
        r a4 = r.a(a2.f12567a, a2.b, width, height - i);
        r a5 = r.a(a2.f12567a, a2.b, i2, height);
        int i3 = a4.f12567a;
        int i4 = a4.b;
        int i5 = i3 * i4;
        int i6 = a5.f12567a;
        int i7 = a5.b;
        if (i5 > i6 * i7) {
            layoutParams2.width = i3;
            layoutParams2.height = i4 + i;
            marginLayoutParams.topMargin = a3;
            marginLayoutParams.bottomMargin = a3;
            marginLayoutParams2.leftMargin = a3;
            marginLayoutParams2.rightMargin = a3;
        } else {
            layoutParams2.width = i6 + i;
            layoutParams2.height = i7;
            marginLayoutParams.leftMargin = a3;
            marginLayoutParams.rightMargin = a3;
            marginLayoutParams2.topMargin = a3;
            marginLayoutParams2.bottomMargin = a3;
        }
        this.n.requestLayout();
        this.v.requestLayout();
        this.u.requestLayout();
    }

    @Override // sg.bigo.ads.y.i
    public void d(AbstractC5144a1 abstractC5144a1) {
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            return;
        }
        this.t = viewGroup.findViewById(R.id.inter_click_guide_container);
        this.u = this.l.findViewById(R.id.inter_click_guide_image_layout);
        this.v = (RoundedImageView) this.l.findViewById(R.id.inter_click_guide_image_background);
        this.v.setCornerRadius(AbstractC4963u.a(this.l.getContext(), 8));
        this.v.setBackgroundColor(654311423);
        X.a(this.u, new k(this, (AbstractC5204s) abstractC5144a1));
        j().getClass();
    }

    @Override // sg.bigo.ads.y.i
    public void a(AbstractC5204s abstractC5204s) {
        super.a(abstractC5204s);
        j().a(this.o);
    }
}

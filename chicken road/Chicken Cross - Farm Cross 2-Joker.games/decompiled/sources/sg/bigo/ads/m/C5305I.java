package sg.bigo.ads.m;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.EnumC5207t;
import sg.bigo.ads.h.Z0;

/* renamed from: sg.bigo.ads.m.I, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5305I extends AbstractC5325d {
    public View o;
    public RoundedImageView p;
    public TextView q;
    public View r;
    public RoundedImageView s;
    public RoundedImageView t;
    public Button u;

    public C5305I(sg.bigo.ads.C.l lVar, int i, sg.bigo.ads.T0.q qVar, sg.bigo.ads.q.o oVar) {
        super(lVar, qVar, oVar);
    }

    public void a(int i) {
        Button button = (Button) this.k.findViewById(R.id.inter_btn_cta);
        this.u = button;
        if (button != null) {
            float a2 = AbstractC4963u.a(this.k.getContext(), 8);
            this.u.setBackground(AbstractC4962t.a(a2, a2, a2, a2, (Rect) null, i));
            sg.bigo.ads.h.T.a(this.u, sg.bigo.ads.E0.p.b(i));
            k().a(this.u);
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

    @Override // sg.bigo.ads.h.O1
    public final boolean e() {
        return true;
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public int f() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_18;
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void h() {
        String str = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.d.e())).L;
        TextView textView = (TextView) this.k.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }

    public EnumC5207t k() {
        return EnumC5207t.i;
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public void a(int i, boolean z, boolean z2) {
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
        if (z2) {
            sg.bigo.ads.C.f.a(this.j, this.k, 4, this.d, i);
        } else {
            sg.bigo.ads.C.f.a(this.j, this.k, 4, AbstractC5144a1.p, 0);
        }
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public void f(AbstractC5144a1 abstractC5144a1) {
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            return;
        }
        this.o = viewGroup.findViewById(R.id.inter_end_page);
        this.p = (RoundedImageView) this.k.findViewById(R.id.inter_icon);
        this.q = (TextView) this.k.findViewById(R.id.inter_title);
        EnumC5207t k = k();
        RoundedImageView roundedImageView = this.p;
        k.getClass();
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(AbstractC4963u.a(roundedImageView.getContext(), 8));
        }
        k().a(this.q, null);
        this.r = this.k.findViewById(R.id.inter_end_page_image_layout);
        this.s = (RoundedImageView) this.k.findViewById(R.id.inter_end_page_image);
        this.t = (RoundedImageView) this.k.findViewById(R.id.inter_end_page_image_background);
        float a2 = AbstractC4963u.a(this.s.getContext(), 8);
        this.s.setCornerRadius(a2);
        this.t.setCornerRadius(a2);
        this.t.setBackgroundColor(654311423);
        sg.bigo.ads.K0.X.a(this.r, new C5303G(this, abstractC5144a1));
        a(c(abstractC5144a1));
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void a(View view) {
        View findViewById;
        if (view == null || this.f == null || (findViewById = view.findViewById(R.id.inter_ad_tag_layout)) == null) {
            return;
        }
        this.f.a(findViewById, 0);
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void a(double d) {
        TextView textView;
        int i;
        if (d <= 3.0d) {
            textView = this.l;
            if (textView == null) {
                return;
            } else {
                i = -14671580;
            }
        } else {
            textView = this.l;
            if (textView == null) {
                return;
            } else {
                i = -1;
            }
        }
        textView.setTextColor(sg.bigo.ads.E0.p.a(i, (int) 153.0f));
    }

    public void a(AbstractC5144a1 abstractC5144a1, Rect rect) {
        sg.bigo.ads.U.r a2 = a(abstractC5144a1);
        int a3 = AbstractC4963u.a(this.r.getContext(), 16);
        int width = rect.width();
        int height = rect.height();
        int i = a3 * 2;
        int i2 = width - i;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.r.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
        sg.bigo.ads.U.r a4 = sg.bigo.ads.U.r.a(a2.f12567a, a2.b, width, height - i);
        sg.bigo.ads.U.r a5 = sg.bigo.ads.U.r.a(a2.f12567a, a2.b, i2, height);
        int i3 = a4.f12567a;
        int i4 = a4.b;
        int i5 = i3 * i4;
        int i6 = a5.f12567a;
        int i7 = a5.b;
        if (i5 > i6 * i7) {
            layoutParams.width = i3;
            layoutParams.height = i4 + i;
            marginLayoutParams.topMargin = a3;
            marginLayoutParams.bottomMargin = a3;
            marginLayoutParams2.leftMargin = a3;
            marginLayoutParams2.rightMargin = a3;
        } else {
            layoutParams.width = i6 + i;
            layoutParams.height = i7;
            marginLayoutParams.leftMargin = a3;
            marginLayoutParams.rightMargin = a3;
            marginLayoutParams2.topMargin = a3;
            marginLayoutParams2.bottomMargin = a3;
        }
        this.r.requestLayout();
        this.s.requestLayout();
        this.t.requestLayout();
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void a(RunnableC5324c runnableC5324c) {
        AbstractC5140Q.a(this.k, this.j, new RunnableC5304H(this, runnableC5324c));
    }
}

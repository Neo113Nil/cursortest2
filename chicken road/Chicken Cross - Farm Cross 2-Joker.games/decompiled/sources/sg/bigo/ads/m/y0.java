package sg.bigo.ads.m;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.E1;
import sg.bigo.ads.h.EnumC5207t;
import sg.bigo.ads.w.InterfaceC5495a;

/* loaded from: classes3.dex */
public class y0 extends AbstractC5325d {
    public int o;
    public ViewGroup p;
    public boolean q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public View v;
    public s0 w;

    public y0(sg.bigo.ads.C.l lVar, sg.bigo.ads.T0.q qVar, sg.bigo.ads.q.o oVar) {
        super(lVar, qVar, oVar);
        this.u = false;
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ep_sprt"));
        this.u = 1 == (a2 != null ? a2.intValue() : 0);
        Integer a3 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ad_component_layout"));
        this.o = a3 != null ? a3.intValue() : 0;
    }

    public static void a(y0 y0Var, ViewGroup viewGroup) {
        y0Var.getClass();
        ViewGroup viewGroup2 = (ViewGroup) new WeakReference(viewGroup).get();
        if (viewGroup2 != null) {
            View a2 = AbstractC4944a.a(viewGroup2.getContext(), R.layout.bigo_ad_endpage_cta_click_guide, viewGroup2, false);
            if (a2 != null) {
                viewGroup2.addView(a2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2.getLayoutParams();
                layoutParams.gravity = 8388693;
                layoutParams.bottomMargin = -AbstractC4963u.a(viewGroup2.getContext(), 30);
                a2.setLayoutParams(layoutParams);
                View findViewById = a2.findViewById(R.id.click_gesture);
                View findViewById2 = a2.findViewById(R.id.click_ripple);
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 10.0f, 1, 0.5f, 1, 0.6f);
                rotateAnimation.setDuration(200L);
                rotateAnimation.setStartOffset(560L);
                rotateAnimation.setFillAfter(true);
                RotateAnimation rotateAnimation2 = new RotateAnimation(10.0f, 0.0f, 1, 0.5f, 1, 0.6f);
                rotateAnimation2.setDuration(240L);
                rotateAnimation2.setFillAfter(true);
                AnimationSet animationSet = new AnimationSet(false);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 5.0f, 1.0f, 5.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(400L);
                scaleAnimation.setInterpolator(AbstractC4954k.a(2));
                scaleAnimation.setFillAfter(true);
                animationSet.addAnimation(scaleAnimation);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(400L);
                scaleAnimation.setInterpolator(AbstractC4954k.a(2));
                alphaAnimation.setFillAfter(true);
                animationSet.addAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(new v0(findViewById2));
                rotateAnimation.setAnimationListener(new w0(findViewById, rotateAnimation2));
                rotateAnimation2.setAnimationListener(new x0(findViewById, rotateAnimation, findViewById2, animationSet));
                findViewById.startAnimation(rotateAnimation);
            }
        }
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void a(double d) {
    }

    public void a(boolean z, boolean z2) {
    }

    @Override // sg.bigo.ads.h.W
    public final void b() {
        super.b();
        s0 s0Var = this.w;
        if (s0Var == null || !s0Var.b()) {
            return;
        }
        this.w.e();
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public void e(AbstractC5144a1 abstractC5144a1) {
        a((Button) this.p.findViewById(R.id.inter_btn_cta), abstractC5144a1);
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public int f() {
        return R.layout.bigo_ad_activity_interstitial_multi_single_end;
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void h() {
        AdOptionsView adOptionsView;
        if (n() == null || this.k == null) {
            return;
        }
        String str = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) n().e())).L;
        TextView textView = (TextView) this.k.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.k.findViewById(R.id.inter_ad_label);
        if (textView != null && textView2 != null) {
            textView.setVisibility(8);
            if (!TextUtils.isEmpty(str)) {
                textView2.setText(AbstractC4944a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]) + " · " + str);
            }
        }
        TextView textView3 = this.l;
        if (textView3 != null) {
            textView3.setText(n().getWarning());
        }
        ViewGroup viewGroup = this.k;
        if (viewGroup == null || (adOptionsView = (AdOptionsView) viewGroup.findViewById(R.id.inter_options)) == null) {
            return;
        }
        adOptionsView.setTag(4);
        adOptionsView.a(n().e(), ((sg.bigo.ads.U0.b) ((InterfaceC5087a) n().e())).O);
    }

    public int k() {
        return this.u ? 14 : 4;
    }

    public int l() {
        return 40;
    }

    public ViewGroup m() {
        return null;
    }

    public sg.bigo.ads.C.l n() {
        return this.d;
    }

    public int o() {
        return 142;
    }

    public void p() {
        ViewGroup viewGroup;
        int k;
        sg.bigo.ads.d1.u uVar;
        if (this.s) {
            return;
        }
        View findViewWithTag = this.p.findViewWithTag(9);
        if (this.q && findViewWithTag != null) {
            this.s = true;
            viewGroup = this.j;
            k = k();
            uVar = n();
        } else {
            if (findViewWithTag == null) {
                return;
            }
            this.s = true;
            viewGroup = this.j;
            k = k();
            uVar = AbstractC5144a1.p;
        }
        sg.bigo.ads.C.f.a(viewGroup, findViewWithTag, k, uVar, this.r);
    }

    @Override // sg.bigo.ads.h.O1
    public boolean a(AbstractC5144a1 abstractC5144a1, ViewGroup viewGroup, ViewGroup viewGroup2, E1 e1, int i, int i2, int i3, View... viewArr) {
        if (!this.u) {
            return super.a(abstractC5144a1, viewGroup, viewGroup2, (E1) null, i, 4, i3, viewArr);
        }
        View view = this.p;
        if (view == null) {
            view = this.v;
        }
        return a(this.d, abstractC5144a1, viewGroup, view, i, k(), i3, viewArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.m.AbstractC5325d
    public void f(AbstractC5144a1 abstractC5144a1) {
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            int i = this.o;
            if (i != 2) {
                if (i == 3 || i == 4) {
                    ViewGroup viewGroup2 = (ViewGroup) ((ViewStub) viewGroup.findViewById(R.id.bigo_ad_end_stub_1_img_wrap)).inflate();
                    this.p = viewGroup2;
                    a(abstractC5144a1, viewGroup2, n());
                } else if (i != 5) {
                    this.p = (ViewGroup) ((ViewStub) viewGroup.findViewById(R.id.bigo_ad_end_stub_1_half_wrap)).inflate();
                    a(false, true);
                }
                a((ViewGroup) this.p.findViewById(R.id.bigo_ad_inter_layout_end_page));
            }
            this.p = (ViewGroup) ((ViewStub) viewGroup.findViewById(R.id.bigo_ad_end_stub_1_all_wrap)).inflate();
            a((ViewGroup) this.p.findViewById(R.id.bigo_ad_inter_layout_end_page));
        }
        KeyEvent.Callback callback = this.k;
        if (callback == null) {
            callback = this.v;
        }
        int i2 = this.v == null ? 11 : 5;
        if (this.u) {
            i2 = 12;
        }
        int i3 = ((this instanceof f0) || (this instanceof z0)) ? 13 : i2;
        if (abstractC5144a1 instanceof sg.bigo.ads.w.b) {
            ((sg.bigo.ads.w.b) abstractC5144a1).d(i3);
        } else if (abstractC5144a1 instanceof InterfaceC5495a) {
            ((InterfaceC5495a) abstractC5144a1).c(i3);
        }
        if (i3 == 12 || i3 == 13) {
            sg.bigo.ads.s1.b.a(n().e(), i3, 2);
        }
        if (abstractC5144a1 == 0 || callback == null) {
            return;
        }
        if (!(abstractC5144a1 instanceof InterfaceC5495a) || this.u) {
            s0 s0Var = new s0(this, (sg.bigo.ads.K0.z.a(this.e.a("endpage.force_staying_time")) != null ? r0.intValue() : 3) * 1000, abstractC5144a1, i3);
            this.w = s0Var;
            s0Var.e();
        }
    }

    public void a(boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int k;
        sg.bigo.ads.d1.u uVar;
        int i;
        if (this.t) {
            return;
        }
        this.t = true;
        if (z) {
            viewGroup = this.j;
            viewGroup2 = this.p;
            k = k();
            uVar = n();
            i = this.r;
        } else {
            viewGroup = this.j;
            viewGroup2 = this.p;
            k = k();
            uVar = AbstractC5144a1.p;
            i = 0;
        }
        sg.bigo.ads.C.f.a(viewGroup, viewGroup2, k, uVar, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if ((r5 != null ? r5.intValue() : 0) == 1) goto L20;
     */
    @Override // sg.bigo.ads.m.AbstractC5325d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, boolean z, boolean z2) {
        this.q = z;
        this.r = i;
        this.k.setTag(34);
        boolean z3 = false;
        ViewGroup viewGroup = this.j;
        if (z2) {
            sg.bigo.ads.C.f.a(viewGroup, this.k, k(), n(), this.r);
        } else {
            sg.bigo.ads.C.f.a(viewGroup, this.k, k(), AbstractC5144a1.p, 0);
        }
        p();
        String str = (j() || (this instanceof z0)) ? "multi_ads_endpage.ad_component_clickable_switch" : "endpage.ad_component_clickable_switch";
        sg.bigo.ads.T0.q qVar = this.e;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a(str));
        }
        z3 = true;
        a(z3);
    }

    public final void a(Button button, AbstractC5144a1 abstractC5144a1) {
        Integer a2;
        int i;
        if (button == null || abstractC5144a1 == null) {
            return;
        }
        int intValue = ((this instanceof f0) || (this instanceof z0) ? (a2 = sg.bigo.ads.K0.z.a(this.e.a("multi_ads_endpage.cta_color"))) == null : (a2 = sg.bigo.ads.K0.z.a(this.e.a("endpage.cta_color"))) == null) ? 0 : a2.intValue();
        if (intValue == 2) {
            i = -14972829;
        } else {
            if (intValue == 3) {
                sg.bigo.ads.C.l n = n();
                boolean z = n.S;
                if ((!z ? null : n.U) != null) {
                    i = (z ? n.U : null).intValue();
                }
            }
            i = -16736769;
        }
        sg.bigo.ads.h.T.a(button, i, new q0(this));
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void a(View view) {
        if (view == null || this.f == null) {
            return;
        }
        View findViewById = view.findViewById(R.id.bigo_ad_bottom_privacy_content);
        View findViewById2 = view.findViewById(R.id.inter_options);
        this.f.a(findViewById, 0);
        this.f.a(findViewById2, 0);
    }

    public final void a(AbstractC5144a1 abstractC5144a1, ViewGroup viewGroup, sg.bigo.ads.C.l lVar) {
        a(true, false);
        if (viewGroup == null || abstractC5144a1 == null || lVar == null) {
            return;
        }
        int a2 = AbstractC4963u.a(viewGroup.getContext(), 16);
        RoundedImageView roundedImageView = new RoundedImageView(viewGroup.getContext());
        roundedImageView.setCornerRadius(a2);
        int c = AbstractC4963u.c(roundedImageView.getContext()) - AbstractC4963u.a(roundedImageView.getContext(), l());
        int a3 = AbstractC4963u.a(roundedImageView.getContext(), o());
        roundedImageView.setLayoutParams(new FrameLayout.LayoutParams(c, a3));
        roundedImageView.setTag(9);
        AbstractC5164f1.a(lVar, new u0(this, c, a3, roundedImageView, viewGroup, a2));
    }

    public static void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int a2 = AbstractC4963u.a(viewGroup.getContext(), 16);
            RoundedImageView roundedImageView = (RoundedImageView) viewGroup.findViewById(R.id.inter_icon);
            if (roundedImageView != null) {
                roundedImageView.setCornerRadius(a2);
            }
            float f = a2;
            viewGroup.setBackground(AbstractC4962t.a(f, f, f, f, (Rect) null, -1));
            EnumC5207t.f.a(viewGroup);
        }
    }

    @Override // sg.bigo.ads.h.W
    public final void a() {
        super.a();
        s0 s0Var = this.w;
        if (s0Var == null || s0Var.b()) {
            return;
        }
        this.w.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // sg.bigo.ads.m.AbstractC5325d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View a(AbstractC5144a1 abstractC5144a1, ViewGroup viewGroup, int i) {
        View b;
        View view;
        if (abstractC5144a1 == 0 || viewGroup == null) {
            return this.j;
        }
        this.j = viewGroup;
        if (!(abstractC5144a1 instanceof sg.bigo.ads.w.b)) {
            if (abstractC5144a1 instanceof InterfaceC5495a) {
                b = ((InterfaceC5495a) abstractC5144a1).b();
            }
            view = this.v;
            if (view != null) {
                return super.a(abstractC5144a1, viewGroup, i);
            }
            this.j.addView(view, new ViewGroup.LayoutParams(-1, -1));
            f(abstractC5144a1);
            return this.v;
        }
        b = ((sg.bigo.ads.w.b) abstractC5144a1).b();
        this.v = b;
        view = this.v;
        if (view != null) {
        }
    }
}

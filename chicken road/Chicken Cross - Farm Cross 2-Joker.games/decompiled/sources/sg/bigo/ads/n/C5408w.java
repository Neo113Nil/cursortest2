package sg.bigo.ads.n;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.e0.C5085c;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.EnumC5207t;
import sg.bigo.ads.h.F1;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.t.InterfaceC5477g;

/* renamed from: sg.bigo.ads.n.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5408w extends AbstractC5391n implements InterfaceC5477g {
    public RelativeLayout C;
    public RealtimeBlurLinearLayout D;
    public Button E;
    public RoundedFrameLayout F;
    public MediaView G;
    public TextView H;
    public TextView I;
    public Button J;
    public Button K;
    public RoundedImageView L;
    public int M;
    public int N;
    public int O;
    public boolean P;

    public C5408w(sg.bigo.ads.C.l lVar) {
        super(lVar);
        this.O = -1;
        this.P = false;
    }

    public final void A() {
        Button button;
        if (this.u == null || (button = this.E) == null || button.getVisibility() != 0) {
            return;
        }
        float translationY = this.E.getTranslationY();
        RectF rectF = new RectF(sg.bigo.ads.K0.X.a(this.E, this.N));
        rectF.offset(0.0f, -translationY);
        float f = rectF.top;
        RectF rectF2 = new RectF(sg.bigo.ads.K0.X.a(this.z, 0));
        float f2 = rectF2.top;
        if (rectF2.intersect(rectF)) {
            rectF.offset(0.0f, f2 - rectF.bottom);
        }
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.D;
        if (realtimeBlurLinearLayout != null && realtimeBlurLinearLayout.getVisibility() == 0) {
            RectF rectF3 = new RectF(sg.bigo.ads.K0.X.a(this.D, 0));
            float f3 = rectF3.top;
            if (rectF3.intersect(rectF)) {
                rectF.offset(0.0f, f3 - rectF.bottom);
            }
        }
        float f4 = rectF.top;
        if (f4 != f) {
            this.E.setTranslationY(f4 - f);
        } else {
            this.E.setTranslationY(0.0f);
        }
    }

    public void B() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.D;
        if (realtimeBlurLinearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.M;
            this.D.requestLayout();
        }
    }

    public void C() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.D;
        if (realtimeBlurLinearLayout == null || this.u == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -(this.u.getMeasuredHeight() - sg.bigo.ads.K0.X.a(this.u, this.D).y);
            this.D.requestLayout();
        }
    }

    public final void D() {
        if (o()) {
            Button button = this.J;
            if (button != null) {
                AbstractC5140Q.a(button);
            }
            Button button2 = this.K;
            if (button2 != null) {
                AbstractC5140Q.a(button2);
            }
        }
    }

    @Override // sg.bigo.ads.h.F1
    public final void a(ViewGroup viewGroup, View view, int i, int i2, int i3, View... viewArr) {
        super.a(viewGroup, view, i, i2, i3, viewArr);
        x();
        F1.b((View) this.u);
    }

    public void b(EnumC5207t enumC5207t) {
        float a2 = AbstractC4963u.a(this.D.getContext(), 8);
        Button button = (Button) this.D.findViewById(R.id.inter_btn_cta_main);
        this.K = button;
        if (button != null) {
            button.setBackground(AbstractC4962t.a(a2, a2, a2, a2, (Rect) null, -16724924));
            enumC5207t.a(this.K);
        }
        Button button2 = (Button) this.D.findViewById(R.id.inter_btn_cta);
        this.J = button2;
        if (button2 != null) {
            button2.setBackground(AbstractC4962t.a(a2, a2, a2, a2, (Rect) null, 0));
            enumC5207t.a(this.J);
        }
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final MediaView k() {
        return this.G;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final ViewGroup m() {
        return this.F;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final Button n() {
        return this.E;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final boolean p() {
        return true;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public void q() {
        sg.bigo.ads.M0.b bVar;
        Integer a2;
        Integer a3;
        Integer a4;
        this.C = (RelativeLayout) this.u.findViewById(R.id.inter_media_component);
        this.E = (Button) this.u.findViewById(R.id.inter_btn_mute);
        this.F = (RoundedFrameLayout) this.u.findViewById(R.id.inter_media_layout);
        this.G = (MediaView) this.u.findViewById(R.id.inter_media);
        this.N = AbstractC4963u.a(this.E.getContext(), 12);
        this.G.setImageBlurBorder(false);
        sg.bigo.ads.K0.X.a(this.F, new ViewTreeObserverOnGlobalLayoutListenerC5393o(this));
        sg.bigo.ads.T0.q qVar = this.x;
        int intValue = (qVar == null || (a4 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_colour"))) == null) ? 2 : a4.intValue();
        EnumC5207t enumC5207t = intValue != 1 ? intValue != 3 ? ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.d.e())).p() ? EnumC5207t.g : EnumC5207t.i : ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.d.e())).p() ? EnumC5207t.h : EnumC5207t.j : EnumC5207t.f;
        a(enumC5207t);
        b(enumC5207t);
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.D;
        if (realtimeBlurLinearLayout == null) {
            return;
        }
        int a5 = AbstractC4963u.a(realtimeBlurLinearLayout.getContext(), 12);
        if (((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.d.e())).p()) {
            if (this.D != null) {
                int ordinal = enumC5207t.ordinal();
                if (ordinal != 0) {
                    a((ordinal == 2 && (a3 = AbstractC5164f1.a((NativeAd) this.d)) != null) ? sg.bigo.ads.E0.p.a(a3.intValue(), (int) 127.5f) : sg.bigo.ads.E0.p.a(-12303292, (int) 127.5f), sg.bigo.ads.E0.p.a(-1, (int) 25.5f), a5);
                } else {
                    a(-1, -1, a5);
                }
            }
        } else if (this.D != null) {
            int ordinal2 = enumC5207t.ordinal();
            if (ordinal2 == 0) {
                a(-1, -1, a5);
            } else if (ordinal2 == 4 && (a2 = AbstractC5164f1.a((NativeAd) this.d)) != null) {
                int a6 = sg.bigo.ads.E0.p.a(a2.intValue(), (int) 89.25f);
                int a7 = sg.bigo.ads.E0.p.a(a2.intValue(), (int) 25.5f);
                if (this.D != null) {
                    float f = a5;
                    bVar = new sg.bigo.ads.M0.b(f, f, f, f, null, a6, a7, AbstractC4963u.a(r3.getContext(), 1), null);
                    this.D.setBlurStyle(bVar);
                }
            } else {
                int a8 = sg.bigo.ads.E0.p.a(-3355444, (int) 89.25f);
                int a9 = sg.bigo.ads.E0.p.a(-1, (int) 25.5f);
                if (this.D != null) {
                    float f2 = a5;
                    bVar = new sg.bigo.ads.M0.b(f2, f2, f2, f2, null, a8, a9, AbstractC4963u.a(r3.getContext(), 1), null);
                    this.D.setBlurStyle(bVar);
                }
            }
        }
        enumC5207t.a(this.D);
        enumC5207t.a(this.H, this.I);
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final void v() {
        String str = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.d.e())).L;
        TextView textView = (TextView) this.u.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }

    public int w() {
        return R.id.inter_component_19;
    }

    public void x() {
        Q1 q1 = this.w;
        int i = q1 != null ? q1.i : 0;
        View findViewById = this.u.findViewById(R.id.inter_media_container);
        sg.bigo.ads.C.f.a(findViewById, 9);
        Q1 q12 = this.w;
        if (q12 == null || !q12.g) {
            MediaView mediaView = this.G;
            if (mediaView != null) {
                mediaView.setOtherClickAreaClick(false);
            }
            if (findViewById != null) {
                sg.bigo.ads.C.f.a(this.u, findViewById, 8, AbstractC5144a1.p, 0);
            }
        } else {
            MediaView mediaView2 = this.G;
            if (mediaView2 != null) {
                mediaView2.setOtherClickAreaClick(true);
            }
            if (findViewById != null) {
                sg.bigo.ads.C.f.a(this.u, findViewById, 8, this.d, i);
            }
        }
        Q1 q13 = this.w;
        boolean z = q13 != null && q13.f;
        MediaView mediaView3 = this.G;
        if (mediaView3 != null) {
            sg.bigo.ads.C.f.a(this.u, mediaView3, 8, this.d, i);
            this.G.setMediaAreaClickable(z);
            ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) this.G.getViewImpl())).a(!z);
        }
        Q1 q14 = this.w;
        boolean z2 = q14 != null && q14.h;
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.D;
        if (realtimeBlurLinearLayout != null) {
            sg.bigo.ads.C.f.a(realtimeBlurLinearLayout, 18);
            ViewGroup viewGroup = this.u;
            if (z2) {
                sg.bigo.ads.C.f.a(viewGroup, this.D, 8, this.d, this.w.i);
            } else {
                sg.bigo.ads.C.f.a(viewGroup, this.D, 8, AbstractC5144a1.p, 0);
            }
        }
    }

    public void y() {
        if (this.D == null) {
            return;
        }
        int g = g();
        RunnableC5400s runnableC5400s = new RunnableC5400s(this, g);
        if (g == 0) {
            runnableC5400s.run();
        } else {
            a(g, runnableC5400s);
        }
    }

    public void z() {
        D();
    }

    @Override // sg.bigo.ads.h.F1
    public void a(View view) {
        C5085c c5085c;
        View findViewById = view.findViewById(R.id.inter_ad_tag_layout);
        if (findViewById == null || (c5085c = this.e) == null) {
            return;
        }
        c5085c.a(findViewById, 0);
    }

    public final void b(int i, int i2, int i3, int i4) {
        Integer a2;
        if (this.O == -1) {
            sg.bigo.ads.T0.q qVar = this.x;
            this.O = (qVar == null || (a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.webview_layout"))) == null) ? 0 : a2.intValue();
        }
        int i5 = this.O;
        switch (i5) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                i5 = 0;
                break;
        }
        if (i5 == 5 || i5 == 6) {
            if (i >= i3) {
                this.P = true;
                return;
            }
            this.P = false;
            if (this.C != null) {
                int min = (i3 - Math.min(i, i2)) + i4;
                ViewGroup.LayoutParams layoutParams = this.C.getLayoutParams();
                if (min != layoutParams.height) {
                    layoutParams.height = min;
                    this.C.requestLayout();
                    a(this.C.getMeasuredWidth(), layoutParams.height, AbstractC4963u.a(this.F.getContext(), 12), AbstractC4963u.a(this.F.getContext(), 12));
                    A();
                }
            }
        }
    }

    public boolean a(EnumC5207t enumC5207t) {
        ViewGroup viewGroup;
        if (g() < 0 || (viewGroup = this.u) == null) {
            return false;
        }
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(w());
        if (viewStub != null) {
        }
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = (RealtimeBlurLinearLayout) this.u.findViewById(R.id.inter_component_layout);
        this.D = realtimeBlurLinearLayout;
        if (realtimeBlurLinearLayout == null) {
            return false;
        }
        this.L = (RoundedImageView) realtimeBlurLinearLayout.findViewById(R.id.inter_icon);
        this.H = (TextView) this.D.findViewById(R.id.inter_title);
        TextView textView = (TextView) this.D.findViewById(R.id.inter_description);
        this.I = textView;
        enumC5207t.a(this.H, textView);
        RoundedImageView roundedImageView = this.L;
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(AbstractC4963u.a(roundedImageView.getContext(), 8));
        }
        sg.bigo.ads.K0.X.a(this.D, new ViewTreeObserverOnGlobalLayoutListenerC5397q(this));
        ViewGroup.LayoutParams layoutParams = this.D.getLayoutParams();
        layoutParams.width = -1;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.M = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        this.D.setVisibility(4);
        this.D.requestLayout();
        return true;
    }

    public final sg.bigo.ads.U.r a(int i, int i2, int i3, int i4) {
        sg.bigo.ads.U.r rVar;
        int i5;
        int i6;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.F.getLayoutParams();
        sg.bigo.ads.U.r a2 = AbstractC5164f1.a(this.d);
        if (i == 0 || i2 == 0 || (i5 = a2.f12567a) == 0 || (i6 = a2.b) == 0 || i6 * i != i5 * i2) {
            this.F.setCornerRadius(AbstractC4963u.a(r3.getContext(), 8));
            marginLayoutParams.setMargins(i3, i4, i3, i4);
            sg.bigo.ads.U.r a3 = sg.bigo.ads.U.r.a(a2.f12567a, a2.b, i - (i3 * 2), i2 - (i4 * 2));
            int i7 = a3.f12567a;
            marginLayoutParams.width = i7;
            int i8 = a3.b;
            marginLayoutParams.height = i8;
            rVar = new sg.bigo.ads.U.r(i7, i8);
        } else {
            this.F.setCornerRadius(0.0f);
            marginLayoutParams.setMargins(0, 0, 0, 0);
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            rVar = new sg.bigo.ads.U.r(i, i2);
        }
        sg.bigo.ads.K0.X.d(-1, -1, this.G);
        this.F.setLayoutParams(marginLayoutParams);
        return rVar;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final void a(double d) {
        TextView textView;
        int i;
        if (d <= 3.0d) {
            textView = this.z;
            if (textView == null) {
                return;
            } else {
                i = -14671580;
            }
        } else {
            textView = this.z;
            if (textView == null) {
                return;
            } else {
                i = -1;
            }
        }
        textView.setTextColor(sg.bigo.ads.E0.p.a(i, (int) 153.0f));
    }

    public final void a(int i, int i2, int i3) {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.D;
        if (realtimeBlurLinearLayout != null) {
            float f = i3;
            float a2 = AbstractC4963u.a(realtimeBlurLinearLayout.getContext(), 1);
            Drawable a3 = AbstractC4962t.a(f, f, f, f, (Rect) null, i);
            if (i2 != 0 && a2 > 0.0f) {
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a3, AbstractC4962t.a(f, f, f, f, i2, a2, null)});
                layerDrawable.setId(0, android.R.id.background);
                a3 = layerDrawable;
            }
            this.D.setBackground(a3);
        }
    }

    public final void a(boolean z) {
        if (this.D == null || this.B) {
            return;
        }
        C5389m i = i();
        Button button = this.J;
        if (button != null) {
            sg.bigo.ads.h.T.a(button, i.f13179a, null);
        }
        if (z) {
            C();
            this.D.setVisibility(0);
            this.D.post(new RunnableC5404u(this, i));
        } else {
            this.D.setVisibility(0);
            A();
            z();
            if (i.b) {
                a(this.J, new sg.bigo.ads.E0.k());
            }
        }
    }
}

package sg.bigo.ads.z;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import sg.bigo.ads.E1.k;
import sg.bigo.ads.I.p;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.e.h;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5151c0;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.h.F1;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public class g extends AbstractC5151c0 {
    public static boolean s = true;
    public k l;
    public View m;
    public ProgressBar n;
    public boolean o;
    public q p;
    public sg.bigo.ads.O0.b q;
    public RunnableC5523a r;

    public g(Activity activity) {
        super(activity);
        this.o = false;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final h F() {
        return ((C5185l1) this.e).D();
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final int G() {
        return R.layout.bigo_ad_activity_interstitial_sab;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final void I() {
    }

    public final void T() {
        View view;
        if (this.o) {
            return;
        }
        Integer a2 = z.a(this.p.a("video_play_page.is_loading"));
        if (1 == (a2 != null ? a2.intValue() : 0)) {
            if (this.m == null || this.n == null) {
                View findViewById = this.f12687a.findViewById(R.id.bigo_web_loading_container);
                this.m = findViewById;
                if (findViewById != null) {
                    this.n = (ProgressBar) findViewById.findViewById(R.id.bigo_ad_webview_loading_progress);
                }
            }
            View view2 = this.m;
            int i = 5;
            if (view2 != null) {
                view2.setVisibility(0);
                ProgressBar progressBar = this.n;
                if (progressBar != null) {
                    progressBar.setProgress(5);
                }
            }
            Integer a3 = z.a(this.p.a("video_play_page.loading_timing"));
            int intValue = a3 != null ? a3.intValue() : 0;
            if (intValue == 2) {
                i = 3;
            } else if (intValue != 3) {
                i = intValue != 4 ? 1 : 10;
            }
            if (i > 1 && (view = this.m) != null) {
                view.postDelayed(new RunnableC5525c(this), i * 1000);
            }
            this.o = true;
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public void c(boolean z) {
        AbstractC5446j.a(this.r);
        C();
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final void g(int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
    
        if (2 != r2) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v() {
        Integer a2;
        h hVar;
        int i;
        ViewGroup viewGroup;
        AdCountDownButton adCountDownButton;
        super.v();
        h hVar2 = this.d;
        if (hVar2 == null) {
            this.f12687a.finish();
            return;
        }
        q qVar = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) ((C5185l1) hVar2).W.e())).I;
        this.p = qVar;
        if (qVar == null) {
            this.f12687a.finish();
            return;
        }
        k a3 = k.a(this.f12687a);
        this.l = a3;
        if (a3 == null) {
            this.f12687a.finish();
            return;
        }
        ((C5185l1) this.d).D().P = false;
        s = true;
        this.m = this.f12687a.findViewById(R.id.bigo_web_loading_container);
        Integer a4 = z.a(this.p.a("video_play_page.webview_layout"));
        int intValue = a4 != null ? a4.intValue() : 7;
        if (intValue != 7 && intValue != 8) {
            intValue = 7;
        }
        if (7 == intValue && (adCountDownButton = this.g) != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) adCountDownButton.getLayoutParams();
            layoutParams.gravity = 8388659;
            layoutParams.leftMargin = AbstractC4963u.a(this.f12687a, 20);
            layoutParams.topMargin = AbstractC4963u.a(this.f12687a, 10);
        }
        AdCountDownButton adCountDownButton2 = this.g;
        if (adCountDownButton2 != null && (!(this instanceof p) || ((p) this).u)) {
            adCountDownButton2.setVisibility(8);
        }
        T();
        k kVar = this.l;
        if (kVar != null) {
            kVar.setWebViewClient(new f(this));
            this.l.setWebChromeClient(new e(this));
            ViewGroup viewGroup2 = (ViewGroup) this.f12687a.findViewById(R.id.inter_webview_container);
            if (viewGroup2 != null) {
                X.a(this.l, viewGroup2, new FrameLayout.LayoutParams(-1, -1), -1);
                q qVar2 = this.p;
                if (qVar2 != null) {
                    Integer a5 = z.a(qVar2.a("video_play_page.imp_timing"));
                    i = a5 != null ? a5.intValue() : 1;
                    if (1 != i) {
                    }
                    if (1 == i && (viewGroup = (ViewGroup) this.f12687a.findViewById(R.id.inter_native_ad_view)) != null) {
                        F1 f1 = new F1(((C5185l1) this.e).D());
                        f1.e = this.c;
                        f1.a(viewGroup, viewGroup, 1, 1, 0, null);
                    }
                    if (this.d != null) {
                        this.l.setOnTouchListener(new ViewOnTouchListenerC5524b(this));
                    }
                }
                i = 1;
                if (1 == i) {
                    F1 f12 = new F1(((C5185l1) this.e).D());
                    f12.e = this.c;
                    f12.a(viewGroup, viewGroup, 1, 1, 0, null);
                }
                if (this.d != null) {
                }
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f12687a.findViewById(R.id.inter_native_ad_view);
            if (viewGroup3 != null && (hVar = this.d) != null && ((C5185l1) hVar).D() != null) {
                TextView textView = (TextView) viewGroup3.findViewById(R.id.inter_advertiser);
                TextView textView2 = (TextView) viewGroup3.findViewById(R.id.inter_ad_label);
                String advertiser = ((C5185l1) this.d).D().getAdvertiser();
                if (textView != null && textView2 != null) {
                    boolean isEmpty = TextUtils.isEmpty(advertiser);
                    textView.setVisibility(isEmpty ? 8 : 0);
                    if (!isEmpty) {
                        textView.setText(advertiser);
                        textView2.setText(AbstractC4944a.a(this.f12687a.getApplicationContext(), R.string.bigo_ad_tag, new Object[0]));
                    }
                }
            }
        }
        this.l.loadUrl(((sg.bigo.ads.U0.b) ((InterfaceC5087a) ((C5185l1) this.d).W.e())).z.f12574a);
        q qVar3 = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) ((C5185l1) this.d).W.e())).J;
        int intValue2 = (qVar3 == null || (a2 = z.a(qVar3.a("tracker_attr.web_auto_clk_tracker"))) == null) ? -1 : a2.intValue();
        if (this.r == null) {
            this.r = new RunnableC5523a(this);
        }
        if (intValue2 > -1) {
            AbstractC5446j.a(3, null, this.r, intValue2 * 1000);
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void w() {
        super.w();
        k kVar = this.l;
        if (kVar != null) {
            kVar.destroy();
            this.l = null;
        }
    }
}

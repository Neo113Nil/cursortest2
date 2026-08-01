package sg.bigo.ads.h;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.IconAdsLoader;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.common.view.YandexWarningTextView;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.i.C5231c;
import sg.bigo.ads.i.C5241m;
import sg.bigo.ads.n.AbstractC5391n;
import sg.bigo.ads.n.C5408w;
import sg.bigo.ads.q.C5430a;
import sg.bigo.ads.q.C5431b;
import sg.bigo.ads.q.C5433d;
import sg.bigo.ads.q.C5435f;
import sg.bigo.ads.q.C5436g;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.r.C5448a;
import sg.bigo.ads.t.C5474d;
import sg.bigo.ads.t.C5476f;
import sg.bigo.ads.t.InterfaceC5475e;
import sg.bigo.ads.t.InterfaceC5477g;
import sg.bigo.ads.u.C5485f;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.y.C5509a;
import sg.bigo.ads.y.RunnableC5510b;

/* renamed from: sg.bigo.ads.h.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5204s extends AbstractC5144a1 implements sg.bigo.ads.e.g, InterfaceC5475e {
    public C5485f A;
    public Y B;
    public final Handler C;
    public String D;
    public int E;
    public int F;
    public int G;
    public final AtomicBoolean H;
    public boolean I;
    public Y0 J;
    public C5202r0 K;
    public sg.bigo.ads.q.o L;
    public sg.bigo.ads.y.i M;
    public final C5167g0 N;
    public final WeakHashMap O;
    public final HashMap P;
    public final C5174i Q;
    public sg.bigo.ads.K0.E R;
    public C5150c S;
    public sg.bigo.ads.K0.E T;
    public C5201r U;
    public boolean V;
    public RunnableC5177j W;
    public int X;
    public int Y;
    public final RunnableC5162f Z;
    public final ArrayList q;
    public View r;
    public sg.bigo.ads.T0.q s;
    public sg.bigo.ads.T0.q t;
    public sg.bigo.ads.T0.q u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public Q1 z;

    public AbstractC5204s(Activity activity) {
        super(activity);
        this.q = new ArrayList();
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.C = new Handler(Looper.getMainLooper());
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = new AtomicBoolean(false);
        this.I = true;
        this.N = new C5167g0();
        this.O = new WeakHashMap();
        this.P = new HashMap();
        this.Q = new C5174i(this);
        this.V = false;
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = new RunnableC5162f(this);
        C5476f.e = new WeakReference(this);
    }

    public static Class i(int i) {
        return i == 0 ? sg.bigo.ads.t.i.class : (7 == i || 8 == i) ? C5474d.class : sg.bigo.ads.t.v.class;
    }

    public static boolean j(int i) {
        return (i == 7 || i == 8 || i == 0) ? false : true;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final boolean A() {
        Integer a2;
        if (this.V) {
            if (d0() != 0) {
                return false;
            }
            Object X = X();
            if (X instanceof InterfaceC5477g) {
                C5408w c5408w = (C5408w) ((InterfaceC5477g) X);
                if (c5408w.O == -1) {
                    sg.bigo.ads.T0.q qVar = c5408w.x;
                    c5408w.O = (qVar == null || (a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.webview_layout"))) == null) ? 0 : a2.intValue();
                }
                int i = c5408w.O;
                switch (i) {
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
                        i = 0;
                        break;
                }
                if ((i == 5 || i == 6) && !m0()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5143a0 A0() {
        boolean z;
        boolean z2;
        Integer a2;
        Integer a3;
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar != null) {
            int intValue = (!this.v || (a3 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.below_area_dp"))) == null) ? 0 : a3.intValue();
            if (this.v) {
                Integer a4 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.below_area_clickable"));
                if ((a4 != null ? a4.intValue() : 0) == 1) {
                    z = true;
                    int intValue2 = (this.v || (a2 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.up_area_dp"))) == null) ? 0 : a2.intValue();
                    if (this.v) {
                        Integer a5 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.up_area_clickable"));
                        if ((a5 != null ? a5.intValue() : 0) == 1) {
                            z2 = true;
                            Integer a6 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.click_type"));
                            a(this.m, intValue, z, intValue2, z2, 8, a6 != null ? a6.intValue() : 0);
                            r1 = intValue;
                        }
                    }
                    z2 = false;
                    Integer a62 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.click_type"));
                    a(this.m, intValue, z, intValue2, z2, 8, a62 != null ? a62.intValue() : 0);
                    r1 = intValue;
                }
            }
            z = false;
            if (this.v) {
            }
            if (this.v) {
            }
            z2 = false;
            Integer a622 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.click_type"));
            a(this.m, intValue, z, intValue2, z2, 8, a622 != null ? a622.intValue() : 0);
            r1 = intValue;
        }
        return new C5143a0(r1);
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final boolean B() {
        Integer a2;
        if (this.V) {
            if (d0() != 0) {
                return false;
            }
            Object X = X();
            if (X instanceof InterfaceC5477g) {
                C5408w c5408w = (C5408w) ((InterfaceC5477g) X);
                if (c5408w.O == -1) {
                    sg.bigo.ads.T0.q qVar = c5408w.x;
                    c5408w.O = (qVar == null || (a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.webview_layout"))) == null) ? 0 : a2.intValue();
                }
                int i = c5408w.O;
                switch (i) {
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
                        i = 0;
                        break;
                }
                if ((i == 5 || i == 6) && !m0()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void B0() {
        sg.bigo.ads.T0.q qVar;
        if (this.v && (qVar = this.t) != null) {
            long intValue = (sg.bigo.ads.K0.z.a(qVar.a("video_play_page.guided_click_gesture_show_time")) != null ? r0.intValue() : 0) * 1000;
            if (intValue == 0) {
                return;
            }
            this.S = new C5150c(this, intValue);
        }
    }

    public final void C0() {
        ViewGroup viewGroup = this.m;
        if (viewGroup == null) {
            return;
        }
        Button button = (Button) viewGroup.findViewById(R.id.inter_btn_cta);
        TextView textView = (TextView) this.m.findViewById(R.id.inter_company);
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.cta_color"));
            int intValue = a2 != null ? a2.intValue() : 0;
            Integer a3 = sg.bigo.ads.K0.z.a(this.t.a("endpage.cta_color"));
            int intValue2 = a3 != null ? a3.intValue() : 0;
            Integer a4 = sg.bigo.ads.K0.z.a(this.t.a("layer.cta_color"));
            int intValue3 = a4 != null ? a4.intValue() : 0;
            this.E = AbstractC5164f1.a(((C5185l1) this.e).D(), intValue, null);
            this.F = AbstractC5164f1.a(((C5185l1) this.e).D(), intValue2, null);
            this.G = AbstractC5164f1.a(((C5185l1) this.e).D(), intValue3, null);
            if (!(X() instanceof AbstractC5391n)) {
                if (button != null) {
                    button.setBackgroundColor(this.E);
                }
                if (textView != null) {
                    textView.setTextColor(this.E);
                }
            }
        }
        if (!p0() || this.t == null) {
            return;
        }
        View findViewById = this.m.findViewById(R.id.inter_media_container);
        Integer a5 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.background_colour"));
        int intValue4 = a5 != null ? a5.intValue() : 0;
        if (r()) {
            if (intValue4 != 4 && intValue4 != 5) {
                return;
            }
        } else if (intValue4 != 3 && intValue4 != 4) {
            return;
        }
        if (findViewById != null) {
            findViewById.setBackgroundColor(sg.bigo.ads.K0.I.a(-7829368, "#66000000"));
            TextView textView2 = (TextView) this.m.findViewById(R.id.inter_warning);
            if (textView2 != null) {
                textView2.setTextColor(sg.bigo.ads.K0.I.a(-1, "#66FFFFFF"));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0291, code lost:
    
        if (r1 != null) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean D0() {
        int i;
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        sg.bigo.ads.T0.q qVar;
        boolean z;
        boolean z2;
        Integer a2;
        Integer a3;
        int i2;
        int i3;
        int i4 = R.layout.bigo_ad_view_click_guide;
        if (r()) {
            sg.bigo.ads.T0.q qVar2 = this.t;
            if (qVar2 != null) {
                Integer a4 = sg.bigo.ads.K0.z.a(qVar2.a("layer.guided_click"));
                i2 = a4 != null ? a4.intValue() : 0;
            } else {
                i2 = -1;
            }
            if (i2 == 1) {
                i3 = R.layout.bigo_ad_view_click_guide_landscape_1;
            } else if (i2 == 3) {
                i3 = R.layout.bigo_ad_view_click_guide_landscape_3;
            } else {
                i4 = R.layout.bigo_ad_view_click_guide_landscape_2;
                i = 2;
            }
            int i5 = i3;
            i = i2;
            i4 = i5;
        } else {
            i = -1;
        }
        if (this.m == null || d0() == 2 || d0() == 8 || !this.z.d) {
            return false;
        }
        sg.bigo.ads.y.i iVar = this.M;
        if (iVar != null) {
            ViewGroup viewGroup = this.m;
            int V = V();
            C5158e c5158e = new C5158e(this);
            if (viewGroup != null) {
                iVar.k = viewGroup;
                ViewGroup viewGroup2 = (ViewGroup) AbstractC4944a.a(viewGroup.getContext(), iVar.f(), null, false);
                iVar.l = viewGroup2;
                if (viewGroup2 != null) {
                    iVar.k.addView(viewGroup2, new ViewGroup.LayoutParams(-1, -1));
                    iVar.l.setBackgroundColor(-234881024);
                    iVar.g();
                    iVar.b(this);
                    iVar.a(this);
                    TextView textView = (TextView) iVar.l.findViewById(R.id.inter_warning);
                    iVar.p = textView;
                    if (textView != null) {
                        T.a(textView, sg.bigo.ads.E0.p.b(-234881024));
                    }
                    sg.bigo.ads.Z.c.a((View) iVar.p, 101.0f);
                    ViewGroup viewGroup3 = (ViewGroup) iVar.l.findViewById(R.id.inter_ad_tag_layout);
                    iVar.q = viewGroup3;
                    sg.bigo.ads.K0.X.a(viewGroup3, new C5509a(iVar));
                    sg.bigo.ads.Z.c.a((View) iVar.q, 101.0f);
                    iVar.d(this);
                    AbstractC5140Q.a(iVar.l, iVar.k, new RunnableC5510b(iVar, c5158e));
                    Integer a5 = sg.bigo.ads.K0.z.a(iVar.e.a("layer.click_type"));
                    int intValue = a5 != null ? a5.intValue() : 0;
                    ViewGroup viewGroup4 = iVar.k;
                    ViewGroup viewGroup5 = iVar.l;
                    int i6 = intValue;
                    iVar.a(this, viewGroup4, viewGroup5, (E1) null, V, 10, intValue, viewGroup5);
                    TextView textView2 = iVar.p;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    Integer a6 = sg.bigo.ads.K0.z.a(iVar.e.a("layer.media_view_clickable_switch"));
                    boolean z3 = (a6 != null ? a6.intValue() : 0) == 1;
                    Integer a7 = sg.bigo.ads.K0.z.a(iVar.e.a("layer.other_space_clickable_switch"));
                    iVar.a(i6, z3, (a7 != null ? a7.intValue() : 0) == 1);
                    String str = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) iVar.d.e())).L;
                    TextView textView3 = (TextView) iVar.l.findViewById(R.id.inter_advertiser);
                    if (TextUtils.isEmpty(str)) {
                        textView3.setVisibility(8);
                    } else {
                        textView3.setText(str);
                    }
                    findViewById = iVar.l;
                    findViewById2 = findViewById;
                    if (findViewById2 != null && (qVar = this.t) != null) {
                        int intValue2 = (this.v || (a3 = sg.bigo.ads.K0.z.a(qVar.a("layer.below_area_dp"))) == null) ? 0 : a3.intValue();
                        if (this.v) {
                            Integer a8 = sg.bigo.ads.K0.z.a(this.t.a("layer.below_area_clickable"));
                            if ((a8 != null ? a8.intValue() : 0) == 1) {
                                z = true;
                                int intValue3 = (this.v || (a2 = sg.bigo.ads.K0.z.a(this.t.a("layer.up_area_dp"))) == null) ? 0 : a2.intValue();
                                if (this.v) {
                                    Integer a9 = sg.bigo.ads.K0.z.a(this.t.a("layer.up_area_clickable"));
                                    if ((a9 != null ? a9.intValue() : 0) == 1) {
                                        z2 = true;
                                        a(findViewById2, intValue2, z, intValue3, z2, 10, this.z.m);
                                    }
                                }
                                z2 = false;
                                a(findViewById2, intValue2, z, intValue3, z2, 10, this.z.m);
                            }
                        }
                        z = false;
                        if (this.v) {
                        }
                        if (this.v) {
                        }
                        z2 = false;
                        a(findViewById2, intValue2, z, intValue3, z2, 10, this.z.m);
                    }
                    l(9);
                    a(this.z.e * 1000);
                    return true;
                }
            }
            findViewById2 = null;
            if (findViewById2 != null) {
                if (this.v) {
                }
                if (this.v) {
                }
                z = false;
                if (this.v) {
                }
                if (this.v) {
                }
                z2 = false;
                a(findViewById2, intValue2, z, intValue3, z2, 10, this.z.m);
            }
            l(9);
            a(this.z.e * 1000);
            return true;
        }
        Context context = this.m.getContext();
        ViewGroup viewGroup6 = this.m;
        AbstractC4944a.a(context, i4, viewGroup6, viewGroup6 != null);
        findViewById = this.m.findViewById(R.id.inter_click_guide_container);
        if (findViewById != null) {
            X().a(this.m, findViewById, V(), 10, this.z.m, findViewById);
            findViewById.setTag(12);
            Button button = (Button) findViewById.findViewById(R.id.inter_btn_cta);
            if (button != null) {
                button.setTag(17);
            }
            findViewById.findViewById(R.id.inter_icon).setTag(17);
            if (this.v) {
                if (button != null) {
                    button.setBackgroundColor(this.G);
                }
                if (this.z.l) {
                    a(findViewById, 10, ((C5185l1) this.e).D(), this.z.m);
                } else {
                    a(findViewById, 10, AbstractC5144a1.p, 0);
                }
            } else {
                a(findViewById, 5, ((C5185l1) this.e).D(), this.z.m);
            }
            AbstractC5140Q.b(findViewById);
            View findViewById5 = findViewById.findViewById(R.id.inter_click_guide);
            View findViewById6 = findViewById.findViewById(R.id.inter_click_ripple);
            if (findViewById5 != null && findViewById6 != null) {
                AbstractC5140Q.b(findViewById5, findViewById6);
            }
            if (i == 1 && (findViewById4 = findViewById.findViewById(R.id.inter_btn_cta_layout)) != null) {
                AbstractC5140Q.a(findViewById4);
            } else if (i == 3 && (findViewById3 = findViewById.findViewById(R.id.inter_click_guide)) != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(600L);
                alphaAnimation.setStartOffset(1000L);
                alphaAnimation.setInterpolator(AbstractC4954k.a(1));
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -AbstractC4963u.a(findViewById3.getContext(), 160));
                translateAnimation.setDuration(600L);
                translateAnimation.setStartOffset(1000L);
                translateAnimation.setInterpolator(AbstractC4954k.a(2));
                AnimationSet animationSet = new AnimationSet(false);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(translateAnimation);
                alphaAnimation.setRepeatCount(Integer.MAX_VALUE);
                alphaAnimation.setRepeatMode(1);
                translateAnimation.setRepeatCount(Integer.MAX_VALUE);
                translateAnimation.setRepeatMode(1);
                findViewById3.startAnimation(animationSet);
            }
        }
        findViewById2 = this.m.findViewById(R.id.bigo_ad_layout_click_guide);
        a(findViewById2);
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final int E() {
        int d0 = d0();
        int f0 = f0();
        if (d0 == 1) {
            return 2;
        }
        if (d0 != 2) {
            if (d0 == 3) {
                return 3;
            }
            if (d0 == 14) {
                return 6;
            }
            switch (d0) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    return 5;
                case 9:
                    return 9;
                default:
                    return 1;
            }
        } else if (f0 != 5) {
            return 2;
        }
        return 4;
    }

    public void E0() {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.g.setVisibility(0);
            AbstractC5140Q.b((View) this.g);
        }
        if (d0() == 0) {
            int i = this.z.c;
            int i2 = (i >= 0 || ((sg.bigo.ads.U0.b) ((InterfaceC5087a) ((C5185l1) this.e).W.e())).l == 4) ? i : 0;
            if (((C5185l1) this.e).A()) {
                InterfaceC5087a interfaceC5087a = (InterfaceC5087a) ((C5185l1) this.e).W.e();
                if (this.H.get() && ((sg.bigo.ads.U0.k) interfaceC5087a).V0 == null) {
                    i2 = Q1.a(this.z.o);
                }
            }
            this.g.a(i2, null);
        }
    }

    public final void F0() {
        TextView textView = (TextView) this.m.findViewById(R.id.inter_advertiser);
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(this.D)) {
            textView.setVisibility(8);
            return;
        }
        if (!r() && (textView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(2, R.id.inter_ad_info);
            layoutParams.addRule(12, 0);
            layoutParams.leftMargin = 18;
            layoutParams.setMarginStart(18);
            layoutParams.bottomMargin = 15;
            textView.setLayoutParams(layoutParams);
            textView.setText(this.D);
        }
    }

    public final boolean G0() {
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar == null) {
            return false;
        }
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.show_time"));
        if ((a2 != null ? a2.intValue() : 0) != 0 || k0()) {
            return false;
        }
        sg.bigo.ads.T0.q qVar2 = this.t;
        return ((qVar2 != null && qVar2.b("layer.is_show_layer") == 1) || this.H.get()) ? false : true;
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void I() {
        this.l = ((C5185l1) this.e).D();
        this.D = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) ((C5185l1) this.e).W.e())).L;
        this.t = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) ((C5185l1) this.e).W.e())).I;
        this.u = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) ((C5185l1) this.e).W.e())).J;
        if (this.t != null) {
            this.v = true;
        }
        sg.bigo.ads.T0.p pVar = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) ((C5185l1) this.e).W.e())).c;
        if (pVar.r == null) {
            pVar.r = new sg.bigo.ads.T0.q(new JSONObject());
        }
        this.s = pVar.r;
        this.z = b0();
        j0();
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public void O() {
        if (n0()) {
            e0();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void R() {
        sg.bigo.ads.K0.E e;
        super.R();
        int d0 = d0();
        Y0 y0 = this.J;
        if (y0 != null) {
            y0.c();
        }
        C5202r0 c5202r0 = this.K;
        if (c5202r0 != null && (e = c5202r0.q) != null) {
            e.d();
        }
        if (d0 == 0) {
            this.N.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), 2);
        } else if (d0 == 10) {
            this.N.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), 3);
        } else if (d0 == 1) {
            this.N.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), 4);
        } else if (d0 == 2 || d0 == 8 || d0 == 9) {
            this.N.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), 5);
        } else if (d0 == 5) {
            this.N.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), 6);
        } else if (d0 == 4) {
            this.N.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), 7);
        } else if (d0 == 7) {
            this.N.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), 8);
        }
        sg.bigo.ads.q.o oVar = this.L;
        if (oVar != null) {
            oVar.n = true;
            sg.bigo.ads.q.o.a(oVar.k, oVar.i);
            sg.bigo.ads.q.o.a(oVar.j, oVar.h);
            C5436g c5436g = oVar.l;
            if (c5436g != null) {
                c5436g.d();
            }
            C5436g c5436g2 = oVar.m;
            if (c5436g2 != null) {
                c5436g2.d();
            }
        }
        sg.bigo.ads.y.i iVar = this.M;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void S() {
        sg.bigo.ads.K0.E e;
        super.S();
        int d0 = d0();
        Y0 y0 = this.J;
        if (y0 != null) {
            y0.d();
        }
        C5202r0 c5202r0 = this.K;
        if (c5202r0 != null && (e = c5202r0.q) != null && e.b()) {
            c5202r0.q.e();
        }
        if (d0 == 0) {
            this.N.b((InterfaceC5087a) ((C5185l1) this.e).W.e(), 2);
        } else if (d0 == 10) {
            this.N.b((InterfaceC5087a) ((C5185l1) this.e).W.e(), 3);
        } else if (d0 == 1) {
            this.N.b((InterfaceC5087a) ((C5185l1) this.e).W.e(), 4);
        } else if (d0 == 2 || d0 == 8 || d0 == 9) {
            this.N.b((InterfaceC5087a) ((C5185l1) this.e).W.e(), 5);
        } else if (d0 == 5) {
            this.N.b((InterfaceC5087a) ((C5185l1) this.e).W.e(), 6);
        } else if (d0 == 4) {
            this.N.b((InterfaceC5087a) ((C5185l1) this.e).W.e(), 7);
        } else if (d0 == 7) {
            this.N.b((InterfaceC5087a) ((C5185l1) this.e).W.e(), 8);
        }
        sg.bigo.ads.q.o oVar = this.L;
        if (oVar != null) {
            oVar.n = false;
            sg.bigo.ads.q.o.b(oVar.k, oVar.i);
            sg.bigo.ads.q.o.b(oVar.j, oVar.h);
            C5436g c5436g = oVar.l;
            if (c5436g != null && c5436g.b()) {
                oVar.l.e();
            }
            C5436g c5436g2 = oVar.m;
            if (c5436g2 != null && c5436g2.b()) {
                oVar.m.e();
            }
        }
        sg.bigo.ads.y.i iVar = this.M;
        if (iVar != null) {
            iVar.b();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1
    public final int T() {
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar == null) {
            return 0;
        }
        if (!this.v) {
            return 1;
        }
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_layout"));
        if (a2 != null) {
            return a2.intValue();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r4 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r8 == 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (r1 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Y() {
        int intValue;
        Integer a2;
        if (this.m != null) {
            sg.bigo.ads.T0.q qVar = this.t;
            int i = ViewCompat.MEASURED_STATE_MASK;
            if (qVar != null && p0()) {
                Integer a3 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.background_colour"));
                intValue = a3 != null ? a3.intValue() : 0;
                if (intValue == 1) {
                    i = -1;
                } else if (intValue != 2) {
                    if (r()) {
                        if (intValue == 4) {
                            a2 = AbstractC5164f1.a((NativeAd) this.l);
                        }
                        i = sg.bigo.ads.K0.I.a(-7829368, "#262E33");
                    } else {
                        if (intValue == 3) {
                            a2 = AbstractC5164f1.a((NativeAd) this.l);
                        }
                        i = -100;
                    }
                }
                if (i != -100) {
                    F1 X = X();
                    ViewGroup viewGroup = this.m;
                    X.getClass();
                    AbstractC5446j.b(new RunnableC5203r1(X, viewGroup, i));
                    return;
                }
            } else if (r()) {
                sg.bigo.ads.T0.q qVar2 = this.t;
                if (qVar2 != null) {
                    Integer a4 = sg.bigo.ads.K0.z.a(qVar2.a("video_play_page.background_colour"));
                    intValue = a4 != null ? a4.intValue() : 0;
                    if (intValue == 1) {
                        F1 X2 = X();
                        ViewGroup viewGroup2 = this.m;
                        X2.getClass();
                        AbstractC5446j.b(new RunnableC5203r1(X2, viewGroup2, -1));
                        return;
                    }
                    if (intValue == 2) {
                        F1 X3 = X();
                        ViewGroup viewGroup3 = this.m;
                        X3.getClass();
                        AbstractC5446j.b(new RunnableC5203r1(X3, viewGroup3, ViewCompat.MEASURED_STATE_MASK));
                        return;
                    }
                    if (intValue == 4) {
                        F1 X4 = X();
                        ViewGroup viewGroup4 = this.m;
                        int i2 = this.E;
                        X4.getClass();
                        AbstractC5446j.b(new RunnableC5203r1(X4, viewGroup4, i2));
                        return;
                    }
                    if (intValue == 5) {
                        X().b(this.m);
                        return;
                    }
                    F1 X5 = X();
                    ViewGroup viewGroup5 = this.m;
                    int a5 = sg.bigo.ads.K0.I.a(-7829368, "#262E33");
                    X5.getClass();
                    AbstractC5446j.b(new RunnableC5203r1(X5, viewGroup5, a5));
                    return;
                }
                return;
            }
            X().b(this.m);
        }
    }

    public void Z() {
        int a0;
        C5202r0 c5202r0 = this.K;
        if ((c5202r0 == null || !c5202r0.b()) && (((InterfaceC5087a) ((C5185l1) this.e).W.e()) instanceof InterfaceC5087a) && ((C5185l1) this.e).A()) {
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) ((C5185l1) this.e).W.e();
            sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
            this.H.set(!kVar.W0);
            if (this.H.get() && kVar.V0 == null && (a0 = a0()) > 0) {
                C5201r c5201r = new C5201r(this, a0 * 1000, interfaceC5087a);
                this.U = c5201r;
                c5201r.e();
            }
        }
    }

    public final void a(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.P) {
            WeakHashMap weakHashMap = (WeakHashMap) this.P.get(1);
            if (sg.bigo.ads.K0.A.a(weakHashMap)) {
                return;
            }
            for (Object obj : objArr) {
                if (obj != null) {
                    weakHashMap.remove(obj);
                }
            }
        }
    }

    public int a0() {
        Q1 q1 = this.z;
        if (q1 == null) {
            return 0;
        }
        return Q1.a(q1.o);
    }

    public final void b(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.O) {
            for (Object obj : objArr) {
                if (obj != null) {
                    this.O.remove(obj);
                }
            }
        }
    }

    public abstract Q1 b0();

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final void c(boolean z) {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton == null || (adCountDownButton.getVisibility() == 0 && this.g.c)) {
            e(z);
        } else if (this.g.getVisibility() == 0 && this.g.h) {
            e(z);
        }
    }

    public final void c0() {
        synchronized (this.P) {
            WeakHashMap weakHashMap = (WeakHashMap) this.P.remove(1);
            if (sg.bigo.ads.K0.A.a(weakHashMap)) {
                return;
            }
            Iterator it = weakHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) ((Map.Entry) it.next()).getValue();
                if (runnable != null) {
                    AbstractC5446j.a(2, null, runnable, 0L);
                }
            }
        }
    }

    public void d(boolean z) {
        sg.bigo.ads.K0.E e;
        C5150c c5150c = this.S;
        if (c5150c != null) {
            c5150c.a();
            this.S = null;
        }
        sg.bigo.ads.K0.E e2 = this.R;
        if (e2 != null) {
            e2.a();
            this.R = null;
        }
        if (z && (e = this.T) != null) {
            e.a();
            this.T = null;
        }
        C5201r c5201r = this.U;
        if (c5201r != null) {
            c5201r.a();
            this.U = null;
        }
    }

    public final int d0() {
        synchronized (this.q) {
            if (this.q.isEmpty()) {
                return -1;
            }
            return ((Integer) this.q.get(0)).intValue();
        }
    }

    public final void e(boolean z) {
        C5485f C;
        if (f(z)) {
            int d0 = d0();
            if (d0 == 0) {
                C5485f c5485f = this.A;
                if (c5485f != null) {
                    c5485f.a(1, 2);
                }
            } else if (d0 == 1 && (C = ((C5185l1) this.e).C()) != null) {
                C.a(2, 2);
            }
            C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LandingPageStyleConfig e0() {
        int i;
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar == null || !this.v) {
            qVar = null;
        }
        int a2 = AbstractC5391n.a(qVar, "layer.webview_layout");
        int a3 = AbstractC5391n.a(qVar, "layer.webview_force_time", "layer.webview_force_time_new");
        sg.bigo.ads.y.i iVar = this.M;
        int i2 = (iVar == null || !iVar.d()) ? 0 : X().o;
        if (i2 == 0) {
            Integer a4 = AbstractC5164f1.a((NativeAd) this.l);
            if (a4 == null) {
                i = 0;
                Class i3 = i(a2);
                ViewGroup viewGroup = this.m;
                return new LandingPageStyleConfig(i3, 9, a2, a3, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, i, 0.8f);
            }
            i2 = a4.intValue();
        }
        i = i2;
        Class i32 = i(a2);
        ViewGroup viewGroup2 = this.m;
        return new LandingPageStyleConfig(i32, 9, a2, a3, viewGroup2 != null ? viewGroup2.getMeasuredHeight() : 0, i, 0.8f);
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public void f(int i) {
        super.g(i);
        if (this.m == null) {
            return;
        }
        ((C5185l1) this.e).a0 = this.N;
        F1 X = X();
        if (X instanceof AbstractC5391n) {
            if (X instanceof sg.bigo.ads.n.U0) {
                sg.bigo.ads.n.U0 u0 = (sg.bigo.ads.n.U0) X;
                ViewGroup viewGroup = this.m;
                Q1 q1 = this.z;
                C5485f c5485f = this.A;
                Y y = this.B;
                u0.K = c5485f;
                u0.a(this, viewGroup, q1, c5485f.f13330a, y);
            } else {
                ((AbstractC5391n) X).a(this, this.m, this.z, this.t, this.B);
            }
            A0();
        }
        Z();
        C0();
        x0();
        z0();
        B0();
        l(0);
        u0();
        sg.bigo.ads.P.c cVar = (InterfaceC5087a) ((C5185l1) this.e).W.e();
        boolean z = this.v;
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
        bVar.getClass();
        bVar.P = z ? 1 : 2;
        a(this.m);
        y0();
        t0();
    }

    public abstract boolean f(boolean z);

    public final int f0() {
        synchronized (this.q) {
            if (this.q.size() < 2) {
                return -1;
            }
            return ((Integer) this.q.get(1)).intValue();
        }
    }

    public void g(boolean z) {
        if (z) {
            y();
        } else {
            x();
        }
    }

    public void g0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        if (r11 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c2, code lost:
    
        if (r9 == false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(boolean z) {
        int i;
        sg.bigo.ads.T0.k kVar;
        boolean z2;
        boolean z3;
        C5448a c5448a;
        sg.bigo.ads.T0.q qVar;
        if (this.L == null) {
            return;
        }
        if (!k0() && (((qVar = this.t) == null || qVar.b("layer.is_show_layer") != 1) && !this.H.get())) {
            return;
        }
        sg.bigo.ads.q.o oVar = this.L;
        oVar.f = 0;
        InterfaceC5087a interfaceC5087a = (InterfaceC5087a) oVar.f13248a.D().e();
        sg.bigo.ads.r.d dVar = oVar.c;
        int i2 = dVar.f13264a;
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            i2 = 0;
        }
        if (i2 == 1) {
            i = Math.max(1, dVar.e);
            oVar.f |= 2;
        } else {
            i = 0;
        }
        sg.bigo.ads.U0.k kVar2 = (sg.bigo.ads.U0.k) interfaceC5087a;
        if (kVar2.p()) {
            C5448a c5448a2 = oVar.b;
            int i3 = c5448a2.f13264a;
            if (i3 != 0 && i3 != 1 && i3 != 2 && i3 != 3) {
                i3 = 0;
            }
            if (z) {
                C5185l1 c5185l1 = oVar.f13248a;
                C5241m c5241m = c5185l1.X;
                z3 = c5241m != null && c5241m.f12988a;
                C5231c c5231c = c5185l1.Y;
                z2 = c5231c != null && c5231c.f12978a;
            } else {
                z2 = false;
                z3 = false;
            }
            if (!c5448a2.d()) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            if (!z3) {
                            }
                            oVar.f = 0;
                        }
                    }
                }
                c5448a = oVar.b;
                i += Math.max(1, c5448a.e);
                oVar.f |= 1;
            } else if (i3 == 1) {
                i += Math.max(1, oVar.b.e);
                oVar.f |= 13;
            } else if (i3 == 2 && !z3) {
                i += Math.max(1, oVar.b.e);
                oVar.f |= 9;
            } else if (i3 == 3 && !z3 && !z2) {
                c5448a = oVar.b;
                i += Math.max(1, c5448a.e);
                oVar.f |= 1;
            }
        }
        if (oVar.f <= 0) {
            return;
        }
        sg.bigo.ads.T0.p pVar = kVar2.c;
        int i4 = kVar2.k;
        if (pVar != null) {
            int i5 = pVar.b;
            if (i5 != 3) {
                if (i5 == 4) {
                    if (i4 == 1) {
                        kVar = new sg.bigo.ads.T0.k("10000-10003", "10000-10003-10001", 17, pVar);
                    } else if (i4 == 2) {
                        kVar = new sg.bigo.ads.T0.k("10000-10004", "10000-10004-10001", 18, pVar);
                    }
                }
            } else if (i4 == 1) {
                kVar = new sg.bigo.ads.T0.k("10000-10001", "10000-10001-10001", 15, pVar);
            } else if (i4 == 2) {
                kVar = new sg.bigo.ads.T0.k("10000-10002", "10000-10002-10001", 16, pVar);
            }
            if (kVar != null) {
                return;
            }
            oVar.o = kVar.l;
            sg.bigo.ads.N.f fVar = new sg.bigo.ads.N.f();
            fVar.f12466a = kVar;
            sg.bigo.ads.N.f fVar2 = (sg.bigo.ads.N.f) fVar.withSlotId(kVar.l);
            fVar2.e = i;
            fVar2.c = oVar.f;
            fVar2.b = kVar2;
            fVar2.f = oVar.g;
            fVar2.d = 1;
            sg.bigo.ads.N.d dVar2 = oVar.f13248a.d;
            if (dVar2 != null) {
                ((sg.bigo.ads.N.f) ((sg.bigo.ads.N.f) fVar2.withAge(dVar2.d)).withActivatedTime(dVar2.f)).withGender(dVar2.e);
            }
            sg.bigo.ads.api.a aVar = new sg.bigo.ads.api.a();
            aVar.f12685a = new C5433d(oVar);
            new IconAdsLoader(aVar).loadAd(fVar2.build());
            return;
        }
        kVar = null;
        if (kVar != null) {
        }
    }

    public final void h0() {
        View findViewById;
        ViewGroup viewGroup = this.m;
        if (viewGroup == null || (findViewById = viewGroup.findViewById(R.id.inter_slide_gesture_contain)) == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new C5135L(findViewById));
        findViewById.startAnimation(alphaAnimation);
        findViewById.setVisibility(8);
    }

    public void i0() {
        this.J = new Y0(this.f12687a, ((C5185l1) this.e).D(), (InterfaceC5087a) ((C5185l1) this.e).W.e(), this.t, r(), this.B, new RunnableC5180k(this), new RunnableC5183l(this), new RunnableC5186m(this));
        AbstractC5446j.a(2, null, new RunnableC5189n(this), 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j0() {
        sg.bigo.ads.y.i iVar;
        int i;
        int i2;
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar == null || !this.v) {
            sg.bigo.ads.T0.q qVar2 = this.s;
            if (qVar2 != null) {
                a(qVar2);
                return;
            }
            return;
        }
        Activity activity = this.f12687a;
        sg.bigo.ads.C.l lVar = this.l;
        boolean r = r();
        if (qVar != null && lVar != null && !r) {
            if (activity != null) {
                i2 = activity.getResources().getDisplayMetrics().widthPixels;
                i = activity.getResources().getDisplayMetrics().heightPixels;
            } else {
                i = 0;
                i2 = 0;
            }
            sg.bigo.ads.U.r rVar = new sg.bigo.ads.U.r(i2, i);
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("layer.ad_component_layout"));
            int intValue = a2 != null ? a2.intValue() : 0;
            if (intValue == 1) {
                iVar = new sg.bigo.ads.y.j(lVar, qVar, rVar);
            } else if (intValue == 2) {
                iVar = new sg.bigo.ads.y.l(lVar, qVar, rVar);
            } else if (intValue == 3) {
                iVar = new sg.bigo.ads.y.m(lVar, qVar, rVar);
            }
            this.M = iVar;
            if (iVar != null) {
                iVar.f = this.c;
            }
            this.L = new sg.bigo.ads.q.o((C5185l1) this.e, this.t, iVar);
            a(this.t);
            sg.bigo.ads.C.l lVar2 = this.l;
            lVar2.getClass();
            lVar2.O = new WeakReference(this);
        }
        iVar = null;
        this.M = iVar;
        if (iVar != null) {
        }
        this.L = new sg.bigo.ads.q.o((C5185l1) this.e, this.t, iVar);
        a(this.t);
        sg.bigo.ads.C.l lVar22 = this.l;
        lVar22.getClass();
        lVar22.O = new WeakReference(this);
    }

    public final void k(int i) {
        synchronized (this.q) {
            this.q.remove(Integer.valueOf(i));
        }
    }

    public final boolean k0() {
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.is_endpage"));
            if (1 == (a2 != null ? a2.intValue() : 1)) {
                return true;
            }
        }
        return false;
    }

    public void l(int i) {
        Y0 y0;
        sg.bigo.ads.C.l lVar;
        C5485f C;
        sg.bigo.ads.q.o oVar = this.L;
        if (oVar != null) {
            sg.bigo.ads.q.h hVar = oVar.g;
            if (i == 0) {
                hVar.f13241a = 1;
            } else if (i == 1) {
                hVar.f13241a = 3;
            } else if (i == 9) {
                hVar.f13241a = 4;
            } else if (i != 10) {
                hVar.getClass();
            } else {
                hVar.f13241a = 2;
            }
        }
        synchronized (this.q) {
            k(i);
            this.q.add(0, Integer.valueOf(i));
        }
        int f0 = f0();
        int d0 = d0();
        if (d0 != f0) {
            if (f0 == 0) {
                C5485f c5485f = this.A;
                if (c5485f != null) {
                    c5485f.a(1, 2);
                }
            } else if (f0 == 1 && (C = ((C5185l1) this.e).C()) != null) {
                C.a(2, 2);
            }
        }
        sg.bigo.ads.C.l lVar2 = this.l;
        if (lVar2 != null) {
            lVar2.h0.put(Integer.valueOf(lVar2.g0), Integer.valueOf(lVar2.D));
            lVar2.g0 = i;
            Integer num = (Integer) lVar2.h0.get(Integer.valueOf(i));
            if (num == null) {
                num = 0;
            }
            lVar2.D = num.intValue();
        }
        if (((i == 0) | (i == 1) | (i == 2) | (i == 4) | (i == 5) | (i == 6) | (i == 7) | (i == 8) | (i == 9) | (i == 14)) && (lVar = this.l) != null) {
            ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).L0 = SystemClock.elapsedRealtime();
        }
        if (i != 0 && i != 10 && i != 3 && (y0 = this.J) != null) {
            y0.m = false;
        }
        if (d0 == 0) {
            C5485f c5485f2 = this.A;
            if (c5485f2 != null) {
                c5485f2.a(1, 1);
            }
            this.N.a(2);
            return;
        }
        if (d0 != 1) {
            if (d0 != 2) {
                if (d0 == 4) {
                    this.N.a(7);
                    return;
                }
                if (d0 == 5) {
                    this.N.a(6);
                    Q1 q1 = this.z;
                    if (q1 != null && q1.d) {
                        return;
                    }
                } else if (d0 != 14) {
                    switch (d0) {
                        case 7:
                            this.N.a(8);
                            Q1 q12 = this.z;
                            if (q12 != null && q12.d) {
                                return;
                            }
                            break;
                        case 8:
                        case 9:
                            break;
                        case 10:
                            this.N.a(3);
                            return;
                        default:
                            return;
                    }
                } else {
                    this.N.a(9);
                    Q1 q13 = this.z;
                    if (q13 != null && q13.d) {
                        return;
                    }
                }
            }
            h(R.drawable.bigo_ad_ic_close);
            this.N.a(5);
            return;
        }
        C5485f C2 = ((C5185l1) this.e).C();
        if (C2 != null) {
            C2.a(2, 1);
        }
        this.N.a(4);
        Q1 q14 = this.z;
        if (q14 != null && q14.d) {
            return;
        }
        h(R.drawable.bigo_ad_ic_close);
    }

    public final boolean l0() {
        sg.bigo.ads.T0.q qVar;
        if (!(this instanceof sg.bigo.ads.w.b) || (qVar = this.t) == null) {
            return false;
        }
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ep_sprt"));
        return 1 == (a2 != null ? a2.intValue() : 0);
    }

    public final void m(int i) {
        StringBuilder append;
        StringBuilder sb;
        ViewGroup viewGroup = this.m;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.m.findViewById(R.id.inter_ad_label);
        if (r()) {
            if (TextUtils.isEmpty(this.D) || textView2 == null || textView2.getContext() == null) {
                return;
            }
            String a2 = AbstractC4944a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]);
            if (!p0()) {
                sb = new StringBuilder().append(this.D).append(" · ").append(a2);
                textView2.setText(sb.toString());
            }
            append = new StringBuilder().append(a2);
        } else {
            if (textView == null || textView2 == null) {
                return;
            }
            if (TextUtils.isEmpty(this.D)) {
                textView.setVisibility(8);
                return;
            }
            if (!p0()) {
                if (i != R.layout.bigo_ad_activity_interstitial_native_top) {
                    textView.bringToFront();
                }
                textView.setText(this.D);
                textView.setPadding(AbstractC4963u.a(this.m.getContext(), 4), AbstractC4963u.a(textView.getContext(), 1), AbstractC4963u.a(textView.getContext(), 4), AbstractC4963u.a(textView.getContext(), 1));
                textView2.setText(R.string.bigo_ad_tag);
                return;
            }
            textView.setVisibility(8);
            append = new StringBuilder().append(AbstractC4944a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]));
        }
        sb = append.append(" · ").append(this.D);
        textView2.setText(sb.toString());
    }

    public final boolean m0() {
        if (d0() != 0 || !this.V) {
            return false;
        }
        Object X = X();
        if (X instanceof InterfaceC5477g) {
            return ((C5408w) ((InterfaceC5477g) X)).P;
        }
        return false;
    }

    public final boolean n0() {
        int d0 = d0();
        return d0 == 2 || d0 == 6 || d0 == 8 || d0 == 9;
    }

    public boolean o0() {
        if (!this.v) {
            return false;
        }
        switch (T()) {
            case 6:
                this.y = false;
                this.x = false;
                break;
            case 7:
            case 8:
            case 9:
                this.y = false;
                this.x = false;
                break;
            case 10:
                this.y = false;
                this.x = true;
                break;
            case 11:
            case 12:
                this.y = true;
                this.x = false;
                break;
            default:
                this.y = false;
                this.x = false;
                break;
        }
        return false;
    }

    public final boolean p0() {
        int G = G();
        return G == R.layout.bigo_ad_activity_interstitial_percent_warning || G == R.layout.bigo_ad_activity_interstitial_percent_warning_landscape;
    }

    public void q0() {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            adCountDownButton.setAlpha(1.0f);
        }
        l(f0());
        q();
        if (d0() == 0) {
            S();
        }
    }

    public void r0() {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            adCountDownButton.setAlpha(0.0f);
        }
        l(10);
    }

    public final boolean s0() {
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar == null) {
            return false;
        }
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.show_time"));
        if ((a2 != null ? a2.intValue() : 0) <= 0 || k0()) {
            return false;
        }
        sg.bigo.ads.T0.q qVar2 = this.t;
        return ((qVar2 != null && qVar2.b("layer.is_show_layer") == 1) || this.H.get()) ? false : true;
    }

    public final void t0() {
        ViewGroup viewGroup;
        int i;
        if (!p0() || (viewGroup = this.m) == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_title);
        TextView textView2 = (TextView) this.m.findViewById(R.id.inter_description);
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.background_colour"));
            i = a2 != null ? a2.intValue() : 0;
        } else {
            i = -1;
        }
        int i2 = i == 1 ? ViewCompat.MEASURED_STATE_MASK : -1;
        if (textView != null) {
            textView.setTextColor(i2);
        }
        if (textView2 != null) {
            textView2.setTextColor(i2);
        }
    }

    public abstract void u0();

    public void v0() {
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar == null || !this.v) {
            return;
        }
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.close_button_style"));
        int intValue = a2 != null ? a2.intValue() : 0;
        h(intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? R.drawable.bigo_ad_ic_close : R.drawable.bigo_ad_ic_close5 : R.drawable.bigo_ad_ic_close4 : R.drawable.bigo_ad_ic_close3 : R.drawable.bigo_ad_ic_close2);
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void w() {
        super.w();
        this.C.removeCallbacksAndMessages(null);
        sg.bigo.ads.q.o oVar = this.L;
        if (oVar != null) {
            IconAds iconAds = oVar.e;
            if (iconAds != null) {
                iconAds.destroy();
            }
            C5436g c5436g = oVar.l;
            if (c5436g != null) {
                c5436g.a();
                oVar.l = null;
            }
            C5436g c5436g2 = oVar.m;
            if (c5436g2 != null) {
                c5436g2.a();
                oVar.m = null;
            }
            oVar.q.clear();
            oVar.r.clear();
            oVar.s.clear();
            oVar.t.clear();
            oVar.n = true;
            oVar.b();
            oVar.c();
        }
        sg.bigo.ads.Z.c.b(this.g, this.Q);
    }

    public void w0() {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton == null) {
            return;
        }
        sg.bigo.ads.Z.c.a(adCountDownButton, this.Q);
    }

    public final void x0() {
        ViewGroup viewGroup;
        sg.bigo.ads.T0.q qVar;
        if ((X() instanceof AbstractC5391n) || (viewGroup = this.m) == null) {
            return;
        }
        View findViewById = viewGroup.findViewById(R.id.inter_download_msg);
        if (findViewById != null) {
            Y y = this.B;
            if (y == null || !y.d) {
                findViewById.setVisibility(8);
                return;
            }
            Button button = (Button) viewGroup.findViewById(R.id.inter_btn_cta);
            if (button != null) {
                button.setText(R.string.bigo_ad_cta_download_default);
            }
            X().a(viewGroup, findViewById, V(), 8, this.z.i, new View[0]);
        }
        if (r()) {
            IconListView iconListView = (IconListView) viewGroup.findViewById(R.id.inter_iconlist_download_msg_list);
            if (this.B == null || iconListView == null) {
                return;
            }
            boolean z = true;
            if (r() && p0() && (qVar = this.t) != null) {
                Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.background_colour"));
                int intValue = a2 != null ? a2.intValue() : 0;
                if (!r() ? intValue == 1 : intValue == 1) {
                    z = false;
                }
            }
            iconListView.setThemeWhite(z);
            iconListView.a(this.B);
            iconListView.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0() {
        ViewGroup viewGroup;
        View findViewById;
        int i;
        Bitmap a2;
        if (!r() || (viewGroup = this.m) == null || (findViewById = viewGroup.findViewById(R.id.inter_ad_info_card_right_bottom)) == null) {
            return;
        }
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.inter_star);
        View findViewById2 = findViewById.findViewById(R.id.bigo_ad_info_card_background);
        if (imageView != null && findViewById2 != 0) {
            Y y = this.B;
            String str = y != null ? y.c : "";
            if (this.l != null && sg.bigo.ads.K0.I.a((CharSequence) str)) {
                str = this.l.getCreativeId();
            }
            float a3 = (sg.bigo.ads.C.x.a(4, str) * 0.5f) + 3.5f;
            T t = new T();
            TextView textView = (TextView) findViewById.findViewById(R.id.inter_title);
            TextView textView2 = (TextView) findViewById.findViewById(R.id.inter_description);
            if (textView != null) {
                t.a(textView);
            }
            if (textView2 != null) {
                t.a(textView2);
            }
            sg.bigo.ads.T0.q qVar = this.t;
            if (qVar != null) {
                Integer a4 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.card_background_colour"));
                i = a4 != null ? a4.intValue() : 0;
            } else {
                i = -1;
            }
            if (i == 1) {
                a2 = AbstractC4962t.a(this.m.getContext(), a3, R.drawable.bigo_ad_ic_star, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half, false);
                findViewById2.setBackgroundColor(-1);
                t.a(-1);
            } else {
                if (i == 2) {
                    findViewById2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                    t.a(ViewCompat.MEASURED_STATE_MASK);
                } else {
                    float a5 = AbstractC4963u.a(imageView.getContext(), 12);
                    C5431b c5431b = new C5431b(a5, a5, a5, a5, null, 0.0f, null, new C5192o().j);
                    Drawable drawable = c5431b.j;
                    if (drawable != null) {
                        findViewById2.setBackground(drawable);
                    } else if (findViewById2 instanceof sg.bigo.ads.M0.c) {
                        ((sg.bigo.ads.M0.c) findViewById2).setBlurStyle(c5431b);
                    }
                }
                a2 = AbstractC4962t.a(this.m.getContext(), a3, R.drawable.bigo_ad_ic_star_white, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half_white, false);
            }
            if (a2 != null) {
                imageView.setImageBitmap(a2);
                imageView.setVisibility(0);
            }
        }
        findViewById.post(new RunnableC5195p(findViewById));
    }

    public void z0() {
        MediaView mediaView;
        YandexWarningTextView yandexWarningTextView;
        ViewGroup viewGroup = this.m;
        sg.bigo.ads.C.l lVar = this.l;
        if (viewGroup == null || lVar == null) {
            return;
        }
        sg.bigo.ads.R.b.h = r();
        if (o0() && ((sg.bigo.ads.U0.b) ((InterfaceC5087a) ((C5185l1) this.e).W.e())).k == 2) {
            sg.bigo.ads.R.b.g = 1;
        }
        ViewGroup viewGroup2 = this.m;
        if (viewGroup2 != null && (mediaView = (MediaView) viewGroup2.findViewById(R.id.inter_media)) != null && p0()) {
            mediaView.setImageBlurBorder(false);
            ViewGroup viewGroup3 = this.m;
            sg.bigo.ads.C.l lVar2 = this.l;
            if (viewGroup3 != null && (yandexWarningTextView = (YandexWarningTextView) viewGroup3.findViewById(R.id.inter_warning)) != null) {
                if (lVar2 != null && ((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar2.e())).p != null && ((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar2.e())).p.f >= 0) {
                    int i = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar2.e())).p.f;
                    View findViewById = viewGroup3.findViewById(R.id.inter_ad_info_exclude_warning);
                    MediaView mediaView2 = (MediaView) viewGroup3.findViewById(R.id.inter_media);
                    RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) viewGroup3.findViewById(R.id.inter_media_layout);
                    float f = i * 0.01f;
                    float f2 = f > 0.15f ? 0.15f : f;
                    if (findViewById != null) {
                        yandexWarningTextView.setIsHorizontal(false);
                        sg.bigo.ads.K0.X.a(findViewById, new ViewTreeObserverOnGlobalLayoutListenerC5148b1(findViewById, yandexWarningTextView, roundedFrameLayout, f2, viewGroup3, lVar2, mediaView2, i));
                    } else if (i != 0) {
                        yandexWarningTextView.setIsHorizontal(true);
                        yandexWarningTextView.post(new RunnableC5152c1(yandexWarningTextView, f2, lVar2, roundedFrameLayout, mediaView2));
                    }
                }
                yandexWarningTextView.setVisibility(8);
            }
        }
        X().a(viewGroup, viewGroup, V(), M() ? 8 : 1, this.z.i, this.g);
    }

    public final void a(sg.bigo.ads.T0.q qVar) {
        if (qVar == null) {
            return;
        }
        this.A = ((C5185l1) this.e).E();
        sg.bigo.ads.P.c cVar = (InterfaceC5087a) ((C5185l1) this.e).W.e();
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.gp_element"));
        int intValue = a2 != null ? a2.intValue() : 0;
        Integer a3 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.gp_force_time"));
        this.B = new Y(intValue, a3 != null ? a3.intValue() : 0, cVar != null ? ((sg.bigo.ads.U0.b) cVar).U : "");
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void g(int i) {
        super.g(i);
        if (this.m == null) {
            return;
        }
        ((C5185l1) this.e).a0 = this.N;
        F1 X = X();
        if (X instanceof AbstractC5391n) {
            if (X instanceof sg.bigo.ads.n.U0) {
                sg.bigo.ads.n.U0 u0 = (sg.bigo.ads.n.U0) X;
                ViewGroup viewGroup = this.m;
                Q1 q1 = this.z;
                C5485f c5485f = this.A;
                Y y = this.B;
                u0.K = c5485f;
                u0.a(this, viewGroup, q1, c5485f.f13330a, y);
            } else {
                ((AbstractC5391n) X).a(this, this.m, this.z, this.t, this.B);
            }
            A0();
        }
        v0();
        Z();
        C0();
        x0();
        z0();
        B0();
        l(0);
        u0();
        sg.bigo.ads.P.c cVar = (InterfaceC5087a) ((C5185l1) this.e).W.e();
        boolean z = this.v;
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
        bVar.getClass();
        bVar.P = z ? 1 : 2;
        a(this.m);
        w0();
        a(this.z.b * 1000);
        y0();
        t0();
        i0();
    }

    public void e(int i) {
        this.V = false;
        RunnableC5177j runnableC5177j = this.W;
        if (runnableC5177j != null) {
            AbstractC5446j.a(2, null, runnableC5177j, 0L);
            this.W = null;
        } else if (this.i.get()) {
            S();
        }
    }

    public final void c(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.O) {
            for (Object obj : objArr) {
                if (obj != null) {
                    this.O.put(obj, 1);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LandingPageStyleConfig a(Context context, String str, int i, boolean z) {
        int a2;
        int i2;
        int a3;
        float f;
        Integer a4;
        Integer a5;
        Y0 y0;
        int i3;
        int a6;
        Integer a7;
        sg.bigo.ads.T0.q qVar = null;
        r10 = null;
        sg.bigo.ads.T0.q qVar2 = null;
        LandingPageStyleConfig landingPageStyleConfig = null;
        qVar = null;
        if (z) {
            int d0 = d0();
            if (d0 != 0) {
                if (d0 == 9) {
                    sg.bigo.ads.T0.q qVar3 = this.t;
                    if (qVar3 == null || !this.v) {
                        qVar3 = null;
                    }
                    int a8 = AbstractC5391n.a(qVar3, "layer.webview_layout");
                    if (j(a8)) {
                        return null;
                    }
                    return new LandingPageStyleConfig(i(a8), 9, a8, AbstractC5391n.a(qVar3, "layer.webview_force_time", "layer.webview_force_time_new"), 0, 0, 0.0f);
                }
                if (d0 != 10) {
                    return null;
                }
                sg.bigo.ads.T0.q qVar4 = this.t;
                if (qVar4 == null || !this.v) {
                    qVar4 = null;
                }
                int a9 = AbstractC5391n.a(qVar4, "layer.webview_layout");
                if (j(a9)) {
                    return null;
                }
                return new LandingPageStyleConfig(i(a9), 10, a9, AbstractC5391n.a(qVar4, "layer.webview_force_time", "layer.webview_force_time_new"), 0, 0, 0.0f);
            }
            F1 X = X();
            sg.bigo.ads.T0.q qVar5 = this.t;
            if (qVar5 == null || !this.v) {
                qVar5 = null;
            }
            boolean z2 = X instanceof InterfaceC5477g;
            if (z2) {
                C5408w c5408w = (C5408w) ((InterfaceC5477g) X);
                if (c5408w.O == -1) {
                    sg.bigo.ads.T0.q qVar6 = c5408w.x;
                    c5408w.O = (qVar6 == null || (a7 = sg.bigo.ads.K0.z.a(qVar6.a("video_play_page.webview_layout"))) == null) ? 0 : a7.intValue();
                }
                int i4 = c5408w.O;
                switch (i4) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        i3 = i4;
                        break;
                }
                if (!j(i3)) {
                    return null;
                }
                if (z2) {
                    a6 = AbstractC5391n.a(((C5408w) ((InterfaceC5477g) X)).x, "video_play_page.webview_force_time", "video_play_page.webview_force_time_new");
                } else {
                    a6 = AbstractC5391n.a(qVar5, "video_play_page.webview_force_time", "video_play_page.webview_force_time_new");
                }
                return new LandingPageStyleConfig(i(i3), 0, i3, a6, 0, 0, 0.0f);
            }
            r11 = AbstractC5391n.a(qVar5, "video_play_page.webview_layout");
            i3 = r11;
            if (!j(i3)) {
            }
        } else {
            int d02 = d0();
            if (d02 == 0) {
                F1 X2 = X();
                sg.bigo.ads.T0.q qVar7 = this.t;
                if (qVar7 != null && this.v) {
                    qVar = qVar7;
                }
                boolean z3 = X2 instanceof InterfaceC5477g;
                if (z3) {
                    C5408w c5408w2 = (C5408w) ((InterfaceC5477g) X2);
                    if (c5408w2.O == -1) {
                        sg.bigo.ads.T0.q qVar8 = c5408w2.x;
                        c5408w2.O = (qVar8 == null || (a5 = sg.bigo.ads.K0.z.a(qVar8.a("video_play_page.webview_layout"))) == null) ? 0 : a5.intValue();
                    }
                    a2 = c5408w2.O;
                    switch (a2) {
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
                            i2 = 0;
                            break;
                    }
                    if (!z3) {
                        a3 = AbstractC5391n.a(((C5408w) ((InterfaceC5477g) X2)).x, "video_play_page.webview_force_time", "video_play_page.webview_force_time_new");
                    } else {
                        a3 = AbstractC5391n.a(qVar, "video_play_page.webview_force_time", "video_play_page.webview_force_time_new");
                    }
                    int i5 = a3;
                    if (z3) {
                        C5408w c5408w3 = (C5408w) ((InterfaceC5477g) X2);
                        if (c5408w3.O == -1) {
                            sg.bigo.ads.T0.q qVar9 = c5408w3.x;
                            c5408w3.O = (qVar9 == null || (a4 = sg.bigo.ads.K0.z.a(qVar9.a("video_play_page.webview_layout"))) == null) ? 0 : a4.intValue();
                        }
                        int i6 = c5408w3.O;
                        switch (i6) {
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
                                i6 = 0;
                                break;
                        }
                        if (i6 == 5 || i6 == 6) {
                            f = 0.67f;
                            float f2 = f;
                            Class i7 = i(i2);
                            ViewGroup viewGroup = this.m;
                            int measuredHeight = viewGroup != null ? viewGroup.getMeasuredHeight() : 0;
                            Integer a10 = AbstractC5164f1.a((NativeAd) this.l);
                            landingPageStyleConfig = new LandingPageStyleConfig(i7, 0, i2, i5, measuredHeight, a10 != null ? a10.intValue() : 0, f2);
                        }
                    }
                    f = 0.8f;
                    float f22 = f;
                    Class i72 = i(i2);
                    ViewGroup viewGroup2 = this.m;
                    if (viewGroup2 != null) {
                    }
                    Integer a102 = AbstractC5164f1.a((NativeAd) this.l);
                    landingPageStyleConfig = new LandingPageStyleConfig(i72, 0, i2, i5, measuredHeight, a102 != null ? a102.intValue() : 0, f22);
                } else {
                    a2 = AbstractC5391n.a(qVar, "video_play_page.webview_layout");
                }
                i2 = a2;
                if (!z3) {
                }
                int i52 = a3;
                if (z3) {
                }
                f = 0.8f;
                float f222 = f;
                Class i722 = i(i2);
                ViewGroup viewGroup22 = this.m;
                if (viewGroup22 != null) {
                }
                Integer a1022 = AbstractC5164f1.a((NativeAd) this.l);
                landingPageStyleConfig = new LandingPageStyleConfig(i722, 0, i2, i52, measuredHeight, a1022 != null ? a1022.intValue() : 0, f222);
            } else if (d02 == 9) {
                landingPageStyleConfig = e0();
            } else if (d02 == 10) {
                sg.bigo.ads.T0.q qVar10 = this.t;
                if (qVar10 != null && this.v) {
                    qVar2 = qVar10;
                }
                int a11 = AbstractC5391n.a(qVar2, "layer.webview_layout");
                int a12 = AbstractC5391n.a(qVar2, "layer.webview_force_time", "layer.webview_force_time_new");
                Class i8 = i(a11);
                ViewGroup viewGroup3 = this.m;
                int measuredHeight2 = viewGroup3 != null ? viewGroup3.getMeasuredHeight() : 0;
                Integer a13 = AbstractC5164f1.a((NativeAd) this.l);
                LandingPageStyleConfig landingPageStyleConfig2 = new LandingPageStyleConfig(i8, 10, a11, a12, measuredHeight2, a13 != null ? a13.intValue() : 0, 0.8f);
                if (a11 != 0 && (y0 = this.J) != null) {
                    y0.b();
                }
                landingPageStyleConfig = landingPageStyleConfig2;
            }
            C5476f.a(landingPageStyleConfig);
            return landingPageStyleConfig;
        }
    }

    public void a(int i) {
        this.V = true;
    }

    public boolean a(MotionEvent motionEvent, sg.bigo.ads.t.l lVar, int i) {
        View view;
        boolean z;
        AdCountDownButton adCountDownButton = this.g;
        boolean z2 = false;
        if (adCountDownButton != null) {
            if ((motionEvent == null || adCountDownButton.j == null) ? false : sg.bigo.ads.K0.X.c((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), adCountDownButton.j)) {
                if (motionEvent.getAction() == 1) {
                    if (lVar != null) {
                        if (lVar.f13313a.N()) {
                            z = false;
                        } else {
                            lVar.f13313a.f(0);
                            z = true;
                        }
                        if (z) {
                            z2 = true;
                        }
                    }
                    if (z2 && this.W == null) {
                        if (this.V) {
                            this.W = new RunnableC5177j(this);
                        } else {
                            AdCountDownButton adCountDownButton2 = this.g;
                            if (adCountDownButton2 != null && (view = adCountDownButton2.j) != null) {
                                view.performClick();
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void a(long j) {
        if (j <= 0) {
            E0();
            return;
        }
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null && adCountDownButton.getVisibility() == 0) {
            this.g.clearAnimation();
            this.g.setVisibility(4);
        }
        this.C.removeCallbacks(this.Z);
        this.C.postDelayed(this.Z, j);
    }

    public final void a(View view, int i, sg.bigo.ads.d1.u uVar, int i2) {
        ViewGroup viewGroup = this.m;
        if (viewGroup == null) {
            AbstractC5496a.a("InterstitialNativeActivityImpl", "Failed to set ad click due to native ad view is null.");
        } else {
            sg.bigo.ads.C.f.a(viewGroup, view, i, uVar, i2);
        }
    }

    public void a(ViewGroup viewGroup) {
        MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.setTag(5);
        }
        if (this.z.f12848a) {
            viewGroup.setTag(11);
            a(viewGroup, 1, ((C5185l1) this.e).D(), this.z.i);
            if (mediaView != null) {
                ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) mediaView.getViewImpl())).a(false);
                return;
            }
            return;
        }
        if (this.v) {
            if (!(X() instanceof AbstractC5391n) && mediaView != null) {
                a(mediaView, 8, ((C5185l1) this.e).D(), this.z.i);
                if (this.z.f) {
                    mediaView.setMediaAreaClickable(true);
                    ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) mediaView.getViewImpl())).a(false);
                } else {
                    mediaView.setMediaAreaClickable(false);
                    ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) mediaView.getViewImpl())).a(true);
                }
            }
            if (!(X() instanceof AbstractC5391n)) {
                View findViewById = viewGroup.findViewById(R.id.inter_media_container);
                if (o0()) {
                    findViewById = viewGroup.findViewById(R.id.inter_media_layout);
                }
                if (findViewById != null) {
                    findViewById.setTag(9);
                    if (this.z.g) {
                        if (mediaView != null) {
                            mediaView.setOtherClickAreaClick(true);
                        }
                        a(findViewById, 8, ((C5185l1) this.e).D(), this.z.i);
                    } else {
                        if (mediaView != null) {
                            mediaView.setOtherClickAreaClick(false);
                        }
                        a(findViewById, 8, AbstractC5144a1.p, 0);
                    }
                }
            }
            if (X() instanceof AbstractC5391n) {
                return;
            }
            View findViewById2 = viewGroup.findViewById(R.id.inter_ad_info);
            if (p0() && r()) {
                findViewById2 = viewGroup.findViewById(R.id.inter_ad_info_inner);
            }
            if (findViewById2 == null) {
                return;
            }
            findViewById2.setTag(18);
            if (o0()) {
                findViewById2 = viewGroup.findViewById(R.id.inter_media_container);
                findViewById2.setTag(18);
            }
            if (this.z.h) {
                a(findViewById2, 8, ((C5185l1) this.e).D(), this.z.i);
                return;
            } else {
                a(findViewById2, 8, AbstractC5144a1.p, 0);
                return;
            }
        }
        a(viewGroup, 8, (sg.bigo.ads.d1.u) null, 0);
    }

    public final boolean a(Object obj, Runnable runnable) {
        Integer num;
        if (obj == null || runnable == null) {
            return false;
        }
        synchronized (this.O) {
            num = (Integer) this.O.get(obj);
        }
        if (num == null) {
            runnable.run();
            return false;
        }
        synchronized (this.P) {
            WeakHashMap weakHashMap = (WeakHashMap) this.P.get(num);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                this.P.put(num, weakHashMap);
            }
            weakHashMap.put(obj, runnable);
        }
        return true;
    }

    public final void a(View view) {
        sg.bigo.ads.q.o oVar = this.L;
        if (oVar == null || !(view instanceof ViewGroup)) {
            return;
        }
        sg.bigo.ads.q.o.a(oVar.j, oVar.h);
        sg.bigo.ads.q.o oVar2 = this.L;
        ViewGroup viewGroup = (ViewGroup) view;
        oVar2.p = false;
        sg.bigo.ads.s1.b.a((InterfaceC5087a) oVar2.f13248a.W.e(), 2);
        if (viewGroup == null) {
            oVar2.a(oVar2.c, "layerView is null", 2);
            return;
        }
        sg.bigo.ads.r.d dVar = oVar2.c;
        if (dVar != null) {
            int i = dVar.f13264a;
            if (i != 0 && i != 1 && i != 2 && i != 3) {
                i = 0;
            }
            if (i != 0) {
                if (!((oVar2.f & 2) == 2)) {
                    oVar2.a(dVar, "icon request hasScene return false", 2);
                    return;
                }
                oVar2.c();
                C5430a c5430a = oVar2.k;
                if (c5430a != null) {
                    ViewFlow viewFlow = c5430a.b;
                    viewFlow.b = false;
                    viewFlow.a(false);
                    sg.bigo.ads.K0.X.c(oVar2.k.f13238a);
                }
                oVar2.k = null;
                C5435f c5435f = new C5435f(oVar2, viewGroup, oVar2.c, viewGroup);
                oVar2.i = c5435f;
                c5435f.b();
                return;
            }
        }
        oVar2.a(dVar, "config is invalid", 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, int i, boolean z, int i2, boolean z2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (!(view instanceof FrameLayout) && !(view instanceof RelativeLayout)) {
            AbstractC5496a.a("InterstitialNativeActivityImpl", "Failed to update up or below area click due to unsupported view.");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        if (i > 0) {
            View view2 = new View(context);
            view2.setId(R.id.bigo_ad_interstitial_below_area_click);
            view2.setTag(25);
            if (viewGroup instanceof FrameLayout) {
                layoutParams2 = new FrameLayout.LayoutParams(-1, AbstractC4963u.a(context, i), 80);
            } else {
                if (viewGroup instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, AbstractC4963u.a(context, i));
                    layoutParams3.addRule(12);
                    layoutParams2 = layoutParams3;
                }
                ViewGroup viewGroup2 = this.m;
                if (z) {
                    if (viewGroup2 != null) {
                        sg.bigo.ads.C.f.a(viewGroup2, view2, i3, new C5166g(view), i4);
                    }
                } else if (viewGroup2 != null) {
                    a(view2, i3, ((C5185l1) this.e).D(), i4);
                }
            }
            viewGroup.addView(view2, layoutParams2);
            ViewGroup viewGroup22 = this.m;
            if (z) {
            }
        }
        if (i2 <= 0) {
            return;
        }
        View view3 = new View(context);
        view3.setTag(24);
        if (!(viewGroup instanceof FrameLayout)) {
            if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC4963u.a(context, i2));
            }
            if (z2) {
                if (this.l != null) {
                    sg.bigo.ads.C.f.a(this.m, view3, i3, new C5170h(view), i4);
                    return;
                }
                return;
            } else {
                if (this.m != null) {
                    a(view3, i3, ((C5185l1) this.e).D(), i4);
                    return;
                }
                return;
            }
        }
        layoutParams = new FrameLayout.LayoutParams(-1, AbstractC4963u.a(context, i2));
        viewGroup.addView(view3, layoutParams);
        if (z2) {
        }
    }
}

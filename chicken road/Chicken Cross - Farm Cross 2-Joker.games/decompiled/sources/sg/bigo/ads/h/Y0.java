package sg.bigo.ads.h;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.AutoNextLineLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class Y0 {
    public ArrayList A;
    public long B;
    public long C;
    public boolean D;
    public D0 E;
    public Runnable F;
    public Runnable G;
    public V0 M;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12865a;
    public final sg.bigo.ads.C.l b;
    public final sg.bigo.ads.P.c c;
    public final Y d;
    public final sg.bigo.ads.T0.q e;
    public Runnable f;
    public final Runnable g;
    public Runnable h;
    public FrameLayout i;
    public FrameLayout j;
    public AlertDialog k;
    public View l;
    public final boolean u;
    public boolean v;
    public int w;
    public long y;
    public int z;
    public boolean m = true;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public int x = 0;
    public final ArrayList H = new ArrayList();
    public final U0 I = new U0(this);
    public final T0 J = new T0();
    public final W0 K = new W0();
    public final X0 L = new X0();
    public boolean N = false;
    public int O = 0;

    public Y0(Activity activity, sg.bigo.ads.C.l lVar, InterfaceC5087a interfaceC5087a, sg.bigo.ads.T0.q qVar, boolean z, Y y, RunnableC5180k runnableC5180k, RunnableC5183l runnableC5183l, RunnableC5186m runnableC5186m) {
        this.u = false;
        this.f12865a = activity;
        this.b = lVar;
        this.c = interfaceC5087a;
        this.d = y;
        this.e = qVar;
        this.u = z;
        this.f = runnableC5180k;
        this.g = runnableC5183l;
        this.h = runnableC5186m;
    }

    public static boolean a(Y0 y0) {
        boolean z;
        Context context = y0.f12865a;
        sg.bigo.ads.C.l lVar = y0.b;
        sg.bigo.ads.P.c cVar = y0.c;
        sg.bigo.ads.T0.q qVar = y0.e;
        if (context == null || lVar == null || cVar == null || qVar == null || (z = y0.p)) {
            return false;
        }
        int i = y0.w;
        boolean z2 = y0.v;
        View view = y0.l;
        boolean z3 = y0.n;
        boolean z4 = y0.o;
        if (!z3 || view == null) {
            if (z4) {
                AbstractC5496a.a("InterstitialMidPageRenderer", "Failed to show mid page due to unavailable.");
                return false;
            }
            if (z3 || view == null) {
                AbstractC5496a.a("InterstitialMidPageRenderer", "Failed to show mid page due to unknown reason.");
                return false;
            }
            if (y0.m && !z && !y0.q) {
                FrameLayout frameLayout = new FrameLayout(context);
                View a2 = AbstractC4944a.a(context, y0.u ? R.layout.bigo_ad_layout_interstitial_mid_page_loading_view_landscape : R.layout.bigo_ad_layout_interstitial_mid_page_loading_view, null, false);
                if (a2 != null) {
                    y0.r = true;
                    FrameLayout a3 = y0.a(context, y0.a(context, (View) a(context, a2, -1), true), true);
                    frameLayout.addView(a3, new FrameLayout.LayoutParams(-1, -1));
                    T0 t0 = y0.J;
                    t0.a(lVar, a2, a2, 18, T0.a(t0, lVar, t0.b ? lVar : t0.r));
                    T0 t02 = y0.J;
                    t02.a(lVar, a3, a3, 18, T0.a(t02, lVar, t02.b ? lVar : t02.r));
                    y0.j = frameLayout;
                    if (cVar instanceof InterfaceC5087a) {
                        ((sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar)).K0 = 6;
                    }
                    y0.w = 5;
                    AbstractC5446j.b(new M0(context, frameLayout, lVar, cVar, y0));
                }
            }
        } else if (y0.m && !z && !y0.q) {
            boolean z5 = i == 3;
            FrameLayout a4 = y0.a(context, y0.a(context, view, z5), z5);
            y0.p = true;
            if (cVar instanceof InterfaceC5087a) {
                y0.L.getClass();
                ((sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar)).K0 = X0.a(i, z2);
            }
            AbstractC5446j.b(new J0(y0, context, lVar, cVar, a4, i, z2));
        }
        return true;
    }

    public final void b() {
        int i = this.K.b;
        FrameLayout frameLayout = this.r ? this.j : this.i;
        if (frameLayout == null) {
            a();
            return;
        }
        I0 i0 = new I0(this, frameLayout);
        if (i != 1) {
            AbstractC5140Q.a(frameLayout, i0);
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        Interpolator a2 = AbstractC4954k.a(2);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setInterpolator(a2);
        animationSet.addAnimation(alphaAnimation);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.1f, 1.0f, 0.1f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(a2);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setAnimationListener(i0);
        frameLayout.startAnimation(animationSet);
    }

    public final void c() {
        D0 d0 = this.E;
        if (this.D || this.B <= 0 || d0 == null) {
            return;
        }
        this.D = true;
        AbstractC5446j.a(d0);
        this.B -= SystemClock.elapsedRealtime() - this.C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if ((-1) == r9.O) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z;
        D0 d0;
        sg.bigo.ads.T0.q qVar = this.e;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.is_endpage"));
            z = true;
            if ((a2 != null ? a2.intValue() : 1) == 0) {
                Integer a3 = sg.bigo.ads.K0.z.a(this.e.a("layer.is_show_layer"));
                if (!((a3 != null ? a3.intValue() : 0) == 1)) {
                }
            }
        }
        z = false;
        if (this.s && !z) {
            AbstractC5446j.a(2, null, new H0(this), 0L);
            return;
        }
        if (this.D) {
            long j = this.B;
            if (j <= 0 || (d0 = this.E) == null) {
                return;
            }
            this.D = false;
            this.C = SystemClock.elapsedRealtime();
            AbstractC5446j.a(d0);
            AbstractC5446j.a(2, null, d0, j);
        }
    }

    public final boolean a(FrameLayout frameLayout) {
        int i;
        View findViewById = frameLayout.findViewById(R.id.bigo_ad_btn_cta);
        if (findViewById != null && this.J.e) {
            AbstractC5140Q.a(findViewById);
            this.H.add(new RunnableC5205s0(findViewById));
        }
        View findViewById2 = frameLayout.findViewById(R.id.bigo_ad_btn_close);
        if (findViewById2 == null) {
            return false;
        }
        findViewById2.setOnClickListener(new K0(this));
        sg.bigo.ads.T0.q qVar = this.e;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.force_staying_time"));
            i = a2 != null ? a2.intValue() : 0;
            if (i < 0 || i > 5) {
                i = 3;
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            findViewById2.setVisibility(0);
        } else {
            findViewById2.setVisibility(4);
            AbstractC5446j.a(2, null, new L0(findViewById2), i * 1000);
        }
        return true;
    }

    public final void a() {
        Runnable runnable;
        Runnable runnable2;
        AlertDialog alertDialog = this.k;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.k = null;
            if (this.t && (runnable2 = this.g) != null) {
                runnable2.run();
                this.f = null;
            }
            if (this.I.f12856a && ((this.p || this.r) && this.t && (runnable = this.h) != null)) {
                runnable.run();
                this.h = null;
            }
        }
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.H.clear();
        D0 d0 = this.E;
        if (d0 != null) {
            AbstractC5446j.a(d0);
        }
        this.E = null;
        this.F = null;
        this.q = true;
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, sg.bigo.ads.C.l lVar, sg.bigo.ads.P.c cVar, int i) {
        Y0 y0;
        Context context2;
        View view;
        View a2;
        String[] strArr;
        boolean z;
        String str;
        sg.bigo.ads.E1.k a3;
        X0 x0;
        String str2;
        if (this.n) {
            return;
        }
        if (i > 10) {
            this.o = true;
            X0 x02 = this.L;
            int i2 = this.w;
            boolean z2 = this.v;
            x02.getClass();
            sg.bigo.ads.s1.b.b(X0.a(i2, z2), this.x, "0", cVar);
            b();
            return;
        }
        int i3 = this.z;
        ArrayList arrayList = this.A;
        if (arrayList == null || i3 >= arrayList.size()) {
            this.o = true;
            X0 x03 = this.L;
            int i4 = this.w;
            boolean z3 = this.v;
            x03.getClass();
            sg.bigo.ads.s1.b.b(X0.a(i4, z3), this.x, "0", cVar);
            b();
            return;
        }
        Integer num = (Integer) arrayList.get(i3);
        this.z++;
        int intValue = num.intValue();
        if (intValue == 1) {
            sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
            String str3 = bVar.V;
            if (TextUtils.isEmpty(str3) || !URLUtil.isNetworkUrl(str3)) {
                str3 = null;
            }
            if (TextUtils.isEmpty(str3)) {
                String str4 = bVar.U;
                if (!TextUtils.isEmpty(str4)) {
                    str = "https://play.google.com/store/apps/details?id=" + str4;
                    z = true;
                    if (!TextUtils.isEmpty(str) && (a3 = sg.bigo.ads.E1.k.a(context)) != null) {
                        T0 t0 = this.J;
                        t0.a(lVar, a3, a3, 28, T0.a(t0, lVar, lVar));
                        a3.setWebViewClient(new E0(this, context, lVar, cVar, z));
                        x0 = this.L;
                        if (x0.f12862a > 0) {
                            x0.f12862a = SystemClock.elapsedRealtime();
                            str2 = str;
                            sg.bigo.ads.s1.b.a(cVar, X0.a(1, z), 1, (String) null, 0L, false, 0, (String) null);
                        } else {
                            str2 = str;
                        }
                        a3.loadUrl(str2);
                        a2 = a(context, a3, -2);
                        y0 = this;
                        context2 = context;
                    }
                    y0 = this;
                    context2 = context;
                    view = null;
                    a2 = view;
                }
            }
            z = false;
            str = str3;
            if (!TextUtils.isEmpty(str)) {
                T0 t02 = this.J;
                t02.a(lVar, a3, a3, 28, T0.a(t02, lVar, lVar));
                a3.setWebViewClient(new E0(this, context, lVar, cVar, z));
                x0 = this.L;
                if (x0.f12862a > 0) {
                }
                a3.loadUrl(str2);
                a2 = a(context, a3, -2);
                y0 = this;
                context2 = context;
            }
            y0 = this;
            context2 = context;
            view = null;
            a2 = view;
        } else {
            if (intValue == 2) {
                sg.bigo.ads.U0.m mVar = ((sg.bigo.ads.U0.b) cVar).X;
                if (mVar != null && (strArr = mVar.e) != null && strArr.length > 0) {
                    a2 = a(context, lVar, cVar, true);
                    if (a2 != null) {
                        a(2, false);
                    }
                    y0 = this;
                    context2 = context;
                }
            } else if (intValue == 3) {
                sg.bigo.ads.U0.b bVar2 = (sg.bigo.ads.U0.b) cVar;
                String str5 = bVar2.W;
                if (TextUtils.isEmpty(str5)) {
                    view = null;
                    y0 = this;
                    context2 = context;
                    a2 = view;
                } else if (URLUtil.isNetworkUrl(str5)) {
                    ImageView imageView = new ImageView(context);
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setBackgroundColor(-1);
                    frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1, 17));
                    RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
                    roundedFrameLayout.setId(R.id.bigo_ad_btn_close);
                    roundedFrameLayout.setCornerRadius(AbstractC4963u.a(context, 12));
                    View view2 = new View(context);
                    view2.setBackgroundColor(sg.bigo.ads.K0.I.a(-7829368, "#33000000"));
                    roundedFrameLayout.addView(view2, new FrameLayout.LayoutParams(AbstractC4963u.a(context, 24), AbstractC4963u.a(context, 24), 17));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setBackground(AbstractC4944a.c(context, R.drawable.bigo_ad_ic_close));
                    roundedFrameLayout.addView(imageView2, new FrameLayout.LayoutParams(AbstractC4963u.a(context, 12), AbstractC4963u.a(context, 12), 17));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC4963u.a(context, 24), AbstractC4963u.a(context, 24), 53);
                    layoutParams.topMargin = AbstractC4963u.a(context, 18);
                    layoutParams.rightMargin = AbstractC4963u.a(context, 22);
                    frameLayout.addView(roundedFrameLayout, layoutParams);
                    RoundedFrameLayout a4 = a(context, (View) frameLayout, true);
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.addView(a4, new FrameLayout.LayoutParams(-1, -2, this.K.b != 1 ? 80 : 17));
                    this.L.b(3, 100, str5, cVar);
                    sg.bigo.ads.s0.x.a(lVar.k.e, null, str5, bVar2.T, new C0(this, frameLayout2, imageView, a4, lVar, context, cVar, str5));
                    y0 = this;
                    context2 = context;
                    a2 = frameLayout2;
                }
            } else if (intValue == 4) {
                y0 = this;
                context2 = context;
                a2 = y0.a(context2, lVar, cVar, false);
                if (a2 != null) {
                    y0.a(4, false);
                }
            } else {
                y0 = this;
                context2 = context;
                view = null;
                a2 = view;
            }
            y0 = this;
            context2 = context;
            view = null;
            a2 = view;
        }
        if (a2 != null) {
            y0.l = a2;
        } else {
            y0.a(context2, lVar, cVar, i + 1);
        }
    }

    public final void a(int i, boolean z) {
        this.n = true;
        this.w = i;
        this.v = z;
        if (this.r) {
            AbstractC5446j.a(2, null, new F0(this), 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0656 A[Catch: Exception -> 0x0701, TryCatch #3 {Exception -> 0x0701, blocks: (B:193:0x0653, B:195:0x0656, B:197:0x065e), top: B:192:0x0653 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0143 A[Catch: all -> 0x0752, TRY_LEAVE, TryCatch #1 {all -> 0x0752, blocks: (B:56:0x012c, B:59:0x0132, B:235:0x0135, B:237:0x0139, B:239:0x013d, B:240:0x0140, B:241:0x0143), top: B:55:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View a(Context context, sg.bigo.ads.C.l lVar, sg.bigo.ads.P.c cVar, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr;
        String[] strArr2;
        String str5;
        CharSequence charSequence;
        String str6;
        int i;
        View findViewById;
        int i2;
        String str7;
        String str8;
        View view;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        View view2;
        ViewGroup viewGroup;
        AutoNextLineLinearLayout autoNextLineLinearLayout;
        int i3;
        String str9;
        sg.bigo.ads.U0.b bVar;
        TextView textView5;
        TextView textView6;
        String str10;
        View view3;
        String[] strArr3;
        TextView textView7;
        Context context2;
        String str11;
        sg.bigo.ads.U0.b bVar2;
        View view4;
        ?? r6;
        boolean z2;
        String str12;
        ViewGroup viewGroup2;
        int i4;
        ViewGroup viewGroup3;
        String[] strArr4;
        String str13;
        sg.bigo.ads.U0.b bVar3;
        String str14;
        ArrayList arrayList;
        ?? r7;
        TextView textView8;
        TextView textView9;
        View findViewById2;
        float f;
        sg.bigo.ads.U0.h hVar;
        sg.bigo.ads.U0.b bVar4 = (sg.bigo.ads.U0.b) cVar;
        String str15 = bVar4.U;
        if (TextUtils.isEmpty(str15)) {
            return null;
        }
        sg.bigo.ads.U0.m mVar = bVar4.X;
        if (mVar != null) {
            str = mVar.f12576a;
            str2 = mVar.b;
            str3 = mVar.c;
            String str16 = mVar.f;
            String[] strArr5 = mVar.e;
            strArr = mVar.d;
            strArr2 = strArr5;
            str4 = str16;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            strArr = null;
            strArr2 = null;
        }
        boolean z3 = cVar instanceof InterfaceC5087a;
        if (z3) {
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) cVar;
            if ((TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) && (hVar = ((sg.bigo.ads.U0.k) interfaceC5087a).y0) != null) {
                str = hVar.c;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = ((sg.bigo.ads.U0.k) interfaceC5087a).g();
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = ((sg.bigo.ads.U0.k) interfaceC5087a).c();
            }
            if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
                if (kVar.p()) {
                    str = sg.bigo.ads.U.q.a(kVar.j(), context);
                } else {
                    String e = kVar.e();
                    if (!TextUtils.isEmpty(e) && URLUtil.isNetworkUrl(e)) {
                        str = e;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC4944a.a(context, R.string.bigo_ad_title_default, new Object[0]);
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = AbstractC4944a.a(context, R.string.bigo_ad_description_default, new Object[0]);
        }
        try {
            try {
                if (!TextUtils.isEmpty(null)) {
                    Pattern pattern = sg.bigo.ads.K0.I.f12345a;
                    try {
                        f = Float.parseFloat(null);
                    } catch (Throwable unused) {
                        f = 5.0f;
                    }
                    if (f >= 4.0f) {
                        str5 = null;
                        String str17 = str3;
                        if (TextUtils.isEmpty(null)) {
                            charSequence = null;
                            str6 = null;
                        } else {
                            str6 = (sg.bigo.ads.C.x.a(901, str15) + 100) + "K";
                            charSequence = null;
                        }
                        String str18 = !TextUtils.isEmpty(charSequence) ? (sg.bigo.ads.C.x.a(100, str15) + 1) + "M+" : null;
                        if (this.u) {
                            i = R.layout.bigo_ad_layout_interstitial_mid_page_native_view;
                        } else if (z) {
                            i = R.layout.bigo_ad_layout_interstitial_mid_page_native_view_landscape;
                        } else {
                            Y y = this.d;
                            i = (y == null || !y.d) ? R.layout.bigo_ad_layout_interstitial_mid_page_native_fallback_view_landscape : R.layout.bigo_ad_layout_interstitial_mid_page_native_fallback_view_download_info_landscape;
                        }
                        String str19 = str18;
                        View a2 = AbstractC4944a.a(context, i, null, false);
                        findViewById = a2 != null ? null : a2.findViewById(R.id.inter_mid_native_view);
                        if (findViewById != null) {
                            return a2;
                        }
                        AdImageView adImageView = (AdImageView) findViewById.findViewById(R.id.inter_iv_icon);
                        TextView textView10 = (TextView) findViewById.findViewById(R.id.inter_tv_title);
                        TextView textView11 = (TextView) findViewById.findViewById(R.id.inter_tv_desc);
                        TextView textView12 = (TextView) findViewById.findViewById(R.id.inter_tv_desc_below);
                        TextView textView13 = (TextView) findViewById.findViewById(R.id.inter_tv_company_name);
                        View findViewById3 = findViewById.findViewById(R.id.inter_ll_start_rate);
                        TextView textView14 = (TextView) findViewById.findViewById(R.id.inter_tv_start_rate);
                        TextView textView15 = (TextView) findViewById.findViewById(R.id.inter_tv_comment);
                        TextView textView16 = (TextView) findViewById.findViewById(R.id.inter_tv_download_num);
                        View findViewById4 = findViewById.findViewById(R.id.inter_tv_download_num_desc);
                        TextView textView17 = (TextView) findViewById.findViewById(R.id.inter_tv_age);
                        View findViewById5 = findViewById.findViewById(R.id.inter_iv_age);
                        View findViewById6 = findViewById.findViewById(R.id.bigo_ad_btn_cta);
                        View findViewById7 = findViewById.findViewById(R.id.bigo_ad_btn_cta_inner);
                        View findViewById8 = findViewById.findViewById(R.id.inter_tv_gp_info_extra_about);
                        View findViewById9 = findViewById.findViewById(R.id.inter_iv_gp_info_extra_arrow);
                        ViewGroup viewGroup4 = (ViewGroup) findViewById.findViewById(R.id.inter_ll_media);
                        AutoNextLineLinearLayout autoNextLineLinearLayout2 = (AutoNextLineLinearLayout) findViewById.findViewById(R.id.inter_fbl_genre);
                        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) findViewById.findViewById(R.id.inter_fl_icon);
                        String[] strArr6 = strArr;
                        String str20 = str2;
                        if (roundedFrameLayout != null) {
                            roundedFrameLayout.setStrokeWidth(AbstractC4963u.a(context, 1));
                            roundedFrameLayout.setStrokeColor(sg.bigo.ads.K0.I.a(-7829368, "#05000000"));
                        }
                        int a3 = AbstractC5164f1.a(lVar, this.K.c, null);
                        if (!z || (findViewById2 = findViewById.findViewById(R.id.inter_ll_native_extra)) == null) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                            findViewById2.setVisibility(0);
                        }
                        if (TextUtils.isEmpty(str) || adImageView == null) {
                            str7 = str5;
                            str8 = str6;
                            view = a2;
                            textView = textView10;
                            textView2 = textView13;
                            textView3 = textView16;
                            textView4 = textView17;
                            view2 = findViewById7;
                            viewGroup = viewGroup4;
                            autoNextLineLinearLayout = autoNextLineLinearLayout2;
                            i3 = i2;
                            str9 = "#FFE1E1E6";
                            bVar = bVar4;
                            textView5 = textView12;
                            textView6 = textView14;
                            str10 = str19;
                            view3 = findViewById;
                            strArr3 = strArr2;
                            textView7 = textView11;
                        } else {
                            adImageView.setIconTag(true);
                            adImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            adImageView.setBackgroundColor(sg.bigo.ads.K0.I.a(-7829368, "#FFE1E1E6"));
                            adImageView.setImageDrawable(AbstractC4944a.c(context, R.drawable.bigo_ad_icon_default_only_icon));
                            ArrayList arrayList2 = new ArrayList();
                            C5211u0 c5211u0 = new C5211u0(adImageView);
                            str7 = str5;
                            adImageView.c.a(c5211u0);
                            arrayList2.add(c5211u0);
                            this.H.add(new RunnableC5214v0(arrayList2, adImageView));
                            adImageView.a(str, bVar4.T);
                            T0 t0 = this.J;
                            view = a2;
                            textView2 = textView13;
                            textView3 = textView16;
                            textView4 = textView17;
                            view2 = findViewById7;
                            viewGroup = viewGroup4;
                            autoNextLineLinearLayout = autoNextLineLinearLayout2;
                            str9 = "#FFE1E1E6";
                            bVar = bVar4;
                            strArr3 = strArr2;
                            textView5 = textView12;
                            textView6 = textView14;
                            str10 = str19;
                            textView7 = textView11;
                            textView = textView10;
                            view3 = findViewById;
                            str8 = str6;
                            i3 = 0;
                            t0.a(lVar, findViewById, adImageView, 1, T0.a(t0, lVar, lVar));
                        }
                        if (!TextUtils.isEmpty(str20) && textView != null) {
                            textView.setText(str20);
                            T0 t02 = this.J;
                            t02.a(lVar, view3, textView, 2, T0.a(t02, lVar, lVar));
                        }
                        if (!TextUtils.isEmpty(str17)) {
                            if (textView7 != null) {
                                textView7.setText(str17);
                                T0 t03 = this.J;
                                t03.a(lVar, view3, textView7, 6, T0.a(t03, lVar, lVar));
                            }
                            if (z && textView5 != null) {
                                textView5.setText(str17);
                                T0 t04 = this.J;
                                t04.a(lVar, view3, textView5, 6, T0.a(t04, lVar, lVar));
                            }
                        }
                        if (!TextUtils.isEmpty(str4) && textView2 != null) {
                            textView2.setVisibility(i3);
                            textView2.setText(str4);
                            textView2.setTextColor(a3);
                            T0 t05 = this.J;
                            t05.a(lVar, view3, textView2, 26, T0.a(t05, lVar, lVar));
                        }
                        if (!TextUtils.isEmpty(str7) && textView6 != null) {
                            textView6.setText(str7);
                            T0 t06 = this.J;
                            t06.a(lVar, view3, textView6, 26, T0.a(t06, lVar, lVar));
                        }
                        if (findViewById3 != null) {
                            T0 t07 = this.J;
                            t07.a(lVar, view3, findViewById3, 26, T0.a(t07, lVar, lVar));
                        }
                        if (TextUtils.isEmpty(str8) || str8 == null) {
                            context2 = context;
                        } else {
                            context2 = context;
                            textView15.setText(str8 + ServerSentEventKt.SPACE + AbstractC4944a.a(context2, R.string.bigo_ad_comment_num_text, new Object[i3]));
                            T0 t08 = this.J;
                            t08.a(lVar, view3, textView15, 26, T0.a(t08, lVar, lVar));
                        }
                        if (!TextUtils.isEmpty(str10) && (textView9 = textView3) != null) {
                            textView9.setText(str10);
                            T0 t09 = this.J;
                            t09.a(lVar, view3, textView9, 26, T0.a(t09, lVar, lVar));
                        }
                        if (findViewById4 != null) {
                            T0 t010 = this.J;
                            t010.a(lVar, view3, findViewById4, 26, T0.a(t010, lVar, lVar));
                        }
                        if (!TextUtils.isEmpty("Everyone") && (textView8 = textView4) != null) {
                            textView8.setText("Everyone");
                            T0 t011 = this.J;
                            t011.a(lVar, view3, textView8, 26, T0.a(t011, lVar, lVar));
                        }
                        if (findViewById5 != null) {
                            T0 t012 = this.J;
                            t012.a(lVar, view3, findViewById5, 26, T0.a(t012, lVar, lVar));
                        }
                        if (findViewById6 != null) {
                            View view5 = view2;
                            if (view5 != null) {
                                view5.setBackgroundColor(a3);
                            }
                            T0 t013 = this.J;
                            t013.a(lVar, view3, findViewById6, 7, T0.a(t013, lVar, lVar));
                        }
                        String str21 = "#08000000";
                        int i5 = 4;
                        if (z && strArr3 != null) {
                            String[] strArr7 = strArr3;
                            if (strArr7.length > 0 && (viewGroup2 = viewGroup) != null) {
                                LinearLayout linearLayout = new LinearLayout(context2);
                                linearLayout.setOrientation(i3);
                                ArrayList arrayList3 = new ArrayList();
                                int i6 = i3;
                                while (i6 < strArr7.length) {
                                    String str22 = strArr7[i6];
                                    if (TextUtils.isEmpty(str22) || !URLUtil.isNetworkUrl(str22)) {
                                        i4 = i6;
                                        viewGroup3 = viewGroup2;
                                        strArr4 = strArr7;
                                        str13 = str21;
                                        bVar3 = bVar;
                                        str14 = str9;
                                        arrayList = arrayList3;
                                        r7 = linearLayout;
                                    } else {
                                        int a4 = AbstractC4963u.a(context2, 200);
                                        RoundedFrameLayout roundedFrameLayout2 = new RoundedFrameLayout(context2);
                                        roundedFrameLayout2.setCornerRadius(AbstractC4963u.a(context2, i5));
                                        roundedFrameLayout2.setStrokeWidth(AbstractC4963u.a(context2, 1));
                                        roundedFrameLayout2.setStrokeColor(sg.bigo.ads.K0.I.a(-7829368, str21));
                                        AdImageView adImageView2 = new AdImageView(context2);
                                        String str23 = str9;
                                        adImageView2.setBackgroundColor(sg.bigo.ads.K0.I.a(-7829368, str23));
                                        adImageView2.setImageDrawable(AbstractC4944a.c(context2, R.drawable.bigo_ad_icon_default_only_icon));
                                        this.L.b(2, i6, str22, cVar);
                                        i4 = i6;
                                        str13 = str21;
                                        arrayList = arrayList3;
                                        LinearLayout linearLayout2 = linearLayout;
                                        viewGroup3 = viewGroup2;
                                        str14 = str23;
                                        strArr4 = strArr7;
                                        C5223y0 c5223y0 = new C5223y0(this, adImageView2, roundedFrameLayout2, a4, cVar, str22, i4);
                                        adImageView2.c.a(c5223y0);
                                        arrayList.add(c5223y0);
                                        this.H.add(new RunnableC5226z0(adImageView2));
                                        bVar3 = bVar;
                                        adImageView2.a(str22, bVar3.T);
                                        roundedFrameLayout2.addView(adImageView2, new FrameLayout.LayoutParams(-1, -1));
                                        T0 t014 = this.J;
                                        t014.a(lVar, viewGroup3, roundedFrameLayout2, 5, T0.a(t014, lVar, t014.c ? lVar : t014.r));
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC4963u.a(context2, 100), a4);
                                        layoutParams.leftMargin = i4 == 0 ? AbstractC4963u.a(context2, 20) : AbstractC4963u.a(context2, 12);
                                        if (i4 + 1 == strArr4.length) {
                                            layoutParams.rightMargin = AbstractC4963u.a(context2, 20);
                                        }
                                        r7 = linearLayout2;
                                        r7.addView(roundedFrameLayout2, layoutParams);
                                    }
                                    this.H.add(new A0(arrayList));
                                    i6 = i4 + 1;
                                    bVar = bVar3;
                                    linearLayout = r7;
                                    arrayList3 = arrayList;
                                    strArr7 = strArr4;
                                    str21 = str13;
                                    str9 = str14;
                                    viewGroup2 = viewGroup3;
                                    i5 = 4;
                                }
                                LinearLayout linearLayout3 = linearLayout;
                                ViewGroup viewGroup5 = viewGroup2;
                                str11 = str21;
                                bVar2 = bVar;
                                T0 t015 = this.J;
                                t015.a(lVar, viewGroup5, viewGroup5, 18, T0.a(t015, lVar, t015.d ? lVar : t015.r));
                                viewGroup5.addView(linearLayout3);
                                if (z && z3) {
                                    view4 = view3;
                                    RoundedFrameLayout roundedFrameLayout3 = (RoundedFrameLayout) view4.findViewById(R.id.inter_ll_fallback_media);
                                    if (roundedFrameLayout3 != null) {
                                        roundedFrameLayout3.setVisibility(0);
                                    }
                                    AdImageView adImageView3 = (AdImageView) view4.findViewById(R.id.inter_iv_fallback_media);
                                    if (adImageView3 != null) {
                                        sg.bigo.ads.U0.k kVar2 = (sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar);
                                        String e2 = kVar2.e();
                                        if (TextUtils.isEmpty(e2) || !URLUtil.isNetworkUrl(e2)) {
                                            if (kVar2.p()) {
                                                String a5 = sg.bigo.ads.U.q.a(kVar2.j(), context2);
                                                if (!TextUtils.isEmpty(a5)) {
                                                    str12 = a5;
                                                    z2 = true;
                                                }
                                            }
                                            z2 = false;
                                            str12 = null;
                                        } else {
                                            str12 = e2;
                                            z2 = false;
                                        }
                                        if (!TextUtils.isEmpty(str12)) {
                                            ArrayList arrayList4 = new ArrayList();
                                            if (!z2) {
                                                this.L.b(4, -1, str12, cVar);
                                            }
                                            C5217w0 c5217w0 = new C5217w0(this, cVar, str12);
                                            adImageView3.c.a(c5217w0);
                                            arrayList4.add(c5217w0);
                                            this.H.add(new RunnableC5220x0(arrayList4, adImageView3));
                                            roundedFrameLayout3.setStrokeWidth(AbstractC4963u.a(context2, 1));
                                            roundedFrameLayout3.setStrokeColor(sg.bigo.ads.K0.I.a(-7829368, str11));
                                            adImageView3.a(str12, bVar2.T);
                                            T0 t016 = this.J;
                                            t016.a(lVar, view4, adImageView3, 5, T0.a(t016, lVar, t016.c ? lVar : t016.r));
                                        }
                                    }
                                } else {
                                    view4 = view3;
                                }
                                if (strArr6 != null && strArr6.length > 0 && (r6 = autoNextLineLinearLayout) != 0) {
                                    for (String str24 : strArr6) {
                                        try {
                                            if (!TextUtils.isEmpty(str24)) {
                                                TextView textView18 = new TextView(context2);
                                                textView18.setText(str24);
                                                textView18.setTextColor(sg.bigo.ads.K0.I.a(-7829368, "#5F6367"));
                                                textView18.setTextSize(13.0f);
                                                textView18.setPadding(AbstractC4963u.a(context2, 12), AbstractC4963u.a(context2, 5), AbstractC4963u.a(context2, 12), AbstractC4963u.a(context2, 5));
                                                textView18.setGravity(17);
                                                GradientDrawable gradientDrawable = new GradientDrawable();
                                                gradientDrawable.setShape(0);
                                                gradientDrawable.setColor(-1);
                                                gradientDrawable.setStroke(AbstractC4963u.a(context2, 1), sg.bigo.ads.K0.I.a(-7829368, "#DBDDE0"));
                                                gradientDrawable.setCornerRadius(AbstractC4963u.a(context2, 14));
                                                textView18.setBackground(gradientDrawable);
                                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, AbstractC4963u.a(context2, 28));
                                                layoutParams2.topMargin = AbstractC4963u.a(context2, 12);
                                                layoutParams2.rightMargin = AbstractC4963u.a(context2, 12);
                                                T0 t017 = this.J;
                                                t017.a(lVar, view4, textView18, 27, T0.a(t017, lVar, lVar));
                                                r6.addView(textView18, layoutParams2);
                                            }
                                        } catch (Exception unused2) {
                                        }
                                    }
                                }
                                if (findViewById8 != null) {
                                    T0 t018 = this.J;
                                    t018.a(lVar, view4, findViewById8, 27, T0.a(t018, lVar, t018.b ? lVar : t018.r));
                                }
                                if (findViewById9 != null) {
                                    T0 t019 = this.J;
                                    t019.a(lVar, view4, findViewById9, 27, T0.a(t019, lVar, t019.b ? lVar : t019.r));
                                }
                                T0 t020 = this.J;
                                t020.a(lVar, view4, view4, 18, T0.a(t020, lVar, !t020.b ? lVar : t020.r));
                                return view;
                            }
                        }
                        str11 = "#08000000";
                        bVar2 = bVar;
                        if (z) {
                        }
                        view4 = view3;
                        if (strArr6 != null) {
                            while (r11 < strArr6.length) {
                            }
                        }
                        if (findViewById8 != null) {
                        }
                        if (findViewById9 != null) {
                        }
                        T0 t0202 = this.J;
                        t0202.a(lVar, view4, view4, 18, T0.a(t0202, lVar, !t0202.b ? lVar : t0202.r));
                        return view;
                    }
                }
                View a22 = AbstractC4944a.a(context, i, null, false);
                if (a22 != null) {
                }
                if (findViewById != null) {
                }
            } catch (Throwable unused3) {
                return null;
            }
            if (this.u) {
            }
            String str192 = str18;
        } catch (Throwable unused4) {
            return null;
        }
        str5 = "4." + (sg.bigo.ads.C.x.a(7, str15) + 3);
        String str172 = str3;
        if (TextUtils.isEmpty(null)) {
        }
        if (!TextUtils.isEmpty(charSequence)) {
        }
    }

    public final RoundedFrameLayout a(Context context, View view, boolean z) {
        int i = this.K.b;
        RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
        if (i == 1) {
            roundedFrameLayout.setCornerRadius(AbstractC4963u.a(context, 12));
        } else {
            roundedFrameLayout.a(AbstractC4963u.a(context, 12), AbstractC4963u.a(context, 12), AbstractC4963u.a(context, 0), AbstractC4963u.a(context, 0));
        }
        roundedFrameLayout.addView(view, new FrameLayout.LayoutParams(-1, z ? -1 : -2));
        return roundedFrameLayout;
    }

    public static LinearLayout a(Context context, View view, int i) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(sg.bigo.ads.K0.I.a(-7829368, "#F0F3F4"));
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.bigo_ad_btn_close);
        imageView.setImageDrawable(AbstractC4944a.c(context, R.drawable.bigo_ad_ic_close_gray_light));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC4963u.a(context, 24), AbstractC4963u.a(context, 24), 21);
        layoutParams.rightMargin = AbstractC4963u.a(context, 20);
        frameLayout.addView(imageView, layoutParams);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-1, AbstractC4963u.a(context, 48)));
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, i));
        return linearLayout;
    }

    public final FrameLayout a(Context context, RoundedFrameLayout roundedFrameLayout, boolean z) {
        int i;
        FrameLayout frameLayout = new FrameLayout(context);
        int i2 = this.K.b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z ? -1 : -2);
        if (i2 == 1) {
            int a2 = AbstractC4963u.a(context, 10);
            layoutParams.topMargin = a2;
            layoutParams.bottomMargin = a2;
            layoutParams.leftMargin = a2;
            layoutParams.rightMargin = a2;
            i = 17;
        } else {
            layoutParams.topMargin = AbstractC4963u.a(context, 40);
            i = 80;
        }
        layoutParams.gravity = i;
        frameLayout.addView(roundedFrameLayout, layoutParams);
        String str = this.b.d.g;
        if (!sg.bigo.ads.K0.I.a((CharSequence) str)) {
            sg.bigo.ads.L0.C.a(context, frameLayout, new sg.bigo.ads.L0.C(str, context));
        }
        return frameLayout;
    }
}

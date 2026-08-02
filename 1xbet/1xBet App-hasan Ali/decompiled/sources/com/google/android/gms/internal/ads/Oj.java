package com.google.android.gms.internal.ads;

import a.AbstractC0444a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Oj extends L8 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC0810bk {

    /* renamed from: z, reason: collision with root package name */
    public static final C1761wv f10958z;

    /* renamed from: l, reason: collision with root package name */
    public final String f10959l;

    /* renamed from: n, reason: collision with root package name */
    public FrameLayout f10961n;

    /* renamed from: o, reason: collision with root package name */
    public FrameLayout f10962o;

    /* renamed from: p, reason: collision with root package name */
    public final C0606Hd f10963p;

    /* renamed from: q, reason: collision with root package name */
    public View f10964q;

    /* renamed from: s, reason: collision with root package name */
    public Cj f10966s;

    /* renamed from: t, reason: collision with root package name */
    public M5 f10967t;

    /* renamed from: v, reason: collision with root package name */
    public G8 f10969v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10970w;

    /* renamed from: y, reason: collision with root package name */
    public GestureDetector f10972y;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f10960m = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC2360a f10968u = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10971x = false;

    /* renamed from: r, reason: collision with root package name */
    public final int f10965r = 244410000;

    static {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        Object[] objArr = {"2011", "1009", "3010"};
        AbstractC1400ot.C(3, objArr);
        f10958z = AbstractC1044gv.k(3, objArr);
    }

    public Oj(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f10961n = frameLayout;
        this.f10962o = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f10959l = str;
        V9 v9 = P2.o.f4767B.f4768A;
        ViewTreeObserverOnGlobalLayoutListenerC0655Od viewTreeObserverOnGlobalLayoutListenerC0655Od = new ViewTreeObserverOnGlobalLayoutListenerC0655Od(frameLayout, this);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0655Od.f7794k).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0655Od.p1(viewTreeObserver3);
        }
        ViewTreeObserverOnScrollChangedListenerC0662Pd viewTreeObserverOnScrollChangedListenerC0662Pd = new ViewTreeObserverOnScrollChangedListenerC0662Pd(frameLayout, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC0662Pd.f7794k).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC0662Pd.p1(viewTreeObserver2);
        }
        this.f10963p = AbstractC0613Id.f;
        this.f10967t = new M5(this.f10961n.getContext(), this.f10961n);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final synchronized InterfaceC2360a E(String str) {
        return new BinderC2361b(N(str));
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final synchronized void I1(String str, InterfaceC2360a interfaceC2360a) {
        L(str, (View) BinderC2361b.t1(interfaceC2360a));
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final synchronized void K0(G8 g8) {
        if (!this.f10971x) {
            this.f10970w = true;
            this.f10969v = g8;
            Cj cj = this.f10966s;
            if (cj != null) {
                cj.f8054C.b(g8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized void L(String str, View view) {
        if (!this.f10971x) {
            if (view == null) {
                this.f10960m.remove(str);
                return;
            }
            this.f10960m.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (AbstractC0444a.p0(this.f10965r)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final synchronized void L2(InterfaceC2360a interfaceC2360a) {
        this.f10966s.j((View) BinderC2361b.t1(interfaceC2360a));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized View N(String str) {
        WeakReference weakReference;
        if (!this.f10971x && (weakReference = (WeakReference) this.f10960m.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final /* synthetic */ View c() {
        return this.f10961n;
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final synchronized void c1(BinderC2361b binderC2361b, int i) {
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final synchronized void d2(InterfaceC2360a interfaceC2360a) {
        if (this.f10971x) {
            return;
        }
        Object t12 = BinderC2361b.t1(interfaceC2360a);
        if (!(t12 instanceof Cj)) {
            U2.j.i("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        Cj cj = this.f10966s;
        if (cj != null) {
            cj.l(this);
        }
        v3();
        Cj cj2 = (Cj) t12;
        this.f10966s = cj2;
        cj2.k(this);
        this.f10966s.g(this.f10961n);
        Cj cj3 = this.f10966s;
        FrameLayout frameLayout = this.f10962o;
        C1169jn T4 = cj3.f8059k.T();
        if (cj3.f8062n.c() && T4 != null && frameLayout != null) {
            Oi oi = P2.o.f4767B.f4789w;
            C1893zs c1893zs = T4.f14142a;
            oi.getClass();
            Oi.p(new RunnableC0902dn(c1893zs, frameLayout, 0));
        }
        if (this.f10970w) {
            this.f10966s.f8054C.b(this.f10969v);
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8743P3)).booleanValue() && !TextUtils.isEmpty(this.f10966s.f8062n.b())) {
            u3(this.f10966s.f8062n.b());
        }
        w3();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final M5 e() {
        return this.f10967t;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final FrameLayout g() {
        return this.f10962o;
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final synchronized void g1(InterfaceC2360a interfaceC2360a) {
        if (this.f10971x) {
            return;
        }
        this.f10968u = interfaceC2360a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final InterfaceC2360a h() {
        return this.f10968u;
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void i0(InterfaceC2360a interfaceC2360a) {
        onTouch(this.f10961n, (MotionEvent) BinderC2361b.t1(interfaceC2360a));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized String k() {
        return this.f10959l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized Map l() {
        return this.f10960m;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized Map m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized JSONObject n() {
        Cj cj = this.f10966s;
        if (cj == null) {
            return null;
        }
        return cj.z(this.f10961n, o(), l());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized Map o() {
        return this.f10960m;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        Cj cj = this.f10966s;
        if (cj == null || !cj.m()) {
            return;
        }
        this.f10966s.B();
        this.f10966s.c(view, this.f10961n, o(), l(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        Cj cj = this.f10966s;
        if (cj != null) {
            FrameLayout frameLayout = this.f10961n;
            cj.b(frameLayout, o(), l(), Cj.n(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        Cj cj = this.f10966s;
        if (cj != null) {
            FrameLayout frameLayout = this.f10961n;
            cj.b(frameLayout, o(), l(), Cj.n(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        Cj cj = this.f10966s;
        if (cj != null) {
            cj.h(view, motionEvent, this.f10961n);
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.db)).booleanValue() && this.f10972y != null && this.f10966s.p() != 0) {
                this.f10972y.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final synchronized void p() {
        try {
            if (this.f10971x) {
                return;
            }
            Cj cj = this.f10966s;
            if (cj != null) {
                cj.l(this);
                this.f10966s = null;
            }
            this.f10960m.clear();
            this.f10961n.removeAllViews();
            this.f10962o.removeAllViews();
            this.f10960m = null;
            this.f10961n = null;
            this.f10962o = null;
            this.f10964q = null;
            this.f10967t = null;
            this.f10971x = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized JSONObject r() {
        Cj cj = this.f10966s;
        if (cj == null) {
            return null;
        }
        return cj.A(this.f10961n, o(), l());
    }

    public final synchronized void u3(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f10962o.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f10962o.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] decode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e3) {
                        U2.j.j("Encountered invalid base64 watermark.", e3);
                    }
                }
            }
            this.f10962o.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void v3() {
        this.f10963p.execute(new K4(27, this));
    }

    public final synchronized void w3() {
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.db)).booleanValue() || this.f10966s.p() == 0) {
            return;
        }
        this.f10972y = new GestureDetector(this.f10961n.getContext(), new Sj(this.f10966s, this));
    }
}

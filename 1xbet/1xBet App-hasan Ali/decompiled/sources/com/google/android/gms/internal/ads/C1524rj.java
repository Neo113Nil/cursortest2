package com.google.android.gms.internal.ads;

import Q2.C0358f0;
import Q2.C0379q;
import Q2.InterfaceC0362h0;
import a.AbstractC0444a;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import q3.AbstractC2309b;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.rj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1524rj implements Jj {

    /* renamed from: C, reason: collision with root package name */
    public C0358f0 f15341C;

    /* renamed from: D, reason: collision with root package name */
    public final Rj f15342D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15343a;

    /* renamed from: b, reason: collision with root package name */
    public final Kj f15344b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f15345c;

    /* renamed from: d, reason: collision with root package name */
    public final Kk f15346d;

    /* renamed from: e, reason: collision with root package name */
    public final Gj f15347e;
    public final Q4 f;

    /* renamed from: g, reason: collision with root package name */
    public final Uh f15348g;

    /* renamed from: h, reason: collision with root package name */
    public final Kh f15349h;
    public final Ui i;

    /* renamed from: j, reason: collision with root package name */
    public final Lq f15350j;

    /* renamed from: k, reason: collision with root package name */
    public final U2.a f15351k;

    /* renamed from: l, reason: collision with root package name */
    public final Wq f15352l;

    /* renamed from: m, reason: collision with root package name */
    public final C1656ug f15353m;

    /* renamed from: n, reason: collision with root package name */
    public final Tj f15354n;

    /* renamed from: o, reason: collision with root package name */
    public final C2308a f15355o;

    /* renamed from: p, reason: collision with root package name */
    public final Ti f15356p;

    /* renamed from: q, reason: collision with root package name */
    public final C1041gs f15357q;

    /* renamed from: r, reason: collision with root package name */
    public final C0766al f15358r;

    /* renamed from: s, reason: collision with root package name */
    public final Mr f15359s;

    /* renamed from: t, reason: collision with root package name */
    public final BinderC0857cn f15360t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f15362v;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15361u = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f15363w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15364x = false;

    /* renamed from: y, reason: collision with root package name */
    public Point f15365y = new Point();

    /* renamed from: z, reason: collision with root package name */
    public Point f15366z = new Point();

    /* renamed from: A, reason: collision with root package name */
    public long f15339A = 0;

    /* renamed from: B, reason: collision with root package name */
    public long f15340B = 0;

    public C1524rj(Context context, Kj kj, JSONObject jSONObject, Kk kk, Gj gj, Q4 q42, Uh uh, Kh kh, Ui ui, Lq lq, U2.a aVar, Wq wq, C1656ug c1656ug, Tj tj, C2308a c2308a, Ti ti, C1041gs c1041gs, Mr mr, BinderC0857cn binderC0857cn, C0766al c0766al, Rj rj) {
        this.f15343a = context;
        this.f15344b = kj;
        this.f15345c = jSONObject;
        this.f15346d = kk;
        this.f15347e = gj;
        this.f = q42;
        this.f15348g = uh;
        this.f15349h = kh;
        this.i = ui;
        this.f15350j = lq;
        this.f15351k = aVar;
        this.f15352l = wq;
        this.f15353m = c1656ug;
        this.f15354n = tj;
        this.f15355o = c2308a;
        this.f15356p = ti;
        this.f15357q = c1041gs;
        this.f15359s = mr;
        this.f15360t = binderC0857cn;
        this.f15358r = c0766al;
        this.f15342D = rj;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void A() {
        y(null, null, null, null, null, null, false, null);
    }

    public final void B(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z3, boolean z5) {
        List list;
        String str2;
        C2308a c2308a = this.f15355o;
        Kj kj = this.f15344b;
        JSONObject jSONObject7 = this.f15345c;
        Gj gj = this.f15347e;
        try {
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            jSONObject8.put("has_custom_click_handler", ((Y8) kj.f10216g.get(gj.a())) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", gj.D());
            jSONObject9.put("view_aware_api_used", z3);
            B8 b8 = this.f15352l.i;
            jSONObject9.put("custom_mute_requested", b8 != null && b8.f7776q);
            synchronized (gj) {
                list = gj.f;
            }
            jSONObject9.put("custom_mute_enabled", (list.isEmpty() || gj.K() == null) ? false : true);
            if (this.f15354n.f11663m != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            c2308a.getClass();
            jSONObject9.put("timestamp", System.currentTimeMillis());
            if (this.f15364x && this.f15345c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z5) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", ((Y8) kj.f10216g.get(gj.a())) != null);
            try {
                JSONObject optJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f.f11167b.g(this.f15343a, optJSONObject.optString("click_string"), view);
            } catch (Exception e3) {
                U2.j.g("Exception obtaining click signals", e3);
                str2 = null;
            }
            jSONObject9.put("click_signals", str2);
            jSONObject9.put("open_chrome_custom_tab", true);
            A7 a7 = F7.n8;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && AbstractC2309b.f()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) rVar.f5056c.a(F7.o8)).booleanValue() && AbstractC2309b.f()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            c2308a.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", currentTimeMillis - this.f15339A);
            jSONObject10.put("time_from_last_touch", currentTimeMillis - this.f15340B);
            jSONObject8.put("touch_signal", jSONObject10);
            if (this.f15350j.b()) {
                JSONObject jSONObject11 = (JSONObject) jSONObject7.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.f15360t.v3(string, gj);
                }
            }
            AbstractC1803xs.k(this.f15346d.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick");
        } catch (JSONException e5) {
            U2.j.g("Unable to create click JSON.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final boolean D() {
        if (a() == 0) {
            return true;
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.db)).booleanValue()) {
            return this.f15352l.i.f7779t;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void F() {
        this.f15364x = true;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final int a() {
        Wq wq = this.f15352l;
        if (wq.i == null) {
            return 0;
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.db)).booleanValue()) {
            return wq.i.f7778s;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void b(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f15343a;
        y(AbstractC0444a.n0(context, view), AbstractC0444a.k0(context, map, map2, view, scaleType), AbstractC0444a.m0(view), AbstractC0444a.l0(context, view), v(view), null, AbstractC0444a.o0(context, this.f15350j), view);
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f15343a;
        JSONObject k02 = AbstractC0444a.k0(context, map, map2, view, scaleType);
        JSONObject n02 = AbstractC0444a.n0(context, view);
        JSONObject m02 = AbstractC0444a.m0(view);
        JSONObject l02 = AbstractC0444a.l0(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", k02);
            jSONObject.put("ad_view_signal", n02);
            jSONObject.put("scroll_view_signal", m02);
            jSONObject.put("lock_screen_signal", l02);
            return jSONObject;
        } catch (JSONException e3) {
            U2.j.g("Unable to create native ad view signals JSON.", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void d(View view) {
        if (!this.f15345c.optBoolean("custom_one_point_five_click_enabled", false)) {
            U2.j.i("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            Tj tj = this.f15354n;
            view.setOnClickListener(tj);
            view.setClickable(true);
            tj.f11667q = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void e() {
        View view;
        if (this.f15345c.optBoolean("custom_one_point_five_click_enabled", false)) {
            Tj tj = this.f15354n;
            if (tj.f11663m == null || tj.f11666p == null) {
                return;
            }
            tj.f11665o = null;
            tj.f11666p = null;
            WeakReference weakReference = tj.f11667q;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                tj.f11667q = null;
            }
            try {
                C1104i9 c1104i9 = tj.f11663m;
                c1104i9.d1(c1104i9.N(), 2);
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void f(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.f15365y = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.f15355o.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        this.f15340B = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f15358r.f12702a = motionEvent;
            this.f15339A = currentTimeMillis;
            this.f15366z = this.f15365y;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f15365y;
        obtain.setLocation(point.x, point.y);
        this.f.f11167b.a(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void g(View view, Map map, Map map2, InterfaceViewOnClickListenerC0810bk interfaceViewOnClickListenerC0810bk, InterfaceViewOnClickListenerC0810bk interfaceViewOnClickListenerC0810bk2) {
        this.f15365y = new Point();
        this.f15366z = new Point();
        if (!this.f15362v) {
            this.f15356p.p1(view);
            this.f15362v = true;
        }
        view.setOnTouchListener(interfaceViewOnClickListenerC0810bk);
        view.setClickable(true);
        view.setOnClickListener(interfaceViewOnClickListenerC0810bk2);
        C1656ug c1656ug = this.f15353m;
        c1656ug.getClass();
        c1656ug.f15886t = new WeakReference(this);
        boolean p02 = AbstractC0444a.p0(this.f15351k.f5854m);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (p02) {
                        view2.setOnTouchListener(interfaceViewOnClickListenerC0810bk);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(interfaceViewOnClickListenerC0810bk2);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (p02) {
                        view3.setOnTouchListener(interfaceViewOnClickListenerC0810bk);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void h() {
        Kk kk = this.f15346d;
        synchronized (kk) {
            C1582sw c1582sw = kk.f10227m;
            if (c1582sw == null) {
                return;
            }
            Oi oi = new Oi(11);
            c1582sw.a(new Kw(0, c1582sw, oi), kk.f10221e);
            kk.f10227m = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    @Override // com.google.android.gms.internal.ads.Jj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Bundle bundle) {
        JSONObject f;
        if (!x("impression_reporting")) {
            U2.j.f("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        U2.e eVar = C0379q.f.f5048a;
        eVar.getClass();
        if (bundle != null) {
            try {
                f = eVar.f(bundle);
            } catch (JSONException e3) {
                U2.j.g("Error converting Bundle to JSON", e3);
            }
            return y(null, null, null, null, ((Boolean) Q2.r.f5053d.f5056c.a(F7.Za)).booleanValue() ? v(null) : null, f, false, null);
        }
        f = null;
        return y(null, null, null, null, ((Boolean) Q2.r.f5053d.f5056c.a(F7.Za)).booleanValue() ? v(null) : null, f, false, null);
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final boolean j() {
        return this.f15345c.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void k(InterfaceC0362h0 interfaceC0362h0) {
        Q2.H0 h02;
        try {
            if (this.f15363w) {
                return;
            }
            Mr mr = this.f15359s;
            Lq lq = this.f15350j;
            C1041gs c1041gs = this.f15357q;
            if (interfaceC0362h0 == null) {
                Gj gj = this.f15347e;
                synchronized (gj) {
                    h02 = gj.f9231g;
                }
                if (h02 != null) {
                    this.f15363w = true;
                    c1041gs.b(gj.K().f4924l, lq.f10534x0, mr);
                    z();
                    return;
                }
            }
            this.f15363w = true;
            c1041gs.b(interfaceC0362h0.c(), lq.f10534x0, mr);
            z();
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void l(C1104i9 c1104i9) {
        if (!this.f15345c.optBoolean("custom_one_point_five_click_enabled", false)) {
            U2.j.i("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        Tj tj = this.f15354n;
        tj.f11663m = c1104i9;
        C1641u9 c1641u9 = tj.f11664n;
        Kk kk = tj.f11661k;
        if (c1641u9 != null) {
            kk.d("/unconfirmedClick", c1641u9);
        }
        C1641u9 c1641u92 = new C1641u9(4, tj, c1104i9);
        tj.f11664n = c1641u92;
        kk.c("/unconfirmedClick", c1641u92);
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void m(C0358f0 c0358f0) {
        this.f15341C = c0358f0;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void n(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType) {
        Context context = this.f15343a;
        JSONObject k02 = AbstractC0444a.k0(context, map, map2, view2, scaleType);
        JSONObject n02 = AbstractC0444a.n0(context, view2);
        JSONObject m02 = AbstractC0444a.m0(view2);
        JSONObject l02 = AbstractC0444a.l0(context, view2);
        String w5 = w(view, map);
        B(true == ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8669C3)).booleanValue() ? view2 : view, n02, k02, m02, l02, w5, AbstractC0444a.j0(w5, context, this.f15366z, this.f15365y), null, z3, false);
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void o(Bundle bundle) {
        if (bundle == null) {
            U2.j.d("Click data is null. No click is reported.");
            return;
        }
        if (!x("click_reporting")) {
            U2.j.f("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObject = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        U2.e eVar = C0379q.f.f5048a;
        eVar.getClass();
        try {
            jSONObject = eVar.f(bundle);
        } catch (JSONException e3) {
            U2.j.g("Error converting Bundle to JSON", e3);
        }
        B(null, null, null, null, null, string, null, jSONObject, false, false);
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void p(View view) {
        this.f15365y = new Point();
        this.f15366z = new Point();
        if (view != null) {
            Ti ti = this.f15356p;
            synchronized (ti) {
                if (ti.f11658m.containsKey(view)) {
                    ((M5) ti.f11658m.get(view)).f10598v.remove(ti);
                    ti.f11658m.remove(view);
                }
            }
        }
        this.f15362v = false;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void q(Bundle bundle) {
        if (bundle == null) {
            U2.j.d("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!x("touch_reporting")) {
            U2.j.f("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f.f11167b.i((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final JSONObject r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject c5 = c(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f15364x && this.f15345c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (c5 != null) {
                jSONObject.put("nas", c5);
                return jSONObject;
            }
        } catch (JSONException e3) {
            U2.j.g("Unable to create native click meta data JSON.", e3);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void s() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f15345c);
            AbstractC1803xs.k(this.f15346d.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e3) {
            U2.j.g("", e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // com.google.android.gms.internal.ads.Jj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType, int i) {
        boolean z5;
        boolean z6;
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.f15345c;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.db)).booleanValue()) {
                z5 = true;
                if (!z5) {
                    if (!this.f15364x) {
                        U2.j.d("Custom click reporting failed. enableCustomClickGesture is not set.");
                        return;
                    } else if (!jSONObject2.optBoolean("allow_custom_click_gesture", false)) {
                        U2.j.d("Custom click reporting failed. Ad unit id not in the allow list.");
                        return;
                    }
                }
                Context context = this.f15343a;
                JSONObject k02 = AbstractC0444a.k0(context, map, map2, view2, scaleType);
                JSONObject n02 = AbstractC0444a.n0(context, view2);
                JSONObject m02 = AbstractC0444a.m0(view2);
                z6 = z5;
                JSONObject l02 = AbstractC0444a.l0(context, view2);
                String w5 = w(view, map);
                JSONObject j02 = AbstractC0444a.j0(w5, context, this.f15366z, this.f15365y);
                if (z6) {
                    try {
                        Point point = this.f15366z;
                        Point point2 = this.f15365y;
                        try {
                            jSONObject = new JSONObject();
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                JSONObject jSONObject4 = new JSONObject();
                                if (point != null) {
                                    jSONObject3.put("x", point.x);
                                    jSONObject3.put("y", point.y);
                                }
                                if (point2 != null) {
                                    jSONObject4.put("x", point2.x);
                                    jSONObject4.put("y", point2.y);
                                }
                                jSONObject.put("start_point", jSONObject3);
                                jSONObject.put("end_point", jSONObject4);
                                jSONObject.put("duration_ms", i);
                            } catch (Exception e3) {
                                e = e3;
                                U2.j.g("Error occurred while grabbing custom click gesture signals.", e);
                                jSONObject2.put("custom_click_gesture_signal", jSONObject);
                                B(view2, n02, k02, m02, l02, w5, j02, null, z3, true);
                            }
                        } catch (Exception e5) {
                            e = e5;
                            jSONObject = null;
                        }
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    } catch (JSONException e6) {
                        U2.j.g("Error occurred while adding CustomClickGestureSignals to adJson.", e6);
                        P2.o.f4767B.f4774g.i("FirstPartyNativeAdCore.performCustomClickGesture", e6);
                    }
                }
                B(view2, n02, k02, m02, l02, w5, j02, null, z3, true);
            }
        }
        z5 = false;
        if (!z5) {
        }
        Context context2 = this.f15343a;
        JSONObject k022 = AbstractC0444a.k0(context2, map, map2, view2, scaleType);
        JSONObject n022 = AbstractC0444a.n0(context2, view2);
        JSONObject m022 = AbstractC0444a.m0(view2);
        z6 = z5;
        JSONObject l022 = AbstractC0444a.l0(context2, view2);
        String w52 = w(view, map);
        JSONObject j022 = AbstractC0444a.j0(w52, context2, this.f15366z, this.f15365y);
        if (z6) {
        }
        B(view2, n022, k022, m022, l022, w52, j022, null, z3, true);
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void u(String str) {
        B(null, null, null, null, null, str, null, null, false, false);
    }

    public final String v(View view) {
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8915v3)).booleanValue()) {
            return null;
        }
        try {
            return this.f.f11167b.e(this.f15343a, view, null);
        } catch (Exception unused) {
            U2.j.f("Exception getting data.");
            return null;
        }
    }

    public final String w(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int D5 = this.f15347e.D();
        if (D5 == 1) {
            return "1099";
        }
        if (D5 == 2) {
            return "2099";
        }
        if (D5 != 6) {
            return null;
        }
        return "3099";
    }

    public final boolean x(String str) {
        JSONObject optJSONObject = this.f15345c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    public final boolean y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z3, View view) {
        Context context = this.f15343a;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f15345c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8915v3)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z3);
            JSONObject jSONObject7 = new JSONObject();
            T2.L l5 = P2.o.f4767B.f4771c;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            try {
                int i = displayMetrics.widthPixels;
                C0379q c0379q = C0379q.f;
                jSONObject7.put("width", c0379q.f5048a.d(context, i));
                jSONObject7.put("height", c0379q.f5048a.d(context, displayMetrics.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.j8)).booleanValue();
            Kk kk = this.f15346d;
            if (booleanValue) {
                kk.c("/clickRecorded", new C1480qj(this, 1));
            } else {
                kk.c("/logScionEvent", new C1480qj(this, 0));
            }
            kk.c("/nativeImpression", new C1641u9(this, view));
            AbstractC1803xs.k(kk.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f15361u) {
                return true;
            }
            this.f15361u = P2.o.f4767B.f4780n.i(context, this.f15351k.f5852k, this.f15350j.f10467C.toString(), this.f15352l.f);
            return true;
        } catch (JSONException e3) {
            U2.j.g("Unable to create impression JSON.", e3);
            return false;
        }
    }

    public final void z() {
        try {
            C0358f0 c0358f0 = this.f15341C;
            if (c0358f0 != null) {
                c0358f0.d1(c0358f0.N(), 1);
            }
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }
}

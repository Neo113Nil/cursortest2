package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import r.C2327e;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Cj extends AbstractC0762ah {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f8051G = 0;

    /* renamed from: A, reason: collision with root package name */
    public final U2.a f8052A;

    /* renamed from: B, reason: collision with root package name */
    public final Context f8053B;

    /* renamed from: C, reason: collision with root package name */
    public final Ej f8054C;

    /* renamed from: D, reason: collision with root package name */
    public final Fo f8055D;

    /* renamed from: E, reason: collision with root package name */
    public final HashMap f8056E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f8057F;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f8058j;

    /* renamed from: k, reason: collision with root package name */
    public final Gj f8059k;

    /* renamed from: l, reason: collision with root package name */
    public final Jj f8060l;

    /* renamed from: m, reason: collision with root package name */
    public final Pj f8061m;

    /* renamed from: n, reason: collision with root package name */
    public final Ij f8062n;

    /* renamed from: o, reason: collision with root package name */
    public final Kj f8063o;

    /* renamed from: p, reason: collision with root package name */
    public final AD f8064p;

    /* renamed from: q, reason: collision with root package name */
    public final AD f8065q;

    /* renamed from: r, reason: collision with root package name */
    public final AD f8066r;

    /* renamed from: s, reason: collision with root package name */
    public final AD f8067s;

    /* renamed from: t, reason: collision with root package name */
    public final AD f8068t;

    /* renamed from: u, reason: collision with root package name */
    public E5 f8069u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8070v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8071w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8072x;

    /* renamed from: y, reason: collision with root package name */
    public final C1116id f8073y;

    /* renamed from: z, reason: collision with root package name */
    public final Q4 f8074z;

    static {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        AbstractC1400ot.C(6, objArr);
        AbstractC1044gv.k(6, objArr);
    }

    public Cj(G7 g7, Executor executor, Gj gj, Jj jj, Pj pj, Ij ij, Kj kj, AD ad, AD ad2, AD ad3, AD ad4, AD ad5, C1116id c1116id, Q4 q42, U2.a aVar, Context context, Ej ej, Fo fo) {
        super(g7);
        this.f8058j = executor;
        this.f8059k = gj;
        this.f8060l = jj;
        this.f8061m = pj;
        this.f8062n = ij;
        this.f8063o = kj;
        this.f8064p = ad;
        this.f8065q = ad2;
        this.f8066r = ad3;
        this.f8067s = ad4;
        this.f8068t = ad5;
        this.f8073y = c1116id;
        this.f8074z = q42;
        this.f8052A = aVar;
        this.f8053B = context;
        this.f8054C = ej;
        this.f8055D = fo;
        this.f8056E = new HashMap();
        this.f8057F = new ArrayList();
    }

    public static boolean n(View view) {
        A7 a7 = F7.ha;
        Q2.r rVar = Q2.r.f5053d;
        if (!((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        T2.L l5 = P2.o.f4767B.f4771c;
        long J = T2.L.J(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return J >= ((long) ((Integer) rVar.f5056c.a(F7.ia)).intValue());
        }
        return false;
    }

    public final synchronized JSONObject A(View view, Map map, Map map2) {
        return this.f8060l.r(view, map, map2, q());
    }

    public final synchronized void B() {
        this.f8060l.e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0762ah
    public final void a() {
        RunnableC1839yj runnableC1839yj = new RunnableC1839yj(this, 0);
        Executor executor = this.f8058j;
        executor.execute(runnableC1839yj);
        if (this.f8059k.D() != 7) {
            Jj jj = this.f8060l;
            Objects.requireNonNull(jj);
            executor.execute(new K4(26, jj));
        }
        super.a();
    }

    public final synchronized void b(View view, Map map, Map map2, boolean z3) {
        try {
            if (!this.f8071w) {
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8707J1)).booleanValue() && this.f12693b.f10508k0) {
                    Iterator it = this.f8056E.keySet().iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) this.f8056E.get((String) it.next())).booleanValue()) {
                            break;
                        }
                    }
                }
                if (z3) {
                    s(view, map, map2);
                    return;
                }
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8737O3)).booleanValue() && map != null) {
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                        if (view2 != null && n(view2)) {
                            s(view, map, map2);
                            return;
                        }
                    }
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    public final synchronized void c(View view, View view2, Map map, Map map2, boolean z3) {
        InterfaceC0677Re R4;
        Wj wj;
        Pj pj = this.f8061m;
        ?? r1 = this.f8069u;
        if (r1 != 0 && (wj = pj.f11097e) != null && r1.g() != null && pj.f11095c.f()) {
            try {
                r1.g().addView(wj.a());
            } catch (C0719Xe e3) {
                T2.G.n("web view can not be obtained", e3);
            }
        }
        this.f8060l.n(view, view2, map, map2, z3, q());
        if (this.f8072x) {
            Gj gj = this.f8059k;
            if (gj.R() != null && (R4 = gj.R()) != null) {
                R4.a("onSdkAdUserInteractionClick", new C2327e(0));
            }
        }
    }

    public final synchronized void d(final View view, final int i) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.db)).booleanValue()) {
            E5 e5 = this.f8069u;
            if (e5 == null) {
                U2.j.d("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z3 = e5 instanceof Mj;
                this.f8058j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zj
                    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
                    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
                    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Cj cj = Cj.this;
                        ?? r1 = cj.f8069u;
                        if (r1 == 0) {
                            U2.j.d("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                            return;
                        }
                        View c5 = r1.c();
                        Map o5 = cj.f8069u.o();
                        Map l5 = cj.f8069u.l();
                        ImageView.ScaleType q5 = cj.q();
                        cj.f8060l.t(view, c5, o5, l5, z3, q5, i);
                    }
                });
            }
        }
    }

    public final synchronized void e(String str) {
        this.f8060l.u(str);
    }

    public final synchronized void f(Bundle bundle) {
        this.f8060l.o(bundle);
    }

    public final void g(View view) {
        C0634Ld c0634Ld;
        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.Z4)).booleanValue();
        Gj gj = this.f8059k;
        if (!booleanValue || gj.D() == 3) {
            u(view, gj.T());
            return;
        }
        synchronized (gj) {
            c0634Ld = gj.f9237n;
        }
        if (c0634Ld == null) {
            return;
        }
        C1390oj c1390oj = new C1390oj(18, this, view, false);
        c0634Ld.a(new Kw(0, c0634Ld, c1390oj), this.f8058j);
    }

    public final synchronized void h(View view, MotionEvent motionEvent, View view2) {
        this.f8060l.f(view2, motionEvent);
    }

    public final synchronized void i(Bundle bundle) {
        this.f8060l.q(bundle);
    }

    public final synchronized void j(View view) {
        this.f8060l.d(view);
    }

    public final synchronized void k(InterfaceViewOnClickListenerC0810bk interfaceViewOnClickListenerC0810bk) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8696H1)).booleanValue()) {
            T2.L.f5672l.post(new RunnableC1794xj(this, interfaceViewOnClickListenerC0810bk, 0));
        } else {
            v(interfaceViewOnClickListenerC0810bk);
        }
    }

    public final synchronized void l(InterfaceViewOnClickListenerC0810bk interfaceViewOnClickListenerC0810bk) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8696H1)).booleanValue()) {
            T2.L.f5672l.post(new RunnableC1794xj(this, interfaceViewOnClickListenerC0810bk, 1));
        } else {
            w(interfaceViewOnClickListenerC0810bk);
        }
    }

    public final synchronized boolean m() {
        return this.f8060l.D();
    }

    public final synchronized boolean o(Bundle bundle) {
        if (this.f8071w) {
            return true;
        }
        boolean i = this.f8060l.i(bundle);
        this.f8071w = i;
        return i;
    }

    public final synchronized int p() {
        return this.f8060l.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    public final synchronized ImageView.ScaleType q() {
        ?? r02 = this.f8069u;
        if (r02 == 0) {
            U2.j.d("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        InterfaceC2360a h3 = r02.h();
        if (h3 != null) {
            return (ImageView.ScaleType) BinderC2361b.t1(h3);
        }
        return Pj.f11092k;
    }

    public final void r() {
        E3.a aVar;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Z4)).booleanValue()) {
            y("Google", true);
            return;
        }
        Gj gj = this.f8059k;
        synchronized (gj) {
            aVar = gj.f9236m;
        }
        if (aVar == null) {
            return;
        }
        C1529ro c1529ro = new C1529ro(19, this);
        aVar.a(new Kw(0, aVar, c1529ro), this.f8058j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    public final synchronized void s(View view, Map map, Map map2) {
        this.f8061m.a(this.f8069u);
        this.f8060l.b(view, map, map2, q());
        this.f8071w = true;
    }

    public final void u(View view, C1169jn c1169jn) {
        InterfaceC0677Re Q5 = this.f8059k.Q();
        if (!this.f8062n.c() || c1169jn == null || Q5 == null || view == null) {
            return;
        }
        Oi oi = P2.o.f4767B.f4789w;
        C1893zs c1893zs = c1169jn.f14142a;
        oi.getClass();
        Oi.h(c1893zs, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    public final synchronized void v(InterfaceViewOnClickListenerC0810bk interfaceViewOnClickListenerC0810bk) {
        Iterator<String> keys;
        View view;
        N4 n42;
        try {
            if (!this.f8070v) {
                this.f8069u = (E5) interfaceViewOnClickListenerC0810bk;
                Pj pj = this.f8061m;
                pj.f11098g.execute(new Kw(pj, interfaceViewOnClickListenerC0810bk));
                this.f8060l.g(interfaceViewOnClickListenerC0810bk.c(), interfaceViewOnClickListenerC0810bk.l(), interfaceViewOnClickListenerC0810bk.m(), interfaceViewOnClickListenerC0810bk, interfaceViewOnClickListenerC0810bk);
                A7 a7 = F7.f8662B2;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && (n42 = this.f8074z.f11167b) != null) {
                    n42.b(interfaceViewOnClickListenerC0810bk.c());
                }
                if (((Boolean) rVar.f5056c.a(F7.f8707J1)).booleanValue()) {
                    Lq lq = this.f12693b;
                    if (lq.f10508k0 && (keys = lq.f10506j0.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            ?? r22 = this.f8069u;
                            WeakReference weakReference = r22 == 0 ? null : (WeakReference) r22.o().get(next);
                            this.f8056E.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                M5 m5 = new M5(this.f8053B, view);
                                this.f8057F.add(m5);
                                m5.f10598v.add(new Aj(this, next));
                                m5.c(3);
                            }
                        }
                    }
                }
                if (interfaceViewOnClickListenerC0810bk.e() != null) {
                    M5 e3 = interfaceViewOnClickListenerC0810bk.e();
                    e3.f10598v.add(this.f8073y);
                    e3.c(3);
                }
            }
        } finally {
        }
    }

    public final void w(InterfaceViewOnClickListenerC0810bk interfaceViewOnClickListenerC0810bk) {
        View c5 = interfaceViewOnClickListenerC0810bk.c();
        interfaceViewOnClickListenerC0810bk.o();
        this.f8060l.p(c5);
        if (interfaceViewOnClickListenerC0810bk.g() != null) {
            interfaceViewOnClickListenerC0810bk.g().setClickable(false);
            interfaceViewOnClickListenerC0810bk.g().removeAllViews();
        }
        if (interfaceViewOnClickListenerC0810bk.e() != null) {
            M5 e3 = interfaceViewOnClickListenerC0810bk.e();
            e3.f10598v.remove(this.f8073y);
        }
        this.f8069u = null;
    }

    public final synchronized void x() {
        this.f8070v = true;
        this.f8058j.execute(new RunnableC1839yj(this, 1));
        Xh xh = this.f12694c;
        xh.getClass();
        xh.n1(new E7(null, 1));
    }

    public final C1169jn y(String str, boolean z3) {
        String str2;
        int i;
        int i5;
        C1169jn c1169jn;
        Object obj;
        if (this.f8062n.c() && !TextUtils.isEmpty(str)) {
            Gj gj = this.f8059k;
            InterfaceC0677Re Q5 = gj.Q();
            InterfaceC0677Re R4 = gj.R();
            if (Q5 == null && R4 == null) {
                U2.j.i("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            boolean z5 = Q5 != null;
            boolean z6 = R4 != null;
            A7 a7 = F7.X4;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                this.f8062n.a();
                int g5 = this.f8062n.a().g();
                int i6 = g5 - 1;
                if (i6 != 0) {
                    if (i6 != 1) {
                        U2.j.i("Unknown omid media type: " + (g5 != 1 ? g5 != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                        return null;
                    }
                    if (Q5 == null) {
                        U2.j.i("Omid media type was display but there was no display webview.");
                        return null;
                    }
                    z6 = false;
                    z5 = true;
                } else {
                    if (R4 == null) {
                        U2.j.i("Omid media type was video but there was no video webview.");
                        return null;
                    }
                    z5 = false;
                    z6 = true;
                }
            }
            if (z5) {
                str2 = null;
            } else {
                str2 = "javascript";
                Q5 = R4;
            }
            if (Q5 != null) {
                Context context = this.f8053B;
                P2.o oVar = P2.o.f4767B;
                oVar.f4789w.getClass();
                if (!Oi.j(context)) {
                    U2.j.i("Failed to initialize omid in InternalNativeAd");
                    return null;
                }
                U2.a aVar = this.f8052A;
                String str3 = aVar.f5853l + "." + aVar.f5854m;
                if (z6) {
                    i5 = 3;
                    i = 2;
                } else {
                    i = this.f8059k.D() == 3 ? 4 : 3;
                    i5 = 2;
                }
                Oi oi = oVar.f4789w;
                WebView m02 = Q5.m0();
                String str4 = this.f12693b.f10510l0;
                oi.getClass();
                if (((Boolean) rVar.f5056c.a(F7.f8750Q4)).booleanValue() && AbstractC1803xs.f16343b.f2300l) {
                    try {
                        obj = new C1036gn(str, str3, str2, i5, m02, str4, i).c();
                    } catch (RuntimeException e3) {
                        P2.o.f4767B.f4774g.h("omid exception", e3);
                        obj = null;
                    }
                    c1169jn = (C1169jn) obj;
                } else {
                    c1169jn = null;
                }
                if (c1169jn == null) {
                    U2.j.i("Failed to create omid session in InternalNativeAd");
                    return null;
                }
                Gj gj2 = this.f8059k;
                synchronized (gj2) {
                    gj2.f9235l = c1169jn;
                }
                Q5.U0(c1169jn);
                if (z6) {
                    C1893zs c1893zs = c1169jn.f14142a;
                    if (R4 != null) {
                        View K = R4.K();
                        oVar.f4789w.getClass();
                        Oi.h(c1893zs, K);
                    }
                    this.f8072x = true;
                }
                if (z3) {
                    Oi oi2 = oVar.f4789w;
                    C1893zs c1893zs2 = c1169jn.f14142a;
                    oi2.getClass();
                    Oi.i(c1893zs2);
                    Q5.a("onSdkLoaded", new C2327e(0));
                }
                return c1169jn;
            }
            U2.j.i("Webview is null in InternalNativeAd");
        }
        return null;
    }

    public final synchronized JSONObject z(View view, Map map, Map map2) {
        return this.f8060l.c(view, map, map2, q());
    }
}

package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.iq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1128iq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13996a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f13997b;

    /* renamed from: c, reason: collision with root package name */
    public final C0554Af f13998c;

    /* renamed from: d, reason: collision with root package name */
    public final Eo f13999d;

    /* renamed from: e, reason: collision with root package name */
    public final Go f14000e;
    public final FrameLayout f;

    /* renamed from: g, reason: collision with root package name */
    public N7 f14001g;

    /* renamed from: h, reason: collision with root package name */
    public final C1344ni f14002h;
    public final Nr i;

    /* renamed from: j, reason: collision with root package name */
    public final C1838yi f14003j;

    /* renamed from: k, reason: collision with root package name */
    public final Vq f14004k;

    /* renamed from: l, reason: collision with root package name */
    public Cr f14005l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14006m;

    /* renamed from: n, reason: collision with root package name */
    public C0387u0 f14007n;

    /* renamed from: o, reason: collision with root package name */
    public Jo f14008o;

    public C1128iq(Context context, Executor executor, Q2.a1 a1Var, C0554Af c0554Af, Eo eo, Go go, Vq vq, C1838yi c1838yi) {
        this.f13996a = context;
        this.f13997b = executor;
        this.f13998c = c0554Af;
        this.f13999d = eo;
        this.f14000e = go;
        this.f14004k = vq;
        this.f14002h = new C1344ni((ScheduledExecutorService) c0554Af.f7650d.d(), (C2308a) c0554Af.f.d());
        this.i = c0554Af.C();
        this.f = new FrameLayout(context);
        this.f14003j = c1838yi;
        vq.f11944b = a1Var;
        this.f14006m = true;
        this.f14007n = null;
        this.f14008o = null;
    }

    public final boolean a() {
        Cr cr = this.f14005l;
        return (cr == null || cr.f8093m.isDone()) ? false : true;
    }

    public final boolean b(Q2.X0 x02, String str, AbstractC1668us abstractC1668us, Jo jo) {
        C0594Ff c0594Ff;
        int i = 15;
        int i5 = 0;
        Executor executor = this.f13997b;
        if (str == null) {
            U2.j.f("Ad unit ID should not be null for banner ad.");
            executor.execute(new RunnableC1303mm(8, this));
            return false;
        }
        boolean a5 = a();
        Vq vq = this.f14004k;
        if (!a5) {
            A7 a7 = F7.z8;
            Q2.r rVar = Q2.r.f5053d;
            boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
            C0554Af c0554Af = this.f13998c;
            if (booleanValue && x02.f4962p) {
                ((Ul) c0554Af.f7684v.d()).e(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(x02.J));
            P2.o.f4767B.f4776j.getClass();
            Bundle i6 = AbstractC1668us.i(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            vq.f11945c = str;
            vq.f11943a = x02;
            vq.f11960t = i6;
            Wq a6 = vq.a();
            int W4 = AbstractC1803xs.W(a6);
            Context context = this.f13996a;
            Jr C5 = AbstractC1668us.C(context, W4, 3, x02);
            boolean booleanValue2 = ((Boolean) AbstractC1326n8.f14587d.s()).booleanValue();
            Mr mr = null;
            Eo eo = this.f13999d;
            if (!booleanValue2 || !vq.f11944b.f4984u) {
                boolean booleanValue3 = ((Boolean) rVar.f5056c.a(F7.L7)).booleanValue();
                FrameLayout frameLayout = this.f;
                C1838yi c1838yi = this.f14003j;
                C1344ni c1344ni = this.f14002h;
                if (booleanValue3) {
                    C0554Af c0554Af2 = c0554Af.f7646b;
                    Gh gh = new Gh();
                    gh.f9206a = context;
                    gh.f9207b = a6;
                    Gh gh2 = new Gh(gh);
                    Fi fi = new Fi();
                    fi.b(eo, executor);
                    fi.c(eo, executor);
                    Gi gi = new Gi(fi);
                    C1529ro c1529ro = new C1529ro(i5, this.f14001g);
                    c0594Ff = new C0594Ff(c0554Af2, new Mt(i, frameLayout), new C1390oj(i5, Kj.f10210h, mr), new Oi(13), gi, gh2, new Qt(23), c1529ro, new C0709Wb(i, c1344ni, c1838yi), null, null);
                } else {
                    C0554Af c0554Af3 = c0554Af.f7646b;
                    Gh gh3 = new Gh();
                    gh3.f9206a = context;
                    gh3.f9207b = a6;
                    Gh gh4 = new Gh(gh3);
                    Fi fi2 = new Fi();
                    fi2.b(eo, executor);
                    Si si = new Si(eo, executor);
                    HashSet hashSet = fi2.f9089c;
                    hashSet.add(si);
                    hashSet.add(new Si(this.f14000e, executor));
                    fi2.d(eo, executor);
                    fi2.f.add(new Si(eo, executor));
                    fi2.f9091e.add(new Si(eo, executor));
                    fi2.f9093h.add(new Si(eo, executor));
                    fi2.a(eo, executor);
                    fi2.c(eo, executor);
                    fi2.f9097m.add(new Si(eo, executor));
                    Gi gi2 = new Gi(fi2);
                    C1529ro c1529ro2 = new C1529ro(i5, this.f14001g);
                    int i7 = 15;
                    c0594Ff = new C0594Ff(c0554Af3, new Mt(i7, frameLayout), new C1390oj(i5, Kj.f10210h, mr), new Oi(13), gi2, gh4, new Qt(23), c1529ro2, new C0709Wb(i7, c1344ni, c1838yi), null, null);
                }
                if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
                    mr = (Mr) c0594Ff.f9051q0.d();
                    mr.i(3);
                    mr.b(x02.f4972z);
                    mr.f(x02.f4969w);
                }
                Mr mr2 = mr;
                this.f14008o = jo;
                C1253lh c1253lh = (C1253lh) c0594Ff.f8972H0.d();
                Cr a8 = c1253lh.a(c1253lh.b());
                this.f14005l = a8;
                a8.a(new Kw(i5, a8, new m2.g(this, mr2, C5, c0594Ff, 12)), executor);
                return true;
            }
            if (eo != null) {
                eo.l0(AbstractC1803xs.I(7, null, null));
            }
        } else if (!vq.f11956p) {
            this.f14006m = true;
            return false;
        }
        return false;
    }

    public final void c() {
        int i;
        C1838yi c1838yi = this.f14003j;
        C1344ni c1344ni = this.f14002h;
        synchronized (c1838yi) {
            i = c1838yi.f16462l;
        }
        c1344ni.q1(i);
    }

    public final void d() {
        synchronized (this) {
            try {
                Cr cr = this.f14005l;
                if (cr != null && cr.f8093m.isDone()) {
                    try {
                        AbstractC0579Dg abstractC0579Dg = (AbstractC0579Dg) this.f14005l.f8093m.get();
                        this.f14005l = null;
                        this.f.removeAllViews();
                        if (abstractC0579Dg.d() != null) {
                            ViewParent parent = abstractC0579Dg.d().getParent();
                            if (parent instanceof ViewGroup) {
                                U2.j.i("Banner view provided from " + abstractC0579Dg.f.f9590k + " already has a parent view. Removing its old parent.");
                                ((ViewGroup) parent).removeView(abstractC0579Dg.d());
                            }
                        }
                        A7 a7 = F7.L7;
                        Q2.r rVar = Q2.r.f5053d;
                        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                            Qt qt = abstractC0579Dg.f12697g.f15334k;
                            Eo eo = this.f13999d;
                            C1523ri c1523ri = (C1523ri) qt.f11282l;
                            c1523ri.f15335l = eo;
                            c1523ri.f15336m = this.f14000e;
                        }
                        this.f.addView(abstractC0579Dg.d());
                        Jo jo = this.f14008o;
                        if (jo != null) {
                            jo.h(abstractC0579Dg);
                        }
                        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                            Executor executor = this.f13997b;
                            Eo eo2 = this.f13999d;
                            Objects.requireNonNull(eo2);
                            executor.execute(new RunnableC1303mm(7, eo2));
                        }
                        if (abstractC0579Dg.b() >= 0) {
                            this.f14006m = false;
                            this.f14002h.p1(abstractC0579Dg.b());
                            this.f14002h.q1(abstractC0579Dg.c());
                        } else {
                            this.f14006m = true;
                            this.f14002h.p1(abstractC0579Dg.c());
                        }
                    } catch (InterruptedException e3) {
                        e = e3;
                        f();
                        T2.G.n("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f14006m = true;
                        this.f14002h.i();
                    } catch (ExecutionException e5) {
                        e = e5;
                        f();
                        T2.G.n("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f14006m = true;
                        this.f14002h.i();
                    }
                } else if (this.f14005l != null) {
                    T2.G.m("Show timer went off but there is an ongoing ad request.");
                    this.f14006m = true;
                } else {
                    T2.G.m("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f14006m = true;
                    this.f14002h.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        Object parent = this.f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        T2.L l5 = P2.o.f4767B.f4771c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return T2.L.o(view, powerManager, keyguardManager);
    }

    public final void f() {
        this.f14005l = null;
        C0387u0 c0387u0 = this.f14007n;
        this.f14007n = null;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.L7)).booleanValue() && c0387u0 != null) {
            this.f13997b.execute(new RunnableC1081hn(5, this, c0387u0));
        }
        Jo jo = this.f14008o;
        if (jo != null) {
            jo.mo10a();
        }
    }
}

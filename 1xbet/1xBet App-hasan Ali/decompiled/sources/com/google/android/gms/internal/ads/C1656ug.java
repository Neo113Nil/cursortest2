package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.ug, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1656ug implements L5, Wh, S2.m, Vh {

    /* renamed from: k, reason: collision with root package name */
    public final C1477qg f15877k;

    /* renamed from: l, reason: collision with root package name */
    public final C1521rg f15878l;

    /* renamed from: n, reason: collision with root package name */
    public final C0581Ea f15880n;

    /* renamed from: o, reason: collision with root package name */
    public final Executor f15881o;

    /* renamed from: p, reason: collision with root package name */
    public final C2308a f15882p;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f15879m = new HashSet();

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f15883q = new AtomicBoolean(false);

    /* renamed from: r, reason: collision with root package name */
    public final C1611tg f15884r = new C1611tg();

    /* renamed from: s, reason: collision with root package name */
    public boolean f15885s = false;

    /* renamed from: t, reason: collision with root package name */
    public WeakReference f15886t = new WeakReference(this);

    public C1656ug(C0573Da c0573Da, C1521rg c1521rg, Executor executor, C1477qg c1477qg, C2308a c2308a) {
        this.f15877k = c1477qg;
        Charset charset = AbstractC1830ya.f16433a;
        c0573Da.a();
        this.f15880n = new C0581Ea(0, c0573Da.f8192b);
        this.f15878l = c1521rg;
        this.f15881o = executor;
        this.f15882p = c2308a;
    }

    @Override // S2.m
    public final void N2() {
    }

    @Override // S2.m
    public final void Q1() {
    }

    @Override // S2.m
    public final synchronized void Z2() {
        this.f15884r.f15698b = false;
        a();
    }

    public final synchronized void a() {
        try {
            if (this.f15886t.get() == null) {
                b();
                return;
            }
            if (this.f15885s || !this.f15883q.get()) {
                return;
            }
            try {
                C1611tg c1611tg = this.f15884r;
                this.f15882p.getClass();
                c1611tg.f15699c = SystemClock.elapsedRealtime();
                JSONObject o5 = this.f15878l.o(this.f15884r);
                Iterator it = this.f15879m.iterator();
                while (it.hasNext()) {
                    this.f15881o.execute(new RunnableC1566sg((InterfaceC0677Re) it.next(), o5, 0));
                }
                C0581Ea c0581Ea = this.f15880n;
                c0581Ea.getClass();
                C0565Ca c0565Ca = new C0565Ca(1, c0581Ea, o5);
                C0606Hd c0606Hd = AbstractC0613Id.f9544g;
                C1537rw j02 = AbstractC1400ot.j0(c0581Ea.f8512b, c0565Ca, c0606Hd);
                j02.a(new Kw(0, j02, new C1091hx("ActiveViewListener.callActiveViewJs", 4)), c0606Hd);
            } catch (Exception e3) {
                T2.G.n("Failed to call ActiveViewJS", e3);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        i();
        this.f15885s = true;
    }

    @Override // com.google.android.gms.internal.ads.Wh
    public final synchronized void d(Context context) {
        this.f15884r.f15700d = "u";
        a();
        i();
        this.f15885s = true;
    }

    @Override // S2.m
    public final void d1(int i) {
    }

    @Override // S2.m
    public final void h1() {
    }

    public final void i() {
        Iterator it = this.f15879m.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            C1477qg c1477qg = this.f15877k;
            if (!hasNext) {
                C1432pg c1432pg = c1477qg.f15151e;
                C0573Da c0573Da = c1477qg.f15148b;
                E3.a aVar = c0573Da.f8192b;
                C0557Ba c0557Ba = new C0557Ba(0, str2, c1432pg);
                C0606Hd c0606Hd = AbstractC0613Id.f9544g;
                C1582sw h02 = AbstractC1400ot.h0(aVar, c0557Ba, c0606Hd);
                c0573Da.f8192b = h02;
                c0573Da.f8192b = AbstractC1400ot.h0(h02, new C0557Ba(0, str, c1477qg.f), c0606Hd);
                return;
            }
            InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) it.next();
            interfaceC0677Re.r("/updateActiveView", c1477qg.f15151e);
            interfaceC0677Re.r("/untrackActiveViewUnit", c1477qg.f);
        }
    }

    @Override // com.google.android.gms.internal.ads.Wh
    public final synchronized void j(Context context) {
        this.f15884r.f15698b = false;
        a();
    }

    @Override // com.google.android.gms.internal.ads.Vh
    public final synchronized void t() {
        if (this.f15883q.compareAndSet(false, true)) {
            C1477qg c1477qg = this.f15877k;
            C1432pg c1432pg = c1477qg.f15151e;
            C0573Da c0573Da = c1477qg.f15148b;
            c0573Da.a();
            E3.a aVar = c0573Da.f8192b;
            C0565Ca c0565Ca = new C0565Ca(0, "/updateActiveView", c1432pg);
            C0606Hd c0606Hd = AbstractC0613Id.f9544g;
            c0573Da.f8192b = AbstractC1400ot.j0(aVar, c0565Ca, c0606Hd);
            C1432pg c1432pg2 = c1477qg.f;
            c0573Da.a();
            c0573Da.f8192b = AbstractC1400ot.j0(c0573Da.f8192b, new C0565Ca(0, "/untrackActiveViewUnit", c1432pg2), c0606Hd);
            c1477qg.f15150d = this;
            a();
        }
    }

    @Override // S2.m
    public final synchronized void t1() {
        this.f15884r.f15698b = true;
        a();
    }

    @Override // com.google.android.gms.internal.ads.Wh
    public final synchronized void u(Context context) {
        this.f15884r.f15698b = true;
        a();
    }

    @Override // com.google.android.gms.internal.ads.L5
    public final synchronized void z0(K5 k5) {
        C1611tg c1611tg = this.f15884r;
        c1611tg.f15697a = k5.f10128j;
        c1611tg.f15701e = k5;
        a();
    }
}

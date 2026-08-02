package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import q3.AbstractC2309b;

/* renamed from: com.google.android.gms.internal.ads.Cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568Cd {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8009a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final T2.I f8010b;

    /* renamed from: c, reason: collision with root package name */
    public final C0584Ed f8011c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8012d;

    /* renamed from: e, reason: collision with root package name */
    public Context f8013e;
    public U2.a f;

    /* renamed from: g, reason: collision with root package name */
    public String f8014g;

    /* renamed from: h, reason: collision with root package name */
    public G7 f8015h;
    public Boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f8016j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f8017k;

    /* renamed from: l, reason: collision with root package name */
    public final C0560Bd f8018l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f8019m;

    /* renamed from: n, reason: collision with root package name */
    public E3.a f8020n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f8021o;

    public C0568Cd() {
        T2.I i = new T2.I();
        this.f8010b = i;
        this.f8011c = new C0584Ed(C0379q.f.f5050c, i);
        this.f8012d = false;
        this.f8015h = null;
        this.i = null;
        this.f8016j = new AtomicInteger(0);
        this.f8017k = new AtomicInteger(0);
        this.f8018l = new C0560Bd();
        this.f8019m = new Object();
        this.f8021o = new AtomicBoolean();
    }

    public final boolean a(Context context) {
        if (AbstractC2309b.e()) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Y7)).booleanValue()) {
                return this.f8021o.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final Resources b() {
        if (this.f.f5855n) {
            return this.f8013e.getResources();
        }
        try {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.wa)).booleanValue()) {
                return U2.j.b(this.f8013e).f19580a.getResources();
            }
            U2.j.b(this.f8013e).f19580a.getResources();
            return null;
        } catch (U2.k e3) {
            U2.j.j("Cannot load resource from dynamite apk or local jar", e3);
            return null;
        }
    }

    public final G7 c() {
        G7 g7;
        synchronized (this.f8009a) {
            g7 = this.f8015h;
        }
        return g7;
    }

    public final T2.I d() {
        T2.I i;
        synchronized (this.f8009a) {
            i = this.f8010b;
        }
        return i;
    }

    public final E3.a e() {
        if (this.f8013e != null) {
            if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8730N2)).booleanValue()) {
                synchronized (this.f8019m) {
                    try {
                        E3.a aVar = this.f8020n;
                        if (aVar != null) {
                            return aVar;
                        }
                        E3.a d5 = AbstractC0613Id.f9539a.d(new S4(1, this));
                        this.f8020n = d5;
                        return d5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return AbstractC1400ot.c0(new ArrayList());
    }

    public final Boolean f() {
        Boolean bool;
        synchronized (this.f8009a) {
            bool = this.i;
        }
        return bool;
    }

    public final void g(Context context, U2.a aVar) {
        G7 g7;
        synchronized (this.f8009a) {
            try {
                if (!this.f8012d) {
                    this.f8013e = context.getApplicationContext();
                    this.f = aVar;
                    P2.o.f4767B.f.i(this.f8011c);
                    this.f8010b.y(this.f8013e);
                    C0802bc.d(this.f8013e, this.f);
                    A7 a7 = F7.f8778W1;
                    Q2.r rVar = Q2.r.f5053d;
                    if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                        g7 = new G7();
                    } else {
                        T2.G.m("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        g7 = null;
                    }
                    this.f8015h = g7;
                    if (g7 != null) {
                        AbstractC1803xs.k(new S2.i(2, this).l(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.f8013e;
                    if (AbstractC2309b.e()) {
                        if (((Boolean) rVar.f5056c.a(F7.Y7)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new D2.g(2, this));
                            } catch (RuntimeException e3) {
                                U2.j.j("Failed to register network callback", e3);
                                this.f8021o.set(true);
                            }
                        }
                    }
                    this.f8012d = true;
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        P2.o.f4767B.f4771c.x(context, aVar.f5852k);
    }

    public final void h(String str, Throwable th) {
        C0802bc.d(this.f8013e, this.f).c(th, str, ((Double) AbstractC1461q8.f15110g.s()).floatValue());
    }

    public final void i(String str, Throwable th) {
        C0802bc.d(this.f8013e, this.f).b(str, th);
    }

    public final void j(String str, Throwable th) {
        Context context = this.f8013e;
        U2.a aVar = this.f;
        synchronized (C0802bc.f12816u) {
            try {
                if (C0802bc.f12818w == null) {
                    A7 a7 = F7.o7;
                    Q2.r rVar = Q2.r.f5053d;
                    if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                        if (!((Boolean) rVar.f5056c.a(F7.n7)).booleanValue()) {
                            C0802bc.f12818w = new C0802bc(context, aVar);
                        }
                    }
                    C0802bc.f12818w = new V9(13);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C0802bc.f12818w.b(str, th);
    }

    public final void k(Boolean bool) {
        synchronized (this.f8009a) {
            this.i = bool;
        }
    }
}

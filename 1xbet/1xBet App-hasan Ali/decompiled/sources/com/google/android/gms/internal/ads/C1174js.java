package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import q3.C2308a;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.js, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1174js {

    /* renamed from: a, reason: collision with root package name */
    public final ClientApi f14173a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14174b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14175c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0624Ka f14176d;

    /* renamed from: e, reason: collision with root package name */
    public Q2.R0 f14177e;

    /* renamed from: g, reason: collision with root package name */
    public final Q2.O f14178g;
    public final C1219ks i;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f14181k;

    /* renamed from: n, reason: collision with root package name */
    public U4 f14184n;

    /* renamed from: o, reason: collision with root package name */
    public final C2308a f14185o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f14186p;

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentLinkedQueue f14179h = new ConcurrentLinkedQueue();
    public final AtomicBoolean f = new AtomicBoolean(true);

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f14180j = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f14182l = new AtomicBoolean(true);

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f14183m = new AtomicBoolean(false);

    public C1174js(ClientApi clientApi, Context context, int i, InterfaceC0624Ka interfaceC0624Ka, Q2.R0 r02, Q2.O o5, ScheduledExecutorService scheduledExecutorService, C1219ks c1219ks, C2308a c2308a, int i5) {
        this.f14186p = i5;
        this.f14173a = clientApi;
        this.f14174b = context;
        this.f14175c = i;
        this.f14176d = interfaceC0624Ka;
        this.f14177e = r02;
        this.f14178g = o5;
        this.f14181k = scheduledExecutorService;
        this.i = c1219ks;
        this.f14185o = c2308a;
    }

    public static void i(C1174js c1174js, C0387u0 c0387u0) {
        synchronized (c1174js) {
            c1174js.f14180j.set(false);
            int i = c0387u0.f5058k;
            if (i != 1 && i != 8 && i != 10 && i != 11) {
                c1174js.b(true);
                return;
            }
            Q2.R0 r02 = c1174js.f14177e;
            U2.j.h("Preloading " + r02.f4936l + ", for adUnitId:" + r02.f4935k + ", Ad load failed. Stop preloading due to non-retriable error:");
            c1174js.f.set(false);
        }
    }

    public final synchronized void a() {
        Iterator it = this.f14179h.iterator();
        while (it.hasNext()) {
            C1533rs c1533rs = (C1533rs) it.next();
            c1533rs.f15389c.getClass();
            if (System.currentTimeMillis() >= c1533rs.f15388b + c1533rs.f15390d) {
                it.remove();
            }
        }
    }

    public final synchronized void b(boolean z3) {
        try {
            C1219ks c1219ks = this.i;
            if (c1219ks.f14299c <= Math.max(c1219ks.f14300d, ((Integer) Q2.r.f5053d.f5056c.a(F7.f8934z)).intValue()) || c1219ks.f14301e < c1219ks.f14298b) {
                if (z3) {
                    C1219ks c1219ks2 = this.i;
                    double d5 = c1219ks2.f14301e;
                    c1219ks2.f14301e = Math.min((long) (d5 + d5), c1219ks2.f14298b);
                    c1219ks2.f14299c++;
                }
                ScheduledExecutorService scheduledExecutorService = this.f14181k;
                RunnableC1578ss runnableC1578ss = new RunnableC1578ss(this, 0);
                C1219ks c1219ks3 = this.i;
                double d6 = c1219ks3.f14301e;
                double d7 = 0.2d * d6;
                long j5 = (long) (d6 + d7);
                scheduledExecutorService.schedule(runnableC1578ss, ((long) (d6 - d7)) + ((long) (c1219ks3.f.nextDouble() * ((j5 - r4) + 1))), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Xw c() {
        switch (this.f14186p) {
            case 0:
                Xw xw = new Xw();
                BinderC2361b binderC2361b = new BinderC2361b(this.f14174b);
                Q2.a1 a5 = Q2.a1.a();
                Q2.R0 r02 = this.f14177e;
                int i = this.f14175c;
                Q2.K J22 = this.f14173a.J2(binderC2361b, a5, r02.f4935k, this.f14176d, i);
                if (J22 != null) {
                    try {
                        BinderC1084hq binderC1084hq = (BinderC1084hq) J22;
                        binderC1084hq.P2(new BinderC1130is(this, xw, this.f14177e));
                        binderC1084hq.v0(this.f14177e.f4937m);
                    } catch (RemoteException e3) {
                        U2.j.j("Failed to load app open ad.", e3);
                        xw.g(new C1086hs());
                    }
                } else {
                    xw.g(new C1086hs());
                }
                return xw;
            case 1:
                Xw xw2 = new Xw();
                BinderC2361b binderC2361b2 = new BinderC2361b(this.f14174b);
                Q2.a1 a1Var = new Q2.a1();
                Q2.R0 r03 = this.f14177e;
                int i5 = this.f14175c;
                Q2.K J12 = this.f14173a.J1(binderC2361b2, a1Var, r03.f4935k, this.f14176d, i5);
                if (J12 != null) {
                    try {
                        ((Ho) J12).b2(this.f14177e.f4937m, new BinderC1264ls(this, xw2, (Ho) J12));
                    } catch (RemoteException e5) {
                        U2.j.j("Failed to load interstitial ad.", e5);
                        xw2.g(new C1086hs());
                    }
                } else {
                    xw2.g(new C1086hs());
                }
                return xw2;
            default:
                Xw xw3 = new Xw();
                BinderC2361b binderC2361b3 = new BinderC2361b(this.f14174b);
                Q2.R0 r04 = this.f14177e;
                int i6 = this.f14175c;
                InterfaceC0612Ic q12 = this.f14173a.q1(binderC2361b3, r04.f4935k, this.f14176d, i6);
                BinderC1758ws binderC1758ws = new BinderC1758ws(this, xw3, (Iq) q12);
                if (q12 != null) {
                    try {
                        ((Iq) q12).f1(this.f14177e.f4937m, binderC1758ws);
                    } catch (RemoteException unused) {
                        U2.j.i("Failed to load rewarded ad.");
                        xw3.g(new C1086hs());
                    }
                } else {
                    xw3.g(new C1086hs());
                }
                return xw3;
        }
    }

    public final /* bridge */ Optional d(Object obj) {
        Optional empty;
        Optional ofNullable;
        Optional empty2;
        Optional ofNullable2;
        Optional empty3;
        Optional ofNullable3;
        switch (this.f14186p) {
            case 0:
                try {
                    ofNullable = Optional.ofNullable(((InterfaceC0966f6) obj).c());
                    return ofNullable;
                } catch (RemoteException e3) {
                    U2.j.e("Failed to get response info for the app open ad.", e3);
                    empty = Optional.empty();
                    return empty;
                }
            case 1:
                try {
                    ofNullable2 = Optional.ofNullable(((Q2.K) obj).k());
                    return ofNullable2;
                } catch (RemoteException e5) {
                    U2.j.e("Failed to get response info for  the interstitial ad.", e5);
                    empty2 = Optional.empty();
                    return empty2;
                }
            default:
                try {
                    ofNullable3 = Optional.ofNullable(((InterfaceC0612Ic) obj).i());
                    return ofNullable3;
                } catch (RemoteException e6) {
                    U2.j.e("Failed to get response info for the rewarded ad.", e6);
                    empty3 = Optional.empty();
                    return empty3;
                }
        }
    }

    public final synchronized void e() {
        this.f14181k.submit(new RunnableC1578ss(this, 0));
    }

    public final synchronized Object f() {
        C1533rs c1533rs = (C1533rs) this.f14179h.peek();
        if (c1533rs == null) {
            return null;
        }
        return c1533rs.f15387a;
    }

    public final synchronized Object g() {
        C1219ks c1219ks = this.i;
        c1219ks.f14301e = c1219ks.f14297a;
        c1219ks.f14299c = 0L;
        C1533rs c1533rs = (C1533rs) this.f14179h.poll();
        this.f14183m.set(c1533rs != null);
        j();
        if (c1533rs == null) {
            return null;
        }
        return c1533rs.f15387a;
    }

    public final synchronized Optional h() {
        Optional filter;
        Optional map;
        Optional map2;
        try {
            Object f = f();
            filter = (f == null ? Optional.empty() : d(f)).filter(new C1623ts(0));
            map = filter.map(new C1078hk(3));
            map2 = map.map(new C1078hk(4));
        } catch (Throwable th) {
            throw th;
        }
        return map2;
    }

    public final synchronized void j() {
        a();
        p();
        if (!this.f14180j.get() && this.f.get() && this.f14179h.size() < this.f14177e.f4938n) {
            this.f14180j.set(true);
            Xw c5 = c();
            Hq hq = new Hq(3, this);
            c5.a(new Kw(0, c5, hq), this.f14181k);
        }
    }

    public final synchronized void k(int i) {
        m3.v.a(i >= 5);
        this.i.a(i);
    }

    public final synchronized void l() {
        this.f.set(true);
        this.f14182l.set(true);
        this.f14181k.submit(new RunnableC1578ss(this, 0));
    }

    public final synchronized void m(int i) {
        try {
            m3.v.a(i > 0);
            Q2.R0 r02 = this.f14177e;
            String str = r02.f4935k;
            int i5 = r02.f4936l;
            Q2.X0 x02 = r02.f4937m;
            if (i <= 0) {
                i = r02.f4938n;
            }
            this.f14177e = new Q2.R0(str, i5, x02, i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean n() {
        a();
        return !this.f14179h.isEmpty();
    }

    public final synchronized void o(Object obj) {
        C2308a c2308a = this.f14185o;
        C1533rs c1533rs = new C1533rs(obj, c2308a);
        this.f14179h.add(c1533rs);
        C2308a c2308a2 = this.f14185o;
        Optional d5 = d(obj);
        c2308a2.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        T2.L.f5672l.post(new RunnableC1578ss(this, 1));
        this.f14181k.execute(new RunnableC1317n(this, currentTimeMillis, d5));
        RunnableC1578ss runnableC1578ss = new RunnableC1578ss(this, 0);
        long min = c1533rs.f15390d + Math.min(Math.max(((Long) Q2.r.f5053d.f5056c.a(F7.f8911v)).longValue(), -900000L), 10000L);
        c2308a.getClass();
        this.f14181k.schedule(runnableC1578ss, min - (System.currentTimeMillis() - c1533rs.f15388b), TimeUnit.MILLISECONDS);
    }

    public final synchronized void p() {
        if (this.f14183m.get() && this.f14179h.isEmpty()) {
            this.f14183m.set(false);
            T2.L.f5672l.post(new RunnableC1578ss(this, 2));
            this.f14181k.execute(new RunnableC1578ss(this, 3));
        }
    }
}

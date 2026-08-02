package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Kl {

    /* renamed from: d, reason: collision with root package name */
    public final long f10231d;
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakReference f10233g;

    /* renamed from: h, reason: collision with root package name */
    public final C0900dl f10234h;
    public final Qw i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f10235j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f10236k;

    /* renamed from: l, reason: collision with root package name */
    public final C1706vl f10237l;

    /* renamed from: m, reason: collision with root package name */
    public final U2.a f10238m;

    /* renamed from: o, reason: collision with root package name */
    public final Ii f10240o;

    /* renamed from: p, reason: collision with root package name */
    public final Nr f10241p;

    /* renamed from: a, reason: collision with root package name */
    public boolean f10228a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10229b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10230c = false;

    /* renamed from: e, reason: collision with root package name */
    public final C0634Ld f10232e = new C0634Ld();

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f10239n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public boolean f10242q = true;

    public Kl(Executor executor, Context context, WeakReference weakReference, Qw qw, C0900dl c0900dl, ScheduledExecutorService scheduledExecutorService, C1706vl c1706vl, U2.a aVar, Ii ii, Nr nr) {
        this.f10234h = c0900dl;
        this.f = context;
        this.f10233g = weakReference;
        this.i = qw;
        this.f10236k = scheduledExecutorService;
        this.f10235j = executor;
        this.f10237l = c1706vl;
        this.f10238m = aVar;
        this.f10240o = ii;
        this.f10241p = nr;
        P2.o.f4767B.f4776j.getClass();
        this.f10231d = SystemClock.elapsedRealtime();
        d("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f10239n;
        for (String str : concurrentHashMap.keySet()) {
            Q9 q9 = (Q9) concurrentHashMap.get(str);
            arrayList.add(new Q9(str, q9.f11189m, q9.f11190n, q9.f11188l));
        }
        return arrayList;
    }

    public final void b() {
        if (!((Boolean) AbstractC1326n8.f14584a.s()).booleanValue()) {
            int i = this.f10238m.f5854m;
            A7 a7 = F7.f8723M1;
            Q2.r rVar = Q2.r.f5053d;
            if (i >= ((Integer) rVar.f5056c.a(a7)).intValue() && this.f10242q) {
                if (this.f10228a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f10228a) {
                            return;
                        }
                        this.f10237l.d();
                        this.f10240o.c();
                        C0634Ld c0634Ld = this.f10232e;
                        final int i5 = 1;
                        c0634Ld.f10334k.a(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Hl

                            /* renamed from: l, reason: collision with root package name */
                            public final /* synthetic */ Kl f9469l;

                            {
                                this.f9469l = this;
                            }

                            private final void a() {
                                Kl kl = this.f9469l;
                                synchronized (kl) {
                                    try {
                                        if (kl.f10230c) {
                                            return;
                                        }
                                        P2.o.f4767B.f4776j.getClass();
                                        kl.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - kl.f10231d), "Timeout.", false);
                                        kl.f10237l.a("com.google.android.gms.ads.MobileAds", "timeout");
                                        kl.f10240o.j("com.google.android.gms.ads.MobileAds", "timeout");
                                        kl.f10232e.c(new Exception());
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        a();
                                        return;
                                    default:
                                        Kl kl = this.f9469l;
                                        C1706vl c1706vl = kl.f10237l;
                                        synchronized (c1706vl) {
                                            try {
                                                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8788Y1)).booleanValue() && !c1706vl.f16035d) {
                                                    HashMap e3 = c1706vl.e();
                                                    e3.put("action", "init_finished");
                                                    c1706vl.f16033b.add(e3);
                                                    ArrayList arrayList = c1706vl.f16033b;
                                                    int size = arrayList.size();
                                                    int i6 = 0;
                                                    while (i6 < size) {
                                                        Object obj = arrayList.get(i6);
                                                        i6++;
                                                        c1706vl.f.b((Map) obj, false);
                                                    }
                                                    c1706vl.f16035d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        kl.f10240o.b();
                                        kl.f10229b = true;
                                        return;
                                }
                            }
                        }, this.i);
                        this.f10228a = true;
                        E3.a c5 = c();
                        final int i6 = 0;
                        this.f10236k.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Hl

                            /* renamed from: l, reason: collision with root package name */
                            public final /* synthetic */ Kl f9469l;

                            {
                                this.f9469l = this;
                            }

                            private final void a() {
                                Kl kl = this.f9469l;
                                synchronized (kl) {
                                    try {
                                        if (kl.f10230c) {
                                            return;
                                        }
                                        P2.o.f4767B.f4776j.getClass();
                                        kl.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - kl.f10231d), "Timeout.", false);
                                        kl.f10237l.a("com.google.android.gms.ads.MobileAds", "timeout");
                                        kl.f10240o.j("com.google.android.gms.ads.MobileAds", "timeout");
                                        kl.f10232e.c(new Exception());
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        a();
                                        return;
                                    default:
                                        Kl kl = this.f9469l;
                                        C1706vl c1706vl = kl.f10237l;
                                        synchronized (c1706vl) {
                                            try {
                                                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8788Y1)).booleanValue() && !c1706vl.f16035d) {
                                                    HashMap e3 = c1706vl.e();
                                                    e3.put("action", "init_finished");
                                                    c1706vl.f16033b.add(e3);
                                                    ArrayList arrayList = c1706vl.f16033b;
                                                    int size = arrayList.size();
                                                    int i62 = 0;
                                                    while (i62 < size) {
                                                        Object obj = arrayList.get(i62);
                                                        i62++;
                                                        c1706vl.f.b((Map) obj, false);
                                                    }
                                                    c1706vl.f16035d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        kl.f10240o.b();
                                        kl.f10229b = true;
                                        return;
                                }
                            }
                        }, ((Long) rVar.f5056c.a(F7.f8735O1)).longValue(), TimeUnit.SECONDS);
                        Mt mt = new Mt(24, this);
                        c5.a(new Kw(0, c5, mt), this.i);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f10228a) {
            return;
        }
        d("com.google.android.gms.ads.MobileAds", 0, "", true);
        this.f10232e.b(Boolean.FALSE);
        this.f10228a = true;
        this.f10229b = true;
    }

    public final synchronized E3.a c() {
        P2.o oVar = P2.o.f4767B;
        String str = oVar.f4774g.d().t().f7598e;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC1400ot.c0(str);
        }
        C0634Ld c0634Ld = new C0634Ld();
        T2.I d5 = oVar.f4774g.d();
        d5.f5646c.add(new Kw(25, this, c0634Ld));
        return c0634Ld;
    }

    public final void d(String str, int i, String str2, boolean z3) {
        this.f10239n.put(str, new Q9(str, i, str2, z3));
    }
}

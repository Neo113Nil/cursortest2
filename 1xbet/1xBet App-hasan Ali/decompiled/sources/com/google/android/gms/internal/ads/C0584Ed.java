package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.math.BigInteger;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584Ed implements S5 {

    /* renamed from: b, reason: collision with root package name */
    public final T2.I f8514b;

    /* renamed from: c, reason: collision with root package name */
    public final C1390oj f8515c;

    /* renamed from: d, reason: collision with root package name */
    public final C0576Dd f8516d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f8513a = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f8517e = new HashSet();
    public final HashSet f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public boolean f8518g = false;

    public C0584Ed(String str, T2.I i) {
        this.f8516d = new C0576Dd(str, i);
        this.f8514b = i;
        C1390oj c1390oj = new C1390oj(11);
        c1390oj.f14827l = BigInteger.ONE;
        c1390oj.f14828m = "0";
        this.f8515c = c1390oj;
    }

    @Override // com.google.android.gms.internal.ads.S5
    public final void A(boolean z3) {
        P2.o.f4767B.f4776j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (z3) {
            if (currentTimeMillis - this.f8514b.r() > ((Long) Q2.r.f5053d.f5056c.a(F7.f8767U0)).longValue()) {
                this.f8516d.f8202d = -1;
            } else {
                this.f8516d.f8202d = this.f8514b.q();
            }
            this.f8518g = true;
            return;
        }
        T2.I i = this.f8514b;
        i.o();
        synchronized (i.f5644a) {
            try {
                if (i.f5656o != currentTimeMillis) {
                    i.f5656o = currentTimeMillis;
                    SharedPreferences.Editor editor = i.f5649g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", currentTimeMillis);
                        i.f5649g.apply();
                    }
                    i.p();
                }
            } finally {
            }
        }
        this.f8514b.g(this.f8516d.f8202d);
    }

    public final void a(C1878zd c1878zd) {
        synchronized (this.f8513a) {
            this.f8517e.add(c1878zd);
        }
    }

    public final void b() {
        synchronized (this.f8513a) {
            this.f8516d.c();
        }
    }

    public final void c() {
        synchronized (this.f8513a) {
            this.f8516d.d();
        }
    }

    public final void d() {
        synchronized (this.f8513a) {
            this.f8516d.g();
        }
    }

    public final void e() {
        synchronized (this.f8513a) {
            this.f8516d.g();
        }
    }

    public final void f(Q2.X0 x02, long j5) {
        synchronized (this.f8513a) {
            this.f8516d.e(x02, j5);
        }
    }

    public final void g(HashSet hashSet) {
        synchronized (this.f8513a) {
            this.f8517e.addAll(hashSet);
        }
    }
}

package com.google.android.gms.internal.ads;

import q3.C2308a;

/* loaded from: classes.dex */
public final class Kq {

    /* renamed from: a, reason: collision with root package name */
    public final C2308a f10253a;

    /* renamed from: b, reason: collision with root package name */
    public final C1482ql f10254b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10255c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile int f10257e = 1;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f10256d = 0;

    public Kq(C2308a c2308a, C1482ql c1482ql) {
        this.f10253a = c2308a;
        this.f10254b = c1482ql;
    }

    public final void a(boolean z3) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Dc)).booleanValue()) {
            C1390oj a5 = this.f10254b.a();
            a5.k("action", "mbs_state");
            a5.k("mbs_state", true != z3 ? "0" : "1");
            a5.q();
        }
        if (z3) {
            d(1, 2);
        } else {
            d(2, 1);
        }
    }

    public final boolean b() {
        boolean z3;
        synchronized (this.f10255c) {
            c();
            z3 = this.f10257e == 3;
        }
        return z3;
    }

    public final void c() {
        this.f10253a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f10255c) {
            try {
                if (this.f10257e == 3) {
                    if (this.f10256d + ((Long) Q2.r.f5053d.f5056c.a(F7.D5)).longValue() <= currentTimeMillis) {
                        this.f10257e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(int i, int i5) {
        c();
        Object obj = this.f10255c;
        this.f10253a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f10257e != i) {
                    return;
                }
                this.f10257e = i5;
                if (this.f10257e == 3) {
                    this.f10256d = currentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

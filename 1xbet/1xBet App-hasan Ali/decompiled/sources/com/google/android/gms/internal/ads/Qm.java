package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Qm {

    /* renamed from: a, reason: collision with root package name */
    public long f11249a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f11250b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f11251c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f11252d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f11253e = 0;
    public final Object f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final Object f11254g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final Object f11255h = new Object();
    public final Object i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final Object f11256j = new Object();

    public final int a() {
        int i;
        synchronized (this.f11254g) {
            i = this.f11250b;
        }
        return i;
    }

    public final synchronized long b() {
        long j5;
        synchronized (this.f11256j) {
            j5 = this.f11253e;
        }
        return j5;
    }

    public final synchronized long c() {
        long j5;
        synchronized (this.i) {
            j5 = this.f11252d;
        }
        return j5;
    }

    public final synchronized long d() {
        long j5;
        synchronized (this.f) {
            j5 = this.f11249a;
        }
        return j5;
    }

    public final synchronized void e(long j5) {
        synchronized (this.f) {
            this.f11249a = j5;
        }
    }

    public final void f(int i) {
        synchronized (this.f11254g) {
            this.f11250b = i;
        }
    }
}

package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892dd {

    /* renamed from: a, reason: collision with root package name */
    public final T2.I f13113a;

    public C0892dd(T2.I i) {
        this.f13113a = i;
    }

    public final void a(int i, long j5) {
        long j6;
        A7 a7 = F7.f8906u0;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            return;
        }
        T2.I i5 = this.f13113a;
        i5.o();
        synchronized (i5.f5644a) {
            j6 = i5.f5643D;
        }
        if (j5 - j6 < 0) {
            T2.G.m("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) rVar.f5056c.a(F7.f8912v0)).booleanValue()) {
            this.f13113a.h(i);
            this.f13113a.i(j5);
        } else {
            this.f13113a.h(-1);
            this.f13113a.i(j5);
        }
    }
}

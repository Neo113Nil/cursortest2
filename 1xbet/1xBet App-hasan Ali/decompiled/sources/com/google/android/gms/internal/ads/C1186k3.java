package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1186k3 implements U {

    /* renamed from: a, reason: collision with root package name */
    public final P0.h f14218a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14219b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14220c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14221d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14222e;

    public C1186k3(P0.h hVar, int i, long j5, long j6) {
        this.f14218a = hVar;
        this.f14219b = i;
        this.f14220c = j5;
        long j7 = (j6 - j5) / hVar.f4653n;
        this.f14221d = j7;
        this.f14222e = d(j7);
    }

    @Override // com.google.android.gms.internal.ads.U
    public final long a() {
        return this.f14222e;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final T c(long j5) {
        long j6 = this.f14219b;
        P0.h hVar = this.f14218a;
        long j7 = (hVar.f4652m * j5) / (j6 * 1000000);
        long j8 = this.f14221d;
        long max = Math.max(0L, Math.min(j7, j8 - 1));
        long d5 = d(max);
        long j9 = this.f14220c;
        V v4 = new V(d5, (hVar.f4653n * max) + j9);
        if (d5 >= j5 || max == j8 - 1) {
            return new T(v4, v4);
        }
        long j10 = max + 1;
        return new T(v4, new V(d(j10), (j10 * hVar.f4653n) + j9));
    }

    public final long d(long j5) {
        return AbstractC1260lo.u(j5 * this.f14219b, 1000000L, this.f14218a.f4652m, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.U
    public final boolean g() {
        return true;
    }
}

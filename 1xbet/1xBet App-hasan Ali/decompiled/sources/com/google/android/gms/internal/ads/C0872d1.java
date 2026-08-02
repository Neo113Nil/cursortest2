package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0872d1 implements InterfaceC1006g1 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f13084a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f13085b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13086c;

    public C0872d1(long j5, long[] jArr, long[] jArr2) {
        this.f13084a = jArr;
        this.f13085b = jArr2;
        this.f13086c = j5 == -9223372036854775807L ? AbstractC1260lo.s(jArr2[jArr2.length - 1]) : j5;
    }

    public static Pair d(long j5, long[] jArr, long[] jArr2) {
        int j6 = AbstractC1260lo.j(jArr, j5, true);
        long j7 = jArr[j6];
        long j8 = jArr2[j6];
        int i = j6 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j7), Long.valueOf(j8));
        }
        return Pair.create(Long.valueOf(j5), Long.valueOf(((long) ((jArr[i] == j7 ? 0.0d : (j5 - j7) / (r6 - j7)) * (jArr2[i] - j8))) + j8));
    }

    @Override // com.google.android.gms.internal.ads.U
    public final long a() {
        return this.f13086c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1006g1
    public final long b(long j5) {
        return AbstractC1260lo.s(((Long) d(j5, this.f13084a, this.f13085b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.U
    public final T c(long j5) {
        Pair d5 = d(AbstractC1260lo.v(Math.max(0L, Math.min(j5, this.f13086c))), this.f13085b, this.f13084a);
        V v4 = new V(AbstractC1260lo.s(((Long) d5.first).longValue()), ((Long) d5.second).longValue());
        return new T(v4, v4);
    }

    @Override // com.google.android.gms.internal.ads.U
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1006g1
    public final int i() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1006g1
    public final long j() {
        return -1L;
    }
}

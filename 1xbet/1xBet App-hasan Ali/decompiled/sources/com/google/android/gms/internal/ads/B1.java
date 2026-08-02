package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class B1 implements U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1 f7758a;

    @Override // com.google.android.gms.internal.ads.U
    public final long a() {
        C1 c12 = this.f7758a;
        J1 j12 = c12.f7933n;
        return (c12.f7935p * 1000000) / j12.i;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final T c(long j5) {
        C1 c12 = this.f7758a;
        BigInteger valueOf = BigInteger.valueOf((c12.f7933n.i * j5) / 1000000);
        long j6 = c12.f7932m;
        V v4 = new V(j5, Math.max(c12.f7931l, Math.min((valueOf.multiply(BigInteger.valueOf(j6 - r4)).divide(BigInteger.valueOf(c12.f7935p)).longValue() + r4) - 30000, j6 - 1)));
        return new T(v4, v4);
    }

    @Override // com.google.android.gms.internal.ads.U
    public final boolean g() {
        return true;
    }
}

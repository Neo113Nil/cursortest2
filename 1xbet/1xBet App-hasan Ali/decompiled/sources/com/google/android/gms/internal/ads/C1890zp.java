package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.zp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1890zp implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final Mp f16772a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16773b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f16774c;

    public C1890zp(Mp mp, long j5, ScheduledExecutorService scheduledExecutorService) {
        this.f16772a = mp;
        this.f16773b = j5;
        this.f16774c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        return this.f16772a.a();
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        E3.a d5 = this.f16772a.d();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8838i2)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j5 = this.f16773b;
        if (j5 > 0) {
            d5 = AbstractC1400ot.l0(d5, j5, timeUnit, this.f16774c);
        }
        return AbstractC1400ot.X(d5, Throwable.class, new N9(11, this), AbstractC0613Id.f9544g);
    }
}

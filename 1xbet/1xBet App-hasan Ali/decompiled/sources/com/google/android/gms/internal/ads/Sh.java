package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Sh extends BC implements Qh {

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f11574m;

    /* renamed from: n, reason: collision with root package name */
    public ScheduledFuture f11575n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11576o;

    public Sh(Rh rh, Set set, Qw qw, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f11576o = false;
        this.f11574m = scheduledExecutorService;
        m1(rh, qw);
    }

    @Override // com.google.android.gms.internal.ads.Qh
    public final void a() {
        n1(new Jh(1));
    }

    public final void c() {
        this.f11575n = this.f11574m.schedule(new K4(25, this), ((Integer) Q2.r.f5053d.f5056c.a(F7.ma)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.Qh
    public final void n0(C1121ij c1121ij) {
        if (this.f11576o) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f11575n;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        n1(new C1529ro(15, c1121ij));
    }

    @Override // com.google.android.gms.internal.ads.Qh
    public final void q(C0387u0 c0387u0) {
        n1(new U4(14, c0387u0));
    }
}

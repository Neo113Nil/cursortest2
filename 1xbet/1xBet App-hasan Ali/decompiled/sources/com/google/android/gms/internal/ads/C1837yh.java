package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.yh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1837yh implements Mh, Ki, InterfaceC1703vi, Th, L5 {

    /* renamed from: k, reason: collision with root package name */
    public final Uh f16453k;

    /* renamed from: l, reason: collision with root package name */
    public final Lq f16454l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f16455m;

    /* renamed from: n, reason: collision with root package name */
    public final Qw f16456n;

    /* renamed from: p, reason: collision with root package name */
    public ScheduledFuture f16458p;

    /* renamed from: r, reason: collision with root package name */
    public final String f16460r;

    /* renamed from: o, reason: collision with root package name */
    public final Xw f16457o = new Xw();

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f16459q = new AtomicBoolean();

    public C1837yh(Uh uh, Lq lq, ScheduledExecutorService scheduledExecutorService, Qw qw, String str) {
        this.f16453k = uh;
        this.f16454l = lq;
        this.f16455m = scheduledExecutorService;
        this.f16456n = qw;
        this.f16460r = str;
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1703vi
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1703vi
    public final synchronized void h() {
        try {
            if (this.f16457o.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f16458p;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f16457o.f(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ki
    public final void k() {
        Lq lq = this.f16454l;
        if (lq.f10497e == 3) {
            return;
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8913v1)).booleanValue() && lq.f10487Y == 2) {
            int i = lq.f10519q;
            if (i == 0) {
                this.f16453k.i();
                return;
            }
            Mt mt = new Mt(16, this);
            Xw xw = this.f16457o;
            xw.a(new Kw(0, xw, mt), this.f16456n);
            this.f16458p = this.f16455m.schedule(new K4(24, this), i, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ki
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void p() {
        Lq lq = this.f16454l;
        if (lq.f10497e == 3) {
            return;
        }
        int i = lq.f10487Y;
        if (i == 0 || i == 1) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.ab)).booleanValue() && this.f16460r.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f16453k.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.Th
    public final synchronized void q(C0387u0 c0387u0) {
        try {
            if (this.f16457o.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f16458p;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f16457o.g(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.L5
    public final void z0(K5 k5) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.ab)).booleanValue() && this.f16460r.equals("com.google.ads.mediation.admob.AdMobAdapter") && k5.f10128j && this.f16459q.compareAndSet(false, true) && this.f16454l.f10497e != 3) {
            T2.G.m("Full screen 1px impression occurred");
            this.f16453k.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void C(BinderC1652uc binderC1652uc, String str, String str2) {
    }
}

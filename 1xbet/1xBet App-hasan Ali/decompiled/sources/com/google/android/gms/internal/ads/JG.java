package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class JG extends ZF {

    /* renamed from: h, reason: collision with root package name */
    public final Xu f9923h;
    public final C1543s1 i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9924j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9925k;

    /* renamed from: l, reason: collision with root package name */
    public long f9926l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9927m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9928n;

    /* renamed from: o, reason: collision with root package name */
    public C1514rH f9929o;

    /* renamed from: p, reason: collision with root package name */
    public Q3 f9930p;

    /* renamed from: q, reason: collision with root package name */
    public final Ps f9931q;

    public /* synthetic */ JG(Q3 q32, Xu xu, Ps ps, RE re, int i) {
        C1543s1 c1543s1 = C1543s1.f15416w;
        this.f9930p = q32;
        this.f9923h = xu;
        this.f9931q = ps;
        this.i = c1543s1;
        this.f9924j = i;
        this.f9925k = true;
        this.f9926l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void a(InterfaceC1558sG interfaceC1558sG) {
        HG hg = (HG) interfaceC1558sG;
        if (hg.f9361D) {
            for (MG mg : hg.f9358A) {
                mg.o();
                if (mg.f10611A != null) {
                    mg.f10611A = null;
                    mg.f = null;
                }
            }
        }
        C0905dr c0905dr = hg.f9387s;
        HandlerC1559sH handlerC1559sH = (HandlerC1559sH) c0905dr.f13187m;
        if (handlerC1559sH != null) {
            handlerC1559sH.a(true);
        }
        CG cg = new CG(hg, 3);
        ExecutorC0599Gd executorC0599Gd = (ExecutorC0599Gd) c0905dr.f13186l;
        executorC0599Gd.execute(cg);
        ((ExecutorService) executorC0599Gd.f9191l).shutdown();
        hg.f9392x.removeCallbacksAndMessages(null);
        hg.f9393y = null;
        hg.f9377V = true;
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final InterfaceC1558sG b(C1603tG c1603tG, C1425pH c1425pH, long j5) {
        InterfaceC1402ov mo19a = this.f9923h.mo19a();
        C1514rH c1514rH = this.f9929o;
        if (c1514rH != null) {
            mo19a.d(c1514rH);
        }
        C1859z2 c1859z2 = c().f11161b;
        c1859z2.getClass();
        AbstractC1668us.F(this.f12478g);
        I i = (I) this.f9931q.f11130k;
        Fx fx = new Fx();
        fx.f9145m = i;
        C1872zF c1872zF = new C1872zF(this.f12476d.f16579b, c1603tG);
        C1872zF c1872zF2 = new C1872zF(this.f12475c.f16579b, c1603tG);
        long s2 = AbstractC1260lo.s(-9223372036854775807L);
        return new HG(c1859z2.f16540a, mo19a, fx, this.i, c1872zF, c1872zF2, this, c1425pH, this.f9924j, s2);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final synchronized Q3 c() {
        return this.f9930p;
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void j(C1514rH c1514rH) {
        this.f9929o = c1514rH;
        Looper.myLooper().getClass();
        AbstractC1668us.F(this.f12478g);
        t();
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final synchronized void p(Q3 q32) {
        this.f9930p = q32;
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void r() {
    }

    public final void s(long j5, boolean z3, boolean z5) {
        if (j5 == -9223372036854775807L) {
            j5 = this.f9926l;
        }
        if (!this.f9925k && this.f9926l == j5 && this.f9927m == z3 && this.f9928n == z5) {
            return;
        }
        this.f9926l = j5;
        this.f9927m = z3;
        this.f9928n = z5;
        this.f9925k = false;
        t();
    }

    public final void t() {
        long j5 = this.f9926l;
        boolean z3 = this.f9927m;
        boolean z5 = this.f9928n;
        Q3 c5 = c();
        AbstractC0715Xa qg = new QG(j5, j5, z3, c5, z5 ? c5.f11162c : null);
        if (this.f9925k) {
            qg = new IG(qg);
        }
        k(qg);
    }
}

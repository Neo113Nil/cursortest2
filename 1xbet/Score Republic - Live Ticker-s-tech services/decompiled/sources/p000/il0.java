package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class il0 extends AbstractC0959zp {

    /* JADX INFO: renamed from: A */
    public List f3600A;

    /* JADX INFO: renamed from: B */
    public xe0 f3601B;

    /* JADX INFO: renamed from: C */
    public boolean f3602C;

    /* JADX INFO: renamed from: D */
    public boolean f3603D;

    /* JADX INFO: renamed from: E */
    public a81 f3604E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ jl0 f3605F;

    /* JADX INFO: renamed from: w */
    public final hj0 f3606w;

    /* JADX INFO: renamed from: x */
    public final me0 f3607x;

    /* JADX INFO: renamed from: y */
    public final C0912yf f3608y;

    /* JADX INFO: renamed from: z */
    public final C0137dg f3609z;

    public il0(jl0 jl0Var, hj0 hj0Var) {
        this.f3605F = jl0Var;
        List list = hj0Var.f3222b;
        this.f3600A = list;
        nc1 nc1Var = jl0Var.f4011l;
        this.f3606w = hj0Var;
        me0 me0Var = new me0(me0.f5028d.incrementAndGet(), "Subchannel", jl0Var.f4019t.mo1438e());
        this.f3607x = me0Var;
        C0137dg c0137dg = new C0137dg(me0Var, nc1Var.m3517H(), "Subchannel for " + list);
        this.f3609z = c0137dg;
        this.f3608y = new C0912yf(c0137dg, nc1Var);
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: d */
    public final List mo2657d() {
        this.f3605F.f4012m.m2028d();
        a90.m132p("not started", this.f3602C);
        return this.f3600A;
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: e */
    public final C0831w8 mo2156e() {
        return this.f3606w.f3223c;
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: f */
    public final AbstractC0875xf mo2658f() {
        return this.f3608y;
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: h */
    public final Object mo2659h() {
        a90.m132p("Subchannel is not started", this.f3602C);
        return this.f3601B;
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: q */
    public final void mo2660q() {
        this.f3605F.f4012m.m2028d();
        a90.m132p("not started", this.f3602C);
        xe0 xe0Var = this.f3601B;
        if (xe0Var.f8932v != null) {
            return;
        }
        xe0Var.f8921k.execute(new re0(xe0Var, 1));
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: s */
    public final void mo2157s() {
        a81 a81Var;
        jl0 jl0Var = this.f3605F;
        jl0Var.f4012m.m2028d();
        if (this.f3601B == null) {
            this.f3603D = true;
            return;
        }
        if (!this.f3603D) {
            this.f3603D = true;
        } else {
            if (!jl0Var.f3979H || (a81Var = this.f3604E) == null) {
                return;
            }
            a81Var.m80d();
            this.f3604E = null;
        }
        if (!jl0Var.f3979H) {
            this.f3604E = jl0Var.f4012m.m2027c(new ek0(new RunnableC0897y0(16, this)), 5L, TimeUnit.SECONDS, jl0Var.f4005f.f157j.f3319m);
        } else {
            xe0 xe0Var = this.f3601B;
            xe0Var.f8921k.execute(new RunnableC0529o2(19, xe0Var, jl0.f3967e0));
        }
    }

    public final String toString() {
        return this.f3607x.toString();
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: u */
    public final void mo2158u(lj0 lj0Var) {
        jl0 jl0Var = this.f3605F;
        jl0Var.f4012m.m2028d();
        a90.m132p("already started", !this.f3602C);
        a90.m132p("already shutdown", !this.f3603D);
        a90.m132p("Channel is being terminated", !jl0Var.f3979H);
        this.f3602C = true;
        List list = this.f3606w.f3222b;
        String strMo1438e = jl0Var.f4019t.mo1438e();
        o31 o31Var = jl0Var.f4018s;
        C0015ae c0015ae = jl0Var.f4005f;
        ScheduledExecutorService scheduledExecutorService = c0015ae.f157j.f3319m;
        nb1 nb1Var = jl0Var.f4015p;
        gc1 gc1Var = jl0Var.f4012m;
        f50 f50Var = new f50(this, lj0Var, 9, false);
        je0 je0Var = jl0Var.f3986O;
        jl0Var.f3982K.getClass();
        xe0 xe0Var = new xe0(list, strMo1438e, o31Var, c0015ae, scheduledExecutorService, nb1Var, gc1Var, f50Var, je0Var, new f71(4), this.f3609z, this.f3607x, this.f3608y, jl0Var.f4020u);
        jl0Var.f3984M.m1202b(new ie0("Child Subchannel started", he0.f3184j, jl0Var.f4011l.m3517H(), xe0Var));
        this.f3601B = xe0Var;
        jl0Var.f3972A.add(xe0Var);
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: z */
    public final void mo2159z(List list) {
        this.f3605F.f4012m.m2028d();
        this.f3600A = list;
        xe0 xe0Var = this.f3601B;
        xe0Var.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a90.m127k(it.next(), "newAddressGroups contains null entry");
        }
        a90.m122f("newAddressGroups is empty", !list.isEmpty());
        xe0Var.f8921k.execute(new RunnableC0529o2(18, xe0Var, Collections.unmodifiableList(new ArrayList(list))));
    }
}

package W5;

import C0.RunnableC0085d;
import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.C0435b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import w1.C1726n0;
import w1.P2;

/* loaded from: classes2.dex */
public final class P0 extends AbstractC0457y {

    /* renamed from: a, reason: collision with root package name */
    public final C1726n0 f6910a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.F f6911b;

    /* renamed from: c, reason: collision with root package name */
    public final C0517l f6912c;

    /* renamed from: d, reason: collision with root package name */
    public final C0523n f6913d;

    /* renamed from: e, reason: collision with root package name */
    public List f6914e;

    /* renamed from: f, reason: collision with root package name */
    public C0538s0 f6915f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6916g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6917h;

    /* renamed from: i, reason: collision with root package name */
    public P2 f6918i;
    public final /* synthetic */ Q0 j;

    public P0(Q0 q02, C1726n0 c1726n0) {
        this.j = q02;
        List list = (List) c1726n0.f17805b;
        this.f6914e = list;
        q02.getClass();
        this.f6910a = c1726n0;
        U5.F f7 = new U5.F("Subchannel", q02.f6979w.f6884e, U5.F.f6417d.incrementAndGet());
        this.f6911b = f7;
        f2 f2Var = q02.f6971o;
        C0523n c0523n = new C0523n(f7, f2Var.d(), "Subchannel for " + list);
        this.f6913d = c0523n;
        this.f6912c = new C0517l(c0523n, f2Var);
    }

    @Override // U5.AbstractC0457y
    public final List b() {
        this.j.f6972p.f();
        p3.f.q("not started", this.f6916g);
        return this.f6914e;
    }

    @Override // U5.AbstractC0457y
    public final C0435b c() {
        return (C0435b) this.f6910a.f17806c;
    }

    @Override // U5.AbstractC0457y
    public final AbstractC0438e d() {
        return this.f6912c;
    }

    @Override // U5.AbstractC0457y
    public final Object e() {
        p3.f.q("Subchannel is not started", this.f6916g);
        return this.f6915f;
    }

    @Override // U5.AbstractC0457y
    public final void l() {
        this.j.f6972p.f();
        p3.f.q("not started", this.f6916g);
        C0538s0 c0538s0 = this.f6915f;
        if (c0538s0.f7360v != null) {
            return;
        }
        c0538s0.f7349k.execute(new RunnableC0515k0(c0538s0, 1));
    }

    @Override // U5.AbstractC0457y
    public final void m() {
        P2 p22;
        Q0 q02 = this.j;
        q02.f6972p.f();
        if (this.f6915f == null) {
            this.f6917h = true;
            return;
        }
        if (!this.f6917h) {
            this.f6917h = true;
        } else {
            if (!q02.f6941L || (p22 = this.f6918i) == null) {
                return;
            }
            p22.d();
            this.f6918i = null;
        }
        if (!q02.f6941L) {
            this.f6918i = q02.f6972p.e(new RunnableC0559z0(new RunnableC0085d(this, 19)), 5L, TimeUnit.SECONDS, q02.f6966i.f7260a.f7514d);
            return;
        }
        C0538s0 c0538s0 = this.f6915f;
        U5.l0 l0Var = Q0.f6925j0;
        c0538s0.getClass();
        c0538s0.f7349k.execute(new RunnableC0518l0(c0538s0, l0Var, 0));
    }

    @Override // U5.AbstractC0457y
    public final void o(U5.M m7) {
        Q0 q02 = this.j;
        q02.f6972p.f();
        p3.f.q("already started", !this.f6916g);
        p3.f.q("already shutdown", !this.f6917h);
        p3.f.q("Channel is being terminated", !q02.f6941L);
        this.f6916g = true;
        List list = (List) this.f6910a.f17805b;
        String str = q02.f6979w.f6884e;
        C0514k c0514k = q02.f6966i;
        ScheduledExecutorService scheduledExecutorService = c0514k.f7260a.f7514d;
        h2 h2Var = new h2(3, this, m7);
        q02.f6944O.getClass();
        C0538s0 c0538s0 = new C0538s0(list, str, q02.f6978v, c0514k, scheduledExecutorService, q02.f6975s, q02.f6972p, h2Var, q02.f6948S, new k1.g(8), this.f6913d, this.f6911b, this.f6912c, q02.f6980x);
        q02.f6946Q.b(new U5.B("Child Subchannel started", U5.A.f6403a, q02.f6971o.d(), c0538s0));
        this.f6915f = c0538s0;
        q02.f6933D.add(c0538s0);
    }

    @Override // U5.AbstractC0457y
    public final void p(List list) {
        this.j.f6972p.f();
        this.f6914e = list;
        C0538s0 c0538s0 = this.f6915f;
        c0538s0.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p3.f.k(it.next(), "newAddressGroups contains null entry");
        }
        p3.f.d("newAddressGroups is empty", !list.isEmpty());
        c0538s0.f7349k.execute(new E(14, c0538s0, Collections.unmodifiableList(new ArrayList(list))));
    }

    public final String toString() {
        return this.f6911b.toString();
    }
}

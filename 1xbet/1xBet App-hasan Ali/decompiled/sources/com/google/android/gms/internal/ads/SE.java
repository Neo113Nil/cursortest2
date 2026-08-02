package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;

/* loaded from: classes.dex */
public final class SE implements InterfaceC1783xG, AF {

    /* renamed from: a, reason: collision with root package name */
    public final Nm f11521a;

    /* renamed from: b, reason: collision with root package name */
    public final C1785xa f11522b;

    /* renamed from: c, reason: collision with root package name */
    public final C0603Ha f11523c;

    /* renamed from: d, reason: collision with root package name */
    public final C1324n6 f11524d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f11525e;
    public Fk f;

    /* renamed from: g, reason: collision with root package name */
    public ME f11526g;

    /* renamed from: h, reason: collision with root package name */
    public C1439pn f11527h;
    public boolean i;

    public SE(Nm nm) {
        nm.getClass();
        this.f11521a = nm;
        int i = AbstractC1260lo.f14419a;
        Looper myLooper = Looper.myLooper();
        this.f = new Fk(myLooper == null ? Looper.getMainLooper() : myLooper, nm, new QE(23));
        C1785xa c1785xa = new C1785xa();
        this.f11522b = c1785xa;
        this.f11523c = new C0603Ha();
        C1324n6 c1324n6 = new C1324n6();
        c1324n6.f14578k = c1785xa;
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        c1324n6.f14579l = C1761wv.f16184o;
        c1324n6.f14580m = Cv.f8103q;
        this.f11524d = c1324n6;
        this.f11525e = new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void a(int i, C1603tG c1603tG, C1199kG c1199kG, C1469qG c1469qG) {
        i(k(i, c1603tG), 1000, new QE(5));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void b(int i, C1603tG c1603tG, C1199kG c1199kG, C1469qG c1469qG) {
        i(k(i, c1603tG), 1002, new QE(25));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void c(int i, C1603tG c1603tG, C1199kG c1199kG, C1469qG c1469qG) {
        i(k(i, c1603tG), 1001, new QE(27));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void d(int i, C1603tG c1603tG, C1469qG c1469qG) {
        OE k5 = k(i, c1603tG);
        i(k5, 1004, new Er(7, k5, c1469qG));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void e(int i, C1603tG c1603tG, C1199kG c1199kG, C1469qG c1469qG, IOException iOException, boolean z3) {
        OE k5 = k(i, c1603tG);
        i(k5, 1003, new Ps(k5, c1199kG, c1469qG, iOException, z3));
    }

    public final void f(ME me, Looper looper) {
        boolean z3 = true;
        if (this.f11526g != null && !((AbstractC1044gv) this.f11524d.f14579l).isEmpty()) {
            z3 = false;
        }
        AbstractC1668us.a0(z3);
        me.getClass();
        this.f11526g = me;
        this.f11527h = this.f11521a.a(looper, null);
        Fk fk = this.f;
        this.f = new Fk(fk.f9106d, looper, fk.f9103a, new C1667ur(9, this, me, false), fk.i);
    }

    public final OE g() {
        return j((C1603tG) this.f11524d.f14581n);
    }

    public final OE h(AbstractC0715Xa abstractC0715Xa, int i, C1603tG c1603tG) {
        C1603tG c1603tG2 = true == abstractC0715Xa.o() ? null : c1603tG;
        this.f11521a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = false;
        if (abstractC0715Xa.equals(this.f11526g.l1()) && i == this.f11526g.b1()) {
            z3 = true;
        }
        long j5 = 0;
        if (c1603tG2 == null || !c1603tG2.b()) {
            if (z3) {
                ME me = this.f11526g;
                me.f10609n.d();
                C1109iE c1109iE = me.f10608m;
                c1109iE.t0();
                j5 = c1109iE.r1(c1109iE.f13907a0);
            } else if (!abstractC0715Xa.o()) {
                abstractC0715Xa.e(i, this.f11523c, 0L).getClass();
                j5 = AbstractC1260lo.v(0L);
            }
        } else if (z3 && this.f11526g.p1() == c1603tG2.f15680b && this.f11526g.q1() == c1603tG2.f15681c) {
            j5 = this.f11526g.s1();
        }
        long j6 = j5;
        C1603tG c1603tG3 = (C1603tG) this.f11524d.f14581n;
        AbstractC0715Xa l12 = this.f11526g.l1();
        int b12 = this.f11526g.b1();
        long s12 = this.f11526g.s1();
        ME me2 = this.f11526g;
        me2.f10609n.d();
        C1109iE c1109iE2 = me2.f10608m;
        c1109iE2.t0();
        return new OE(elapsedRealtime, abstractC0715Xa, i, c1603tG2, j6, l12, b12, c1603tG3, s12, AbstractC1260lo.v(c1109iE2.f13907a0.f8490q));
    }

    public final void i(OE oe, int i, Yj yj) {
        this.f11525e.put(i, oe);
        Fk fk = this.f;
        fk.c(i, yj);
        fk.b();
    }

    public final OE j(C1603tG c1603tG) {
        this.f11526g.getClass();
        AbstractC0715Xa abstractC0715Xa = c1603tG == null ? null : (AbstractC0715Xa) ((Cv) this.f11524d.f14580m).get(c1603tG);
        if (c1603tG != null && abstractC0715Xa != null) {
            return h(abstractC0715Xa, abstractC0715Xa.n(c1603tG.f15679a, this.f11522b).f16290c, c1603tG);
        }
        int b12 = this.f11526g.b1();
        AbstractC0715Xa l12 = this.f11526g.l1();
        if (b12 >= l12.c()) {
            l12 = AbstractC0715Xa.f12197a;
        }
        return h(l12, b12, null);
    }

    public final OE k(int i, C1603tG c1603tG) {
        ME me = this.f11526g;
        me.getClass();
        if (c1603tG != null) {
            return ((AbstractC0715Xa) ((Cv) this.f11524d.f14580m).get(c1603tG)) != null ? j(c1603tG) : h(AbstractC0715Xa.f12197a, i, c1603tG);
        }
        AbstractC0715Xa l12 = me.l1();
        if (i >= l12.c()) {
            l12 = AbstractC0715Xa.f12197a;
        }
        return h(l12, i, null);
    }

    public final OE l() {
        return j((C1603tG) this.f11524d.f14583p);
    }
}

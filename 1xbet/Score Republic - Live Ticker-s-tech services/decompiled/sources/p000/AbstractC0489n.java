package p000;

import java.util.logging.Logger;

/* JADX INFO: renamed from: n */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0489n implements InterfaceC0507nh, ra1 {

    /* JADX INFO: renamed from: p */
    public static final Logger f5213p = Logger.getLogger(AbstractC0489n.class.getName());

    /* JADX INFO: renamed from: j */
    public final C0312i6 f5214j;

    /* JADX INFO: renamed from: k */
    public final d60 f5215k;

    /* JADX INFO: renamed from: l */
    public final boolean f5216l;

    /* JADX INFO: renamed from: m */
    public final boolean f5217m;

    /* JADX INFO: renamed from: n */
    public np0 f5218n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f5219o;

    public AbstractC0489n(aa0 aa0Var, ha1 ha1Var, C0312i6 c0312i6, np0 np0Var, C0095ce c0095ce, boolean z) {
        a90.m127k(np0Var, "headers");
        a90.m127k(c0312i6, "transportTracer");
        this.f5214j = c0312i6;
        this.f5216l = !Boolean.TRUE.equals(c0095ce.m920a(ca0.f1194n));
        this.f5217m = z;
        if (!z) {
            this.f5215k = new no0(this, aa0Var, ha1Var);
            this.f5218n = np0Var;
            return;
        }
        C0415l c0415l = new C0415l();
        c0415l.f4617e = this;
        a90.m127k(np0Var, "headers");
        c0415l.f4614b = np0Var;
        c0415l.f4615c = ha1Var;
        this.f5215k = c0415l;
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: C */
    public final void mo1600C() {
        kt0 kt0Var = ((lt0) this).f4904u;
        ko0 ko0Var = kt0Var.f4527d;
        ko0Var.f4469j = kt0Var;
        kt0Var.f4524a = ko0Var;
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: D */
    public final void mo1601D() {
        lt0 lt0Var = (lt0) this;
        if (lt0Var.f4904u.f4537n) {
            return;
        }
        lt0Var.f4904u.f4537n = true;
        this.f5215k.close();
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: G */
    public final void mo1604G(ja1 ja1Var) {
        a90.m122f("Should not cancel with OK status", !ja1Var.m2838f());
        this.f5219o = true;
        jg0 jg0Var = ((lt0) this).f4905v;
        jg0Var.getClass();
        nv0.m3597c();
        try {
            synchronized (((lt0) jg0Var.f3922k).f4904u.f4545v) {
                ((lt0) jg0Var.f3922k).f4904u.m3079d(ja1Var, true, null);
            }
            nv0.f5555a.getClass();
        } catch (Throwable th) {
            try {
                nv0.f5555a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3455a(vt0 vt0Var, boolean z, boolean z2, int i) {
        C0539oc c0539oc;
        a90.m122f("null frame before EOS", vt0Var != null || z);
        jg0 jg0Var = ((lt0) this).f4905v;
        jg0Var.getClass();
        nv0.m3597c();
        try {
            if (vt0Var == null) {
                c0539oc = lt0.f4899y;
            } else {
                c0539oc = vt0Var.f8262a;
                int i2 = (int) c0539oc.f5698k;
                if (i2 > 0) {
                    kt0 kt0Var = ((lt0) jg0Var.f3922k).f4904u;
                    synchronized (kt0Var.f4525b) {
                        kt0Var.f4528e += i2;
                    }
                }
            }
            synchronized (((lt0) jg0Var.f3922k).f4904u.f4545v) {
                kt0.m3075b(((lt0) jg0Var.f3922k).f4904u, c0539oc, z, z2);
                C0312i6 c0312i6 = ((lt0) jg0Var.f3922k).f5214j;
                if (i == 0) {
                    c0312i6.getClass();
                } else {
                    c0312i6.getClass();
                    ((nc1) c0312i6.f3447k).m3517H();
                }
            }
            nv0.f5555a.getClass();
        } catch (Throwable th) {
            try {
                nv0.f5555a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: c */
    public final void mo1624c(InterfaceC0951zh interfaceC0951zh) {
        this.f5215k.mo1099c(interfaceC0951zh);
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: e */
    public final void mo1625e(int i) {
        this.f5215k.mo1101e(i);
    }

    @Override // p000.ra1
    public final void flush() {
        d60 d60Var = this.f5215k;
        if (d60Var.isClosed()) {
            return;
        }
        d60Var.flush();
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: h */
    public final void mo1626h(C0258gq c0258gq) {
        kt0 kt0Var = ((lt0) this).f4904u;
        a90.m132p("Already called start", kt0Var.f4533j == null);
        a90.m127k(c0258gq, "decompressorRegistry");
        kt0Var.f4534k = c0258gq;
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: k */
    public final void mo1628k(int i) {
        ((lt0) this).f4904u.f4524a.f4470k = i;
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: n */
    public final void mo1326n(InterfaceC0581ph interfaceC0581ph) {
        lt0 lt0Var = (lt0) this;
        kt0 kt0Var = lt0Var.f4904u;
        a90.m132p("Already called setListener", kt0Var.f4533j == null);
        a90.m127k(interfaceC0581ph, "listener");
        kt0Var.f4533j = interfaceC0581ph;
        if (this.f5217m) {
            return;
        }
        lt0Var.f4905v.m2855k(this.f5218n, null);
        this.f5218n = null;
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: q */
    public final boolean mo1633q() {
        return ((lt0) this).f4904u.m3083i() && !this.f5219o;
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: s */
    public final void mo1327s(xd0 xd0Var) {
        xd0Var.m5619a(((lt0) this).f4906w.f8455a.get(zg1.f9759e), "remote_addr");
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: u */
    public final void mo1636u(C0885xp c0885xp) {
        np0 np0Var = this.f5218n;
        jp0 jp0Var = ca0.f1183c;
        np0Var.m3577a(jp0Var);
        this.f5218n.m3581e(jp0Var, Long.valueOf(Math.max(0L, c0885xp.m5687b())));
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: w */
    public final void mo1638w(xx0 xx0Var) {
        d60 d60Var = this.f5215k;
        try {
            if (!d60Var.isClosed()) {
                d60Var.mo1100d(xx0Var);
            }
        } finally {
            ca0.m907b(xx0Var);
        }
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: z */
    public final void mo1641z() {
        kt0 kt0Var = ((lt0) this).f4904u;
        kt0Var.getClass();
        nv0.m3596b();
        RunnableC0897y0 runnableC0897y0 = new RunnableC0897y0(0, kt0Var);
        synchronized (kt0Var.f4545v) {
            runnableC0897y0.run();
        }
    }
}

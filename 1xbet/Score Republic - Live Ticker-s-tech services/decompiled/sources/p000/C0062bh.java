package p000;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: bh */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0062bh extends xe1 {

    /* JADX INFO: renamed from: t */
    public static final Logger f858t = Logger.getLogger(C0062bh.class.getName());

    /* JADX INFO: renamed from: u */
    public static final double f859u;

    /* JADX INFO: renamed from: e */
    public final wp0 f860e;

    /* JADX INFO: renamed from: f */
    public final Executor f861f;

    /* JADX INFO: renamed from: g */
    public final boolean f862g;

    /* JADX INFO: renamed from: h */
    public final f71 f863h;

    /* JADX INFO: renamed from: i */
    public final C0697sm f864i;

    /* JADX INFO: renamed from: j */
    public volatile ScheduledFuture f865j;

    /* JADX INFO: renamed from: k */
    public final boolean f866k;

    /* JADX INFO: renamed from: l */
    public C0095ce f867l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0507nh f868m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f869n;

    /* JADX INFO: renamed from: o */
    public boolean f870o;

    /* JADX INFO: renamed from: p */
    public boolean f871p;

    /* JADX INFO: renamed from: q */
    public final p90 f872q;

    /* JADX INFO: renamed from: r */
    public final ScheduledExecutorService f873r;

    /* JADX INFO: renamed from: s */
    public C0258gq f874s = C0258gq.f2843d;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        f859u = 1.0E9d;
    }

    public C0062bh(wp0 wp0Var, Executor executor, C0095ce c0095ce, p90 p90Var, ScheduledExecutorService scheduledExecutorService, f71 f71Var) {
        C0806vk c0806vk = C0806vk.f8206b;
        this.f860e = wp0Var;
        Object obj = wp0Var.f8621m;
        System.identityHashCode(this);
        nv0.f5555a.getClass();
        if (executor == EnumC0113ct.f1449j) {
            this.f861f = new x61();
            this.f862g = true;
        } else {
            this.f861f = new a71(executor);
            this.f862g = false;
        }
        this.f863h = f71Var;
        this.f864i = C0697sm.m4537b();
        vp0 vp0Var = (vp0) wp0Var.f8620l;
        this.f866k = vp0Var == vp0.f8244j || vp0Var == vp0.f8245k;
        this.f867l = c0095ce;
        this.f872q = p90Var;
        this.f873r = scheduledExecutorService;
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: b */
    public final void mo272b(String str, Throwable th) {
        nv0.m3597c();
        try {
            nv0.m3595a();
            m663r(str, th);
            nv0.f5555a.getClass();
        } catch (Throwable th2) {
            try {
                nv0.f5555a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: i */
    public final void mo660i() {
        nv0.m3597c();
        try {
            nv0.m3595a();
            a90.m132p("Not started", this.f868m != null);
            a90.m132p("call was cancelled", !this.f870o);
            a90.m132p("call already half-closed", !this.f871p);
            this.f871p = true;
            this.f868m.mo1601D();
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

    @Override // p000.xe1
    /* JADX INFO: renamed from: m */
    public final void mo661m() {
        nv0.m3597c();
        try {
            nv0.m3595a();
            a90.m132p("Not started", this.f868m != null);
            this.f868m.mo1641z();
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

    @Override // p000.xe1
    /* JADX INFO: renamed from: n */
    public final void mo662n(C0525nz c0525nz) {
        nv0.m3597c();
        try {
            nv0.m3595a();
            m665t(c0525nz);
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

    @Override // p000.xe1
    /* JADX INFO: renamed from: o */
    public final void mo273o(d71 d71Var, np0 np0Var) {
        nv0.m3597c();
        try {
            nv0.m3595a();
            m666u(d71Var, np0Var);
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

    /* JADX INFO: renamed from: r */
    public final void m663r(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f858t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f870o) {
            return;
        }
        this.f870o = true;
        try {
            if (this.f868m != null) {
                ja1 ja1Var = ja1.f3876f;
                ja1 ja1VarM2840h = str != null ? ja1Var.m2840h(str) : ja1Var.m2840h("Call cancelled without message");
                if (th != null) {
                    ja1VarM2840h = ja1VarM2840h.m2839g(th);
                }
                this.f868m.mo1604G(ja1VarM2840h);
            }
        } finally {
            m664s();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m664s() {
        this.f864i.getClass();
        ScheduledFuture scheduledFuture = this.f865j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m665t(C0525nz c0525nz) {
        a90.m132p("Not started", this.f868m != null);
        a90.m132p("call was cancelled", !this.f870o);
        a90.m132p("call was half-closed", !this.f871p);
        try {
            InterfaceC0507nh interfaceC0507nh = this.f868m;
            if (interfaceC0507nh instanceof zk0) {
                ((zk0) interfaceC0507nh).m5933m(c0525nz);
            } else {
                yx0 yx0Var = (yx0) this.f860e.f8623o;
                yx0Var.getClass();
                interfaceC0507nh.mo1638w(new xx0(c0525nz, yx0Var.f9525a));
            }
            if (this.f866k) {
                return;
            }
            this.f868m.flush();
        } catch (Error e) {
            this.f868m.mo1604G(ja1.f3876f.m2840h("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.f868m.mo1604G(ja1.f3876f.m2839g(e2).m2840h("Failed to stream message"));
        }
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f860e, "method");
        return c0809vnM5362k.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m666u(d71 d71Var, np0 np0Var) {
        long j;
        C0095ce c0095ce;
        InterfaceC0507nh zk0Var;
        wa0 wa0Var = wa0.f8471k;
        a90.m132p("Already started", this.f868m == null);
        a90.m132p("call was cancelled", !this.f870o);
        this.f864i.getClass();
        C0095ce c0095ce2 = this.f867l;
        C0059be c0059be = ql0.f6529g;
        ql0 ql0Var = (ql0) c0095ce2.m920a(c0059be);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (ql0Var == null) {
            j = 0;
        } else {
            Integer num = ql0Var.f6533d;
            Integer num2 = ql0Var.f6532c;
            Long l = ql0Var.f6530a;
            if (l != null) {
                long jLongValue = l.longValue();
                if (timeUnit == null) {
                    C0270h1.m2192h("units");
                    return;
                }
                C0885xp c0885xp = new C0885xp(jLongValue);
                C0095ce c0095ce3 = this.f867l;
                C0885xp c0885xp2 = c0095ce3.f1225a;
                if (c0885xp2 != null) {
                    nc1 nc1Var = c0885xp.f9014j;
                    if (nc1Var != c0885xp2.f9014j) {
                        StringBuilder sb = new StringBuilder("Tickers (");
                        sb.append(nc1Var);
                        nc1 nc1Var2 = c0885xp2.f9014j;
                        sb.append(" and ");
                        sb.append(nc1Var2);
                        sb.append(") don't match. Custom Ticker should only be used in tests!");
                        throw new AssertionError(sb.toString());
                    }
                    j = 0;
                    if (c0885xp.f9015k - c0885xp2.f9015k < 0) {
                    }
                } else {
                    j = 0;
                }
                c0095ce3.getClass();
                C0547ok c0547okM919b = C0095ce.m919b(c0095ce3);
                c0547okM919b.f5762a = c0885xp;
                this.f867l = new C0095ce(c0547okM919b);
            } else {
                j = 0;
            }
            Boolean bool = ql0Var.f6531b;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                C0095ce c0095ce4 = this.f867l;
                c0095ce4.getClass();
                if (zBooleanValue) {
                    C0547ok c0547okM919b2 = C0095ce.m919b(c0095ce4);
                    c0547okM919b2.f5766e = Boolean.TRUE;
                    c0095ce = new C0095ce(c0547okM919b2);
                } else {
                    C0547ok c0547okM919b3 = C0095ce.m919b(c0095ce4);
                    c0547okM919b3.f5766e = Boolean.FALSE;
                    c0095ce = new C0095ce(c0547okM919b3);
                }
                this.f867l = c0095ce;
            }
            if (num2 != null) {
                C0095ce c0095ce5 = this.f867l;
                Integer num3 = c0095ce5.f1230f;
                if (num3 != null) {
                    int iMin = Math.min(num3.intValue(), num2.intValue());
                    a90.m119c(iMin, "invalid maxsize %s", iMin >= 0);
                    C0547ok c0547okM919b4 = C0095ce.m919b(c0095ce5);
                    c0547okM919b4.f5767f = Integer.valueOf(iMin);
                    this.f867l = new C0095ce(c0547okM919b4);
                } else {
                    int iIntValue = num2.intValue();
                    a90.m119c(iIntValue, "invalid maxsize %s", iIntValue >= 0);
                    C0547ok c0547okM919b5 = C0095ce.m919b(c0095ce5);
                    c0547okM919b5.f5767f = num2;
                    this.f867l = new C0095ce(c0547okM919b5);
                }
            }
            if (num != null) {
                C0095ce c0095ce6 = this.f867l;
                Integer num4 = c0095ce6.f1231g;
                if (num4 != null) {
                    int iMin2 = Math.min(num4.intValue(), num.intValue());
                    a90.m119c(iMin2, "invalid maxsize %s", iMin2 >= 0);
                    C0547ok c0547okM919b6 = C0095ce.m919b(c0095ce6);
                    c0547okM919b6.f5768g = Integer.valueOf(iMin2);
                    this.f867l = new C0095ce(c0547okM919b6);
                } else {
                    int iIntValue2 = num.intValue();
                    a90.m119c(iIntValue2, "invalid maxsize %s", iIntValue2 >= 0);
                    C0547ok c0547okM919b7 = C0095ce.m919b(c0095ce6);
                    c0547okM919b7.f5768g = num;
                    this.f867l = new C0095ce(c0547okM919b7);
                }
            }
        }
        this.f867l.getClass();
        C0258gq c0258gq = this.f874s;
        np0Var.m3577a(ca0.f1188h);
        np0Var.m3577a(ca0.f1184d);
        kp0 kp0Var = ca0.f1185e;
        np0Var.m3577a(kp0Var);
        byte[] bArr = c0258gq.f2845b;
        if (bArr.length != 0) {
            np0Var.m3581e(kp0Var, bArr);
        }
        np0Var.m3577a(ca0.f1186f);
        np0Var.m3577a(ca0.f1187g);
        C0885xp c0885xp3 = this.f867l.f1225a;
        this.f864i.getClass();
        C0885xp c0885xp4 = c0885xp3 == null ? null : c0885xp3;
        if (c0885xp4 == null || !c0885xp4.m5686a()) {
            this.f864i.getClass();
            C0885xp c0885xp5 = this.f867l.f1225a;
            Logger logger = f858t;
            if (logger.isLoggable(Level.FINE) && c0885xp4 != null && c0885xp4.equals(null)) {
                long jMax = Math.max(j, c0885xp4.m5687b());
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder("Call timeout set to '" + jMax + "' ns, due to context deadline.");
                if (c0885xp5 == null) {
                    sb2.append(" Explicit call timeout was not set.");
                } else {
                    sb2.append(" Explicit call timeout was '" + c0885xp5.m5687b() + "' ns.");
                }
                logger.fine(sb2.toString());
            }
            p90 p90Var = this.f872q;
            wp0 wp0Var = this.f860e;
            C0095ce c0095ce7 = this.f867l;
            C0697sm c0697sm = this.f864i;
            if (((jl0) p90Var.f6027j).f3994W) {
                ql0 ql0Var2 = (ql0) c0095ce7.m920a(c0059be);
                zk0Var = new zk0(p90Var, wp0Var, np0Var, c0095ce7, ql0Var2 == null ? null : ql0Var2.f6534e, ql0Var2 == null ? null : ql0Var2.f6535f, c0697sm);
            } else {
                InterfaceC0655rh interfaceC0655rhM3880c = p90Var.m3880c(new yv0(wp0Var, np0Var, c0095ce7));
                C0697sm c0697smM4538a = c0697sm.m4538a();
                try {
                    zk0Var = interfaceC0655rhM3880c.mo1527d(wp0Var, np0Var, c0095ce7, ca0.m908c(c0095ce7, np0Var, 0, false));
                    c0697sm.m4539c(c0697smM4538a);
                } catch (Throwable th) {
                    c0697sm.m4539c(c0697smM4538a);
                    throw th;
                }
            }
            this.f868m = zk0Var;
        } else {
            o80[] o80VarArrM908c = ca0.m908c(this.f867l, np0Var, 0, false);
            C0885xp c0885xp6 = this.f867l.f1225a;
            this.f864i.getClass();
            String str = c0885xp6 == null ? "Context" : "CallOptions";
            Long l2 = (Long) this.f867l.m920a(o80.f5662j);
            double dM5687b = c0885xp4.m5687b();
            double d = f859u;
            this.f868m = new C0155dz(ja1.f3878h.m2840h(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(dM5687b / d), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d))), EnumC0544oh.f5731j, o80VarArrM908c);
        }
        if (this.f862g) {
            this.f868m.mo1600C();
        }
        this.f867l.getClass();
        Integer num5 = this.f867l.f1230f;
        if (num5 != null) {
            this.f868m.mo1628k(num5.intValue());
        }
        Integer num6 = this.f867l.f1231g;
        if (num6 != null) {
            this.f868m.mo1625e(num6.intValue());
        }
        if (c0885xp4 != null) {
            this.f868m.mo1636u(c0885xp4);
        }
        this.f868m.mo1624c(wa0Var);
        this.f868m.mo1626h(this.f874s);
        f71 f71Var = this.f863h;
        ((jk0) f71Var.f2335l).mo614j();
        ((nc1) f71Var.f2334k).m3517H();
        this.f868m.mo1326n(new qd0(this, d71Var));
        this.f864i.getClass();
        Logger logger2 = C0697sm.f7148a;
        if (c0885xp4 != null) {
            this.f864i.getClass();
            if (!c0885xp4.equals(null) && this.f873r != null) {
                long jM5687b = c0885xp4.m5687b();
                this.f865j = this.f873r.schedule(new ek0(new RunnableC0018ah(this, jM5687b)), jM5687b, timeUnit);
            }
        }
        if (this.f869n) {
            m664s();
        }
    }
}

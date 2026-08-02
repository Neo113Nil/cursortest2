package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fl0 extends xe1 {

    /* JADX INFO: renamed from: s */
    public static final C0776ur f2431s;

    /* JADX INFO: renamed from: e */
    public final ScheduledFuture f2432e;

    /* JADX INFO: renamed from: f */
    public final Executor f2433f;

    /* JADX INFO: renamed from: g */
    public final C0697sm f2434g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f2435h;

    /* JADX INFO: renamed from: i */
    public d71 f2436i;

    /* JADX INFO: renamed from: j */
    public xe1 f2437j;

    /* JADX INFO: renamed from: k */
    public ja1 f2438k;

    /* JADX INFO: renamed from: l */
    public List f2439l;

    /* JADX INFO: renamed from: m */
    public C0850wr f2440m;

    /* JADX INFO: renamed from: n */
    public final C0697sm f2441n;

    /* JADX INFO: renamed from: o */
    public final wp0 f2442o;

    /* JADX INFO: renamed from: p */
    public final C0095ce f2443p;

    /* JADX INFO: renamed from: q */
    public final long f2444q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ gl0 f2445r;

    static {
        Logger.getLogger(fl0.class.getName());
        f2431s = new C0776ur(0);
    }

    public fl0(gl0 gl0Var, C0697sm c0697sm, wp0 wp0Var, C0095ce c0095ce) {
        ScheduledFuture<?> scheduledFutureSchedule;
        this.f2445r = gl0Var;
        jl0 jl0Var = gl0Var.f2803d;
        Logger logger = jl0.f3965c0;
        Executor executor = c0095ce.f1226b;
        executor = executor == null ? jl0Var.f4007h : executor;
        hl0 hl0Var = jl0Var.f4006g;
        C0885xp c0885xp = c0095ce.f1225a;
        this.f2439l = new ArrayList();
        a90.m127k(executor, "callExecutor");
        this.f2433f = executor;
        a90.m127k(hl0Var, "scheduler");
        C0697sm c0697smM4537b = C0697sm.m4537b();
        this.f2434g = c0697smM4537b;
        c0697smM4537b.getClass();
        if (c0885xp == null) {
            scheduledFutureSchedule = null;
        } else {
            long jM5687b = c0885xp.m5687b();
            long jAbs = Math.abs(jM5687b) / 1000000000;
            long jAbs2 = Math.abs(jM5687b) % 1000000000;
            StringBuilder sb = new StringBuilder();
            if (jM5687b < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(jAbs);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            scheduledFutureSchedule = hl0Var.f3257j.schedule(new RunnableC0529o2(2, this, sb), jM5687b, TimeUnit.NANOSECONDS);
        }
        this.f2432e = scheduledFutureSchedule;
        this.f2441n = c0697sm;
        this.f2442o = wp0Var;
        this.f2443p = c0095ce;
        jl0Var.f3995X.getClass();
        this.f2444q = System.nanoTime();
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: b */
    public final void mo272b(String str, Throwable th) {
        ja1 ja1Var = ja1.f3876f;
        ja1 ja1VarM2840h = str != null ? ja1Var.m2840h(str) : ja1Var.m2840h("Call cancelled without message");
        if (th != null) {
            ja1VarM2840h = ja1VarM2840h.m2839g(th);
        }
        m1877r(ja1VarM2840h, false);
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: i */
    public final void mo660i() {
        m1878s(new RunnableC0739tr(this, 1));
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: m */
    public final void mo661m() {
        if (this.f2435h) {
            this.f2437j.mo661m();
        } else {
            m1878s(new RunnableC0739tr(this, 0));
        }
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: n */
    public final void mo662n(C0525nz c0525nz) {
        if (this.f2435h) {
            this.f2437j.mo662n(c0525nz);
        } else {
            m1878s(new RunnableC0529o2(4, this, c0525nz));
        }
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: o */
    public final void mo273o(d71 d71Var, np0 np0Var) {
        ja1 ja1Var;
        boolean z;
        int i = 0;
        a90.m132p("already started", this.f2436i == null);
        synchronized (this) {
            try {
                this.f2436i = d71Var;
                ja1Var = this.f2438k;
                z = this.f2435h;
                if (!z) {
                    C0850wr c0850wr = new C0850wr(d71Var);
                    this.f2440m = c0850wr;
                    d71Var = c0850wr;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ja1Var != null) {
            this.f2433f.execute(new C0813vr(this, d71Var, ja1Var));
        } else if (z) {
            this.f2437j.mo273o(d71Var, np0Var);
        } else {
            m1878s(new RunnableC0702sr(this, d71Var, np0Var, i));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1877r(ja1 ja1Var, boolean z) {
        d71 d71Var;
        synchronized (this) {
            try {
                xe1 xe1Var = this.f2437j;
                boolean z2 = true;
                if (xe1Var == null) {
                    C0776ur c0776ur = f2431s;
                    if (xe1Var != null) {
                        z2 = false;
                    }
                    a90.m131o(xe1Var, "realCall already set to %s", z2);
                    ScheduledFuture scheduledFuture = this.f2432e;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f2437j = c0776ur;
                    d71Var = this.f2436i;
                    this.f2438k = ja1Var;
                    z2 = false;
                } else if (z) {
                    return;
                } else {
                    d71Var = null;
                }
                if (z2) {
                    m1878s(new RunnableC0529o2(3, this, ja1Var));
                } else {
                    if (d71Var != null) {
                        this.f2433f.execute(new C0813vr(this, d71Var, ja1Var));
                    }
                    m1879t();
                }
                this.f2445r.f2803d.f4012m.execute(new RunnableC0739tr(this, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1878s(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f2435h) {
                    runnable.run();
                } else {
                    this.f2439l.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1879t() {
        C0850wr c0850wr;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.f2439l.isEmpty()) {
                    break;
                }
                list = this.f2439l;
                this.f2439l = arrayList;
            }
            if (c0850wr != null) {
                this.f2433f.execute(new C0950zg(this, c0850wr));
            }
            list.clear();
            arrayList = list;
        }
        this.f2439l = null;
        this.f2435h = true;
        c0850wr = this.f2440m;
        if (c0850wr != null) {
            this.f2433f.execute(new C0950zg(this, c0850wr));
        }
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f2437j, "realCall");
        return c0809vnM5362k.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m1880u() {
        C0950zg c0950zg;
        C0697sm c0697smM4538a = this.f2441n.m4538a();
        try {
            C0095ce c0095ce = this.f2443p;
            C0059be c0059be = o80.f5662j;
            this.f2445r.f2803d.f3995X.getClass();
            xe1 xe1VarM2121g = this.f2445r.m2121g(this.f2442o, c0095ce.m921c(c0059be, Long.valueOf(System.nanoTime() - this.f2444q)));
            this.f2441n.m4539c(c0697smM4538a);
            synchronized (this) {
                try {
                    xe1 xe1Var = this.f2437j;
                    if (xe1Var != null) {
                        c0950zg = null;
                    } else {
                        a90.m131o(xe1Var, "realCall already set to %s", xe1Var == null);
                        ScheduledFuture scheduledFuture = this.f2432e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f2437j = xe1VarM2121g;
                        c0950zg = new C0950zg(this, this.f2434g);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            jl0 jl0Var = this.f2445r.f2803d;
            if (c0950zg == null) {
                jl0Var.f4012m.execute(new RunnableC0739tr(this, 2));
                return;
            }
            Executor executor = this.f2443p.f1226b;
            if (executor == null) {
                executor = jl0Var.f4007h;
            }
            executor.execute(new RunnableC0529o2(25, this, c0950zg));
        } catch (Throwable th2) {
            this.f2441n.m4539c(c0697smM4538a);
            throw th2;
        }
    }
}

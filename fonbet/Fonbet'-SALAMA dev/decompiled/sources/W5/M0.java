package W5;

import U5.AbstractC0439f;
import U5.AbstractC0442i;
import U5.AbstractC0457y;
import U5.C0437d;
import U5.C0450q;
import a.AbstractC0603a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class M0 extends AbstractC0439f {

    /* renamed from: o, reason: collision with root package name */
    public static final G f6863o;

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f6864a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f6865b;

    /* renamed from: c, reason: collision with root package name */
    public final C0450q f6866c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f6867d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0457y f6868e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0439f f6869f;

    /* renamed from: g, reason: collision with root package name */
    public U5.l0 f6870g;

    /* renamed from: h, reason: collision with root package name */
    public List f6871h;

    /* renamed from: i, reason: collision with root package name */
    public I f6872i;
    public final C0450q j;

    /* renamed from: k, reason: collision with root package name */
    public final H2.r f6873k;

    /* renamed from: l, reason: collision with root package name */
    public final C0437d f6874l;

    /* renamed from: m, reason: collision with root package name */
    public final long f6875m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N0 f6876n;

    static {
        Logger.getLogger(M0.class.getName());
        f6863o = new G(0);
    }

    public M0(N0 n02, C0450q c0450q, H2.r rVar, C0437d c0437d) {
        ScheduledFuture<?> schedule;
        this.f6876n = n02;
        Q0 q02 = n02.f6886g;
        Logger logger = Q0.f6922g0;
        q02.getClass();
        Executor executor = c0437d.f6475b;
        executor = executor == null ? q02.f6967k : executor;
        Q0 q03 = n02.f6886g;
        O0 o02 = q03.j;
        this.f6871h = new ArrayList();
        p3.f.k(executor, "callExecutor");
        this.f6865b = executor;
        p3.f.k(o02, "scheduler");
        C0450q b7 = C0450q.b();
        this.f6866c = b7;
        b7.getClass();
        U5.r rVar2 = c0437d.f6474a;
        if (rVar2 == null) {
            schedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long b8 = rVar2.b(timeUnit);
            long abs = Math.abs(b8);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = abs / timeUnit2.toNanos(1L);
            long abs2 = Math.abs(b8) % timeUnit2.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            if (b8 < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(nanos);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb.append("s. ");
            schedule = o02.f6894a.schedule(new E(0, this, sb), b8, timeUnit);
        }
        this.f6864a = schedule;
        this.j = c0450q;
        this.f6873k = rVar;
        this.f6874l = c0437d;
        q03.f6957b0.getClass();
        this.f6875m = System.nanoTime();
    }

    @Override // U5.AbstractC0439f
    public final void a(String str, Throwable th) {
        U5.l0 l0Var = U5.l0.f6537f;
        U5.l0 g3 = str != null ? l0Var.g(str) : l0Var.g("Call cancelled without message");
        if (th != null) {
            g3 = g3.f(th);
        }
        f(g3, false);
    }

    @Override // U5.AbstractC0439f
    public final void b() {
        g(new F(this, 0));
    }

    @Override // U5.AbstractC0439f
    public final void c(int i7) {
        if (this.f6867d) {
            this.f6869f.c(i7);
        } else {
            g(new RunnableC0493d(this, i7, 1));
        }
    }

    @Override // U5.AbstractC0439f
    public final void d(com.google.protobuf.C c3) {
        if (this.f6867d) {
            this.f6869f.d(c3);
        } else {
            g(new E(2, this, c3));
        }
    }

    @Override // U5.AbstractC0439f
    public final void e(AbstractC0457y abstractC0457y, U5.b0 b0Var) {
        U5.l0 l0Var;
        boolean z4;
        AbstractC0457y abstractC0457y2;
        p3.f.q("already started", this.f6868e == null);
        synchronized (this) {
            try {
                this.f6868e = abstractC0457y;
                l0Var = this.f6870g;
                z4 = this.f6867d;
                if (z4) {
                    abstractC0457y2 = abstractC0457y;
                } else {
                    I i7 = new I(abstractC0457y);
                    this.f6872i = i7;
                    abstractC0457y2 = i7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (l0Var != null) {
            this.f6865b.execute(new H(this, abstractC0457y2, l0Var));
        } else if (z4) {
            this.f6869f.e(abstractC0457y2, b0Var);
        } else {
            g(new H2.q(7, this, abstractC0457y2, b0Var, false));
        }
    }

    public final void f(U5.l0 l0Var, boolean z4) {
        AbstractC0457y abstractC0457y;
        synchronized (this) {
            try {
                AbstractC0439f abstractC0439f = this.f6869f;
                boolean z7 = true;
                if (abstractC0439f == null) {
                    G g3 = f6863o;
                    if (abstractC0439f != null) {
                        z7 = false;
                    }
                    p3.f.s(z7, "realCall already set to %s", abstractC0439f);
                    ScheduledFuture scheduledFuture = this.f6864a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f6869f = g3;
                    abstractC0457y = this.f6868e;
                    this.f6870g = l0Var;
                    z7 = false;
                } else if (z4) {
                    return;
                } else {
                    abstractC0457y = null;
                }
                if (z7) {
                    g(new E(1, this, l0Var));
                } else {
                    if (abstractC0457y != null) {
                        this.f6865b.execute(new H(this, abstractC0457y, l0Var));
                    }
                    h();
                }
                this.f6876n.f6886g.f6972p.execute(new F(this, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f6867d) {
                    runnable.run();
                } else {
                    this.f6871h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        I i7;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.f6871h.isEmpty()) {
                    break;
                }
                list = this.f6871h;
                this.f6871h = arrayList;
            }
            if (i7 == null) {
                this.f6865b.execute(new C0532q(this, i7));
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.f6871h = null;
        this.f6867d = true;
        i7 = this.f6872i;
        if (i7 == null) {
        }
    }

    public final void i() {
        C0532q c0532q;
        C0450q a2 = this.j.a();
        try {
            C0437d c0437d = this.f6874l;
            J0.a aVar = AbstractC0442i.f6506a;
            this.f6876n.f6886g.f6957b0.getClass();
            AbstractC0439f s7 = this.f6876n.s(this.f6873k, c0437d.c(aVar, Long.valueOf(System.nanoTime() - this.f6875m)));
            synchronized (this) {
                try {
                    AbstractC0439f abstractC0439f = this.f6869f;
                    if (abstractC0439f != null) {
                        c0532q = null;
                    } else {
                        p3.f.s(abstractC0439f == null, "realCall already set to %s", abstractC0439f);
                        ScheduledFuture scheduledFuture = this.f6864a;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f6869f = s7;
                        c0532q = new C0532q(this, this.f6866c);
                    }
                } finally {
                }
            }
            if (c0532q == null) {
                this.f6876n.f6886g.f6972p.execute(new F(this, 1));
                return;
            }
            Q0 q02 = this.f6876n.f6886g;
            C0437d c0437d2 = this.f6874l;
            q02.getClass();
            Executor executor = c0437d2.f6475b;
            if (executor == null) {
                executor = q02.f6967k;
            }
            executor.execute(new E(19, this, c0532q));
        } finally {
            this.j.c(a2);
        }
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(this.f6869f, "realCall");
        return u02.toString();
    }
}

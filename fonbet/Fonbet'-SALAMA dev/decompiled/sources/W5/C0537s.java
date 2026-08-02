package W5;

import U5.AbstractC0439f;
import U5.AbstractC0442i;
import U5.AbstractC0457y;
import U5.C0436c;
import U5.C0437d;
import U5.C0443j;
import U5.C0445l;
import U5.C0450q;
import U5.C0452t;
import a.AbstractC0603a;
import e6.AbstractC1053b;
import e6.C1052a;
import e6.C1054c;
import io.sentry.protocol.Request;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: W5.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0537s extends AbstractC0439f {

    /* renamed from: q, reason: collision with root package name */
    public static final Logger f7323q = Logger.getLogger(C0537s.class.getName());

    /* renamed from: r, reason: collision with root package name */
    public static final double f7324r;

    /* renamed from: a, reason: collision with root package name */
    public final H2.r f7325a;

    /* renamed from: b, reason: collision with root package name */
    public final C1054c f7326b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f7327c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7328d;

    /* renamed from: e, reason: collision with root package name */
    public final k1.g f7329e;

    /* renamed from: f, reason: collision with root package name */
    public final C0450q f7330f;

    /* renamed from: g, reason: collision with root package name */
    public volatile ScheduledFuture f7331g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7332h;

    /* renamed from: i, reason: collision with root package name */
    public C0437d f7333i;
    public InterfaceC0540t j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f7334k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7335l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7336m;

    /* renamed from: n, reason: collision with root package name */
    public final C f7337n;

    /* renamed from: o, reason: collision with root package name */
    public final ScheduledExecutorService f7338o;

    /* renamed from: p, reason: collision with root package name */
    public C0452t f7339p = C0452t.f6588d;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        f7324r = TimeUnit.SECONDS.toNanos(1L) * 1.0d;
    }

    public C0537s(H2.r rVar, Executor executor, C0437d c0437d, C c3, ScheduledExecutorService scheduledExecutorService, k1.g gVar) {
        C0445l c0445l = C0445l.f6533b;
        this.f7325a = rVar;
        Object obj = rVar.f3291b;
        System.identityHashCode(this);
        AbstractC1053b.f12736a.getClass();
        this.f7326b = C1052a.f12734a;
        if (executor == I3.a.f3657a) {
            this.f7327c = new T1();
            this.f7328d = true;
        } else {
            this.f7327c = new W1(executor);
            this.f7328d = false;
        }
        this.f7329e = gVar;
        this.f7330f = C0450q.b();
        U5.c0 c0Var = U5.c0.f6469a;
        U5.c0 c0Var2 = (U5.c0) rVar.f3294e;
        this.f7332h = c0Var2 == c0Var || c0Var2 == U5.c0.f6470b;
        this.f7333i = c0437d;
        this.f7337n = c3;
        this.f7338o = scheduledExecutorService;
    }

    @Override // U5.AbstractC0439f
    public final void a(String str, Throwable th) {
        AbstractC1053b.c();
        try {
            AbstractC1053b.a();
            f(str, th);
            AbstractC1053b.f12736a.getClass();
        } catch (Throwable th2) {
            try {
                AbstractC1053b.f12736a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // U5.AbstractC0439f
    public final void b() {
        AbstractC1053b.c();
        try {
            AbstractC1053b.a();
            p3.f.q("Not started", this.j != null);
            p3.f.q("call was cancelled", !this.f7335l);
            p3.f.q("call already half-closed", !this.f7336m);
            this.f7336m = true;
            this.j.h();
            AbstractC1053b.f12736a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1053b.f12736a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // U5.AbstractC0439f
    public final void c(int i7) {
        AbstractC1053b.c();
        try {
            AbstractC1053b.a();
            p3.f.q("Not started", this.j != null);
            p3.f.d("Number requested must be non-negative", i7 >= 0);
            this.j.i(i7);
            AbstractC1053b.f12736a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1053b.f12736a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // U5.AbstractC0439f
    public final void d(com.google.protobuf.C c3) {
        AbstractC1053b.c();
        try {
            AbstractC1053b.a();
            h(c3);
            AbstractC1053b.f12736a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1053b.f12736a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // U5.AbstractC0439f
    public final void e(AbstractC0457y abstractC0457y, U5.b0 b0Var) {
        AbstractC1053b.c();
        try {
            AbstractC1053b.a();
            i(abstractC0457y, b0Var);
            AbstractC1053b.f12736a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1053b.f12736a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f7323q.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f7335l) {
            return;
        }
        this.f7335l = true;
        try {
            if (this.j != null) {
                U5.l0 l0Var = U5.l0.f6537f;
                U5.l0 g3 = str != null ? l0Var.g(str) : l0Var.g("Call cancelled without message");
                if (th != null) {
                    g3 = g3.f(th);
                }
                this.j.f(g3);
            }
            g();
        } catch (Throwable th2) {
            g();
            throw th2;
        }
    }

    public final void g() {
        this.f7330f.getClass();
        ScheduledFuture scheduledFuture = this.f7331g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void h(com.google.protobuf.C c3) {
        p3.f.q("Not started", this.j != null);
        p3.f.q("call was cancelled", !this.f7335l);
        p3.f.q("call was half-closed", !this.f7336m);
        try {
            InterfaceC0540t interfaceC0540t = this.j;
            if (interfaceC0540t instanceof F0) {
                ((F0) interfaceC0540t).v(c3);
            } else {
                interfaceC0540t.g(this.f7325a.e(c3));
            }
            if (this.f7332h) {
                return;
            }
            this.j.flush();
        } catch (Error e7) {
            this.j.f(U5.l0.f6537f.g("Client sendMessage() failed with Error"));
            throw e7;
        } catch (RuntimeException e8) {
            this.j.f(U5.l0.f6537f.f(e8).g("Failed to stream message"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if ((r11.f6580b - r9.f6580b) < 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(AbstractC0457y abstractC0457y, U5.b0 b0Var) {
        InterfaceC0540t f02;
        C0437d c0437d;
        p3.f.q("Already started", this.j == null);
        p3.f.q("call was cancelled", !this.f7335l);
        this.f7330f.getClass();
        C0437d c0437d2 = this.f7333i;
        J0.a aVar = U0.f7061g;
        U0 u02 = (U0) c0437d2.a(aVar);
        if (u02 != null) {
            Long l7 = u02.f7062a;
            if (l7 != null) {
                long longValue = l7.longValue();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                C0443j c0443j = U5.r.f6575d;
                if (timeUnit == null) {
                    throw new NullPointerException("units");
                }
                U5.r rVar = new U5.r(timeUnit.toNanos(longValue));
                C0437d c0437d3 = this.f7333i;
                U5.r rVar2 = c0437d3.f6474a;
                if (rVar2 != null) {
                    C0443j c0443j2 = rVar2.f6579a;
                    C0443j c0443j3 = rVar.f6579a;
                    if (c0443j3 != c0443j2) {
                        throw new AssertionError("Tickers (" + c0443j3 + " and " + rVar2.f6579a + ") don't match. Custom Ticker should only be used in tests!");
                    }
                }
                c0437d3.getClass();
                C0436c b7 = C0437d.b(c0437d3);
                b7.f6462b = rVar;
                this.f7333i = new C0437d(b7);
            }
            Boolean bool = u02.f7063b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    C0437d c0437d4 = this.f7333i;
                    c0437d4.getClass();
                    C0436c b8 = C0437d.b(c0437d4);
                    b8.f6466f = Boolean.TRUE;
                    c0437d = new C0437d(b8);
                } else {
                    C0437d c0437d5 = this.f7333i;
                    c0437d5.getClass();
                    C0436c b9 = C0437d.b(c0437d5);
                    b9.f6466f = Boolean.FALSE;
                    c0437d = new C0437d(b9);
                }
                this.f7333i = c0437d;
            }
            Integer num = u02.f7064c;
            if (num != null) {
                C0437d c0437d6 = this.f7333i;
                Integer num2 = c0437d6.f6480g;
                if (num2 != null) {
                    int min = Math.min(num2.intValue(), num.intValue());
                    p3.f.c(min, "invalid maxsize %s", min >= 0);
                    C0436c b10 = C0437d.b(c0437d6);
                    b10.f6467g = Integer.valueOf(min);
                    this.f7333i = new C0437d(b10);
                } else {
                    int intValue = num.intValue();
                    p3.f.c(intValue, "invalid maxsize %s", intValue >= 0);
                    C0436c b11 = C0437d.b(c0437d6);
                    b11.f6467g = num;
                    this.f7333i = new C0437d(b11);
                }
            }
            Integer num3 = u02.f7065d;
            if (num3 != null) {
                C0437d c0437d7 = this.f7333i;
                Integer num4 = c0437d7.f6481h;
                if (num4 != null) {
                    int min2 = Math.min(num4.intValue(), num3.intValue());
                    p3.f.c(min2, "invalid maxsize %s", min2 >= 0);
                    C0436c b12 = C0437d.b(c0437d7);
                    b12.f6468h = Integer.valueOf(min2);
                    this.f7333i = new C0437d(b12);
                } else {
                    int intValue2 = num3.intValue();
                    p3.f.c(intValue2, "invalid maxsize %s", intValue2 >= 0);
                    C0436c b13 = C0437d.b(c0437d7);
                    b13.f6468h = num3;
                    this.f7333i = new C0437d(b13);
                }
            }
        }
        this.f7333i.getClass();
        C0443j c0443j4 = C0443j.f6510b;
        C0452t c0452t = this.f7339p;
        b0Var.a(AbstractC0494d0.f7170h);
        b0Var.a(AbstractC0494d0.f7166d);
        U5.Y y4 = AbstractC0494d0.f7167e;
        b0Var.a(y4);
        byte[] bArr = c0452t.f6590b;
        if (bArr.length != 0) {
            b0Var.f(y4, bArr);
        }
        b0Var.a(AbstractC0494d0.f7168f);
        b0Var.a(AbstractC0494d0.f7169g);
        U5.r rVar3 = this.f7333i.f6474a;
        this.f7330f.getClass();
        U5.r rVar4 = rVar3 == null ? null : rVar3;
        if (rVar4 == null || !rVar4.a()) {
            this.f7330f.getClass();
            U5.r rVar5 = this.f7333i.f6474a;
            Level level = Level.FINE;
            Logger logger = f7323q;
            if (logger.isLoggable(level) && rVar4 != null && rVar4.equals(null)) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long max = Math.max(0L, rVar4.b(timeUnit2));
                Locale locale = Locale.US;
                StringBuilder sb = new StringBuilder("Call timeout set to '" + max + "' ns, due to context deadline.");
                if (rVar5 == null) {
                    sb.append(" Explicit call timeout was not set.");
                } else {
                    sb.append(" Explicit call timeout was '" + rVar5.b(timeUnit2) + "' ns.");
                }
                logger.fine(sb.toString());
            }
            C c3 = this.f7337n;
            H2.r rVar6 = this.f7325a;
            C0437d c0437d8 = this.f7333i;
            C0450q c0450q = this.f7330f;
            if (((Q0) c3.f6750b).f6956a0) {
                U0 u03 = (U0) c0437d8.a(aVar);
                f02 = new F0(c3, rVar6, b0Var, c0437d8, u03 == null ? null : u03.f7066e, u03 == null ? null : u03.f7067f, c0450q);
            } else {
                InterfaceC0549w a2 = c3.a(new C0539s1(rVar6, b0Var, c0437d8));
                C0450q a4 = c0450q.a();
                try {
                    f02 = a2.a(rVar6, b0Var, c0437d8, AbstractC0494d0.c(c0437d8, b0Var, 0, false));
                } finally {
                    c0450q.c(a4);
                }
            }
            this.j = f02;
        } else {
            AbstractC0442i[] c4 = AbstractC0494d0.c(this.f7333i, b0Var, 0, false);
            U5.r rVar7 = this.f7333i.f6474a;
            this.f7330f.getClass();
            String str = rVar7 == null ? "Context" : "CallOptions";
            Long l8 = (Long) this.f7333i.a(AbstractC0442i.f6506a);
            double b14 = rVar4.b(TimeUnit.NANOSECONDS);
            double d7 = f7324r;
            this.j = new W(U5.l0.f6539h.g(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(b14 / d7), Double.valueOf(l8 == null ? 0.0d : l8.longValue() / d7))), EnumC0543u.f7372a, c4);
        }
        if (this.f7328d) {
            this.j.m();
        }
        this.f7333i.getClass();
        Integer num5 = this.f7333i.f6480g;
        if (num5 != null) {
            this.j.j(num5.intValue());
        }
        Integer num6 = this.f7333i.f6481h;
        if (num6 != null) {
            this.j.c(num6.intValue());
        }
        if (rVar4 != null) {
            this.j.l(rVar4);
        }
        this.j.a(c0443j4);
        this.j.k(this.f7339p);
        k1.g gVar = this.f7329e;
        ((A0) gVar.f14675b).c();
        ((f2) gVar.f14674a).d();
        this.j.e(new android.support.v4.media.session.t(this, abstractC0457y));
        this.f7330f.getClass();
        Logger logger2 = C0450q.f6571a;
        if (rVar4 != null) {
            this.f7330f.getClass();
            if (!rVar4.equals(null) && this.f7338o != null) {
                TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
                long b15 = rVar4.b(timeUnit3);
                this.f7331g = this.f7338o.schedule(new RunnableC0559z0(new r(this, b15)), b15, timeUnit3);
            }
        }
        if (this.f7334k) {
            g();
        }
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(this.f7325a, Request.JsonKeys.METHOD);
        return u02.toString();
    }
}

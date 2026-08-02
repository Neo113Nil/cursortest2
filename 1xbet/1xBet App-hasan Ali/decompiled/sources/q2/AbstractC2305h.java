package q2;

import a3.AbstractC0467k;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import n.AbstractC2107A;
import r3.AbstractC2349a;

/* renamed from: q2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2305h implements E3.a {

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f18877n = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f18878o = Logger.getLogger(AbstractC2305h.class.getName());

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC2349a f18879p;

    /* renamed from: q, reason: collision with root package name */
    public static final Object f18880q;

    /* renamed from: k, reason: collision with root package name */
    public volatile Object f18881k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C2300c f18882l;

    /* renamed from: m, reason: collision with root package name */
    public volatile C2304g f18883m;

    static {
        AbstractC2349a c2303f;
        try {
            c2303f = new C2301d(AtomicReferenceFieldUpdater.newUpdater(C2304g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2304g.class, C2304g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2305h.class, C2304g.class, "m"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2305h.class, C2300c.class, "l"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2305h.class, Object.class, "k"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c2303f = new C2303f();
        }
        f18879p = c2303f;
        if (th != null) {
            f18878o.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f18880q = new Object();
    }

    public static void c(AbstractC2305h abstractC2305h) {
        C2300c c2300c;
        C2300c c2300c2;
        C2300c c2300c3 = null;
        while (true) {
            C2304g c2304g = abstractC2305h.f18883m;
            if (f18879p.q(abstractC2305h, c2304g, C2304g.f18874c)) {
                while (c2304g != null) {
                    Thread thread = c2304g.f18875a;
                    if (thread != null) {
                        c2304g.f18875a = null;
                        LockSupport.unpark(thread);
                    }
                    c2304g = c2304g.f18876b;
                }
                do {
                    c2300c = abstractC2305h.f18882l;
                } while (!f18879p.o(abstractC2305h, c2300c, C2300c.f18863d));
                while (true) {
                    c2300c2 = c2300c3;
                    c2300c3 = c2300c;
                    if (c2300c3 == null) {
                        break;
                    }
                    c2300c = c2300c3.f18866c;
                    c2300c3.f18866c = c2300c2;
                }
                while (c2300c2 != null) {
                    c2300c3 = c2300c2.f18866c;
                    Runnable runnable = c2300c2.f18864a;
                    if (runnable instanceof RunnableC2302e) {
                        RunnableC2302e runnableC2302e = (RunnableC2302e) runnable;
                        abstractC2305h = runnableC2302e.f18872k;
                        if (abstractC2305h.f18881k == runnableC2302e) {
                            if (f18879p.p(abstractC2305h, runnableC2302e, f(runnableC2302e.f18873l))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, c2300c2.f18865b);
                    }
                    c2300c2 = c2300c3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f18878o.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof C2298a) {
            CancellationException cancellationException = ((C2298a) obj).f18860b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C2299b) {
            throw new ExecutionException(((C2299b) obj).f18862a);
        }
        if (obj == f18880q) {
            return null;
        }
        return obj;
    }

    public static Object f(E3.a aVar) {
        if (aVar instanceof AbstractC2305h) {
            Object obj = ((AbstractC2305h) aVar).f18881k;
            if (!(obj instanceof C2298a)) {
                return obj;
            }
            C2298a c2298a = (C2298a) obj;
            return c2298a.f18859a ? c2298a.f18860b != null ? new C2298a(false, c2298a.f18860b) : C2298a.f18858d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f18877n) && isCancelled) {
            return C2298a.f18858d;
        }
        try {
            Object g5 = g(aVar);
            return g5 == null ? f18880q : g5;
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new C2298a(false, e3);
            }
            return new C2299b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e3));
        } catch (ExecutionException e5) {
            return new C2299b(e5.getCause());
        } catch (Throwable th) {
            return new C2299b(th);
        }
    }

    public static Object g(E3.a aVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = aVar.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // E3.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        C2300c c2300c = this.f18882l;
        C2300c c2300c2 = C2300c.f18863d;
        if (c2300c != c2300c2) {
            C2300c c2300c3 = new C2300c(runnable, executor);
            do {
                c2300c3.f18866c = c2300c;
                if (f18879p.o(this, c2300c, c2300c3)) {
                    return;
                } else {
                    c2300c = this.f18882l;
                }
            } while (c2300c != c2300c2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g5 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g5 == this ? "this future" : String.valueOf(g5));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f18881k;
        if (!(obj == null) && !(obj instanceof RunnableC2302e)) {
            return false;
        }
        C2298a c2298a = f18877n ? new C2298a(z3, new CancellationException("Future.cancel() was called.")) : z3 ? C2298a.f18857c : C2298a.f18858d;
        AbstractC2305h abstractC2305h = this;
        boolean z5 = false;
        while (true) {
            if (f18879p.p(abstractC2305h, obj, c2298a)) {
                c(abstractC2305h);
                if (!(obj instanceof RunnableC2302e)) {
                    break;
                }
                E3.a aVar = ((RunnableC2302e) obj).f18873l;
                if (!(aVar instanceof AbstractC2305h)) {
                    aVar.cancel(z3);
                    break;
                }
                abstractC2305h = (AbstractC2305h) aVar;
                obj = abstractC2305h.f18881k;
                if (!(obj == null) && !(obj instanceof RunnableC2302e)) {
                    break;
                }
                z5 = true;
            } else {
                obj = abstractC2305h.f18881k;
                if (!(obj instanceof RunnableC2302e)) {
                    return z5;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        boolean z3;
        long nanos = timeUnit.toNanos(j5);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f18881k;
        if ((obj != null) && (!(obj instanceof RunnableC2302e))) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2304g c2304g = this.f18883m;
            C2304g c2304g2 = C2304g.f18874c;
            if (c2304g != c2304g2) {
                C2304g c2304g3 = new C2304g();
                z3 = true;
                do {
                    AbstractC2349a abstractC2349a = f18879p;
                    abstractC2349a.J(c2304g3, c2304g);
                    if (abstractC2349a.q(this, c2304g, c2304g3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(c2304g3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f18881k;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC2302e))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(c2304g3);
                    } else {
                        c2304g = this.f18883m;
                    }
                } while (c2304g != c2304g2);
            }
            return e(this.f18881k);
        }
        z3 = true;
        while (nanos > 0) {
            Object obj3 = this.f18881k;
            if ((obj3 != null ? z3 : false) && (!(obj3 instanceof RunnableC2302e))) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC2305h = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j6 = -nanos;
            long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(convert);
            boolean z5 = (convert == 0 || nanos2 > 1000) ? z3 : false;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z5) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z5) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (!isDone()) {
            throw new TimeoutException(AbstractC0467k.v(str, " for ", abstractC2305h));
        }
        throw new TimeoutException(str + " but future completed as timeout expired");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f18881k;
        if (obj instanceof RunnableC2302e) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            E3.a aVar = ((RunnableC2302e) obj).f18873l;
            return AbstractC2107A.u(sb, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(C2304g c2304g) {
        c2304g.f18875a = null;
        while (true) {
            C2304g c2304g2 = this.f18883m;
            if (c2304g2 == C2304g.f18874c) {
                return;
            }
            C2304g c2304g3 = null;
            while (c2304g2 != null) {
                C2304g c2304g4 = c2304g2.f18876b;
                if (c2304g2.f18875a != null) {
                    c2304g3 = c2304g2;
                } else if (c2304g3 != null) {
                    c2304g3.f18876b = c2304g4;
                    if (c2304g3.f18875a == null) {
                        break;
                    }
                } else if (!f18879p.q(this, c2304g2, c2304g4)) {
                    break;
                }
                c2304g2 = c2304g4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f18881k instanceof C2298a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof RunnableC2302e)) & (this.f18881k != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f18881k instanceof C2298a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e3) {
                str = "Exception thrown from implementation: " + e3.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f18881k;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC2302e))) {
                return e(obj2);
            }
            C2304g c2304g = this.f18883m;
            C2304g c2304g2 = C2304g.f18874c;
            if (c2304g != c2304g2) {
                C2304g c2304g3 = new C2304g();
                do {
                    AbstractC2349a abstractC2349a = f18879p;
                    abstractC2349a.J(c2304g3, c2304g);
                    if (abstractC2349a.q(this, c2304g, c2304g3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f18881k;
                            } else {
                                i(c2304g3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC2302e))));
                        return e(obj);
                    }
                    c2304g = this.f18883m;
                } while (c2304g != c2304g2);
            }
            return e(this.f18881k);
        }
        throw new InterruptedException();
    }
}

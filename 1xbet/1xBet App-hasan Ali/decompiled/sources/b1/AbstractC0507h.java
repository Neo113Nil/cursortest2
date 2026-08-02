package b1;

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
import k4.AbstractC2036a;

/* renamed from: b1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0507h implements E3.a {

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f7200n = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f7201o = Logger.getLogger(AbstractC0507h.class.getName());

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC2036a f7202p;

    /* renamed from: q, reason: collision with root package name */
    public static final Object f7203q;

    /* renamed from: k, reason: collision with root package name */
    public volatile Object f7204k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C0503d f7205l;

    /* renamed from: m, reason: collision with root package name */
    public volatile C0506g f7206m;

    static {
        AbstractC2036a c0505f;
        try {
            c0505f = new C0504e(AtomicReferenceFieldUpdater.newUpdater(C0506g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0506g.class, C0506g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0507h.class, C0506g.class, "m"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0507h.class, C0503d.class, "l"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0507h.class, Object.class, "k"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0505f = new C0505f();
        }
        f7202p = c0505f;
        if (th != null) {
            f7201o.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7203q = new Object();
    }

    public static void c(AbstractC0507h abstractC0507h) {
        C0506g c0506g;
        C0503d c0503d;
        C0503d c0503d2;
        C0503d c0503d3;
        do {
            c0506g = abstractC0507h.f7206m;
        } while (!f7202p.m(abstractC0507h, c0506g, C0506g.f7197c));
        while (true) {
            c0503d = null;
            if (c0506g == null) {
                break;
            }
            Thread thread = c0506g.f7198a;
            if (thread != null) {
                c0506g.f7198a = null;
                LockSupport.unpark(thread);
            }
            c0506g = c0506g.f7199b;
        }
        do {
            c0503d2 = abstractC0507h.f7205l;
        } while (!f7202p.k(abstractC0507h, c0503d2, C0503d.f7188d));
        while (true) {
            c0503d3 = c0503d;
            c0503d = c0503d2;
            if (c0503d == null) {
                break;
            }
            c0503d2 = c0503d.f7191c;
            c0503d.f7191c = c0503d3;
        }
        while (c0503d3 != null) {
            C0503d c0503d4 = c0503d3.f7191c;
            d(c0503d3.f7189a, c0503d3.f7190b);
            c0503d3 = c0503d4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f7201o.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof C0500a) {
            CancellationException cancellationException = ((C0500a) obj).f7185a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C0502c) {
            throw new ExecutionException(((C0502c) obj).f7187a);
        }
        if (obj == f7203q) {
            return null;
        }
        return obj;
    }

    public static Object f(AbstractC0507h abstractC0507h) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = abstractC0507h.get();
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
        C0503d c0503d = this.f7205l;
        C0503d c0503d2 = C0503d.f7188d;
        if (c0503d != c0503d2) {
            C0503d c0503d3 = new C0503d(runnable, executor);
            do {
                c0503d3.f7191c = c0503d;
                if (f7202p.k(this, c0503d, c0503d3)) {
                    return;
                } else {
                    c0503d = this.f7205l;
                }
            } while (c0503d != c0503d2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object f = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(f == this ? "this future" : String.valueOf(f));
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
        Object obj = this.f7204k;
        if (obj != null) {
            return false;
        }
        if (!f7202p.l(this, obj, f7200n ? new C0500a(z3, new CancellationException("Future.cancel() was called.")) : z3 ? C0500a.f7183b : C0500a.f7184c)) {
            return false;
        }
        c(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j5);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f7204k;
        if (obj != null) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0506g c0506g = this.f7206m;
            C0506g c0506g2 = C0506g.f7197c;
            if (c0506g != c0506g2) {
                C0506g c0506g3 = new C0506g();
                do {
                    AbstractC2036a abstractC2036a = f7202p;
                    abstractC2036a.Q(c0506g3, c0506g);
                    if (abstractC2036a.m(this, c0506g, c0506g3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(c0506g3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f7204k;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(c0506g3);
                    } else {
                        c0506g = this.f7206m;
                    }
                } while (c0506g != c0506g2);
            }
            return e(this.f7204k);
        }
        while (nanos > 0) {
            Object obj3 = this.f7204k;
            if (obj3 != null) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC0507h = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j6 = -nanos;
            long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(convert);
            boolean z3 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z3) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z3) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (!isDone()) {
            throw new TimeoutException(AbstractC0467k.v(str, " for ", abstractC0507h));
        }
        throw new TimeoutException(str + " but future completed as timeout expired");
    }

    public final void h(C0506g c0506g) {
        c0506g.f7198a = null;
        while (true) {
            C0506g c0506g2 = this.f7206m;
            if (c0506g2 == C0506g.f7197c) {
                return;
            }
            C0506g c0506g3 = null;
            while (c0506g2 != null) {
                C0506g c0506g4 = c0506g2.f7199b;
                if (c0506g2.f7198a != null) {
                    c0506g3 = c0506g2;
                } else if (c0506g3 != null) {
                    c0506g3.f7199b = c0506g4;
                    if (c0506g3.f7198a == null) {
                        break;
                    }
                } else if (!f7202p.m(this, c0506g2, c0506g4)) {
                    break;
                }
                c0506g2 = c0506g4;
            }
            return;
        }
    }

    public boolean i(Throwable th) {
        th.getClass();
        if (!f7202p.l(this, null, new C0502c(th))) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7204k instanceof C0500a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7204k != null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f7204k instanceof C0500a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = g();
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
            Object obj2 = this.f7204k;
            if (obj2 != null) {
                return e(obj2);
            }
            C0506g c0506g = this.f7206m;
            C0506g c0506g2 = C0506g.f7197c;
            if (c0506g != c0506g2) {
                C0506g c0506g3 = new C0506g();
                do {
                    AbstractC2036a abstractC2036a = f7202p;
                    abstractC2036a.Q(c0506g3, c0506g);
                    if (abstractC2036a.m(this, c0506g, c0506g3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7204k;
                            } else {
                                h(c0506g3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    c0506g = this.f7206m;
                } while (c0506g != c0506g2);
            }
            return e(this.f7204k);
        }
        throw new InterruptedException();
    }
}

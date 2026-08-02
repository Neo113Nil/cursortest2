package o1;

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
import n3.AbstractC1464a;

/* renamed from: o1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1499i implements I3.b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f15563d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f15564e = Logger.getLogger(AbstractC1499i.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC1464a f15565f;

    /* renamed from: x, reason: collision with root package name */
    public static final Object f15566x;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f15567a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C1494d f15568b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1498h f15569c;

    static {
        AbstractC1464a c1497g;
        try {
            c1497g = new C1495e(AtomicReferenceFieldUpdater.newUpdater(C1498h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1498h.class, C1498h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1499i.class, C1498h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1499i.class, C1494d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1499i.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1497g = new C1497g();
        }
        f15565f = c1497g;
        if (th != null) {
            f15564e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15566x = new Object();
    }

    public static void b(AbstractC1499i abstractC1499i) {
        C1494d c1494d;
        C1494d c1494d2;
        C1494d c1494d3 = null;
        while (true) {
            C1498h c1498h = abstractC1499i.f15569c;
            if (f15565f.h(abstractC1499i, c1498h, C1498h.f15560c)) {
                while (c1498h != null) {
                    Thread thread = c1498h.f15561a;
                    if (thread != null) {
                        c1498h.f15561a = null;
                        LockSupport.unpark(thread);
                    }
                    c1498h = c1498h.f15562b;
                }
                do {
                    c1494d = abstractC1499i.f15568b;
                } while (!f15565f.f(abstractC1499i, c1494d, C1494d.f15550d));
                while (true) {
                    c1494d2 = c1494d3;
                    c1494d3 = c1494d;
                    if (c1494d3 == null) {
                        break;
                    }
                    c1494d = c1494d3.f15553c;
                    c1494d3.f15553c = c1494d2;
                }
                while (c1494d2 != null) {
                    c1494d3 = c1494d2.f15553c;
                    Runnable runnable = c1494d2.f15551a;
                    if (runnable instanceof RunnableC1496f) {
                        RunnableC1496f runnableC1496f = (RunnableC1496f) runnable;
                        abstractC1499i = runnableC1496f.f15558a;
                        if (abstractC1499i.f15567a == runnableC1496f) {
                            if (f15565f.g(abstractC1499i, runnableC1496f, e(runnableC1496f.f15559b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, c1494d2.f15552b);
                    }
                    c1494d2 = c1494d3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f15564e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof C1491a) {
            CancellationException cancellationException = ((C1491a) obj).f15546b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C1493c) {
            throw new ExecutionException(((C1493c) obj).f15549a);
        }
        if (obj == f15566x) {
            return null;
        }
        return obj;
    }

    public static Object e(I3.b bVar) {
        if (bVar instanceof AbstractC1499i) {
            Object obj = ((AbstractC1499i) bVar).f15567a;
            if (!(obj instanceof C1491a)) {
                return obj;
            }
            C1491a c1491a = (C1491a) obj;
            return c1491a.f15545a ? c1491a.f15546b != null ? new C1491a(false, c1491a.f15546b) : C1491a.f15544d : obj;
        }
        boolean isCancelled = bVar.isCancelled();
        if ((!f15563d) && isCancelled) {
            return C1491a.f15544d;
        }
        try {
            Object f7 = f(bVar);
            return f7 == null ? f15566x : f7;
        } catch (CancellationException e7) {
            if (isCancelled) {
                return new C1491a(false, e7);
            }
            return new C1493c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e7));
        } catch (ExecutionException e8) {
            return new C1493c(e8.getCause());
        } catch (Throwable th) {
            return new C1493c(th);
        }
    }

    public static Object f(I3.b bVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = bVar.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object f7 = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(f7 == this ? "this future" : String.valueOf(f7));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        }
    }

    @Override // I3.b
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C1494d c1494d = this.f15568b;
        C1494d c1494d2 = C1494d.f15550d;
        if (c1494d != c1494d2) {
            C1494d c1494d3 = new C1494d(runnable, executor);
            do {
                c1494d3.f15553c = c1494d;
                if (f15565f.f(this, c1494d, c1494d3)) {
                    return;
                } else {
                    c1494d = this.f15568b;
                }
            } while (c1494d != c1494d2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f15567a;
        if (!(obj == null) && !(obj instanceof RunnableC1496f)) {
            return false;
        }
        C1491a c1491a = f15563d ? new C1491a(z4, new CancellationException("Future.cancel() was called.")) : z4 ? C1491a.f15543c : C1491a.f15544d;
        AbstractC1499i abstractC1499i = this;
        boolean z7 = false;
        while (true) {
            if (f15565f.g(abstractC1499i, obj, c1491a)) {
                b(abstractC1499i);
                if (!(obj instanceof RunnableC1496f)) {
                    return true;
                }
                I3.b bVar = ((RunnableC1496f) obj).f15559b;
                if (!(bVar instanceof AbstractC1499i)) {
                    bVar.cancel(z4);
                    return true;
                }
                abstractC1499i = (AbstractC1499i) bVar;
                obj = abstractC1499i.f15567a;
                if (!(obj == null) && !(obj instanceof RunnableC1496f)) {
                    return true;
                }
                z7 = true;
            } else {
                obj = abstractC1499i.f15567a;
                if (!(obj instanceof RunnableC1496f)) {
                    return z7;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f15567a;
        if (obj instanceof RunnableC1496f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            I3.b bVar = ((RunnableC1496f) obj).f15559b;
            return e1.k.i(sb, bVar == this ? "this future" : String.valueOf(bVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a8 -> B:33:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j, TimeUnit timeUnit) {
        long j3;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f15567a;
        if ((obj != null) && (!(obj instanceof RunnableC1496f))) {
            return d(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1498h c1498h = this.f15569c;
            C1498h c1498h2 = C1498h.f15560c;
            if (c1498h != c1498h2) {
                C1498h c1498h3 = new C1498h();
                do {
                    AbstractC1464a abstractC1464a = f15565f;
                    abstractC1464a.N(c1498h3, c1498h);
                    if (abstractC1464a.h(this, c1498h, c1498h3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(c1498h3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f15567a;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC1496f))) {
                                return d(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(c1498h3);
                        j3 = 0;
                        if (nanos <= j3) {
                            String abstractC1499i = toString();
                            String obj3 = timeUnit.toString();
                            Locale locale = Locale.ROOT;
                            String lowerCase = obj3.toLowerCase(locale);
                            StringBuilder j7 = e1.k.j("Waited ", " ", j);
                            j7.append(timeUnit.toString().toLowerCase(locale));
                            String sb = j7.toString();
                            if (nanos + 1000 < 0) {
                                String e7 = e1.k.e(sb, " (plus ");
                                long j8 = -nanos;
                                long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
                                long nanos2 = j8 - timeUnit.toNanos(convert);
                                boolean z4 = convert == 0 || nanos2 > 1000;
                                if (convert > 0) {
                                    String str = e7 + convert + " " + lowerCase;
                                    if (z4) {
                                        str = e1.k.e(str, ",");
                                    }
                                    e7 = e1.k.e(str, " ");
                                }
                                if (z4) {
                                    e7 = e7 + nanos2 + " nanoseconds ";
                                }
                                sb = e1.k.e(e7, "delay)");
                            }
                            if (isDone()) {
                                throw new TimeoutException(e1.k.e(sb, " but future completed as timeout expired"));
                            }
                            throw new TimeoutException(e1.k.f(sb, " for ", abstractC1499i));
                        }
                        Object obj4 = this.f15567a;
                        if ((obj4 != null) && (!(obj4 instanceof RunnableC1496f))) {
                            return d(obj4);
                        }
                        if (Thread.interrupted()) {
                            throw new InterruptedException();
                        }
                        nanos = nanoTime - System.nanoTime();
                        j3 = 0;
                        if (nanos <= j3) {
                        }
                    } else {
                        c1498h = this.f15569c;
                    }
                } while (c1498h != c1498h2);
            }
            return d(this.f15567a);
        }
        j3 = 0;
        if (nanos <= j3) {
        }
    }

    public final void h(C1498h c1498h) {
        c1498h.f15561a = null;
        while (true) {
            C1498h c1498h2 = this.f15569c;
            if (c1498h2 == C1498h.f15560c) {
                return;
            }
            C1498h c1498h3 = null;
            while (c1498h2 != null) {
                C1498h c1498h4 = c1498h2.f15562b;
                if (c1498h2.f15561a != null) {
                    c1498h3 = c1498h2;
                } else if (c1498h3 != null) {
                    c1498h3.f15562b = c1498h4;
                    if (c1498h3.f15561a == null) {
                        break;
                    }
                } else if (!f15565f.h(this, c1498h2, c1498h4)) {
                    break;
                }
                c1498h2 = c1498h4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15567a instanceof C1491a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof RunnableC1496f)) & (this.f15567a != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f15567a instanceof C1491a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = g();
            } catch (RuntimeException e7) {
                str = "Exception thrown from implementation: " + e7.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
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
            Object obj2 = this.f15567a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC1496f))) {
                return d(obj2);
            }
            C1498h c1498h = this.f15569c;
            C1498h c1498h2 = C1498h.f15560c;
            if (c1498h != c1498h2) {
                C1498h c1498h3 = new C1498h();
                do {
                    AbstractC1464a abstractC1464a = f15565f;
                    abstractC1464a.N(c1498h3, c1498h);
                    if (abstractC1464a.h(this, c1498h, c1498h3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15567a;
                            } else {
                                h(c1498h3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC1496f))));
                        return d(obj);
                    }
                    c1498h = this.f15569c;
                } while (c1498h != c1498h2);
            }
            return d(this.f15567a);
        }
        throw new InterruptedException();
    }
}

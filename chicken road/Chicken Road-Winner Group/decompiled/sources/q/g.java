package q;

import a.AbstractC0086a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f10251d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f10252e = Logger.getLogger(g.class.getName());
    public static final AbstractC0086a f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f10253g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f10254a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C1169c f10255b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f10256c;

    static {
        AbstractC0086a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, C1169c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f = eVar;
        if (th != null) {
            f10252e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f10253g = new Object();
    }

    public static void c(g gVar) {
        f fVar;
        C1169c c1169c;
        do {
            fVar = gVar.f10256c;
        } while (!f.g(gVar, fVar, f.f10248c));
        while (fVar != null) {
            Thread thread = fVar.f10249a;
            if (thread != null) {
                fVar.f10249a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f10250b;
        }
        do {
            c1169c = gVar.f10255b;
        } while (!f.e(gVar, c1169c));
        C1169c c1169c2 = null;
        while (c1169c != null) {
            C1169c c1169c3 = c1169c.f10243a;
            c1169c.f10243a = c1169c2;
            c1169c2 = c1169c;
            c1169c = c1169c3;
        }
        while (c1169c2 != null) {
            c1169c2 = c1169c2.f10243a;
            try {
                throw null;
            } catch (RuntimeException e3) {
                f10252e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e3);
            }
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof C1167a) {
            CancellationException cancellationException = ((C1167a) obj).f10241a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC1168b) {
            ((AbstractC1168b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f10253g) {
            return null;
        }
        return obj;
    }

    public static Object e(g gVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = gVar.get();
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

    public final void b(StringBuilder sb) {
        try {
            Object e3 = e(this);
            sb.append("SUCCESS, result=[");
            sb.append(e3 == this ? "this future" : String.valueOf(e3));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f10254a;
        if (obj != null) {
            return false;
        }
        if (!f.f(this, obj, f10251d ? new C1167a(z3, new CancellationException("Future.cancel() was called.")) : z3 ? C1167a.f10239b : C1167a.f10240c)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void f(f fVar) {
        fVar.f10249a = null;
        while (true) {
            f fVar2 = this.f10256c;
            if (fVar2 == f.f10248c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f10250b;
                if (fVar2.f10249a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f10250b = fVar4;
                    if (fVar3.f10249a == null) {
                        break;
                    }
                } else if (!f.g(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f10254a;
        if (obj != null) {
            return d(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f10256c;
            f fVar2 = f.f10248c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0086a abstractC0086a = f;
                    abstractC0086a.K(fVar3, fVar);
                    if (abstractC0086a.g(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                f(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f10254a;
                            if (obj2 != null) {
                                return d(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        f(fVar3);
                    } else {
                        fVar = this.f10256c;
                    }
                } while (fVar != fVar2);
            }
            return d(this.f10254a);
        }
        while (nanos > 0) {
            Object obj3 = this.f10254a;
            if (obj3 != null) {
                return d(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String gVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String o3 = B0.c.o(str, " (plus ");
            long j4 = -nanos;
            long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(convert);
            boolean z3 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = o3 + convert + " " + lowerCase;
                if (z3) {
                    str2 = B0.c.o(str2, StringUtils.COMMA);
                }
                o3 = B0.c.o(str2, " ");
            }
            if (z3) {
                o3 = o3 + nanos2 + " nanoseconds ";
            }
            str = B0.c.o(o3, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(B0.c.o(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + gVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f10254a instanceof C1167a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f10254a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f10254a instanceof C1167a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
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
            Object obj2 = this.f10254a;
            if (obj2 != null) {
                return d(obj2);
            }
            f fVar = this.f10256c;
            f fVar2 = f.f10248c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0086a abstractC0086a = f;
                    abstractC0086a.K(fVar3, fVar);
                    if (abstractC0086a.g(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f10254a;
                            } else {
                                f(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return d(obj);
                    }
                    fVar = this.f10256c;
                } while (fVar != fVar2);
            }
            return d(this.f10254a);
        }
        throw new InterruptedException();
    }
}

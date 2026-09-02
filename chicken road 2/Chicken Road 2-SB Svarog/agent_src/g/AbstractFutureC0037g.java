package g;

import a.AbstractC0018a;
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

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractFutureC0037g implements Future {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f523e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f524f = Logger.getLogger(AbstractFutureC0037g.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC0018a f525g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f526h;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f527b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0033c f528c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C0036f f529d;

    static {
        AbstractC0018a c0035e;
        try {
            c0035e = new C0034d(AtomicReferenceFieldUpdater.newUpdater(C0036f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0036f.class, C0036f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0037g.class, C0036f.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0037g.class, C0033c.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0037g.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0035e = new C0035e();
        }
        f525g = c0035e;
        if (th != null) {
            f524f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f526h = new Object();
    }

    public static void b(AbstractFutureC0037g abstractFutureC0037g) {
        C0036f c0036f;
        C0033c c0033c;
        do {
            c0036f = abstractFutureC0037g.f529d;
        } while (!f525g.f(abstractFutureC0037g, c0036f, C0036f.f520c));
        while (c0036f != null) {
            Thread thread = c0036f.f521a;
            if (thread != null) {
                c0036f.f521a = null;
                LockSupport.unpark(thread);
            }
            c0036f = c0036f.f522b;
        }
        do {
            c0033c = abstractFutureC0037g.f528c;
        } while (!f525g.d(abstractFutureC0037g, c0033c));
        C0033c c0033c2 = null;
        while (c0033c != null) {
            C0033c c0033c3 = c0033c.f514a;
            c0033c.f514a = c0033c2;
            c0033c2 = c0033c;
            c0033c = c0033c3;
        }
        while (c0033c2 != null) {
            c0033c2 = c0033c2.f514a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f524f.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0031a) {
            Throwable th = ((C0031a) obj).f512a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0032b) {
            ((AbstractC0032b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f526h) {
            return null;
        }
        return obj;
    }

    public static Object d(AbstractFutureC0037g abstractFutureC0037g) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = abstractFutureC0037g.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d2 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d2 == this ? "this future" : String.valueOf(d2));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f527b;
        if (obj != null) {
            return false;
        }
        if (!f525g.e(this, obj, f523e ? new C0031a(new CancellationException("Future.cancel() was called."), z2) : z2 ? C0031a.f510b : C0031a.f511c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(C0036f c0036f) {
        c0036f.f521a = null;
        while (true) {
            C0036f c0036f2 = this.f529d;
            if (c0036f2 == C0036f.f520c) {
                return;
            }
            C0036f c0036f3 = null;
            while (c0036f2 != null) {
                C0036f c0036f4 = c0036f2.f522b;
                if (c0036f2.f521a != null) {
                    c0036f3 = c0036f2;
                } else if (c0036f3 != null) {
                    c0036f3.f522b = c0036f4;
                    if (c0036f3.f521a == null) {
                        break;
                    }
                } else if (!f525g.f(this, c0036f2, c0036f4)) {
                    break;
                }
                c0036f2 = c0036f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        C0036f c0036f = C0036f.f520c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f527b;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0036f c0036f2 = this.f529d;
            if (c0036f2 != c0036f) {
                C0036f c0036f3 = new C0036f();
                do {
                    AbstractC0018a abstractC0018a = f525g;
                    abstractC0018a.u(c0036f3, c0036f2);
                    if (abstractC0018a.f(this, c0036f2, c0036f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(c0036f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f527b;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(c0036f3);
                    } else {
                        c0036f2 = this.f529d;
                    }
                } while (c0036f2 != c0036f);
            }
            return c(this.f527b);
        }
        while (nanos > 0) {
            Object obj3 = this.f527b;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFutureC0037g = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z2) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z2) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + abstractFutureC0037g);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f527b instanceof C0031a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f527b != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f527b instanceof C0031a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
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
        C0036f c0036f = C0036f.f520c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f527b;
            if (obj2 != null) {
                return c(obj2);
            }
            C0036f c0036f2 = this.f529d;
            if (c0036f2 != c0036f) {
                C0036f c0036f3 = new C0036f();
                do {
                    AbstractC0018a abstractC0018a = f525g;
                    abstractC0018a.u(c0036f3, c0036f2);
                    if (abstractC0018a.f(this, c0036f2, c0036f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f527b;
                            } else {
                                e(c0036f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    c0036f2 = this.f529d;
                } while (c0036f2 != c0036f);
            }
            return c(this.f527b);
        }
        throw new InterruptedException();
    }
}

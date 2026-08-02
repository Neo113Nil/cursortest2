package s;

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
import p6.AbstractC1539a;

/* loaded from: classes.dex */
public abstract class g implements I3.b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f16077d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f16078e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC1539a f16079f;

    /* renamed from: x, reason: collision with root package name */
    public static final Object f16080x;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f16081a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f16082b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f16083c;

    static {
        AbstractC1539a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f16079f = eVar;
        if (th != null) {
            f16078e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f16080x = new Object();
    }

    public static void c(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f16083c;
        } while (!f16079f.d(gVar, fVar, f.f16074c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f16075a;
            if (thread != null) {
                fVar.f16075a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f16076b;
        }
        gVar.b();
        do {
            cVar2 = gVar.f16082b;
        } while (!f16079f.b(gVar, cVar2, c.f16065d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f16068c;
            cVar.f16068c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f16068c;
            d(cVar3.f16066a, cVar3.f16067b);
            cVar3 = cVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f16078e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof C1583a) {
            CancellationException cancellationException = ((C1583a) obj).f16063b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f16064a);
        }
        if (obj == f16080x) {
            return null;
        }
        return obj;
    }

    public static Object h(g gVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = gVar.get();
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
            Object h6 = h(this);
            sb.append("SUCCESS, result=[");
            sb.append(h6 == this ? "this future" : String.valueOf(h6));
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
        c cVar = this.f16082b;
        c cVar2 = c.f16065d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f16068c = cVar;
                if (f16079f.b(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f16082b;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f16081a;
        if (obj != null) {
            return false;
        }
        if (!f16079f.c(this, obj, f16077d ? new C1583a(z4, new CancellationException("Future.cancel() was called.")) : z4 ? C1583a.f16060c : C1583a.f16061d)) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f16081a;
        if (obj != null) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f16083c;
            f fVar2 = f.f16074c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC1539a abstractC1539a = f16079f;
                    abstractC1539a.f(fVar3, fVar);
                    if (abstractC1539a.d(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f16081a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m(fVar3);
                    } else {
                        fVar = this.f16083c;
                    }
                } while (fVar != fVar2);
            }
            return f(this.f16081a);
        }
        while (nanos > 0) {
            Object obj3 = this.f16081a;
            if (obj3 != null) {
                return f(obj3);
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
        StringBuilder j3 = e1.k.j("Waited ", " ", j);
        j3.append(timeUnit.toString().toLowerCase(locale));
        String sb = j3.toString();
        if (nanos + 1000 < 0) {
            String e7 = e1.k.e(sb, " (plus ");
            long j7 = -nanos;
            long convert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
            long nanos2 = j7 - timeUnit.toNanos(convert);
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
        throw new TimeoutException(e1.k.f(sb, " for ", gVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f16081a instanceof C1583a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f16081a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void m(f fVar) {
        fVar.f16075a = null;
        while (true) {
            f fVar2 = this.f16083c;
            if (fVar2 == f.f16074c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f16076b;
                if (fVar2.f16075a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f16076b = fVar4;
                    if (fVar3.f16075a == null) {
                        break;
                    }
                } else if (!f16079f.d(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    public boolean p(Object obj) {
        if (obj == null) {
            obj = f16080x;
        }
        if (!f16079f.c(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    public boolean t(Throwable th) {
        th.getClass();
        if (!f16079f.c(this, null, new b(th))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f16081a instanceof C1583a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = l();
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

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f16081a;
            if (obj2 != null) {
                return f(obj2);
            }
            f fVar = this.f16083c;
            f fVar2 = f.f16074c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC1539a abstractC1539a = f16079f;
                    abstractC1539a.f(fVar3, fVar);
                    if (abstractC1539a.d(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f16081a;
                            } else {
                                m(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    fVar = this.f16083c;
                } while (fVar != fVar2);
            }
            return f(this.f16081a);
        }
        throw new InterruptedException();
    }
}

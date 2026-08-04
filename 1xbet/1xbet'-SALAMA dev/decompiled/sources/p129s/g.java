package p129s;

import I3.b;
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
import p031e1.k;
import p115p6.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f16083d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f16084e = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f16085f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f16086x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f16087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile c f16088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile f f16089c;

    static {
        a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f16085f = eVar;
        if (th != null) {
            f16084e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f16086x = new Object();
    }

    public static void c(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f16089c;
        } while (!f16085f.d(gVar, fVar, f.f16080c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f16081a;
            if (thread != null) {
                fVar.f16081a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f16082b;
        }
        gVar.b();
        do {
            cVar2 = gVar.f16088b;
        } while (!f16085f.b(gVar, cVar2, c.f16071d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f16074c;
            cVar.f16074c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f16074c;
            d(cVar3.f16072a, cVar3.f16073b);
            cVar3 = cVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f16084e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f16069b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f16070a);
        }
        if (obj == f16086x) {
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
            Object objH = h(this);
            sb.append("SUCCESS, result=[");
            sb.append(objH == this ? "this future" : String.valueOf(objH));
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
        c cVar = this.f16088b;
        c cVar2 = c.f16071d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f16074c = cVar;
                if (f16085f.b(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f16088b;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        a aVar;
        Object obj = this.f16087a;
        if (obj != null) {
            return false;
        }
        if (f16083d) {
            aVar = new a(z4, new CancellationException("Future.cancel() was called."));
        } else {
            aVar = z4 ? a.f16066c : a.f16067d;
        }
        if (!f16085f.c(this, obj, aVar)) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f16087a;
        if (obj != null) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f16089c;
            f fVar2 = f.f16080c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                while (true) {
                    a aVar = f16085f;
                    aVar.f(fVar3, fVar);
                    if (aVar.d(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f16087a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m(fVar3);
                        break;
                    }
                    fVar = this.f16089c;
                    if (fVar == fVar2) {
                    }
                }
            }
            return f(this.f16087a);
        }
        while (nanos > 0) {
            Object obj3 = this.f16087a;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbJ = k.j("Waited ", " ", j);
        sbJ.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbJ.toString();
        if (nanos + 1000 < 0) {
            String strE = k.e(string3, " (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z4 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strE2 = strE + jConvert + " " + lowerCase;
                if (z4) {
                    strE2 = k.e(strE2, ",");
                }
                strE = k.e(strE2, " ");
            }
            if (z4) {
                strE = strE + nanos2 + " nanoseconds ";
            }
            string3 = k.e(strE, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(k.e(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(k.f(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f16087a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f16087a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void m(f fVar) {
        fVar.f16081a = null;
        while (true) {
            f fVar2 = this.f16089c;
            if (fVar2 == f.f16080c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f16082b;
                if (fVar2.f16081a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f16082b = fVar4;
                    if (fVar3.f16081a == null) {
                    }
                } else if (!f16085f.d(this, fVar2, fVar4)) {
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    public boolean p(Object obj) {
        if (obj == null) {
            obj = f16086x;
        }
        if (!f16085f.c(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    public boolean t(Throwable th) {
        th.getClass();
        if (!f16085f.c(this, null, new b(th))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String strL;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f16087a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strL = l();
            } catch (RuntimeException e7) {
                strL = "Exception thrown from implementation: " + e7.getClass();
            }
            if (strL != null && !strL.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strL);
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
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f16087a;
            if (obj2 != null) {
                return f(obj2);
            }
            f fVar = this.f16089c;
            f fVar2 = f.f16080c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    a aVar = f16085f;
                    aVar.f(fVar3, fVar);
                    if (aVar.d(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f16087a;
                            } else {
                                m(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    fVar = this.f16089c;
                } while (fVar != fVar2);
            }
            return f(this.f16087a);
        }
        throw new InterruptedException();
    }
}

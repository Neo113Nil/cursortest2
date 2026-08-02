package p000;

import com.google.common.util.concurrent.ListenableFuture;
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

/* JADX INFO: renamed from: v0 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0786v0 implements ListenableFuture {

    /* JADX INFO: renamed from: m */
    public static final boolean f7976m = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: n */
    public static final Logger f7977n = Logger.getLogger(AbstractC0786v0.class.getName());

    /* JADX INFO: renamed from: o */
    public static final hn0 f7978o;

    /* JADX INFO: renamed from: p */
    public static final Object f7979p;

    /* JADX INFO: renamed from: j */
    public volatile Object f7980j;

    /* JADX INFO: renamed from: k */
    public volatile C0638r0 f7981k;

    /* JADX INFO: renamed from: l */
    public volatile C0749u0 f7982l;

    static {
        hn0 c0712t0;
        try {
            c0712t0 = new C0675s0(AtomicReferenceFieldUpdater.newUpdater(C0749u0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0749u0.class, C0749u0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0786v0.class, C0749u0.class, "l"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0786v0.class, C0638r0.class, "k"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0786v0.class, Object.class, "j"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0712t0 = new C0712t0();
        }
        f7978o = c0712t0;
        if (th != null) {
            f7977n.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7979p = new Object();
    }

    /* JADX INFO: renamed from: d */
    public static void m5012d(AbstractC0786v0 abstractC0786v0) {
        C0749u0 c0749u0;
        C0638r0 c0638r0;
        C0638r0 c0638r1;
        C0638r0 c0638r2;
        do {
            c0749u0 = abstractC0786v0.f7982l;
        } while (!f7978o.mo2326f(abstractC0786v0, c0749u0, C0749u0.f7632c));
        while (true) {
            c0638r0 = null;
            if (c0749u0 == null) {
                break;
            }
            Thread thread = c0749u0.f7633a;
            if (thread != null) {
                c0749u0.f7633a = null;
                LockSupport.unpark(thread);
            }
            c0749u0 = c0749u0.f7634b;
        }
        abstractC0786v0.mo3070b();
        do {
            c0638r1 = abstractC0786v0.f7981k;
        } while (!f7978o.mo2324d(abstractC0786v0, c0638r1, C0638r0.f6643d));
        while (true) {
            c0638r2 = c0638r0;
            c0638r0 = c0638r1;
            if (c0638r0 == null) {
                break;
            }
            c0638r1 = c0638r0.f6646c;
            c0638r0.f6646c = c0638r2;
        }
        while (c0638r2 != null) {
            C0638r0 c0638r3 = c0638r2.f6646c;
            m5013e(c0638r2.f6644a, c0638r2.f6645b);
            c0638r2 = c0638r3;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m5013e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f7977n.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Object m5014f(Object obj) throws ExecutionException {
        if (obj instanceof C0564p0) {
            Throwable th = ((C0564p0) obj).f5943b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0601q0) {
            throw new ExecutionException(((C0601q0) obj).f6302a);
        }
        if (obj == f7979p) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public static Object m5015g(AbstractC0786v0 abstractC0786v0) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC0786v0.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m5016a(StringBuilder sb) {
        try {
            Object objM5015g = m5015g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM5015g == this ? "this future" : String.valueOf(objM5015g));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* JADX INFO: renamed from: c */
    public final void mo995c(Runnable runnable, Executor executor) {
        C0638r0 c0638r0 = this.f7981k;
        C0638r0 c0638r1 = C0638r0.f6643d;
        if (c0638r0 != c0638r1) {
            C0638r0 c0638r2 = new C0638r0(runnable, executor);
            do {
                c0638r2.f6646c = c0638r0;
                if (f7978o.mo2324d(this, c0638r0, c0638r2)) {
                    return;
                } else {
                    c0638r0 = this.f7981k;
                }
            } while (c0638r0 != c0638r1);
        }
        m5013e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C0564p0 c0564p0;
        Object obj = this.f7980j;
        if (obj == null) {
            if (f7976m) {
                c0564p0 = new C0564p0(new CancellationException("Future.cancel() was called."), z);
            } else {
                c0564p0 = z ? C0564p0.f5940c : C0564p0.f5941d;
            }
            if (f7978o.mo2325e(this, obj, c0564p0)) {
                m5012d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C0749u0 c0749u0 = C0749u0.f7632c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f7980j;
        if (obj != null) {
            return m5014f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0749u0 c0749u1 = this.f7982l;
            if (c0749u1 != c0749u0) {
                C0749u0 c0749u2 = new C0749u0();
                while (true) {
                    hn0 hn0Var = f7978o;
                    hn0Var.mo2327l(c0749u2, c0749u1);
                    if (hn0Var.mo2326f(this, c0749u1, c0749u2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m5017i(c0749u2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f7980j;
                            if (obj2 != null) {
                                return m5014f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m5017i(c0749u2);
                        break;
                    }
                    c0749u1 = this.f7982l;
                    if (c0749u1 == c0749u0) {
                    }
                }
            }
            return m5014f(this.f7980j);
        }
        while (nanos > 0) {
            Object obj3 = this.f7980j;
            if (obj3 != null) {
                return m5014f(obj3);
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
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public String mo2595h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: i */
    public final void m5017i(C0749u0 c0749u0) {
        c0749u0.f7633a = null;
        while (true) {
            C0749u0 c0749u1 = this.f7982l;
            if (c0749u1 == C0749u0.f7632c) {
                return;
            }
            C0749u0 c0749u2 = null;
            while (c0749u1 != null) {
                C0749u0 c0749u3 = c0749u1.f7634b;
                if (c0749u1.f7633a != null) {
                    c0749u2 = c0749u1;
                } else if (c0749u2 != null) {
                    c0749u2.f7634b = c0749u3;
                    if (c0749u2.f7633a == null) {
                    }
                } else if (!f7978o.mo2326f(this, c0749u1, c0749u3)) {
                }
                c0749u1 = c0749u3;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7980j instanceof C0564p0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7980j != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m5018j(Object obj) {
        if (obj == null) {
            obj = f7979p;
        }
        if (!f7978o.mo2325e(this, null, obj)) {
            return false;
        }
        m5012d(this);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo4867k(Throwable th) {
        th.getClass();
        if (!f7978o.mo2325e(this, null, new C0601q0(th))) {
            return false;
        }
        m5012d(this);
        return true;
    }

    public final String toString() {
        String strMo2595h;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f7980j instanceof C0564p0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m5016a(sb);
        } else {
            try {
                strMo2595h = mo2595h();
            } catch (RuntimeException e) {
                strMo2595h = "Exception thrown from implementation: " + e.getClass();
            }
            if (strMo2595h != null && !strMo2595h.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strMo2595h);
                sb.append("]");
            } else if (isDone()) {
                m5016a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public void mo3070b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C0749u0 c0749u0 = C0749u0.f7632c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7980j;
            if (obj2 != null) {
                return m5014f(obj2);
            }
            C0749u0 c0749u1 = this.f7982l;
            if (c0749u1 != c0749u0) {
                C0749u0 c0749u2 = new C0749u0();
                do {
                    hn0 hn0Var = f7978o;
                    hn0Var.mo2327l(c0749u2, c0749u1);
                    if (hn0Var.mo2326f(this, c0749u1, c0749u2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7980j;
                            } else {
                                m5017i(c0749u2);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m5014f(obj);
                    }
                    c0749u1 = this.f7982l;
                } while (c0749u1 != c0749u0);
            }
            return m5014f(this.f7980j);
        }
        throw new InterruptedException();
    }
}

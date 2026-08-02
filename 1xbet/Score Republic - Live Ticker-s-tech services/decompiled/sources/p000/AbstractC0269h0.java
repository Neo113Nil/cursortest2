package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
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

/* JADX INFO: renamed from: h0 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0269h0 implements ListenableFuture {

    /* JADX INFO: renamed from: m */
    public static final boolean f2973m;

    /* JADX INFO: renamed from: n */
    public static final Logger f2974n;

    /* JADX INFO: renamed from: o */
    public static final kd0 f2975o;

    /* JADX INFO: renamed from: p */
    public static final Object f2976p;

    /* JADX INFO: renamed from: j */
    public volatile Object f2977j;

    /* JADX INFO: renamed from: k */
    public volatile C0785v f2978k;

    /* JADX INFO: renamed from: l */
    public volatile C0231g0 f2979l;

    static {
        boolean z;
        Throwable th;
        kd0 c0896y;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f2973m = z;
        f2974n = Logger.getLogger(AbstractC0269h0.class.getName());
        Throwable th2 = null;
        try {
            c0896y = new C0194f0();
            th = null;
        } catch (Error | RuntimeException e) {
            th = e;
            try {
                c0896y = new C0822w(AtomicReferenceFieldUpdater.newUpdater(C0231g0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0231g0.class, C0231g0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0269h0.class, C0231g0.class, "l"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0269h0.class, C0785v.class, "k"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0269h0.class, Object.class, "j"));
            } catch (Error | RuntimeException e2) {
                th2 = e2;
                c0896y = new C0896y();
            }
        }
        f2975o = c0896y;
        if (th2 != null) {
            Logger logger = f2974n;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        f2976p = new Object();
    }

    /* JADX INFO: renamed from: e */
    public static void m2170e(AbstractC0269h0 abstractC0269h0, boolean z) {
        C0785v c0785v = null;
        while (true) {
            for (C0231g0 c0231g0Mo1544h = f2975o.mo1544h(abstractC0269h0); c0231g0Mo1544h != null; c0231g0Mo1544h = c0231g0Mo1544h.f2568b) {
                Thread thread = c0231g0Mo1544h.f2567a;
                if (thread != null) {
                    c0231g0Mo1544h.f2567a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                abstractC0269h0.mo932i();
                z = false;
            }
            abstractC0269h0.mo549b();
            C0785v c0785v2 = c0785v;
            C0785v c0785vMo1543g = f2975o.mo1543g(abstractC0269h0);
            C0785v c0785v3 = c0785v2;
            while (c0785vMo1543g != null) {
                C0785v c0785v4 = c0785vMo1543g.f7975c;
                c0785vMo1543g.f7975c = c0785v3;
                c0785v3 = c0785vMo1543g;
                c0785vMo1543g = c0785v4;
            }
            while (c0785v3 != null) {
                c0785v = c0785v3.f7975c;
                Runnable runnable = c0785v3.f7973a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC0859x) {
                    RunnableC0859x runnableC0859x = (RunnableC0859x) runnable;
                    abstractC0269h0 = runnableC0859x.f8725j;
                    if (abstractC0269h0.f2977j == runnableC0859x) {
                        if (f2975o.mo1541d(abstractC0269h0, runnableC0859x, m2173h(runnableC0859x.f8726k))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c0785v3.f7974b;
                    Objects.requireNonNull(executor);
                    m2171f(runnable, executor);
                }
                c0785v3 = c0785v;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2171f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f2974n.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object m2172g(Object obj) throws ExecutionException {
        if (obj instanceof C0674s) {
            Throwable th = ((C0674s) obj).f6996b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0748u) {
            throw new ExecutionException(((C0748u) obj).f7631a);
        }
        if (obj == f2976p) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public static Object m2173h(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thM2180o;
        if (listenableFuture instanceof InterfaceC0933z) {
            Object c0674s = ((AbstractC0269h0) listenableFuture).f2977j;
            if (c0674s instanceof C0674s) {
                C0674s c0674s2 = (C0674s) c0674s;
                if (c0674s2.f6995a) {
                    c0674s = c0674s2.f6996b != null ? new C0674s(c0674s2.f6996b, false) : C0674s.f6994d;
                }
            }
            Objects.requireNonNull(c0674s);
            return c0674s;
        }
        if ((listenableFuture instanceof AbstractC0269h0) && (thM2180o = ((AbstractC0269h0) listenableFuture).m2180o()) != null) {
            return new C0748u(thM2180o);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!f2973m) && zIsCancelled) {
            C0674s c0674s3 = C0674s.f6994d;
            Objects.requireNonNull(c0674s3);
            return c0674s3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | RuntimeException e) {
                return new C0748u(e);
            } catch (CancellationException e2) {
                if (zIsCancelled) {
                    return new C0674s(e2, false);
                }
                return new C0748u(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
            } catch (ExecutionException e3) {
                if (!zIsCancelled) {
                    return new C0748u(e3.getCause());
                }
                return new C0674s(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e3), false);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? f2976p : obj;
        }
        return new C0674s(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture), false);
    }

    /* JADX INFO: renamed from: a */
    public final void m2174a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        m2175d(sb, obj);
        sb.append("]");
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* JADX INFO: renamed from: c */
    public void mo995c(Runnable runnable, Executor executor) {
        C0785v c0785v;
        C0785v c0785v2 = C0785v.f7972d;
        a90.m127k(executor, "Executor was null.");
        if (!isDone() && (c0785v = this.f2978k) != c0785v2) {
            C0785v c0785v3 = new C0785v(runnable, executor);
            do {
                c0785v3.f7975c = c0785v;
                if (f2975o.mo1540c(this, c0785v, c0785v3)) {
                    return;
                } else {
                    c0785v = this.f2978k;
                }
            } while (c0785v != c0785v2);
        }
        m2171f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C0674s c0674s;
        Object obj = this.f2977j;
        if (!(obj == null) && !(obj instanceof RunnableC0859x)) {
            return false;
        }
        if (f2973m) {
            c0674s = new C0674s(new CancellationException("Future.cancel() was called."), z);
        } else {
            c0674s = z ? C0674s.f6993c : C0674s.f6994d;
            Objects.requireNonNull(c0674s);
        }
        boolean z2 = false;
        while (true) {
            if (f2975o.mo1541d(this, obj, c0674s)) {
                m2170e(this, z);
                if (obj instanceof RunnableC0859x) {
                    ListenableFuture listenableFuture = ((RunnableC0859x) obj).f8726k;
                    if (listenableFuture instanceof InterfaceC0933z) {
                        this = (AbstractC0269h0) listenableFuture;
                        obj = this.f2977j;
                        if ((obj == null) | (obj instanceof RunnableC0859x)) {
                            z2 = true;
                        }
                    } else {
                        listenableFuture.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f2977j;
            if (!(obj instanceof RunnableC0859x)) {
                return z2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2175d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        C0231g0 c0231g0 = C0231g0.f2566c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f2977j;
        if ((obj != null) && (!(obj instanceof RunnableC0859x))) {
            return m2172g(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0231g0 c0231g1 = this.f2979l;
            if (c0231g1 != c0231g0) {
                C0231g0 c0231g2 = new C0231g0();
                z = true;
                while (true) {
                    kd0 kd0Var = f2975o;
                    kd0Var.mo1545k(c0231g2, c0231g1);
                    if (kd0Var.mo1542e(this, c0231g1, c0231g2)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m2176k(c0231g2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2977j;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC0859x))) {
                                return m2172g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m2176k(c0231g2);
                        break;
                    }
                    long j4 = j3;
                    c0231g1 = this.f2979l;
                    if (c0231g1 != c0231g0) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.f2977j;
            Objects.requireNonNull(obj3);
            return m2172g(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.f2977j;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof RunnableC0859x))) {
                return m2172g(obj4);
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
        if (nanos + 1000 < j2) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z2) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f2977j instanceof C0674s;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f2977j;
        return (!(obj instanceof RunnableC0859x)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public String mo550j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: k */
    public final void m2176k(C0231g0 c0231g0) {
        c0231g0.f2567a = null;
        while (true) {
            C0231g0 c0231g1 = this.f2979l;
            if (c0231g1 == C0231g0.f2566c) {
                return;
            }
            C0231g0 c0231g2 = null;
            while (c0231g1 != null) {
                C0231g0 c0231g3 = c0231g1.f2568b;
                if (c0231g1.f2567a != null) {
                    c0231g2 = c0231g1;
                } else if (c0231g2 != null) {
                    c0231g2.f2568b = c0231g3;
                    if (c0231g2.f2567a == null) {
                    }
                } else if (!f2975o.mo1542e(this, c0231g1, c0231g3)) {
                }
                c0231g1 = c0231g3;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m2177l(Object obj) {
        if (obj == null) {
            obj = f2976p;
        }
        if (!f2975o.mo1541d(this, null, obj)) {
            return false;
        }
        m2170e(this, false);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m2178m(Throwable th) {
        th.getClass();
        if (!f2975o.mo1541d(this, null, new C0748u(th))) {
            return false;
        }
        m2170e(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX INFO: renamed from: n */
    public boolean m2179n(ListenableFuture listenableFuture) {
        C0748u c0748u;
        listenableFuture.getClass();
        Object obj = this.f2977j;
        if (obj != null) {
            if (obj instanceof C0674s) {
                listenableFuture.cancel(((C0674s) obj).f6995a);
            }
        } else if (listenableFuture.isDone()) {
            if (f2975o.mo1541d(this, null, m2173h(listenableFuture))) {
                m2170e(this, false);
                return true;
            }
        } else {
            RunnableC0859x runnableC0859x = new RunnableC0859x(this, listenableFuture);
            if (f2975o.mo1541d(this, null, runnableC0859x)) {
                try {
                    listenableFuture.mo995c(runnableC0859x, EnumC0113ct.f1449j);
                    return true;
                } catch (Error | RuntimeException e) {
                    try {
                        c0748u = new C0748u(e);
                    } catch (Error | RuntimeException unused) {
                        c0748u = C0748u.f7630b;
                    }
                    f2975o.mo1541d(this, runnableC0859x, c0748u);
                    return true;
                }
            }
            obj = this.f2977j;
            if (obj instanceof C0674s) {
                listenableFuture.cancel(((C0674s) obj).f6995a);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final Throwable m2180o() {
        if (!(this instanceof InterfaceC0933z)) {
            return null;
        }
        Object obj = this.f2977j;
        if (obj instanceof C0748u) {
            return ((C0748u) obj).f7631a;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2181p() {
        Object obj = this.f2977j;
        return (obj instanceof C0674s) && ((C0674s) obj).f6995a;
    }

    public String toString() {
        String strMo550j;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m2174a(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f2977j;
            if (obj instanceof RunnableC0859x) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((RunnableC0859x) obj).f8726k;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (RuntimeException | StackOverflowError e) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strMo550j = mo550j();
                    if (gw0.m2161a(strMo550j)) {
                        strMo550j = null;
                    }
                } catch (RuntimeException | StackOverflowError e2) {
                    strMo550j = "Exception thrown from implementation: " + e2.getClass();
                }
                if (strMo550j != null) {
                    sb.append(", info=[");
                    sb.append(strMo550j);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m2174a(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public void mo549b() {
    }

    /* JADX INFO: renamed from: i */
    public void mo932i() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        C0231g0 c0231g0 = C0231g0.f2566c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2977j;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC0859x))) {
                return m2172g(obj2);
            }
            C0231g0 c0231g1 = this.f2979l;
            if (c0231g1 != c0231g0) {
                C0231g0 c0231g2 = new C0231g0();
                do {
                    kd0 kd0Var = f2975o;
                    kd0Var.mo1545k(c0231g2, c0231g1);
                    if (kd0Var.mo1542e(this, c0231g1, c0231g2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2977j;
                            } else {
                                m2176k(c0231g2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC0859x))));
                        return m2172g(obj);
                    }
                    c0231g1 = this.f2979l;
                } while (c0231g1 != c0231g0);
            }
            Object obj3 = this.f2977j;
            Objects.requireNonNull(obj3);
            return m2172g(obj3);
        }
        throw new InterruptedException();
    }
}

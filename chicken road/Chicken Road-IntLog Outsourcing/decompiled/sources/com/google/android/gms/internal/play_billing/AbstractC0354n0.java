package com.google.android.gms.internal.play_billing;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
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

/* renamed from: com.google.android.gms.internal.play_billing.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0354n0 extends K0 implements InterfaceFutureC0386y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5212d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0383x0 f5213e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0325d1 f5214f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f5215g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5216a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0330f0 f5217b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0351m0 f5218c;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        AbstractC0325d1 c0339i0;
        int i2 = 7;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f5212d = z;
        f5213e = new C0383x0(AbstractC0354n0.class);
        try {
            c0339i0 = new C0348l0(i2);
            th2 = null;
            th = null;
        } catch (Error | Exception e3) {
            try {
                th = null;
                th2 = e3;
                c0339i0 = new C0333g0(AtomicReferenceFieldUpdater.newUpdater(C0351m0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0351m0.class, C0351m0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0354n0.class, C0351m0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0354n0.class, C0330f0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0354n0.class, Object.class, "a"));
            } catch (Error | Exception e6) {
                th = e6;
                th2 = e3;
                c0339i0 = new C0339i0(i2);
            }
        }
        f5214f = c0339i0;
        if (th != null) {
            C0383x0 c0383x0 = f5213e;
            Logger a6 = c0383x0.a();
            Level level = Level.SEVERE;
            a6.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            c0383x0.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f5215g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(InterfaceFutureC0386y0 interfaceFutureC0386y0) {
        Throwable th;
        if (interfaceFutureC0386y0 instanceof InterfaceC0342j0) {
            Object obj = ((AbstractC0354n0) interfaceFutureC0386y0).f5216a;
            if (obj instanceof C0324d0) {
                C0324d0 c0324d0 = (C0324d0) obj;
                if (c0324d0.f5165a) {
                    RuntimeException runtimeException = c0324d0.f5166b;
                    obj = runtimeException != null ? new C0324d0(false, runtimeException) : C0324d0.f5164d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if (interfaceFutureC0386y0 instanceof K0) {
            AbstractC0354n0 abstractC0354n0 = (AbstractC0354n0) ((K0) interfaceFutureC0386y0);
            abstractC0354n0.getClass();
            if (abstractC0354n0 instanceof InterfaceC0342j0) {
                Object obj2 = abstractC0354n0.f5216a;
                if (obj2 instanceof C0327e0) {
                    th = ((C0327e0) obj2).f5175a;
                    if (th != null) {
                        return new C0327e0(th);
                    }
                }
            }
            th = null;
            if (th != null) {
            }
        }
        boolean isCancelled = interfaceFutureC0386y0.isCancelled();
        if ((!f5212d) && isCancelled) {
            C0324d0 c0324d02 = C0324d0.f5164d;
            Objects.requireNonNull(c0324d02);
            return c0324d02;
        }
        try {
            Object g6 = g(interfaceFutureC0386y0);
            return isCancelled ? new C0324d0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC0386y0)))) : g6 == null ? f5215g : g6;
        } catch (Error e3) {
            e = e3;
            return new C0327e0(e);
        } catch (CancellationException e6) {
            return !isCancelled ? new C0327e0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC0386y0)), e6)) : new C0324d0(false, e6);
        } catch (ExecutionException e7) {
            return isCancelled ? new C0324d0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC0386y0)), e7)) : new C0327e0(e7.getCause());
        } catch (Exception e8) {
            e = e8;
            return new C0327e0(e);
        }
    }

    public static Object g(InterfaceFutureC0386y0 interfaceFutureC0386y0) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = interfaceFutureC0386y0.get();
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

    public static void i(AbstractC0354n0 abstractC0354n0) {
        C0330f0 c0330f0;
        C0330f0 c0330f02 = null;
        while (true) {
            for (C0351m0 r5 = f5214f.r(abstractC0354n0); r5 != null; r5 = r5.f5210b) {
                Thread thread = r5.f5209a;
                if (thread != null) {
                    r5.f5209a = null;
                    LockSupport.unpark(thread);
                }
            }
            abstractC0354n0.d();
            C0330f0 c0330f03 = c0330f02;
            C0330f0 e3 = f5214f.e(abstractC0354n0);
            C0330f0 c0330f04 = c0330f03;
            while (e3 != null) {
                C0330f0 c0330f05 = e3.f5181c;
                e3.f5181c = c0330f04;
                c0330f04 = e3;
                e3 = c0330f05;
            }
            while (c0330f04 != null) {
                Runnable runnable = c0330f04.f5179a;
                c0330f0 = c0330f04.f5181c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC0336h0) {
                    RunnableC0336h0 runnableC0336h0 = (RunnableC0336h0) runnable;
                    abstractC0354n0 = runnableC0336h0.f5190a;
                    if (abstractC0354n0.f5216a == runnableC0336h0) {
                        if (f5214f.L(abstractC0354n0, runnableC0336h0, f(runnableC0336h0.f5191b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c0330f04.f5180b;
                    Objects.requireNonNull(executor);
                    j(runnable, executor);
                }
                c0330f04 = c0330f0;
            }
            return;
            c0330f02 = c0330f0;
        }
    }

    public static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e3) {
            f5213e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e3);
        }
    }

    public static final Object l(Object obj) {
        if (obj instanceof C0324d0) {
            RuntimeException runtimeException = ((C0324d0) obj).f5166b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof C0327e0) {
            throw new ExecutionException(((C0327e0) obj).f5175a);
        }
        if (obj == f5215g) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC0386y0
    public final void b(Runnable runnable, Executor executor) {
        C0330f0 c0330f0;
        C0330f0 c0330f02;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (c0330f0 = this.f5217b) != (c0330f02 = C0330f0.f5178d)) {
            C0330f0 c0330f03 = new C0330f0(runnable, executor);
            do {
                c0330f03.f5181c = c0330f0;
                if (f5214f.H(this, c0330f0, c0330f03)) {
                    return;
                } else {
                    c0330f0 = this.f5217b;
                }
            } while (c0330f0 != c0330f02);
        }
        j(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z) {
        C0324d0 c0324d0;
        Object obj = this.f5216a;
        if (!(obj instanceof RunnableC0336h0) && !(obj == null)) {
            return false;
        }
        if (f5212d) {
            c0324d0 = new C0324d0(z, new CancellationException("Future.cancel() was called."));
        } else {
            c0324d0 = z ? C0324d0.f5163c : C0324d0.f5164d;
            Objects.requireNonNull(c0324d0);
        }
        AbstractC0354n0 abstractC0354n0 = this;
        boolean z5 = false;
        while (true) {
            if (f5214f.L(abstractC0354n0, obj, c0324d0)) {
                i(abstractC0354n0);
                if (!(obj instanceof RunnableC0336h0)) {
                    break;
                }
                InterfaceFutureC0386y0 interfaceFutureC0386y0 = ((RunnableC0336h0) obj).f5191b;
                if (!(interfaceFutureC0386y0 instanceof InterfaceC0342j0)) {
                    interfaceFutureC0386y0.cancel(z);
                    break;
                }
                abstractC0354n0 = (AbstractC0354n0) interfaceFutureC0386y0;
                obj = abstractC0354n0.f5216a;
                if (!(obj == null) && !(obj instanceof RunnableC0336h0)) {
                    break;
                }
                z5 = true;
            } else {
                obj = abstractC0354n0.f5216a;
                if (!(obj instanceof RunnableC0336h0)) {
                    return z5;
                }
            }
        }
    }

    public void d() {
    }

    public final void e(Throwable th) {
        if (f5214f.L(this, null, new C0327e0(th))) {
            i(this);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f5216a;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC0336h0))) {
            return l(obj2);
        }
        C0351m0 c0351m0 = this.f5218c;
        C0351m0 c0351m02 = C0351m0.f5208c;
        if (c0351m0 != c0351m02) {
            C0351m0 c0351m03 = new C0351m0();
            do {
                AbstractC0325d1 abstractC0325d1 = f5214f;
                abstractC0325d1.z(c0351m03, c0351m0);
                if (abstractC0325d1.N(this, c0351m0, c0351m03)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            k(c0351m03);
                            throw new InterruptedException();
                        }
                        obj = this.f5216a;
                    } while (!((obj != null) & (!(obj instanceof RunnableC0336h0))));
                    return l(obj);
                }
                c0351m0 = this.f5218c;
            } while (c0351m0 != c0351m02);
        }
        Object obj3 = this.f5216a;
        Objects.requireNonNull(obj3);
        return l(obj3);
    }

    public final void h(StringBuilder sb) {
        try {
            Object g6 = g(this);
            sb.append("SUCCESS, result=[");
            if (g6 == null) {
                sb.append("null");
            } else if (g6 == this) {
                sb.append("this future");
            } else {
                sb.append(g6.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(g6)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        } catch (Exception e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5216a instanceof C0324d0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f5216a != null) & (!(r0 instanceof RunnableC0336h0));
    }

    public final void k(C0351m0 c0351m0) {
        c0351m0.f5209a = null;
        while (true) {
            C0351m0 c0351m02 = this.f5218c;
            if (c0351m02 != C0351m0.f5208c) {
                C0351m0 c0351m03 = null;
                while (c0351m02 != null) {
                    C0351m0 c0351m04 = c0351m02.f5210b;
                    if (c0351m02.f5209a != null) {
                        c0351m03 = c0351m02;
                    } else if (c0351m03 != null) {
                        c0351m03.f5210b = c0351m04;
                        if (c0351m03.f5209a == null) {
                            break;
                        }
                    } else if (!f5214f.N(this, c0351m02, c0351m04)) {
                        break;
                    }
                    c0351m02 = c0351m04;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r3.isEmpty() != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f5216a instanceof C0324d0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            h(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f5216a;
            if (obj instanceof RunnableC0336h0) {
                sb.append(", setFuture=[");
                InterfaceFutureC0386y0 interfaceFutureC0386y0 = ((RunnableC0336h0) obj).f5191b;
                try {
                    if (interfaceFutureC0386y0 == this) {
                        sb.append("this future");
                    } else {
                        sb.append(interfaceFutureC0386y0);
                    }
                } catch (Exception e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                    sb.append("]");
                    if (isDone()) {
                    }
                    sb.append("]");
                    return sb.toString();
                } catch (StackOverflowError e6) {
                    e = e6;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                    sb.append("]");
                    if (isDone()) {
                    }
                    sb.append("]");
                    return sb.toString();
                }
                sb.append("]");
            } else {
                try {
                    concat = c();
                    if (concat != null) {
                    }
                    concat = null;
                } catch (Exception | StackOverflowError e7) {
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(e7.getClass()));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                h(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b4 -> B:33:0x007d). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j2, TimeUnit timeUnit) {
        long j6;
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f5216a;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof RunnableC0336h0))) {
                return l(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C0351m0 c0351m0 = this.f5218c;
                C0351m0 c0351m02 = C0351m0.f5208c;
                if (c0351m0 != c0351m02) {
                    C0351m0 c0351m03 = new C0351m0();
                    do {
                        AbstractC0325d1 abstractC0325d1 = f5214f;
                        abstractC0325d1.z(c0351m03, c0351m0);
                        if (abstractC0325d1.N(this, c0351m0, c0351m03)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5216a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC0336h0))) {
                                        return l(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    k(c0351m03);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            k(c0351m03);
                            j6 = 0;
                            if (nanos > j6) {
                                Object obj3 = this.f5216a;
                                if ((obj3 != null) & (!(obj3 instanceof RunnableC0336h0))) {
                                    return l(obj3);
                                }
                                if (!Thread.interrupted()) {
                                    nanos = nanoTime - System.nanoTime();
                                    j6 = 0;
                                    if (nanos > j6) {
                                    }
                                } else {
                                    throw new InterruptedException();
                                }
                            } else {
                                String abstractC0354n0 = toString();
                                String obj4 = timeUnit.toString();
                                Locale locale = Locale.ROOT;
                                String lowerCase = obj4.toLowerCase(locale);
                                String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
                                if (nanos + 1000 < 0) {
                                    String concat = str.concat(" (plus ");
                                    long j7 = -nanos;
                                    long convert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
                                    long nanos2 = j7 - timeUnit.toNanos(convert);
                                    if (convert != 0 && nanos2 <= 1000) {
                                        z = false;
                                    }
                                    if (convert > 0) {
                                        String str2 = concat + convert + " " + lowerCase;
                                        if (z) {
                                            str2 = str2.concat(StringUtils.COMMA);
                                        }
                                        concat = str2.concat(" ");
                                    }
                                    if (z) {
                                        concat = concat + nanos2 + " nanoseconds ";
                                    }
                                    str = concat.concat("delay)");
                                }
                                if (isDone()) {
                                    throw new TimeoutException(str.concat(" but future completed as timeout expired"));
                                }
                                throw new TimeoutException(str + " for " + abstractC0354n0);
                            }
                        } else {
                            c0351m0 = this.f5218c;
                        }
                    } while (c0351m0 != c0351m02);
                }
                Object obj5 = this.f5216a;
                Objects.requireNonNull(obj5);
                return l(obj5);
            }
            j6 = 0;
            if (nanos > j6) {
            }
        } else {
            throw new InterruptedException();
        }
    }
}

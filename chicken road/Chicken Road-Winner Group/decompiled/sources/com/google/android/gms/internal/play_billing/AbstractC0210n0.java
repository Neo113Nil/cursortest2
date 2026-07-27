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
public abstract class AbstractC0210n0 extends K0 implements InterfaceFutureC0242y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2779d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0239x0 f2780e;
    public static final AbstractC0181d1 f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2781g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2782a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0186f0 f2783b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0207m0 f2784c;

    static {
        boolean z3;
        AbstractC0181d1 c0195i0;
        Throwable th;
        int i3 = 7;
        try {
            z3 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z3 = false;
        }
        f2779d = z3;
        f2780e = new C0239x0(AbstractC0210n0.class);
        Throwable th2 = null;
        try {
            c0195i0 = new C0204l0(i3);
            th = null;
        } catch (Error | Exception e3) {
            try {
                th = e3;
                c0195i0 = new C0189g0(AtomicReferenceFieldUpdater.newUpdater(C0207m0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0207m0.class, C0207m0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0210n0.class, C0207m0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0210n0.class, C0186f0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0210n0.class, Object.class, "a"));
            } catch (Error | Exception e4) {
                th2 = e4;
                c0195i0 = new C0195i0(i3);
                th = e3;
            }
        }
        f = c0195i0;
        if (th2 != null) {
            C0239x0 c0239x0 = f2780e;
            Logger a3 = c0239x0.a();
            Level level = Level.SEVERE;
            a3.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            c0239x0.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f2781g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object e(InterfaceFutureC0242y0 interfaceFutureC0242y0) {
        Throwable th;
        if (interfaceFutureC0242y0 instanceof InterfaceC0198j0) {
            Object obj = ((AbstractC0210n0) interfaceFutureC0242y0).f2782a;
            if (obj instanceof C0177c0) {
                C0177c0 c0177c0 = (C0177c0) obj;
                if (c0177c0.f2729a) {
                    RuntimeException runtimeException = c0177c0.f2730b;
                    obj = runtimeException != null ? new C0177c0(false, runtimeException) : C0177c0.f2728d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if (interfaceFutureC0242y0 instanceof K0) {
            AbstractC0210n0 abstractC0210n0 = (AbstractC0210n0) ((K0) interfaceFutureC0242y0);
            abstractC0210n0.getClass();
            if (abstractC0210n0 instanceof InterfaceC0198j0) {
                Object obj2 = abstractC0210n0.f2782a;
                if (obj2 instanceof C0183e0) {
                    th = ((C0183e0) obj2).f2744a;
                    if (th != null) {
                        return new C0183e0(th);
                    }
                }
            }
            th = null;
            if (th != null) {
            }
        }
        boolean isCancelled = interfaceFutureC0242y0.isCancelled();
        if ((!f2779d) && isCancelled) {
            C0177c0 c0177c02 = C0177c0.f2728d;
            Objects.requireNonNull(c0177c02);
            return c0177c02;
        }
        try {
            try {
                try {
                    Object f3 = f(interfaceFutureC0242y0);
                    return isCancelled ? new C0177c0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC0242y0)))) : f3 == null ? f2781g : f3;
                } catch (Error | Exception e3) {
                    e = e3;
                    return new C0183e0(e);
                }
            } catch (Error e4) {
                e = e4;
                return new C0183e0(e);
            }
        } catch (CancellationException e5) {
            return !isCancelled ? new C0183e0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC0242y0)), e5)) : new C0177c0(false, e5);
        } catch (ExecutionException e6) {
            return isCancelled ? new C0177c0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC0242y0)), e6)) : new C0183e0(e6.getCause());
        }
    }

    public static Object f(InterfaceFutureC0242y0 interfaceFutureC0242y0) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = interfaceFutureC0242y0.get();
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

    public static void h(AbstractC0210n0 abstractC0210n0) {
        C0186f0 c0186f0;
        C0186f0 c0186f02 = null;
        while (true) {
            for (C0207m0 o3 = f.o(abstractC0210n0); o3 != null; o3 = o3.f2777b) {
                Thread thread = o3.f2776a;
                if (thread != null) {
                    o3.f2776a = null;
                    LockSupport.unpark(thread);
                }
            }
            abstractC0210n0.c();
            C0186f0 c0186f03 = c0186f02;
            C0186f0 d3 = f.d(abstractC0210n0);
            C0186f0 c0186f04 = c0186f03;
            while (d3 != null) {
                C0186f0 c0186f05 = d3.f2750c;
                d3.f2750c = c0186f04;
                c0186f04 = d3;
                d3 = c0186f05;
            }
            while (c0186f04 != null) {
                Runnable runnable = c0186f04.f2748a;
                c0186f0 = c0186f04.f2750c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC0192h0) {
                    RunnableC0192h0 runnableC0192h0 = (RunnableC0192h0) runnable;
                    abstractC0210n0 = runnableC0192h0.f2758a;
                    if (abstractC0210n0.f2782a == runnableC0192h0) {
                        if (f.D(abstractC0210n0, runnableC0192h0, e(runnableC0192h0.f2759b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c0186f04.f2749b;
                    Objects.requireNonNull(executor);
                    i(runnable, executor);
                }
                c0186f04 = c0186f0;
            }
            return;
            c0186f02 = c0186f0;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e3) {
            f2780e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e3);
        }
    }

    public static final Object k(Object obj) {
        if (obj instanceof C0177c0) {
            RuntimeException runtimeException = ((C0177c0) obj).f2730b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof C0183e0) {
            throw new ExecutionException(((C0183e0) obj).f2744a);
        }
        if (obj == f2781g) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC0242y0
    public final void a(Runnable runnable, Executor executor) {
        C0186f0 c0186f0;
        C0186f0 c0186f02;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (c0186f0 = this.f2783b) != (c0186f02 = C0186f0.f2747d)) {
            C0186f0 c0186f03 = new C0186f0(runnable, executor);
            do {
                c0186f03.f2750c = c0186f0;
                if (f.z(this, c0186f0, c0186f03)) {
                    return;
                } else {
                    c0186f0 = this.f2783b;
                }
            } while (c0186f0 != c0186f02);
        }
        i(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public void c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z3) {
        C0177c0 c0177c0;
        Object obj = this.f2782a;
        if (!(obj instanceof RunnableC0192h0) && !(obj == null)) {
            return false;
        }
        if (f2779d) {
            c0177c0 = new C0177c0(z3, new CancellationException("Future.cancel() was called."));
        } else {
            c0177c0 = z3 ? C0177c0.f2727c : C0177c0.f2728d;
            Objects.requireNonNull(c0177c0);
        }
        AbstractC0210n0 abstractC0210n0 = this;
        boolean z4 = false;
        while (true) {
            if (f.D(abstractC0210n0, obj, c0177c0)) {
                h(abstractC0210n0);
                if (!(obj instanceof RunnableC0192h0)) {
                    break;
                }
                InterfaceFutureC0242y0 interfaceFutureC0242y0 = ((RunnableC0192h0) obj).f2759b;
                if (!(interfaceFutureC0242y0 instanceof InterfaceC0198j0)) {
                    interfaceFutureC0242y0.cancel(z3);
                    break;
                }
                abstractC0210n0 = (AbstractC0210n0) interfaceFutureC0242y0;
                obj = abstractC0210n0.f2782a;
                if (!(obj == null) && !(obj instanceof RunnableC0192h0)) {
                    break;
                }
                z4 = true;
            } else {
                obj = abstractC0210n0.f2782a;
                if (!(obj instanceof RunnableC0192h0)) {
                    return z4;
                }
            }
        }
    }

    public final void d(Throwable th) {
        if (f.D(this, null, new C0183e0(th))) {
            h(this);
        }
    }

    public final void g(StringBuilder sb) {
        try {
            Object f3 = f(this);
            sb.append("SUCCESS, result=[");
            if (f3 == null) {
                sb.append("null");
            } else if (f3 == this) {
                sb.append("this future");
            } else {
                sb.append(f3.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(f3)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        } catch (Exception e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f2782a;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC0192h0))) {
            return k(obj2);
        }
        C0207m0 c0207m0 = this.f2784c;
        C0207m0 c0207m02 = C0207m0.f2775c;
        if (c0207m0 != c0207m02) {
            C0207m0 c0207m03 = new C0207m0();
            do {
                AbstractC0181d1 abstractC0181d1 = f;
                abstractC0181d1.s(c0207m03, c0207m0);
                if (abstractC0181d1.F(this, c0207m0, c0207m03)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            j(c0207m03);
                            throw new InterruptedException();
                        }
                        obj = this.f2782a;
                    } while (!((obj != null) & (!(obj instanceof RunnableC0192h0))));
                    return k(obj);
                }
                c0207m0 = this.f2784c;
            } while (c0207m0 != c0207m02);
        }
        Object obj3 = this.f2782a;
        Objects.requireNonNull(obj3);
        return k(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2782a instanceof C0177c0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f2782a != null) & (!(r0 instanceof RunnableC0192h0));
    }

    public final void j(C0207m0 c0207m0) {
        c0207m0.f2776a = null;
        while (true) {
            C0207m0 c0207m02 = this.f2784c;
            if (c0207m02 != C0207m0.f2775c) {
                C0207m0 c0207m03 = null;
                while (c0207m02 != null) {
                    C0207m0 c0207m04 = c0207m02.f2777b;
                    if (c0207m02.f2776a != null) {
                        c0207m03 = c0207m02;
                    } else if (c0207m03 != null) {
                        c0207m03.f2777b = c0207m04;
                        if (c0207m03.f2776a == null) {
                            break;
                        }
                    } else if (!f.F(this, c0207m02, c0207m04)) {
                        break;
                    }
                    c0207m02 = c0207m04;
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
        if (this.f2782a instanceof C0177c0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            g(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f2782a;
            if (obj instanceof RunnableC0192h0) {
                sb.append(", setFuture=[");
                InterfaceFutureC0242y0 interfaceFutureC0242y0 = ((RunnableC0192h0) obj).f2759b;
                try {
                    if (interfaceFutureC0242y0 == this) {
                        sb.append("this future");
                    } else {
                        sb.append(interfaceFutureC0242y0);
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
                } catch (StackOverflowError e4) {
                    e = e4;
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
                    concat = b();
                    if (concat != null) {
                    }
                    concat = null;
                } catch (Exception | StackOverflowError e5) {
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(e5.getClass()));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                g(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        boolean z3;
        long j4;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f2782a;
            if ((obj != null) & (!(obj instanceof RunnableC0192h0))) {
                return k(obj);
            }
            long j5 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C0207m0 c0207m0 = this.f2784c;
                C0207m0 c0207m02 = C0207m0.f2775c;
                if (c0207m0 != c0207m02) {
                    C0207m0 c0207m03 = new C0207m0();
                    z3 = true;
                    while (true) {
                        AbstractC0181d1 abstractC0181d1 = f;
                        abstractC0181d1.s(c0207m03, c0207m0);
                        if (abstractC0181d1.F(this, c0207m0, c0207m03)) {
                            j4 = j5;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f2782a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC0192h0))) {
                                        return k(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    j(c0207m03);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            j(c0207m03);
                        } else {
                            long j6 = j5;
                            c0207m0 = this.f2784c;
                            if (c0207m0 == c0207m02) {
                                break;
                            }
                            j5 = j6;
                        }
                    }
                }
                Object obj3 = this.f2782a;
                Objects.requireNonNull(obj3);
                return k(obj3);
            }
            z3 = true;
            j4 = 0;
            while (nanos > j4) {
                Object obj4 = this.f2782a;
                if ((obj4 != null ? z3 : false) & (!(obj4 instanceof RunnableC0192h0))) {
                    return k(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC0210n0 = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j4) {
                String concat = str.concat(" (plus ");
                long j7 = -nanos;
                long convert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
                long nanos2 = j7 - timeUnit.toNanos(convert);
                if (convert != j4 && nanos2 <= 1000) {
                    z3 = false;
                }
                if (convert > j4) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z3) {
                        str2 = str2.concat(StringUtils.COMMA);
                    }
                    concat = str2.concat(" ");
                }
                if (z3) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + abstractC0210n0);
        }
        throw new InterruptedException();
    }
}

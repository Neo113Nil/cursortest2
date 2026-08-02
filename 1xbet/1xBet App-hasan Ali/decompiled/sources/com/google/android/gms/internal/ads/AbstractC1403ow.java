package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.ow, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1403ow extends AbstractC0867cx implements E3.a {

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f14870n;

    /* renamed from: o, reason: collision with root package name */
    public static final Pw f14871o;

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC0952et f14872p;

    /* renamed from: q, reason: collision with root package name */
    public static final Object f14873q;

    /* renamed from: k, reason: collision with root package name */
    public volatile Object f14874k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C1000fw f14875l;

    /* renamed from: m, reason: collision with root package name */
    public volatile C1358nw f14876m;

    static {
        boolean z3;
        AbstractC0952et c1133iw;
        Throwable th;
        Throwable th2;
        int i = 13;
        try {
            z3 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z3 = false;
        }
        f14870n = z3;
        f14871o = new Pw(AbstractC1403ow.class);
        try {
            c1133iw = new C1313mw(i);
            th = null;
            th2 = null;
        } catch (Error | Exception e3) {
            try {
                th2 = e3;
                c1133iw = new C1045gw(AtomicReferenceFieldUpdater.newUpdater(C1358nw.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1358nw.class, C1358nw.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1403ow.class, C1358nw.class, "m"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1403ow.class, C1000fw.class, "l"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1403ow.class, Object.class, "k"));
                th = null;
            } catch (Error | Exception e5) {
                c1133iw = new C1133iw(i);
                th = e5;
                th2 = e3;
            }
        }
        f14872p = c1133iw;
        if (th != null) {
            Pw pw = f14871o;
            Logger a5 = pw.a();
            Level level = Level.SEVERE;
            a5.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            pw.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f14873q = new Object();
    }

    public static final Object c(Object obj) {
        if (obj instanceof C0910dw) {
            RuntimeException runtimeException = ((C0910dw) obj).f13205b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof C0955ew) {
            throw new ExecutionException(((C0955ew) obj).f13383a);
        }
        if (obj == f14873q) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(E3.a aVar) {
        Throwable b3;
        if (aVar instanceof InterfaceC1178jw) {
            Object obj = ((AbstractC1403ow) aVar).f14874k;
            if (obj instanceof C0910dw) {
                C0910dw c0910dw = (C0910dw) obj;
                if (c0910dw.f13204a) {
                    RuntimeException runtimeException = c0910dw.f13205b;
                    obj = runtimeException != null ? new C0910dw(false, runtimeException) : C0910dw.f13203d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((aVar instanceof AbstractC0867cx) && (b3 = ((AbstractC0867cx) aVar).b()) != null) {
            return new C0955ew(b3);
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f14870n) && isCancelled) {
            C0910dw c0910dw2 = C0910dw.f13203d;
            Objects.requireNonNull(c0910dw2);
            return c0910dw2;
        }
        try {
            try {
                try {
                    Object i = i(aVar);
                    return isCancelled ? new C0910dw(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(aVar)))) : i == null ? f14873q : i;
                } catch (Error | Exception e3) {
                    e = e3;
                    return new C0955ew(e);
                }
            } catch (Error e5) {
                e = e5;
                return new C0955ew(e);
            }
        } catch (CancellationException e6) {
            return !isCancelled ? new C0955ew(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(aVar)), e6)) : new C0910dw(false, e6);
        } catch (ExecutionException e7) {
            return isCancelled ? new C0910dw(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(aVar)), e7)) : new C0955ew(e7.getCause());
        }
    }

    public static Object i(E3.a aVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = aVar.get();
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

    public static void o(AbstractC1403ow abstractC1403ow, boolean z3) {
        C1000fw c1000fw = null;
        while (true) {
            for (C1358nw C5 = f14872p.C(abstractC1403ow); C5 != null; C5 = C5.f14733b) {
                Thread thread = C5.f14732a;
                if (thread != null) {
                    C5.f14732a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z3) {
                abstractC1403ow.j();
            }
            abstractC1403ow.e();
            C1000fw c1000fw2 = c1000fw;
            C1000fw h3 = f14872p.h(abstractC1403ow);
            C1000fw c1000fw3 = c1000fw2;
            while (h3 != null) {
                C1000fw c1000fw4 = h3.f13531c;
                h3.f13531c = c1000fw3;
                c1000fw3 = h3;
                h3 = c1000fw4;
            }
            while (c1000fw3 != null) {
                c1000fw = c1000fw3.f13531c;
                Runnable runnable = c1000fw3.f13529a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC1090hw) {
                    RunnableC1090hw runnableC1090hw = (RunnableC1090hw) runnable;
                    abstractC1403ow = runnableC1090hw.f13817k;
                    if (abstractC1403ow.f14874k == runnableC1090hw) {
                        if (f14872p.b0(abstractC1403ow, runnableC1090hw, h(runnableC1090hw.f13818l))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c1000fw3.f13530b;
                    Objects.requireNonNull(executor);
                    p(runnable, executor);
                }
                c1000fw3 = c1000fw;
            }
            return;
            z3 = false;
        }
    }

    public static void p(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e3) {
            f14871o.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e3);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        C1000fw c1000fw;
        C1000fw c1000fw2;
        AbstractC1400ot.M("Runnable was null.", runnable);
        AbstractC1400ot.M("Executor was null.", executor);
        if (!isDone() && (c1000fw = this.f14875l) != (c1000fw2 = C1000fw.f13528d)) {
            C1000fw c1000fw3 = new C1000fw(runnable, executor);
            do {
                c1000fw3.f13531c = c1000fw;
                if (f14872p.Y(this, c1000fw, c1000fw3)) {
                    return;
                } else {
                    c1000fw = this.f14875l;
                }
            } while (c1000fw != c1000fw2);
        }
        p(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0867cx
    public final Throwable b() {
        if (!(this instanceof InterfaceC1178jw)) {
            return null;
        }
        Object obj = this.f14874k;
        if (obj instanceof C0955ew) {
            return ((C0955ew) obj).f13383a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cancel(boolean z3) {
        C0910dw c0910dw;
        Object obj = this.f14874k;
        if (!(obj instanceof RunnableC1090hw) && !(obj == null)) {
            return false;
        }
        if (f14870n) {
            c0910dw = new C0910dw(z3, new CancellationException("Future.cancel() was called."));
        } else {
            c0910dw = z3 ? C0910dw.f13202c : C0910dw.f13203d;
            Objects.requireNonNull(c0910dw);
        }
        AbstractC1403ow abstractC1403ow = this;
        boolean z5 = false;
        while (true) {
            if (f14872p.b0(abstractC1403ow, obj, c0910dw)) {
                o(abstractC1403ow, z3);
                if (!(obj instanceof RunnableC1090hw)) {
                    break;
                }
                E3.a aVar = ((RunnableC1090hw) obj).f13818l;
                if (!(aVar instanceof InterfaceC1178jw)) {
                    aVar.cancel(z3);
                    break;
                }
                abstractC1403ow = (AbstractC1403ow) aVar;
                obj = abstractC1403ow.f14874k;
                if (!(obj == null) && !(obj instanceof RunnableC1090hw)) {
                    break;
                }
                z5 = true;
            } else {
                obj = abstractC1403ow.f14874k;
                if (!(obj instanceof RunnableC1090hw)) {
                    return z5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String d() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public void e() {
    }

    public boolean f(Object obj) {
        if (obj == null) {
            obj = f14873q;
        }
        if (!f14872p.b0(this, null, obj)) {
            return false;
        }
        o(this, false);
        return true;
    }

    public boolean g(Throwable th) {
        th.getClass();
        if (!f14872p.b0(this, null, new C0955ew(th))) {
            return false;
        }
        o(this, false);
        return true;
    }

    public Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f14874k;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC1090hw))) {
            return c(obj2);
        }
        C1358nw c1358nw = this.f14876m;
        C1358nw c1358nw2 = C1358nw.f14731c;
        if (c1358nw != c1358nw2) {
            C1358nw c1358nw3 = new C1358nw();
            do {
                AbstractC0952et abstractC0952et = f14872p;
                abstractC0952et.N(c1358nw3, c1358nw);
                if (abstractC0952et.d0(this, c1358nw, c1358nw3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            q(c1358nw3);
                            throw new InterruptedException();
                        }
                        obj = this.f14874k;
                    } while (!((obj != null) & (!(obj instanceof RunnableC1090hw))));
                    return c(obj);
                }
                c1358nw = this.f14876m;
            } while (c1358nw != c1358nw2);
        }
        Object obj3 = this.f14874k;
        Objects.requireNonNull(obj3);
        return c(obj3);
    }

    public boolean isCancelled() {
        return this.f14874k instanceof C0910dw;
    }

    public boolean isDone() {
        return (this.f14874k != null) & (!(r0 instanceof RunnableC1090hw));
    }

    public void j() {
    }

    public final void k(Future future) {
        if ((future != null) && (this.f14874k instanceof C0910dw)) {
            future.cancel(m());
        }
    }

    public final void l(E3.a aVar) {
        C0955ew c0955ew;
        aVar.getClass();
        Object obj = this.f14874k;
        if (obj == null) {
            if (aVar.isDone()) {
                if (f14872p.b0(this, null, h(aVar))) {
                    o(this, false);
                    return;
                }
                return;
            }
            RunnableC1090hw runnableC1090hw = new RunnableC1090hw(this, aVar);
            if (f14872p.b0(this, null, runnableC1090hw)) {
                try {
                    aVar.a(runnableC1090hw, Ew.f8627k);
                    return;
                } catch (Throwable th) {
                    try {
                        c0955ew = new C0955ew(th);
                    } catch (Error | Exception unused) {
                        c0955ew = C0955ew.f13382b;
                    }
                    f14872p.b0(this, runnableC1090hw, c0955ew);
                    return;
                }
            }
            obj = this.f14874k;
        }
        if (obj instanceof C0910dw) {
            aVar.cancel(((C0910dw) obj).f13204a);
        }
    }

    public final boolean m() {
        Object obj = this.f14874k;
        return (obj instanceof C0910dw) && ((C0910dw) obj).f13204a;
    }

    public final void n(StringBuilder sb) {
        try {
            Object i = i(this);
            sb.append("SUCCESS, result=[");
            if (i == null) {
                sb.append("null");
            } else if (i == this) {
                sb.append("this future");
            } else {
                sb.append(i.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(i)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        } catch (Exception e5) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e5.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final void q(C1358nw c1358nw) {
        c1358nw.f14732a = null;
        while (true) {
            C1358nw c1358nw2 = this.f14876m;
            if (c1358nw2 != C1358nw.f14731c) {
                C1358nw c1358nw3 = null;
                while (c1358nw2 != null) {
                    C1358nw c1358nw4 = c1358nw2.f14733b;
                    if (c1358nw2.f14732a != null) {
                        c1358nw3 = c1358nw2;
                    } else if (c1358nw3 != null) {
                        c1358nw3.f14733b = c1358nw4;
                        if (c1358nw3.f14732a == null) {
                            break;
                        }
                    } else if (!f14872p.d0(this, c1358nw2, c1358nw4)) {
                        break;
                    }
                    c1358nw2 = c1358nw4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
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
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            n(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f14874k;
            if (obj instanceof RunnableC1090hw) {
                sb.append(", setFuture=[");
                E3.a aVar = ((RunnableC1090hw) obj).f13818l;
                try {
                    if (aVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(aVar);
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
                } catch (StackOverflowError e5) {
                    e = e5;
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
                    concat = d();
                    if (AbstractC0952et.u(concat)) {
                        concat = null;
                    }
                } catch (Exception | StackOverflowError e6) {
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(e6.getClass()));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                n(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Object get(long j5, TimeUnit timeUnit) {
        boolean z3;
        long j6;
        long nanos = timeUnit.toNanos(j5);
        if (!Thread.interrupted()) {
            Object obj = this.f14874k;
            if ((obj != null) & (!(obj instanceof RunnableC1090hw))) {
                return c(obj);
            }
            long j7 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C1358nw c1358nw = this.f14876m;
                C1358nw c1358nw2 = C1358nw.f14731c;
                if (c1358nw != c1358nw2) {
                    C1358nw c1358nw3 = new C1358nw();
                    z3 = true;
                    while (true) {
                        AbstractC0952et abstractC0952et = f14872p;
                        abstractC0952et.N(c1358nw3, c1358nw);
                        if (abstractC0952et.d0(this, c1358nw, c1358nw3)) {
                            j6 = j7;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f14874k;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC1090hw))) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    q(c1358nw3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            q(c1358nw3);
                        } else {
                            long j8 = j7;
                            c1358nw = this.f14876m;
                            if (c1358nw == c1358nw2) {
                                break;
                            }
                            j7 = j8;
                        }
                    }
                }
                Object obj3 = this.f14874k;
                Objects.requireNonNull(obj3);
                return c(obj3);
            }
            z3 = true;
            j6 = 0;
            while (nanos > j6) {
                Object obj4 = this.f14874k;
                if ((obj4 != null ? z3 : false) & (!(obj4 instanceof RunnableC1090hw))) {
                    return c(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC1403ow = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j6) {
                String concat = str.concat(" (plus ");
                long j9 = -nanos;
                long convert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
                long nanos2 = j9 - timeUnit.toNanos(convert);
                if (convert != j6 && nanos2 <= 1000) {
                    z3 = false;
                }
                if (convert > j6) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z3) {
                        str2 = str2.concat(",");
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
            throw new TimeoutException(AbstractC0467k.v(str, " for ", abstractC1403ow));
        }
        throw new InterruptedException();
    }
}

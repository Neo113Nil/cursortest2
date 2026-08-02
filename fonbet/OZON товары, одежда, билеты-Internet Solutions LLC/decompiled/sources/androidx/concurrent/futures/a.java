package androidx.concurrent.futures;

import C.C2702w;
import com.google.common.util.concurrent.m;
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

/* loaded from: classes.dex */
public abstract class a<V> implements m<V> {

    /* renamed from: d, reason: collision with root package name */
    static final boolean f41171d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f41172e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC0754a f41173f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f41174g;

    /* renamed from: a, reason: collision with root package name */
    volatile Object f41175a;

    /* renamed from: b, reason: collision with root package name */
    volatile d f41176b;

    /* renamed from: c, reason: collision with root package name */
    volatile h f41177c;

    /* renamed from: androidx.concurrent.futures.a$a, reason: collision with other inner class name */
    private static abstract class AbstractC0754a {
        abstract boolean a(a<?> aVar, d dVar, d dVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f41178c;

        /* renamed from: d, reason: collision with root package name */
        static final b f41179d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f41180a;

        /* renamed from: b, reason: collision with root package name */
        final CancellationException f41181b;

        static {
            if (a.f41171d) {
                f41179d = null;
                f41178c = null;
            } else {
                f41179d = new b(false, null);
                f41178c = new b(true, null);
            }
        }

        b(boolean z11, CancellationException cancellationException) {
            this.f41180a = z11;
            this.f41181b = cancellationException;
        }
    }

    /* loaded from: classes8.dex */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final Throwable f41182a;

        /* renamed from: androidx.concurrent.futures.a$c$a, reason: collision with other inner class name */
        final class C0755a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new C0755a("Failure occurred while trying to finish a future."));
        }

        c(Throwable th2) {
            boolean z11 = a.f41171d;
            th2.getClass();
            this.f41182a = th2;
        }
    }

    private static final class d {

        /* renamed from: d, reason: collision with root package name */
        static final d f41183d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f41184a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f41185b;

        /* renamed from: c, reason: collision with root package name */
        d f41186c;

        d(Runnable runnable, Executor executor) {
            this.f41184a = runnable;
            this.f41185b = executor;
        }
    }

    private static final class e extends AbstractC0754a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, Thread> f41187a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, h> f41188b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, h> f41189c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, d> f41190d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f41191e;

        e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f41187a = atomicReferenceFieldUpdater;
            this.f41188b = atomicReferenceFieldUpdater2;
            this.f41189c = atomicReferenceFieldUpdater3;
            this.f41190d = atomicReferenceFieldUpdater4;
            this.f41191e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.AbstractC0754a
        final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f41190d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        @Override // androidx.concurrent.futures.a.AbstractC0754a
        final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f41191e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // androidx.concurrent.futures.a.AbstractC0754a
        final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f41189c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == hVar);
            return false;
        }

        @Override // androidx.concurrent.futures.a.AbstractC0754a
        final void d(h hVar, h hVar2) {
            this.f41188b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.AbstractC0754a
        final void e(h hVar, Thread thread) {
            this.f41187a.lazySet(hVar, thread);
        }
    }

    private static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes8.dex */
    private static final class g extends AbstractC0754a {
        g() {
        }

        @Override // androidx.concurrent.futures.a.AbstractC0754a
        final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f41176b != dVar) {
                        return false;
                    }
                    aVar.f41176b = dVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.AbstractC0754a
        final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f41175a != obj) {
                        return false;
                    }
                    aVar.f41175a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.AbstractC0754a
        final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f41177c != hVar) {
                        return false;
                    }
                    aVar.f41177c = hVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.AbstractC0754a
        final void d(h hVar, h hVar2) {
            hVar.f41194b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.AbstractC0754a
        final void e(h hVar, Thread thread) {
            hVar.f41193a = thread;
        }
    }

    private static final class h {

        /* renamed from: c, reason: collision with root package name */
        static final h f41192c = new h();

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f41193a;

        /* renamed from: b, reason: collision with root package name */
        volatile h f41194b;

        h() {
            a.f41173f.e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0754a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f41173f = gVar;
        if (th != null) {
            f41172e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f41174g = new Object();
    }

    protected a() {
    }

    private void b(StringBuilder sb2) {
        try {
            Object g10 = g(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(g10 == this ? "this future" : String.valueOf(g10));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e12) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e12.getCause());
            sb2.append("]");
        }
    }

    static void d(a<?> aVar) {
        h hVar;
        d dVar;
        do {
            hVar = aVar.f41177c;
        } while (!f41173f.c(aVar, hVar, h.f41192c));
        while (hVar != null) {
            Thread thread = hVar.f41193a;
            if (thread != null) {
                hVar.f41193a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f41194b;
        }
        aVar.c();
        do {
            dVar = aVar.f41176b;
        } while (!f41173f.a(aVar, dVar, d.f41183d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f41186c;
            dVar.f41186c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.f41186c;
            Runnable runnable = dVar2.f41184a;
            if (runnable instanceof f) {
                ((f) runnable).getClass();
                throw null;
            }
            e(runnable, dVar2.f41185b);
            dVar2 = dVar4;
        }
    }

    private static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            f41172e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    private static Object f(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            CancellationException cancellationException = ((b) obj).f41181b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f41182a);
        }
        if (obj == f41174g) {
            return null;
        }
        return obj;
    }

    static Object g(a aVar) throws ExecutionException {
        Object obj;
        boolean z11 = false;
        while (true) {
            try {
                obj = aVar.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void i(h hVar) {
        hVar.f41193a = null;
        while (true) {
            h hVar2 = this.f41177c;
            if (hVar2 == h.f41192c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f41194b;
                if (hVar2.f41193a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f41194b = hVar4;
                    if (hVar3.f41193a == null) {
                        break;
                    }
                } else if (!f41173f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.m
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f41176b;
        d dVar2 = d.f41183d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f41186c = dVar;
                if (f41173f.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f41176b;
                }
            } while (dVar != dVar2);
        }
        e(runnable, executor);
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        Object obj = this.f41175a;
        if ((obj == null) | (obj instanceof f)) {
            b bVar = f41171d ? new b(z11, new CancellationException("Future.cancel() was called.")) : z11 ? b.f41178c : b.f41179d;
            while (!f41173f.b(this, obj, bVar)) {
                obj = this.f41175a;
                if (!(obj instanceof f)) {
                }
            }
            d(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j11, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z11;
        long nanos = timeUnit.toNanos(j11);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f41175a;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f41177c;
            h hVar2 = h.f41192c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                z11 = true;
                do {
                    AbstractC0754a abstractC0754a = f41173f;
                    abstractC0754a.d(hVar3, hVar);
                    if (abstractC0754a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f41175a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(hVar3);
                    } else {
                        hVar = this.f41177c;
                    }
                } while (hVar != hVar2);
            }
            return (V) f(this.f41175a);
        }
        z11 = true;
        while (nanos > 0) {
            Object obj3 = this.f41175a;
            if ((obj3 != null ? z11 : false) && (!(obj3 instanceof f))) {
                return (V) f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        StringBuilder d11 = C2702w.d(j11, "Waited ", " ");
        d11.append(timeUnit.toString().toLowerCase(locale));
        String sb2 = d11.toString();
        if (nanos + 1000 < 0) {
            String e11 = U7.d.e(sb2, " (plus ");
            long j12 = -nanos;
            long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
            long nanos2 = j12 - timeUnit.toNanos(convert);
            boolean z12 = (convert == 0 || nanos2 > 1000) ? z11 : false;
            if (convert > 0) {
                String str = e11 + convert + " " + lowerCase;
                if (z12) {
                    str = U7.d.e(str, ",");
                }
                e11 = U7.d.e(str, " ");
            }
            if (z12) {
                e11 = e11 + nanos2 + " nanoseconds ";
            }
            sb2 = U7.d.e(e11, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(U7.d.e(sb2, " but future completed as timeout expired"));
        }
        throw new TimeoutException(G.g.c(sb2, " for ", aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String h() {
        Object obj = this.f41175a;
        if (obj instanceof f) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ((f) obj).getClass();
            sb2.append("null");
            sb2.append("]");
            return sb2.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f41175a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f41175a != null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean j(V v11) {
        if (v11 == null) {
            v11 = (V) f41174g;
        }
        if (!f41173f.b(this, null, v11)) {
            return false;
        }
        d(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean k(Throwable th2) {
        th2.getClass();
        if (!f41173f.b(this, null, new c(th2))) {
            return false;
        }
        d(this);
        return true;
    }

    protected final boolean l() {
        Object obj = this.f41175a;
        return (obj instanceof b) && ((b) obj).f41180a;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f41175a instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = h();
            } catch (RuntimeException e11) {
                str = "Exception thrown from implementation: " + e11.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f41175a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) f(obj2);
            }
            h hVar = this.f41177c;
            h hVar2 = h.f41192c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    AbstractC0754a abstractC0754a = f41173f;
                    abstractC0754a.d(hVar3, hVar);
                    if (abstractC0754a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f41175a;
                            } else {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) f(obj);
                    }
                    hVar = this.f41177c;
                } while (hVar != hVar2);
            }
            return (V) f(this.f41175a);
        }
        throw new InterruptedException();
    }
}

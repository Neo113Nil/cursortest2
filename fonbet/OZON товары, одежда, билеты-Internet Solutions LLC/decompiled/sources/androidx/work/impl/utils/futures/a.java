package androidx.work.impl.utils.futures;

import C.C2702w;
import C.o0;
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
    static final boolean f45496d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f45497e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC0821a f45498f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f45499g;

    /* renamed from: a, reason: collision with root package name */
    volatile Object f45500a;

    /* renamed from: b, reason: collision with root package name */
    volatile d f45501b;

    /* renamed from: c, reason: collision with root package name */
    volatile h f45502c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.utils.futures.a$a, reason: collision with other inner class name */
    static abstract class AbstractC0821a {
        abstract boolean a(a<?> aVar, d dVar, d dVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    static final class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f45503c;

        /* renamed from: d, reason: collision with root package name */
        static final b f45504d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f45505a;

        /* renamed from: b, reason: collision with root package name */
        final CancellationException f45506b;

        static {
            if (a.f45496d) {
                f45504d = null;
                f45503c = null;
            } else {
                f45504d = new b(false, null);
                f45503c = new b(true, null);
            }
        }

        b(boolean z11, CancellationException cancellationException) {
            this.f45505a = z11;
            this.f45506b = cancellationException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    static final class c {

        /* renamed from: b, reason: collision with root package name */
        static final c f45507b = new c(new C0822a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f45508a;

        /* renamed from: androidx.work.impl.utils.futures.a$c$a, reason: collision with other inner class name */
        final class C0822a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        c(Throwable th2) {
            boolean z11 = a.f45496d;
            th2.getClass();
            this.f45508a = th2;
        }
    }

    private static final class d {

        /* renamed from: d, reason: collision with root package name */
        static final d f45509d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f45510a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f45511b;

        /* renamed from: c, reason: collision with root package name */
        d f45512c;

        d(Runnable runnable, Executor executor) {
            this.f45510a = runnable;
            this.f45511b = executor;
        }
    }

    private static final class e extends AbstractC0821a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, Thread> f45513a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, h> f45514b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, h> f45515c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, d> f45516d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f45517e;

        e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f45513a = atomicReferenceFieldUpdater;
            this.f45514b = atomicReferenceFieldUpdater2;
            this.f45515c = atomicReferenceFieldUpdater3;
            this.f45516d = atomicReferenceFieldUpdater4;
            this.f45517e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.AbstractC0821a
        final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f45516d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.a.AbstractC0821a
        final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f45517e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.a.AbstractC0821a
        final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f45515c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == hVar);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.a.AbstractC0821a
        final void d(h hVar, h hVar2) {
            this.f45514b.lazySet(hVar, hVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.AbstractC0821a
        final void e(h hVar, Thread thread) {
            this.f45513a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    static final class f<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final androidx.work.impl.utils.futures.c f45518a;

        /* renamed from: b, reason: collision with root package name */
        final m<? extends V> f45519b;

        f(androidx.work.impl.utils.futures.c cVar, m mVar) {
            this.f45518a = cVar;
            this.f45519b = mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f45518a.f45500a != this) {
                return;
            }
            if (a.f45498f.b(this.f45518a, this, a.f(this.f45519b))) {
                a.c(this.f45518a);
            }
        }
    }

    /* loaded from: classes8.dex */
    private static final class g extends AbstractC0821a {
        g() {
        }

        @Override // androidx.work.impl.utils.futures.a.AbstractC0821a
        final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f45501b != dVar) {
                        return false;
                    }
                    aVar.f45501b = dVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.AbstractC0821a
        final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f45500a != obj) {
                        return false;
                    }
                    aVar.f45500a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.AbstractC0821a
        final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f45502c != hVar) {
                        return false;
                    }
                    aVar.f45502c = hVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.AbstractC0821a
        final void d(h hVar, h hVar2) {
            hVar.f45522b = hVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.AbstractC0821a
        final void e(h hVar, Thread thread) {
            hVar.f45521a = thread;
        }
    }

    private static final class h {

        /* renamed from: c, reason: collision with root package name */
        static final h f45520c = new h();

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f45521a;

        /* renamed from: b, reason: collision with root package name */
        volatile h f45522b;

        h() {
            a.f45498f.e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0821a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f45498f = gVar;
        if (th != null) {
            f45497e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f45499g = new Object();
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

    static void c(a<?> aVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = aVar.f45502c;
            if (f45498f.c(aVar, hVar, h.f45520c)) {
                while (hVar != null) {
                    Thread thread = hVar.f45521a;
                    if (thread != null) {
                        hVar.f45521a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f45522b;
                }
                do {
                    dVar = aVar.f45501b;
                } while (!f45498f.a(aVar, dVar, d.f45509d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f45512c;
                    dVar3.f45512c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f45512c;
                    Runnable runnable = dVar2.f45510a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        aVar = fVar.f45518a;
                        if (aVar.f45500a == fVar) {
                            if (f45498f.b(aVar, fVar, f(fVar.f45519b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.f45511b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    private static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            f45497e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    private static Object e(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            CancellationException cancellationException = ((b) obj).f45506b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f45508a);
        }
        if (obj == f45499g) {
            return null;
        }
        return obj;
    }

    static Object f(m<?> mVar) {
        if (mVar instanceof a) {
            Object obj = ((a) mVar).f45500a;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            return bVar.f45505a ? bVar.f45506b != null ? new b(false, bVar.f45506b) : b.f45504d : obj;
        }
        boolean isCancelled = mVar.isCancelled();
        if ((!f45496d) && isCancelled) {
            return b.f45504d;
        }
        try {
            Object g10 = g(mVar);
            return g10 == null ? f45499g : g10;
        } catch (CancellationException e11) {
            if (isCancelled) {
                return new b(false, e11);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + mVar, e11));
        } catch (ExecutionException e12) {
            return new c(e12.getCause());
        } catch (Throwable th2) {
            return new c(th2);
        }
    }

    private static Object g(m mVar) throws ExecutionException {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                v11 = mVar.get();
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
        return v11;
    }

    private void i(h hVar) {
        hVar.f45521a = null;
        while (true) {
            h hVar2 = this.f45502c;
            if (hVar2 == h.f45520c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f45522b;
                if (hVar2.f45521a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f45522b = hVar4;
                    if (hVar3.f45521a == null) {
                        break;
                    }
                } else if (!f45498f.c(this, hVar2, hVar4)) {
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
        d dVar = this.f45501b;
        d dVar2 = d.f45509d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f45512c = dVar;
                if (f45498f.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f45501b;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        Object obj = this.f45500a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        b bVar = f45496d ? new b(z11, new CancellationException("Future.cancel() was called.")) : z11 ? b.f45503c : b.f45504d;
        a<V> aVar = this;
        boolean z12 = false;
        while (true) {
            if (f45498f.b(aVar, obj, bVar)) {
                c(aVar);
                if (!(obj instanceof f)) {
                    break;
                }
                m<? extends V> mVar = ((f) obj).f45519b;
                if (!(mVar instanceof a)) {
                    mVar.cancel(z11);
                    break;
                }
                aVar = (a) mVar;
                obj = aVar.f45500a;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z12 = true;
            } else {
                obj = aVar.f45500a;
                if (!(obj instanceof f)) {
                    return z12;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j11, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z11;
        long nanos = timeUnit.toNanos(j11);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f45500a;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f45502c;
            h hVar2 = h.f45520c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                z11 = true;
                do {
                    AbstractC0821a abstractC0821a = f45498f;
                    abstractC0821a.d(hVar3, hVar);
                    if (abstractC0821a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f45500a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(hVar3);
                    } else {
                        hVar = this.f45502c;
                    }
                } while (hVar != hVar2);
            }
            return (V) e(this.f45500a);
        }
        z11 = true;
        while (nanos > 0) {
            Object obj3 = this.f45500a;
            if ((obj3 != null ? z11 : false) && (!(obj3 instanceof f))) {
                return (V) e(obj3);
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
    protected final String h() {
        Object obj = this.f45500a;
        if (obj instanceof f) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            m<? extends V> mVar = ((f) obj).f45519b;
            return o0.c(sb2, mVar == this ? "this future" : String.valueOf(mVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f45500a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f45500a != null);
    }

    protected boolean j(V v11) {
        if (v11 == null) {
            v11 = (V) f45499g;
        }
        if (!f45498f.b(this, null, v11)) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f45500a instanceof b) {
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
            Object obj2 = this.f45500a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) e(obj2);
            }
            h hVar = this.f45502c;
            h hVar2 = h.f45520c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    AbstractC0821a abstractC0821a = f45498f;
                    abstractC0821a.d(hVar3, hVar);
                    if (abstractC0821a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f45500a;
                            } else {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) e(obj);
                    }
                    hVar = this.f45502c;
                } while (hVar != hVar2);
            }
            return (V) e(this.f45500a);
        }
        throw new InterruptedException();
    }
}

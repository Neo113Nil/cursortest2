package com.google.common.util.concurrent;

import androidx.credentials.provider.CredentialEntry;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract class a<V> extends com.google.common.util.concurrent.internal.a implements u<V> {
    private static final AbstractC0137a ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    static final t log;
    private volatile d listeners;
    private volatile Object value;
    private volatile k waiters;

    /* renamed from: com.google.common.util.concurrent.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0137a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, k kVar, k kVar2);

        public abstract d d(a<?> aVar, d dVar);

        public abstract k e(a aVar);

        public abstract void f(k kVar, k kVar2);

        public abstract void g(k kVar, Thread thread);
    }

    public static final class b {
        public static final b c;
        public static final b d;
        public final boolean a;
        public final Throwable b;

        static {
            if (a.GENERATE_CANCELLATION_CAUSES) {
                d = null;
                c = null;
            } else {
                d = new b(false, null);
                c = new b(true, null);
            }
        }

        public b(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    public static final class c {
        public static final c b = new c(new C0138a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        /* renamed from: com.google.common.util.concurrent.a$c$a, reason: collision with other inner class name */
        public class C0138a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            th.getClass();
            this.a = th;
        }
    }

    public static final class e extends AbstractC0137a {
        public final AtomicReferenceFieldUpdater<k, Thread> a;
        public final AtomicReferenceFieldUpdater<k, k> b;
        public final AtomicReferenceFieldUpdater<? super a<?>, k> c;
        public final AtomicReferenceFieldUpdater<? super a<?>, d> d;
        public final AtomicReferenceFieldUpdater<? super a<?>, Object> e;

        public e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<? super a<?>, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<? super a<?>, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<? super a<?>, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<? super a<?>, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super a<?>, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final boolean c(a<?> aVar, k kVar, k kVar2) {
            AtomicReferenceFieldUpdater<? super a<?>, k> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, kVar, kVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == kVar);
            return false;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final d d(a<?> aVar, d dVar) {
            return this.d.getAndSet(aVar, dVar);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final k e(a aVar) {
            return this.c.getAndSet(aVar, k.c);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final void f(k kVar, k kVar2) {
            this.b.lazySet(kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final void g(k kVar, Thread thread) {
            this.a.lazySet(kVar, thread);
        }
    }

    public static final class f<V> implements Runnable {
        public final a<V> a;
        public final u<? extends V> b;

        public f(a<V> aVar, u<? extends V> uVar) {
            this.a = aVar;
            this.b = uVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a<V> aVar = this.a;
            if (((a) aVar).value != this) {
                return;
            }
            if (a.ATOMIC_HELPER.b(aVar, this, a.getFutureValue(this.b))) {
                a.complete(aVar, false);
            }
        }
    }

    public static final class g extends AbstractC0137a {
        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                try {
                    if (((a) aVar).listeners != dVar) {
                        return false;
                    }
                    ((a) aVar).listeners = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (((a) aVar).value != obj) {
                        return false;
                    }
                    ((a) aVar).value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final boolean c(a<?> aVar, k kVar, k kVar2) {
            synchronized (aVar) {
                try {
                    if (((a) aVar).waiters != kVar) {
                        return false;
                    }
                    ((a) aVar).waiters = kVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final d d(a<?> aVar, d dVar) {
            d dVar2;
            synchronized (aVar) {
                try {
                    dVar2 = ((a) aVar).listeners;
                    if (dVar2 != dVar) {
                        ((a) aVar).listeners = dVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final k e(a aVar) {
            k kVar;
            k kVar2 = k.c;
            synchronized (aVar) {
                try {
                    kVar = aVar.waiters;
                    if (kVar != kVar2) {
                        aVar.waiters = kVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return kVar;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final void f(k kVar, k kVar2) {
            kVar.b = kVar2;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final void g(k kVar, Thread thread) {
            kVar.a = thread;
        }
    }

    public interface h<V> extends u<V> {
    }

    public static abstract class i<V> extends a<V> implements h<V> {
    }

    public static final class j extends AbstractC0137a {
        public static final Unsafe a;
        public static final long b;
        public static final long c;
        public static final long d;
        public static final long e;
        public static final long f;

        /* renamed from: com.google.common.util.concurrent.a$j$a, reason: collision with other inner class name */
        public class C0139a implements PrivilegedExceptionAction<Unsafe> {
            public static Unsafe a() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                return a();
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0139a());
            }
            try {
                c = unsafe.objectFieldOffset(a.class.getDeclaredField("waiters"));
                b = unsafe.objectFieldOffset(a.class.getDeclaredField("listeners"));
                d = unsafe.objectFieldOffset(a.class.getDeclaredField("value"));
                e = unsafe.objectFieldOffset(k.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            return com.google.common.util.concurrent.c.a(a, aVar, b, dVar, dVar2);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            return com.google.common.util.concurrent.d.a(a, aVar, d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final boolean c(a<?> aVar, k kVar, k kVar2) {
            return com.google.common.util.concurrent.b.a(a, aVar, c, kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final d d(a<?> aVar, d dVar) {
            d dVar2;
            do {
                dVar2 = ((a) aVar).listeners;
                if (dVar == dVar2) {
                    break;
                }
            } while (!a(aVar, dVar2, dVar));
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final k e(a aVar) {
            k kVar;
            k kVar2;
            do {
                kVar = aVar.waiters;
                kVar2 = k.c;
                if (kVar2 == kVar) {
                    break;
                }
            } while (!c(aVar, kVar, kVar2));
            return kVar;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final void f(k kVar, k kVar2) {
            a.putObject(kVar, f, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0137a
        public final void g(k kVar, Thread thread) {
            a.putObject(kVar, e, thread);
        }
    }

    public static final class k {
        public static final k c = new k();
        public volatile Thread a;
        public volatile k b;

        public k() {
            a.ATOMIC_HELPER.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th;
        AbstractC0137a gVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", CredentialEntry.FALSE_STRING));
        } catch (SecurityException unused) {
            z = false;
        }
        GENERATE_CANCELLATION_CAUSES = z;
        log = new t(a.class);
        Throwable th2 = null;
        try {
            gVar = new j();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, k.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "value"));
            } catch (Error | Exception e3) {
                th2 = e3;
                gVar = new g();
            }
        }
        ATOMIC_HELPER = gVar;
        if (th2 != null) {
            t tVar = log;
            Logger a = tVar.a();
            Level level = Level.SEVERE;
            a.log(level, "UnsafeAtomicHelper is broken!", th);
            tVar.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        NULL = new Object();
    }

    private void addDoneString(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            appendResultObject(sb, uninterruptibly);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1.isEmpty() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void addPendingString(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof f) {
            sb.append(", setFuture=[");
            appendUserObject(sb, ((f) obj).b);
            sb.append("]");
        } else {
            try {
                str = pendingToString();
                if (str != null) {
                }
                str = null;
            } catch (Exception | StackOverflowError e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            addDoneString(sb);
        }
    }

    private void appendResultObject(StringBuilder sb, Object obj) {
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

    private void appendUserObject(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception e2) {
            e = e2;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e3) {
            e = e3;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static CancellationException cancellationExceptionWithCause(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private d clearListeners(d dVar) {
        d dVar2 = dVar;
        d d2 = ATOMIC_HELPER.d(this, d.d);
        while (d2 != null) {
            d dVar3 = d2.c;
            d2.c = dVar2;
            dVar2 = d2;
            d2 = dVar3;
        }
        return dVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void complete(a<?> aVar, boolean z) {
        d dVar = null;
        while (true) {
            aVar.releaseWaiters();
            if (z) {
                aVar.interruptTask();
                z = false;
            }
            aVar.afterDone();
            d clearListeners = aVar.clearListeners(dVar);
            while (clearListeners != null) {
                dVar = clearListeners.c;
                Runnable runnable = clearListeners.a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof f) {
                    f fVar = (f) runnable2;
                    aVar = fVar.a;
                    if (((a) aVar).value == fVar) {
                        if (ATOMIC_HELPER.b(aVar, fVar, getFutureValue(fVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = clearListeners.b;
                    Objects.requireNonNull(executor);
                    executeListener(runnable2, executor);
                }
                clearListeners = dVar;
            }
            return;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            log.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((b) obj).b);
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object getFutureValue(u<?> uVar) {
        Throwable tryInternalFastPathGetFailure;
        if (uVar instanceof h) {
            Object obj = ((a) uVar).value;
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.a) {
                    obj = bVar.b != null ? new b(false, bVar.b) : b.d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((uVar instanceof com.google.common.util.concurrent.internal.a) && (tryInternalFastPathGetFailure = ((com.google.common.util.concurrent.internal.a) uVar).tryInternalFastPathGetFailure()) != null) {
            return new c(tryInternalFastPathGetFailure);
        }
        boolean isCancelled = uVar.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && isCancelled) {
            b bVar2 = b.d;
            Objects.requireNonNull(bVar2);
            return bVar2;
        }
        try {
            Object uninterruptibly = getUninterruptibly(uVar);
            if (!isCancelled) {
                return uninterruptibly == null ? NULL : uninterruptibly;
            }
            return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + uVar));
        } catch (Error | Exception e2) {
            return new c(e2);
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new b(false, e3);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + uVar, e3));
        } catch (ExecutionException e4) {
            if (!isCancelled) {
                return new c(e4.getCause());
            }
            return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + uVar, e4));
        }
    }

    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
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
        return v;
    }

    private void releaseWaiters() {
        for (k e2 = ATOMIC_HELPER.e(this); e2 != null; e2 = e2.b) {
            Thread thread = e2.a;
            if (thread != null) {
                e2.a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    private void removeWaiter(k kVar) {
        kVar.a = null;
        while (true) {
            k kVar2 = this.waiters;
            if (kVar2 == k.c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.b;
                if (kVar2.a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.b = kVar4;
                    if (kVar3.a == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.c(this, kVar2, kVar4)) {
                    break;
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.u
    public void addListener(Runnable runnable, Executor executor) {
        d dVar;
        com.google.common.base.k.f(runnable, "Runnable was null.");
        com.google.common.base.k.f(executor, "Executor was null.");
        if (!isDone() && (dVar = this.listeners) != d.d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.c = dVar;
                if (ATOMIC_HELPER.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listeners;
                }
            } while (dVar != d.d);
        }
        executeListener(runnable, executor);
    }

    public void afterDone() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cancel(boolean z) {
        b bVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            bVar = new b(z, new CancellationException("Future.cancel() was called."));
        } else {
            bVar = z ? b.c : b.d;
            Objects.requireNonNull(bVar);
        }
        a<V> aVar = this;
        boolean z2 = false;
        while (true) {
            if (ATOMIC_HELPER.b(aVar, obj, bVar)) {
                complete(aVar, z);
                if (!(obj instanceof f)) {
                    break;
                }
                u<? extends V> uVar = ((f) obj).b;
                if (!(uVar instanceof h)) {
                    uVar.cancel(z);
                    break;
                }
                aVar = (a) uVar;
                obj = aVar.value;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z2 = true;
            } else {
                obj = aVar.value;
                if (!(obj instanceof f)) {
                    return z2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z;
        long j3;
        k kVar = k.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof f))) {
            return getDoneValue(obj);
        }
        long j4 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar2 = this.waiters;
            if (kVar2 != kVar) {
                k kVar3 = new k();
                z = true;
                while (true) {
                    ATOMIC_HELPER.f(kVar3, kVar2);
                    if (ATOMIC_HELPER.c(this, kVar2, kVar3)) {
                        j3 = j4;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                removeWaiter(kVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return getDoneValue(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(kVar3);
                    } else {
                        long j5 = j4;
                        kVar2 = this.waiters;
                        if (kVar2 == kVar) {
                            break;
                        }
                        j4 = j5;
                    }
                }
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return getDoneValue(obj3);
        }
        z = true;
        j3 = 0;
        while (nanos > j3) {
            Object obj4 = this.value;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof f))) {
                return getDoneValue(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        StringBuilder b2 = androidx.compose.runtime.snapshots.m.b(j2, "Waited ", " ");
        b2.append(timeUnit.toString().toLowerCase(locale));
        String sb = b2.toString();
        if (nanos + 1000 < j3) {
            String b3 = androidx.compose.runtime.changelist.d.b(sb, " (plus ");
            long j6 = -nanos;
            long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(convert);
            boolean z2 = (convert == j3 || nanos2 > 1000) ? z : false;
            if (convert > j3) {
                String str = b3 + convert + " " + lowerCase;
                if (z2) {
                    str = androidx.compose.runtime.changelist.d.b(str, ",");
                }
                b3 = androidx.compose.runtime.changelist.d.b(str, " ");
            }
            if (z2) {
                b3 = b3 + nanos2 + " nanoseconds ";
            }
            sb = androidx.compose.runtime.changelist.d.b(b3, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(androidx.compose.runtime.changelist.d.b(sb, " but future completed as timeout expired"));
        }
        throw new TimeoutException(android.support.v4.media.session.f.b(sb, " for ", aVar));
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof f)) & (this.value != null);
    }

    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, v)) {
            return false;
        }
        complete(this, false);
        return true;
    }

    public boolean setException(Throwable th) {
        th.getClass();
        if (!ATOMIC_HELPER.b(this, null, new c(th))) {
            return false;
        }
        complete(this, false);
        return true;
    }

    public boolean setFuture(u<? extends V> uVar) {
        c cVar;
        uVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (uVar.isDone()) {
                if (ATOMIC_HELPER.b(this, null, getFutureValue(uVar))) {
                    complete(this, false);
                    return true;
                }
                return false;
            }
            f fVar = new f(this, uVar);
            if (ATOMIC_HELPER.b(this, null, fVar)) {
                try {
                    uVar.addListener(fVar, com.google.common.util.concurrent.j.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        cVar = new c(th);
                    } catch (Error | Exception unused) {
                        cVar = c.b;
                    }
                    ATOMIC_HELPER.b(this, fVar, cVar);
                    return true;
                }
            }
            obj = this.value;
        }
        if (obj instanceof b) {
            uVar.cancel(((b) obj).a);
        }
        return false;
    }

    public String toString() {
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
            addDoneString(sb);
        } else {
            addPendingString(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.common.util.concurrent.internal.a
    public final Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof c) {
            return ((c) obj).a;
        }
        return null;
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).a;
    }

    public static final class d {
        public static final d d = new d();
        public final Runnable a;
        public final Executor b;
        public d c;

        public d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }

        public d() {
            this.a = null;
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        k kVar = k.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return getDoneValue(obj2);
            }
            k kVar2 = this.waiters;
            if (kVar2 != kVar) {
                k kVar3 = new k();
                do {
                    ATOMIC_HELPER.f(kVar3, kVar2);
                    if (ATOMIC_HELPER.c(this, kVar2, kVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                removeWaiter(kVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return getDoneValue(obj);
                    }
                    kVar2 = this.waiters;
                } while (kVar2 != kVar);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return getDoneValue(obj3);
        }
        throw new InterruptedException();
    }
}

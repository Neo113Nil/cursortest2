package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
abstract class AbstractFutureState<V> extends com.google.common.util.concurrent.internal.InternalFutureFailureAccess implements com.google.common.util.concurrent.ListenableFuture<V> {
    private static final com.google.common.util.concurrent.AbstractFutureState.AtomicHelper ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile com.google.common.util.concurrent.AbstractFuture.Listener listenersField;
    volatile java.lang.Object valueField;
    volatile com.google.common.util.concurrent.AbstractFutureState.Waiter waitersField;
    static final java.lang.Object NULL = new java.lang.Object();
    static final com.google.common.util.concurrent.LazyLogger log = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.AbstractFuture.class);

    final boolean casListeners(com.google.common.util.concurrent.AbstractFuture.Listener listener, com.google.common.util.concurrent.AbstractFuture.Listener listener2) {
        return ATOMIC_HELPER.casListeners(this, listener, listener2);
    }

    final com.google.common.util.concurrent.AbstractFuture.Listener gasListeners(com.google.common.util.concurrent.AbstractFuture.Listener listener) {
        return ATOMIC_HELPER.gasListeners(this, listener);
    }

    static boolean casValue(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, java.lang.Object obj, java.lang.Object obj2) {
        return ATOMIC_HELPER.casValue(abstractFutureState, obj, obj2);
    }

    final java.lang.Object value() {
        return this.valueField;
    }

    final com.google.common.util.concurrent.AbstractFuture.Listener listeners() {
        return this.listenersField;
    }

    final void releaseWaiters() {
        for (com.google.common.util.concurrent.AbstractFutureState.Waiter gasWaiters = gasWaiters(com.google.common.util.concurrent.AbstractFutureState.Waiter.TOMBSTONE); gasWaiters != null; gasWaiters = gasWaiters.next) {
            gasWaiters.unpark();
        }
    }

    final V blockingGet(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.valueField;
        if ((obj != null) & com.google.common.util.concurrent.AbstractFuture.notInstanceOfDelegatingToFuture(obj)) {
            return (V) com.google.common.util.concurrent.AbstractFuture.getDoneValue(obj);
        }
        long nanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            com.google.common.util.concurrent.AbstractFutureState.Waiter waiter = this.waitersField;
            if (waiter != com.google.common.util.concurrent.AbstractFutureState.Waiter.TOMBSTONE) {
                com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2 = new com.google.common.util.concurrent.AbstractFutureState.Waiter();
                do {
                    waiter2.setNext(waiter);
                    if (casWaiters(waiter, waiter2)) {
                        do {
                            com.google.common.util.concurrent.OverflowAvoidingLockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                removeWaiter(waiter2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.valueField;
                            if ((obj2 != null) & com.google.common.util.concurrent.AbstractFuture.notInstanceOfDelegatingToFuture(obj2)) {
                                return (V) com.google.common.util.concurrent.AbstractFuture.getDoneValue(obj2);
                            }
                            nanos = nanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(waiter2);
                    } else {
                        waiter = this.waitersField;
                    }
                } while (waiter != com.google.common.util.concurrent.AbstractFutureState.Waiter.TOMBSTONE);
            }
            return (V) com.google.common.util.concurrent.AbstractFuture.getDoneValue(java.util.Objects.requireNonNull(this.valueField));
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.valueField;
            if ((obj3 != null) & com.google.common.util.concurrent.AbstractFuture.notInstanceOfDelegatingToFuture(obj3)) {
                return (V) com.google.common.util.concurrent.AbstractFuture.getDoneValue(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = nanoTime - java.lang.System.nanoTime();
        }
        java.lang.String obj4 = toString();
        java.lang.String lowerCase = timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase(java.util.Locale.ROOT));
        java.lang.String obj5 = sb.toString();
        if (nanos + 1000 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj5);
            sb2.append(" (plus ");
            java.lang.String obj6 = sb2.toString();
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(obj6);
                sb3.append(convert);
                sb3.append(" ");
                sb3.append(lowerCase);
                java.lang.String obj7 = sb3.toString();
                if (z) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(obj7);
                    sb4.append(",");
                    obj7 = sb4.toString();
                }
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(obj7);
                sb5.append(" ");
                obj6 = sb5.toString();
            }
            if (z) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(obj6);
                sb6.append(nanos2);
                sb6.append(" nanoseconds ");
                obj6 = sb6.toString();
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(obj6);
            sb7.append("delay)");
            obj5 = sb7.toString();
        }
        if (isDone()) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(obj5);
            sb8.append(" but future completed as timeout expired");
            throw new java.util.concurrent.TimeoutException(sb8.toString());
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(obj5);
        sb9.append(" for ");
        sb9.append(obj4);
        throw new java.util.concurrent.TimeoutException(sb9.toString());
    }

    final V blockingGet() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.valueField;
        if ((obj2 != null) & com.google.common.util.concurrent.AbstractFuture.notInstanceOfDelegatingToFuture(obj2)) {
            return (V) com.google.common.util.concurrent.AbstractFuture.getDoneValue(obj2);
        }
        com.google.common.util.concurrent.AbstractFutureState.Waiter waiter = this.waitersField;
        if (waiter != com.google.common.util.concurrent.AbstractFutureState.Waiter.TOMBSTONE) {
            com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2 = new com.google.common.util.concurrent.AbstractFutureState.Waiter();
            do {
                waiter2.setNext(waiter);
                if (casWaiters(waiter, waiter2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            removeWaiter(waiter2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & com.google.common.util.concurrent.AbstractFuture.notInstanceOfDelegatingToFuture(obj)));
                    return (V) com.google.common.util.concurrent.AbstractFuture.getDoneValue(obj);
                }
                waiter = this.waitersField;
            } while (waiter != com.google.common.util.concurrent.AbstractFutureState.Waiter.TOMBSTONE);
        }
        return (V) com.google.common.util.concurrent.AbstractFuture.getDoneValue(java.util.Objects.requireNonNull(this.valueField));
    }

    AbstractFutureState() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.util.concurrent.AbstractFutureState$1] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Exception] */
    static {
        boolean z;
        com.google.common.util.concurrent.AbstractFutureState.AtomicHelper atomicHelper;
        com.google.common.util.concurrent.AbstractFutureState.AtomicHelper unsafeAtomicHelper;
        try {
            z = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (java.lang.SecurityException unused) {
            z = false;
        }
        GENERATE_CANCELLATION_CAUSES = z;
        ?? r1 = 0;
        r1 = 0;
        if (mightBeAndroid()) {
            try {
                unsafeAtomicHelper = new com.google.common.util.concurrent.AbstractFutureState.UnsafeAtomicHelper();
            } catch (java.lang.Error | java.lang.Exception e) {
                e = e;
                try {
                    atomicHelper = new com.google.common.util.concurrent.AbstractFutureState.AtomicReferenceFieldUpdaterAtomicHelper();
                } catch (java.lang.Error | java.lang.Exception e2) {
                    com.google.common.util.concurrent.AbstractFutureState.SynchronizedHelper synchronizedHelper = new com.google.common.util.concurrent.AbstractFutureState.SynchronizedHelper();
                    r1 = e2;
                    atomicHelper = synchronizedHelper;
                }
            }
        } else {
            try {
                unsafeAtomicHelper = new com.google.common.util.concurrent.AbstractFutureState.AtomicReferenceFieldUpdaterAtomicHelper();
            } catch (java.lang.NoClassDefFoundError unused2) {
                unsafeAtomicHelper = new com.google.common.util.concurrent.AbstractFutureState.SynchronizedHelper();
            }
        }
        atomicHelper = unsafeAtomicHelper;
        e = null;
        ATOMIC_HELPER = atomicHelper;
        if (r1 != 0) {
            com.google.common.util.concurrent.LazyLogger lazyLogger = log;
            lazyLogger.get().log(java.util.logging.Level.SEVERE, "UnsafeAtomicHelper is broken!", e);
            lazyLogger.get().log(java.util.logging.Level.SEVERE, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", r1);
        }
    }

    static final class Waiter {
        static final com.google.common.util.concurrent.AbstractFutureState.Waiter TOMBSTONE = new com.google.common.util.concurrent.AbstractFutureState.Waiter(false);
        volatile com.google.common.util.concurrent.AbstractFutureState.Waiter next;
        volatile java.lang.Thread thread;

        Waiter(boolean z) {
        }

        Waiter() {
            com.google.common.util.concurrent.AbstractFutureState.putThread(this, java.lang.Thread.currentThread());
        }

        final void setNext(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter) {
            com.google.common.util.concurrent.AbstractFutureState.putNext(this, waiter);
        }

        final void unpark() {
            java.lang.Thread thread = this.thread;
            if (thread != null) {
                this.thread = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putThread(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, java.lang.Thread thread) {
        ATOMIC_HELPER.putThread(waiter, thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putNext(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2) {
        ATOMIC_HELPER.putNext(waiter, waiter2);
    }

    private boolean casWaiters(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2) {
        return ATOMIC_HELPER.casWaiters(this, waiter, waiter2);
    }

    private final com.google.common.util.concurrent.AbstractFutureState.Waiter gasWaiters(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter) {
        return ATOMIC_HELPER.gasWaiters(this, waiter);
    }

    private void removeWaiter(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter) {
        waiter.thread = null;
        while (true) {
            com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2 = this.waitersField;
            if (waiter2 != com.google.common.util.concurrent.AbstractFutureState.Waiter.TOMBSTONE) {
                com.google.common.util.concurrent.AbstractFutureState.Waiter waiter3 = null;
                while (waiter2 != null) {
                    com.google.common.util.concurrent.AbstractFutureState.Waiter waiter4 = waiter2.next;
                    if (waiter2.thread != null) {
                        waiter3 = waiter2;
                    } else if (waiter3 != null) {
                        waiter3.next = waiter4;
                        if (waiter3.thread == null) {
                            break;
                        }
                    } else if (casWaiters(waiter2, waiter4)) {
                    }
                    waiter2 = waiter4;
                }
                return;
            }
            return;
        }
    }

    static java.lang.String atomicHelperTypeForTest() {
        return ATOMIC_HELPER.atomicHelperTypeForTest();
    }

    static abstract class AtomicHelper {
        abstract java.lang.String atomicHelperTypeForTest();

        abstract boolean casListeners(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFuture.Listener listener, com.google.common.util.concurrent.AbstractFuture.Listener listener2);

        abstract boolean casValue(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, java.lang.Object obj, java.lang.Object obj2);

        abstract boolean casWaiters(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2);

        abstract com.google.common.util.concurrent.AbstractFuture.Listener gasListeners(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFuture.Listener listener);

        abstract com.google.common.util.concurrent.AbstractFutureState.Waiter gasWaiters(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter);

        abstract void putNext(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2);

        abstract void putThread(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, java.lang.Thread thread);

        private AtomicHelper() {
        }
    }

    static final class UnsafeAtomicHelper extends com.google.common.util.concurrent.AbstractFutureState.AtomicHelper {
        static final long LISTENERS_OFFSET;
        static final sun.misc.Unsafe UNSAFE;
        static final long VALUE_OFFSET;
        static final long WAITERS_OFFSET;
        static final long WAITER_NEXT_OFFSET;
        static final long WAITER_THREAD_OFFSET;

        private UnsafeAtomicHelper() {
            super();
        }

        static {
            sun.misc.Unsafe unsafe;
            try {
                try {
                    unsafe = sun.misc.Unsafe.getUnsafe();
                } catch (java.security.PrivilegedActionException e) {
                    throw new java.lang.RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (java.lang.SecurityException unused) {
                unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction() { // from class: com.google.common.util.concurrent.AbstractFutureState$UnsafeAtomicHelper$$ExternalSyntheticLambda0
                    @Override // java.security.PrivilegedExceptionAction
                    public final java.lang.Object run() {
                        return com.google.common.util.concurrent.AbstractFutureState.UnsafeAtomicHelper.lambda$static$0();
                    }
                });
            }
            try {
                WAITERS_OFFSET = unsafe.objectFieldOffset(com.google.common.util.concurrent.AbstractFutureState.class.getDeclaredField("waitersField"));
                LISTENERS_OFFSET = unsafe.objectFieldOffset(com.google.common.util.concurrent.AbstractFutureState.class.getDeclaredField("listenersField"));
                VALUE_OFFSET = unsafe.objectFieldOffset(com.google.common.util.concurrent.AbstractFutureState.class.getDeclaredField("valueField"));
                WAITER_THREAD_OFFSET = unsafe.objectFieldOffset(com.google.common.util.concurrent.AbstractFutureState.Waiter.class.getDeclaredField(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.THREAD_NAME));
                WAITER_NEXT_OFFSET = unsafe.objectFieldOffset(com.google.common.util.concurrent.AbstractFutureState.Waiter.class.getDeclaredField(io.ktor.http.LinkHeader.Rel.Next));
                UNSAFE = unsafe;
            } catch (java.lang.NoSuchFieldException e2) {
                throw new java.lang.RuntimeException(e2);
            }
        }

        static /* synthetic */ sun.misc.Unsafe lambda$static$0() throws java.lang.Exception {
            for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                java.lang.Object obj = field.get(null);
                if (sun.misc.Unsafe.class.isInstance(obj)) {
                    return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
                }
            }
            throw new java.lang.NoSuchFieldError("the Unsafe");
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final void putThread(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, java.lang.Thread thread) {
            UNSAFE.putObject(waiter, WAITER_THREAD_OFFSET, thread);
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final void putNext(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2) {
            UNSAFE.putObject(waiter, WAITER_NEXT_OFFSET, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final boolean casWaiters(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.zzec$$ExternalSyntheticBackportWithForwarding0.m(UNSAFE, abstractFutureState, WAITERS_OFFSET, waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final boolean casListeners(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFuture.Listener listener, com.google.common.util.concurrent.AbstractFuture.Listener listener2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.zzec$$ExternalSyntheticBackportWithForwarding0.m(UNSAFE, abstractFutureState, LISTENERS_OFFSET, listener, listener2);
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final com.google.common.util.concurrent.AbstractFuture.Listener gasListeners(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFuture.Listener listener) {
            com.google.common.util.concurrent.AbstractFuture.Listener listener2;
            do {
                listener2 = abstractFutureState.listenersField;
                if (listener == listener2) {
                    break;
                }
            } while (!casListeners(abstractFutureState, listener2, listener));
            return listener2;
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final com.google.common.util.concurrent.AbstractFutureState.Waiter gasWaiters(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter) {
            com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2;
            do {
                waiter2 = abstractFutureState.waitersField;
                if (waiter == waiter2) {
                    break;
                }
            } while (!casWaiters(abstractFutureState, waiter2, waiter));
            return waiter2;
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final boolean casValue(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, java.lang.Object obj, java.lang.Object obj2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.zzec$$ExternalSyntheticBackportWithForwarding0.m(UNSAFE, abstractFutureState, VALUE_OFFSET, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final java.lang.String atomicHelperTypeForTest() {
            return "UnsafeAtomicHelper";
        }
    }

    static final class AtomicReferenceFieldUpdaterAtomicHelper extends com.google.common.util.concurrent.AbstractFutureState.AtomicHelper {
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFutureState.Waiter, java.lang.Thread> waiterThreadUpdater = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AbstractFutureState.Waiter.class, java.lang.Thread.class, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.THREAD_NAME);
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFutureState.Waiter, com.google.common.util.concurrent.AbstractFutureState.Waiter> waiterNextUpdater = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AbstractFutureState.Waiter.class, com.google.common.util.concurrent.AbstractFutureState.Waiter.class, io.ktor.http.LinkHeader.Rel.Next);
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.common.util.concurrent.AbstractFutureState<?>, com.google.common.util.concurrent.AbstractFutureState.Waiter> waitersUpdater = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AbstractFutureState.class, com.google.common.util.concurrent.AbstractFutureState.Waiter.class, "waitersField");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.common.util.concurrent.AbstractFutureState<?>, com.google.common.util.concurrent.AbstractFuture.Listener> listenersUpdater = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AbstractFutureState.class, com.google.common.util.concurrent.AbstractFuture.Listener.class, "listenersField");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.common.util.concurrent.AbstractFutureState<?>, java.lang.Object> valueUpdater = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AbstractFutureState.class, java.lang.Object.class, "valueField");

        private AtomicReferenceFieldUpdaterAtomicHelper() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final void putThread(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, java.lang.Thread thread) {
            waiterThreadUpdater.lazySet(waiter, thread);
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final void putNext(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2) {
            waiterNextUpdater.lazySet(waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final boolean casWaiters(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(waitersUpdater, abstractFutureState, waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final boolean casListeners(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFuture.Listener listener, com.google.common.util.concurrent.AbstractFuture.Listener listener2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(listenersUpdater, abstractFutureState, listener, listener2);
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final com.google.common.util.concurrent.AbstractFuture.Listener gasListeners(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFuture.Listener listener) {
            return listenersUpdater.getAndSet(abstractFutureState, listener);
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final com.google.common.util.concurrent.AbstractFutureState.Waiter gasWaiters(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter) {
            return waitersUpdater.getAndSet(abstractFutureState, waiter);
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final boolean casValue(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, java.lang.Object obj, java.lang.Object obj2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(valueUpdater, abstractFutureState, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final java.lang.String atomicHelperTypeForTest() {
            return "AtomicReferenceFieldUpdaterAtomicHelper";
        }
    }

    static final class SynchronizedHelper extends com.google.common.util.concurrent.AbstractFutureState.AtomicHelper {
        private SynchronizedHelper() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final void putThread(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, java.lang.Thread thread) {
            waiter.thread = thread;
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final void putNext(com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2) {
            waiter.next = waiter2;
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final boolean casWaiters(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2) {
            synchronized (abstractFutureState) {
                if (abstractFutureState.waitersField != waiter) {
                    return false;
                }
                abstractFutureState.waitersField = waiter2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final boolean casListeners(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFuture.Listener listener, com.google.common.util.concurrent.AbstractFuture.Listener listener2) {
            synchronized (abstractFutureState) {
                if (abstractFutureState.listenersField != listener) {
                    return false;
                }
                abstractFutureState.listenersField = listener2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final com.google.common.util.concurrent.AbstractFuture.Listener gasListeners(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFuture.Listener listener) {
            com.google.common.util.concurrent.AbstractFuture.Listener listener2;
            synchronized (abstractFutureState) {
                listener2 = abstractFutureState.listenersField;
                if (listener2 != listener) {
                    abstractFutureState.listenersField = listener;
                }
            }
            return listener2;
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final com.google.common.util.concurrent.AbstractFutureState.Waiter gasWaiters(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, com.google.common.util.concurrent.AbstractFutureState.Waiter waiter) {
            com.google.common.util.concurrent.AbstractFutureState.Waiter waiter2;
            synchronized (abstractFutureState) {
                waiter2 = abstractFutureState.waitersField;
                if (waiter2 != waiter) {
                    abstractFutureState.waitersField = waiter;
                }
            }
            return waiter2;
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final boolean casValue(com.google.common.util.concurrent.AbstractFutureState<?> abstractFutureState, java.lang.Object obj, java.lang.Object obj2) {
            synchronized (abstractFutureState) {
                if (abstractFutureState.valueField != obj) {
                    return false;
                }
                abstractFutureState.valueField = obj2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFutureState.AtomicHelper
        final java.lang.String atomicHelperTypeForTest() {
            return "SynchronizedHelper";
        }
    }

    private static boolean mightBeAndroid() {
        java.lang.String property = java.lang.System.getProperty("java.runtime.name", "");
        return property == null || property.contains("Android");
    }
}

package androidx.concurrent.futures;

/* loaded from: classes.dex */
public abstract class AbstractResolvableFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    static final androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper ATOMIC_HELPER;
    private static final java.lang.Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile androidx.concurrent.futures.AbstractResolvableFuture.Listener listeners;
    volatile java.lang.Object value;
    volatile androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(androidx.concurrent.futures.AbstractResolvableFuture.class.getName());

    static <T> T checkNotNull(T t) {
        return t;
    }

    protected void afterDone() {
    }

    protected void interruptTask() {
    }

    static {
        androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new androidx.concurrent.futures.AbstractResolvableFuture.SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class, java.lang.Thread.class, "getHighSpeedVideoFpsRangesFor"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class, androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class, "getHighSpeedVideoFpsRanges"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.AbstractResolvableFuture.class, androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class, "waiters"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.AbstractResolvableFuture.class, androidx.concurrent.futures.AbstractResolvableFuture.Listener.class, "listeners"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.AbstractResolvableFuture.class, java.lang.Object.class, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            synchronizedHelper = new androidx.concurrent.futures.AbstractResolvableFuture.SynchronizedHelper();
        }
        ATOMIC_HELPER = synchronizedHelper;
        if (th != null) {
            log.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new java.lang.Object();
    }

    /* loaded from: classes3.dex */
    static final class Waiter {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Waiter getHighSpeedVideoSizes = new androidx.concurrent.futures.AbstractResolvableFuture.Waiter((byte) 0);
        volatile androidx.concurrent.futures.AbstractResolvableFuture.Waiter getHighSpeedVideoFpsRanges;
        volatile java.lang.Thread getHighSpeedVideoFpsRangesFor;

        private Waiter(byte b) {
        }

        Waiter() {
            androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER.getHighSpeedVideoFpsRanges(this, java.lang.Thread.currentThread());
        }
    }

    private void removeWaiter(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter) {
        waiter.getHighSpeedVideoFpsRangesFor = null;
        while (true) {
            androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2 = this.waiters;
            if (waiter2 != androidx.concurrent.futures.AbstractResolvableFuture.Waiter.getHighSpeedVideoSizes) {
                androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter3 = null;
                while (waiter2 != null) {
                    androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter4 = waiter2.getHighSpeedVideoFpsRanges;
                    if (waiter2.getHighSpeedVideoFpsRangesFor != null) {
                        waiter3 = waiter2;
                    } else if (waiter3 != null) {
                        waiter3.getHighSpeedVideoFpsRanges = waiter4;
                        if (waiter3.getHighSpeedVideoFpsRangesFor == null) {
                            break;
                        }
                    } else if (ATOMIC_HELPER.getHighResolutionOutputSizeshNQ4ISI((androidx.concurrent.futures.AbstractResolvableFuture<?>) this, waiter2, waiter4)) {
                    }
                    waiter2 = waiter4;
                }
                return;
            }
            return;
        }
    }

    /* loaded from: classes3.dex */
    static final class Listener {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Listener getHighSpeedVideoFpsRangesFor = new androidx.concurrent.futures.AbstractResolvableFuture.Listener(null, null);
        final java.util.concurrent.Executor Camera2StreamConfigurationMap;
        final java.lang.Runnable getHighSpeedVideoFpsRanges;
        androidx.concurrent.futures.AbstractResolvableFuture.Listener getHighSpeedVideoSizes;

        Listener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.getHighSpeedVideoFpsRanges = runnable;
            this.Camera2StreamConfigurationMap = executor;
        }
    }

    /* loaded from: classes3.dex */
    static final class Failure {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Failure getHighSpeedVideoFpsRangesFor = new androidx.concurrent.futures.AbstractResolvableFuture.Failure(new java.lang.Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
            @Override // java.lang.Throwable
            public java.lang.Throwable fillInStackTrace() {
                synchronized (this) {
                }
                return this;
            }
        });
        final java.lang.Throwable getHighSpeedVideoSizes;

        Failure(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = (java.lang.Throwable) androidx.concurrent.futures.AbstractResolvableFuture.checkNotNull(th);
        }
    }

    /* loaded from: classes3.dex */
    static final class Cancellation {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Cancellation getHighResolutionOutputSizeshNQ4ISI;
        static final androidx.concurrent.futures.AbstractResolvableFuture.Cancellation getHighSpeedVideoSizes;
        final boolean Camera2StreamConfigurationMap;
        final java.lang.Throwable getHighSpeedVideoFpsRanges;

        static {
            if (androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES) {
                getHighResolutionOutputSizeshNQ4ISI = null;
                getHighSpeedVideoSizes = null;
            } else {
                getHighResolutionOutputSizeshNQ4ISI = new androidx.concurrent.futures.AbstractResolvableFuture.Cancellation(false, null);
                getHighSpeedVideoSizes = new androidx.concurrent.futures.AbstractResolvableFuture.Cancellation(true, null);
            }
        }

        Cancellation(boolean z, java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = z;
            this.getHighSpeedVideoFpsRanges = th;
        }
    }

    /* loaded from: classes3.dex */
    static final class SetFuture<V> implements java.lang.Runnable {
        final androidx.concurrent.futures.AbstractResolvableFuture<V> getHighSpeedVideoFpsRanges;
        final com.google.common.util.concurrent.ListenableFuture<? extends V> getHighSpeedVideoFpsRangesFor;

        SetFuture(androidx.concurrent.futures.AbstractResolvableFuture<V> abstractResolvableFuture, com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture) {
            this.getHighSpeedVideoFpsRanges = abstractResolvableFuture;
            this.getHighSpeedVideoFpsRangesFor = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getHighSpeedVideoFpsRanges.value == this) {
                if (androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this, androidx.concurrent.futures.AbstractResolvableFuture.getFutureValue(this.getHighSpeedVideoFpsRangesFor))) {
                    androidx.concurrent.futures.AbstractResolvableFuture.complete(this.getHighSpeedVideoFpsRanges);
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.value;
        if ((obj != null) & (!(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture))) {
            return getDoneValue(obj);
        }
        long nanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter = this.waiters;
            if (waiter != androidx.concurrent.futures.AbstractResolvableFuture.Waiter.getHighSpeedVideoSizes) {
                androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2 = new androidx.concurrent.futures.AbstractResolvableFuture.Waiter();
                do {
                    androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper atomicHelper = ATOMIC_HELPER;
                    atomicHelper.getHighResolutionOutputSizeshNQ4ISI(waiter2, waiter);
                    if (atomicHelper.getHighResolutionOutputSizeshNQ4ISI((androidx.concurrent.futures.AbstractResolvableFuture<?>) this, waiter, waiter2)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                removeWaiter(waiter2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.value;
                            if ((obj2 != null) & (!(obj2 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture))) {
                                return getDoneValue(obj2);
                            }
                            nanos = nanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(waiter2);
                    } else {
                        waiter = this.waiters;
                    }
                } while (waiter != androidx.concurrent.futures.AbstractResolvableFuture.Waiter.getHighSpeedVideoSizes);
            }
            return getDoneValue(this.value);
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.value;
            if ((obj3 != null) & (!(obj3 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture))) {
                return getDoneValue(obj3);
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

    @Override // java.util.concurrent.Future
    public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.value;
        if ((obj2 != null) & (!(obj2 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture))) {
            return getDoneValue(obj2);
        }
        androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter = this.waiters;
        if (waiter != androidx.concurrent.futures.AbstractResolvableFuture.Waiter.getHighSpeedVideoSizes) {
            androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2 = new androidx.concurrent.futures.AbstractResolvableFuture.Waiter();
            do {
                androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper atomicHelper = ATOMIC_HELPER;
                atomicHelper.getHighResolutionOutputSizeshNQ4ISI(waiter2, waiter);
                if (atomicHelper.getHighResolutionOutputSizeshNQ4ISI((androidx.concurrent.futures.AbstractResolvableFuture<?>) this, waiter, waiter2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            removeWaiter(waiter2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture))));
                    return getDoneValue(obj);
                }
                waiter = this.waiters;
            } while (waiter != androidx.concurrent.futures.AbstractResolvableFuture.Waiter.getHighSpeedVideoSizes);
        }
        return getDoneValue(this.value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) obj).getHighSpeedVideoFpsRanges);
        }
        if (obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.Failure) {
            throw new java.util.concurrent.ExecutionException(((androidx.concurrent.futures.AbstractResolvableFuture.Failure) obj).getHighSpeedVideoSizes);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture)) & (this.value != null);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z) {
        androidx.concurrent.futures.AbstractResolvableFuture.Cancellation cancellation;
        java.lang.Object obj = this.value;
        if (!(obj == null) && !(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            cancellation = new androidx.concurrent.futures.AbstractResolvableFuture.Cancellation(z, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else if (z) {
            cancellation = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.getHighSpeedVideoSizes;
        } else {
            cancellation = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.getHighResolutionOutputSizeshNQ4ISI;
        }
        androidx.concurrent.futures.AbstractResolvableFuture<V> abstractResolvableFuture = this;
        boolean z2 = false;
        while (true) {
            if (ATOMIC_HELPER.getHighSpeedVideoFpsRangesFor(abstractResolvableFuture, obj, cancellation)) {
                if (z) {
                    abstractResolvableFuture.interruptTask();
                }
                complete(abstractResolvableFuture);
                if (!(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture)) {
                    break;
                }
                com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = ((androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) obj).getHighSpeedVideoFpsRangesFor;
                if (listenableFuture instanceof androidx.concurrent.futures.AbstractResolvableFuture) {
                    abstractResolvableFuture = (androidx.concurrent.futures.AbstractResolvableFuture) listenableFuture;
                    obj = abstractResolvableFuture.value;
                    if (!(obj == null) && !(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture)) {
                        break;
                    }
                    z2 = true;
                } else {
                    listenableFuture.cancel(z);
                    break;
                }
            } else {
                obj = abstractResolvableFuture.value;
                if (!(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture)) {
                    return z2;
                }
            }
        }
    }

    protected final boolean wasInterrupted() {
        java.lang.Object obj = this.value;
        return (obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) && ((androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) obj).Camera2StreamConfigurationMap;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        androidx.concurrent.futures.AbstractResolvableFuture.Listener listener = this.listeners;
        if (listener != androidx.concurrent.futures.AbstractResolvableFuture.Listener.getHighSpeedVideoFpsRangesFor) {
            androidx.concurrent.futures.AbstractResolvableFuture.Listener listener2 = new androidx.concurrent.futures.AbstractResolvableFuture.Listener(runnable, executor);
            do {
                listener2.getHighSpeedVideoSizes = listener;
                if (ATOMIC_HELPER.getHighResolutionOutputSizeshNQ4ISI((androidx.concurrent.futures.AbstractResolvableFuture<?>) this, listener, listener2)) {
                    return;
                } else {
                    listener = this.listeners;
                }
            } while (listener != androidx.concurrent.futures.AbstractResolvableFuture.Listener.getHighSpeedVideoFpsRangesFor);
        }
        executeListener(runnable, executor);
    }

    public boolean set(V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (!ATOMIC_HELPER.getHighSpeedVideoFpsRangesFor(this, null, v)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(java.lang.Throwable th) {
        if (!ATOMIC_HELPER.getHighSpeedVideoFpsRangesFor(this, null, new androidx.concurrent.futures.AbstractResolvableFuture.Failure((java.lang.Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    protected boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture) {
        androidx.concurrent.futures.AbstractResolvableFuture.Failure failure;
        checkNotNull(listenableFuture);
        java.lang.Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!ATOMIC_HELPER.getHighSpeedVideoFpsRangesFor(this, null, getFutureValue(listenableFuture))) {
                    return false;
                }
                complete(this);
                return true;
            }
            androidx.concurrent.futures.AbstractResolvableFuture.SetFuture setFuture = new androidx.concurrent.futures.AbstractResolvableFuture.SetFuture(this, listenableFuture);
            if (ATOMIC_HELPER.getHighSpeedVideoFpsRangesFor(this, null, setFuture)) {
                try {
                    listenableFuture.addListener(setFuture, androidx.concurrent.futures.DirectExecutor.INSTANCE);
                } catch (java.lang.Throwable th) {
                    try {
                        failure = new androidx.concurrent.futures.AbstractResolvableFuture.Failure(th);
                    } catch (java.lang.Throwable unused) {
                        failure = androidx.concurrent.futures.AbstractResolvableFuture.Failure.getHighSpeedVideoFpsRangesFor;
                    }
                    ATOMIC_HELPER.getHighSpeedVideoFpsRangesFor(this, setFuture, failure);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) {
            listenableFuture.cancel(((androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) obj).Camera2StreamConfigurationMap);
        }
        return false;
    }

    static java.lang.Object getFutureValue(com.google.common.util.concurrent.ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof androidx.concurrent.futures.AbstractResolvableFuture) {
            java.lang.Object obj = ((androidx.concurrent.futures.AbstractResolvableFuture) listenableFuture).value;
            if (!(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation)) {
                return obj;
            }
            androidx.concurrent.futures.AbstractResolvableFuture.Cancellation cancellation = (androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) obj;
            return cancellation.Camera2StreamConfigurationMap ? cancellation.getHighSpeedVideoFpsRanges != null ? new androidx.concurrent.futures.AbstractResolvableFuture.Cancellation(false, cancellation.getHighSpeedVideoFpsRanges) : androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.getHighResolutionOutputSizeshNQ4ISI : obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) & isCancelled) {
            return androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.getHighResolutionOutputSizeshNQ4ISI;
        }
        try {
            java.lang.Object uninterruptibly = getUninterruptibly(listenableFuture);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (java.util.concurrent.CancellationException e) {
            if (!isCancelled) {
                return new androidx.concurrent.futures.AbstractResolvableFuture.Failure(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(java.lang.String.valueOf(listenableFuture)), e));
            }
            return new androidx.concurrent.futures.AbstractResolvableFuture.Cancellation(false, e);
        } catch (java.util.concurrent.ExecutionException e2) {
            return new androidx.concurrent.futures.AbstractResolvableFuture.Failure(e2.getCause());
        } catch (java.lang.Throwable th) {
            return new androidx.concurrent.futures.AbstractResolvableFuture.Failure(th);
        }
    }

    static <V> V getUninterruptibly(java.util.concurrent.Future<V> future) throws java.util.concurrent.ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return v;
    }

    static void complete(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture) {
        androidx.concurrent.futures.AbstractResolvableFuture.Listener listener = null;
        while (true) {
            abstractResolvableFuture.releaseWaiters();
            abstractResolvableFuture.afterDone();
            androidx.concurrent.futures.AbstractResolvableFuture.Listener clearListeners = abstractResolvableFuture.clearListeners(listener);
            while (clearListeners != null) {
                listener = clearListeners.getHighSpeedVideoSizes;
                java.lang.Runnable runnable = clearListeners.getHighSpeedVideoFpsRanges;
                if (runnable instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) {
                    androidx.concurrent.futures.AbstractResolvableFuture.SetFuture setFuture = (androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) runnable;
                    abstractResolvableFuture = setFuture.getHighSpeedVideoFpsRanges;
                    if (abstractResolvableFuture.value == setFuture) {
                        if (ATOMIC_HELPER.getHighSpeedVideoFpsRangesFor(abstractResolvableFuture, setFuture, getFutureValue(setFuture.getHighSpeedVideoFpsRangesFor))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, clearListeners.Camera2StreamConfigurationMap);
                }
                clearListeners = listener;
            }
            return;
        }
    }

    final void maybePropagateCancellationTo(java.util.concurrent.Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    private void releaseWaiters() {
        androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter;
        do {
            waiter = this.waiters;
        } while (!ATOMIC_HELPER.getHighResolutionOutputSizeshNQ4ISI((androidx.concurrent.futures.AbstractResolvableFuture<?>) this, waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter.getHighSpeedVideoSizes));
        while (waiter != null) {
            java.lang.Thread thread = waiter.getHighSpeedVideoFpsRangesFor;
            if (thread != null) {
                waiter.getHighSpeedVideoFpsRangesFor = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
            waiter = waiter.getHighSpeedVideoFpsRanges;
        }
    }

    private androidx.concurrent.futures.AbstractResolvableFuture.Listener clearListeners(androidx.concurrent.futures.AbstractResolvableFuture.Listener listener) {
        androidx.concurrent.futures.AbstractResolvableFuture.Listener listener2;
        do {
            listener2 = this.listeners;
        } while (!ATOMIC_HELPER.getHighResolutionOutputSizeshNQ4ISI((androidx.concurrent.futures.AbstractResolvableFuture<?>) this, listener2, androidx.concurrent.futures.AbstractResolvableFuture.Listener.getHighSpeedVideoFpsRangesFor));
        androidx.concurrent.futures.AbstractResolvableFuture.Listener listener3 = listener;
        androidx.concurrent.futures.AbstractResolvableFuture.Listener listener4 = listener2;
        while (listener4 != null) {
            androidx.concurrent.futures.AbstractResolvableFuture.Listener listener5 = listener4.getHighSpeedVideoSizes;
            listener4.getHighSpeedVideoSizes = listener3;
            listener3 = listener4;
            listener4 = listener5;
        }
        return listener3;
    }

    public java.lang.String toString() {
        java.lang.String obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            try {
                obj = pendingToString();
            } catch (java.lang.RuntimeException e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Exception thrown from implementation: ");
                sb2.append(e.getClass());
                obj = sb2.toString();
            }
            if (obj != null && !obj.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(obj);
                sb.append("]");
            } else if (isDone()) {
                addDoneString(sb);
            } else {
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String pendingToString() {
        java.lang.Object obj = this.value;
        if (obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("setFuture=[");
            sb.append(userObjectToString(((androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) obj).getHighSpeedVideoFpsRangesFor));
            sb.append("]");
            return sb.toString();
        }
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("remaining delay=[");
        sb2.append(((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
        sb2.append(" ms]");
        return sb2.toString();
    }

    private void addDoneString(java.lang.StringBuilder sb) {
        try {
            java.lang.Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(userObjectToString(uninterruptibly));
            sb.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        } catch (java.lang.RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (java.util.concurrent.ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private java.lang.String userObjectToString(java.lang.Object obj) {
        if (obj == this) {
            return "this future";
        }
        return java.lang.String.valueOf(obj);
    }

    private static void executeListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e) {
            java.util.logging.Logger logger = log;
            java.util.logging.Level level = java.util.logging.Level.SEVERE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), (java.lang.Throwable) e);
        }
    }

    /* loaded from: classes3.dex */
    static abstract class AtomicHelper {
        abstract void getHighResolutionOutputSizeshNQ4ISI(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2);

        abstract boolean getHighResolutionOutputSizeshNQ4ISI(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener listener, androidx.concurrent.futures.AbstractResolvableFuture.Listener listener2);

        abstract boolean getHighResolutionOutputSizeshNQ4ISI(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2);

        abstract void getHighSpeedVideoFpsRanges(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, java.lang.Thread thread);

        abstract boolean getHighSpeedVideoFpsRangesFor(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, java.lang.Object obj, java.lang.Object obj2);

        private AtomicHelper() {
        }

        /* synthetic */ AtomicHelper(byte b) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    static final class SafeAtomicHelper extends androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper {
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener> Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, java.lang.Object> getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, java.lang.Thread> getHighSpeedVideoSizes;

        SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, java.lang.Thread> atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener> atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, java.lang.Object> atomicReferenceFieldUpdater5) {
            super((byte) 0);
            this.getHighSpeedVideoSizes = atomicReferenceFieldUpdater;
            this.getHighResolutionOutputSizeshNQ4ISI = atomicReferenceFieldUpdater2;
            this.getHighSpeedVideoFpsRangesFor = atomicReferenceFieldUpdater3;
            this.Camera2StreamConfigurationMap = atomicReferenceFieldUpdater4;
            this.getHighSpeedVideoFpsRanges = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        final void getHighSpeedVideoFpsRanges(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, java.lang.Thread thread) {
            this.getHighSpeedVideoSizes.lazySet(waiter, thread);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        final void getHighResolutionOutputSizeshNQ4ISI(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2) {
            this.getHighResolutionOutputSizeshNQ4ISI.lazySet(waiter, waiter2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, abstractResolvableFuture, waiter, waiter2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener listener, androidx.concurrent.futures.AbstractResolvableFuture.Listener listener2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, abstractResolvableFuture, listener, listener2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        final boolean getHighSpeedVideoFpsRangesFor(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, java.lang.Object obj, java.lang.Object obj2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, abstractResolvableFuture, obj, obj2);
        }
    }

    /* loaded from: classes3.dex */
    static final class SynchronizedHelper extends androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper {
        SynchronizedHelper() {
            super((byte) 0);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        final void getHighSpeedVideoFpsRanges(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, java.lang.Thread thread) {
            waiter.getHighSpeedVideoFpsRangesFor = thread;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        final void getHighResolutionOutputSizeshNQ4ISI(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2) {
            waiter.getHighSpeedVideoFpsRanges = waiter2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.waiters != waiter) {
                    return false;
                }
                abstractResolvableFuture.waiters = waiter2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener listener, androidx.concurrent.futures.AbstractResolvableFuture.Listener listener2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.listeners != listener) {
                    return false;
                }
                abstractResolvableFuture.listeners = listener2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        final boolean getHighSpeedVideoFpsRangesFor(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, java.lang.Object obj, java.lang.Object obj2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.value != obj) {
                    return false;
                }
                abstractResolvableFuture.value = obj2;
                return true;
            }
        }
    }

    private static java.util.concurrent.CancellationException cancellationExceptionWithCause(java.lang.String str, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}

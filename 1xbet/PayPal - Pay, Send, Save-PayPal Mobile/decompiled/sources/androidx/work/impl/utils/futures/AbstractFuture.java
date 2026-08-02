package androidx.work.impl.utils.futures;

/* loaded from: classes7.dex */
public abstract class AbstractFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    static final androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.Object getInputSizeshNQ4ISI;
    volatile java.lang.Object Camera2StreamConfigurationMap;
    volatile androidx.work.impl.utils.futures.AbstractFuture.Listener getHighSpeedVideoFpsRangesFor;
    volatile androidx.work.impl.utils.futures.AbstractFuture.Waiter getHighSpeedVideoSizes;
    static final boolean getHighSpeedVideoFpsRanges = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final java.util.logging.Logger getOutputFormats = java.util.logging.Logger.getLogger(androidx.work.impl.utils.futures.AbstractFuture.class.getName());

    static <T> T Camera2StreamConfigurationMap(T t) {
        return t;
    }

    protected void afterDone() {
    }

    protected void interruptTask() {
    }

    static {
        androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new androidx.work.impl.utils.futures.AbstractFuture.SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.AbstractFuture.Waiter.class, java.lang.Thread.class, "getHighSpeedVideoSizes"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.AbstractFuture.Waiter.class, androidx.work.impl.utils.futures.AbstractFuture.Waiter.class, "getHighResolutionOutputSizeshNQ4ISI"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.AbstractFuture.class, androidx.work.impl.utils.futures.AbstractFuture.Waiter.class, "getHighSpeedVideoSizes"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.AbstractFuture.class, androidx.work.impl.utils.futures.AbstractFuture.Listener.class, "getHighSpeedVideoFpsRangesFor"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.AbstractFuture.class, java.lang.Object.class, "Camera2StreamConfigurationMap"));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            synchronizedHelper = new androidx.work.impl.utils.futures.AbstractFuture.SynchronizedHelper();
        }
        getHighResolutionOutputSizeshNQ4ISI = synchronizedHelper;
        if (th != null) {
            getOutputFormats.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        getInputSizeshNQ4ISI = new java.lang.Object();
    }

    static final class Waiter {
        static final androidx.work.impl.utils.futures.AbstractFuture.Waiter getHighSpeedVideoFpsRangesFor = new androidx.work.impl.utils.futures.AbstractFuture.Waiter((byte) 0);
        volatile androidx.work.impl.utils.futures.AbstractFuture.Waiter getHighResolutionOutputSizeshNQ4ISI;
        volatile java.lang.Thread getHighSpeedVideoSizes;

        private Waiter(byte b) {
        }

        Waiter() {
            androidx.work.impl.utils.futures.AbstractFuture.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(this, java.lang.Thread.currentThread());
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter) {
        waiter.getHighSpeedVideoSizes = null;
        while (true) {
            androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter2 = this.getHighSpeedVideoSizes;
            if (waiter2 != androidx.work.impl.utils.futures.AbstractFuture.Waiter.getHighSpeedVideoFpsRangesFor) {
                androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter3 = null;
                while (waiter2 != null) {
                    androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter4 = waiter2.getHighResolutionOutputSizeshNQ4ISI;
                    if (waiter2.getHighSpeedVideoSizes != null) {
                        waiter3 = waiter2;
                    } else if (waiter3 != null) {
                        waiter3.getHighResolutionOutputSizeshNQ4ISI = waiter4;
                        if (waiter3.getHighSpeedVideoSizes == null) {
                            break;
                        }
                    } else if (getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this, waiter2, waiter4)) {
                    }
                    waiter2 = waiter4;
                }
                return;
            }
            return;
        }
    }

    static final class Listener {
        static final androidx.work.impl.utils.futures.AbstractFuture.Listener getHighResolutionOutputSizeshNQ4ISI = new androidx.work.impl.utils.futures.AbstractFuture.Listener(null, null);
        final java.util.concurrent.Executor Camera2StreamConfigurationMap;
        final java.lang.Runnable getHighSpeedVideoFpsRangesFor;
        androidx.work.impl.utils.futures.AbstractFuture.Listener getHighSpeedVideoSizes;

        Listener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.getHighSpeedVideoFpsRangesFor = runnable;
            this.Camera2StreamConfigurationMap = executor;
        }
    }

    static final class Failure {
        static final androidx.work.impl.utils.futures.AbstractFuture.Failure Camera2StreamConfigurationMap = new androidx.work.impl.utils.futures.AbstractFuture.Failure(new java.lang.Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.work.impl.utils.futures.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public java.lang.Throwable fillInStackTrace() {
                synchronized (this) {
                }
                return this;
            }
        });
        final java.lang.Throwable getHighSpeedVideoFpsRanges;

        Failure(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = (java.lang.Throwable) androidx.work.impl.utils.futures.AbstractFuture.Camera2StreamConfigurationMap(th);
        }
    }

    static final class Cancellation {
        static final androidx.work.impl.utils.futures.AbstractFuture.Cancellation getHighResolutionOutputSizeshNQ4ISI;
        static final androidx.work.impl.utils.futures.AbstractFuture.Cancellation getHighSpeedVideoSizes;
        final java.lang.Throwable Camera2StreamConfigurationMap;
        final boolean getHighSpeedVideoFpsRangesFor;

        static {
            if (androidx.work.impl.utils.futures.AbstractFuture.getHighSpeedVideoFpsRanges) {
                getHighResolutionOutputSizeshNQ4ISI = null;
                getHighSpeedVideoSizes = null;
            } else {
                getHighResolutionOutputSizeshNQ4ISI = new androidx.work.impl.utils.futures.AbstractFuture.Cancellation(false, null);
                getHighSpeedVideoSizes = new androidx.work.impl.utils.futures.AbstractFuture.Cancellation(true, null);
            }
        }

        Cancellation(boolean z, java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor = z;
            this.Camera2StreamConfigurationMap = th;
        }
    }

    static final class SetFuture<V> implements java.lang.Runnable {
        final androidx.work.impl.utils.futures.AbstractFuture<V> Camera2StreamConfigurationMap;
        final com.google.common.util.concurrent.ListenableFuture<? extends V> getHighResolutionOutputSizeshNQ4ISI;

        SetFuture(androidx.work.impl.utils.futures.AbstractFuture<V> abstractFuture, com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture) {
            this.Camera2StreamConfigurationMap = abstractFuture;
            this.getHighResolutionOutputSizeshNQ4ISI = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap == this) {
                if (androidx.work.impl.utils.futures.AbstractFuture.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap((androidx.work.impl.utils.futures.AbstractFuture<?>) this.Camera2StreamConfigurationMap, (java.lang.Object) this, androidx.work.impl.utils.futures.AbstractFuture.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI))) {
                    androidx.work.impl.utils.futures.AbstractFuture.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
                }
            }
        }
    }

    protected AbstractFuture() {
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        if ((obj != null) & (!(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture))) {
            return (V) getHighResolutionOutputSizeshNQ4ISI(obj);
        }
        long nanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter = this.getHighSpeedVideoSizes;
            if (waiter != androidx.work.impl.utils.futures.AbstractFuture.Waiter.getHighSpeedVideoFpsRangesFor) {
                androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter2 = new androidx.work.impl.utils.futures.AbstractFuture.Waiter();
                do {
                    androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper atomicHelper = getHighResolutionOutputSizeshNQ4ISI;
                    atomicHelper.getHighSpeedVideoFpsRangesFor(waiter2, waiter);
                    if (atomicHelper.getHighSpeedVideoSizes(this, waiter, waiter2)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                getHighResolutionOutputSizeshNQ4ISI(waiter2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
                            if ((obj2 != null) & (!(obj2 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture))) {
                                return (V) getHighResolutionOutputSizeshNQ4ISI(obj2);
                            }
                            nanos = nanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        getHighResolutionOutputSizeshNQ4ISI(waiter2);
                    } else {
                        waiter = this.getHighSpeedVideoSizes;
                    }
                } while (waiter != androidx.work.impl.utils.futures.AbstractFuture.Waiter.getHighSpeedVideoFpsRangesFor);
            }
            return (V) getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap);
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.Camera2StreamConfigurationMap;
            if ((obj3 != null) & (!(obj3 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture))) {
                return (V) getHighResolutionOutputSizeshNQ4ISI(obj3);
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
        java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
        if ((obj2 != null) & (!(obj2 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture))) {
            return (V) getHighResolutionOutputSizeshNQ4ISI(obj2);
        }
        androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter = this.getHighSpeedVideoSizes;
        if (waiter != androidx.work.impl.utils.futures.AbstractFuture.Waiter.getHighSpeedVideoFpsRangesFor) {
            androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter2 = new androidx.work.impl.utils.futures.AbstractFuture.Waiter();
            do {
                androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper atomicHelper = getHighResolutionOutputSizeshNQ4ISI;
                atomicHelper.getHighSpeedVideoFpsRangesFor(waiter2, waiter);
                if (atomicHelper.getHighSpeedVideoSizes(this, waiter, waiter2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            getHighResolutionOutputSizeshNQ4ISI(waiter2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.Camera2StreamConfigurationMap;
                    } while (!((obj != null) & (!(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture))));
                    return (V) getHighResolutionOutputSizeshNQ4ISI(obj);
                }
                waiter = this.getHighSpeedVideoSizes;
            } while (waiter != androidx.work.impl.utils.futures.AbstractFuture.Waiter.getHighSpeedVideoFpsRangesFor);
        }
        return (V) getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static V getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation) {
            java.lang.Throwable th = ((androidx.work.impl.utils.futures.AbstractFuture.Cancellation) obj).Camera2StreamConfigurationMap;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof androidx.work.impl.utils.futures.AbstractFuture.Failure) {
            throw new java.util.concurrent.ExecutionException(((androidx.work.impl.utils.futures.AbstractFuture.Failure) obj).getHighSpeedVideoFpsRanges);
        }
        if (obj == getInputSizeshNQ4ISI) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture)) & (this.Camera2StreamConfigurationMap != null);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.Camera2StreamConfigurationMap instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z) {
        androidx.work.impl.utils.futures.AbstractFuture.Cancellation cancellation;
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        if (!(obj == null) && !(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture)) {
            return false;
        }
        if (getHighSpeedVideoFpsRanges) {
            cancellation = new androidx.work.impl.utils.futures.AbstractFuture.Cancellation(z, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else if (z) {
            cancellation = androidx.work.impl.utils.futures.AbstractFuture.Cancellation.getHighSpeedVideoSizes;
        } else {
            cancellation = androidx.work.impl.utils.futures.AbstractFuture.Cancellation.getHighResolutionOutputSizeshNQ4ISI;
        }
        androidx.work.impl.utils.futures.AbstractFuture<V> abstractFuture = this;
        boolean z2 = false;
        while (true) {
            if (getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap((androidx.work.impl.utils.futures.AbstractFuture<?>) abstractFuture, obj, (java.lang.Object) cancellation)) {
                if (z) {
                    abstractFuture.interruptTask();
                }
                getHighSpeedVideoFpsRangesFor(abstractFuture);
                if (!(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture)) {
                    break;
                }
                com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = ((androidx.work.impl.utils.futures.AbstractFuture.SetFuture) obj).getHighResolutionOutputSizeshNQ4ISI;
                if (listenableFuture instanceof androidx.work.impl.utils.futures.AbstractFuture) {
                    abstractFuture = (androidx.work.impl.utils.futures.AbstractFuture) listenableFuture;
                    obj = abstractFuture.Camera2StreamConfigurationMap;
                    if (!(obj == null) && !(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture)) {
                        break;
                    }
                    z2 = true;
                } else {
                    listenableFuture.cancel(z);
                    break;
                }
            } else {
                obj = abstractFuture.Camera2StreamConfigurationMap;
                if (!(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture)) {
                    return z2;
                }
            }
        }
    }

    protected final boolean wasInterrupted() {
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        return (obj instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation) && ((androidx.work.impl.utils.futures.AbstractFuture.Cancellation) obj).getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        androidx.work.impl.utils.futures.AbstractFuture.Listener listener = this.getHighSpeedVideoFpsRangesFor;
        if (listener != androidx.work.impl.utils.futures.AbstractFuture.Listener.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.work.impl.utils.futures.AbstractFuture.Listener listener2 = new androidx.work.impl.utils.futures.AbstractFuture.Listener(runnable, executor);
            do {
                listener2.getHighSpeedVideoSizes = listener;
                if (getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap((androidx.work.impl.utils.futures.AbstractFuture<?>) this, listener, listener2)) {
                    return;
                } else {
                    listener = this.getHighSpeedVideoFpsRangesFor;
                }
            } while (listener != androidx.work.impl.utils.futures.AbstractFuture.Listener.getHighResolutionOutputSizeshNQ4ISI);
        }
        Camera2StreamConfigurationMap(runnable, executor);
    }

    protected boolean set(V v) {
        if (v == null) {
            v = (V) getInputSizeshNQ4ISI;
        }
        if (!getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap((androidx.work.impl.utils.futures.AbstractFuture<?>) this, (java.lang.Object) null, (java.lang.Object) v)) {
            return false;
        }
        getHighSpeedVideoFpsRangesFor(this);
        return true;
    }

    protected boolean setException(java.lang.Throwable th) {
        if (!getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap((androidx.work.impl.utils.futures.AbstractFuture<?>) this, (java.lang.Object) null, (java.lang.Object) new androidx.work.impl.utils.futures.AbstractFuture.Failure(th))) {
            return false;
        }
        getHighSpeedVideoFpsRangesFor(this);
        return true;
    }

    protected boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture) {
        androidx.work.impl.utils.futures.AbstractFuture.Failure failure;
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap((androidx.work.impl.utils.futures.AbstractFuture<?>) this, (java.lang.Object) null, getHighSpeedVideoSizes(listenableFuture))) {
                    return false;
                }
                getHighSpeedVideoFpsRangesFor(this);
                return true;
            }
            androidx.work.impl.utils.futures.AbstractFuture.SetFuture setFuture = new androidx.work.impl.utils.futures.AbstractFuture.SetFuture(this, listenableFuture);
            if (getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap((androidx.work.impl.utils.futures.AbstractFuture<?>) this, (java.lang.Object) null, (java.lang.Object) setFuture)) {
                try {
                    listenableFuture.addListener(setFuture, androidx.work.impl.utils.futures.DirectExecutor.INSTANCE);
                } catch (java.lang.Throwable th) {
                    try {
                        failure = new androidx.work.impl.utils.futures.AbstractFuture.Failure(th);
                    } catch (java.lang.Throwable unused) {
                        failure = androidx.work.impl.utils.futures.AbstractFuture.Failure.Camera2StreamConfigurationMap;
                    }
                    getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap((androidx.work.impl.utils.futures.AbstractFuture<?>) this, (java.lang.Object) setFuture, (java.lang.Object) failure);
                }
                return true;
            }
            obj = this.Camera2StreamConfigurationMap;
        }
        if (obj instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation) {
            listenableFuture.cancel(((androidx.work.impl.utils.futures.AbstractFuture.Cancellation) obj).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    static java.lang.Object getHighSpeedVideoSizes(com.google.common.util.concurrent.ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof androidx.work.impl.utils.futures.AbstractFuture) {
            java.lang.Object obj = ((androidx.work.impl.utils.futures.AbstractFuture) listenableFuture).Camera2StreamConfigurationMap;
            if (!(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation)) {
                return obj;
            }
            androidx.work.impl.utils.futures.AbstractFuture.Cancellation cancellation = (androidx.work.impl.utils.futures.AbstractFuture.Cancellation) obj;
            return cancellation.getHighSpeedVideoFpsRangesFor ? cancellation.Camera2StreamConfigurationMap != null ? new androidx.work.impl.utils.futures.AbstractFuture.Cancellation(false, cancellation.Camera2StreamConfigurationMap) : androidx.work.impl.utils.futures.AbstractFuture.Cancellation.getHighResolutionOutputSizeshNQ4ISI : obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!getHighSpeedVideoFpsRanges) & isCancelled) {
            return androidx.work.impl.utils.futures.AbstractFuture.Cancellation.getHighResolutionOutputSizeshNQ4ISI;
        }
        try {
            java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((java.util.concurrent.Future<java.lang.Object>) listenableFuture);
            return highResolutionOutputSizeshNQ4ISI == null ? getInputSizeshNQ4ISI : highResolutionOutputSizeshNQ4ISI;
        } catch (java.util.concurrent.CancellationException e) {
            if (!isCancelled) {
                return new androidx.work.impl.utils.futures.AbstractFuture.Failure(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(java.lang.String.valueOf(listenableFuture)), e));
            }
            return new androidx.work.impl.utils.futures.AbstractFuture.Cancellation(false, e);
        } catch (java.util.concurrent.ExecutionException e2) {
            return new androidx.work.impl.utils.futures.AbstractFuture.Failure(e2.getCause());
        } catch (java.lang.Throwable th) {
            return new androidx.work.impl.utils.futures.AbstractFuture.Failure(th);
        }
    }

    private static <V> V getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.Future<V> future) throws java.util.concurrent.ExecutionException {
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

    public java.lang.String toString() {
        java.lang.String obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        } else if (isDone()) {
            getHighResolutionOutputSizeshNQ4ISI(sb);
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
                getHighResolutionOutputSizeshNQ4ISI(sb);
            } else {
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String pendingToString() {
        java.lang.String valueOf;
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        if (obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("setFuture=[");
            com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = ((androidx.work.impl.utils.futures.AbstractFuture.SetFuture) obj).getHighResolutionOutputSizeshNQ4ISI;
            if (listenableFuture == this) {
                valueOf = "this future";
            } else {
                valueOf = java.lang.String.valueOf(listenableFuture);
            }
            sb.append(valueOf);
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

    private void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb) {
        java.lang.String valueOf;
        try {
            java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((java.util.concurrent.Future<java.lang.Object>) this);
            sb.append("SUCCESS, result=[");
            if (highResolutionOutputSizeshNQ4ISI == this) {
                valueOf = "this future";
            } else {
                valueOf = java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
            sb.append(valueOf);
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

    private static void Camera2StreamConfigurationMap(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e) {
            java.util.logging.Logger logger = getOutputFormats;
            java.util.logging.Level level = java.util.logging.Level.SEVERE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), (java.lang.Throwable) e);
        }
    }

    static abstract class AtomicHelper {
        abstract void Camera2StreamConfigurationMap(androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, java.lang.Thread thread);

        abstract boolean Camera2StreamConfigurationMap(androidx.work.impl.utils.futures.AbstractFuture<?> abstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Listener listener, androidx.work.impl.utils.futures.AbstractFuture.Listener listener2);

        abstract boolean Camera2StreamConfigurationMap(androidx.work.impl.utils.futures.AbstractFuture<?> abstractFuture, java.lang.Object obj, java.lang.Object obj2);

        abstract void getHighSpeedVideoFpsRangesFor(androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter2);

        abstract boolean getHighSpeedVideoSizes(androidx.work.impl.utils.futures.AbstractFuture<?> abstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter2);

        private AtomicHelper() {
        }

        /* synthetic */ AtomicHelper(byte b) {
            this();
        }
    }

    static final class SafeAtomicHelper extends androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper {
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, java.lang.Object> Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture.Waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter> getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Listener> getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture.Waiter, java.lang.Thread> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Waiter> getHighSpeedVideoSizes;

        SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture.Waiter, java.lang.Thread> atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture.Waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter> atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Waiter> atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Listener> atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, java.lang.Object> atomicReferenceFieldUpdater5) {
            super((byte) 0);
            this.getHighSpeedVideoFpsRangesFor = atomicReferenceFieldUpdater;
            this.getHighResolutionOutputSizeshNQ4ISI = atomicReferenceFieldUpdater2;
            this.getHighSpeedVideoSizes = atomicReferenceFieldUpdater3;
            this.getHighSpeedVideoFpsRanges = atomicReferenceFieldUpdater4;
            this.Camera2StreamConfigurationMap = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        final void Camera2StreamConfigurationMap(androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, java.lang.Thread thread) {
            this.getHighSpeedVideoFpsRangesFor.lazySet(waiter, thread);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        final void getHighSpeedVideoFpsRangesFor(androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter2) {
            this.getHighResolutionOutputSizeshNQ4ISI.lazySet(waiter, waiter2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        final boolean getHighSpeedVideoSizes(androidx.work.impl.utils.futures.AbstractFuture<?> abstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, abstractFuture, waiter, waiter2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        final boolean Camera2StreamConfigurationMap(androidx.work.impl.utils.futures.AbstractFuture<?> abstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Listener listener, androidx.work.impl.utils.futures.AbstractFuture.Listener listener2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, abstractFuture, listener, listener2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        final boolean Camera2StreamConfigurationMap(androidx.work.impl.utils.futures.AbstractFuture<?> abstractFuture, java.lang.Object obj, java.lang.Object obj2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, abstractFuture, obj, obj2);
        }
    }

    static final class SynchronizedHelper extends androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper {
        SynchronizedHelper() {
            super((byte) 0);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        final void Camera2StreamConfigurationMap(androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, java.lang.Thread thread) {
            waiter.getHighSpeedVideoSizes = thread;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        final void getHighSpeedVideoFpsRangesFor(androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter2) {
            waiter.getHighResolutionOutputSizeshNQ4ISI = waiter2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        final boolean getHighSpeedVideoSizes(androidx.work.impl.utils.futures.AbstractFuture<?> abstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter2) {
            synchronized (abstractFuture) {
                if (abstractFuture.getHighSpeedVideoSizes != waiter) {
                    return false;
                }
                abstractFuture.getHighSpeedVideoSizes = waiter2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        final boolean Camera2StreamConfigurationMap(androidx.work.impl.utils.futures.AbstractFuture<?> abstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Listener listener, androidx.work.impl.utils.futures.AbstractFuture.Listener listener2) {
            synchronized (abstractFuture) {
                if (abstractFuture.getHighSpeedVideoFpsRangesFor != listener) {
                    return false;
                }
                abstractFuture.getHighSpeedVideoFpsRangesFor = listener2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        final boolean Camera2StreamConfigurationMap(androidx.work.impl.utils.futures.AbstractFuture<?> abstractFuture, java.lang.Object obj, java.lang.Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.Camera2StreamConfigurationMap != obj) {
                    return false;
                }
                abstractFuture.Camera2StreamConfigurationMap = obj2;
                return true;
            }
        }
    }

    static void getHighSpeedVideoFpsRangesFor(androidx.work.impl.utils.futures.AbstractFuture<?> abstractFuture) {
        androidx.work.impl.utils.futures.AbstractFuture.Listener listener;
        androidx.work.impl.utils.futures.AbstractFuture.Listener listener2;
        androidx.work.impl.utils.futures.AbstractFuture.Listener listener3 = null;
        while (true) {
            androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter = abstractFuture.getHighSpeedVideoSizes;
            if (getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(abstractFuture, waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter.getHighSpeedVideoFpsRangesFor)) {
                while (waiter != null) {
                    java.lang.Thread thread = waiter.getHighSpeedVideoSizes;
                    if (thread != null) {
                        waiter.getHighSpeedVideoSizes = null;
                        java.util.concurrent.locks.LockSupport.unpark(thread);
                    }
                    waiter = waiter.getHighResolutionOutputSizeshNQ4ISI;
                }
                abstractFuture.afterDone();
                do {
                    listener = abstractFuture.getHighSpeedVideoFpsRangesFor;
                } while (!getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(abstractFuture, listener, androidx.work.impl.utils.futures.AbstractFuture.Listener.getHighResolutionOutputSizeshNQ4ISI));
                while (true) {
                    listener2 = listener3;
                    listener3 = listener;
                    if (listener3 == null) {
                        break;
                    }
                    listener = listener3.getHighSpeedVideoSizes;
                    listener3.getHighSpeedVideoSizes = listener2;
                }
                while (listener2 != null) {
                    listener3 = listener2.getHighSpeedVideoSizes;
                    java.lang.Runnable runnable = listener2.getHighSpeedVideoFpsRangesFor;
                    if (runnable instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture) {
                        androidx.work.impl.utils.futures.AbstractFuture.SetFuture setFuture = (androidx.work.impl.utils.futures.AbstractFuture.SetFuture) runnable;
                        abstractFuture = setFuture.Camera2StreamConfigurationMap;
                        if (abstractFuture.Camera2StreamConfigurationMap == setFuture) {
                            if (getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap((androidx.work.impl.utils.futures.AbstractFuture<?>) abstractFuture, (java.lang.Object) setFuture, getHighSpeedVideoSizes(setFuture.getHighResolutionOutputSizeshNQ4ISI))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Camera2StreamConfigurationMap(runnable, listener2.Camera2StreamConfigurationMap);
                    }
                    listener2 = listener3;
                }
                return;
            }
        }
    }
}

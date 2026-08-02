package androidx.camera.core.impl.utils.futures;

/* loaded from: classes6.dex */
abstract class ImmediateFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws java.util.concurrent.ExecutionException;

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    ImmediateFuture() {
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> getHighResolutionOutputSizeshNQ4ISI() {
        return androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateSuccessfulFuture.getHighSpeedVideoFpsRanges;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        androidx.core.util.Preconditions.checkNotNull(runnable);
        androidx.core.util.Preconditions.checkNotNull(executor);
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Experienced RuntimeException while attempting to notify ");
            sb.append(runnable);
            sb.append(" on Executor ");
            sb.append(executor);
            androidx.camera.core.Logger.e("ImmediateFuture", sb.toString(), e);
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException {
        androidx.core.util.Preconditions.checkNotNull(timeUnit);
        return get();
    }

    static final class ImmediateSuccessfulFuture<V> extends androidx.camera.core.impl.utils.futures.ImmediateFuture<V> {
        static final androidx.camera.core.impl.utils.futures.ImmediateFuture<java.lang.Object> getHighSpeedVideoFpsRanges = new androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateSuccessfulFuture(null);
        private final V getHighSpeedVideoFpsRangesFor;

        ImmediateSuccessfulFuture(V v) {
            this.getHighSpeedVideoFpsRangesFor = v;
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture, java.util.concurrent.Future
        public final V get() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(super.toString());
            sb.append("[status=SUCCESS, result=[");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append("]]");
            return sb.toString();
        }
    }

    static class ImmediateFailedFuture<V> extends androidx.camera.core.impl.utils.futures.ImmediateFuture<V> {
        private final java.lang.Throwable getHighSpeedVideoFpsRangesFor;

        ImmediateFailedFuture(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor = th;
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture, java.util.concurrent.Future
        public V get() throws java.util.concurrent.ExecutionException {
            throw new java.util.concurrent.ExecutionException(this.getHighSpeedVideoFpsRangesFor);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(super.toString());
            sb.append("[status=FAILURE, cause=[");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append("]]");
            return sb.toString();
        }
    }

    static final class ImmediateFailedScheduledFuture<V> extends androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateFailedFuture<V> implements java.util.concurrent.ScheduledFuture<V> {
        @Override // java.util.concurrent.Delayed
        public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
            return -1;
        }

        ImmediateFailedScheduledFuture(java.lang.Throwable th) {
            super(th);
        }
    }
}

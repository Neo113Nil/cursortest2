package androidx.concurrent.futures;

/* loaded from: classes3.dex */
public final class CallbackToFutureAdapter {

    public interface Resolver<T> {
        java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer) throws java.lang.Exception;
    }

    private CallbackToFutureAdapter() {
    }

    public static <T> com.google.common.util.concurrent.ListenableFuture<T> getFuture(androidx.concurrent.futures.CallbackToFutureAdapter.Resolver<T> resolver) {
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer = new androidx.concurrent.futures.CallbackToFutureAdapter.Completer<>();
        androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<T> safeFuture = new androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<>(completer);
        completer.Camera2StreamConfigurationMap = safeFuture;
        completer.getHighSpeedVideoFpsRangesFor = resolver.getClass();
        try {
            java.lang.Object attachCompleter = resolver.attachCompleter(completer);
            if (attachCompleter != null) {
                completer.getHighSpeedVideoFpsRangesFor = attachCompleter;
            }
            return safeFuture;
        } catch (java.lang.Exception e) {
            safeFuture.getHighSpeedVideoSizes.setException(e);
            return safeFuture;
        }
    }

    static final class SafeFuture<T> implements com.google.common.util.concurrent.ListenableFuture<T> {
        final java.lang.ref.WeakReference<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T>> getHighSpeedVideoFpsRanges;
        final androidx.concurrent.futures.AbstractResolvableFuture<T> getHighSpeedVideoSizes = new androidx.concurrent.futures.AbstractResolvableFuture<T>() { // from class: androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture.1
            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            protected java.lang.String pendingToString() {
                androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer = androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture.this.getHighSpeedVideoFpsRanges.get();
                if (completer == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("tag=[");
                sb.append(completer.getHighSpeedVideoFpsRangesFor);
                sb.append("]");
                return sb.toString();
            }
        };

        SafeFuture(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer) {
            this.getHighSpeedVideoFpsRanges = new java.lang.ref.WeakReference<>(completer);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer = this.getHighSpeedVideoFpsRanges.get();
            boolean cancel = this.getHighSpeedVideoSizes.cancel(z);
            if (cancel && completer != null) {
                completer.getHighSpeedVideoFpsRangesFor = null;
                completer.Camera2StreamConfigurationMap = null;
                completer.getHighSpeedVideoFpsRanges.set(null);
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.getHighSpeedVideoSizes.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.getHighSpeedVideoSizes.isDone();
        }

        @Override // java.util.concurrent.Future
        public final T get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            return this.getHighSpeedVideoSizes.get();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            return this.getHighSpeedVideoSizes.get(j, timeUnit);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.getHighSpeedVideoSizes.addListener(runnable, executor);
        }

        public final java.lang.String toString() {
            return this.getHighSpeedVideoSizes.toString();
        }
    }

    public static final class Completer<T> {
        androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<T> Camera2StreamConfigurationMap;
        androidx.concurrent.futures.ResolvableFuture<java.lang.Void> getHighSpeedVideoFpsRanges = androidx.concurrent.futures.ResolvableFuture.create();
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes;

        Completer() {
        }

        public final boolean set(T t) {
            this.getHighSpeedVideoSizes = true;
            androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<T> safeFuture = this.Camera2StreamConfigurationMap;
            boolean z = safeFuture != null && safeFuture.getHighSpeedVideoSizes.set(t);
            if (z) {
                this.getHighSpeedVideoFpsRangesFor = null;
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoFpsRanges = null;
            }
            return z;
        }

        public final boolean setException(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = true;
            androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<T> safeFuture = this.Camera2StreamConfigurationMap;
            boolean z = safeFuture != null && safeFuture.getHighSpeedVideoSizes.setException(th);
            if (z) {
                this.getHighSpeedVideoFpsRangesFor = null;
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoFpsRanges = null;
            }
            return z;
        }

        public final boolean setCancelled() {
            this.getHighSpeedVideoSizes = true;
            androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<T> safeFuture = this.Camera2StreamConfigurationMap;
            boolean z = safeFuture != null && safeFuture.getHighSpeedVideoSizes.cancel(true);
            if (z) {
                this.getHighSpeedVideoFpsRangesFor = null;
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoFpsRanges = null;
            }
            return z;
        }

        public final void addCancellationListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            androidx.concurrent.futures.ResolvableFuture<java.lang.Void> resolvableFuture = this.getHighSpeedVideoFpsRanges;
            if (resolvableFuture != null) {
                resolvableFuture.addListener(runnable, executor);
            }
        }

        protected final void finalize() {
            androidx.concurrent.futures.ResolvableFuture<java.lang.Void> resolvableFuture;
            androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<T> safeFuture = this.Camera2StreamConfigurationMap;
            if (safeFuture != null && !safeFuture.isDone()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                safeFuture.getHighSpeedVideoSizes.setException(new androidx.concurrent.futures.CallbackToFutureAdapter.FutureGarbageCollectedException(sb.toString()));
            }
            if (this.getHighSpeedVideoSizes || (resolvableFuture = this.getHighSpeedVideoFpsRanges) == null) {
                return;
            }
            resolvableFuture.set(null);
        }
    }

    static final class FutureGarbageCollectedException extends java.lang.Throwable {
        FutureGarbageCollectedException(java.lang.String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public final java.lang.Throwable fillInStackTrace() {
            synchronized (this) {
            }
            return this;
        }
    }
}

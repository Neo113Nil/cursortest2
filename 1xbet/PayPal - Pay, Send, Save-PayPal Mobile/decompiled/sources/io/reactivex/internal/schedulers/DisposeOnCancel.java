package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
final class DisposeOnCancel implements java.util.concurrent.Future<java.lang.Object> {
    final io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    DisposeOnCancel(io.reactivex.disposables.Disposable disposable) {
        this.getHighSpeedVideoFpsRanges = disposable;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.getHighSpeedVideoFpsRanges.dispose();
        return false;
    }
}

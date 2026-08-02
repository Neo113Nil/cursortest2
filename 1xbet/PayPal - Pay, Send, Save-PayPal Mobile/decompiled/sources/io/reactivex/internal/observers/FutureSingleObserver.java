package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class FutureSingleObserver<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.SingleObserver<T>, java.util.concurrent.Future<T>, io.reactivex.disposables.Disposable {
    T getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Throwable getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoSizes;

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }

    public FutureSingleObserver() {
        super(1);
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        io.reactivex.disposables.Disposable disposable;
        do {
            disposable = this.getHighSpeedVideoSizes.get();
            if (disposable == this || disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return false;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, disposable, io.reactivex.internal.disposables.DisposableHelper.DISPOSED));
        if (disposable != null) {
            disposable.dispose();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoSizes.get());
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public final T get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        if (getCount() != 0) {
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new java.util.concurrent.CancellationException();
        }
        java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
        if (th != null) {
            throw new java.util.concurrent.ExecutionException(th);
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        if (getCount() != 0) {
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
            if (!await(j, timeUnit)) {
                throw new java.util.concurrent.TimeoutException();
            }
        }
        if (isCancelled()) {
            throw new java.util.concurrent.CancellationException();
        }
        java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
        if (th != null) {
            throw new java.util.concurrent.ExecutionException(th);
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // io.reactivex.SingleObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoSizes, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(T t) {
        io.reactivex.disposables.Disposable disposable = this.getHighSpeedVideoSizes.get();
        if (disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = t;
        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, disposable, this);
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(java.lang.Throwable th) {
        io.reactivex.disposables.Disposable disposable;
        do {
            disposable = this.getHighSpeedVideoSizes.get();
            if (disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = th;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, disposable, this));
        countDown();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return isDone();
    }
}

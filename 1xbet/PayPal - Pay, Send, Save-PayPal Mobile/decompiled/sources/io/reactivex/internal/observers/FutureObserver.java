package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class FutureObserver<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.Observer<T>, java.util.concurrent.Future<T>, io.reactivex.disposables.Disposable {
    java.lang.Throwable Camera2StreamConfigurationMap;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRangesFor;
    T getHighSpeedVideoSizes;

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }

    public FutureObserver() {
        super(1);
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        io.reactivex.disposables.Disposable disposable;
        do {
            disposable = this.getHighSpeedVideoFpsRangesFor.get();
            if (disposable == this || disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return false;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, disposable, io.reactivex.internal.disposables.DisposableHelper.DISPOSED));
        if (disposable != null) {
            disposable.dispose();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoFpsRangesFor.get());
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
        java.lang.Throwable th = this.Camera2StreamConfigurationMap;
        if (th != null) {
            throw new java.util.concurrent.ExecutionException(th);
        }
        return this.getHighSpeedVideoSizes;
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
        java.lang.Throwable th = this.Camera2StreamConfigurationMap;
        if (th != null) {
            throw new java.util.concurrent.ExecutionException(th);
        }
        return this.getHighSpeedVideoSizes;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoFpsRangesFor, disposable);
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        if (this.getHighSpeedVideoSizes != null) {
            this.getHighSpeedVideoFpsRangesFor.get().dispose();
            onError(new java.lang.IndexOutOfBoundsException("More than one element received"));
        } else {
            this.getHighSpeedVideoSizes = t;
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        io.reactivex.disposables.Disposable disposable;
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = th;
            do {
                disposable = this.getHighSpeedVideoFpsRangesFor.get();
                if (disposable == this || disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                    return;
                }
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, disposable, this));
            countDown();
            return;
        }
        io.reactivex.plugins.RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        io.reactivex.disposables.Disposable disposable;
        if (this.getHighSpeedVideoSizes == null) {
            onError(new java.util.NoSuchElementException("The source is empty"));
            return;
        }
        do {
            disposable = this.getHighSpeedVideoFpsRangesFor.get();
            if (disposable == this || disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, disposable, this));
        countDown();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return isDone();
    }
}

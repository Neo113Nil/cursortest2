package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class BlockingMultiObserver<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.SingleObserver<T>, io.reactivex.CompletableObserver, io.reactivex.MaybeObserver<T> {
    io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Throwable getHighSpeedVideoFpsRanges;
    volatile boolean getHighSpeedVideoFpsRangesFor;
    T getHighSpeedVideoSizes;

    public BlockingMultiObserver() {
        super(1);
    }

    @Override // io.reactivex.SingleObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        this.getHighResolutionOutputSizeshNQ4ISI = disposable;
        if (this.getHighSpeedVideoFpsRangesFor) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(T t) {
        this.getHighSpeedVideoSizes = t;
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRanges = th;
        countDown();
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public final void onComplete() {
        countDown();
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                await();
            } catch (java.lang.InterruptedException e) {
                this.getHighSpeedVideoFpsRangesFor = true;
                io.reactivex.disposables.Disposable disposable = this.getHighResolutionOutputSizeshNQ4ISI;
                if (disposable != null) {
                    disposable.dispose();
                }
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }
        java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
        if (th != null) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
        return this.getHighSpeedVideoSizes;
    }

    public final T blockingGet(T t) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                await();
            } catch (java.lang.InterruptedException e) {
                this.getHighSpeedVideoFpsRangesFor = true;
                io.reactivex.disposables.Disposable disposable = this.getHighResolutionOutputSizeshNQ4ISI;
                if (disposable != null) {
                    disposable.dispose();
                }
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }
        java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
        if (th != null) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
        T t2 = this.getHighSpeedVideoSizes;
        return t2 != null ? t2 : t;
    }

    public final java.lang.Throwable blockingGetError() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                await();
            } catch (java.lang.InterruptedException e) {
                this.getHighSpeedVideoFpsRangesFor = true;
                io.reactivex.disposables.Disposable disposable = this.getHighResolutionOutputSizeshNQ4ISI;
                if (disposable != null) {
                    disposable.dispose();
                }
                return e;
            }
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.Throwable blockingGetError(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                if (!await(j, timeUnit)) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    io.reactivex.disposables.Disposable disposable = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(new java.util.concurrent.TimeoutException());
                }
            } catch (java.lang.InterruptedException e) {
                this.getHighSpeedVideoFpsRangesFor = true;
                io.reactivex.disposables.Disposable disposable2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean blockingAwait(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                if (!await(j, timeUnit)) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    io.reactivex.disposables.Disposable disposable = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (disposable == null) {
                        return false;
                    }
                    disposable.dispose();
                    return false;
                }
            } catch (java.lang.InterruptedException e) {
                this.getHighSpeedVideoFpsRangesFor = true;
                io.reactivex.disposables.Disposable disposable2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }
        java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
        if (th == null) {
            return true;
        }
        throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
    }
}

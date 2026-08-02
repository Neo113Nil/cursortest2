package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public abstract class BlockingBaseObserver<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    java.lang.Throwable Camera2StreamConfigurationMap;
    T getHighSpeedVideoFpsRanges;
    io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
    volatile boolean getHighSpeedVideoSizes;

    public BlockingBaseObserver() {
        super(1);
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        this.getHighSpeedVideoFpsRangesFor = disposable;
        if (this.getHighSpeedVideoSizes) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.getHighSpeedVideoSizes = true;
        io.reactivex.disposables.Disposable disposable = this.getHighSpeedVideoFpsRangesFor;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.getHighSpeedVideoSizes;
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                await();
            } catch (java.lang.InterruptedException e) {
                dispose();
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }
        java.lang.Throwable th = this.Camera2StreamConfigurationMap;
        if (th != null) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
        return this.getHighSpeedVideoFpsRanges;
    }
}

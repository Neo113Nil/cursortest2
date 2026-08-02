package io.reactivex.internal.observers;

/* loaded from: classes17.dex */
public final class InnerQueuedObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    io.reactivex.internal.fuseable.SimpleQueue<T> getHighSpeedVideoFpsRanges;
    final io.reactivex.internal.observers.InnerQueuedObserverSupport<T> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    public InnerQueuedObserver(io.reactivex.internal.observers.InnerQueuedObserverSupport<T> innerQueuedObserverSupport, int i) {
        this.getHighSpeedVideoFpsRangesFor = innerQueuedObserverSupport;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
            if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                io.reactivex.internal.fuseable.QueueDisposable queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                int requestFusion = queueDisposable.requestFusion(3);
                if (requestFusion == 1) {
                    this.getHighSpeedVideoSizes = requestFusion;
                    this.getHighSpeedVideoFpsRanges = queueDisposable;
                    this.Camera2StreamConfigurationMap = true;
                    this.getHighSpeedVideoFpsRangesFor.innerComplete(this);
                    return;
                }
                if (requestFusion == 2) {
                    this.getHighSpeedVideoSizes = requestFusion;
                    this.getHighSpeedVideoFpsRanges = queueDisposable;
                    return;
                }
            }
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.util.QueueDrainHelper.createQueue(-this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        if (this.getHighSpeedVideoSizes == 0) {
            this.getHighSpeedVideoFpsRangesFor.innerNext(this, t);
        } else {
            this.getHighSpeedVideoFpsRangesFor.drain();
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRangesFor.innerError(this, th);
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        this.getHighSpeedVideoFpsRangesFor.innerComplete(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.disposables.DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
    }

    public final boolean isDone() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void setDone() {
        this.Camera2StreamConfigurationMap = true;
    }

    public final io.reactivex.internal.fuseable.SimpleQueue<T> queue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int fusionMode() {
        return this.getHighSpeedVideoSizes;
    }
}

package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableToObservable<T> extends io.reactivex.Observable<T> {
    final io.reactivex.CompletableSource getHighSpeedVideoSizes;

    public CompletableToObservable(io.reactivex.CompletableSource completableSource) {
        this.getHighSpeedVideoSizes = completableSource;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.completable.CompletableToObservable.ObserverCompletableObserver(observer));
    }

    /* loaded from: classes17.dex */
    static final class ObserverCompletableObserver extends io.reactivex.internal.observers.BasicQueueDisposable<java.lang.Void> implements io.reactivex.CompletableObserver {
        final io.reactivex.Observer<?> getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final /* bridge */ /* synthetic */ java.lang.Object poll() throws java.lang.Exception {
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return i & 2;
        }

        ObserverCompletableObserver(io.reactivex.Observer<?> observer) {
            this.getHighSpeedVideoFpsRanges = observer;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }
    }
}

package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableMergeWithCompletable<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.CompletableSource getHighSpeedVideoFpsRangesFor;

    public ObservableMergeWithCompletable(io.reactivex.Observable<T> observable, io.reactivex.CompletableSource completableSource) {
        super(observable);
        this.getHighSpeedVideoFpsRangesFor = completableSource;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableMergeWithCompletable.MergeWithObserver mergeWithObserver = new io.reactivex.internal.operators.observable.ObservableMergeWithCompletable.MergeWithObserver(observer);
        observer.onSubscribe(mergeWithObserver);
        this.source.subscribe(mergeWithObserver);
        this.getHighSpeedVideoFpsRangesFor.subscribe(mergeWithObserver.getInputSizeshNQ4ISI);
    }

    /* loaded from: classes17.dex */
    static final class MergeWithObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -4592979584110982903L;
        final io.reactivex.Observer<? super T> Camera2StreamConfigurationMap;
        volatile boolean getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.internal.operators.observable.ObservableMergeWithCompletable.MergeWithObserver.OtherObserver getInputSizeshNQ4ISI = new io.reactivex.internal.operators.observable.ObservableMergeWithCompletable.MergeWithObserver.OtherObserver(this);
        final io.reactivex.internal.util.AtomicThrowable getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.util.AtomicThrowable();

        MergeWithObserver(io.reactivex.Observer<? super T> observer) {
            this.Camera2StreamConfigurationMap = observer;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoSizes, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            io.reactivex.internal.util.HalfSerializer.onNext(this.Camera2StreamConfigurationMap, t, this, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizes);
            io.reactivex.internal.util.HalfSerializer.onError(this.Camera2StreamConfigurationMap, th, this, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges = true;
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.internal.util.HalfSerializer.onComplete(this.Camera2StreamConfigurationMap, this, this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoSizes.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizes);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
        }

        static final class OtherObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = -2935427570954647017L;
            final io.reactivex.internal.operators.observable.ObservableMergeWithCompletable.MergeWithObserver<?> getHighSpeedVideoFpsRangesFor;

            OtherObserver(io.reactivex.internal.operators.observable.ObservableMergeWithCompletable.MergeWithObserver<?> mergeWithObserver) {
                this.getHighSpeedVideoFpsRangesFor = mergeWithObserver;
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableMergeWithCompletable.MergeWithObserver<?> mergeWithObserver = this.getHighSpeedVideoFpsRangesFor;
                io.reactivex.internal.disposables.DisposableHelper.dispose(mergeWithObserver.getHighSpeedVideoSizes);
                io.reactivex.internal.util.HalfSerializer.onError(mergeWithObserver.Camera2StreamConfigurationMap, th, mergeWithObserver, mergeWithObserver.getHighResolutionOutputSizeshNQ4ISI);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.observable.ObservableMergeWithCompletable.MergeWithObserver<?> mergeWithObserver = this.getHighSpeedVideoFpsRangesFor;
                mergeWithObserver.getHighSpeedVideoFpsRangesFor = true;
                if (mergeWithObserver.getHighSpeedVideoFpsRanges) {
                    io.reactivex.internal.util.HalfSerializer.onComplete(mergeWithObserver.Camera2StreamConfigurationMap, mergeWithObserver, mergeWithObserver.getHighResolutionOutputSizeshNQ4ISI);
                }
            }
        }
    }
}

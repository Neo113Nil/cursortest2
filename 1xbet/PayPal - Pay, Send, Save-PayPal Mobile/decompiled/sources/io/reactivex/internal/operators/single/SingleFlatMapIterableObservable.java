package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleFlatMapIterableObservable<T, R> extends io.reactivex.Observable<R> {
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> Camera2StreamConfigurationMap;
    final io.reactivex.SingleSource<T> getHighSpeedVideoSizes;

    public SingleFlatMapIterableObservable(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
        this.getHighSpeedVideoSizes = singleSource;
        this.Camera2StreamConfigurationMap = function;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.single.SingleFlatMapIterableObservable.FlatMapIterableObserver(observer, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapIterableObserver<T, R> extends io.reactivex.internal.observers.BasicIntQueueDisposable<R> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        final io.reactivex.Observer<? super R> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        volatile java.util.Iterator<? extends R> getHighSpeedVideoSizes;
        boolean getOutputMinFrameDuration;

        FlatMapIterableObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            io.reactivex.Observer<? super R> observer = this.Camera2StreamConfigurationMap;
            try {
                java.util.Iterator<? extends R> it = this.getHighSpeedVideoFpsRanges.apply(t).iterator();
                if (!it.hasNext()) {
                    observer.onComplete();
                    return;
                }
                if (this.getOutputMinFrameDuration) {
                    this.getHighSpeedVideoSizes = it;
                    observer.onNext(null);
                    observer.onComplete();
                    return;
                }
                while (!this.getHighResolutionOutputSizeshNQ4ISI) {
                    try {
                        observer.onNext(it.next());
                        if (this.getHighResolutionOutputSizeshNQ4ISI) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                observer.onComplete();
                                return;
                            }
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            observer.onError(th);
                            return;
                        }
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        observer.onError(th2);
                        return;
                    }
                }
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                this.Camera2StreamConfigurationMap.onError(th3);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoFpsRangesFor.dispose();
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.getOutputMinFrameDuration = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighSpeedVideoSizes = null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighSpeedVideoSizes == null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final R poll() throws java.lang.Exception {
            java.util.Iterator<? extends R> it = this.getHighSpeedVideoSizes;
            if (it == null) {
                return null;
            }
            R r = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.getHighSpeedVideoSizes = null;
            }
            return r;
        }
    }
}

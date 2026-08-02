package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFlatMapIterableObservable<T, R> extends io.reactivex.Observable<R> {
    final io.reactivex.MaybeSource<T> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> getHighSpeedVideoFpsRangesFor;

    public MaybeFlatMapIterableObservable(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
        this.Camera2StreamConfigurationMap = maybeSource;
        this.getHighSpeedVideoFpsRangesFor = function;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapIterableObservable.FlatMapIterableObserver(observer, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapIterableObserver<T, R> extends io.reactivex.internal.observers.BasicQueueDisposable<R> implements io.reactivex.MaybeObserver<T> {
        volatile java.util.Iterator<? extends R> Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super R> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;
        boolean getOutputFormats;

        FlatMapIterableObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            io.reactivex.Observer<? super R> observer = this.getHighResolutionOutputSizeshNQ4ISI;
            try {
                java.util.Iterator<? extends R> it = this.getHighSpeedVideoFpsRanges.apply(t).iterator();
                if (!it.hasNext()) {
                    observer.onComplete();
                    return;
                }
                this.Camera2StreamConfigurationMap = it;
                if (this.getOutputFormats) {
                    observer.onNext(null);
                    observer.onComplete();
                    return;
                }
                while (!this.getHighSpeedVideoFpsRangesFor) {
                    try {
                        observer.onNext(it.next());
                        if (this.getHighSpeedVideoFpsRangesFor) {
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
                observer.onError(th3);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoSizes.dispose();
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.getOutputFormats = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.Camera2StreamConfigurationMap = null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.Camera2StreamConfigurationMap == null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final R poll() throws java.lang.Exception {
            java.util.Iterator<? extends R> it = this.Camera2StreamConfigurationMap;
            if (it == null) {
                return null;
            }
            R r = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.Camera2StreamConfigurationMap = null;
            }
            return r;
        }
    }
}

package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDistinct<T, K> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final java.util.concurrent.Callable<? extends java.util.Collection<? super K>> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, K> getHighSpeedVideoSizes;

    public ObservableDistinct(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, K> function, java.util.concurrent.Callable<? extends java.util.Collection<? super K>> callable) {
        super(observableSource);
        this.getHighSpeedVideoSizes = function;
        this.Camera2StreamConfigurationMap = callable;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        try {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDistinct.DistinctObserver(observer, this.getHighSpeedVideoSizes, (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }

    /* loaded from: classes17.dex */
    static final class DistinctObserver<T, K> extends io.reactivex.internal.observers.BasicFuseableObserver<T, T> {
        final io.reactivex.functions.Function<? super T, K> Camera2StreamConfigurationMap;
        final java.util.Collection<? super K> getHighSpeedVideoFpsRanges;

        DistinctObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super T, K> function, java.util.Collection<? super K> collection) {
            super(observer);
            this.Camera2StreamConfigurationMap = function;
            this.getHighSpeedVideoFpsRanges = collection;
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 0) {
                try {
                    if (this.getHighSpeedVideoFpsRanges.add(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(t), "The keySelector returned a null key"))) {
                        this.actual.onNext(t);
                        return;
                    }
                    return;
                } catch (java.lang.Throwable th) {
                    fail(th);
                    return;
                }
            }
            this.actual.onNext(null);
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.getHighSpeedVideoFpsRanges.clear();
            this.actual.onError(th);
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.getHighSpeedVideoFpsRanges.clear();
            this.actual.onComplete();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            T poll;
            do {
                poll = this.qs.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.getHighSpeedVideoFpsRanges.add((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(poll), "The keySelector returned a null key")));
            return poll;
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighSpeedVideoFpsRanges.clear();
            super.clear();
        }
    }
}

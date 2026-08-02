package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDistinctUntilChanged<T, K> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super T, K> Camera2StreamConfigurationMap;
    final io.reactivex.functions.BiPredicate<? super K, ? super K> getHighSpeedVideoFpsRangesFor;

    public ObservableDistinctUntilChanged(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, K> function, io.reactivex.functions.BiPredicate<? super K, ? super K> biPredicate) {
        super(observableSource);
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoFpsRangesFor = biPredicate;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged.DistinctUntilChangedObserver(observer, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class DistinctUntilChangedObserver<T, K> extends io.reactivex.internal.observers.BasicFuseableObserver<T, T> {
        K Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiPredicate<? super K, ? super K> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, K> getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        DistinctUntilChangedObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super T, K> function, io.reactivex.functions.BiPredicate<? super K, ? super K> biPredicate) {
            super(observer);
            this.getHighSpeedVideoFpsRangesFor = function;
            this.getHighResolutionOutputSizeshNQ4ISI = biPredicate;
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.actual.onNext(t);
                return;
            }
            try {
                K apply = this.getHighSpeedVideoFpsRangesFor.apply(t);
                if (this.getHighSpeedVideoSizes) {
                    boolean test = this.getHighResolutionOutputSizeshNQ4ISI.test(this.Camera2StreamConfigurationMap, apply);
                    this.Camera2StreamConfigurationMap = apply;
                    if (test) {
                        return;
                    }
                } else {
                    this.getHighSpeedVideoSizes = true;
                    this.Camera2StreamConfigurationMap = apply;
                }
                this.actual.onNext(t);
            } catch (java.lang.Throwable th) {
                fail(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            while (true) {
                T poll = this.qs.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.getHighSpeedVideoFpsRangesFor.apply(poll);
                if (!this.getHighSpeedVideoSizes) {
                    this.getHighSpeedVideoSizes = true;
                    this.Camera2StreamConfigurationMap = apply;
                    return poll;
                }
                if (!this.getHighResolutionOutputSizeshNQ4ISI.test(this.Camera2StreamConfigurationMap, apply)) {
                    this.Camera2StreamConfigurationMap = apply;
                    return poll;
                }
                this.Camera2StreamConfigurationMap = apply;
            }
        }
    }
}

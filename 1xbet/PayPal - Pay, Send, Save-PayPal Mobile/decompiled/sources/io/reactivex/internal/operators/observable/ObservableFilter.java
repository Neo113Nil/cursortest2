package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableFilter<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> getHighResolutionOutputSizeshNQ4ISI;

    public ObservableFilter(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Predicate<? super T> predicate) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = predicate;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableFilter.FilterObserver(observer, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class FilterObserver<T> extends io.reactivex.internal.observers.BasicFuseableObserver<T, T> {
        final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRanges;

        FilterObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Predicate<? super T> predicate) {
            super(observer);
            this.getHighSpeedVideoFpsRanges = predicate;
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.sourceMode == 0) {
                try {
                    if (this.getHighSpeedVideoFpsRanges.test(t)) {
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
            } while (!this.getHighSpeedVideoFpsRanges.test(poll));
            return poll;
        }
    }
}

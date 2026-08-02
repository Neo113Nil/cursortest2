package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableMap<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final io.reactivex.functions.Function<? super T, ? extends U> getHighResolutionOutputSizeshNQ4ISI;

    public ObservableMap(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends U> function) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = function;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super U> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableMap.MapObserver(observer, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class MapObserver<T, U> extends io.reactivex.internal.observers.BasicFuseableObserver<T, U> {
        final io.reactivex.functions.Function<? super T, ? extends U> Camera2StreamConfigurationMap;

        MapObserver(io.reactivex.Observer<? super U> observer, io.reactivex.functions.Function<? super T, ? extends U> function) {
            super(observer);
            this.Camera2StreamConfigurationMap = function;
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.actual.onNext(null);
                return;
            }
            try {
                this.actual.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(t), "The mapper function returned a null value."));
            } catch (java.lang.Throwable th) {
                fail(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final U poll() throws java.lang.Exception {
            T poll = this.qs.poll();
            if (poll != null) {
                return (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}

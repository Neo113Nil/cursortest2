package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDoAfterNext<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoSizes;

    public ObservableDoAfterNext(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Consumer<? super T> consumer) {
        super(observableSource);
        this.getHighSpeedVideoSizes = consumer;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDoAfterNext.DoAfterObserver(observer, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class DoAfterObserver<T> extends io.reactivex.internal.observers.BasicFuseableObserver<T, T> {
        final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoFpsRanges;

        DoAfterObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Consumer<? super T> consumer) {
            super(observer);
            this.getHighSpeedVideoFpsRanges = consumer;
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.actual.onNext(t);
            if (this.sourceMode == 0) {
                try {
                    this.getHighSpeedVideoFpsRanges.accept(t);
                } catch (java.lang.Throwable th) {
                    fail(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            T poll = this.qs.poll();
            if (poll != null) {
                this.getHighSpeedVideoFpsRanges.accept(poll);
            }
            return poll;
        }
    }
}

package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class BlockingObservableMostRecent<T> implements java.lang.Iterable<T> {
    final T getHighSpeedVideoFpsRangesFor;
    final io.reactivex.ObservableSource<T> getHighSpeedVideoSizes;

    public BlockingObservableMostRecent(io.reactivex.ObservableSource<T> observableSource, T t) {
        this.getHighSpeedVideoSizes = observableSource;
        this.getHighSpeedVideoFpsRangesFor = t;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        io.reactivex.internal.operators.observable.BlockingObservableMostRecent.MostRecentObserver mostRecentObserver = new io.reactivex.internal.operators.observable.BlockingObservableMostRecent.MostRecentObserver(this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoSizes.subscribe(mostRecentObserver);
        return new io.reactivex.internal.operators.observable.BlockingObservableMostRecent.MostRecentObserver.Iterator();
    }

    /* loaded from: classes17.dex */
    static final class MostRecentObserver<T> extends io.reactivex.observers.DefaultObserver<T> {
        volatile java.lang.Object getHighSpeedVideoFpsRangesFor;

        MostRecentObserver(T t) {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.NotificationLite.next(t);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.NotificationLite.complete();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.NotificationLite.error(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.NotificationLite.next(t);
        }

        final class Iterator implements java.util.Iterator<T> {
            private java.lang.Object Camera2StreamConfigurationMap;

            Iterator() {
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                this.Camera2StreamConfigurationMap = io.reactivex.internal.operators.observable.BlockingObservableMostRecent.MostRecentObserver.this.getHighSpeedVideoFpsRangesFor;
                return !io.reactivex.internal.util.NotificationLite.isComplete(r0);
            }

            @Override // java.util.Iterator
            public final T next() {
                try {
                    if (this.Camera2StreamConfigurationMap == null) {
                        this.Camera2StreamConfigurationMap = io.reactivex.internal.operators.observable.BlockingObservableMostRecent.MostRecentObserver.this.getHighSpeedVideoFpsRangesFor;
                    }
                    if (io.reactivex.internal.util.NotificationLite.isComplete(this.Camera2StreamConfigurationMap)) {
                        throw new java.util.NoSuchElementException();
                    }
                    if (io.reactivex.internal.util.NotificationLite.isError(this.Camera2StreamConfigurationMap)) {
                        throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(io.reactivex.internal.util.NotificationLite.getError(this.Camera2StreamConfigurationMap));
                    }
                    return (T) io.reactivex.internal.util.NotificationLite.getValue(this.Camera2StreamConfigurationMap);
                } finally {
                    this.Camera2StreamConfigurationMap = null;
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new java.lang.UnsupportedOperationException("Read only iterator");
            }
        }
    }
}

package rx.internal.operators;

/* loaded from: classes18.dex */
public final class BlockingOperatorMostRecent {
    private BlockingOperatorMostRecent() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> java.lang.Iterable<T> mostRecent(final rx.Observable<? extends T> observable, final T t) {
        return new java.lang.Iterable<T>() { // from class: rx.internal.operators.BlockingOperatorMostRecent.1
            @Override // java.lang.Iterable
            public final java.util.Iterator<T> iterator() {
                final rx.internal.operators.BlockingOperatorMostRecent.MostRecentObserver mostRecentObserver = new rx.internal.operators.BlockingOperatorMostRecent.MostRecentObserver(t);
                observable.subscribe((rx.Subscriber) mostRecentObserver);
                return new java.util.Iterator<T>() { // from class: rx.internal.operators.BlockingOperatorMostRecent.MostRecentObserver.1
                    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        this.getHighResolutionOutputSizeshNQ4ISI = rx.internal.operators.BlockingOperatorMostRecent.MostRecentObserver.this.getHighSpeedVideoFpsRangesFor;
                        return !rx.internal.operators.NotificationLite.isCompleted(r0);
                    }

                    @Override // java.util.Iterator
                    public T next() {
                        try {
                            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                                this.getHighResolutionOutputSizeshNQ4ISI = rx.internal.operators.BlockingOperatorMostRecent.MostRecentObserver.this.getHighSpeedVideoFpsRangesFor;
                            }
                            if (rx.internal.operators.NotificationLite.isCompleted(this.getHighResolutionOutputSizeshNQ4ISI)) {
                                throw new java.util.NoSuchElementException();
                            }
                            if (rx.internal.operators.NotificationLite.isError(this.getHighResolutionOutputSizeshNQ4ISI)) {
                                throw rx.exceptions.Exceptions.propagate(rx.internal.operators.NotificationLite.getError(this.getHighResolutionOutputSizeshNQ4ISI));
                            }
                            return (T) rx.internal.operators.NotificationLite.getValue(this.getHighResolutionOutputSizeshNQ4ISI);
                        } finally {
                            this.getHighResolutionOutputSizeshNQ4ISI = null;
                        }
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new java.lang.UnsupportedOperationException("Read only iterator");
                    }
                };
            }
        };
    }

    static final class MostRecentObserver<T> extends rx.Subscriber<T> {
        volatile java.lang.Object getHighSpeedVideoFpsRangesFor;

        MostRecentObserver(T t) {
            this.getHighSpeedVideoFpsRangesFor = rx.internal.operators.NotificationLite.next(t);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRangesFor = rx.internal.operators.NotificationLite.completed();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor = rx.internal.operators.NotificationLite.error(th);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor = rx.internal.operators.NotificationLite.next(t);
        }
    }
}

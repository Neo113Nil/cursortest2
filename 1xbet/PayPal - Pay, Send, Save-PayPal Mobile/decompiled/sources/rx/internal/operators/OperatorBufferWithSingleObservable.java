package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorBufferWithSingleObservable<T, TClosing> implements rx.Observable.Operator<java.util.List<T>, T> {
    final rx.functions.Func0<? extends rx.Observable<? extends TClosing>> getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;

    public OperatorBufferWithSingleObservable(rx.functions.Func0<? extends rx.Observable<? extends TClosing>> func0, int i) {
        this.getHighSpeedVideoFpsRanges = func0;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public OperatorBufferWithSingleObservable(final rx.Observable<? extends TClosing> observable, int i) {
        this.getHighSpeedVideoFpsRanges = new rx.functions.Func0<rx.Observable<? extends TClosing>>() { // from class: rx.internal.operators.OperatorBufferWithSingleObservable.1
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ java.lang.Object call() {
                return observable;
            }
        };
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super java.util.List<T>> subscriber) {
        try {
            rx.Observable<? extends TClosing> call = this.getHighSpeedVideoFpsRanges.call();
            final rx.internal.operators.OperatorBufferWithSingleObservable.BufferingSubscriber bufferingSubscriber = new rx.internal.operators.OperatorBufferWithSingleObservable.BufferingSubscriber(new rx.observers.SerializedSubscriber(subscriber));
            rx.Subscriber<TClosing> subscriber2 = new rx.Subscriber<TClosing>() { // from class: rx.internal.operators.OperatorBufferWithSingleObservable.2
                @Override // rx.Observer
                public void onNext(TClosing tclosing) {
                    rx.internal.operators.OperatorBufferWithSingleObservable.BufferingSubscriber bufferingSubscriber2 = bufferingSubscriber;
                    synchronized (bufferingSubscriber2) {
                        if (bufferingSubscriber2.getHighResolutionOutputSizeshNQ4ISI) {
                            return;
                        }
                        java.util.List<T> list = bufferingSubscriber2.getHighSpeedVideoSizes;
                        bufferingSubscriber2.getHighSpeedVideoSizes = new java.util.ArrayList(rx.internal.operators.OperatorBufferWithSingleObservable.this.getHighSpeedVideoFpsRangesFor);
                        try {
                            bufferingSubscriber2.getHighSpeedVideoFpsRangesFor.onNext(list);
                        } catch (java.lang.Throwable th) {
                            bufferingSubscriber2.unsubscribe();
                            synchronized (bufferingSubscriber2) {
                                if (bufferingSubscriber2.getHighResolutionOutputSizeshNQ4ISI) {
                                    return;
                                }
                                bufferingSubscriber2.getHighResolutionOutputSizeshNQ4ISI = true;
                                rx.exceptions.Exceptions.throwOrReport(th, bufferingSubscriber2.getHighSpeedVideoFpsRangesFor);
                            }
                        }
                    }
                }

                @Override // rx.Observer
                public void onError(java.lang.Throwable th) {
                    bufferingSubscriber.onError(th);
                }

                @Override // rx.Observer
                public void onCompleted() {
                    bufferingSubscriber.onCompleted();
                }
            };
            subscriber.add(subscriber2);
            subscriber.add(bufferingSubscriber);
            call.unsafeSubscribe(subscriber2);
            return bufferingSubscriber;
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwOrReport(th, subscriber);
            return rx.observers.Subscribers.empty();
        }
    }

    final class BufferingSubscriber extends rx.Subscriber<T> {
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscriber<? super java.util.List<T>> getHighSpeedVideoFpsRangesFor;
        java.util.List<T> getHighSpeedVideoSizes;

        public BufferingSubscriber(rx.Subscriber<? super java.util.List<T>> subscriber) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighSpeedVideoSizes = new java.util.ArrayList(rx.internal.operators.OperatorBufferWithSingleObservable.this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            synchronized (this) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                this.getHighSpeedVideoSizes.add(t);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            synchronized (this) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRangesFor.onError(th);
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            try {
                synchronized (this) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI) {
                        return;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    java.util.List<T> list = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRangesFor.onNext(list);
                    this.getHighSpeedVideoFpsRangesFor.onCompleted();
                    unsubscribe();
                }
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, this.getHighSpeedVideoFpsRangesFor);
            }
        }
    }
}

package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeReduce<T> implements rx.Observable.OnSubscribe<T> {
    final rx.Observable<T> getHighSpeedVideoFpsRangesFor;
    final rx.functions.Func2<T, T, T> getHighSpeedVideoSizes;

    public OnSubscribeReduce(rx.Observable<T> observable, rx.functions.Func2<T, T, T> func2) {
        this.getHighSpeedVideoFpsRangesFor = observable;
        this.getHighSpeedVideoSizes = func2;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        final rx.internal.operators.OnSubscribeReduce.ReduceSubscriber reduceSubscriber = new rx.internal.operators.OnSubscribeReduce.ReduceSubscriber(subscriber, this.getHighSpeedVideoSizes);
        subscriber.add(reduceSubscriber);
        subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OnSubscribeReduce.1
            @Override // rx.Producer
            public void request(long j) {
                rx.internal.operators.OnSubscribeReduce.ReduceSubscriber reduceSubscriber2 = reduceSubscriber;
                if (j < 0) {
                    throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
                }
                if (j != 0) {
                    reduceSubscriber2.request(Long.MAX_VALUE);
                }
            }
        });
        this.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(reduceSubscriber);
    }

    static final class ReduceSubscriber<T> extends rx.Subscriber<T> {
        static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
        final rx.Subscriber<? super T> Camera2StreamConfigurationMap;
        T getHighSpeedVideoFpsRanges = (T) getHighResolutionOutputSizeshNQ4ISI;
        final rx.functions.Func2<T, T, T> getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        public ReduceSubscriber(rx.Subscriber<? super T> subscriber, rx.functions.Func2<T, T, T> func2) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoFpsRangesFor = func2;
            request(0L);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            T t2 = this.getHighSpeedVideoFpsRanges;
            if (t2 == getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoFpsRanges = t;
                return;
            }
            try {
                this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.call(t2, t);
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(th);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (!this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoSizes = true;
                this.Camera2StreamConfigurationMap.onError(th);
            } else {
                rx.plugins.RxJavaHooks.onError(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            T t = this.getHighSpeedVideoFpsRanges;
            if (t != getHighResolutionOutputSizeshNQ4ISI) {
                this.Camera2StreamConfigurationMap.onNext(t);
                this.Camera2StreamConfigurationMap.onCompleted();
            } else {
                this.Camera2StreamConfigurationMap.onError(new java.util.NoSuchElementException());
            }
        }
    }
}

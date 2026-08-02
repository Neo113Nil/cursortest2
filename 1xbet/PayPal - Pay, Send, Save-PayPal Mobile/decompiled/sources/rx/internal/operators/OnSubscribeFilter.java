package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeFilter<T> implements rx.Observable.OnSubscribe<T> {
    final rx.functions.Func1<? super T, java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final rx.Observable<T> getHighSpeedVideoFpsRangesFor;

    public OnSubscribeFilter(rx.Observable<T> observable, rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        this.getHighSpeedVideoFpsRangesFor = observable;
        this.getHighSpeedVideoFpsRanges = func1;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        rx.internal.operators.OnSubscribeFilter.FilterSubscriber filterSubscriber = new rx.internal.operators.OnSubscribeFilter.FilterSubscriber(subscriber, this.getHighSpeedVideoFpsRanges);
        subscriber.add(filterSubscriber);
        this.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(filterSubscriber);
    }

    static final class FilterSubscriber<T> extends rx.Subscriber<T> {
        final rx.functions.Func1<? super T, java.lang.Boolean> Camera2StreamConfigurationMap;
        final rx.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;

        public FilterSubscriber(rx.Subscriber<? super T> subscriber, rx.functions.Func1<? super T, java.lang.Boolean> func1) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.Camera2StreamConfigurationMap = func1;
            request(0L);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            try {
                if (this.Camera2StreamConfigurationMap.call(t).booleanValue()) {
                    this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                } else {
                    request(1L);
                }
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(rx.exceptions.OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                rx.plugins.RxJavaHooks.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            super.setProducer(producer);
            this.getHighResolutionOutputSizeshNQ4ISI.setProducer(producer);
        }
    }
}

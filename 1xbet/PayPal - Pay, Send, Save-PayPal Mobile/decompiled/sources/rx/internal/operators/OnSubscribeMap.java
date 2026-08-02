package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeMap<T, R> implements rx.Observable.OnSubscribe<R> {
    final rx.functions.Func1<? super T, ? extends R> getHighResolutionOutputSizeshNQ4ISI;
    final rx.Observable<T> getHighSpeedVideoSizes;

    public OnSubscribeMap(rx.Observable<T> observable, rx.functions.Func1<? super T, ? extends R> func1) {
        this.getHighSpeedVideoSizes = observable;
        this.getHighResolutionOutputSizeshNQ4ISI = func1;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super R> subscriber) {
        rx.internal.operators.OnSubscribeMap.MapSubscriber mapSubscriber = new rx.internal.operators.OnSubscribeMap.MapSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI);
        subscriber.add(mapSubscriber);
        this.getHighSpeedVideoSizes.unsafeSubscribe(mapSubscriber);
    }

    static final class MapSubscriber<T, R> extends rx.Subscriber<T> {
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final rx.functions.Func1<? super T, ? extends R> getHighSpeedVideoFpsRanges;
        final rx.Subscriber<? super R> getHighSpeedVideoFpsRangesFor;

        public MapSubscriber(rx.Subscriber<? super R> subscriber, rx.functions.Func1<? super T, ? extends R> func1) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighSpeedVideoFpsRanges = func1;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            try {
                this.getHighSpeedVideoFpsRangesFor.onNext(this.getHighSpeedVideoFpsRanges.call(t));
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(rx.exceptions.OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                rx.plugins.RxJavaHooks.onError(th);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.onCompleted();
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            this.getHighSpeedVideoFpsRangesFor.setProducer(producer);
        }
    }
}

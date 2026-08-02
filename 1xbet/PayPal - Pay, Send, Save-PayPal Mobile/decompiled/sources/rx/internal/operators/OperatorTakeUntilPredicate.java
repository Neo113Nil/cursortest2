package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorTakeUntilPredicate<T> implements rx.Observable.Operator<T, T> {
    final rx.functions.Func1<? super T, java.lang.Boolean> getHighSpeedVideoSizes;

    public OperatorTakeUntilPredicate(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        this.getHighSpeedVideoSizes = func1;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        final rx.internal.operators.OperatorTakeUntilPredicate.ParentSubscriber parentSubscriber = new rx.internal.operators.OperatorTakeUntilPredicate.ParentSubscriber(subscriber);
        subscriber.add(parentSubscriber);
        subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OperatorTakeUntilPredicate.1
            @Override // rx.Producer
            public void request(long j) {
                parentSubscriber.request(j);
            }
        });
        return parentSubscriber;
    }

    final class ParentSubscriber extends rx.Subscriber<T> {
        private final rx.Subscriber<? super T> Camera2StreamConfigurationMap;
        private boolean getHighSpeedVideoFpsRangesFor;

        ParentSubscriber(rx.Subscriber<? super T> subscriber) {
            this.Camera2StreamConfigurationMap = subscriber;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.Camera2StreamConfigurationMap.onNext(t);
            try {
                if (rx.internal.operators.OperatorTakeUntilPredicate.this.getHighSpeedVideoSizes.call(t).booleanValue()) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    this.Camera2StreamConfigurationMap.onCompleted();
                    unsubscribe();
                }
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoFpsRangesFor = true;
                rx.exceptions.Exceptions.throwOrReport(th, this.Camera2StreamConfigurationMap, t);
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.Camera2StreamConfigurationMap.onCompleted();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.Camera2StreamConfigurationMap.onError(th);
        }
    }
}

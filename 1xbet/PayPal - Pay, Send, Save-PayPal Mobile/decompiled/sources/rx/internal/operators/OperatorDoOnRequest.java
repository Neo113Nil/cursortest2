package rx.internal.operators;

/* loaded from: classes18.dex */
public class OperatorDoOnRequest<T> implements rx.Observable.Operator<T, T> {
    final rx.functions.Action1<? super java.lang.Long> getHighSpeedVideoFpsRanges;

    public OperatorDoOnRequest(rx.functions.Action1<? super java.lang.Long> action1) {
        this.getHighSpeedVideoFpsRanges = action1;
    }

    @Override // rx.functions.Func1
    public rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        final rx.internal.operators.OperatorDoOnRequest.ParentSubscriber parentSubscriber = new rx.internal.operators.OperatorDoOnRequest.ParentSubscriber(subscriber);
        subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OperatorDoOnRequest.1
            @Override // rx.Producer
            public void request(long j) {
                rx.internal.operators.OperatorDoOnRequest.this.getHighSpeedVideoFpsRanges.call(java.lang.Long.valueOf(j));
                parentSubscriber.request(j);
            }
        });
        subscriber.add(parentSubscriber);
        return parentSubscriber;
    }

    static final class ParentSubscriber<T> extends rx.Subscriber<T> {
        private final rx.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;

        ParentSubscriber(rx.Subscriber<? super T> subscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            request(0L);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        }
    }
}

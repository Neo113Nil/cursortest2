package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeTakeLastOne<T> implements rx.Observable.OnSubscribe<T> {
    final rx.Observable<T> getHighSpeedVideoFpsRanges;

    public OnSubscribeTakeLastOne(rx.Observable<T> observable) {
        this.getHighSpeedVideoFpsRanges = observable;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        new rx.internal.operators.OnSubscribeTakeLastOne.TakeLastOneSubscriber(subscriber).subscribeTo(this.getHighSpeedVideoFpsRanges);
    }

    static final class TakeLastOneSubscriber<T> extends rx.internal.operators.DeferredScalarSubscriber<T, T> {
        static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
        public TakeLastOneSubscriber(rx.Subscriber<? super T> subscriber) {
            super(subscriber);
            this.value = getHighSpeedVideoFpsRangesFor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // rx.Observer
        public final void onNext(T t) {
            this.value = t;
        }

        @Override // rx.internal.operators.DeferredScalarSubscriber, rx.Observer
        public final void onCompleted() {
            java.lang.Object obj = this.value;
            if (obj == getHighSpeedVideoFpsRangesFor) {
                complete();
            } else {
                complete(obj);
            }
        }
    }
}

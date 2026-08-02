package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableFromObservable<T> extends io.reactivex.Flowable<T> {
    private final io.reactivex.Observable<T> getHighSpeedVideoFpsRangesFor;

    public FlowableFromObservable(io.reactivex.Observable<T> observable) {
        this.getHighSpeedVideoFpsRangesFor = observable;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.flowable.FlowableFromObservable.SubscriberObserver(subscriber));
    }

    /* loaded from: classes17.dex */
    static class SubscriberObserver<T> implements io.reactivex.Observer<T>, org.reactivestreams.Subscription {
        private final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        private io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
        }

        SubscriberObserver(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRanges = disposable;
            this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.getHighSpeedVideoFpsRanges.dispose();
        }
    }
}

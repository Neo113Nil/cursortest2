package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleTakeUntilObservable<T, U> implements rx.Single.OnSubscribe<T> {
    final rx.Observable<? extends U> getHighSpeedVideoFpsRangesFor;
    final rx.Single.OnSubscribe<T> getHighSpeedVideoSizes;

    public SingleTakeUntilObservable(rx.Single.OnSubscribe<T> onSubscribe, rx.Observable<? extends U> observable) {
        this.getHighSpeedVideoSizes = onSubscribe;
        this.getHighSpeedVideoFpsRangesFor = observable;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        rx.internal.operators.SingleTakeUntilObservable.TakeUntilSourceSubscriber takeUntilSourceSubscriber = new rx.internal.operators.SingleTakeUntilObservable.TakeUntilSourceSubscriber(singleSubscriber);
        singleSubscriber.add(takeUntilSourceSubscriber);
        this.getHighSpeedVideoFpsRangesFor.subscribe((rx.Subscriber<? super java.lang.Object>) takeUntilSourceSubscriber.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoSizes.call(takeUntilSourceSubscriber);
    }

    static final class TakeUntilSourceSubscriber<T, U> extends rx.SingleSubscriber<T> {
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean();
        final rx.Subscriber<U> getHighSpeedVideoFpsRangesFor;
        final rx.SingleSubscriber<? super T> getHighSpeedVideoSizes;

        TakeUntilSourceSubscriber(rx.SingleSubscriber<? super T> singleSubscriber) {
            this.getHighSpeedVideoSizes = singleSubscriber;
            rx.internal.operators.SingleTakeUntilObservable.TakeUntilSourceSubscriber.OtherSubscriber otherSubscriber = new rx.internal.operators.SingleTakeUntilObservable.TakeUntilSourceSubscriber.OtherSubscriber();
            this.getHighSpeedVideoFpsRangesFor = otherSubscriber;
            add(otherSubscriber);
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
                unsubscribe();
                this.getHighSpeedVideoSizes.onSuccess(t);
            }
        }

        @Override // rx.SingleSubscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
                unsubscribe();
                this.getHighSpeedVideoSizes.onError(th);
            } else {
                rx.plugins.RxJavaHooks.onError(th);
            }
        }

        final class OtherSubscriber extends rx.Subscriber<U> {
            OtherSubscriber() {
            }

            @Override // rx.Observer
            public final void onNext(U u) {
                onCompleted();
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                rx.internal.operators.SingleTakeUntilObservable.TakeUntilSourceSubscriber.this.onError(th);
            }

            @Override // rx.Observer
            public final void onCompleted() {
                onError(new java.util.concurrent.CancellationException("Single::takeUntil(Observable) - Stream was canceled before emitting a terminal event."));
            }
        }
    }
}

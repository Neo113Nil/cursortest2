package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleTakeUntilSingle<T, U> implements rx.Single.OnSubscribe<T> {
    final rx.Single.OnSubscribe<T> getHighResolutionOutputSizeshNQ4ISI;
    final rx.Single<? extends U> getHighSpeedVideoFpsRangesFor;

    public SingleTakeUntilSingle(rx.Single.OnSubscribe<T> onSubscribe, rx.Single<? extends U> single) {
        this.getHighResolutionOutputSizeshNQ4ISI = onSubscribe;
        this.getHighSpeedVideoFpsRangesFor = single;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        rx.internal.operators.SingleTakeUntilSingle.TakeUntilSourceSubscriber takeUntilSourceSubscriber = new rx.internal.operators.SingleTakeUntilSingle.TakeUntilSourceSubscriber(singleSubscriber);
        singleSubscriber.add(takeUntilSourceSubscriber);
        this.getHighSpeedVideoFpsRangesFor.subscribe((rx.SingleSubscriber<? super java.lang.Object>) takeUntilSourceSubscriber.Camera2StreamConfigurationMap);
        this.getHighResolutionOutputSizeshNQ4ISI.call(takeUntilSourceSubscriber);
    }

    static final class TakeUntilSourceSubscriber<T, U> extends rx.SingleSubscriber<T> {
        final rx.SingleSubscriber<U> Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
        final rx.SingleSubscriber<? super T> getHighSpeedVideoFpsRangesFor;

        TakeUntilSourceSubscriber(rx.SingleSubscriber<? super T> singleSubscriber) {
            this.getHighSpeedVideoFpsRangesFor = singleSubscriber;
            rx.internal.operators.SingleTakeUntilSingle.TakeUntilSourceSubscriber.OtherSubscriber otherSubscriber = new rx.internal.operators.SingleTakeUntilSingle.TakeUntilSourceSubscriber.OtherSubscriber();
            this.Camera2StreamConfigurationMap = otherSubscriber;
            add(otherSubscriber);
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
                unsubscribe();
                this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
            }
        }

        @Override // rx.SingleSubscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
                unsubscribe();
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            } else {
                rx.plugins.RxJavaHooks.onError(th);
            }
        }

        final class OtherSubscriber extends rx.SingleSubscriber<U> {
            OtherSubscriber() {
            }

            @Override // rx.SingleSubscriber
            public final void onSuccess(U u) {
                onError(new java.util.concurrent.CancellationException("Single::takeUntil(Single) - Stream was canceled before emitting a terminal event."));
            }

            @Override // rx.SingleSubscriber
            public final void onError(java.lang.Throwable th) {
                rx.internal.operators.SingleTakeUntilSingle.TakeUntilSourceSubscriber.this.onError(th);
            }
        }
    }
}

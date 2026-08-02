package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleTakeUntilCompletable<T> implements rx.Single.OnSubscribe<T> {
    final rx.Single.OnSubscribe<T> Camera2StreamConfigurationMap;
    final rx.Completable getHighSpeedVideoFpsRangesFor;

    public SingleTakeUntilCompletable(rx.Single.OnSubscribe<T> onSubscribe, rx.Completable completable) {
        this.Camera2StreamConfigurationMap = onSubscribe;
        this.getHighSpeedVideoFpsRangesFor = completable;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        rx.internal.operators.SingleTakeUntilCompletable.TakeUntilSourceSubscriber takeUntilSourceSubscriber = new rx.internal.operators.SingleTakeUntilCompletable.TakeUntilSourceSubscriber(singleSubscriber);
        singleSubscriber.add(takeUntilSourceSubscriber);
        this.getHighSpeedVideoFpsRangesFor.subscribe(takeUntilSourceSubscriber);
        this.Camera2StreamConfigurationMap.call(takeUntilSourceSubscriber);
    }

    static final class TakeUntilSourceSubscriber<T> extends rx.SingleSubscriber<T> implements rx.CompletableSubscriber {
        final rx.SingleSubscriber<? super T> Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();

        TakeUntilSourceSubscriber(rx.SingleSubscriber<? super T> singleSubscriber) {
            this.Camera2StreamConfigurationMap = singleSubscriber;
        }

        @Override // rx.CompletableSubscriber
        public final void onSubscribe(rx.Subscription subscription) {
            add(subscription);
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
                unsubscribe();
                this.Camera2StreamConfigurationMap.onSuccess(t);
            }
        }

        @Override // rx.SingleSubscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
                unsubscribe();
                this.Camera2StreamConfigurationMap.onError(th);
            } else {
                rx.plugins.RxJavaHooks.onError(th);
            }
        }

        @Override // rx.CompletableSubscriber
        public final void onCompleted() {
            onError(new java.util.concurrent.CancellationException("Single::takeUntil(Completable) - Stream was canceled before emitting a terminal event."));
        }
    }
}

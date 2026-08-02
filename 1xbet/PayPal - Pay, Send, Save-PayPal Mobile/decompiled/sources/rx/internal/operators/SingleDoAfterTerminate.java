package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleDoAfterTerminate<T> implements rx.Single.OnSubscribe<T> {
    final rx.Single<T> getHighResolutionOutputSizeshNQ4ISI;
    final rx.functions.Action0 getHighSpeedVideoFpsRanges;

    public SingleDoAfterTerminate(rx.Single<T> single, rx.functions.Action0 action0) {
        this.getHighResolutionOutputSizeshNQ4ISI = single;
        this.getHighSpeedVideoFpsRanges = action0;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        rx.internal.operators.SingleDoAfterTerminate.SingleDoAfterTerminateSubscriber singleDoAfterTerminateSubscriber = new rx.internal.operators.SingleDoAfterTerminate.SingleDoAfterTerminateSubscriber(singleSubscriber, this.getHighSpeedVideoFpsRanges);
        singleSubscriber.add(singleDoAfterTerminateSubscriber);
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(singleDoAfterTerminateSubscriber);
    }

    static final class SingleDoAfterTerminateSubscriber<T> extends rx.SingleSubscriber<T> {
        final rx.functions.Action0 getHighResolutionOutputSizeshNQ4ISI;
        final rx.SingleSubscriber<? super T> getHighSpeedVideoSizes;

        public SingleDoAfterTerminateSubscriber(rx.SingleSubscriber<? super T> singleSubscriber, rx.functions.Action0 action0) {
            this.getHighSpeedVideoSizes = singleSubscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = action0;
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            try {
                this.getHighSpeedVideoSizes.onSuccess(t);
            } finally {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.call();
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwIfFatal(th);
                    rx.plugins.RxJavaHooks.onError(th);
                }
            }
        }

        @Override // rx.SingleSubscriber
        public final void onError(java.lang.Throwable th) {
            try {
                this.getHighSpeedVideoSizes.onError(th);
            } finally {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.call();
                } catch (java.lang.Throwable th2) {
                    rx.exceptions.Exceptions.throwIfFatal(th2);
                    rx.plugins.RxJavaHooks.onError(th2);
                }
            }
        }
    }
}

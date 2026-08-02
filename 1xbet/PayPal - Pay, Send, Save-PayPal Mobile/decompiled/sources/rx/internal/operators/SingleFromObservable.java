package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleFromObservable<T> implements rx.Single.OnSubscribe<T> {
    final rx.Observable.OnSubscribe<T> getHighSpeedVideoFpsRangesFor;

    public SingleFromObservable(rx.Observable.OnSubscribe<T> onSubscribe) {
        this.getHighSpeedVideoFpsRangesFor = onSubscribe;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        rx.internal.operators.SingleFromObservable.WrapSingleIntoSubscriber wrapSingleIntoSubscriber = new rx.internal.operators.SingleFromObservable.WrapSingleIntoSubscriber(singleSubscriber);
        singleSubscriber.add(wrapSingleIntoSubscriber);
        this.getHighSpeedVideoFpsRangesFor.call(wrapSingleIntoSubscriber);
    }

    static final class WrapSingleIntoSubscriber<T> extends rx.Subscriber<T> {
        int Camera2StreamConfigurationMap;
        T getHighSpeedVideoFpsRanges;
        final rx.SingleSubscriber<? super T> getHighSpeedVideoSizes;

        WrapSingleIntoSubscriber(rx.SingleSubscriber<? super T> singleSubscriber) {
            this.getHighSpeedVideoSizes = singleSubscriber;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                this.Camera2StreamConfigurationMap = 1;
                this.getHighSpeedVideoFpsRanges = t;
            } else if (i == 1) {
                this.Camera2StreamConfigurationMap = 2;
                this.getHighSpeedVideoSizes.onError(new java.lang.IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap == 2) {
                rx.plugins.RxJavaHooks.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoSizes.onError(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                this.getHighSpeedVideoSizes.onError(new java.util.NoSuchElementException());
            } else if (i == 1) {
                this.Camera2StreamConfigurationMap = 2;
                T t = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoSizes.onSuccess(t);
            }
        }
    }
}

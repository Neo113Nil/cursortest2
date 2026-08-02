package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleOnErrorReturn<T> implements rx.Single.OnSubscribe<T> {
    final rx.Single.OnSubscribe<T> Camera2StreamConfigurationMap;
    final rx.functions.Func1<java.lang.Throwable, ? extends T> getHighSpeedVideoFpsRangesFor;

    public SingleOnErrorReturn(rx.Single.OnSubscribe<T> onSubscribe, rx.functions.Func1<java.lang.Throwable, ? extends T> func1) {
        this.Camera2StreamConfigurationMap = onSubscribe;
        this.getHighSpeedVideoFpsRangesFor = func1;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        rx.internal.operators.SingleOnErrorReturn.OnErrorReturnsSingleSubscriber onErrorReturnsSingleSubscriber = new rx.internal.operators.SingleOnErrorReturn.OnErrorReturnsSingleSubscriber(singleSubscriber, this.getHighSpeedVideoFpsRangesFor);
        singleSubscriber.add(onErrorReturnsSingleSubscriber);
        this.Camera2StreamConfigurationMap.call(onErrorReturnsSingleSubscriber);
    }

    static final class OnErrorReturnsSingleSubscriber<T> extends rx.SingleSubscriber<T> {
        final rx.functions.Func1<java.lang.Throwable, ? extends T> Camera2StreamConfigurationMap;
        final rx.SingleSubscriber<? super T> getHighSpeedVideoFpsRanges;

        public OnErrorReturnsSingleSubscriber(rx.SingleSubscriber<? super T> singleSubscriber, rx.functions.Func1<java.lang.Throwable, ? extends T> func1) {
            this.getHighSpeedVideoFpsRanges = singleSubscriber;
            this.Camera2StreamConfigurationMap = func1;
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRanges.onSuccess(t);
        }

        @Override // rx.SingleSubscriber
        public final void onError(java.lang.Throwable th) {
            try {
                this.getHighSpeedVideoFpsRanges.onSuccess(this.Camera2StreamConfigurationMap.call(th));
            } catch (java.lang.Throwable th2) {
                rx.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighSpeedVideoFpsRanges.onError(th2);
            }
        }
    }
}

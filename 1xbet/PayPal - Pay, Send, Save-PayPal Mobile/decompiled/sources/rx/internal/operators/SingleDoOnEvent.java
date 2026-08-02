package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleDoOnEvent<T> implements rx.Single.OnSubscribe<T> {
    final rx.functions.Action1<? super T> Camera2StreamConfigurationMap;
    final rx.functions.Action1<java.lang.Throwable> getHighResolutionOutputSizeshNQ4ISI;
    final rx.Single<T> getHighSpeedVideoFpsRanges;

    public SingleDoOnEvent(rx.Single<T> single, rx.functions.Action1<? super T> action1, rx.functions.Action1<java.lang.Throwable> action12) {
        this.getHighSpeedVideoFpsRanges = single;
        this.Camera2StreamConfigurationMap = action1;
        this.getHighResolutionOutputSizeshNQ4ISI = action12;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        rx.internal.operators.SingleDoOnEvent.SingleDoOnEventSubscriber singleDoOnEventSubscriber = new rx.internal.operators.SingleDoOnEvent.SingleDoOnEventSubscriber(singleSubscriber, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        singleSubscriber.add(singleDoOnEventSubscriber);
        this.getHighSpeedVideoFpsRanges.subscribe(singleDoOnEventSubscriber);
    }

    static final class SingleDoOnEventSubscriber<T> extends rx.SingleSubscriber<T> {
        final rx.SingleSubscriber<? super T> Camera2StreamConfigurationMap;
        final rx.functions.Action1<java.lang.Throwable> getHighSpeedVideoFpsRanges;
        final rx.functions.Action1<? super T> getHighSpeedVideoFpsRangesFor;

        SingleDoOnEventSubscriber(rx.SingleSubscriber<? super T> singleSubscriber, rx.functions.Action1<? super T> action1, rx.functions.Action1<java.lang.Throwable> action12) {
            this.Camera2StreamConfigurationMap = singleSubscriber;
            this.getHighSpeedVideoFpsRangesFor = action1;
            this.getHighSpeedVideoFpsRanges = action12;
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            try {
                this.getHighSpeedVideoFpsRangesFor.call(t);
                this.Camera2StreamConfigurationMap.onSuccess(t);
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, this, t);
            }
        }

        @Override // rx.SingleSubscriber
        public final void onError(java.lang.Throwable th) {
            try {
                this.getHighSpeedVideoFpsRanges.call(th);
                this.Camera2StreamConfigurationMap.onError(th);
            } catch (java.lang.Throwable th2) {
                rx.exceptions.Exceptions.throwIfFatal(th2);
                this.Camera2StreamConfigurationMap.onError(new rx.exceptions.CompositeException(th, th2));
            }
        }
    }
}

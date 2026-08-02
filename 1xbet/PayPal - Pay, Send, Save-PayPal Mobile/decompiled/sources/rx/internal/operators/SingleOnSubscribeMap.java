package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleOnSubscribeMap<T, R> implements rx.Single.OnSubscribe<R> {
    final rx.Single<T> Camera2StreamConfigurationMap;
    final rx.functions.Func1<? super T, ? extends R> getHighSpeedVideoFpsRangesFor;

    public SingleOnSubscribeMap(rx.Single<T> single, rx.functions.Func1<? super T, ? extends R> func1) {
        this.Camera2StreamConfigurationMap = single;
        this.getHighSpeedVideoFpsRangesFor = func1;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super R> singleSubscriber) {
        rx.internal.operators.SingleOnSubscribeMap.MapSubscriber mapSubscriber = new rx.internal.operators.SingleOnSubscribeMap.MapSubscriber(singleSubscriber, this.getHighSpeedVideoFpsRangesFor);
        singleSubscriber.add(mapSubscriber);
        this.Camera2StreamConfigurationMap.subscribe(mapSubscriber);
    }

    static final class MapSubscriber<T, R> extends rx.SingleSubscriber<T> {
        final rx.SingleSubscriber<? super R> getHighResolutionOutputSizeshNQ4ISI;
        final rx.functions.Func1<? super T, ? extends R> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoSizes;

        public MapSubscriber(rx.SingleSubscriber<? super R> singleSubscriber, rx.functions.Func1<? super T, ? extends R> func1) {
            this.getHighResolutionOutputSizeshNQ4ISI = singleSubscriber;
            this.getHighSpeedVideoFpsRanges = func1;
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(this.getHighSpeedVideoFpsRanges.call(t));
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(rx.exceptions.OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // rx.SingleSubscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                rx.plugins.RxJavaHooks.onError(th);
            } else {
                this.getHighSpeedVideoSizes = true;
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }
    }
}

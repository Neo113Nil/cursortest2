package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorMapPair<T, U, R> implements rx.Observable.Operator<rx.Observable<? extends R>, T> {
    final rx.functions.Func2<? super T, ? super U, ? extends R> Camera2StreamConfigurationMap;
    final rx.functions.Func1<? super T, ? extends rx.Observable<? extends U>> getHighSpeedVideoFpsRanges;

    public static <T, U> rx.functions.Func1<T, rx.Observable<U>> convertSelector(final rx.functions.Func1<? super T, ? extends java.lang.Iterable<? extends U>> func1) {
        return new rx.functions.Func1<T, rx.Observable<U>>() { // from class: rx.internal.operators.OperatorMapPair.1
            @Override // rx.functions.Func1
            public final /* synthetic */ java.lang.Object call(java.lang.Object obj) {
                return rx.Observable.from((java.lang.Iterable) rx.functions.Func1.this.call(obj));
            }
        };
    }

    public OperatorMapPair(rx.functions.Func1<? super T, ? extends rx.Observable<? extends U>> func1, rx.functions.Func2<? super T, ? super U, ? extends R> func2) {
        this.getHighSpeedVideoFpsRanges = func1;
        this.Camera2StreamConfigurationMap = func2;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super rx.Observable<? extends R>> subscriber) {
        rx.internal.operators.OperatorMapPair.MapPairSubscriber mapPairSubscriber = new rx.internal.operators.OperatorMapPair.MapPairSubscriber(subscriber, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
        subscriber.add(mapPairSubscriber);
        return mapPairSubscriber;
    }

    static final class MapPairSubscriber<T, U, R> extends rx.Subscriber<T> {
        final rx.Subscriber<? super rx.Observable<? extends R>> Camera2StreamConfigurationMap;
        final rx.functions.Func2<? super T, ? super U, ? extends R> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final rx.functions.Func1<? super T, ? extends rx.Observable<? extends U>> getHighSpeedVideoSizes;

        public MapPairSubscriber(rx.Subscriber<? super rx.Observable<? extends R>> subscriber, rx.functions.Func1<? super T, ? extends rx.Observable<? extends U>> func1, rx.functions.Func2<? super T, ? super U, ? extends R> func2) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoSizes = func1;
            this.getHighResolutionOutputSizeshNQ4ISI = func2;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            try {
                this.Camera2StreamConfigurationMap.onNext(this.getHighSpeedVideoSizes.call(t).map(new rx.internal.operators.OperatorMapPair.OuterInnerMapper(t, this.getHighResolutionOutputSizeshNQ4ISI)));
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(rx.exceptions.OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                rx.plugins.RxJavaHooks.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = true;
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.Camera2StreamConfigurationMap.onCompleted();
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            this.Camera2StreamConfigurationMap.setProducer(producer);
        }
    }

    static final class OuterInnerMapper<T, U, R> implements rx.functions.Func1<U, R> {
        final T getHighResolutionOutputSizeshNQ4ISI;
        final rx.functions.Func2<? super T, ? super U, ? extends R> getHighSpeedVideoFpsRanges;

        public OuterInnerMapper(T t, rx.functions.Func2<? super T, ? super U, ? extends R> func2) {
            this.getHighResolutionOutputSizeshNQ4ISI = t;
            this.getHighSpeedVideoFpsRanges = func2;
        }

        @Override // rx.functions.Func1
        public final R call(U u) {
            return this.getHighSpeedVideoFpsRanges.call(this.getHighResolutionOutputSizeshNQ4ISI, u);
        }
    }
}

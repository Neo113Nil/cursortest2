package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeToMap<T, K, V> implements rx.Observable.OnSubscribe<java.util.Map<K, V>>, rx.functions.Func0<java.util.Map<K, V>> {
    final rx.Observable<T> Camera2StreamConfigurationMap;
    final rx.functions.Func0<? extends java.util.Map<K, V>> getHighResolutionOutputSizeshNQ4ISI;
    final rx.functions.Func1<? super T, ? extends V> getHighSpeedVideoFpsRanges;
    final rx.functions.Func1<? super T, ? extends K> getHighSpeedVideoSizes;

    public OnSubscribeToMap(rx.Observable<T> observable, rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12) {
        this(observable, func1, func12, null);
    }

    public OnSubscribeToMap(rx.Observable<T> observable, rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12, rx.functions.Func0<? extends java.util.Map<K, V>> func0) {
        this.Camera2StreamConfigurationMap = observable;
        this.getHighSpeedVideoSizes = func1;
        this.getHighSpeedVideoFpsRanges = func12;
        if (func0 == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = this;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = func0;
        }
    }

    @Override // rx.functions.Func0, java.util.concurrent.Callable
    public final java.util.Map<K, V> call() {
        return new java.util.HashMap();
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super java.util.Map<K, V>> subscriber) {
        try {
            new rx.internal.operators.OnSubscribeToMap.ToMapSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI.call(), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges).subscribeTo(this.Camera2StreamConfigurationMap);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwOrReport(th, subscriber);
        }
    }

    static final class ToMapSubscriber<T, K, V> extends rx.internal.operators.DeferredScalarSubscriberSafe<T, java.util.Map<K, V>> {
        final rx.functions.Func1<? super T, ? extends K> Camera2StreamConfigurationMap;
        final rx.functions.Func1<? super T, ? extends V> getHighSpeedVideoFpsRanges;

        /* JADX WARN: Multi-variable type inference failed */
        ToMapSubscriber(rx.Subscriber<? super java.util.Map<K, V>> subscriber, java.util.Map<K, V> map, rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12) {
            super(subscriber);
            this.value = map;
            this.hasValue = true;
            this.Camera2StreamConfigurationMap = func1;
            this.getHighSpeedVideoFpsRanges = func12;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                ((java.util.Map) this.value).put(this.Camera2StreamConfigurationMap.call(t), this.getHighSpeedVideoFpsRanges.call(t));
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(th);
            }
        }
    }
}

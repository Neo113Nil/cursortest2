package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeToMultimap<T, K, V> implements rx.Observable.OnSubscribe<java.util.Map<K, java.util.Collection<V>>>, rx.functions.Func0<java.util.Map<K, java.util.Collection<V>>> {
    private final rx.functions.Func1<? super K, ? extends java.util.Collection<V>> Camera2StreamConfigurationMap;
    private final rx.Observable<T> getHighResolutionOutputSizeshNQ4ISI;
    private final rx.functions.Func0<? extends java.util.Map<K, java.util.Collection<V>>> getHighSpeedVideoFpsRanges;
    private final rx.functions.Func1<? super T, ? extends V> getHighSpeedVideoFpsRangesFor;
    private final rx.functions.Func1<? super T, ? extends K> getHighSpeedVideoSizes;

    public OnSubscribeToMultimap(rx.Observable<T> observable, rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12) {
        this(observable, func1, func12, null, rx.internal.operators.OnSubscribeToMultimap.DefaultMultimapCollectionFactory.Camera2StreamConfigurationMap());
    }

    public OnSubscribeToMultimap(rx.Observable<T> observable, rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12, rx.functions.Func0<? extends java.util.Map<K, java.util.Collection<V>>> func0) {
        this(observable, func1, func12, func0, rx.internal.operators.OnSubscribeToMultimap.DefaultMultimapCollectionFactory.Camera2StreamConfigurationMap());
    }

    public OnSubscribeToMultimap(rx.Observable<T> observable, rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12, rx.functions.Func0<? extends java.util.Map<K, java.util.Collection<V>>> func0, rx.functions.Func1<? super K, ? extends java.util.Collection<V>> func13) {
        this.getHighResolutionOutputSizeshNQ4ISI = observable;
        this.getHighSpeedVideoSizes = func1;
        this.getHighSpeedVideoFpsRangesFor = func12;
        if (func0 == null) {
            this.getHighSpeedVideoFpsRanges = this;
        } else {
            this.getHighSpeedVideoFpsRanges = func0;
        }
        this.Camera2StreamConfigurationMap = func13;
    }

    @Override // rx.functions.Func0, java.util.concurrent.Callable
    public final java.util.Map<K, java.util.Collection<V>> call() {
        return new java.util.HashMap();
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super java.util.Map<K, java.util.Collection<V>>> subscriber) {
        try {
            new rx.internal.operators.OnSubscribeToMultimap.ToMultimapSubscriber(subscriber, this.getHighSpeedVideoFpsRanges.call(), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap).subscribeTo(this.getHighResolutionOutputSizeshNQ4ISI);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }

    static final class ToMultimapSubscriber<T, K, V> extends rx.internal.operators.DeferredScalarSubscriberSafe<T, java.util.Map<K, java.util.Collection<V>>> {
        private final rx.functions.Func1<? super T, ? extends K> Camera2StreamConfigurationMap;
        private final rx.functions.Func1<? super K, ? extends java.util.Collection<V>> getHighSpeedVideoFpsRanges;
        private final rx.functions.Func1<? super T, ? extends V> getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Multi-variable type inference failed */
        ToMultimapSubscriber(rx.Subscriber<? super java.util.Map<K, java.util.Collection<V>>> subscriber, java.util.Map<K, java.util.Collection<V>> map, rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12, rx.functions.Func1<? super K, ? extends java.util.Collection<V>> func13) {
            super(subscriber);
            this.value = map;
            this.hasValue = true;
            this.Camera2StreamConfigurationMap = func1;
            this.getHighSpeedVideoFpsRangesFor = func12;
            this.getHighSpeedVideoFpsRanges = func13;
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
                K call = this.Camera2StreamConfigurationMap.call(t);
                V call2 = this.getHighSpeedVideoFpsRangesFor.call(t);
                java.util.Collection<V> collection = (java.util.Collection) ((java.util.Map) this.value).get(call);
                if (collection == null) {
                    collection = this.getHighSpeedVideoFpsRanges.call(call);
                    ((java.util.Map) this.value).put(call, collection);
                }
                collection.add(call2);
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(th);
            }
        }
    }

    static final class DefaultMultimapCollectionFactory<K, V> implements rx.functions.Func1<K, java.util.Collection<V>> {
        private static final rx.internal.operators.OnSubscribeToMultimap.DefaultMultimapCollectionFactory<java.lang.Object, java.lang.Object> getHighSpeedVideoSizes = new rx.internal.operators.OnSubscribeToMultimap.DefaultMultimapCollectionFactory<>();

        private DefaultMultimapCollectionFactory() {
        }

        static <K, V> rx.internal.operators.OnSubscribeToMultimap.DefaultMultimapCollectionFactory<K, V> Camera2StreamConfigurationMap() {
            return (rx.internal.operators.OnSubscribeToMultimap.DefaultMultimapCollectionFactory<K, V>) getHighSpeedVideoSizes;
        }

        @Override // rx.functions.Func1
        public final /* synthetic */ java.lang.Object call(java.lang.Object obj) {
            return new java.util.ArrayList();
        }
    }
}

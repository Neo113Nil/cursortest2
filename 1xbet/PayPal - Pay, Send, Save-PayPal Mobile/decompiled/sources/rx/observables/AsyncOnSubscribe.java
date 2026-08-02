package rx.observables;

/* loaded from: classes18.dex */
public abstract class AsyncOnSubscribe<S, T> implements rx.Observable.OnSubscribe<T> {
    protected abstract S generateState();

    protected abstract S next(S s, long j, rx.Observer<rx.Observable<? extends T>> observer);

    protected void onUnsubscribe(S s) {
    }

    public static <S, T> rx.observables.AsyncOnSubscribe<S, T> createSingleState(rx.functions.Func0<? extends S> func0, final rx.functions.Action3<? super S, java.lang.Long, ? super rx.Observer<rx.Observable<? extends T>>> action3) {
        return new rx.observables.AsyncOnSubscribe.AsyncOnSubscribeImpl(func0, new rx.functions.Func3<S, java.lang.Long, rx.Observer<rx.Observable<? extends T>>, S>() { // from class: rx.observables.AsyncOnSubscribe.1
            @Override // rx.functions.Func3
            public final /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object obj, java.lang.Long l, java.lang.Object obj2) {
                rx.functions.Action3.this.call(obj, l, (rx.Observer) obj2);
                return obj;
            }
        });
    }

    public static <S, T> rx.observables.AsyncOnSubscribe<S, T> createSingleState(rx.functions.Func0<? extends S> func0, final rx.functions.Action3<? super S, java.lang.Long, ? super rx.Observer<rx.Observable<? extends T>>> action3, rx.functions.Action1<? super S> action1) {
        return new rx.observables.AsyncOnSubscribe.AsyncOnSubscribeImpl(func0, new rx.functions.Func3<S, java.lang.Long, rx.Observer<rx.Observable<? extends T>>, S>() { // from class: rx.observables.AsyncOnSubscribe.2
            @Override // rx.functions.Func3
            public final /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object obj, java.lang.Long l, java.lang.Object obj2) {
                rx.functions.Action3.this.call(obj, l, (rx.Observer) obj2);
                return obj;
            }
        }, action1);
    }

    public static <S, T> rx.observables.AsyncOnSubscribe<S, T> createStateful(rx.functions.Func0<? extends S> func0, rx.functions.Func3<? super S, java.lang.Long, ? super rx.Observer<rx.Observable<? extends T>>, ? extends S> func3, rx.functions.Action1<? super S> action1) {
        return new rx.observables.AsyncOnSubscribe.AsyncOnSubscribeImpl(func0, func3, action1);
    }

    public static <S, T> rx.observables.AsyncOnSubscribe<S, T> createStateful(rx.functions.Func0<? extends S> func0, rx.functions.Func3<? super S, java.lang.Long, ? super rx.Observer<rx.Observable<? extends T>>, ? extends S> func3) {
        return new rx.observables.AsyncOnSubscribe.AsyncOnSubscribeImpl(func0, func3);
    }

    public static <T> rx.observables.AsyncOnSubscribe<java.lang.Void, T> createStateless(final rx.functions.Action2<java.lang.Long, ? super rx.Observer<rx.Observable<? extends T>>> action2) {
        return new rx.observables.AsyncOnSubscribe.AsyncOnSubscribeImpl(new rx.functions.Func3<java.lang.Void, java.lang.Long, rx.Observer<rx.Observable<? extends T>>, java.lang.Void>() { // from class: rx.observables.AsyncOnSubscribe.3
            @Override // rx.functions.Func3
            public final /* bridge */ /* synthetic */ java.lang.Void call(java.lang.Void r2, java.lang.Long l, java.lang.Object obj) {
                java.lang.Void r22 = r2;
                rx.functions.Action2.this.call(l, (rx.Observer) obj);
                return r22;
            }
        });
    }

    public static <T> rx.observables.AsyncOnSubscribe<java.lang.Void, T> createStateless(final rx.functions.Action2<java.lang.Long, ? super rx.Observer<rx.Observable<? extends T>>> action2, final rx.functions.Action0 action0) {
        return new rx.observables.AsyncOnSubscribe.AsyncOnSubscribeImpl(new rx.functions.Func3<java.lang.Void, java.lang.Long, rx.Observer<rx.Observable<? extends T>>, java.lang.Void>() { // from class: rx.observables.AsyncOnSubscribe.4
            @Override // rx.functions.Func3
            public final /* bridge */ /* synthetic */ java.lang.Void call(java.lang.Void r1, java.lang.Long l, java.lang.Object obj) {
                rx.functions.Action2.this.call(l, (rx.Observer) obj);
                return null;
            }
        }, new rx.functions.Action1<java.lang.Void>() { // from class: rx.observables.AsyncOnSubscribe.5
            @Override // rx.functions.Action1
            public final /* bridge */ /* synthetic */ void call(java.lang.Void r1) {
                rx.functions.Action0.this.call();
            }
        });
    }

    static final class AsyncOnSubscribeImpl<S, T> extends rx.observables.AsyncOnSubscribe<S, T> {
        private final rx.functions.Func0<? extends S> getHighResolutionOutputSizeshNQ4ISI;
        private final rx.functions.Func3<? super S, java.lang.Long, ? super rx.Observer<rx.Observable<? extends T>>, ? extends S> getHighSpeedVideoFpsRanges;
        private final rx.functions.Action1<? super S> getHighSpeedVideoSizes;

        @Override // rx.observables.AsyncOnSubscribe, rx.functions.Action1
        public final /* bridge */ /* synthetic */ void call(java.lang.Object obj) {
            super.call((rx.Subscriber) obj);
        }

        AsyncOnSubscribeImpl(rx.functions.Func0<? extends S> func0, rx.functions.Func3<? super S, java.lang.Long, ? super rx.Observer<rx.Observable<? extends T>>, ? extends S> func3, rx.functions.Action1<? super S> action1) {
            this.getHighResolutionOutputSizeshNQ4ISI = func0;
            this.getHighSpeedVideoFpsRanges = func3;
            this.getHighSpeedVideoSizes = action1;
        }

        public AsyncOnSubscribeImpl(rx.functions.Func0<? extends S> func0, rx.functions.Func3<? super S, java.lang.Long, ? super rx.Observer<rx.Observable<? extends T>>, ? extends S> func3) {
            this(func0, func3, null);
        }

        public AsyncOnSubscribeImpl(rx.functions.Func3<S, java.lang.Long, rx.Observer<rx.Observable<? extends T>>, S> func3, rx.functions.Action1<? super S> action1) {
            this(null, func3, action1);
        }

        public AsyncOnSubscribeImpl(rx.functions.Func3<S, java.lang.Long, rx.Observer<rx.Observable<? extends T>>, S> func3) {
            this(null, func3, null);
        }

        @Override // rx.observables.AsyncOnSubscribe
        protected final S generateState() {
            rx.functions.Func0<? extends S> func0 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (func0 == null) {
                return null;
            }
            return func0.call();
        }

        @Override // rx.observables.AsyncOnSubscribe
        protected final S next(S s, long j, rx.Observer<rx.Observable<? extends T>> observer) {
            return this.getHighSpeedVideoFpsRanges.call(s, java.lang.Long.valueOf(j), observer);
        }

        @Override // rx.observables.AsyncOnSubscribe
        protected final void onUnsubscribe(S s) {
            rx.functions.Action1<? super S> action1 = this.getHighSpeedVideoSizes;
            if (action1 != null) {
                action1.call(s);
            }
        }
    }

    @Override // rx.functions.Action1
    public final void call(final rx.Subscriber<? super T> subscriber) {
        try {
            S generateState = generateState();
            rx.observables.AsyncOnSubscribe.UnicastSubject highSpeedVideoFpsRangesFor = rx.observables.AsyncOnSubscribe.UnicastSubject.getHighSpeedVideoFpsRangesFor();
            final rx.observables.AsyncOnSubscribe.AsyncOuterManager asyncOuterManager = new rx.observables.AsyncOnSubscribe.AsyncOuterManager(this, generateState, highSpeedVideoFpsRangesFor);
            rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>() { // from class: rx.observables.AsyncOnSubscribe.6
                @Override // rx.Observer
                public void onNext(T t) {
                    subscriber.onNext(t);
                }

                @Override // rx.Observer
                public void onError(java.lang.Throwable th) {
                    subscriber.onError(th);
                }

                @Override // rx.Observer
                public void onCompleted() {
                    subscriber.onCompleted();
                }

                @Override // rx.Subscriber, rx.observers.AssertableSubscriber
                public void setProducer(rx.Producer producer) {
                    rx.observables.AsyncOnSubscribe.AsyncOuterManager asyncOuterManager2 = asyncOuterManager;
                    if (asyncOuterManager2.Camera2StreamConfigurationMap != null) {
                        throw new java.lang.IllegalStateException("setConcatProducer may be called at most once!");
                    }
                    asyncOuterManager2.Camera2StreamConfigurationMap = producer;
                }
            };
            highSpeedVideoFpsRangesFor.onBackpressureBuffer().concatMap(new rx.functions.Func1<rx.Observable<T>, rx.Observable<T>>() { // from class: rx.observables.AsyncOnSubscribe.7
                @Override // rx.functions.Func1
                public /* synthetic */ java.lang.Object call(java.lang.Object obj) {
                    return ((rx.Observable) obj).onBackpressureBuffer();
                }
            }).unsafeSubscribe(subscriber2);
            subscriber.add(subscriber2);
            subscriber.add(asyncOuterManager);
            subscriber.setProducer(asyncOuterManager);
        } catch (java.lang.Throwable th) {
            subscriber.onError(th);
        }
    }

    static final class AsyncOuterManager<S, T> implements rx.Producer, rx.Subscription, rx.Observer<rx.Observable<? extends T>> {
        rx.Producer Camera2StreamConfigurationMap;
        java.util.List<java.lang.Long> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        private final rx.observables.AsyncOnSubscribe.UnicastSubject<rx.Observable<T>> getHighSpeedVideoSizesFor;
        private final rx.observables.AsyncOnSubscribe<S, T> getInputFormats;
        private boolean getInputSizeshNQ4ISI;
        private boolean getOutputMinFrameDuration;
        private S getOutputMinFrameDurationlomOqCM;
        final rx.subscriptions.CompositeSubscription getOutputFormats = new rx.subscriptions.CompositeSubscription();
        private final rx.observers.SerializedObserver<rx.Observable<? extends T>> getOutputSizes = new rx.observers.SerializedObserver<>(this);
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean();

        @Override // rx.Observer
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            rx.Observable observable = (rx.Observable) obj;
            if (this.getOutputMinFrameDuration) {
                throw new java.lang.IllegalStateException("onNext called multiple times!");
            }
            this.getOutputMinFrameDuration = true;
            if (this.getInputSizeshNQ4ISI) {
                return;
            }
            rx.internal.operators.BufferUntilSubscriber create = rx.internal.operators.BufferUntilSubscriber.create();
            final rx.Subscriber<T> subscriber = new rx.Subscriber<T>(this.getHighSpeedVideoFpsRangesFor, create) { // from class: rx.observables.AsyncOnSubscribe.AsyncOuterManager.1
                long Camera2StreamConfigurationMap;
                final /* synthetic */ rx.internal.operators.BufferUntilSubscriber getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ long getHighSpeedVideoFpsRangesFor;

                {
                    this.getHighSpeedVideoFpsRangesFor = r2;
                    this.getHighResolutionOutputSizeshNQ4ISI = create;
                    this.Camera2StreamConfigurationMap = r2;
                }

                @Override // rx.Observer
                public void onNext(T t) {
                    this.Camera2StreamConfigurationMap--;
                    this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                }

                @Override // rx.Observer
                public void onError(java.lang.Throwable th) {
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                }

                @Override // rx.Observer
                public void onCompleted() {
                    this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
                    long j = this.Camera2StreamConfigurationMap;
                    if (j <= 0) {
                        return;
                    }
                    rx.observables.AsyncOnSubscribe.AsyncOuterManager asyncOuterManager = rx.observables.AsyncOnSubscribe.AsyncOuterManager.this;
                    if (j == 0) {
                        return;
                    }
                    if (j < 0) {
                        throw new java.lang.IllegalStateException("Request can't be negative! ".concat(java.lang.String.valueOf(j)));
                    }
                    synchronized (asyncOuterManager) {
                        if (asyncOuterManager.getHighSpeedVideoFpsRanges) {
                            java.util.List list = asyncOuterManager.getHighResolutionOutputSizeshNQ4ISI;
                            if (list == null) {
                                list = new java.util.ArrayList();
                                asyncOuterManager.getHighResolutionOutputSizeshNQ4ISI = list;
                            }
                            list.add(java.lang.Long.valueOf(j));
                            return;
                        }
                        asyncOuterManager.getHighSpeedVideoFpsRanges = true;
                        if (asyncOuterManager.getHighSpeedVideoFpsRangesFor(j)) {
                            return;
                        }
                        while (true) {
                            synchronized (asyncOuterManager) {
                                java.util.List<java.lang.Long> list2 = asyncOuterManager.getHighResolutionOutputSizeshNQ4ISI;
                                if (list2 == null) {
                                    asyncOuterManager.getHighSpeedVideoFpsRanges = false;
                                    return;
                                }
                                asyncOuterManager.getHighResolutionOutputSizeshNQ4ISI = null;
                                java.util.Iterator<java.lang.Long> it = list2.iterator();
                                while (it.hasNext()) {
                                    if (asyncOuterManager.getHighSpeedVideoFpsRangesFor(it.next().longValue())) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            };
            this.getOutputFormats.add(subscriber);
            observable.doOnTerminate(new rx.functions.Action0() { // from class: rx.observables.AsyncOnSubscribe.AsyncOuterManager.2
                @Override // rx.functions.Action0
                public void call() {
                    rx.observables.AsyncOnSubscribe.AsyncOuterManager.this.getOutputFormats.remove(subscriber);
                }
            }).subscribe((rx.Subscriber) subscriber);
            this.getHighSpeedVideoSizesFor.onNext(create);
        }

        public AsyncOuterManager(rx.observables.AsyncOnSubscribe<S, T> asyncOnSubscribe, S s, rx.observables.AsyncOnSubscribe.UnicastSubject<rx.Observable<T>> unicastSubject) {
            this.getInputFormats = asyncOnSubscribe;
            this.getOutputMinFrameDurationlomOqCM = s;
            this.getHighSpeedVideoSizesFor = unicastSubject;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                synchronized (this) {
                    if (this.getHighSpeedVideoFpsRanges) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        this.getHighResolutionOutputSizeshNQ4ISI = arrayList;
                        arrayList.add(0L);
                    } else {
                        this.getHighSpeedVideoFpsRanges = true;
                        this.getOutputFormats.unsubscribe();
                        try {
                            this.getInputFormats.onUnsubscribe(this.getOutputMinFrameDurationlomOqCM);
                        } catch (java.lang.Throwable th) {
                            getHighSpeedVideoFpsRangesFor(th);
                        }
                    }
                }
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighSpeedVideoSizes.get();
        }

        @Override // rx.Producer
        public final void request(long j) {
            boolean z;
            if (j == 0) {
                return;
            }
            if (j < 0) {
                throw new java.lang.IllegalStateException("Request can't be negative! ".concat(java.lang.String.valueOf(j)));
            }
            synchronized (this) {
                z = true;
                if (this.getHighSpeedVideoFpsRanges) {
                    java.util.List list = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (list == null) {
                        list = new java.util.ArrayList();
                        this.getHighResolutionOutputSizeshNQ4ISI = list;
                    }
                    list.add(java.lang.Long.valueOf(j));
                } else {
                    this.getHighSpeedVideoFpsRanges = true;
                    z = false;
                }
            }
            this.Camera2StreamConfigurationMap.request(j);
            if (z || getHighSpeedVideoFpsRangesFor(j)) {
                return;
            }
            while (true) {
                synchronized (this) {
                    java.util.List<java.lang.Long> list2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (list2 == null) {
                        this.getHighSpeedVideoFpsRanges = false;
                        return;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    java.util.Iterator<java.lang.Long> it = list2.iterator();
                    while (it.hasNext()) {
                        if (getHighSpeedVideoFpsRangesFor(it.next().longValue())) {
                            return;
                        }
                    }
                }
            }
        }

        final boolean getHighSpeedVideoFpsRangesFor(long j) {
            if (!isUnsubscribed()) {
                try {
                    this.getOutputMinFrameDuration = false;
                    this.getHighSpeedVideoFpsRangesFor = j;
                    this.getOutputMinFrameDurationlomOqCM = this.getInputFormats.next(this.getOutputMinFrameDurationlomOqCM, j, this.getOutputSizes);
                    if ((!this.getInputSizeshNQ4ISI || this.getOutputFormats.hasSubscriptions()) && !isUnsubscribed()) {
                        if (this.getOutputMinFrameDuration) {
                            return false;
                        }
                        getHighSpeedVideoFpsRangesFor(new java.lang.IllegalStateException("No events emitted!"));
                        return true;
                    }
                    this.getOutputFormats.unsubscribe();
                    try {
                        this.getInputFormats.onUnsubscribe(this.getOutputMinFrameDurationlomOqCM);
                    } catch (java.lang.Throwable th) {
                        getHighSpeedVideoFpsRangesFor(th);
                    }
                    return true;
                } catch (java.lang.Throwable th2) {
                    getHighSpeedVideoFpsRangesFor(th2);
                    return true;
                }
            }
            this.getOutputFormats.unsubscribe();
            try {
                this.getInputFormats.onUnsubscribe(this.getOutputMinFrameDurationlomOqCM);
            } catch (java.lang.Throwable th3) {
                getHighSpeedVideoFpsRangesFor(th3);
            }
            return true;
        }

        private void getHighSpeedVideoFpsRangesFor(java.lang.Throwable th) {
            while (!this.getInputSizeshNQ4ISI) {
                this.getInputSizeshNQ4ISI = true;
                this.getHighSpeedVideoSizesFor.onError(th);
                this.getOutputFormats.unsubscribe();
                try {
                    this.getInputFormats.onUnsubscribe(this.getOutputMinFrameDurationlomOqCM);
                    return;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
            rx.plugins.RxJavaHooks.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getInputSizeshNQ4ISI) {
                throw new java.lang.IllegalStateException("Terminal event already emitted.");
            }
            this.getInputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizesFor.onCompleted();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getInputSizeshNQ4ISI) {
                throw new java.lang.IllegalStateException("Terminal event already emitted.");
            }
            this.getInputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizesFor.onError(th);
        }
    }

    static final class UnicastSubject<T> extends rx.Observable<T> implements rx.Observer<T> {
        private final rx.observables.AsyncOnSubscribe.UnicastSubject.State<T> getHighSpeedVideoFpsRanges;

        public static <T> rx.observables.AsyncOnSubscribe.UnicastSubject<T> getHighSpeedVideoFpsRangesFor() {
            return new rx.observables.AsyncOnSubscribe.UnicastSubject<>(new rx.observables.AsyncOnSubscribe.UnicastSubject.State());
        }

        private UnicastSubject(rx.observables.AsyncOnSubscribe.UnicastSubject.State<T> state) {
            super(state);
            this.getHighSpeedVideoFpsRanges = state;
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.onCompleted();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.onNext(t);
        }

        static final class State<T> implements rx.Observable.OnSubscribe<T> {
            rx.Subscriber<? super T> Camera2StreamConfigurationMap;

            State() {
            }

            @Override // rx.functions.Action1
            public final /* synthetic */ void call(java.lang.Object obj) {
                rx.Subscriber<? super T> subscriber = (rx.Subscriber) obj;
                synchronized (this) {
                    if (this.Camera2StreamConfigurationMap == null) {
                        this.Camera2StreamConfigurationMap = subscriber;
                    } else {
                        subscriber.onError(new java.lang.IllegalStateException("There can be only one subscriber"));
                    }
                }
            }
        }
    }
}

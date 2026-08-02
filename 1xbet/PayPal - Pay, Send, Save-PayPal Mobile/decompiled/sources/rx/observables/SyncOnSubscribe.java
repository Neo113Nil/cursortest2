package rx.observables;

/* loaded from: classes18.dex */
public abstract class SyncOnSubscribe<S, T> implements rx.Observable.OnSubscribe<T> {
    protected abstract S generateState();

    protected abstract S next(S s, rx.Observer<? super T> observer);

    protected void onUnsubscribe(S s) {
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        try {
            rx.observables.SyncOnSubscribe.SubscriptionProducer subscriptionProducer = new rx.observables.SyncOnSubscribe.SubscriptionProducer(subscriber, this, generateState());
            subscriber.add(subscriptionProducer);
            subscriber.setProducer(subscriptionProducer);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }

    public static <S, T> rx.observables.SyncOnSubscribe<S, T> createSingleState(rx.functions.Func0<? extends S> func0, final rx.functions.Action2<? super S, ? super rx.Observer<? super T>> action2) {
        return new rx.observables.SyncOnSubscribe.SyncOnSubscribeImpl(func0, new rx.functions.Func2<S, rx.Observer<? super T>, S>() { // from class: rx.observables.SyncOnSubscribe.1
            @Override // rx.functions.Func2
            public final /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object obj, java.lang.Object obj2) {
                rx.functions.Action2.this.call(obj, (rx.Observer) obj2);
                return obj;
            }
        });
    }

    public static <S, T> rx.observables.SyncOnSubscribe<S, T> createSingleState(rx.functions.Func0<? extends S> func0, final rx.functions.Action2<? super S, ? super rx.Observer<? super T>> action2, rx.functions.Action1<? super S> action1) {
        return new rx.observables.SyncOnSubscribe.SyncOnSubscribeImpl(func0, new rx.functions.Func2<S, rx.Observer<? super T>, S>() { // from class: rx.observables.SyncOnSubscribe.2
            @Override // rx.functions.Func2
            public final /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object obj, java.lang.Object obj2) {
                rx.functions.Action2.this.call(obj, (rx.Observer) obj2);
                return obj;
            }
        }, action1);
    }

    public static <S, T> rx.observables.SyncOnSubscribe<S, T> createStateful(rx.functions.Func0<? extends S> func0, rx.functions.Func2<? super S, ? super rx.Observer<? super T>, ? extends S> func2, rx.functions.Action1<? super S> action1) {
        return new rx.observables.SyncOnSubscribe.SyncOnSubscribeImpl(func0, func2, action1);
    }

    public static <S, T> rx.observables.SyncOnSubscribe<S, T> createStateful(rx.functions.Func0<? extends S> func0, rx.functions.Func2<? super S, ? super rx.Observer<? super T>, ? extends S> func2) {
        return new rx.observables.SyncOnSubscribe.SyncOnSubscribeImpl(func0, func2);
    }

    public static <T> rx.observables.SyncOnSubscribe<java.lang.Void, T> createStateless(final rx.functions.Action1<? super rx.Observer<? super T>> action1) {
        return new rx.observables.SyncOnSubscribe.SyncOnSubscribeImpl(new rx.functions.Func2<java.lang.Void, rx.Observer<? super T>, java.lang.Void>() { // from class: rx.observables.SyncOnSubscribe.3
            @Override // rx.functions.Func2
            public final /* bridge */ /* synthetic */ java.lang.Void call(java.lang.Void r2, java.lang.Object obj) {
                java.lang.Void r22 = r2;
                rx.functions.Action1.this.call((rx.Observer) obj);
                return r22;
            }
        });
    }

    public static <T> rx.observables.SyncOnSubscribe<java.lang.Void, T> createStateless(final rx.functions.Action1<? super rx.Observer<? super T>> action1, final rx.functions.Action0 action0) {
        return new rx.observables.SyncOnSubscribe.SyncOnSubscribeImpl(new rx.functions.Func2<java.lang.Void, rx.Observer<? super T>, java.lang.Void>() { // from class: rx.observables.SyncOnSubscribe.4
            @Override // rx.functions.Func2
            public final /* bridge */ /* synthetic */ java.lang.Void call(java.lang.Void r1, java.lang.Object obj) {
                rx.functions.Action1.this.call((rx.Observer) obj);
                return null;
            }
        }, new rx.functions.Action1<java.lang.Void>() { // from class: rx.observables.SyncOnSubscribe.5
            @Override // rx.functions.Action1
            public final /* bridge */ /* synthetic */ void call(java.lang.Void r1) {
                rx.functions.Action0.this.call();
            }
        });
    }

    static final class SyncOnSubscribeImpl<S, T> extends rx.observables.SyncOnSubscribe<S, T> {
        private final rx.functions.Action1<? super S> Camera2StreamConfigurationMap;
        private final rx.functions.Func2<? super S, ? super rx.Observer<? super T>, ? extends S> getHighSpeedVideoFpsRanges;
        private final rx.functions.Func0<? extends S> getHighSpeedVideoSizes;

        @Override // rx.observables.SyncOnSubscribe, rx.functions.Action1
        public final /* bridge */ /* synthetic */ void call(java.lang.Object obj) {
            super.call((rx.Subscriber) obj);
        }

        SyncOnSubscribeImpl(rx.functions.Func0<? extends S> func0, rx.functions.Func2<? super S, ? super rx.Observer<? super T>, ? extends S> func2, rx.functions.Action1<? super S> action1) {
            this.getHighSpeedVideoSizes = func0;
            this.getHighSpeedVideoFpsRanges = func2;
            this.Camera2StreamConfigurationMap = action1;
        }

        public SyncOnSubscribeImpl(rx.functions.Func0<? extends S> func0, rx.functions.Func2<? super S, ? super rx.Observer<? super T>, ? extends S> func2) {
            this(func0, func2, null);
        }

        public SyncOnSubscribeImpl(rx.functions.Func2<S, rx.Observer<? super T>, S> func2, rx.functions.Action1<? super S> action1) {
            this(null, func2, action1);
        }

        public SyncOnSubscribeImpl(rx.functions.Func2<S, rx.Observer<? super T>, S> func2) {
            this(null, func2, null);
        }

        @Override // rx.observables.SyncOnSubscribe
        protected final S generateState() {
            rx.functions.Func0<? extends S> func0 = this.getHighSpeedVideoSizes;
            if (func0 == null) {
                return null;
            }
            return func0.call();
        }

        @Override // rx.observables.SyncOnSubscribe
        protected final S next(S s, rx.Observer<? super T> observer) {
            return this.getHighSpeedVideoFpsRanges.call(s, observer);
        }

        @Override // rx.observables.SyncOnSubscribe
        protected final void onUnsubscribe(S s) {
            rx.functions.Action1<? super S> action1 = this.Camera2StreamConfigurationMap;
            if (action1 != null) {
                action1.call(s);
            }
        }
    }

    static final class SubscriptionProducer<S, T> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer, rx.Subscription, rx.Observer<T> {
        private static final long serialVersionUID = -3736864024352728072L;
        private final rx.observables.SyncOnSubscribe<S, T> Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        private S getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor;
        private final rx.Subscriber<? super T> getHighSpeedVideoSizes;

        SubscriptionProducer(rx.Subscriber<? super T> subscriber, rx.observables.SyncOnSubscribe<S, T> syncOnSubscribe, S s) {
            this.getHighSpeedVideoSizes = subscriber;
            this.Camera2StreamConfigurationMap = syncOnSubscribe;
            this.getHighSpeedVideoFpsRanges = s;
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return get() < 0;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            long j;
            do {
                j = get();
                if (compareAndSet(0L, -1L)) {
                    try {
                        this.Camera2StreamConfigurationMap.onUnsubscribe(this.getHighSpeedVideoFpsRanges);
                        return;
                    } catch (java.lang.Throwable th) {
                        rx.exceptions.Exceptions.throwIfFatal(th);
                        rx.plugins.RxJavaHooks.onError(th);
                        return;
                    }
                }
            } while (!compareAndSet(j, -2L));
        }

        private boolean getHighSpeedVideoFpsRanges() {
            if (!this.getHighSpeedVideoFpsRangesFor && get() >= -1) {
                return false;
            }
            set(-1L);
            try {
                this.Camera2StreamConfigurationMap.onUnsubscribe(this.getHighSpeedVideoFpsRanges);
                return true;
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                rx.plugins.RxJavaHooks.onError(th);
                return true;
            }
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (j <= 0 || rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j) != 0) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                rx.observables.SyncOnSubscribe<S, T> syncOnSubscribe = this.Camera2StreamConfigurationMap;
                rx.Subscriber<? super T> subscriber = this.getHighSpeedVideoSizes;
                do {
                    try {
                        this.getHighResolutionOutputSizeshNQ4ISI = false;
                        this.getHighSpeedVideoFpsRanges = syncOnSubscribe.next(this.getHighSpeedVideoFpsRanges, this);
                    } catch (java.lang.Throwable th) {
                        if (this.getHighSpeedVideoFpsRangesFor) {
                            rx.plugins.RxJavaHooks.onError(th);
                            return;
                        }
                        this.getHighSpeedVideoFpsRangesFor = true;
                        subscriber.onError(th);
                        unsubscribe();
                        return;
                    }
                } while (!getHighSpeedVideoFpsRanges());
                return;
            }
            rx.observables.SyncOnSubscribe<S, T> syncOnSubscribe2 = this.Camera2StreamConfigurationMap;
            rx.Subscriber<? super T> subscriber2 = this.getHighSpeedVideoSizes;
            do {
                long j2 = j;
                do {
                    try {
                        this.getHighResolutionOutputSizeshNQ4ISI = false;
                        this.getHighSpeedVideoFpsRanges = syncOnSubscribe2.next(this.getHighSpeedVideoFpsRanges, this);
                        if (getHighSpeedVideoFpsRanges()) {
                            return;
                        }
                        if (this.getHighResolutionOutputSizeshNQ4ISI) {
                            j2--;
                        }
                    } catch (java.lang.Throwable th2) {
                        if (this.getHighSpeedVideoFpsRangesFor) {
                            rx.plugins.RxJavaHooks.onError(th2);
                            return;
                        }
                        this.getHighSpeedVideoFpsRangesFor = true;
                        subscriber2.onError(th2);
                        unsubscribe();
                        return;
                    }
                } while (j2 != 0);
                j = addAndGet(-j);
            } while (j > 0);
            getHighSpeedVideoFpsRanges();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalStateException("Terminal event already emitted.");
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            if (this.getHighSpeedVideoSizes.isUnsubscribed()) {
                return;
            }
            this.getHighSpeedVideoSizes.onCompleted();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalStateException("Terminal event already emitted.");
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            if (this.getHighSpeedVideoSizes.isUnsubscribed()) {
                return;
            }
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                throw new java.lang.IllegalStateException("onNext called multiple times!");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizes.onNext(t);
        }
    }
}

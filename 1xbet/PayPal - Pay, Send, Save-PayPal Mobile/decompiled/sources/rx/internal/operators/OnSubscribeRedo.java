package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeRedo<T> implements rx.Observable.OnSubscribe<T> {
    static final rx.functions.Func1<rx.Observable<? extends rx.Notification<?>>, rx.Observable<?>> Camera2StreamConfigurationMap = new rx.functions.Func1<rx.Observable<? extends rx.Notification<?>>, rx.Observable<?>>() { // from class: rx.internal.operators.OnSubscribeRedo.1
        @Override // rx.functions.Func1
        public final /* synthetic */ rx.Observable<?> call(rx.Observable<? extends rx.Notification<?>> observable) {
            return observable.map(new rx.functions.Func1<rx.Notification<?>, rx.Notification<?>>() { // from class: rx.internal.operators.OnSubscribeRedo.1.1
                @Override // rx.functions.Func1
                public /* synthetic */ rx.Notification<?> call(rx.Notification<?> notification) {
                    return rx.Notification.createOnNext(null);
                }
            });
        }
    };
    final rx.Observable<T> getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    private final rx.functions.Func1<? super rx.Observable<? extends rx.Notification<?>>, ? extends rx.Observable<?>> getHighSpeedVideoSizes;
    private final rx.Scheduler getOutputMinFrameDuration;

    public static final class RedoFinite implements rx.functions.Func1<rx.Observable<? extends rx.Notification<?>>, rx.Observable<?>> {
        final long getHighSpeedVideoFpsRangesFor;

        public RedoFinite(long j) {
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        @Override // rx.functions.Func1
        public final rx.Observable<?> call(rx.Observable<? extends rx.Notification<?>> observable) {
            return observable.map(new rx.functions.Func1<rx.Notification<?>, rx.Notification<?>>() { // from class: rx.internal.operators.OnSubscribeRedo.RedoFinite.1
                int Camera2StreamConfigurationMap;

                @Override // rx.functions.Func1
                public /* synthetic */ rx.Notification<?> call(rx.Notification<?> notification) {
                    rx.Notification<?> notification2 = notification;
                    if (rx.internal.operators.OnSubscribeRedo.RedoFinite.this.getHighSpeedVideoFpsRangesFor == 0) {
                        return notification2;
                    }
                    int i = this.Camera2StreamConfigurationMap + 1;
                    this.Camera2StreamConfigurationMap = i;
                    return ((long) i) <= rx.internal.operators.OnSubscribeRedo.RedoFinite.this.getHighSpeedVideoFpsRangesFor ? rx.Notification.createOnNext(java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap)) : notification2;
                }
            }).dematerialize();
        }
    }

    public static final class RetryWithPredicate implements rx.functions.Func1<rx.Observable<? extends rx.Notification<?>>, rx.Observable<? extends rx.Notification<?>>> {
        final rx.functions.Func2<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> Camera2StreamConfigurationMap;

        public RetryWithPredicate(rx.functions.Func2<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> func2) {
            this.Camera2StreamConfigurationMap = func2;
        }

        @Override // rx.functions.Func1
        public final rx.Observable<? extends rx.Notification<?>> call(rx.Observable<? extends rx.Notification<?>> observable) {
            return observable.scan(rx.Notification.createOnNext(0), new rx.functions.Func2<rx.Notification<java.lang.Integer>, rx.Notification<?>, rx.Notification<java.lang.Integer>>() { // from class: rx.internal.operators.OnSubscribeRedo.RetryWithPredicate.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // rx.functions.Func2
                public /* synthetic */ rx.Notification<java.lang.Integer> call(rx.Notification<java.lang.Integer> notification, rx.Notification<?> notification2) {
                    rx.Notification<?> notification3 = notification2;
                    int intValue = notification.getValue().intValue();
                    return rx.internal.operators.OnSubscribeRedo.RetryWithPredicate.this.Camera2StreamConfigurationMap.call(java.lang.Integer.valueOf(intValue), notification3.getThrowable()).booleanValue() ? rx.Notification.createOnNext(java.lang.Integer.valueOf(intValue + 1)) : notification3;
                }
            });
        }
    }

    public static <T> rx.Observable<T> retry(rx.Observable<T> observable) {
        return retry(observable, Camera2StreamConfigurationMap);
    }

    public static <T> rx.Observable<T> retry(rx.Observable<T> observable, long j) {
        if (j >= 0) {
            return j == 0 ? observable : retry(observable, new rx.internal.operators.OnSubscribeRedo.RedoFinite(j));
        }
        throw new java.lang.IllegalArgumentException("count >= 0 expected");
    }

    public static <T> rx.Observable<T> retry(rx.Observable<T> observable, rx.functions.Func1<? super rx.Observable<? extends rx.Notification<?>>, ? extends rx.Observable<?>> func1) {
        return rx.Observable.unsafeCreate(new rx.internal.operators.OnSubscribeRedo(observable, func1, true, false, rx.schedulers.Schedulers.trampoline()));
    }

    public static <T> rx.Observable<T> retry(rx.Observable<T> observable, rx.functions.Func1<? super rx.Observable<? extends rx.Notification<?>>, ? extends rx.Observable<?>> func1, rx.Scheduler scheduler) {
        return rx.Observable.unsafeCreate(new rx.internal.operators.OnSubscribeRedo(observable, func1, true, false, scheduler));
    }

    public static <T> rx.Observable<T> repeat(rx.Observable<T> observable) {
        return repeat(observable, rx.schedulers.Schedulers.trampoline());
    }

    public static <T> rx.Observable<T> repeat(rx.Observable<T> observable, rx.Scheduler scheduler) {
        return repeat(observable, Camera2StreamConfigurationMap, scheduler);
    }

    public static <T> rx.Observable<T> repeat(rx.Observable<T> observable, long j) {
        return repeat(observable, j, rx.schedulers.Schedulers.trampoline());
    }

    public static <T> rx.Observable<T> repeat(rx.Observable<T> observable, long j, rx.Scheduler scheduler) {
        if (j == 0) {
            return rx.Observable.empty();
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("count >= 0 expected");
        }
        return repeat(observable, new rx.internal.operators.OnSubscribeRedo.RedoFinite(j - 1), scheduler);
    }

    public static <T> rx.Observable<T> repeat(rx.Observable<T> observable, rx.functions.Func1<? super rx.Observable<? extends rx.Notification<?>>, ? extends rx.Observable<?>> func1) {
        return rx.Observable.unsafeCreate(new rx.internal.operators.OnSubscribeRedo(observable, func1, false, true, rx.schedulers.Schedulers.trampoline()));
    }

    public static <T> rx.Observable<T> repeat(rx.Observable<T> observable, rx.functions.Func1<? super rx.Observable<? extends rx.Notification<?>>, ? extends rx.Observable<?>> func1, rx.Scheduler scheduler) {
        return rx.Observable.unsafeCreate(new rx.internal.operators.OnSubscribeRedo(observable, func1, false, true, scheduler));
    }

    public static <T> rx.Observable<T> redo(rx.Observable<T> observable, rx.functions.Func1<? super rx.Observable<? extends rx.Notification<?>>, ? extends rx.Observable<?>> func1, rx.Scheduler scheduler) {
        return rx.Observable.unsafeCreate(new rx.internal.operators.OnSubscribeRedo(observable, func1, false, false, scheduler));
    }

    private OnSubscribeRedo(rx.Observable<T> observable, rx.functions.Func1<? super rx.Observable<? extends rx.Notification<?>>, ? extends rx.Observable<?>> func1, boolean z, boolean z2, rx.Scheduler scheduler) {
        this.getHighResolutionOutputSizeshNQ4ISI = observable;
        this.getHighSpeedVideoSizes = func1;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoFpsRanges = z2;
        this.getOutputMinFrameDuration = scheduler;
    }

    @Override // rx.functions.Action1
    public final void call(final rx.Subscriber<? super T> subscriber) {
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        final java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
        final rx.Scheduler.Worker createWorker = this.getOutputMinFrameDuration.createWorker();
        subscriber.add(createWorker);
        final rx.subscriptions.SerialSubscription serialSubscription = new rx.subscriptions.SerialSubscription();
        subscriber.add(serialSubscription);
        final rx.subjects.SerializedSubject<T, T> serialized = rx.subjects.BehaviorSubject.create().toSerialized();
        serialized.subscribe((rx.Subscriber) rx.observers.Subscribers.empty());
        final rx.internal.producers.ProducerArbiter producerArbiter = new rx.internal.producers.ProducerArbiter();
        final rx.functions.Action0 action0 = new rx.functions.Action0() { // from class: rx.internal.operators.OnSubscribeRedo.2
            @Override // rx.functions.Action0
            public void call() {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>() { // from class: rx.internal.operators.OnSubscribeRedo.2.1
                    boolean getHighSpeedVideoFpsRangesFor;

                    @Override // rx.Observer
                    public void onCompleted() {
                        if (this.getHighSpeedVideoFpsRangesFor) {
                            return;
                        }
                        this.getHighSpeedVideoFpsRangesFor = true;
                        unsubscribe();
                        serialized.onNext(rx.Notification.createOnCompleted());
                    }

                    @Override // rx.Observer
                    public void onError(java.lang.Throwable th) {
                        if (this.getHighSpeedVideoFpsRangesFor) {
                            return;
                        }
                        this.getHighSpeedVideoFpsRangesFor = true;
                        unsubscribe();
                        serialized.onNext(rx.Notification.createOnError(th));
                    }

                    @Override // rx.Observer
                    public void onNext(T t) {
                        long j;
                        if (this.getHighSpeedVideoFpsRangesFor) {
                            return;
                        }
                        subscriber.onNext(t);
                        do {
                            j = atomicLong.get();
                            if (j == Long.MAX_VALUE) {
                                break;
                            }
                        } while (!atomicLong.compareAndSet(j, j - 1));
                        producerArbiter.produced(1L);
                    }

                    @Override // rx.Subscriber, rx.observers.AssertableSubscriber
                    public void setProducer(rx.Producer producer) {
                        producerArbiter.setProducer(producer);
                    }
                };
                serialSubscription.set(subscriber2);
                rx.internal.operators.OnSubscribeRedo.this.getHighResolutionOutputSizeshNQ4ISI.unsafeSubscribe(subscriber2);
            }
        };
        final rx.Observable<?> call = this.getHighSpeedVideoSizes.call(serialized.lift(new rx.Observable.Operator<rx.Notification<?>, rx.Notification<?>>() { // from class: rx.internal.operators.OnSubscribeRedo.3
            @Override // rx.functions.Func1
            public /* synthetic */ java.lang.Object call(java.lang.Object obj) {
                final rx.Subscriber subscriber2 = (rx.Subscriber) obj;
                return new rx.Subscriber<rx.Notification<?>>(subscriber2) { // from class: rx.internal.operators.OnSubscribeRedo.3.1
                    @Override // rx.Observer
                    public /* synthetic */ void onNext(java.lang.Object obj2) {
                        rx.Notification notification = (rx.Notification) obj2;
                        if (notification.isOnCompleted() && rx.internal.operators.OnSubscribeRedo.this.getHighSpeedVideoFpsRangesFor) {
                            subscriber2.onCompleted();
                        } else if (notification.isOnError() && rx.internal.operators.OnSubscribeRedo.this.getHighSpeedVideoFpsRanges) {
                            subscriber2.onError(notification.getThrowable());
                        } else {
                            subscriber2.onNext(notification);
                        }
                    }

                    @Override // rx.Observer
                    public void onCompleted() {
                        subscriber2.onCompleted();
                    }

                    @Override // rx.Observer
                    public void onError(java.lang.Throwable th) {
                        subscriber2.onError(th);
                    }

                    @Override // rx.Subscriber, rx.observers.AssertableSubscriber
                    public void setProducer(rx.Producer producer) {
                        producer.request(Long.MAX_VALUE);
                    }
                };
            }
        }));
        createWorker.schedule(new rx.functions.Action0() { // from class: rx.internal.operators.OnSubscribeRedo.4
            @Override // rx.functions.Action0
            public void call() {
                call.unsafeSubscribe(new rx.Subscriber<java.lang.Object>(subscriber) { // from class: rx.internal.operators.OnSubscribeRedo.4.1
                    @Override // rx.Observer
                    public void onCompleted() {
                        subscriber.onCompleted();
                    }

                    @Override // rx.Observer
                    public void onError(java.lang.Throwable th) {
                        subscriber.onError(th);
                    }

                    @Override // rx.Observer
                    public void onNext(java.lang.Object obj) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        if (atomicLong.get() > 0) {
                            createWorker.schedule(action0);
                        } else {
                            atomicBoolean.compareAndSet(false, true);
                        }
                    }

                    @Override // rx.Subscriber, rx.observers.AssertableSubscriber
                    public void setProducer(rx.Producer producer) {
                        producer.request(Long.MAX_VALUE);
                    }
                });
            }
        });
        subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OnSubscribeRedo.5
            @Override // rx.Producer
            public void request(long j) {
                if (j > 0) {
                    rx.internal.operators.BackpressureUtils.getAndAddRequest(atomicLong, j);
                    producerArbiter.request(j);
                    if (atomicBoolean.compareAndSet(true, false)) {
                        createWorker.schedule(action0);
                    }
                }
            }
        });
    }
}

package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeConcatMap<T, R> implements rx.Observable.OnSubscribe<R> {
    public static final int BOUNDARY = 1;
    public static final int END = 2;
    public static final int IMMEDIATE = 0;
    final int Camera2StreamConfigurationMap;
    final rx.Observable<? extends T> getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;
    final rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> getHighSpeedVideoSizes;

    public OnSubscribeConcatMap(rx.Observable<? extends T> observable, rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1, int i, int i2) {
        this.getHighSpeedVideoFpsRanges = observable;
        this.getHighSpeedVideoSizes = func1;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super R> subscriber) {
        final rx.internal.operators.OnSubscribeConcatMap.ConcatMapSubscriber concatMapSubscriber = new rx.internal.operators.OnSubscribeConcatMap.ConcatMapSubscriber(this.getHighSpeedVideoFpsRangesFor == 0 ? new rx.observers.SerializedSubscriber<>(subscriber) : subscriber, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        subscriber.add(concatMapSubscriber);
        subscriber.add(concatMapSubscriber.getInputFormats);
        subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OnSubscribeConcatMap.1
            @Override // rx.Producer
            public void request(long j) {
                rx.internal.operators.OnSubscribeConcatMap.ConcatMapSubscriber concatMapSubscriber2 = concatMapSubscriber;
                if (j > 0) {
                    concatMapSubscriber2.getHighSpeedVideoFpsRanges.request(j);
                } else if (j < 0) {
                    throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
                }
            }
        });
        if (subscriber.isUnsubscribed()) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.unsafeSubscribe(concatMapSubscriber);
    }

    static final class ConcatMapSubscriber<T, R> extends rx.Subscriber<T> {
        final rx.Subscriber<? super R> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;
        final rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> getHighSpeedVideoSizesFor;
        final rx.subscriptions.SerialSubscription getInputFormats;
        final java.util.Queue<java.lang.Object> getInputSizeshNQ4ISI;
        final rx.internal.producers.ProducerArbiter getHighSpeedVideoFpsRanges = new rx.internal.producers.ProducerArbiter();
        final java.util.concurrent.atomic.AtomicInteger getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>();

        public ConcatMapSubscriber(rx.Subscriber<? super R> subscriber, rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1, int i, int i2) {
            java.util.Queue<java.lang.Object> spscAtomicArrayQueue;
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoSizesFor = func1;
            this.getHighSpeedVideoSizes = i2;
            if (rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable()) {
                spscAtomicArrayQueue = new rx.internal.util.unsafe.SpscArrayQueue<>(i);
            } else {
                spscAtomicArrayQueue = new rx.internal.util.atomic.SpscAtomicArrayQueue<>(i);
            }
            this.getInputSizeshNQ4ISI = spscAtomicArrayQueue;
            this.getInputFormats = new rx.subscriptions.SerialSubscription();
            request(i);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (!this.getInputSizeshNQ4ISI.offer(rx.internal.operators.NotificationLite.next(t))) {
                unsubscribe();
                onError(new rx.exceptions.MissingBackpressureException());
            } else {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (rx.internal.util.ExceptionsUtils.addThrowable(this.getOutputFormats, th)) {
                this.getHighSpeedVideoFpsRangesFor = true;
                if (this.getHighSpeedVideoSizes == 0) {
                    java.lang.Throwable terminate = rx.internal.util.ExceptionsUtils.terminate(this.getOutputFormats);
                    if (!rx.internal.util.ExceptionsUtils.isTerminated(terminate)) {
                        this.Camera2StreamConfigurationMap.onError(terminate);
                    }
                    this.getInputFormats.unsubscribe();
                    return;
                }
                getHighSpeedVideoFpsRanges();
                return;
            }
            rx.plugins.RxJavaHooks.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRangesFor = true;
            getHighSpeedVideoFpsRanges();
        }

        static void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
            rx.plugins.RxJavaHooks.onError(th);
        }

        final void getHighSpeedVideoFpsRanges() {
            if (this.getOutputMinFrameDuration.getAndIncrement() == 0) {
                int i = this.getHighSpeedVideoSizes;
                while (!this.Camera2StreamConfigurationMap.isUnsubscribed()) {
                    if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                        if (i == 1 && this.getOutputFormats.get() != null) {
                            java.lang.Throwable terminate = rx.internal.util.ExceptionsUtils.terminate(this.getOutputFormats);
                            if (rx.internal.util.ExceptionsUtils.isTerminated(terminate)) {
                                return;
                            }
                            this.Camera2StreamConfigurationMap.onError(terminate);
                            return;
                        }
                        boolean z = this.getHighSpeedVideoFpsRangesFor;
                        java.lang.Object poll = this.getInputSizeshNQ4ISI.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            java.lang.Throwable terminate2 = rx.internal.util.ExceptionsUtils.terminate(this.getOutputFormats);
                            if (terminate2 == null) {
                                this.Camera2StreamConfigurationMap.onCompleted();
                                return;
                            } else {
                                if (rx.internal.util.ExceptionsUtils.isTerminated(terminate2)) {
                                    return;
                                }
                                this.Camera2StreamConfigurationMap.onError(terminate2);
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                rx.Observable<? extends R> call = this.getHighSpeedVideoSizesFor.call((java.lang.Object) rx.internal.operators.NotificationLite.getValue(poll));
                                if (call == null) {
                                    getHighSpeedVideoSizes(new java.lang.NullPointerException("The source returned by the mapper was null"));
                                    return;
                                }
                                if (call != rx.Observable.empty()) {
                                    if (call instanceof rx.internal.util.ScalarSynchronousObservable) {
                                        this.getHighResolutionOutputSizeshNQ4ISI = true;
                                        this.getHighSpeedVideoFpsRanges.setProducer(new rx.internal.operators.OnSubscribeConcatMap.ConcatMapInnerScalarProducer(((rx.internal.util.ScalarSynchronousObservable) call).get(), this));
                                    } else {
                                        rx.internal.operators.OnSubscribeConcatMap.ConcatMapInnerSubscriber concatMapInnerSubscriber = new rx.internal.operators.OnSubscribeConcatMap.ConcatMapInnerSubscriber(this);
                                        this.getInputFormats.set(concatMapInnerSubscriber);
                                        if (concatMapInnerSubscriber.isUnsubscribed()) {
                                            return;
                                        }
                                        this.getHighResolutionOutputSizeshNQ4ISI = true;
                                        call.unsafeSubscribe(concatMapInnerSubscriber);
                                    }
                                    request(1L);
                                } else {
                                    request(1L);
                                }
                            } catch (java.lang.Throwable th) {
                                rx.exceptions.Exceptions.throwIfFatal(th);
                                getHighSpeedVideoSizes(th);
                                return;
                            }
                        }
                    }
                    if (this.getOutputMinFrameDuration.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        private void getHighSpeedVideoSizes(java.lang.Throwable th) {
            unsubscribe();
            if (rx.internal.util.ExceptionsUtils.addThrowable(this.getOutputFormats, th)) {
                java.lang.Throwable terminate = rx.internal.util.ExceptionsUtils.terminate(this.getOutputFormats);
                if (rx.internal.util.ExceptionsUtils.isTerminated(terminate)) {
                    return;
                }
                this.Camera2StreamConfigurationMap.onError(terminate);
                return;
            }
            rx.plugins.RxJavaHooks.onError(th);
        }
    }

    static final class ConcatMapInnerSubscriber<T, R> extends rx.Subscriber<R> {
        final rx.internal.operators.OnSubscribeConcatMap.ConcatMapSubscriber<T, R> getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoSizes;

        public ConcatMapInnerSubscriber(rx.internal.operators.OnSubscribeConcatMap.ConcatMapSubscriber<T, R> concatMapSubscriber) {
            this.getHighSpeedVideoFpsRanges = concatMapSubscriber;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.setProducer(producer);
        }

        @Override // rx.Observer
        public final void onNext(R r) {
            this.getHighSpeedVideoSizes++;
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.onNext(r);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            rx.internal.operators.OnSubscribeConcatMap.ConcatMapSubscriber<T, R> concatMapSubscriber = this.getHighSpeedVideoFpsRanges;
            long j = this.getHighSpeedVideoSizes;
            if (!rx.internal.util.ExceptionsUtils.addThrowable(concatMapSubscriber.getOutputFormats, th)) {
                rx.internal.operators.OnSubscribeConcatMap.ConcatMapSubscriber.getHighResolutionOutputSizeshNQ4ISI(th);
                return;
            }
            if (concatMapSubscriber.getHighSpeedVideoSizes == 0) {
                java.lang.Throwable terminate = rx.internal.util.ExceptionsUtils.terminate(concatMapSubscriber.getOutputFormats);
                if (!rx.internal.util.ExceptionsUtils.isTerminated(terminate)) {
                    concatMapSubscriber.Camera2StreamConfigurationMap.onError(terminate);
                }
                concatMapSubscriber.unsubscribe();
                return;
            }
            if (j != 0) {
                concatMapSubscriber.getHighSpeedVideoFpsRanges.produced(j);
            }
            concatMapSubscriber.getHighResolutionOutputSizeshNQ4ISI = false;
            concatMapSubscriber.getHighSpeedVideoFpsRanges();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            rx.internal.operators.OnSubscribeConcatMap.ConcatMapSubscriber<T, R> concatMapSubscriber = this.getHighSpeedVideoFpsRanges;
            long j = this.getHighSpeedVideoSizes;
            if (j != 0) {
                concatMapSubscriber.getHighSpeedVideoFpsRanges.produced(j);
            }
            concatMapSubscriber.getHighResolutionOutputSizeshNQ4ISI = false;
            concatMapSubscriber.getHighSpeedVideoFpsRanges();
        }
    }

    static final class ConcatMapInnerScalarProducer<T, R> implements rx.Producer {
        boolean Camera2StreamConfigurationMap;
        final rx.internal.operators.OnSubscribeConcatMap.ConcatMapSubscriber<T, R> getHighResolutionOutputSizeshNQ4ISI;
        final R getHighSpeedVideoFpsRangesFor;

        public ConcatMapInnerScalarProducer(R r, rx.internal.operators.OnSubscribeConcatMap.ConcatMapSubscriber<T, R> concatMapSubscriber) {
            this.getHighSpeedVideoFpsRangesFor = r;
            this.getHighResolutionOutputSizeshNQ4ISI = concatMapSubscriber;
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (this.Camera2StreamConfigurationMap || j <= 0) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            rx.internal.operators.OnSubscribeConcatMap.ConcatMapSubscriber<T, R> concatMapSubscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            concatMapSubscriber.Camera2StreamConfigurationMap.onNext(this.getHighSpeedVideoFpsRangesFor);
            concatMapSubscriber.getHighSpeedVideoFpsRanges.produced(1L);
            concatMapSubscriber.getHighResolutionOutputSizeshNQ4ISI = false;
            concatMapSubscriber.getHighSpeedVideoFpsRanges();
        }
    }
}

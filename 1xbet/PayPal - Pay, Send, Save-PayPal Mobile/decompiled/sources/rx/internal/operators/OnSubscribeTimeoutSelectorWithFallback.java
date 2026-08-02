package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeTimeoutSelectorWithFallback<T, U, V> implements rx.Observable.OnSubscribe<T> {
    final rx.Observable<U> getHighResolutionOutputSizeshNQ4ISI;
    final rx.Observable<T> getHighSpeedVideoFpsRanges;
    final rx.functions.Func1<? super T, ? extends rx.Observable<V>> getHighSpeedVideoFpsRangesFor;
    final rx.Observable<? extends T> getHighSpeedVideoSizes;

    public OnSubscribeTimeoutSelectorWithFallback(rx.Observable<T> observable, rx.Observable<U> observable2, rx.functions.Func1<? super T, ? extends rx.Observable<V>> func1, rx.Observable<? extends T> observable3) {
        this.getHighSpeedVideoFpsRanges = observable;
        this.getHighResolutionOutputSizeshNQ4ISI = observable2;
        this.getHighSpeedVideoFpsRangesFor = func1;
        this.getHighSpeedVideoSizes = observable3;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback.TimeoutMainSubscriber timeoutMainSubscriber = new rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback.TimeoutMainSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
        subscriber.add(timeoutMainSubscriber.getOutputMinFrameDuration);
        subscriber.setProducer(timeoutMainSubscriber.getHighResolutionOutputSizeshNQ4ISI);
        rx.Observable<U> observable = this.getHighResolutionOutputSizeshNQ4ISI;
        if (observable != null) {
            rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback.TimeoutMainSubscriber.TimeoutConsumer timeoutConsumer = new rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback.TimeoutMainSubscriber.TimeoutConsumer(0L);
            if (timeoutMainSubscriber.getInputFormats.replace(timeoutConsumer)) {
                observable.subscribe((rx.Subscriber<? super U>) timeoutConsumer);
            }
        }
        this.getHighSpeedVideoFpsRanges.subscribe((rx.Subscriber) timeoutMainSubscriber);
    }

    static final class TimeoutMainSubscriber<T> extends rx.Subscriber<T> {
        final rx.Observable<? extends T> Camera2StreamConfigurationMap;
        long getHighSpeedVideoFpsRanges;
        final rx.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        final rx.internal.subscriptions.SequentialSubscription getInputFormats;
        final rx.functions.Func1<? super T, ? extends rx.Observable<?>> getInputSizeshNQ4ISI;
        final rx.internal.subscriptions.SequentialSubscription getOutputMinFrameDuration;
        final rx.internal.producers.ProducerArbiter getHighResolutionOutputSizeshNQ4ISI = new rx.internal.producers.ProducerArbiter();
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicLong();

        TimeoutMainSubscriber(rx.Subscriber<? super T> subscriber, rx.functions.Func1<? super T, ? extends rx.Observable<?>> func1, rx.Observable<? extends T> observable) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getInputSizeshNQ4ISI = func1;
            this.Camera2StreamConfigurationMap = observable;
            rx.internal.subscriptions.SequentialSubscription sequentialSubscription = new rx.internal.subscriptions.SequentialSubscription();
            this.getInputFormats = sequentialSubscription;
            this.getOutputMinFrameDuration = new rx.internal.subscriptions.SequentialSubscription(this);
            add(sequentialSubscription);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            long j = this.getHighSpeedVideoSizes.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.getHighSpeedVideoSizes.compareAndSet(j, j2)) {
                    rx.Subscription subscription = this.getInputFormats.get();
                    if (subscription != null) {
                        subscription.unsubscribe();
                    }
                    this.getHighSpeedVideoFpsRangesFor.onNext(t);
                    this.getHighSpeedVideoFpsRanges++;
                    try {
                        rx.Observable<?> call = this.getInputSizeshNQ4ISI.call(t);
                        if (call == null) {
                            throw new java.lang.NullPointerException("The itemTimeoutIndicator returned a null Observable");
                        }
                        rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback.TimeoutMainSubscriber.TimeoutConsumer timeoutConsumer = new rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback.TimeoutMainSubscriber.TimeoutConsumer(j2);
                        if (this.getInputFormats.replace(timeoutConsumer)) {
                            call.subscribe((rx.Subscriber<? super java.lang.Object>) timeoutConsumer);
                        }
                    } catch (java.lang.Throwable th) {
                        rx.exceptions.Exceptions.throwIfFatal(th);
                        unsubscribe();
                        this.getHighSpeedVideoSizes.getAndSet(Long.MAX_VALUE);
                        this.getHighSpeedVideoFpsRangesFor.onError(th);
                    }
                }
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getInputFormats.unsubscribe();
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            } else {
                rx.plugins.RxJavaHooks.onError(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighSpeedVideoSizes.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getInputFormats.unsubscribe();
                this.getHighSpeedVideoFpsRangesFor.onCompleted();
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            this.getHighResolutionOutputSizeshNQ4ISI.setProducer(producer);
        }

        final void Camera2StreamConfigurationMap(long j) {
            if (this.getHighSpeedVideoSizes.compareAndSet(j, Long.MAX_VALUE)) {
                unsubscribe();
                if (this.Camera2StreamConfigurationMap == null) {
                    this.getHighSpeedVideoFpsRangesFor.onError(new java.util.concurrent.TimeoutException());
                    return;
                }
                long j2 = this.getHighSpeedVideoFpsRanges;
                if (j2 != 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI.produced(j2);
                }
                rx.internal.operators.OnSubscribeTimeoutTimedWithFallback.FallbackSubscriber fallbackSubscriber = new rx.internal.operators.OnSubscribeTimeoutTimedWithFallback.FallbackSubscriber(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
                if (this.getOutputMinFrameDuration.replace(fallbackSubscriber)) {
                    this.Camera2StreamConfigurationMap.subscribe((rx.Subscriber<? super java.lang.Object>) fallbackSubscriber);
                }
            }
        }

        final class TimeoutConsumer extends rx.Subscriber<java.lang.Object> {
            boolean Camera2StreamConfigurationMap;
            final long getHighSpeedVideoFpsRangesFor;

            TimeoutConsumer(long j) {
                this.getHighSpeedVideoFpsRangesFor = j;
            }

            @Override // rx.Observer
            public final void onNext(java.lang.Object obj) {
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                unsubscribe();
                rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback.TimeoutMainSubscriber.this.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor);
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                if (!this.Camera2StreamConfigurationMap) {
                    this.Camera2StreamConfigurationMap = true;
                    rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback.TimeoutMainSubscriber timeoutMainSubscriber = rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback.TimeoutMainSubscriber.this;
                    if (timeoutMainSubscriber.getHighSpeedVideoSizes.compareAndSet(this.getHighSpeedVideoFpsRangesFor, Long.MAX_VALUE)) {
                        timeoutMainSubscriber.unsubscribe();
                        timeoutMainSubscriber.getHighSpeedVideoFpsRangesFor.onError(th);
                        return;
                    } else {
                        rx.plugins.RxJavaHooks.onError(th);
                        return;
                    }
                }
                rx.plugins.RxJavaHooks.onError(th);
            }

            @Override // rx.Observer
            public final void onCompleted() {
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback.TimeoutMainSubscriber.this.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor);
            }
        }
    }
}

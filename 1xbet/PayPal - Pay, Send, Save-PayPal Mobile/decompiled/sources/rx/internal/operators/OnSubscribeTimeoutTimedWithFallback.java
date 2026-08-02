package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeTimeoutTimedWithFallback<T> implements rx.Observable.OnSubscribe<T> {
    final long Camera2StreamConfigurationMap;
    final rx.Scheduler getHighResolutionOutputSizeshNQ4ISI;
    final rx.Observable<? extends T> getHighSpeedVideoFpsRanges;
    final rx.Observable<T> getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.TimeUnit getHighSpeedVideoSizes;

    public OnSubscribeTimeoutTimedWithFallback(rx.Observable<T> observable, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler, rx.Observable<? extends T> observable2) {
        this.getHighSpeedVideoFpsRangesFor = observable;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoSizes = timeUnit;
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        this.getHighSpeedVideoFpsRanges = observable2;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        rx.internal.operators.OnSubscribeTimeoutTimedWithFallback.TimeoutMainSubscriber timeoutMainSubscriber = new rx.internal.operators.OnSubscribeTimeoutTimedWithFallback.TimeoutMainSubscriber(subscriber, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI.createWorker(), this.getHighSpeedVideoFpsRanges);
        subscriber.add(timeoutMainSubscriber.getOutputMinFrameDuration);
        subscriber.setProducer(timeoutMainSubscriber.Camera2StreamConfigurationMap);
        timeoutMainSubscriber.getHighResolutionOutputSizeshNQ4ISI(0L);
        this.getHighSpeedVideoFpsRangesFor.subscribe((rx.Subscriber) timeoutMainSubscriber);
    }

    static final class TimeoutMainSubscriber<T> extends rx.Subscriber<T> {
        final rx.Observable<? extends T> getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRangesFor;
        final rx.Subscriber<? super T> getHighSpeedVideoSizes;
        final java.util.concurrent.TimeUnit getHighSpeedVideoSizesFor;
        final rx.Scheduler.Worker getInputFormats;
        final rx.internal.subscriptions.SequentialSubscription getInputSizeshNQ4ISI;
        final long getOutputFormats;
        final rx.internal.subscriptions.SequentialSubscription getOutputMinFrameDuration;
        final rx.internal.producers.ProducerArbiter Camera2StreamConfigurationMap = new rx.internal.producers.ProducerArbiter();
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong();

        TimeoutMainSubscriber(rx.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler.Worker worker, rx.Observable<? extends T> observable) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getOutputFormats = j;
            this.getHighSpeedVideoSizesFor = timeUnit;
            this.getInputFormats = worker;
            this.getHighResolutionOutputSizeshNQ4ISI = observable;
            rx.internal.subscriptions.SequentialSubscription sequentialSubscription = new rx.internal.subscriptions.SequentialSubscription();
            this.getInputSizeshNQ4ISI = sequentialSubscription;
            this.getOutputMinFrameDuration = new rx.internal.subscriptions.SequentialSubscription(this);
            add(worker);
            add(sequentialSubscription);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            long j = this.getHighSpeedVideoFpsRanges.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.getHighSpeedVideoFpsRanges.compareAndSet(j, j2)) {
                    rx.Subscription subscription = this.getInputSizeshNQ4ISI.get();
                    if (subscription != null) {
                        subscription.unsubscribe();
                    }
                    this.getHighSpeedVideoFpsRangesFor++;
                    this.getHighSpeedVideoSizes.onNext(t);
                    getHighResolutionOutputSizeshNQ4ISI(j2);
                }
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(long j) {
            this.getInputSizeshNQ4ISI.replace(this.getInputFormats.schedule(new rx.internal.operators.OnSubscribeTimeoutTimedWithFallback.TimeoutMainSubscriber.TimeoutTask(j), this.getOutputFormats, this.getHighSpeedVideoSizesFor));
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getInputSizeshNQ4ISI.unsubscribe();
                this.getHighSpeedVideoSizes.onError(th);
                this.getInputFormats.unsubscribe();
                return;
            }
            rx.plugins.RxJavaHooks.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighSpeedVideoFpsRanges.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getInputSizeshNQ4ISI.unsubscribe();
                this.getHighSpeedVideoSizes.onCompleted();
                this.getInputFormats.unsubscribe();
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            this.Camera2StreamConfigurationMap.setProducer(producer);
        }

        final class TimeoutTask implements rx.functions.Action0 {
            final long Camera2StreamConfigurationMap;

            TimeoutTask(long j) {
                this.Camera2StreamConfigurationMap = j;
            }

            @Override // rx.functions.Action0
            public final void call() {
                rx.internal.operators.OnSubscribeTimeoutTimedWithFallback.TimeoutMainSubscriber timeoutMainSubscriber = rx.internal.operators.OnSubscribeTimeoutTimedWithFallback.TimeoutMainSubscriber.this;
                if (timeoutMainSubscriber.getHighSpeedVideoFpsRanges.compareAndSet(this.Camera2StreamConfigurationMap, Long.MAX_VALUE)) {
                    timeoutMainSubscriber.unsubscribe();
                    if (timeoutMainSubscriber.getHighResolutionOutputSizeshNQ4ISI == null) {
                        timeoutMainSubscriber.getHighSpeedVideoSizes.onError(new java.util.concurrent.TimeoutException());
                        return;
                    }
                    long j = timeoutMainSubscriber.getHighSpeedVideoFpsRangesFor;
                    if (j != 0) {
                        timeoutMainSubscriber.Camera2StreamConfigurationMap.produced(j);
                    }
                    rx.internal.operators.OnSubscribeTimeoutTimedWithFallback.FallbackSubscriber fallbackSubscriber = new rx.internal.operators.OnSubscribeTimeoutTimedWithFallback.FallbackSubscriber(timeoutMainSubscriber.getHighSpeedVideoSizes, timeoutMainSubscriber.Camera2StreamConfigurationMap);
                    if (timeoutMainSubscriber.getOutputMinFrameDuration.replace(fallbackSubscriber)) {
                        timeoutMainSubscriber.getHighResolutionOutputSizeshNQ4ISI.subscribe((rx.Subscriber<? super java.lang.Object>) fallbackSubscriber);
                    }
                }
            }
        }
    }

    static final class FallbackSubscriber<T> extends rx.Subscriber<T> {
        final rx.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        final rx.internal.producers.ProducerArbiter getHighSpeedVideoSizes;

        FallbackSubscriber(rx.Subscriber<? super T> subscriber, rx.internal.producers.ProducerArbiter producerArbiter) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighSpeedVideoSizes = producerArbiter;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor.onNext(t);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRangesFor.onCompleted();
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            this.getHighSpeedVideoSizes.setProducer(producer);
        }
    }
}

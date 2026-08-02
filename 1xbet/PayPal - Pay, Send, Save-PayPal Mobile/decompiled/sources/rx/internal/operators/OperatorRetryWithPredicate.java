package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorRetryWithPredicate<T> implements rx.Observable.Operator<T, rx.Observable<T>> {
    final rx.functions.Func2<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    public OperatorRetryWithPredicate(rx.functions.Func2<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> func2) {
        this.getHighSpeedVideoFpsRangesFor = func2;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super rx.Observable<T>> call(rx.Subscriber<? super T> subscriber) {
        rx.Scheduler.Worker createWorker = rx.schedulers.Schedulers.trampoline().createWorker();
        subscriber.add(createWorker);
        rx.subscriptions.SerialSubscription serialSubscription = new rx.subscriptions.SerialSubscription();
        subscriber.add(serialSubscription);
        rx.internal.producers.ProducerArbiter producerArbiter = new rx.internal.producers.ProducerArbiter();
        subscriber.setProducer(producerArbiter);
        return new rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, createWorker, serialSubscription, producerArbiter);
    }

    static final class SourceSubscriber<T> extends rx.Subscriber<rx.Observable<T>> {
        final rx.Scheduler.Worker Camera2StreamConfigurationMap;
        final rx.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final rx.internal.producers.ProducerArbiter getHighSpeedVideoFpsRanges;
        final rx.functions.Func2<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicInteger();
        final rx.subscriptions.SerialSubscription getInputSizeshNQ4ISI;

        @Override // rx.Observer
        public final void onCompleted() {
        }

        @Override // rx.Observer
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            final rx.Observable observable = (rx.Observable) obj;
            this.Camera2StreamConfigurationMap.schedule(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.1
                @Override // rx.functions.Action0
                public void call() {
                    rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.this.getHighSpeedVideoSizes.incrementAndGet();
                    rx.Subscriber<T> subscriber = new rx.Subscriber<T>() { // from class: rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.1.1
                        boolean Camera2StreamConfigurationMap;

                        @Override // rx.Observer
                        public void onCompleted() {
                            if (this.Camera2StreamConfigurationMap) {
                                return;
                            }
                            this.Camera2StreamConfigurationMap = true;
                            rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
                        }

                        @Override // rx.Observer
                        public void onError(java.lang.Throwable th) {
                            if (this.Camera2StreamConfigurationMap) {
                                return;
                            }
                            this.Camera2StreamConfigurationMap = true;
                            if (rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.this.getHighSpeedVideoFpsRangesFor.call(java.lang.Integer.valueOf(rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.this.getHighSpeedVideoSizes.get()), th).booleanValue() && !rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.this.Camera2StreamConfigurationMap.isUnsubscribed()) {
                                rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.this.Camera2StreamConfigurationMap.schedule(this);
                            } else {
                                rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                            }
                        }

                        @Override // rx.Observer
                        public void onNext(T t) {
                            if (this.Camera2StreamConfigurationMap) {
                                return;
                            }
                            rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                            rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.this.getHighSpeedVideoFpsRanges.produced(1L);
                        }

                        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
                        public void setProducer(rx.Producer producer) {
                            rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.this.getHighSpeedVideoFpsRanges.setProducer(producer);
                        }
                    };
                    rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.this.getInputSizeshNQ4ISI.set(subscriber);
                    observable.unsafeSubscribe(subscriber);
                }
            });
        }

        public SourceSubscriber(rx.Subscriber<? super T> subscriber, rx.functions.Func2<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> func2, rx.Scheduler.Worker worker, rx.subscriptions.SerialSubscription serialSubscription, rx.internal.producers.ProducerArbiter producerArbiter) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getHighSpeedVideoFpsRangesFor = func2;
            this.Camera2StreamConfigurationMap = worker;
            this.getInputSizeshNQ4ISI = serialSubscription;
            this.getHighSpeedVideoFpsRanges = producerArbiter;
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }
    }
}

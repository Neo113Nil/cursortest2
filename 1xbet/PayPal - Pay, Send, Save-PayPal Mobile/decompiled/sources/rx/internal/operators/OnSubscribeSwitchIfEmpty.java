package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeSwitchIfEmpty<T> implements rx.Observable.OnSubscribe<T> {
    final rx.Observable<? extends T> getHighResolutionOutputSizeshNQ4ISI;
    final rx.Observable<? extends T> getHighSpeedVideoFpsRangesFor;

    public OnSubscribeSwitchIfEmpty(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2) {
        this.getHighResolutionOutputSizeshNQ4ISI = observable;
        this.getHighSpeedVideoFpsRangesFor = observable2;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        rx.subscriptions.SerialSubscription serialSubscription = new rx.subscriptions.SerialSubscription();
        rx.internal.producers.ProducerArbiter producerArbiter = new rx.internal.producers.ProducerArbiter();
        rx.internal.operators.OnSubscribeSwitchIfEmpty.ParentSubscriber parentSubscriber = new rx.internal.operators.OnSubscribeSwitchIfEmpty.ParentSubscriber(subscriber, serialSubscription, producerArbiter, this.getHighSpeedVideoFpsRangesFor);
        serialSubscription.set(parentSubscriber);
        subscriber.add(serialSubscription);
        subscriber.setProducer(producerArbiter);
        parentSubscriber.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    static final class ParentSubscriber<T> extends rx.Subscriber<T> {
        private final rx.Observable<? extends T> getHighResolutionOutputSizeshNQ4ISI;
        private final rx.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        private final rx.internal.producers.ProducerArbiter getHighSpeedVideoSizes;
        private final rx.subscriptions.SerialSubscription getHighSpeedVideoSizesFor;
        private boolean getInputFormats = true;
        final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger();

        ParentSubscriber(rx.Subscriber<? super T> subscriber, rx.subscriptions.SerialSubscription serialSubscription, rx.internal.producers.ProducerArbiter producerArbiter, rx.Observable<? extends T> observable) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getHighSpeedVideoSizesFor = serialSubscription;
            this.getHighSpeedVideoSizes = producerArbiter;
            this.getHighResolutionOutputSizeshNQ4ISI = observable;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            this.getHighSpeedVideoSizes.setProducer(producer);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (!this.getInputFormats) {
                this.getHighSpeedVideoFpsRanges.onCompleted();
            } else {
                if (this.getHighSpeedVideoFpsRanges.isUnsubscribed()) {
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = false;
                getHighSpeedVideoSizes(null);
            }
        }

        final void getHighSpeedVideoSizes(rx.Observable<? extends T> observable) {
            if (this.Camera2StreamConfigurationMap.getAndIncrement() == 0) {
                while (!this.getHighSpeedVideoFpsRanges.isUnsubscribed()) {
                    if (!this.getHighSpeedVideoFpsRangesFor) {
                        if (observable == null) {
                            rx.internal.operators.OnSubscribeSwitchIfEmpty.AlternateSubscriber alternateSubscriber = new rx.internal.operators.OnSubscribeSwitchIfEmpty.AlternateSubscriber(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
                            this.getHighSpeedVideoSizesFor.set(alternateSubscriber);
                            this.getHighSpeedVideoFpsRangesFor = true;
                            this.getHighResolutionOutputSizeshNQ4ISI.unsafeSubscribe(alternateSubscriber);
                        } else {
                            this.getHighSpeedVideoFpsRangesFor = true;
                            observable.unsafeSubscribe(this);
                            observable = null;
                        }
                    }
                    if (this.Camera2StreamConfigurationMap.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getInputFormats = false;
            this.getHighSpeedVideoFpsRanges.onNext(t);
            this.getHighSpeedVideoSizes.produced(1L);
        }
    }

    static final class AlternateSubscriber<T> extends rx.Subscriber<T> {
        private final rx.internal.producers.ProducerArbiter getHighResolutionOutputSizeshNQ4ISI;
        private final rx.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;

        AlternateSubscriber(rx.Subscriber<? super T> subscriber, rx.internal.producers.ProducerArbiter producerArbiter) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = producerArbiter;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            this.getHighResolutionOutputSizeshNQ4ISI.setProducer(producer);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRangesFor.onCompleted();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor.onNext(t);
            this.getHighResolutionOutputSizeshNQ4ISI.produced(1L);
        }
    }
}

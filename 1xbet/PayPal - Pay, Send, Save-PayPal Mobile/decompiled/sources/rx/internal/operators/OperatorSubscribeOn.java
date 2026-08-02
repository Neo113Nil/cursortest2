package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorSubscribeOn<T> implements rx.Observable.OnSubscribe<T> {
    final rx.Scheduler Camera2StreamConfigurationMap;
    final rx.Observable<T> getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;

    public OperatorSubscribeOn(rx.Observable<T> observable, rx.Scheduler scheduler, boolean z) {
        this.Camera2StreamConfigurationMap = scheduler;
        this.getHighSpeedVideoFpsRangesFor = observable;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        rx.Scheduler.Worker createWorker = this.Camera2StreamConfigurationMap.createWorker();
        rx.internal.operators.OperatorSubscribeOn.SubscribeOnSubscriber subscribeOnSubscriber = new rx.internal.operators.OperatorSubscribeOn.SubscribeOnSubscriber(subscriber, this.getHighSpeedVideoSizes, createWorker, this.getHighSpeedVideoFpsRangesFor);
        subscriber.add(subscribeOnSubscriber);
        subscriber.add(createWorker);
        createWorker.schedule(subscribeOnSubscriber);
    }

    static final class SubscribeOnSubscriber<T> extends rx.Subscriber<T> implements rx.functions.Action0 {
        final rx.Scheduler.Worker Camera2StreamConfigurationMap;
        final rx.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        java.lang.Thread getHighSpeedVideoFpsRangesFor;
        rx.Observable<T> getHighSpeedVideoSizes;

        SubscribeOnSubscriber(rx.Subscriber<? super T> subscriber, boolean z, rx.Scheduler.Worker worker, rx.Observable<T> observable) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getHighSpeedVideoFpsRanges = z;
            this.Camera2StreamConfigurationMap = worker;
            this.getHighSpeedVideoSizes = observable;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            } finally {
                this.Camera2StreamConfigurationMap.unsubscribe();
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
            } finally {
                this.Camera2StreamConfigurationMap.unsubscribe();
            }
        }

        @Override // rx.functions.Action0
        public final void call() {
            rx.Observable<T> observable = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRangesFor = java.lang.Thread.currentThread();
            observable.unsafeSubscribe(this);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(final rx.Producer producer) {
            this.getHighResolutionOutputSizeshNQ4ISI.setProducer(new rx.Producer() { // from class: rx.internal.operators.OperatorSubscribeOn.SubscribeOnSubscriber.1
                @Override // rx.Producer
                public void request(final long j) {
                    if (rx.internal.operators.OperatorSubscribeOn.SubscribeOnSubscriber.this.getHighSpeedVideoFpsRangesFor == java.lang.Thread.currentThread() || !rx.internal.operators.OperatorSubscribeOn.SubscribeOnSubscriber.this.getHighSpeedVideoFpsRanges) {
                        producer.request(j);
                    } else {
                        rx.internal.operators.OperatorSubscribeOn.SubscribeOnSubscriber.this.Camera2StreamConfigurationMap.schedule(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorSubscribeOn.SubscribeOnSubscriber.1.1
                            @Override // rx.functions.Action0
                            public void call() {
                                producer.request(j);
                            }
                        });
                    }
                }
            });
        }
    }
}

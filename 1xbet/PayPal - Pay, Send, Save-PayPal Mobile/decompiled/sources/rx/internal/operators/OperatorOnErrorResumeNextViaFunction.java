package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorOnErrorResumeNextViaFunction<T> implements rx.Observable.Operator<T, T> {
    final rx.functions.Func1<? super java.lang.Throwable, ? extends rx.Observable<? extends T>> getHighSpeedVideoFpsRangesFor;

    public static <T> rx.internal.operators.OperatorOnErrorResumeNextViaFunction<T> withSingle(final rx.functions.Func1<? super java.lang.Throwable, ? extends T> func1) {
        return new rx.internal.operators.OperatorOnErrorResumeNextViaFunction<>(new rx.functions.Func1<java.lang.Throwable, rx.Observable<? extends T>>() { // from class: rx.internal.operators.OperatorOnErrorResumeNextViaFunction.1
            @Override // rx.functions.Func1
            public final /* synthetic */ java.lang.Object call(java.lang.Throwable th) {
                return rx.Observable.just(rx.functions.Func1.this.call(th));
            }
        });
    }

    public static <T> rx.internal.operators.OperatorOnErrorResumeNextViaFunction<T> withOther(final rx.Observable<? extends T> observable) {
        return new rx.internal.operators.OperatorOnErrorResumeNextViaFunction<>(new rx.functions.Func1<java.lang.Throwable, rx.Observable<? extends T>>() { // from class: rx.internal.operators.OperatorOnErrorResumeNextViaFunction.2
            @Override // rx.functions.Func1
            public final /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Throwable th) {
                return rx.Observable.this;
            }
        });
    }

    public static <T> rx.internal.operators.OperatorOnErrorResumeNextViaFunction<T> withException(final rx.Observable<? extends T> observable) {
        return new rx.internal.operators.OperatorOnErrorResumeNextViaFunction<>(new rx.functions.Func1<java.lang.Throwable, rx.Observable<? extends T>>() { // from class: rx.internal.operators.OperatorOnErrorResumeNextViaFunction.3
            @Override // rx.functions.Func1
            public final /* synthetic */ java.lang.Object call(java.lang.Throwable th) {
                java.lang.Throwable th2 = th;
                if (th2 instanceof java.lang.Exception) {
                    return rx.Observable.this;
                }
                return rx.Observable.error(th2);
            }
        });
    }

    public OperatorOnErrorResumeNextViaFunction(rx.functions.Func1<? super java.lang.Throwable, ? extends rx.Observable<? extends T>> func1) {
        this.getHighSpeedVideoFpsRangesFor = func1;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        final rx.internal.producers.ProducerArbiter producerArbiter = new rx.internal.producers.ProducerArbiter();
        final rx.subscriptions.SerialSubscription serialSubscription = new rx.subscriptions.SerialSubscription();
        rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>() { // from class: rx.internal.operators.OperatorOnErrorResumeNextViaFunction.4
            long Camera2StreamConfigurationMap;
            private boolean getHighSpeedVideoSizesFor;

            @Override // rx.Observer
            public void onCompleted() {
                if (this.getHighSpeedVideoSizesFor) {
                    return;
                }
                this.getHighSpeedVideoSizesFor = true;
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                if (this.getHighSpeedVideoSizesFor) {
                    rx.exceptions.Exceptions.throwIfFatal(th);
                    rx.plugins.RxJavaHooks.onError(th);
                    return;
                }
                this.getHighSpeedVideoSizesFor = true;
                try {
                    unsubscribe();
                    rx.Subscriber<T> subscriber3 = new rx.Subscriber<T>() { // from class: rx.internal.operators.OperatorOnErrorResumeNextViaFunction.4.1
                        @Override // rx.Observer
                        public void onNext(T t) {
                            subscriber.onNext(t);
                        }

                        @Override // rx.Observer
                        public void onError(java.lang.Throwable th2) {
                            subscriber.onError(th2);
                        }

                        @Override // rx.Observer
                        public void onCompleted() {
                            subscriber.onCompleted();
                        }

                        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
                        public void setProducer(rx.Producer producer) {
                            producerArbiter.setProducer(producer);
                        }
                    };
                    serialSubscription.set(subscriber3);
                    long j = this.Camera2StreamConfigurationMap;
                    if (j != 0) {
                        producerArbiter.produced(j);
                    }
                    rx.internal.operators.OperatorOnErrorResumeNextViaFunction.this.getHighSpeedVideoFpsRangesFor.call(th).unsafeSubscribe(subscriber3);
                } catch (java.lang.Throwable th2) {
                    rx.exceptions.Exceptions.throwOrReport(th2, subscriber);
                }
            }

            @Override // rx.Observer
            public void onNext(T t) {
                if (this.getHighSpeedVideoSizesFor) {
                    return;
                }
                this.Camera2StreamConfigurationMap++;
                subscriber.onNext(t);
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void setProducer(rx.Producer producer) {
                producerArbiter.setProducer(producer);
            }
        };
        serialSubscription.set(subscriber2);
        subscriber.add(serialSubscription);
        subscriber.setProducer(producerArbiter);
        return subscriber2;
    }
}

package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorZip<R> implements rx.Observable.Operator<R, rx.Observable<?>[]> {
    final rx.functions.FuncN<? extends R> getHighSpeedVideoFpsRanges;

    public OperatorZip(rx.functions.FuncN<? extends R> funcN) {
        this.getHighSpeedVideoFpsRanges = funcN;
    }

    public OperatorZip(rx.functions.Func2 func2) {
        this.getHighSpeedVideoFpsRanges = rx.functions.Functions.fromFunc(func2);
    }

    public OperatorZip(rx.functions.Func3 func3) {
        this.getHighSpeedVideoFpsRanges = rx.functions.Functions.fromFunc(func3);
    }

    public OperatorZip(rx.functions.Func4 func4) {
        this.getHighSpeedVideoFpsRanges = rx.functions.Functions.fromFunc(func4);
    }

    public OperatorZip(rx.functions.Func5 func5) {
        this.getHighSpeedVideoFpsRanges = rx.functions.Functions.fromFunc(func5);
    }

    public OperatorZip(rx.functions.Func6 func6) {
        this.getHighSpeedVideoFpsRanges = rx.functions.Functions.fromFunc(func6);
    }

    public OperatorZip(rx.functions.Func7 func7) {
        this.getHighSpeedVideoFpsRanges = rx.functions.Functions.fromFunc(func7);
    }

    public OperatorZip(rx.functions.Func8 func8) {
        this.getHighSpeedVideoFpsRanges = rx.functions.Functions.fromFunc(func8);
    }

    public OperatorZip(rx.functions.Func9 func9) {
        this.getHighSpeedVideoFpsRanges = rx.functions.Functions.fromFunc(func9);
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super rx.Observable[]> call(rx.Subscriber<? super R> subscriber) {
        rx.internal.operators.OperatorZip.Zip zip = new rx.internal.operators.OperatorZip.Zip(subscriber, this.getHighSpeedVideoFpsRanges);
        rx.internal.operators.OperatorZip.ZipProducer zipProducer = new rx.internal.operators.OperatorZip.ZipProducer(zip);
        rx.internal.operators.OperatorZip.ZipSubscriber zipSubscriber = new rx.internal.operators.OperatorZip.ZipSubscriber(subscriber, zip, zipProducer);
        subscriber.add(zipSubscriber);
        subscriber.setProducer(zipProducer);
        return zipSubscriber;
    }

    final class ZipSubscriber extends rx.Subscriber<rx.Observable[]> {
        final rx.Subscriber<? super R> Camera2StreamConfigurationMap;
        final rx.internal.operators.OperatorZip.Zip<R> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final rx.internal.operators.OperatorZip.ZipProducer<R> getHighSpeedVideoSizes;

        @Override // rx.Observer
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            rx.Observable[] observableArr = (rx.Observable[]) obj;
            if (observableArr == null || observableArr.length == 0) {
                this.Camera2StreamConfigurationMap.onCompleted();
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            rx.internal.operators.OperatorZip.Zip<R> zip = this.getHighResolutionOutputSizeshNQ4ISI;
            rx.internal.operators.OperatorZip.ZipProducer<R> zipProducer = this.getHighSpeedVideoSizes;
            java.lang.Object[] objArr = new java.lang.Object[observableArr.length];
            for (int i = 0; i < observableArr.length; i++) {
                rx.internal.operators.OperatorZip.Zip.InnerSubscriber innerSubscriber = zip.new InnerSubscriber();
                objArr[i] = innerSubscriber;
                zip.getHighSpeedVideoFpsRangesFor.add(innerSubscriber);
            }
            zip.getHighResolutionOutputSizeshNQ4ISI = zipProducer;
            zip.getHighSpeedVideoSizesFor = objArr;
            for (int i2 = 0; i2 < observableArr.length; i2++) {
                observableArr[i2].unsafeSubscribe((rx.internal.operators.OperatorZip.Zip.InnerSubscriber) objArr[i2]);
            }
        }

        public ZipSubscriber(rx.Subscriber<? super R> subscriber, rx.internal.operators.OperatorZip.Zip<R> zip, rx.internal.operators.OperatorZip.ZipProducer<R> zipProducer) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = zip;
            this.getHighSpeedVideoSizes = zipProducer;
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.Camera2StreamConfigurationMap.onCompleted();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
        }
    }

    static final class ZipProducer<R> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer {
        private static final long serialVersionUID = -1216676403723546796L;
        final rx.internal.operators.OperatorZip.Zip<R> getHighSpeedVideoSizes;

        public ZipProducer(rx.internal.operators.OperatorZip.Zip<R> zip) {
            this.getHighSpeedVideoSizes = zip;
        }

        @Override // rx.Producer
        public final void request(long j) {
            rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j);
            this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap();
        }
    }

    static final class Zip<R> extends java.util.concurrent.atomic.AtomicLong {
        static final int Camera2StreamConfigurationMap = (int) (rx.internal.util.RxRingBuffer.SIZE * 0.7d);
        private static final long serialVersionUID = 5995274816189928317L;
        java.util.concurrent.atomic.AtomicLong getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final rx.subscriptions.CompositeSubscription getHighSpeedVideoFpsRangesFor;
        final rx.Observer<? super R> getHighSpeedVideoSizes;
        volatile java.lang.Object[] getHighSpeedVideoSizesFor;
        private final rx.functions.FuncN<? extends R> getInputSizeshNQ4ISI;

        public Zip(rx.Subscriber<? super R> subscriber, rx.functions.FuncN<? extends R> funcN) {
            rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
            this.getHighSpeedVideoFpsRangesFor = compositeSubscription;
            this.getHighSpeedVideoSizes = subscriber;
            this.getInputSizeshNQ4ISI = funcN;
            subscriber.add(compositeSubscription);
        }

        final void Camera2StreamConfigurationMap() {
            java.lang.Object[] objArr = this.getHighSpeedVideoSizesFor;
            if (objArr == null || getAndIncrement() != 0) {
                return;
            }
            int length = objArr.length;
            rx.Observer<? super R> observer = this.getHighSpeedVideoSizes;
            java.util.concurrent.atomic.AtomicLong atomicLong = this.getHighResolutionOutputSizeshNQ4ISI;
            while (true) {
                java.lang.Object[] objArr2 = new java.lang.Object[length];
                boolean z = true;
                for (int i = 0; i < length; i++) {
                    rx.internal.util.RxRingBuffer rxRingBuffer = ((rx.internal.operators.OperatorZip.Zip.InnerSubscriber) objArr[i]).getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object peek = rxRingBuffer.peek();
                    if (peek == null) {
                        z = false;
                    } else {
                        if (rxRingBuffer.isCompleted(peek)) {
                            observer.onCompleted();
                            this.getHighSpeedVideoFpsRangesFor.unsubscribe();
                            return;
                        }
                        objArr2[i] = rxRingBuffer.getValue(peek);
                    }
                }
                if (z && atomicLong.get() > 0) {
                    try {
                        observer.onNext(this.getInputSizeshNQ4ISI.call(objArr2));
                        atomicLong.decrementAndGet();
                        this.getHighSpeedVideoFpsRanges++;
                        for (java.lang.Object obj : objArr) {
                            rx.internal.util.RxRingBuffer rxRingBuffer2 = ((rx.internal.operators.OperatorZip.Zip.InnerSubscriber) obj).getHighResolutionOutputSizeshNQ4ISI;
                            rxRingBuffer2.poll();
                            if (rxRingBuffer2.isCompleted(rxRingBuffer2.peek())) {
                                observer.onCompleted();
                                this.getHighSpeedVideoFpsRangesFor.unsubscribe();
                                return;
                            }
                        }
                        if (this.getHighSpeedVideoFpsRanges > Camera2StreamConfigurationMap) {
                            for (java.lang.Object obj2 : objArr) {
                                ((rx.internal.operators.OperatorZip.Zip.InnerSubscriber) obj2).request(this.getHighSpeedVideoFpsRanges);
                            }
                            this.getHighSpeedVideoFpsRanges = 0;
                        }
                    } catch (java.lang.Throwable th) {
                        rx.exceptions.Exceptions.throwOrReport(th, observer, objArr2);
                        return;
                    }
                } else if (decrementAndGet() <= 0) {
                    return;
                }
            }
        }

        final class InnerSubscriber extends rx.Subscriber {
            final rx.internal.util.RxRingBuffer getHighResolutionOutputSizeshNQ4ISI = rx.internal.util.RxRingBuffer.getSpmcInstance();

            InnerSubscriber() {
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public final void onStart() {
                request(rx.internal.util.RxRingBuffer.SIZE);
            }

            @Override // rx.Observer
            public final void onCompleted() {
                this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
                rx.internal.operators.OperatorZip.Zip.this.Camera2StreamConfigurationMap();
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                rx.internal.operators.OperatorZip.Zip.this.getHighSpeedVideoSizes.onError(th);
            }

            @Override // rx.Observer
            public final void onNext(java.lang.Object obj) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.onNext(obj);
                } catch (rx.exceptions.MissingBackpressureException e) {
                    onError(e);
                }
                rx.internal.operators.OperatorZip.Zip.this.Camera2StreamConfigurationMap();
            }
        }
    }
}

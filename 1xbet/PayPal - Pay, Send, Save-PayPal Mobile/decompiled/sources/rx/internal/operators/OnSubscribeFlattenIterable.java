package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeFlattenIterable<T, R> implements rx.Observable.OnSubscribe<R> {
    final rx.functions.Func1<? super T, ? extends java.lang.Iterable<? extends R>> Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final rx.Observable<? extends T> getHighSpeedVideoFpsRanges;

    protected OnSubscribeFlattenIterable(rx.Observable<? extends T> observable, rx.functions.Func1<? super T, ? extends java.lang.Iterable<? extends R>> func1, int i) {
        this.getHighSpeedVideoFpsRanges = observable;
        this.Camera2StreamConfigurationMap = func1;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super R> subscriber) {
        final rx.internal.operators.OnSubscribeFlattenIterable.FlattenIterableSubscriber flattenIterableSubscriber = new rx.internal.operators.OnSubscribeFlattenIterable.FlattenIterableSubscriber(subscriber, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        subscriber.add(flattenIterableSubscriber);
        subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OnSubscribeFlattenIterable.1
            @Override // rx.Producer
            public void request(long j) {
                rx.internal.operators.OnSubscribeFlattenIterable.FlattenIterableSubscriber flattenIterableSubscriber2 = flattenIterableSubscriber;
                if (j > 0) {
                    rx.internal.operators.BackpressureUtils.getAndAddRequest(flattenIterableSubscriber2.getInputFormats, j);
                    flattenIterableSubscriber2.getHighResolutionOutputSizeshNQ4ISI();
                } else if (j < 0) {
                    throw new java.lang.IllegalStateException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
                }
            }
        });
        this.getHighSpeedVideoFpsRanges.unsafeSubscribe(flattenIterableSubscriber);
    }

    public static <T, R> rx.Observable<R> createFrom(rx.Observable<? extends T> observable, rx.functions.Func1<? super T, ? extends java.lang.Iterable<? extends R>> func1, int i) {
        if (observable instanceof rx.internal.util.ScalarSynchronousObservable) {
            return rx.Observable.unsafeCreate(new rx.internal.operators.OnSubscribeFlattenIterable.OnSubscribeScalarFlattenIterable(((rx.internal.util.ScalarSynchronousObservable) observable).get(), func1));
        }
        return rx.Observable.unsafeCreate(new rx.internal.operators.OnSubscribeFlattenIterable(observable, func1, i));
    }

    static final class FlattenIterableSubscriber<T, R> extends rx.Subscriber<T> {
        java.util.Iterator<? extends R> Camera2StreamConfigurationMap;
        volatile boolean getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        final rx.Subscriber<? super R> getHighSpeedVideoSizes;
        final rx.functions.Func1<? super T, ? extends java.lang.Iterable<? extends R>> getHighSpeedVideoSizesFor;
        long getInputSizeshNQ4ISI;
        final java.util.Queue<java.lang.Object> getOutputFormats;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicInteger getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.atomic.AtomicLong getInputFormats = new java.util.concurrent.atomic.AtomicLong();

        public FlattenIterableSubscriber(rx.Subscriber<? super R> subscriber, rx.functions.Func1<? super T, ? extends java.lang.Iterable<? extends R>> func1, int i) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoSizesFor = func1;
            if (i == Integer.MAX_VALUE) {
                this.getHighSpeedVideoFpsRangesFor = Long.MAX_VALUE;
                this.getOutputFormats = new rx.internal.util.atomic.SpscLinkedArrayQueue(rx.internal.util.RxRingBuffer.SIZE);
            } else {
                this.getHighSpeedVideoFpsRangesFor = i - (i >> 2);
                if (rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable()) {
                    this.getOutputFormats = new rx.internal.util.unsafe.SpscArrayQueue(i);
                } else {
                    this.getOutputFormats = new rx.internal.util.atomic.SpscAtomicArrayQueue(i);
                }
            }
            request(i);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (!this.getOutputFormats.offer(rx.internal.operators.NotificationLite.next(t))) {
                unsubscribe();
                onError(new rx.exceptions.MissingBackpressureException());
            } else {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (rx.internal.util.ExceptionsUtils.addThrowable(this.getHighResolutionOutputSizeshNQ4ISI, th)) {
                this.getHighSpeedVideoFpsRanges = true;
                getHighResolutionOutputSizeshNQ4ISI();
            } else {
                rx.plugins.RxJavaHooks.onError(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRanges = true;
            getHighResolutionOutputSizeshNQ4ISI();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00d2 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x000f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00c9 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighResolutionOutputSizeshNQ4ISI() {
            int i;
            if (this.getOutputMinFrameDuration.getAndIncrement() != 0) {
                return;
            }
            rx.Subscriber<? super R> subscriber = this.getHighSpeedVideoSizes;
            java.util.Queue<?> queue = this.getOutputFormats;
            int i2 = 1;
            while (true) {
                java.util.Iterator<? extends R> it = this.Camera2StreamConfigurationMap;
                boolean z = false;
                if (it == null) {
                    boolean z2 = this.getHighSpeedVideoFpsRanges;
                    java.lang.Object poll = queue.poll();
                    boolean z3 = poll == null;
                    if (getHighSpeedVideoSizes(z2, z3, subscriber, queue)) {
                        return;
                    }
                    if (!z3) {
                        long j = this.getInputSizeshNQ4ISI + 1;
                        i = i2;
                        if (j == this.getHighSpeedVideoFpsRangesFor) {
                            this.getInputSizeshNQ4ISI = 0L;
                            request(j);
                        } else {
                            this.getInputSizeshNQ4ISI = j;
                        }
                        try {
                            it = this.getHighSpeedVideoSizesFor.call((java.lang.Object) rx.internal.operators.NotificationLite.getValue(poll)).iterator();
                        } catch (java.lang.Throwable th) {
                            rx.exceptions.Exceptions.throwIfFatal(th);
                            onError(th);
                        }
                        if (it.hasNext()) {
                            this.Camera2StreamConfigurationMap = it;
                            if (it == null) {
                                long j2 = this.getInputFormats.get();
                                long j3 = 0;
                                while (j3 != j2) {
                                    if (getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, false, subscriber, queue)) {
                                        return;
                                    }
                                    try {
                                        subscriber.onNext(it.next());
                                    } catch (java.lang.Throwable th2) {
                                        rx.exceptions.Exceptions.throwIfFatal(th2);
                                        this.Camera2StreamConfigurationMap = null;
                                        onError(th2);
                                    }
                                    if (getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, false, subscriber, queue)) {
                                        return;
                                    }
                                    j3++;
                                    try {
                                    } catch (java.lang.Throwable th3) {
                                        rx.exceptions.Exceptions.throwIfFatal(th3);
                                        this.Camera2StreamConfigurationMap = null;
                                        onError(th3);
                                    }
                                    if (!it.hasNext()) {
                                        this.Camera2StreamConfigurationMap = null;
                                        it = null;
                                        break;
                                    }
                                }
                                if (j3 == j2) {
                                    boolean z4 = this.getHighSpeedVideoFpsRanges;
                                    if (queue.isEmpty() && it == null) {
                                        z = true;
                                    }
                                    if (getHighSpeedVideoSizes(z4, z, subscriber, queue)) {
                                        return;
                                    }
                                }
                                if (j3 != 0) {
                                    rx.internal.operators.BackpressureUtils.produced(this.getInputFormats, j3);
                                }
                                if (it == null) {
                                    i2 = i;
                                }
                            }
                            i2 = this.getOutputMinFrameDuration.addAndGet(-i);
                            if (i2 != 0) {
                                return;
                            }
                        } else {
                            i2 = i;
                        }
                    }
                }
                i = i2;
                if (it == null) {
                }
                i2 = this.getOutputMinFrameDuration.addAndGet(-i);
                if (i2 != 0) {
                }
            }
        }

        private boolean getHighSpeedVideoSizes(boolean z, boolean z2, rx.Subscriber<?> subscriber, java.util.Queue<?> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                this.Camera2StreamConfigurationMap = null;
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI.get() == null) {
                if (!z2) {
                    return false;
                }
                subscriber.onCompleted();
                return true;
            }
            java.lang.Throwable terminate = rx.internal.util.ExceptionsUtils.terminate(this.getHighResolutionOutputSizeshNQ4ISI);
            unsubscribe();
            queue.clear();
            this.Camera2StreamConfigurationMap = null;
            subscriber.onError(terminate);
            return true;
        }
    }

    static final class OnSubscribeScalarFlattenIterable<T, R> implements rx.Observable.OnSubscribe<R> {
        final rx.functions.Func1<? super T, ? extends java.lang.Iterable<? extends R>> getHighSpeedVideoFpsRanges;
        final T getHighSpeedVideoSizes;

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            rx.Subscriber subscriber = (rx.Subscriber) obj;
            try {
                java.util.Iterator<? extends R> it = this.getHighSpeedVideoFpsRanges.call(this.getHighSpeedVideoSizes).iterator();
                if (!it.hasNext()) {
                    subscriber.onCompleted();
                } else {
                    subscriber.setProducer(new rx.internal.operators.OnSubscribeFromIterable.IterableProducer(subscriber, it));
                }
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, subscriber, this.getHighSpeedVideoSizes);
            }
        }

        public OnSubscribeScalarFlattenIterable(T t, rx.functions.Func1<? super T, ? extends java.lang.Iterable<? extends R>> func1) {
            this.getHighSpeedVideoSizes = t;
            this.getHighSpeedVideoFpsRanges = func1;
        }
    }
}

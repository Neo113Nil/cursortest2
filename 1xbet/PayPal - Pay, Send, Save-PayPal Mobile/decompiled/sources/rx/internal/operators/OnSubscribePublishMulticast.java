package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribePublishMulticast<T> extends java.util.concurrent.atomic.AtomicInteger implements rx.Observable.OnSubscribe<T>, rx.Observer<T>, rx.Subscription {
    private static final long serialVersionUID = -3741892510772238743L;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Throwable getHighSpeedVideoFpsRangesFor;
    volatile boolean getHighSpeedVideoSizes;
    final int getHighSpeedVideoSizesFor;
    final java.util.Queue<T> getInputFormats;
    final rx.internal.operators.OnSubscribePublishMulticast.ParentSubscriber<T> getInputSizeshNQ4ISI;
    volatile rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] getOutputFormats;
    volatile rx.Producer getOutputMinFrameDuration;
    static final rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<?>[] getHighSpeedVideoFpsRanges = new rx.internal.operators.OnSubscribePublishMulticast.PublishProducer[0];
    static final rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<?>[] Camera2StreamConfigurationMap = new rx.internal.operators.OnSubscribePublishMulticast.PublishProducer[0];

    /* JADX WARN: Multi-variable type inference failed */
    public OnSubscribePublishMulticast(int i, boolean z) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("prefetch > 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        this.getHighSpeedVideoSizesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        if (rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable()) {
            this.getInputFormats = new rx.internal.util.unsafe.SpscArrayQueue(i);
        } else {
            this.getInputFormats = new rx.internal.util.atomic.SpscAtomicArrayQueue(i);
        }
        this.getOutputFormats = getHighSpeedVideoFpsRanges;
        this.getInputSizeshNQ4ISI = new rx.internal.operators.OnSubscribePublishMulticast.ParentSubscriber<>(this);
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T> publishProducer = new rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<>(subscriber, this);
        subscriber.add(publishProducer);
        subscriber.setProducer(publishProducer);
        if (getHighSpeedVideoFpsRanges(publishProducer)) {
            if (publishProducer.isUnsubscribed()) {
                getHighSpeedVideoSizes(publishProducer);
                return;
            } else {
                getHighSpeedVideoSizes();
                return;
            }
        }
        java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
        if (th != null) {
            subscriber.onError(th);
        } else {
            subscriber.onCompleted();
        }
    }

    @Override // rx.Observer
    public final void onNext(T t) {
        if (!this.getInputFormats.offer(t)) {
            this.getInputSizeshNQ4ISI.unsubscribe();
            this.getHighSpeedVideoFpsRangesFor = new rx.exceptions.MissingBackpressureException("Queue full?!");
            this.getHighSpeedVideoSizes = true;
        }
        getHighSpeedVideoSizes();
    }

    @Override // rx.Observer
    public final void onError(java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRangesFor = th;
        this.getHighSpeedVideoSizes = true;
        getHighSpeedVideoSizes();
    }

    @Override // rx.Observer
    public final void onCompleted() {
        this.getHighSpeedVideoSizes = true;
        getHighSpeedVideoSizes();
    }

    final void getHighSpeedVideoSizes() {
        if (getAndIncrement() == 0) {
            java.util.Queue<T> queue = this.getInputFormats;
            int i = 0;
            do {
                rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] publishProducerArr = this.getOutputFormats;
                int length = publishProducerArr.length;
                long j = Long.MAX_VALUE;
                for (rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T> publishProducer : publishProducerArr) {
                    j = java.lang.Math.min(j, publishProducer.get());
                }
                if (length != 0) {
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.getHighSpeedVideoSizes;
                        T poll = queue.poll();
                        boolean z2 = poll == null;
                        if (getHighSpeedVideoFpsRanges(z, z2)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        for (rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T> publishProducer2 : publishProducerArr) {
                            publishProducer2.getHighSpeedVideoSizes.onNext(poll);
                        }
                        j2++;
                    }
                    if (j2 == j && getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, queue.isEmpty())) {
                        return;
                    }
                    if (j2 != 0) {
                        rx.Producer producer = this.getOutputMinFrameDuration;
                        if (producer != null) {
                            producer.request(j2);
                        }
                        for (rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T> publishProducer3 : publishProducerArr) {
                            rx.internal.operators.BackpressureUtils.produced(publishProducer3, j2);
                        }
                    }
                }
                i = addAndGet(-i);
            } while (i != 0);
        }
    }

    private boolean getHighSpeedVideoFpsRanges(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
                if (th != null) {
                    this.getInputFormats.clear();
                    rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                    int length = highSpeedVideoFpsRanges.length;
                    while (i < length) {
                        highSpeedVideoFpsRanges[i].getHighSpeedVideoSizes.onError(th);
                        i++;
                    }
                    return true;
                }
                if (z2) {
                    rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges();
                    int length2 = highSpeedVideoFpsRanges2.length;
                    while (i < length2) {
                        highSpeedVideoFpsRanges2[i].getHighSpeedVideoSizes.onCompleted();
                        i++;
                    }
                    return true;
                }
            } else if (z2) {
                rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges();
                java.lang.Throwable th2 = this.getHighSpeedVideoFpsRangesFor;
                if (th2 != null) {
                    int length3 = highSpeedVideoFpsRanges3.length;
                    while (i < length3) {
                        highSpeedVideoFpsRanges3[i].getHighSpeedVideoSizes.onError(th2);
                        i++;
                    }
                } else {
                    int length4 = highSpeedVideoFpsRanges3.length;
                    while (i < length4) {
                        highSpeedVideoFpsRanges3[i].getHighSpeedVideoSizes.onCompleted();
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] getHighSpeedVideoFpsRanges() {
        rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] publishProducerArr;
        rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] publishProducerArr2 = this.getOutputFormats;
        rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<?>[] publishProducerArr3 = Camera2StreamConfigurationMap;
        if (publishProducerArr2 == publishProducerArr3) {
            return publishProducerArr2;
        }
        synchronized (this) {
            publishProducerArr = this.getOutputFormats;
            if (publishProducerArr != publishProducerArr3) {
                this.getOutputFormats = publishProducerArr3;
            }
        }
        return publishProducerArr;
    }

    private boolean getHighSpeedVideoFpsRanges(rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T> publishProducer) {
        rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] publishProducerArr = this.getOutputFormats;
        rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<?>[] publishProducerArr2 = Camera2StreamConfigurationMap;
        if (publishProducerArr == publishProducerArr2) {
            return false;
        }
        synchronized (this) {
            rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] publishProducerArr3 = this.getOutputFormats;
            if (publishProducerArr3 == publishProducerArr2) {
                return false;
            }
            int length = publishProducerArr3.length;
            rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] publishProducerArr4 = new rx.internal.operators.OnSubscribePublishMulticast.PublishProducer[length + 1];
            java.lang.System.arraycopy(publishProducerArr3, 0, publishProducerArr4, 0, length);
            publishProducerArr4[length] = publishProducer;
            this.getOutputFormats = publishProducerArr4;
            return true;
        }
    }

    final void getHighSpeedVideoSizes(rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T> publishProducer) {
        rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<?>[] publishProducerArr;
        rx.internal.operators.OnSubscribePublishMulticast.PublishProducer[] publishProducerArr2;
        rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] publishProducerArr3 = this.getOutputFormats;
        rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<?>[] publishProducerArr4 = Camera2StreamConfigurationMap;
        if (publishProducerArr3 == publishProducerArr4 || publishProducerArr3 == (publishProducerArr = getHighSpeedVideoFpsRanges)) {
            return;
        }
        synchronized (this) {
            rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] publishProducerArr5 = this.getOutputFormats;
            if (publishProducerArr5 == publishProducerArr4 || publishProducerArr5 == publishProducerArr) {
                return;
            }
            int length = publishProducerArr5.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishProducerArr5[i] == publishProducer) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                publishProducerArr2 = getHighSpeedVideoFpsRanges;
            } else {
                rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T>[] publishProducerArr6 = new rx.internal.operators.OnSubscribePublishMulticast.PublishProducer[length - 1];
                java.lang.System.arraycopy(publishProducerArr5, 0, publishProducerArr6, 0, i);
                java.lang.System.arraycopy(publishProducerArr5, i + 1, publishProducerArr6, i, (length - i) - 1);
                publishProducerArr2 = publishProducerArr6;
            }
            this.getOutputFormats = publishProducerArr2;
        }
    }

    static final class ParentSubscriber<T> extends rx.Subscriber<T> {
        final rx.internal.operators.OnSubscribePublishMulticast<T> getHighSpeedVideoFpsRanges;

        public ParentSubscriber(rx.internal.operators.OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.getHighSpeedVideoFpsRanges = onSubscribePublishMulticast;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRanges.onNext(t);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRanges.onCompleted();
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration = producer;
            producer.request(r0.getHighSpeedVideoSizesFor);
        }
    }

    public final rx.Subscriber<T> subscriber() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.getInputSizeshNQ4ISI.unsubscribe();
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.getInputSizeshNQ4ISI.isUnsubscribed();
    }

    static final class PublishProducer<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer, rx.Subscription {
        private static final long serialVersionUID = 960704844171597367L;
        final java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean();
        final rx.internal.operators.OnSubscribePublishMulticast<T> getHighSpeedVideoFpsRanges;
        final rx.Subscriber<? super T> getHighSpeedVideoSizes;

        public PublishProducer(rx.Subscriber<? super T> subscriber, rx.internal.operators.OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoFpsRanges = onSubscribePublishMulticast;
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
            }
            if (j != 0) {
                rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j);
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.Camera2StreamConfigurationMap.get();
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (this.Camera2StreamConfigurationMap.compareAndSet(false, true)) {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(this);
            }
        }
    }
}

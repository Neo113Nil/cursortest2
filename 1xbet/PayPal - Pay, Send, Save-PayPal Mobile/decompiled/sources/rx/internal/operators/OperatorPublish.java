package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorPublish<T> extends rx.observables.ConnectableObservable<T> {
    final rx.Observable<? extends T> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorPublish.PublishSubscriber<T>> getHighSpeedVideoFpsRangesFor;

    public static <T> rx.observables.ConnectableObservable<T> create(rx.Observable<? extends T> observable) {
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return new rx.internal.operators.OperatorPublish(new rx.Observable.OnSubscribe<T>() { // from class: rx.internal.operators.OperatorPublish.1
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0002, code lost:
            
                continue;
             */
            @Override // rx.functions.Action1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final /* synthetic */ void call(java.lang.Object obj) {
                rx.internal.operators.OperatorPublish.InnerProducer[] innerProducerArr;
                rx.internal.operators.OperatorPublish.InnerProducer[] innerProducerArr2;
                rx.Subscriber subscriber = (rx.Subscriber) obj;
                while (true) {
                    rx.internal.operators.OperatorPublish.PublishSubscriber publishSubscriber = (rx.internal.operators.OperatorPublish.PublishSubscriber) atomicReference.get();
                    if (publishSubscriber == null || publishSubscriber.isUnsubscribed()) {
                        rx.internal.operators.OperatorPublish.PublishSubscriber publishSubscriber2 = new rx.internal.operators.OperatorPublish.PublishSubscriber(atomicReference);
                        publishSubscriber2.add(rx.subscriptions.Subscriptions.create(new rx.internal.operators.OperatorPublish.PublishSubscriber.AnonymousClass1()));
                        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, publishSubscriber, publishSubscriber2)) {
                            publishSubscriber = publishSubscriber2;
                        } else {
                            continue;
                        }
                    }
                    rx.internal.operators.OperatorPublish.InnerProducer innerProducer = new rx.internal.operators.OperatorPublish.InnerProducer(publishSubscriber, subscriber);
                    do {
                        innerProducerArr = publishSubscriber.getInputFormats.get();
                        if (innerProducerArr == rx.internal.operators.OperatorPublish.PublishSubscriber.getHighSpeedVideoFpsRanges) {
                            break;
                        }
                        int length = innerProducerArr.length;
                        innerProducerArr2 = new rx.internal.operators.OperatorPublish.InnerProducer[length + 1];
                        java.lang.System.arraycopy(innerProducerArr, 0, innerProducerArr2, 0, length);
                        innerProducerArr2[length] = innerProducer;
                    } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(publishSubscriber.getInputFormats, innerProducerArr, innerProducerArr2));
                    subscriber.add(innerProducer);
                    subscriber.setProducer(innerProducer);
                    return;
                }
            }
        }, observable, atomicReference);
    }

    public static <T, R> rx.Observable<R> create(rx.Observable<? extends T> observable, rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> func1) {
        return create(observable, func1, false);
    }

    public static <T, R> rx.Observable<R> create(final rx.Observable<? extends T> observable, final rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> func1, final boolean z) {
        return unsafeCreate(new rx.Observable.OnSubscribe<R>() { // from class: rx.internal.operators.OperatorPublish.2
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(java.lang.Object obj) {
                final rx.Subscriber subscriber = (rx.Subscriber) obj;
                final rx.internal.operators.OnSubscribePublishMulticast onSubscribePublishMulticast = new rx.internal.operators.OnSubscribePublishMulticast(rx.internal.util.RxRingBuffer.SIZE, z);
                rx.Subscriber<R> subscriber2 = new rx.Subscriber<R>() { // from class: rx.internal.operators.OperatorPublish.2.1
                    @Override // rx.Observer
                    public void onNext(R r) {
                        subscriber.onNext(r);
                    }

                    @Override // rx.Observer
                    public void onError(java.lang.Throwable th) {
                        onSubscribePublishMulticast.unsubscribe();
                        subscriber.onError(th);
                    }

                    @Override // rx.Observer
                    public void onCompleted() {
                        onSubscribePublishMulticast.unsubscribe();
                        subscriber.onCompleted();
                    }

                    @Override // rx.Subscriber, rx.observers.AssertableSubscriber
                    public void setProducer(rx.Producer producer) {
                        subscriber.setProducer(producer);
                    }
                };
                subscriber.add(onSubscribePublishMulticast);
                subscriber.add(subscriber2);
                ((rx.Observable) func1.call(rx.Observable.unsafeCreate(onSubscribePublishMulticast))).unsafeSubscribe(subscriber2);
                observable.unsafeSubscribe(onSubscribePublishMulticast.subscriber());
            }
        });
    }

    private OperatorPublish(rx.Observable.OnSubscribe<T> onSubscribe, rx.Observable<? extends T> observable, java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorPublish.PublishSubscriber<T>> atomicReference) {
        super(onSubscribe);
        this.getHighResolutionOutputSizeshNQ4ISI = observable;
        this.getHighSpeedVideoFpsRangesFor = atomicReference;
    }

    @Override // rx.observables.ConnectableObservable
    public final void connect(rx.functions.Action1<? super rx.Subscription> action1) {
        rx.internal.operators.OperatorPublish.PublishSubscriber<T> publishSubscriber;
        while (true) {
            publishSubscriber = this.getHighSpeedVideoFpsRangesFor.get();
            if (publishSubscriber != null && !publishSubscriber.isUnsubscribed()) {
                break;
            }
            rx.internal.operators.OperatorPublish.PublishSubscriber<T> publishSubscriber2 = new rx.internal.operators.OperatorPublish.PublishSubscriber<>(this.getHighSpeedVideoFpsRangesFor);
            publishSubscriber2.add(rx.subscriptions.Subscriptions.create(publishSubscriber2.new AnonymousClass1()));
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, publishSubscriber, publishSubscriber2)) {
                publishSubscriber = publishSubscriber2;
                break;
            }
        }
        boolean z = false;
        if (!publishSubscriber.getHighSpeedVideoSizesFor.get() && publishSubscriber.getHighSpeedVideoSizesFor.compareAndSet(false, true)) {
            z = true;
        }
        action1.call(publishSubscriber);
        if (z) {
            this.getHighResolutionOutputSizeshNQ4ISI.unsafeSubscribe(publishSubscriber);
        }
    }

    static final class PublishSubscriber<T> extends rx.Subscriber<T> implements rx.Subscription {
        final java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorPublish.PublishSubscriber<T>> Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizesFor;
        final java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorPublish.InnerProducer[]> getInputFormats;
        volatile java.lang.Object getInputSizeshNQ4ISI;
        final java.util.Queue<java.lang.Object> getOutputMinFrameDuration;
        static final rx.internal.operators.OperatorPublish.InnerProducer[] getHighSpeedVideoSizes = new rx.internal.operators.OperatorPublish.InnerProducer[0];
        static final rx.internal.operators.OperatorPublish.InnerProducer[] getHighSpeedVideoFpsRanges = new rx.internal.operators.OperatorPublish.InnerProducer[0];

        public PublishSubscriber(java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorPublish.PublishSubscriber<T>> atomicReference) {
            this.getOutputMinFrameDuration = rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable() ? new rx.internal.util.unsafe.SpscArrayQueue<>(rx.internal.util.RxRingBuffer.SIZE) : new rx.internal.util.atomic.SpscAtomicArrayQueue<>(rx.internal.util.RxRingBuffer.SIZE);
            this.getInputFormats = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoSizes);
            this.Camera2StreamConfigurationMap = atomicReference;
            this.getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicBoolean();
        }

        /* renamed from: rx.internal.operators.OperatorPublish$PublishSubscriber$1, reason: invalid class name */
        class AnonymousClass1 implements rx.functions.Action0 {
            AnonymousClass1() {
            }

            @Override // rx.functions.Action0
            public void call() {
                rx.internal.operators.OperatorPublish.PublishSubscriber.this.getInputFormats.getAndSet(rx.internal.operators.OperatorPublish.PublishSubscriber.getHighSpeedVideoFpsRanges);
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(rx.internal.operators.OperatorPublish.PublishSubscriber.this.Camera2StreamConfigurationMap, rx.internal.operators.OperatorPublish.PublishSubscriber.this, null);
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            request(rx.internal.util.RxRingBuffer.SIZE);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (!this.getOutputMinFrameDuration.offer(rx.internal.operators.NotificationLite.next(t))) {
                onError(new rx.exceptions.MissingBackpressureException());
            } else {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getInputSizeshNQ4ISI == null) {
                this.getInputSizeshNQ4ISI = rx.internal.operators.NotificationLite.error(th);
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getInputSizeshNQ4ISI == null) {
                this.getInputSizeshNQ4ISI = rx.internal.operators.NotificationLite.completed();
                getHighSpeedVideoFpsRanges();
            }
        }

        private boolean getHighSpeedVideoSizes(java.lang.Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!rx.internal.operators.NotificationLite.isCompleted(obj)) {
                    java.lang.Throwable error = rx.internal.operators.NotificationLite.getError(obj);
                    androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, this, null);
                    try {
                        rx.internal.operators.OperatorPublish.InnerProducer[] andSet = this.getInputFormats.getAndSet(getHighSpeedVideoFpsRanges);
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].getHighResolutionOutputSizeshNQ4ISI.onError(error);
                            i++;
                        }
                        return true;
                    } finally {
                    }
                }
                if (z) {
                    androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, this, null);
                    try {
                        rx.internal.operators.OperatorPublish.InnerProducer[] andSet2 = this.getInputFormats.getAndSet(getHighSpeedVideoFpsRanges);
                        int length2 = andSet2.length;
                        while (i < length2) {
                            andSet2[i].getHighResolutionOutputSizeshNQ4ISI.onCompleted();
                            i++;
                        }
                        return true;
                    } finally {
                    }
                }
            }
            return false;
        }

        final void getHighSpeedVideoFpsRanges() {
            long j;
            synchronized (this) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoFpsRangesFor = false;
                while (true) {
                    try {
                        java.lang.Object obj = this.getInputSizeshNQ4ISI;
                        boolean isEmpty = this.getOutputMinFrameDuration.isEmpty();
                        if (getHighSpeedVideoSizes(obj, isEmpty)) {
                            return;
                        }
                        if (!isEmpty) {
                            rx.internal.operators.OperatorPublish.InnerProducer[] innerProducerArr = this.getInputFormats.get();
                            int length = innerProducerArr.length;
                            long j2 = Long.MAX_VALUE;
                            int i = 0;
                            for (rx.internal.operators.OperatorPublish.InnerProducer innerProducer : innerProducerArr) {
                                long j3 = innerProducer.get();
                                if (j3 >= 0) {
                                    j2 = java.lang.Math.min(j2, j3);
                                } else if (j3 == Long.MIN_VALUE) {
                                    i++;
                                }
                            }
                            if (length != i) {
                                int i2 = 0;
                                while (true) {
                                    j = i2;
                                    if (j >= j2) {
                                        break;
                                    }
                                    java.lang.Object obj2 = this.getInputSizeshNQ4ISI;
                                    java.lang.Object poll = this.getOutputMinFrameDuration.poll();
                                    boolean z = poll == null;
                                    if (getHighSpeedVideoSizes(obj2, z)) {
                                        return;
                                    }
                                    if (z) {
                                        isEmpty = z;
                                        break;
                                    }
                                    java.lang.Object value = rx.internal.operators.NotificationLite.getValue(poll);
                                    for (rx.internal.operators.OperatorPublish.InnerProducer innerProducer2 : innerProducerArr) {
                                        if (innerProducer2.get() > 0) {
                                            try {
                                                innerProducer2.getHighResolutionOutputSizeshNQ4ISI.onNext(value);
                                                innerProducer2.getHighSpeedVideoFpsRangesFor();
                                            } catch (java.lang.Throwable th) {
                                                innerProducer2.unsubscribe();
                                                rx.exceptions.Exceptions.throwOrReport(th, innerProducer2.getHighResolutionOutputSizeshNQ4ISI, value);
                                            }
                                        }
                                    }
                                    i2++;
                                    isEmpty = z;
                                }
                                if (i2 > 0) {
                                    request(j);
                                }
                                if (j2 != 0 && !isEmpty) {
                                }
                            } else if (getHighSpeedVideoSizes(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration.poll() == null)) {
                                return;
                            } else {
                                request(1L);
                            }
                        }
                        synchronized (this) {
                            if (!this.getHighSpeedVideoFpsRangesFor) {
                                this.getHighResolutionOutputSizeshNQ4ISI = false;
                                return;
                            }
                            this.getHighSpeedVideoFpsRangesFor = false;
                        }
                    } catch (java.lang.Throwable th2) {
                        synchronized (this) {
                            this.getHighResolutionOutputSizeshNQ4ISI = false;
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    static final class InnerProducer<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer, rx.Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        final rx.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final rx.internal.operators.OperatorPublish.PublishSubscriber<T> getHighSpeedVideoSizes;

        public InnerProducer(rx.internal.operators.OperatorPublish.PublishSubscriber<T> publishSubscriber, rx.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoSizes = publishSubscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            lazySet(androidx.collection.SieveCacheKt.NodeMetaMask);
        }

        @Override // rx.Producer
        public final void request(long j) {
            long j2;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j2 >= 0 && j == 0) {
                        return;
                    }
                    if (j2 == androidx.collection.SieveCacheKt.NodeMetaMask) {
                        j3 = j;
                    } else {
                        j3 = j2 + j;
                        if (j3 < 0) {
                            j3 = Long.MAX_VALUE;
                        }
                    }
                } while (!compareAndSet(j2, j3));
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
            }
        }

        public final long getHighSpeedVideoFpsRangesFor() {
            long j;
            long j2;
            do {
                j = get();
                if (j == androidx.collection.SieveCacheKt.NodeMetaMask) {
                    throw new java.lang.IllegalStateException("Produced without request");
                }
                if (j == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j2 = j - 1;
                if (j2 < 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("More produced (1) than requested (");
                    sb.append(j);
                    sb.append(")");
                    throw new java.lang.IllegalStateException(sb.toString());
                }
            } while (!compareAndSet(j, j2));
            return j2;
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            rx.internal.operators.OperatorPublish.InnerProducer[] innerProducerArr;
            rx.internal.operators.OperatorPublish.InnerProducer[] innerProducerArr2;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            rx.internal.operators.OperatorPublish.PublishSubscriber<T> publishSubscriber = this.getHighSpeedVideoSizes;
            do {
                innerProducerArr = publishSubscriber.getInputFormats.get();
                if (innerProducerArr == rx.internal.operators.OperatorPublish.PublishSubscriber.getHighSpeedVideoSizes || innerProducerArr == rx.internal.operators.OperatorPublish.PublishSubscriber.getHighSpeedVideoFpsRanges) {
                    break;
                }
                int length = innerProducerArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerProducerArr[i].equals(this)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    break;
                }
                if (length == 1) {
                    innerProducerArr2 = rx.internal.operators.OperatorPublish.PublishSubscriber.getHighSpeedVideoSizes;
                } else {
                    rx.internal.operators.OperatorPublish.InnerProducer[] innerProducerArr3 = new rx.internal.operators.OperatorPublish.InnerProducer[length - 1];
                    java.lang.System.arraycopy(innerProducerArr, 0, innerProducerArr3, 0, i);
                    java.lang.System.arraycopy(innerProducerArr, i + 1, innerProducerArr3, i, (length - i) - 1);
                    innerProducerArr2 = innerProducerArr3;
                }
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(publishSubscriber.getInputFormats, innerProducerArr, innerProducerArr2));
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
        }
    }
}

package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorMerge<T> implements rx.Observable.Operator<T, rx.Observable<? extends T>> {
    final int Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;

    static final class HolderNoDelay {
        static final rx.internal.operators.OperatorMerge<java.lang.Object> Camera2StreamConfigurationMap = new rx.internal.operators.OperatorMerge<>(false, Integer.MAX_VALUE);

        HolderNoDelay() {
        }
    }

    static final class HolderDelayErrors {
        static final rx.internal.operators.OperatorMerge<java.lang.Object> getHighSpeedVideoFpsRangesFor = new rx.internal.operators.OperatorMerge<>(true, Integer.MAX_VALUE);

        HolderDelayErrors() {
        }
    }

    public static <T> rx.internal.operators.OperatorMerge<T> instance(boolean z) {
        if (z) {
            return (rx.internal.operators.OperatorMerge<T>) rx.internal.operators.OperatorMerge.HolderDelayErrors.getHighSpeedVideoFpsRangesFor;
        }
        return (rx.internal.operators.OperatorMerge<T>) rx.internal.operators.OperatorMerge.HolderNoDelay.Camera2StreamConfigurationMap;
    }

    public static <T> rx.internal.operators.OperatorMerge<T> instance(boolean z, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("maxConcurrent > 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        if (i == Integer.MAX_VALUE) {
            return instance(z);
        }
        return new rx.internal.operators.OperatorMerge<>(z, i);
    }

    OperatorMerge(boolean z, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<rx.Observable<? extends T>> call(rx.Subscriber<? super T> subscriber) {
        rx.internal.operators.OperatorMerge.MergeSubscriber mergeSubscriber = new rx.internal.operators.OperatorMerge.MergeSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        rx.internal.operators.OperatorMerge.MergeProducer<T> mergeProducer = new rx.internal.operators.OperatorMerge.MergeProducer<>(mergeSubscriber);
        mergeSubscriber.getOutputMinFrameDurationlomOqCM = mergeProducer;
        subscriber.add(mergeSubscriber);
        subscriber.setProducer(mergeProducer);
        return mergeSubscriber;
    }

    static final class MergeProducer<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer {
        private static final long serialVersionUID = -1214379189873595503L;
        final rx.internal.operators.OperatorMerge.MergeSubscriber<T> getHighSpeedVideoFpsRangesFor;

        public MergeProducer(rx.internal.operators.OperatorMerge.MergeSubscriber<T> mergeSubscriber) {
            this.getHighSpeedVideoFpsRangesFor = mergeSubscriber;
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (j <= 0) {
                if (j < 0) {
                    throw new java.lang.IllegalArgumentException("n >= 0 required");
                }
            } else if (get() != Long.MAX_VALUE) {
                rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j);
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
            }
        }
    }

    static final class MergeSubscriber<T> extends rx.Subscriber<rx.Observable<? extends T>> {
        static final rx.internal.operators.OperatorMerge.InnerSubscriber<?>[] getHighResolutionOutputSizeshNQ4ISI = new rx.internal.operators.OperatorMerge.InnerSubscriber[0];
        boolean Camera2StreamConfigurationMap;
        final rx.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        final boolean getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        long getHighSpeedVideoSizesFor;
        int getInputSizeshNQ4ISI;
        volatile java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> getOutputMinFrameDuration;
        rx.internal.operators.OperatorMerge.MergeProducer<T> getOutputMinFrameDurationlomOqCM;
        volatile java.util.Queue<java.lang.Object> getOutputSizes;
        final int getOutputSizeshNQ4ISI;
        boolean getOutputStallDuration;
        int getOutputStallDurationlomOqCM;
        volatile rx.subscriptions.CompositeSubscription getValidOutputFormatsForInputhNQ4ISI;
        long isOutputSupportedFor;
        final int toString;
        final java.lang.Object getOutputFormats = new java.lang.Object();
        volatile rx.internal.operators.OperatorMerge.InnerSubscriber<?>[] getInputFormats = getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // rx.Observer
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            long j;
            rx.Observable observable = (rx.Observable) obj;
            if (observable != null) {
                boolean z = true;
                boolean z2 = false;
                if (observable != rx.Observable.empty()) {
                    if (observable instanceof rx.internal.util.ScalarSynchronousObservable) {
                        java.lang.Object obj2 = ((rx.internal.util.ScalarSynchronousObservable) observable).get();
                        long j2 = 0;
                        if (this.getOutputMinFrameDurationlomOqCM.get() != 0) {
                            synchronized (this) {
                                j = this.getOutputMinFrameDurationlomOqCM.get();
                                if (this.Camera2StreamConfigurationMap || j == 0) {
                                    z = false;
                                } else {
                                    this.Camera2StreamConfigurationMap = true;
                                }
                            }
                            z2 = z;
                            j2 = j;
                        }
                        if (z2) {
                            java.util.Queue<java.lang.Object> queue = this.getOutputSizes;
                            if (queue == null || queue.isEmpty()) {
                                getHighResolutionOutputSizeshNQ4ISI(obj2, j2);
                                return;
                            } else {
                                getHighResolutionOutputSizeshNQ4ISI(obj2);
                                getHighResolutionOutputSizeshNQ4ISI();
                                return;
                            }
                        }
                        getHighResolutionOutputSizeshNQ4ISI(obj2);
                        getHighSpeedVideoFpsRangesFor();
                        return;
                    }
                    long j3 = this.isOutputSupportedFor;
                    this.isOutputSupportedFor = 1 + j3;
                    rx.internal.operators.OperatorMerge.InnerSubscriber<?> innerSubscriber = new rx.internal.operators.OperatorMerge.InnerSubscriber<>(this, j3);
                    getInputSizeshNQ4ISI().add(innerSubscriber);
                    synchronized (this.getOutputFormats) {
                        rx.internal.operators.OperatorMerge.InnerSubscriber<?>[] innerSubscriberArr = this.getInputFormats;
                        int length = innerSubscriberArr.length;
                        rx.internal.operators.OperatorMerge.InnerSubscriber<?>[] innerSubscriberArr2 = new rx.internal.operators.OperatorMerge.InnerSubscriber[length + 1];
                        java.lang.System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                        innerSubscriberArr2[length] = innerSubscriber;
                        this.getInputFormats = innerSubscriberArr2;
                    }
                    observable.unsafeSubscribe(innerSubscriber);
                    getHighSpeedVideoFpsRangesFor();
                    return;
                }
                int i = this.getOutputStallDurationlomOqCM + 1;
                if (i == this.toString) {
                    this.getOutputStallDurationlomOqCM = 0;
                    request(i);
                } else {
                    this.getOutputStallDurationlomOqCM = i;
                }
            }
        }

        public MergeSubscriber(rx.Subscriber<? super T> subscriber, boolean z, int i) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getHighSpeedVideoFpsRangesFor = z;
            this.getOutputSizeshNQ4ISI = i;
            if (i == Integer.MAX_VALUE) {
                this.toString = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
            } else {
                this.toString = java.lang.Math.max(1, i >> 1);
                request(i);
            }
        }

        final java.util.Queue<java.lang.Throwable> Camera2StreamConfigurationMap() {
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> concurrentLinkedQueue;
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> concurrentLinkedQueue2 = this.getOutputMinFrameDuration;
            if (concurrentLinkedQueue2 != null) {
                return concurrentLinkedQueue2;
            }
            synchronized (this) {
                concurrentLinkedQueue = this.getOutputMinFrameDuration;
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();
                    this.getOutputMinFrameDuration = concurrentLinkedQueue;
                }
            }
            return concurrentLinkedQueue;
        }

        private rx.subscriptions.CompositeSubscription getInputSizeshNQ4ISI() {
            rx.subscriptions.CompositeSubscription compositeSubscription;
            boolean z;
            rx.subscriptions.CompositeSubscription compositeSubscription2 = this.getValidOutputFormatsForInputhNQ4ISI;
            if (compositeSubscription2 != null) {
                return compositeSubscription2;
            }
            synchronized (this) {
                compositeSubscription = this.getValidOutputFormatsForInputhNQ4ISI;
                if (compositeSubscription == null) {
                    compositeSubscription = new rx.subscriptions.CompositeSubscription();
                    this.getValidOutputFormatsForInputhNQ4ISI = compositeSubscription;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                add(compositeSubscription);
            }
            return compositeSubscription;
        }

        private void getHighSpeedVideoSizes() {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.getOutputMinFrameDuration);
            if (arrayList.size() == 1) {
                this.getHighSpeedVideoFpsRanges.onError((java.lang.Throwable) arrayList.get(0));
            } else {
                this.getHighSpeedVideoFpsRanges.onError(new rx.exceptions.CompositeException(arrayList));
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            Camera2StreamConfigurationMap().offer(th);
            this.getHighSpeedVideoSizes = true;
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoSizes = true;
            getHighSpeedVideoFpsRangesFor();
        }

        private void getHighSpeedVideoSizes(rx.internal.operators.OperatorMerge.InnerSubscriber<T> innerSubscriber) {
            rx.internal.util.RxRingBuffer rxRingBuffer = innerSubscriber.getInputFormats;
            if (rxRingBuffer != null) {
                rxRingBuffer.release();
            }
            this.getValidOutputFormatsForInputhNQ4ISI.remove(innerSubscriber);
            synchronized (this.getOutputFormats) {
                rx.internal.operators.OperatorMerge.InnerSubscriber<?>[] innerSubscriberArr = this.getInputFormats;
                int length = innerSubscriberArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriber.equals(innerSubscriberArr[i])) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    this.getInputFormats = getHighResolutionOutputSizeshNQ4ISI;
                    return;
                }
                rx.internal.operators.OperatorMerge.InnerSubscriber<?>[] innerSubscriberArr2 = new rx.internal.operators.OperatorMerge.InnerSubscriber[length - 1];
                java.lang.System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, i);
                java.lang.System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr2, i, (length - i) - 1);
                this.getInputFormats = innerSubscriberArr2;
            }
        }

        static void getHighSpeedVideoFpsRanges(rx.internal.operators.OperatorMerge.InnerSubscriber<T> innerSubscriber, T t) {
            rx.internal.util.RxRingBuffer rxRingBuffer = innerSubscriber.getInputFormats;
            if (rxRingBuffer == null) {
                rxRingBuffer = rx.internal.util.RxRingBuffer.getSpscInstance();
                innerSubscriber.add(rxRingBuffer);
                innerSubscriber.getInputFormats = rxRingBuffer;
            }
            try {
                rxRingBuffer.onNext(rx.internal.operators.NotificationLite.next(t));
            } catch (java.lang.IllegalStateException e) {
                if (innerSubscriber.isUnsubscribed()) {
                    return;
                }
                innerSubscriber.unsubscribe();
                innerSubscriber.onError(e);
            } catch (rx.exceptions.MissingBackpressureException e2) {
                innerSubscriber.unsubscribe();
                innerSubscriber.onError(e2);
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI(T t) {
            java.util.Queue<java.lang.Object> spscExactAtomicArrayQueue;
            java.util.Queue<java.lang.Object> queue = this.getOutputSizes;
            if (queue == null) {
                int i = this.getOutputSizeshNQ4ISI;
                if (i == Integer.MAX_VALUE) {
                    queue = new rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue<>(rx.internal.util.RxRingBuffer.SIZE);
                } else {
                    if (rx.internal.util.unsafe.Pow2.isPowerOfTwo(i)) {
                        if (rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable()) {
                            spscExactAtomicArrayQueue = new rx.internal.util.unsafe.SpscArrayQueue<>(i);
                        } else {
                            spscExactAtomicArrayQueue = new rx.internal.util.atomic.SpscAtomicArrayQueue<>(i);
                        }
                    } else {
                        spscExactAtomicArrayQueue = new rx.internal.util.atomic.SpscExactAtomicArrayQueue<>(i);
                    }
                    queue = spscExactAtomicArrayQueue;
                }
                this.getOutputSizes = queue;
            }
            if (queue.offer(rx.internal.operators.NotificationLite.next(t))) {
                return;
            }
            unsubscribe();
            onError(rx.exceptions.OnErrorThrowable.addValueAsLastCause(new rx.exceptions.MissingBackpressureException(), t));
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void getHighResolutionOutputSizeshNQ4ISI(T t, long j) {
            boolean z = true;
            try {
                try {
                    try {
                        this.getHighSpeedVideoFpsRanges.onNext(t);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.Camera2StreamConfigurationMap = false;
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    if (!this.getHighSpeedVideoFpsRangesFor) {
                        rx.exceptions.Exceptions.throwIfFatal(th2);
                        unsubscribe();
                        onError(th2);
                        return;
                    }
                    Camera2StreamConfigurationMap().offer(th2);
                }
                if (j != Long.MAX_VALUE) {
                    this.getOutputMinFrameDurationlomOqCM.addAndGet(-1L);
                }
                int i = this.getOutputStallDurationlomOqCM + 1;
                if (i == this.toString) {
                    this.getOutputStallDurationlomOqCM = 0;
                    request(i);
                } else {
                    this.getOutputStallDurationlomOqCM = i;
                }
                synchronized (this) {
                    if (!this.getOutputStallDuration) {
                        this.Camera2StreamConfigurationMap = false;
                    } else {
                        this.getOutputStallDuration = false;
                        getHighResolutionOutputSizeshNQ4ISI();
                    }
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (!z) {
                }
                throw th;
            }
        }

        final void getHighSpeedVideoFpsRangesFor() {
            synchronized (this) {
                if (this.Camera2StreamConfigurationMap) {
                    this.getOutputStallDuration = true;
                } else {
                    this.Camera2StreamConfigurationMap = true;
                    getHighResolutionOutputSizeshNQ4ISI();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:162:0x01a3, code lost:
        
            r22.getInputSizeshNQ4ISI = r4;
            r22.getHighSpeedVideoSizesFor = r9[r4].Camera2StreamConfigurationMap;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
        
            r0 = r5;
            r5 = r16;
         */
        /* JADX WARN: Removed duplicated region for block: B:110:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x01a1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0109 A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:3:0x0002, B:4:0x0004, B:6:0x000b, B:15:0x002f, B:18:0x003c, B:23:0x0063, B:26:0x0047, B:32:0x004b, B:29:0x005c, B:48:0x00a7, B:51:0x00b2, B:55:0x00ba, B:57:0x00be, B:60:0x00c5, B:62:0x00c9, B:65:0x00cf, B:67:0x00d5, B:74:0x00e8, B:76:0x00f1, B:80:0x00f8, B:85:0x00fd, B:89:0x0109, B:91:0x0110, B:95:0x011a, B:97:0x0121, B:99:0x0126, B:101:0x012c, B:135:0x015b, B:136:0x0169, B:144:0x0179, B:147:0x0181, B:149:0x0187, B:151:0x0191, B:155:0x0196, B:159:0x019b, B:162:0x01a3, B:164:0x01b0, B:166:0x01b6, B:206:0x007f, B:20:0x0040), top: B:2:0x0002, inners: #2 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void getHighResolutionOutputSizeshNQ4ISI() {
            boolean z;
            boolean z2;
            int i;
            rx.Subscriber<? super T> subscriber;
            boolean z3;
            rx.Subscriber<? super T> subscriber2;
            int i2;
            try {
                rx.Subscriber<? super T> subscriber3 = this.getHighSpeedVideoFpsRanges;
                while (!getHighSpeedVideoFpsRanges()) {
                    java.util.Queue<java.lang.Object> queue = this.getOutputSizes;
                    long j = this.getOutputMinFrameDurationlomOqCM.get();
                    boolean z4 = j == Long.MAX_VALUE;
                    if (queue != null) {
                        int i3 = 0;
                        while (true) {
                            long j2 = j;
                            int i4 = 0;
                            int i5 = i3;
                            java.lang.Object obj = null;
                            while (true) {
                                if (j2 <= 0) {
                                    break;
                                }
                                java.lang.Object poll = queue.poll();
                                if (getHighSpeedVideoFpsRanges()) {
                                    return;
                                }
                                if (poll == null) {
                                    obj = poll;
                                    break;
                                }
                                try {
                                    subscriber3.onNext((java.lang.Object) rx.internal.operators.NotificationLite.getValue(poll));
                                } catch (java.lang.Throwable th) {
                                    if (!this.getHighSpeedVideoFpsRangesFor) {
                                        rx.exceptions.Exceptions.throwIfFatal(th);
                                        unsubscribe();
                                        subscriber3.onError(th);
                                        return;
                                    }
                                    Camera2StreamConfigurationMap().offer(th);
                                }
                                i5++;
                                i4++;
                                j2--;
                                obj = poll;
                            }
                            if (i4 <= 0) {
                                z2 = z4;
                            } else if (z4) {
                                z2 = z4;
                                j2 = Long.MAX_VALUE;
                            } else {
                                z2 = z4;
                                j2 = this.getOutputMinFrameDurationlomOqCM.addAndGet(-i4);
                            }
                            if (j2 == 0 || obj == null) {
                                break;
                            }
                            i3 = i5;
                            j = j2;
                            z4 = z2;
                        }
                    } else {
                        z2 = z4;
                        i = 0;
                    }
                    boolean z5 = this.getHighSpeedVideoSizes;
                    java.util.Queue<java.lang.Object> queue2 = this.getOutputSizes;
                    rx.internal.operators.OperatorMerge.InnerSubscriber<?>[] innerSubscriberArr = this.getInputFormats;
                    int length = innerSubscriberArr.length;
                    if (z5 && ((queue2 == null || queue2.isEmpty()) && length == 0)) {
                        java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> concurrentLinkedQueue = this.getOutputMinFrameDuration;
                        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
                            getHighSpeedVideoSizes();
                            return;
                        }
                        subscriber3.onCompleted();
                        return;
                    }
                    if (length > 0) {
                        long j3 = this.getHighSpeedVideoSizesFor;
                        int i6 = this.getInputSizeshNQ4ISI;
                        if (length > i6) {
                            subscriber2 = subscriber3;
                            if (innerSubscriberArr[i6].Camera2StreamConfigurationMap != j3) {
                            }
                            z3 = false;
                            i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    subscriber = subscriber2;
                                    break;
                                }
                                if (getHighSpeedVideoFpsRanges()) {
                                    return;
                                }
                                rx.internal.operators.OperatorMerge.InnerSubscriber<?> innerSubscriber = innerSubscriberArr[i6];
                                java.lang.Object obj2 = null;
                                while (true) {
                                    int i7 = 0;
                                    while (j > 0) {
                                        if (getHighSpeedVideoFpsRanges()) {
                                            return;
                                        }
                                        rx.internal.util.RxRingBuffer rxRingBuffer = innerSubscriber.getInputFormats;
                                        if (rxRingBuffer == null || (obj2 = rxRingBuffer.poll()) == null) {
                                            break;
                                        }
                                        rx.Subscriber<? super T> subscriber4 = subscriber2;
                                        try {
                                            try {
                                                subscriber4.onNext((java.lang.Object) rx.internal.operators.NotificationLite.getValue(obj2));
                                                j--;
                                                i7++;
                                                subscriber2 = subscriber4;
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                                z = true;
                                                if (!z) {
                                                    synchronized (this) {
                                                        this.Camera2StreamConfigurationMap = false;
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (java.lang.Throwable th3) {
                                            rx.exceptions.Exceptions.throwIfFatal(th3);
                                            try {
                                                subscriber4.onError(th3);
                                                return;
                                            } finally {
                                                unsubscribe();
                                            }
                                        }
                                    }
                                    subscriber = subscriber2;
                                    if (i7 > 0) {
                                        j = !z2 ? this.getOutputMinFrameDurationlomOqCM.addAndGet(-i7) : Long.MAX_VALUE;
                                        innerSubscriber.getHighSpeedVideoFpsRanges(i7);
                                    }
                                    if (j == 0 || obj2 == null) {
                                        break;
                                    } else {
                                        subscriber2 = subscriber;
                                    }
                                }
                                boolean z6 = innerSubscriber.getHighSpeedVideoFpsRanges;
                                rx.internal.util.RxRingBuffer rxRingBuffer2 = innerSubscriber.getInputFormats;
                                if (z6 && (rxRingBuffer2 == null || rxRingBuffer2.isEmpty())) {
                                    getHighSpeedVideoSizes(innerSubscriber);
                                    if (getHighSpeedVideoFpsRanges()) {
                                        return;
                                    }
                                    i++;
                                    z3 = true;
                                }
                                if (j == 0) {
                                    break;
                                }
                                i6++;
                                if (i6 == length) {
                                    i6 = 0;
                                }
                                i2++;
                                subscriber2 = subscriber;
                            }
                        } else {
                            subscriber2 = subscriber3;
                        }
                        if (length <= i6) {
                            i6 = 0;
                        }
                        for (int i8 = 0; i8 < length && innerSubscriberArr[i6].Camera2StreamConfigurationMap != j3; i8++) {
                            int i9 = i6 + 1;
                            i6 = i9 == length ? 0 : i9;
                        }
                        this.getInputSizeshNQ4ISI = i6;
                        this.getHighSpeedVideoSizesFor = innerSubscriberArr[i6].Camera2StreamConfigurationMap;
                        z3 = false;
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                            }
                            i2++;
                            subscriber2 = subscriber;
                        }
                    } else {
                        subscriber = subscriber3;
                        z3 = false;
                    }
                    if (i > 0) {
                        request(i);
                    }
                    if (!z3) {
                        synchronized (this) {
                            try {
                                if (!this.getOutputStallDuration) {
                                    try {
                                        this.Camera2StreamConfigurationMap = false;
                                        return;
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                        z = true;
                                    }
                                } else {
                                    this.getOutputStallDuration = false;
                                }
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                z = false;
                            }
                        }
                        try {
                            throw th;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            if (!z) {
                            }
                            throw th;
                        }
                    }
                    subscriber3 = subscriber;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                z = false;
            }
        }

        private boolean getHighSpeedVideoFpsRanges() {
            if (this.getHighSpeedVideoFpsRanges.isUnsubscribed()) {
                return true;
            }
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> concurrentLinkedQueue = this.getOutputMinFrameDuration;
            if (this.getHighSpeedVideoFpsRangesFor || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                getHighSpeedVideoSizes();
                return true;
            } finally {
                unsubscribe();
            }
        }
    }

    static final class InnerSubscriber<T> extends rx.Subscriber<T> {
        static final int getHighResolutionOutputSizeshNQ4ISI = rx.internal.util.RxRingBuffer.SIZE / 4;
        final long Camera2StreamConfigurationMap;
        volatile boolean getHighSpeedVideoFpsRanges;
        final rx.internal.operators.OperatorMerge.MergeSubscriber<T> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        volatile rx.internal.util.RxRingBuffer getInputFormats;

        public InnerSubscriber(rx.internal.operators.OperatorMerge.MergeSubscriber<T> mergeSubscriber, long j) {
            this.getHighSpeedVideoFpsRangesFor = mergeSubscriber;
            this.Camera2StreamConfigurationMap = j;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            this.getHighSpeedVideoSizes = rx.internal.util.RxRingBuffer.SIZE;
            request(rx.internal.util.RxRingBuffer.SIZE);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
        @Override // rx.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onNext(T t) {
            boolean z;
            long j;
            rx.internal.operators.OperatorMerge.MergeSubscriber<T> mergeSubscriber = this.getHighSpeedVideoFpsRangesFor;
            long j2 = 0;
            boolean z2 = true;
            if (mergeSubscriber.getOutputMinFrameDurationlomOqCM.get() != 0) {
                synchronized (mergeSubscriber) {
                    j = mergeSubscriber.getOutputMinFrameDurationlomOqCM.get();
                    if (mergeSubscriber.Camera2StreamConfigurationMap || j == 0) {
                        z = false;
                    } else {
                        mergeSubscriber.Camera2StreamConfigurationMap = true;
                        z = true;
                    }
                }
                j2 = j;
            } else {
                z = false;
            }
            if (z) {
                rx.internal.util.RxRingBuffer rxRingBuffer = this.getInputFormats;
                if (rxRingBuffer != null && !rxRingBuffer.isEmpty()) {
                    rx.internal.operators.OperatorMerge.MergeSubscriber.getHighSpeedVideoFpsRanges(this, t);
                    mergeSubscriber.getHighResolutionOutputSizeshNQ4ISI();
                    return;
                }
                try {
                    try {
                        mergeSubscriber.getHighSpeedVideoFpsRanges.onNext(t);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (!z2) {
                            synchronized (mergeSubscriber) {
                                mergeSubscriber.Camera2StreamConfigurationMap = false;
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    try {
                        if (!mergeSubscriber.getHighSpeedVideoFpsRangesFor) {
                            rx.exceptions.Exceptions.throwIfFatal(th2);
                            unsubscribe();
                            onError(th2);
                            return;
                        }
                        mergeSubscriber.Camera2StreamConfigurationMap().offer(th2);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        z2 = false;
                        if (!z2) {
                        }
                        throw th;
                    }
                }
                if (j2 != Long.MAX_VALUE) {
                    mergeSubscriber.getOutputMinFrameDurationlomOqCM.addAndGet(-1L);
                }
                getHighSpeedVideoFpsRanges(1L);
                synchronized (mergeSubscriber) {
                    if (!mergeSubscriber.getOutputStallDuration) {
                        mergeSubscriber.Camera2StreamConfigurationMap = false;
                        return;
                    } else {
                        mergeSubscriber.getOutputStallDuration = false;
                        mergeSubscriber.getHighResolutionOutputSizeshNQ4ISI();
                        return;
                    }
                }
            }
            rx.internal.operators.OperatorMerge.MergeSubscriber.getHighSpeedVideoFpsRanges(this, t);
            mergeSubscriber.getHighSpeedVideoFpsRangesFor();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap().offer(th);
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
        }

        public final void getHighSpeedVideoFpsRanges(long j) {
            int i = this.getHighSpeedVideoSizes - ((int) j);
            if (i > getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoSizes = i;
                return;
            }
            this.getHighSpeedVideoSizes = rx.internal.util.RxRingBuffer.SIZE;
            int i2 = rx.internal.util.RxRingBuffer.SIZE - i;
            if (i2 > 0) {
                request(i2);
            }
        }
    }
}

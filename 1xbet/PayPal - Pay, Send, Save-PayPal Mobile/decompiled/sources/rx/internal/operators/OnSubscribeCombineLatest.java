package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeCombineLatest<T, R> implements rx.Observable.OnSubscribe<R> {
    final boolean Camera2StreamConfigurationMap;
    final rx.functions.FuncN<? extends R> getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final java.lang.Iterable<? extends rx.Observable<? extends T>> getHighSpeedVideoFpsRangesFor;
    final rx.Observable<? extends T>[] getHighSpeedVideoSizes;

    public OnSubscribeCombineLatest(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable, rx.functions.FuncN<? extends R> funcN) {
        this(null, iterable, funcN, rx.internal.util.RxRingBuffer.SIZE, false);
    }

    public OnSubscribeCombineLatest(rx.Observable<? extends T>[] observableArr, java.lang.Iterable<? extends rx.Observable<? extends T>> iterable, rx.functions.FuncN<? extends R> funcN, int i, boolean z) {
        this.getHighSpeedVideoSizes = observableArr;
        this.getHighSpeedVideoFpsRangesFor = iterable;
        this.getHighResolutionOutputSizeshNQ4ISI = funcN;
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    @Override // rx.functions.Action1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void call(rx.Subscriber<? super R> subscriber) {
        int length;
        int i;
        rx.Observable<? extends T>[] observableArr = this.getHighSpeedVideoSizes;
        if (observableArr == null) {
            java.lang.Iterable<? extends rx.Observable<? extends T>> iterable = this.getHighSpeedVideoFpsRangesFor;
            if (iterable instanceof java.util.List) {
                java.util.List list = (java.util.List) iterable;
                observableArr = (rx.Observable[]) list.toArray(new rx.Observable[list.size()]);
                length = observableArr.length;
            } else {
                rx.Observable<? extends T>[] observableArr2 = new rx.Observable[8];
                int i2 = 0;
                for (rx.Observable<? extends T> observable : iterable) {
                    if (i2 == observableArr2.length) {
                        rx.Observable<? extends T>[] observableArr3 = new rx.Observable[(i2 >> 2) + i2];
                        java.lang.System.arraycopy(observableArr2, 0, observableArr3, 0, i2);
                        observableArr2 = observableArr3;
                    }
                    observableArr2[i2] = observable;
                    i2++;
                }
                observableArr = observableArr2;
                i = i2;
                if (i != 0) {
                    subscriber.onCompleted();
                    return;
                }
                rx.internal.operators.OnSubscribeCombineLatest.LatestCoordinator latestCoordinator = new rx.internal.operators.OnSubscribeCombineLatest.LatestCoordinator(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, i, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
                rx.internal.operators.OnSubscribeCombineLatest.CombinerSubscriber<T, R>[] combinerSubscriberArr = latestCoordinator.getOutputSizeshNQ4ISI;
                int length2 = combinerSubscriberArr.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    combinerSubscriberArr[i3] = new rx.internal.operators.OnSubscribeCombineLatest.CombinerSubscriber<>(latestCoordinator, i3);
                }
                latestCoordinator.lazySet(0);
                latestCoordinator.getHighResolutionOutputSizeshNQ4ISI.add(latestCoordinator);
                latestCoordinator.getHighResolutionOutputSizeshNQ4ISI.setProducer(latestCoordinator);
                for (int i4 = 0; i4 < length2 && !latestCoordinator.getHighSpeedVideoSizes; i4++) {
                    observableArr[i4].subscribe((rx.Subscriber<? super java.lang.Object>) combinerSubscriberArr[i4]);
                }
                return;
            }
        } else {
            length = observableArr.length;
        }
        i = length;
        if (i != 0) {
        }
    }

    static final class LatestCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements rx.Producer, rx.Subscription {
        static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
        private static final long serialVersionUID = 8567835998786448817L;
        final int Camera2StreamConfigurationMap;
        final rx.Subscriber<? super R> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final boolean getHighSpeedVideoSizesFor;
        final rx.functions.FuncN<? extends R> getInputFormats;
        volatile boolean getInputSizeshNQ4ISI;
        int getOutputFormats;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> getOutputMinFrameDuration;
        final rx.internal.util.atomic.SpscLinkedArrayQueue<java.lang.Object> getOutputMinFrameDurationlomOqCM;
        final rx.internal.operators.OnSubscribeCombineLatest.CombinerSubscriber<T, R>[] getOutputSizeshNQ4ISI;
        final java.lang.Object[] getOutputStallDuration;
        final java.util.concurrent.atomic.AtomicLong getOutputStallDurationlomOqCM;

        public LatestCoordinator(rx.Subscriber<? super R> subscriber, rx.functions.FuncN<? extends R> funcN, int i, int i2, boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getInputFormats = funcN;
            this.Camera2StreamConfigurationMap = i2;
            this.getHighSpeedVideoSizesFor = z;
            java.lang.Object[] objArr = new java.lang.Object[i];
            this.getOutputStallDuration = objArr;
            java.util.Arrays.fill(objArr, getHighSpeedVideoFpsRanges);
            this.getOutputSizeshNQ4ISI = new rx.internal.operators.OnSubscribeCombineLatest.CombinerSubscriber[i];
            this.getOutputMinFrameDurationlomOqCM = new rx.internal.util.atomic.SpscLinkedArrayQueue<>(i2);
            this.getOutputStallDurationlomOqCM = new java.util.concurrent.atomic.AtomicLong();
            this.getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>();
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("n >= required but it was ".concat(java.lang.String.valueOf(j)));
            }
            if (j != 0) {
                rx.internal.operators.BackpressureUtils.getAndAddRequest(this.getOutputStallDurationlomOqCM, j);
                Camera2StreamConfigurationMap();
            }
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            if (getAndIncrement() == 0) {
                Camera2StreamConfigurationMap(this.getOutputMinFrameDurationlomOqCM);
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighSpeedVideoSizes;
        }

        private void Camera2StreamConfigurationMap(java.util.Queue<?> queue) {
            queue.clear();
            for (rx.internal.operators.OnSubscribeCombineLatest.CombinerSubscriber<T, R> combinerSubscriber : this.getOutputSizeshNQ4ISI) {
                combinerSubscriber.unsubscribe();
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, int i) {
            boolean z;
            rx.internal.operators.OnSubscribeCombineLatest.CombinerSubscriber<T, R> combinerSubscriber = this.getOutputSizeshNQ4ISI[i];
            synchronized (this) {
                java.lang.Object[] objArr = this.getOutputStallDuration;
                int length = objArr.length;
                java.lang.Object obj2 = objArr[i];
                int i2 = this.getHighSpeedVideoFpsRangesFor;
                java.lang.Object obj3 = getHighSpeedVideoFpsRanges;
                if (obj2 == obj3) {
                    i2++;
                    this.getHighSpeedVideoFpsRangesFor = i2;
                }
                int i3 = this.getOutputFormats;
                if (obj == null) {
                    i3++;
                    this.getOutputFormats = i3;
                } else {
                    objArr[i] = rx.internal.operators.NotificationLite.getValue(obj);
                }
                z = i2 == length;
                if (i3 == length || (obj == null && obj2 == obj3)) {
                    this.getInputSizeshNQ4ISI = true;
                } else if (obj != null && z) {
                    this.getOutputMinFrameDurationlomOqCM.offer(combinerSubscriber, this.getOutputStallDuration.clone());
                } else if (obj == null && this.getOutputMinFrameDuration.get() != null && (obj2 == obj3 || !this.getHighSpeedVideoSizesFor)) {
                    this.getInputSizeshNQ4ISI = true;
                }
            }
            if (z || obj == null) {
                Camera2StreamConfigurationMap();
            } else {
                combinerSubscriber.request(1L);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
        
            if (r3 == 0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        
            if (r13 == Long.MAX_VALUE) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x009b, code lost:
        
            rx.internal.operators.BackpressureUtils.produced(r10, r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
        
            r12 = addAndGet(-r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
        
            if (r12 != 0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void Camera2StreamConfigurationMap() {
            long j;
            if (getAndIncrement() == 0) {
                rx.internal.util.atomic.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.getOutputMinFrameDurationlomOqCM;
                rx.Subscriber<? super R> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                boolean z = this.getHighSpeedVideoSizesFor;
                java.util.concurrent.atomic.AtomicLong atomicLong = this.getOutputStallDurationlomOqCM;
                int i = 1;
                while (!getHighSpeedVideoFpsRanges(this.getInputSizeshNQ4ISI, spscLinkedArrayQueue.isEmpty(), subscriber, spscLinkedArrayQueue, z)) {
                    long j2 = atomicLong.get();
                    long j3 = 0;
                    while (true) {
                        if (j3 == j2) {
                            j = j3;
                            break;
                        }
                        boolean z2 = this.getInputSizeshNQ4ISI;
                        rx.internal.operators.OnSubscribeCombineLatest.CombinerSubscriber combinerSubscriber = (rx.internal.operators.OnSubscribeCombineLatest.CombinerSubscriber) spscLinkedArrayQueue.peek();
                        boolean z3 = combinerSubscriber == null;
                        long j4 = j3;
                        if (!getHighSpeedVideoFpsRanges(z2, z3, subscriber, spscLinkedArrayQueue, z)) {
                            if (z3) {
                                j = j4;
                                break;
                            }
                            spscLinkedArrayQueue.poll();
                            java.lang.Object[] objArr = (java.lang.Object[]) spscLinkedArrayQueue.poll();
                            if (objArr == null) {
                                this.getHighSpeedVideoSizes = true;
                                Camera2StreamConfigurationMap(spscLinkedArrayQueue);
                                subscriber.onError(new java.lang.IllegalStateException("Broken queue?! Sender received but not the array."));
                                return;
                            }
                            try {
                                subscriber.onNext(this.getInputFormats.call(objArr));
                                combinerSubscriber.request(1L);
                                j3 = j4 + 1;
                            } catch (java.lang.Throwable th) {
                                this.getHighSpeedVideoSizes = true;
                                Camera2StreamConfigurationMap(spscLinkedArrayQueue);
                                subscriber.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        private boolean getHighSpeedVideoFpsRanges(boolean z, boolean z2, rx.Subscriber<?> subscriber, java.util.Queue<?> queue, boolean z3) {
            if (this.getHighSpeedVideoSizes) {
                Camera2StreamConfigurationMap(queue);
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                java.lang.Throwable th = this.getOutputMinFrameDuration.get();
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onCompleted();
                }
                return true;
            }
            java.lang.Throwable th2 = this.getOutputMinFrameDuration.get();
            if (th2 != null) {
                Camera2StreamConfigurationMap(queue);
                subscriber.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }
    }

    static final class CombinerSubscriber<T, R> extends rx.Subscriber<T> {
        boolean Camera2StreamConfigurationMap;
        final rx.internal.operators.OnSubscribeCombineLatest.LatestCoordinator<T, R> getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoSizes;

        public CombinerSubscriber(rx.internal.operators.OnSubscribeCombineLatest.LatestCoordinator<T, R> latestCoordinator, int i) {
            this.getHighSpeedVideoFpsRanges = latestCoordinator;
            this.getHighSpeedVideoSizes = i;
            request(latestCoordinator.Camera2StreamConfigurationMap);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(rx.internal.operators.NotificationLite.next(t), this.getHighSpeedVideoSizes);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            java.lang.Throwable th2;
            java.lang.Throwable th3;
            if (this.Camera2StreamConfigurationMap) {
                rx.plugins.RxJavaHooks.onError(th);
                return;
            }
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> atomicReference = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration;
            do {
                th2 = atomicReference.get();
                if (th2 == null) {
                    th3 = th;
                } else if (th2 instanceof rx.exceptions.CompositeException) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(((rx.exceptions.CompositeException) th2).getExceptions());
                    arrayList.add(th);
                    th3 = new rx.exceptions.CompositeException(arrayList);
                } else {
                    th3 = new rx.exceptions.CompositeException(java.util.Arrays.asList(th2, th));
                }
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, th2, th3));
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(null, this.getHighSpeedVideoSizes);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(null, this.getHighSpeedVideoSizes);
        }
    }
}

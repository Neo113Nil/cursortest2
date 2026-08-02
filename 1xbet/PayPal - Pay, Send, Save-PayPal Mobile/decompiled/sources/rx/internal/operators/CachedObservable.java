package rx.internal.operators;

/* loaded from: classes18.dex */
public final class CachedObservable<T> extends rx.Observable<T> {
    private final rx.internal.operators.CachedObservable.CacheState<T> getHighSpeedVideoFpsRangesFor;

    public static <T> rx.internal.operators.CachedObservable<T> from(rx.Observable<? extends T> observable) {
        return from(observable, 16);
    }

    public static <T> rx.internal.operators.CachedObservable<T> from(rx.Observable<? extends T> observable, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("capacityHint > 0 required");
        }
        rx.internal.operators.CachedObservable.CacheState cacheState = new rx.internal.operators.CachedObservable.CacheState(observable, i);
        return new rx.internal.operators.CachedObservable<>(new rx.internal.operators.CachedObservable.CachedSubscribe(cacheState), cacheState);
    }

    private CachedObservable(rx.Observable.OnSubscribe<T> onSubscribe, rx.internal.operators.CachedObservable.CacheState<T> cacheState) {
        super(onSubscribe);
        this.getHighSpeedVideoFpsRangesFor = cacheState;
    }

    static final class CacheState<T> extends rx.internal.util.LinkedArrayList implements rx.Observer<T> {
        static final rx.internal.operators.CachedObservable.ReplayProducer<?>[] getHighSpeedVideoFpsRanges = new rx.internal.operators.CachedObservable.ReplayProducer[0];
        final rx.subscriptions.SerialSubscription Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final rx.Observable<? extends T> getHighSpeedVideoFpsRangesFor;
        volatile rx.internal.operators.CachedObservable.ReplayProducer<?>[] getHighSpeedVideoSizes;
        boolean getInputSizeshNQ4ISI;

        public CacheState(rx.Observable<? extends T> observable, int i) {
            super(i);
            this.getHighSpeedVideoFpsRangesFor = observable;
            this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = new rx.subscriptions.SerialSubscription();
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.getInputSizeshNQ4ISI) {
                return;
            }
            add(rx.internal.operators.NotificationLite.next(t));
            for (rx.internal.operators.CachedObservable.ReplayProducer<?> replayProducer : this.getHighSpeedVideoSizes) {
                replayProducer.getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getInputSizeshNQ4ISI) {
                return;
            }
            this.getInputSizeshNQ4ISI = true;
            add(rx.internal.operators.NotificationLite.error(th));
            this.Camera2StreamConfigurationMap.unsubscribe();
            for (rx.internal.operators.CachedObservable.ReplayProducer<?> replayProducer : this.getHighSpeedVideoSizes) {
                replayProducer.getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getInputSizeshNQ4ISI) {
                return;
            }
            this.getInputSizeshNQ4ISI = true;
            add(rx.internal.operators.NotificationLite.completed());
            this.Camera2StreamConfigurationMap.unsubscribe();
            for (rx.internal.operators.CachedObservable.ReplayProducer<?> replayProducer : this.getHighSpeedVideoSizes) {
                replayProducer.getHighResolutionOutputSizeshNQ4ISI();
            }
        }
    }

    static final class CachedSubscribe<T> extends java.util.concurrent.atomic.AtomicBoolean implements rx.Observable.OnSubscribe<T> {
        private static final long serialVersionUID = -2817751667698696782L;
        final rx.internal.operators.CachedObservable.CacheState<T> Camera2StreamConfigurationMap;

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            rx.Subscriber subscriber = (rx.Subscriber) obj;
            rx.internal.operators.CachedObservable.ReplayProducer<?> replayProducer = new rx.internal.operators.CachedObservable.ReplayProducer<>(subscriber, this.Camera2StreamConfigurationMap);
            rx.internal.operators.CachedObservable.CacheState<T> cacheState = this.Camera2StreamConfigurationMap;
            synchronized (cacheState.Camera2StreamConfigurationMap) {
                rx.internal.operators.CachedObservable.ReplayProducer<?>[] replayProducerArr = cacheState.getHighSpeedVideoSizes;
                int length = replayProducerArr.length;
                rx.internal.operators.CachedObservable.ReplayProducer<?>[] replayProducerArr2 = new rx.internal.operators.CachedObservable.ReplayProducer[length + 1];
                java.lang.System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
                cacheState.getHighSpeedVideoSizes = replayProducerArr2;
            }
            subscriber.add(replayProducer);
            subscriber.setProducer(replayProducer);
            if (get() || !compareAndSet(false, true)) {
                return;
            }
            final rx.internal.operators.CachedObservable.CacheState<T> cacheState2 = this.Camera2StreamConfigurationMap;
            rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>() { // from class: rx.internal.operators.CachedObservable.CacheState.1
                @Override // rx.Observer
                public void onNext(T t) {
                    rx.internal.operators.CachedObservable.CacheState.this.onNext(t);
                }

                @Override // rx.Observer
                public void onError(java.lang.Throwable th) {
                    rx.internal.operators.CachedObservable.CacheState.this.onError(th);
                }

                @Override // rx.Observer
                public void onCompleted() {
                    rx.internal.operators.CachedObservable.CacheState.this.onCompleted();
                }
            };
            cacheState2.Camera2StreamConfigurationMap.set(subscriber2);
            cacheState2.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(subscriber2);
            cacheState2.getHighResolutionOutputSizeshNQ4ISI = true;
        }

        public CachedSubscribe(rx.internal.operators.CachedObservable.CacheState<T> cacheState) {
            this.Camera2StreamConfigurationMap = cacheState;
        }
    }

    static final class ReplayProducer<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer, rx.Subscription {
        private static final long serialVersionUID = -2557562030197141021L;
        java.lang.Object[] Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        boolean getInputSizeshNQ4ISI;
        final rx.internal.operators.CachedObservable.CacheState<T> getOutputFormats;

        public ReplayProducer(rx.Subscriber<? super T> subscriber, rx.internal.operators.CachedObservable.CacheState<T> cacheState) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getOutputFormats = cacheState;
        }

        @Override // rx.Producer
        public final void request(long j) {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 < 0) {
                    return;
                }
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j2, j3));
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return get() < 0;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (get() < 0 || getAndSet(-1L) < 0) {
                return;
            }
            rx.internal.operators.CachedObservable.CacheState<T> cacheState = this.getOutputFormats;
            synchronized (cacheState.Camera2StreamConfigurationMap) {
                rx.internal.operators.CachedObservable.ReplayProducer<?>[] replayProducerArr = cacheState.getHighSpeedVideoSizes;
                int length = replayProducerArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (replayProducerArr[i].equals(this)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    cacheState.getHighSpeedVideoSizes = rx.internal.operators.CachedObservable.CacheState.getHighSpeedVideoFpsRanges;
                    return;
                }
                rx.internal.operators.CachedObservable.ReplayProducer<?>[] replayProducerArr2 = new rx.internal.operators.CachedObservable.ReplayProducer[length - 1];
                java.lang.System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, i);
                java.lang.System.arraycopy(replayProducerArr, i + 1, replayProducerArr2, i, (length - i) - 1);
                cacheState.getHighSpeedVideoSizes = replayProducerArr2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void getHighResolutionOutputSizeshNQ4ISI() {
            boolean z;
            rx.Subscriber<? super T> subscriber;
            synchronized (this) {
                boolean z2 = true;
                if (this.getHighSpeedVideoFpsRangesFor) {
                    this.getInputSizeshNQ4ISI = true;
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = true;
                try {
                    subscriber = this.getHighSpeedVideoFpsRanges;
                } catch (java.lang.Throwable th) {
                    th = th;
                    z = false;
                }
                while (true) {
                    long j = get();
                    if (j < 0) {
                        return;
                    }
                    int size = this.getOutputFormats.size();
                    if (size != 0) {
                        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
                        if (objArr == null) {
                            objArr = this.getOutputFormats.head();
                            this.Camera2StreamConfigurationMap = objArr;
                        }
                        int length = objArr.length - 1;
                        int i = this.getHighSpeedVideoSizes;
                        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            if (j == 0) {
                                java.lang.Object obj = objArr[i2];
                                if (rx.internal.operators.NotificationLite.isCompleted(obj)) {
                                    subscriber.onCompleted();
                                    unsubscribe();
                                    return;
                                } else if (rx.internal.operators.NotificationLite.isError(obj)) {
                                    subscriber.onError(rx.internal.operators.NotificationLite.getError(obj));
                                    unsubscribe();
                                    return;
                                }
                            } else if (j > 0) {
                                int i3 = 0;
                                while (i < size && j > 0) {
                                    if (subscriber.isUnsubscribed()) {
                                        return;
                                    }
                                    if (i2 == length) {
                                        objArr = (java.lang.Object[]) objArr[length];
                                        i2 = 0;
                                    }
                                    java.lang.Object obj2 = objArr[i2];
                                    try {
                                        if (rx.internal.operators.NotificationLite.accept(subscriber, obj2)) {
                                            try {
                                                unsubscribe();
                                                return;
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                                z = true;
                                                try {
                                                    rx.exceptions.Exceptions.throwIfFatal(th);
                                                    unsubscribe();
                                                    if (rx.internal.operators.NotificationLite.isError(obj2) || rx.internal.operators.NotificationLite.isCompleted(obj2)) {
                                                        return;
                                                    }
                                                    subscriber.onError(rx.exceptions.OnErrorThrowable.addValueAsLastCause(th, rx.internal.operators.NotificationLite.getValue(obj2)));
                                                    return;
                                                } catch (java.lang.Throwable th3) {
                                                    th = th3;
                                                    if (!z) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                        }
                                        i2++;
                                        i++;
                                        j--;
                                        i3++;
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                        z = false;
                                    }
                                }
                                if (subscriber.isUnsubscribed()) {
                                    return;
                                }
                                this.getHighSpeedVideoSizes = i;
                                this.getHighResolutionOutputSizeshNQ4ISI = i2;
                                this.Camera2StreamConfigurationMap = objArr;
                                addAndGet(-i3);
                            }
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            z = z2;
                            th = th;
                            if (!z) {
                                synchronized (this) {
                                    this.getHighSpeedVideoFpsRangesFor = false;
                                }
                            }
                            throw th;
                        }
                    }
                    synchronized (this) {
                        try {
                            if (!this.getInputSizeshNQ4ISI) {
                                this.getHighSpeedVideoFpsRangesFor = false;
                                return;
                            }
                            this.getInputSizeshNQ4ISI = false;
                        } catch (java.lang.Throwable th6) {
                            try {
                                throw th6;
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                z2 = false;
                                z = z2;
                                th = th;
                                if (!z) {
                                }
                                throw th;
                            }
                        }
                    }
                    throw th;
                }
            }
        }
    }
}

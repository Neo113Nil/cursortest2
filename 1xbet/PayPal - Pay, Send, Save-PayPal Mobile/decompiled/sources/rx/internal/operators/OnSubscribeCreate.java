package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeCreate<T> implements rx.Observable.OnSubscribe<T> {
    final rx.functions.Action1<rx.Emitter<T>> getHighSpeedVideoFpsRanges;
    final rx.Emitter.BackpressureMode getHighSpeedVideoFpsRangesFor;

    public OnSubscribeCreate(rx.functions.Action1<rx.Emitter<T>> action1, rx.Emitter.BackpressureMode backpressureMode) {
        this.getHighSpeedVideoFpsRanges = action1;
        this.getHighSpeedVideoFpsRangesFor = backpressureMode;
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[rx.Emitter.BackpressureMode.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[rx.Emitter.BackpressureMode.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[rx.Emitter.BackpressureMode.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[rx.Emitter.BackpressureMode.DROP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[rx.Emitter.BackpressureMode.LATEST.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        rx.internal.operators.OnSubscribeCreate.BaseEmitter noneEmitter;
        int i = rx.internal.operators.OnSubscribeCreate.AnonymousClass1.getHighSpeedVideoFpsRangesFor[this.getHighSpeedVideoFpsRangesFor.ordinal()];
        if (i == 1) {
            noneEmitter = new rx.internal.operators.OnSubscribeCreate.NoneEmitter(subscriber);
        } else if (i == 2) {
            noneEmitter = new rx.internal.operators.OnSubscribeCreate.ErrorEmitter(subscriber);
        } else if (i == 3) {
            noneEmitter = new rx.internal.operators.OnSubscribeCreate.DropEmitter(subscriber);
        } else if (i == 4) {
            noneEmitter = new rx.internal.operators.OnSubscribeCreate.LatestEmitter(subscriber);
        } else {
            noneEmitter = new rx.internal.operators.OnSubscribeCreate.BufferEmitter(subscriber, rx.internal.util.RxRingBuffer.SIZE);
        }
        subscriber.add(noneEmitter);
        subscriber.setProducer(noneEmitter);
        this.getHighSpeedVideoFpsRanges.call(noneEmitter);
    }

    static abstract class BaseEmitter<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Emitter<T>, rx.Producer, rx.Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        final rx.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final rx.subscriptions.SerialSubscription getHighSpeedVideoSizes = new rx.subscriptions.SerialSubscription();

        void getHighResolutionOutputSizeshNQ4ISI() {
        }

        void getHighSpeedVideoFpsRanges() {
        }

        public BaseEmitter(rx.Subscriber<? super T> subscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.isUnsubscribed()) {
                return;
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
            } finally {
                this.getHighSpeedVideoSizes.unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.isUnsubscribed()) {
                return;
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            } finally {
                this.getHighSpeedVideoSizes.unsubscribe();
            }
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            this.getHighSpeedVideoSizes.unsubscribe();
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighSpeedVideoSizes.isUnsubscribed();
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (rx.internal.operators.BackpressureUtils.validate(j)) {
                rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j);
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // rx.Emitter
        public final void setSubscription(rx.Subscription subscription) {
            this.getHighSpeedVideoSizes.set(subscription);
        }

        @Override // rx.Emitter
        public final void setCancellation(rx.functions.Cancellable cancellable) {
            setSubscription(new rx.internal.subscriptions.CancellableSubscription(cancellable));
        }

        @Override // rx.Emitter
        public final long requested() {
            return get();
        }
    }

    static final class NoneEmitter<T> extends rx.internal.operators.OnSubscribeCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public NoneEmitter(rx.Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            long j;
            if (this.getHighResolutionOutputSizeshNQ4ISI.isUnsubscribed()) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
        }
    }

    static abstract class NoOverflowBaseEmitter<T> extends rx.internal.operators.OnSubscribeCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        abstract void getHighSpeedVideoSizes();

        public NoOverflowBaseEmitter(rx.Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.isUnsubscribed()) {
                return;
            }
            if (get() != 0) {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                rx.internal.operators.BackpressureUtils.produced(this, 1L);
            } else {
                getHighSpeedVideoSizes();
            }
        }
    }

    static final class DropEmitter<T> extends rx.internal.operators.OnSubscribeCreate.NoOverflowBaseEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        @Override // rx.internal.operators.OnSubscribeCreate.NoOverflowBaseEmitter
        final void getHighSpeedVideoSizes() {
        }

        public DropEmitter(rx.Subscriber<? super T> subscriber) {
            super(subscriber);
        }
    }

    static final class ErrorEmitter<T> extends rx.internal.operators.OnSubscribeCreate.NoOverflowBaseEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;
        private boolean getHighSpeedVideoFpsRanges;

        public ErrorEmitter(rx.Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // rx.internal.operators.OnSubscribeCreate.NoOverflowBaseEmitter, rx.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            super.onNext(t);
        }

        @Override // rx.internal.operators.OnSubscribeCreate.BaseEmitter, rx.Observer
        public final void onCompleted() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            super.onCompleted();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.BaseEmitter, rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                rx.plugins.RxJavaHooks.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = true;
                super.onError(th);
            }
        }

        @Override // rx.internal.operators.OnSubscribeCreate.NoOverflowBaseEmitter
        final void getHighSpeedVideoSizes() {
            onError(new rx.exceptions.MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    static final class BufferEmitter<T> extends rx.internal.operators.OnSubscribeCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        java.lang.Throwable Camera2StreamConfigurationMap;
        volatile boolean getHighSpeedVideoFpsRanges;
        final java.util.Queue<java.lang.Object> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicInteger getOutputFormats;

        public BufferEmitter(rx.Subscriber<? super T> subscriber, int i) {
            super(subscriber);
            this.getHighSpeedVideoFpsRangesFor = rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable() ? new rx.internal.util.unsafe.SpscUnboundedArrayQueue<>(i) : new rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue<>(i);
            this.getOutputFormats = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor.offer(rx.internal.operators.NotificationLite.next(t));
            Camera2StreamConfigurationMap();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.BaseEmitter, rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = th;
            this.getHighSpeedVideoFpsRanges = true;
            Camera2StreamConfigurationMap();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.BaseEmitter, rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRanges = true;
            Camera2StreamConfigurationMap();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.BaseEmitter
        final void getHighSpeedVideoFpsRanges() {
            Camera2StreamConfigurationMap();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.BaseEmitter
        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getOutputFormats.getAndIncrement() == 0) {
                this.getHighSpeedVideoFpsRangesFor.clear();
            }
        }

        private void Camera2StreamConfigurationMap() {
            if (this.getOutputFormats.getAndIncrement() == 0) {
                rx.Subscriber<? super T> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                java.util.Queue<java.lang.Object> queue = this.getHighSpeedVideoFpsRangesFor;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (subscriber.isUnsubscribed()) {
                            queue.clear();
                            return;
                        }
                        boolean z = this.getHighSpeedVideoFpsRanges;
                        java.lang.Object poll = queue.poll();
                        boolean z2 = poll == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext((java.lang.Object) rx.internal.operators.NotificationLite.getValue(poll));
                            j2++;
                        } else {
                            java.lang.Throwable th = this.Camera2StreamConfigurationMap;
                            if (th != null) {
                                super.onError(th);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (subscriber.isUnsubscribed()) {
                            queue.clear();
                            return;
                        }
                        boolean z3 = this.getHighSpeedVideoFpsRanges;
                        boolean isEmpty = queue.isEmpty();
                        if (z3 && isEmpty) {
                            java.lang.Throwable th2 = this.Camera2StreamConfigurationMap;
                            if (th2 != null) {
                                super.onError(th2);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        rx.internal.operators.BackpressureUtils.produced(this, j2);
                    }
                    i = this.getOutputFormats.addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    static final class LatestEmitter<T> extends rx.internal.operators.OnSubscribeCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getHighSpeedVideoFpsRanges;
        java.lang.Throwable getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicInteger getInputFormats;

        public LatestEmitter(rx.Subscriber<? super T> subscriber) {
            super(subscriber);
            this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
            this.getInputFormats = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRanges.set(rx.internal.operators.NotificationLite.next(t));
            getHighSpeedVideoSizes();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.BaseEmitter, rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor = th;
            this.Camera2StreamConfigurationMap = true;
            getHighSpeedVideoSizes();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.BaseEmitter, rx.Observer
        public final void onCompleted() {
            this.Camera2StreamConfigurationMap = true;
            getHighSpeedVideoSizes();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.BaseEmitter
        final void getHighSpeedVideoFpsRanges() {
            getHighSpeedVideoSizes();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.BaseEmitter
        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getInputFormats.getAndIncrement() == 0) {
                this.getHighSpeedVideoFpsRanges.lazySet(null);
            }
        }

        private void getHighSpeedVideoSizes() {
            if (this.getInputFormats.getAndIncrement() == 0) {
                rx.Subscriber<? super T> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this.getHighSpeedVideoFpsRanges;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        if (j2 == j) {
                            break;
                        }
                        if (subscriber.isUnsubscribed()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z = this.Camera2StreamConfigurationMap;
                        java.lang.Object andSet = atomicReference.getAndSet(null);
                        boolean z2 = andSet == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext((java.lang.Object) rx.internal.operators.NotificationLite.getValue(andSet));
                            j2++;
                        } else {
                            java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
                            if (th != null) {
                                super.onError(th);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (subscriber.isUnsubscribed()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z3 = this.Camera2StreamConfigurationMap;
                        boolean z4 = atomicReference.get() == null;
                        if (z3 && z4) {
                            java.lang.Throwable th2 = this.getHighSpeedVideoFpsRangesFor;
                            if (th2 != null) {
                                super.onError(th2);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        rx.internal.operators.BackpressureUtils.produced(this, j2);
                    }
                    i = this.getInputFormats.addAndGet(-i);
                } while (i != 0);
            }
        }
    }
}

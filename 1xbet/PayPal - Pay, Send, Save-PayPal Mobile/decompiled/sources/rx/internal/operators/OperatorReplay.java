package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorReplay<T> extends rx.observables.ConnectableObservable<T> implements rx.Subscription {
    static final rx.functions.Func0 getHighSpeedVideoFpsRanges = new rx.functions.Func0() { // from class: rx.internal.operators.OperatorReplay.1
        @Override // rx.functions.Func0, java.util.concurrent.Callable
        public final java.lang.Object call() {
            return new rx.internal.operators.OperatorReplay.UnboundedReplayBuffer();
        }
    };
    final rx.Observable<? extends T> Camera2StreamConfigurationMap;
    final java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorReplay.ReplaySubscriber<T>> getHighResolutionOutputSizeshNQ4ISI;
    final rx.functions.Func0<? extends rx.internal.operators.OperatorReplay.ReplayBuffer<T>> getHighSpeedVideoFpsRangesFor;

    interface ReplayBuffer<T> {
        void Camera2StreamConfigurationMap(java.lang.Throwable th);

        void getHighResolutionOutputSizeshNQ4ISI(rx.internal.operators.OperatorReplay.InnerProducer<T> innerProducer);

        void getHighSpeedVideoFpsRangesFor();

        void getHighSpeedVideoFpsRangesFor(T t);
    }

    public static <T, U, R> rx.Observable<R> multicastSelector(final rx.functions.Func0<? extends rx.observables.ConnectableObservable<U>> func0, final rx.functions.Func1<? super rx.Observable<U>, ? extends rx.Observable<R>> func1) {
        return rx.Observable.unsafeCreate(new rx.Observable.OnSubscribe<R>() { // from class: rx.internal.operators.OperatorReplay.2
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(java.lang.Object obj) {
                final rx.Subscriber<? super T> subscriber = (rx.Subscriber) obj;
                try {
                    rx.observables.ConnectableObservable connectableObservable = (rx.observables.ConnectableObservable) rx.functions.Func0.this.call();
                    ((rx.Observable) func1.call(connectableObservable)).subscribe((rx.Subscriber) subscriber);
                    connectableObservable.connect(new rx.functions.Action1<rx.Subscription>() { // from class: rx.internal.operators.OperatorReplay.2.1
                        @Override // rx.functions.Action1
                        public /* synthetic */ void call(rx.Subscription subscription) {
                            subscriber.add(subscription);
                        }
                    });
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwOrReport(th, subscriber);
                }
            }
        });
    }

    public static <T> rx.observables.ConnectableObservable<T> observeOn(final rx.observables.ConnectableObservable<T> connectableObservable, rx.Scheduler scheduler) {
        final rx.Observable<T> observeOn = connectableObservable.observeOn(scheduler);
        return new rx.observables.ConnectableObservable<T>(new rx.Observable.OnSubscribe<T>() { // from class: rx.internal.operators.OperatorReplay.3
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(java.lang.Object obj) {
                final rx.Subscriber subscriber = (rx.Subscriber) obj;
                rx.Observable.this.unsafeSubscribe(new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorReplay.3.1
                    @Override // rx.Observer
                    public void onNext(T t) {
                        subscriber.onNext(t);
                    }

                    @Override // rx.Observer
                    public void onError(java.lang.Throwable th) {
                        subscriber.onError(th);
                    }

                    @Override // rx.Observer
                    public void onCompleted() {
                        subscriber.onCompleted();
                    }
                });
            }
        }) { // from class: rx.internal.operators.OperatorReplay.4
            @Override // rx.observables.ConnectableObservable
            public final void connect(rx.functions.Action1<? super rx.Subscription> action1) {
                connectableObservable.connect(action1);
            }
        };
    }

    public static <T> rx.observables.ConnectableObservable<T> create(rx.Observable<? extends T> observable) {
        rx.functions.Func0 func0 = getHighSpeedVideoFpsRanges;
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return new rx.internal.operators.OperatorReplay(new rx.internal.operators.OperatorReplay.AnonymousClass7(atomicReference, func0), observable, atomicReference, func0);
    }

    public static <T> rx.observables.ConnectableObservable<T> create(rx.Observable<? extends T> observable, final int i) {
        if (i == Integer.MAX_VALUE) {
            return create(observable);
        }
        rx.functions.Func0<rx.internal.operators.OperatorReplay.ReplayBuffer<T>> func0 = new rx.functions.Func0<rx.internal.operators.OperatorReplay.ReplayBuffer<T>>() { // from class: rx.internal.operators.OperatorReplay.5
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return new rx.internal.operators.OperatorReplay.SizeBoundReplayBuffer(i);
            }
        };
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return new rx.internal.operators.OperatorReplay(new rx.internal.operators.OperatorReplay.AnonymousClass7(atomicReference, func0), observable, atomicReference, func0);
    }

    public static <T> rx.observables.ConnectableObservable<T> create(rx.Observable<? extends T> observable, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return create(observable, j, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> rx.observables.ConnectableObservable<T> create(rx.Observable<? extends T> observable, long j, java.util.concurrent.TimeUnit timeUnit, final rx.Scheduler scheduler, final int i) {
        final long millis = timeUnit.toMillis(j);
        rx.functions.Func0<rx.internal.operators.OperatorReplay.ReplayBuffer<T>> func0 = new rx.functions.Func0<rx.internal.operators.OperatorReplay.ReplayBuffer<T>>() { // from class: rx.internal.operators.OperatorReplay.6
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return new rx.internal.operators.OperatorReplay.SizeAndTimeBoundReplayBuffer(i, millis, scheduler);
            }
        };
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return new rx.internal.operators.OperatorReplay(new rx.internal.operators.OperatorReplay.AnonymousClass7(atomicReference, func0), observable, atomicReference, func0);
    }

    /* renamed from: rx.internal.operators.OperatorReplay$7, reason: invalid class name */
    static final class AnonymousClass7 implements rx.Observable.OnSubscribe<T> {
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference Camera2StreamConfigurationMap;
        final /* synthetic */ rx.functions.Func0 getHighSpeedVideoSizes;

        AnonymousClass7(java.util.concurrent.atomic.AtomicReference atomicReference, rx.functions.Func0 func0) {
            this.Camera2StreamConfigurationMap = atomicReference;
            this.getHighSpeedVideoSizes = func0;
        }

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            rx.internal.operators.OperatorReplay.ReplaySubscriber replaySubscriber;
            rx.Subscriber subscriber = (rx.Subscriber) obj;
            while (true) {
                replaySubscriber = (rx.internal.operators.OperatorReplay.ReplaySubscriber) this.Camera2StreamConfigurationMap.get();
                if (replaySubscriber != null) {
                    break;
                }
                rx.internal.operators.OperatorReplay.ReplaySubscriber replaySubscriber2 = new rx.internal.operators.OperatorReplay.ReplaySubscriber((rx.internal.operators.OperatorReplay.ReplayBuffer) this.getHighSpeedVideoSizes.call());
                replaySubscriber2.add(rx.subscriptions.Subscriptions.create(new rx.internal.operators.OperatorReplay.ReplaySubscriber.AnonymousClass1()));
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, replaySubscriber, replaySubscriber2)) {
                    replaySubscriber = replaySubscriber2;
                    break;
                }
            }
            rx.internal.operators.OperatorReplay.InnerProducer<T> innerProducer = new rx.internal.operators.OperatorReplay.InnerProducer<>(replaySubscriber, subscriber);
            replaySubscriber.Camera2StreamConfigurationMap(innerProducer);
            subscriber.add(innerProducer);
            replaySubscriber.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(innerProducer);
            subscriber.setProducer(innerProducer);
        }
    }

    private OperatorReplay(rx.Observable.OnSubscribe<T> onSubscribe, rx.Observable<? extends T> observable, java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorReplay.ReplaySubscriber<T>> atomicReference, rx.functions.Func0<? extends rx.internal.operators.OperatorReplay.ReplayBuffer<T>> func0) {
        super(onSubscribe);
        this.Camera2StreamConfigurationMap = observable;
        this.getHighResolutionOutputSizeshNQ4ISI = atomicReference;
        this.getHighSpeedVideoFpsRangesFor = func0;
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.getHighResolutionOutputSizeshNQ4ISI.lazySet(null);
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        rx.internal.operators.OperatorReplay.ReplaySubscriber<T> replaySubscriber = this.getHighResolutionOutputSizeshNQ4ISI.get();
        return replaySubscriber == null || replaySubscriber.isUnsubscribed();
    }

    @Override // rx.observables.ConnectableObservable
    public final void connect(rx.functions.Action1<? super rx.Subscription> action1) {
        rx.internal.operators.OperatorReplay.ReplaySubscriber<T> replaySubscriber;
        while (true) {
            replaySubscriber = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (replaySubscriber != null && !replaySubscriber.isUnsubscribed()) {
                break;
            }
            rx.internal.operators.OperatorReplay.ReplaySubscriber<T> replaySubscriber2 = new rx.internal.operators.OperatorReplay.ReplaySubscriber<>(this.getHighSpeedVideoFpsRangesFor.call());
            replaySubscriber2.add(rx.subscriptions.Subscriptions.create(replaySubscriber2.new AnonymousClass1()));
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, replaySubscriber, replaySubscriber2)) {
                replaySubscriber = replaySubscriber2;
                break;
            }
        }
        boolean z = false;
        if (!replaySubscriber.isOutputSupportedForhNQ4ISI.get() && replaySubscriber.isOutputSupportedForhNQ4ISI.compareAndSet(false, true)) {
            z = true;
        }
        action1.call(replaySubscriber);
        if (z) {
            this.Camera2StreamConfigurationMap.unsafeSubscribe(replaySubscriber);
        }
    }

    static final class ReplaySubscriber<T> extends rx.Subscriber<T> implements rx.Subscription {
        static final rx.internal.operators.OperatorReplay.InnerProducer[] getHighSpeedVideoFpsRanges = new rx.internal.operators.OperatorReplay.InnerProducer[0];
        static final rx.internal.operators.OperatorReplay.InnerProducer[] getHighSpeedVideoFpsRangesFor = new rx.internal.operators.OperatorReplay.InnerProducer[0];
        boolean Camera2StreamConfigurationMap;
        java.util.List<rx.internal.operators.OperatorReplay.InnerProducer<T>> getHighResolutionOutputSizeshNQ4ISI;
        final rx.internal.operators.OperatorReplay.ReplayBuffer<T> getHighSpeedVideoSizes;
        boolean getHighSpeedVideoSizesFor;
        long getInputFormats;
        long getInputSizeshNQ4ISI;
        boolean getOutputFormats;
        boolean getOutputMinFrameDuration;
        volatile long getOutputMinFrameDurationlomOqCM;
        long getOutputSizeshNQ4ISI;
        volatile rx.Producer getOutputStallDuration;
        volatile boolean getValidOutputFormatsForInputhNQ4ISI;
        final rx.internal.util.OpenHashSet<rx.internal.operators.OperatorReplay.InnerProducer<T>> getOutputStallDurationlomOqCM = new rx.internal.util.OpenHashSet<>();
        rx.internal.operators.OperatorReplay.InnerProducer<T>[] getOutputSizes = getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicBoolean isOutputSupportedForhNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();

        public ReplaySubscriber(rx.internal.operators.OperatorReplay.ReplayBuffer<T> replayBuffer) {
            this.getHighSpeedVideoSizes = replayBuffer;
            request(0L);
        }

        /* renamed from: rx.internal.operators.OperatorReplay$ReplaySubscriber$1, reason: invalid class name */
        class AnonymousClass1 implements rx.functions.Action0 {
            AnonymousClass1() {
            }

            @Override // rx.functions.Action0
            public void call() {
                if (rx.internal.operators.OperatorReplay.ReplaySubscriber.this.getValidOutputFormatsForInputhNQ4ISI) {
                    return;
                }
                synchronized (rx.internal.operators.OperatorReplay.ReplaySubscriber.this.getOutputStallDurationlomOqCM) {
                    if (!rx.internal.operators.OperatorReplay.ReplaySubscriber.this.getValidOutputFormatsForInputhNQ4ISI) {
                        rx.internal.operators.OperatorReplay.ReplaySubscriber.this.getOutputStallDurationlomOqCM.terminate();
                        rx.internal.operators.OperatorReplay.ReplaySubscriber.this.getOutputMinFrameDurationlomOqCM++;
                        rx.internal.operators.OperatorReplay.ReplaySubscriber.this.getValidOutputFormatsForInputhNQ4ISI = true;
                    }
                }
            }
        }

        final boolean Camera2StreamConfigurationMap(rx.internal.operators.OperatorReplay.InnerProducer<T> innerProducer) {
            if (this.getValidOutputFormatsForInputhNQ4ISI) {
                return false;
            }
            synchronized (this.getOutputStallDurationlomOqCM) {
                if (this.getValidOutputFormatsForInputhNQ4ISI) {
                    return false;
                }
                this.getOutputStallDurationlomOqCM.add(innerProducer);
                this.getOutputMinFrameDurationlomOqCM++;
                return true;
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            if (this.getOutputStallDuration != null) {
                throw new java.lang.IllegalStateException("Only a single producer can be set on a Subscriber.");
            }
            this.getOutputStallDuration = producer;
            getHighSpeedVideoFpsRanges(null);
            getHighSpeedVideoSizes();
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.getOutputMinFrameDuration) {
                return;
            }
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(t);
            getHighSpeedVideoSizes();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputMinFrameDuration) {
                return;
            }
            this.getOutputMinFrameDuration = true;
            try {
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(th);
                getHighSpeedVideoSizes();
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getOutputMinFrameDuration) {
                return;
            }
            this.getOutputMinFrameDuration = true;
            try {
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
                getHighSpeedVideoSizes();
            } finally {
                unsubscribe();
            }
        }

        final void getHighSpeedVideoFpsRanges(rx.internal.operators.OperatorReplay.InnerProducer<T> innerProducer) {
            long j;
            java.util.List<rx.internal.operators.OperatorReplay.InnerProducer<T>> list;
            boolean z;
            long j2;
            if (isUnsubscribed()) {
                return;
            }
            synchronized (this) {
                if (this.getHighSpeedVideoSizesFor) {
                    if (innerProducer != null) {
                        java.util.List list2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (list2 == null) {
                            list2 = new java.util.ArrayList();
                            this.getHighResolutionOutputSizeshNQ4ISI = list2;
                        }
                        list2.add(innerProducer);
                    } else {
                        this.Camera2StreamConfigurationMap = true;
                    }
                    this.getOutputFormats = true;
                    return;
                }
                this.getHighSpeedVideoSizesFor = true;
                long j3 = this.getInputFormats;
                if (innerProducer != null) {
                    j = java.lang.Math.max(j3, innerProducer.getOutputFormats.get());
                } else {
                    long j4 = j3;
                    for (rx.internal.operators.OperatorReplay.InnerProducer<T> innerProducer2 : getHighResolutionOutputSizeshNQ4ISI()) {
                        if (innerProducer2 != null) {
                            j4 = java.lang.Math.max(j4, innerProducer2.getOutputFormats.get());
                        }
                    }
                    j = j4;
                }
                getHighResolutionOutputSizeshNQ4ISI(j, j3);
                while (!isUnsubscribed()) {
                    synchronized (this) {
                        if (!this.getOutputFormats) {
                            this.getHighSpeedVideoSizesFor = false;
                            return;
                        }
                        this.getOutputFormats = false;
                        list = this.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighResolutionOutputSizeshNQ4ISI = null;
                        z = this.Camera2StreamConfigurationMap;
                        this.Camera2StreamConfigurationMap = false;
                    }
                    long j5 = this.getInputFormats;
                    if (list != null) {
                        java.util.Iterator<rx.internal.operators.OperatorReplay.InnerProducer<T>> it = list.iterator();
                        j2 = j5;
                        while (it.hasNext()) {
                            j2 = java.lang.Math.max(j2, it.next().getOutputFormats.get());
                        }
                    } else {
                        j2 = j5;
                    }
                    if (z) {
                        for (rx.internal.operators.OperatorReplay.InnerProducer<T> innerProducer3 : getHighResolutionOutputSizeshNQ4ISI()) {
                            if (innerProducer3 != null) {
                                j2 = java.lang.Math.max(j2, innerProducer3.getOutputFormats.get());
                            }
                        }
                    }
                    getHighResolutionOutputSizeshNQ4ISI(j2, j5);
                }
            }
        }

        private rx.internal.operators.OperatorReplay.InnerProducer<T>[] getHighResolutionOutputSizeshNQ4ISI() {
            rx.internal.operators.OperatorReplay.InnerProducer<T>[] innerProducerArr;
            synchronized (this.getOutputStallDurationlomOqCM) {
                rx.internal.operators.OperatorReplay.InnerProducer<T>[] values = this.getOutputStallDurationlomOqCM.values();
                int length = values.length;
                innerProducerArr = new rx.internal.operators.OperatorReplay.InnerProducer[length];
                java.lang.System.arraycopy(values, 0, innerProducerArr, 0, length);
            }
            return innerProducerArr;
        }

        private void getHighResolutionOutputSizeshNQ4ISI(long j, long j2) {
            long j3 = this.getInputSizeshNQ4ISI;
            rx.Producer producer = this.getOutputStallDuration;
            long j4 = j - j2;
            if (j4 == 0) {
                if (j3 == 0 || producer == null) {
                    return;
                }
                this.getInputSizeshNQ4ISI = 0L;
                producer.request(j3);
                return;
            }
            this.getInputFormats = j;
            if (producer == null) {
                long j5 = j3 + j4;
                if (j5 < 0) {
                    j5 = Long.MAX_VALUE;
                }
                this.getInputSizeshNQ4ISI = j5;
                return;
            }
            if (j3 != 0) {
                this.getInputSizeshNQ4ISI = 0L;
                producer.request(j3 + j4);
            } else {
                producer.request(j4);
            }
        }

        private void getHighSpeedVideoSizes() {
            rx.internal.operators.OperatorReplay.InnerProducer<T>[] innerProducerArr;
            rx.internal.operators.OperatorReplay.InnerProducer<T>[] innerProducerArr2 = this.getOutputSizes;
            if (this.getOutputSizeshNQ4ISI != this.getOutputMinFrameDurationlomOqCM) {
                synchronized (this.getOutputStallDurationlomOqCM) {
                    innerProducerArr = this.getOutputSizes;
                    rx.internal.operators.OperatorReplay.InnerProducer<T>[] values = this.getOutputStallDurationlomOqCM.values();
                    int length = values.length;
                    if (innerProducerArr.length != length) {
                        innerProducerArr = new rx.internal.operators.OperatorReplay.InnerProducer[length];
                        this.getOutputSizes = innerProducerArr;
                    }
                    java.lang.System.arraycopy(values, 0, innerProducerArr, 0, length);
                    this.getOutputSizeshNQ4ISI = this.getOutputMinFrameDurationlomOqCM;
                }
                innerProducerArr2 = innerProducerArr;
            }
            rx.internal.operators.OperatorReplay.ReplayBuffer<T> replayBuffer = this.getHighSpeedVideoSizes;
            for (rx.internal.operators.OperatorReplay.InnerProducer<T> innerProducer : innerProducerArr2) {
                if (innerProducer != null) {
                    replayBuffer.getHighResolutionOutputSizeshNQ4ISI(innerProducer);
                }
            }
        }
    }

    static final class InnerProducer<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer, rx.Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        java.lang.Object Camera2StreamConfigurationMap;
        rx.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        final rx.internal.operators.OperatorReplay.ReplaySubscriber<T> getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicLong getOutputFormats = new java.util.concurrent.atomic.AtomicLong();

        public InnerProducer(rx.internal.operators.OperatorReplay.ReplaySubscriber<T> replaySubscriber, rx.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoSizes = replaySubscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
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
                    j3 = j2 + j;
                    if (j3 < 0) {
                        j3 = Long.MAX_VALUE;
                    }
                } while (!compareAndSet(j2, j3));
                getHighSpeedVideoFpsRanges(j);
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(this);
                this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(this);
            }
        }

        final void getHighSpeedVideoFpsRanges(long j) {
            long j2;
            long j3;
            do {
                j2 = this.getOutputFormats.get();
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!this.getOutputFormats.compareAndSet(j2, j3));
        }

        public final long getHighSpeedVideoFpsRangesFor(long j) {
            long j2;
            long j3;
            if (j <= 0) {
                throw new java.lang.IllegalArgumentException("Cant produce zero or less");
            }
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j3 = j2 - j;
                if (j3 < 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("More produced (");
                    sb.append(j);
                    sb.append(") than requested (");
                    sb.append(j2);
                    sb.append(")");
                    throw new java.lang.IllegalStateException(sb.toString());
                }
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            rx.internal.operators.OperatorReplay.ReplaySubscriber<T> replaySubscriber = this.getHighSpeedVideoSizes;
            if (!replaySubscriber.getValidOutputFormatsForInputhNQ4ISI) {
                synchronized (replaySubscriber.getOutputStallDurationlomOqCM) {
                    if (!replaySubscriber.getValidOutputFormatsForInputhNQ4ISI) {
                        replaySubscriber.getOutputStallDurationlomOqCM.remove(this);
                        if (replaySubscriber.getOutputStallDurationlomOqCM.isEmpty()) {
                            replaySubscriber.getOutputSizes = rx.internal.operators.OperatorReplay.ReplaySubscriber.getHighSpeedVideoFpsRanges;
                        }
                        replaySubscriber.getOutputMinFrameDurationlomOqCM++;
                    }
                }
            }
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(this);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
    }

    static final class UnboundedReplayBuffer<T> extends java.util.ArrayList<java.lang.Object> implements rx.internal.operators.OperatorReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int getHighSpeedVideoFpsRangesFor;

        public UnboundedReplayBuffer() {
            super(16);
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor(T t) {
            add(rx.internal.operators.NotificationLite.next(t));
            this.getHighSpeedVideoFpsRangesFor++;
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            add(rx.internal.operators.NotificationLite.error(th));
            this.getHighSpeedVideoFpsRangesFor++;
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor() {
            add(rx.internal.operators.NotificationLite.completed());
            this.getHighSpeedVideoFpsRangesFor++;
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public final void getHighResolutionOutputSizeshNQ4ISI(rx.internal.operators.OperatorReplay.InnerProducer<T> innerProducer) {
            synchronized (innerProducer) {
                if (innerProducer.getHighSpeedVideoFpsRangesFor) {
                    innerProducer.getHighSpeedVideoFpsRanges = true;
                    return;
                }
                innerProducer.getHighSpeedVideoFpsRangesFor = true;
                while (!innerProducer.isUnsubscribed()) {
                    int i = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.Integer num = (java.lang.Integer) innerProducer.Camera2StreamConfigurationMap;
                    int intValue = num != null ? num.intValue() : 0;
                    rx.Subscriber<? super T> subscriber = innerProducer.getHighResolutionOutputSizeshNQ4ISI;
                    if (subscriber == null) {
                        return;
                    }
                    long j = innerProducer.get();
                    long j2 = 0;
                    while (j2 != j && intValue < i) {
                        java.lang.Object obj = get(intValue);
                        try {
                            if (rx.internal.operators.NotificationLite.accept(subscriber, obj) || innerProducer.isUnsubscribed()) {
                                return;
                            }
                            intValue++;
                            j2++;
                        } catch (java.lang.Throwable th) {
                            rx.exceptions.Exceptions.throwIfFatal(th);
                            innerProducer.unsubscribe();
                            if (rx.internal.operators.NotificationLite.isError(obj) || rx.internal.operators.NotificationLite.isCompleted(obj)) {
                                return;
                            }
                            subscriber.onError(rx.exceptions.OnErrorThrowable.addValueAsLastCause(th, rx.internal.operators.NotificationLite.getValue(obj)));
                            return;
                        }
                    }
                    if (j2 != 0) {
                        innerProducer.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(intValue);
                        if (j != Long.MAX_VALUE) {
                            innerProducer.getHighSpeedVideoFpsRangesFor(j2);
                        }
                    }
                    synchronized (innerProducer) {
                        if (!innerProducer.getHighSpeedVideoFpsRanges) {
                            innerProducer.getHighSpeedVideoFpsRangesFor = false;
                            return;
                        }
                        innerProducer.getHighSpeedVideoFpsRanges = false;
                    }
                }
            }
        }
    }

    static final class Node extends java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorReplay.Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final long getHighSpeedVideoFpsRanges;
        final java.lang.Object getHighSpeedVideoFpsRangesFor;

        public Node(java.lang.Object obj, long j) {
            this.getHighSpeedVideoFpsRangesFor = obj;
            this.getHighSpeedVideoFpsRanges = j;
        }
    }

    static class BoundedReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorReplay.Node> implements rx.internal.operators.OperatorReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        int getHighResolutionOutputSizeshNQ4ISI;
        rx.internal.operators.OperatorReplay.Node getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoSizes;

        java.lang.Object Camera2StreamConfigurationMap(java.lang.Object obj) {
            return obj;
        }

        void getHighResolutionOutputSizeshNQ4ISI() {
        }

        java.lang.Object getHighSpeedVideoFpsRanges(java.lang.Object obj) {
            return obj;
        }

        void getHighSpeedVideoFpsRanges() {
        }

        public BoundedReplayBuffer() {
            rx.internal.operators.OperatorReplay.Node node = new rx.internal.operators.OperatorReplay.Node(null, 0L);
            this.getHighSpeedVideoFpsRanges = node;
            set(node);
        }

        rx.internal.operators.OperatorReplay.Node Camera2StreamConfigurationMap() {
            return get();
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor(T t) {
            java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(rx.internal.operators.NotificationLite.next(t));
            long j = this.getHighSpeedVideoSizes + 1;
            this.getHighSpeedVideoSizes = j;
            rx.internal.operators.OperatorReplay.Node node = new rx.internal.operators.OperatorReplay.Node(Camera2StreamConfigurationMap, j);
            this.getHighSpeedVideoFpsRanges.set(node);
            this.getHighSpeedVideoFpsRanges = node;
            this.getHighResolutionOutputSizeshNQ4ISI++;
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(rx.internal.operators.NotificationLite.error(th));
            long j = this.getHighSpeedVideoSizes + 1;
            this.getHighSpeedVideoSizes = j;
            rx.internal.operators.OperatorReplay.Node node = new rx.internal.operators.OperatorReplay.Node(Camera2StreamConfigurationMap, j);
            this.getHighSpeedVideoFpsRanges.set(node);
            this.getHighSpeedVideoFpsRanges = node;
            this.getHighResolutionOutputSizeshNQ4ISI++;
            getHighSpeedVideoFpsRanges();
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor() {
            java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(rx.internal.operators.NotificationLite.completed());
            long j = this.getHighSpeedVideoSizes + 1;
            this.getHighSpeedVideoSizes = j;
            rx.internal.operators.OperatorReplay.Node node = new rx.internal.operators.OperatorReplay.Node(Camera2StreamConfigurationMap, j);
            this.getHighSpeedVideoFpsRanges.set(node);
            this.getHighSpeedVideoFpsRanges = node;
            this.getHighResolutionOutputSizeshNQ4ISI++;
            getHighSpeedVideoFpsRanges();
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public final void getHighResolutionOutputSizeshNQ4ISI(rx.internal.operators.OperatorReplay.InnerProducer<T> innerProducer) {
            rx.Subscriber<? super T> subscriber;
            rx.internal.operators.OperatorReplay.Node node;
            synchronized (innerProducer) {
                if (innerProducer.getHighSpeedVideoFpsRangesFor) {
                    innerProducer.getHighSpeedVideoFpsRanges = true;
                    return;
                }
                innerProducer.getHighSpeedVideoFpsRangesFor = true;
                while (!innerProducer.isUnsubscribed()) {
                    rx.internal.operators.OperatorReplay.Node node2 = (rx.internal.operators.OperatorReplay.Node) innerProducer.Camera2StreamConfigurationMap;
                    if (node2 == null) {
                        node2 = Camera2StreamConfigurationMap();
                        innerProducer.Camera2StreamConfigurationMap = node2;
                        innerProducer.getHighSpeedVideoFpsRanges(node2.getHighSpeedVideoFpsRanges);
                    }
                    if (innerProducer.isUnsubscribed() || (subscriber = innerProducer.getHighResolutionOutputSizeshNQ4ISI) == null) {
                        return;
                    }
                    long j = innerProducer.get();
                    long j2 = 0;
                    while (j2 != j && (node = node2.get()) != null) {
                        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(node.getHighSpeedVideoFpsRangesFor);
                        try {
                            if (rx.internal.operators.NotificationLite.accept(subscriber, highSpeedVideoFpsRanges)) {
                                innerProducer.Camera2StreamConfigurationMap = null;
                                return;
                            }
                            j2++;
                            if (innerProducer.isUnsubscribed()) {
                                return;
                            } else {
                                node2 = node;
                            }
                        } catch (java.lang.Throwable th) {
                            innerProducer.Camera2StreamConfigurationMap = null;
                            rx.exceptions.Exceptions.throwIfFatal(th);
                            innerProducer.unsubscribe();
                            if (rx.internal.operators.NotificationLite.isError(highSpeedVideoFpsRanges) || rx.internal.operators.NotificationLite.isCompleted(highSpeedVideoFpsRanges)) {
                                return;
                            }
                            subscriber.onError(rx.exceptions.OnErrorThrowable.addValueAsLastCause(th, rx.internal.operators.NotificationLite.getValue(highSpeedVideoFpsRanges)));
                            return;
                        }
                    }
                    if (j2 != 0) {
                        innerProducer.Camera2StreamConfigurationMap = node2;
                        if (j != Long.MAX_VALUE) {
                            innerProducer.getHighSpeedVideoFpsRangesFor(j2);
                        }
                    }
                    synchronized (innerProducer) {
                        if (!innerProducer.getHighSpeedVideoFpsRanges) {
                            innerProducer.getHighSpeedVideoFpsRangesFor = false;
                            return;
                        }
                        innerProducer.getHighSpeedVideoFpsRanges = false;
                    }
                }
            }
        }
    }

    static final class SizeBoundReplayBuffer<T> extends rx.internal.operators.OperatorReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int getHighSpeedVideoFpsRangesFor;

        public SizeBoundReplayBuffer(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getHighResolutionOutputSizeshNQ4ISI > this.getHighSpeedVideoFpsRangesFor) {
                rx.internal.operators.OperatorReplay.Node node = get().get();
                if (node == null) {
                    throw new java.lang.IllegalStateException("Empty list!");
                }
                this.getHighResolutionOutputSizeshNQ4ISI--;
                set(node);
            }
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> extends rx.internal.operators.OperatorReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int Camera2StreamConfigurationMap;
        final long getHighSpeedVideoFpsRangesFor;
        final rx.Scheduler getOutputFormats;

        public SizeAndTimeBoundReplayBuffer(int i, long j, rx.Scheduler scheduler) {
            this.getOutputFormats = scheduler;
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        final java.lang.Object Camera2StreamConfigurationMap(java.lang.Object obj) {
            return new rx.schedulers.Timestamped(this.getOutputFormats.now(), obj);
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.Object obj) {
            return ((rx.schedulers.Timestamped) obj).getValue();
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        final rx.internal.operators.OperatorReplay.Node Camera2StreamConfigurationMap() {
            rx.internal.operators.OperatorReplay.Node node;
            long now = this.getOutputFormats.now();
            long j = this.getHighSpeedVideoFpsRangesFor;
            rx.internal.operators.OperatorReplay.Node node2 = get();
            rx.internal.operators.OperatorReplay.Node node3 = node2.get();
            while (true) {
                rx.internal.operators.OperatorReplay.Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                rx.schedulers.Timestamped timestamped = (rx.schedulers.Timestamped) node2.getHighSpeedVideoFpsRangesFor;
                java.lang.Object value = timestamped.getValue();
                if (rx.internal.operators.NotificationLite.isCompleted(value) || rx.internal.operators.NotificationLite.isError(value) || timestamped.getTimestampMillis() > now - j) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        final void getHighResolutionOutputSizeshNQ4ISI() {
            rx.internal.operators.OperatorReplay.Node node;
            long now = this.getOutputFormats.now();
            long j = this.getHighSpeedVideoFpsRangesFor;
            rx.internal.operators.OperatorReplay.Node node2 = get();
            rx.internal.operators.OperatorReplay.Node node3 = node2.get();
            int i = 0;
            while (true) {
                rx.internal.operators.OperatorReplay.Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI <= this.Camera2StreamConfigurationMap) {
                        if (((rx.schedulers.Timestamped) node2.getHighSpeedVideoFpsRangesFor).getTimestampMillis() > now - j) {
                            break;
                        }
                        i++;
                        this.getHighResolutionOutputSizeshNQ4ISI--;
                        node3 = node2.get();
                    } else {
                        i++;
                        this.getHighResolutionOutputSizeshNQ4ISI--;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                set(node);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
        
            set(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        
            return;
         */
        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighSpeedVideoFpsRanges() {
            long now = this.getOutputFormats.now();
            long j = this.getHighSpeedVideoFpsRangesFor;
            rx.internal.operators.OperatorReplay.Node node = get();
            rx.internal.operators.OperatorReplay.Node node2 = node.get();
            int i = 0;
            while (true) {
                rx.internal.operators.OperatorReplay.Node node3 = node2;
                rx.internal.operators.OperatorReplay.Node node4 = node;
                node = node3;
                if (node == null || this.getHighResolutionOutputSizeshNQ4ISI <= 1 || ((rx.schedulers.Timestamped) node.getHighSpeedVideoFpsRangesFor).getTimestampMillis() > now - j) {
                    break;
                }
                i++;
                this.getHighResolutionOutputSizeshNQ4ISI--;
                node2 = node.get();
            }
        }
    }
}

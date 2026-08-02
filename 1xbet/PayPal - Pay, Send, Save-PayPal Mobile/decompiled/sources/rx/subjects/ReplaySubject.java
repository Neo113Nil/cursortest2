package rx.subjects;

/* loaded from: classes18.dex */
public final class ReplaySubject<T> extends rx.subjects.Subject<T, T> {
    private static final java.lang.Object[] getHighSpeedVideoFpsRangesFor = new java.lang.Object[0];
    final rx.subjects.ReplaySubject.ReplayState<T> Camera2StreamConfigurationMap;

    interface ReplayBuffer<T> {
        java.lang.Throwable Camera2StreamConfigurationMap();

        void Camera2StreamConfigurationMap(java.lang.Throwable th);

        void getHighResolutionOutputSizeshNQ4ISI();

        void getHighResolutionOutputSizeshNQ4ISI(T t);

        T getHighSpeedVideoFpsRanges();

        int getHighSpeedVideoFpsRangesFor();

        void getHighSpeedVideoFpsRangesFor(rx.subjects.ReplaySubject.ReplayProducer<T> replayProducer);

        boolean getHighSpeedVideoSizes();

        T[] getHighSpeedVideoSizes(T[] tArr);
    }

    public static <T> rx.subjects.ReplaySubject<T> create() {
        return create(16);
    }

    public static <T> rx.subjects.ReplaySubject<T> create(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("capacity > 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        return new rx.subjects.ReplaySubject<>(new rx.subjects.ReplaySubject.ReplayState(new rx.subjects.ReplaySubject.ReplayUnboundedBuffer(i)));
    }

    public static <T> rx.subjects.ReplaySubject<T> createWithSize(int i) {
        return new rx.subjects.ReplaySubject<>(new rx.subjects.ReplaySubject.ReplayState(new rx.subjects.ReplaySubject.ReplaySizeBoundBuffer(i)));
    }

    public static <T> rx.subjects.ReplaySubject<T> createWithTime(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return createWithTimeAndSize(j, timeUnit, Integer.MAX_VALUE, scheduler);
    }

    public static <T> rx.subjects.ReplaySubject<T> createWithTimeAndSize(long j, java.util.concurrent.TimeUnit timeUnit, int i, rx.Scheduler scheduler) {
        return new rx.subjects.ReplaySubject<>(new rx.subjects.ReplaySubject.ReplayState(new rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer(i, timeUnit.toMillis(j), scheduler)));
    }

    private ReplaySubject(rx.subjects.ReplaySubject.ReplayState<T> replayState) {
        super(replayState);
        this.Camera2StreamConfigurationMap = replayState;
    }

    @Override // rx.Observer
    public final void onNext(T t) {
        this.Camera2StreamConfigurationMap.onNext(t);
    }

    @Override // rx.Observer
    public final void onError(java.lang.Throwable th) {
        this.Camera2StreamConfigurationMap.onError(th);
    }

    @Override // rx.Observer
    public final void onCompleted() {
        this.Camera2StreamConfigurationMap.onCompleted();
    }

    @Override // rx.subjects.Subject
    public final boolean hasObservers() {
        return this.Camera2StreamConfigurationMap.get().length != 0;
    }

    public final boolean hasThrowable() {
        return this.Camera2StreamConfigurationMap.get() == rx.subjects.ReplaySubject.ReplayState.Camera2StreamConfigurationMap && this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap() != null;
    }

    public final boolean hasCompleted() {
        return this.Camera2StreamConfigurationMap.get() == rx.subjects.ReplaySubject.ReplayState.Camera2StreamConfigurationMap && this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap() == null;
    }

    public final java.lang.Throwable getThrowable() {
        if (this.Camera2StreamConfigurationMap.get() == rx.subjects.ReplaySubject.ReplayState.Camera2StreamConfigurationMap) {
            return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap();
        }
        return null;
    }

    public final int size() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor();
    }

    public final boolean hasAnyValue() {
        return !this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
    }

    public final boolean hasValue() {
        return hasAnyValue();
    }

    public final T[] getValues(T[] tArr) {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object[] getValues() {
        java.lang.Object[] objArr = getHighSpeedVideoFpsRangesFor;
        java.lang.Object[] values = getValues(objArr);
        return values == objArr ? new java.lang.Object[0] : values;
    }

    public final T getValue() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
    }

    static final class ReplayState<T> extends java.util.concurrent.atomic.AtomicReference<rx.subjects.ReplaySubject.ReplayProducer<T>[]> implements rx.Observable.OnSubscribe<T>, rx.Observer<T> {
        private static final long serialVersionUID = 5952362471246910544L;
        final rx.subjects.ReplaySubject.ReplayBuffer<T> getHighSpeedVideoFpsRanges;
        static final rx.subjects.ReplaySubject.ReplayProducer[] getHighSpeedVideoSizes = new rx.subjects.ReplaySubject.ReplayProducer[0];
        static final rx.subjects.ReplaySubject.ReplayProducer[] Camera2StreamConfigurationMap = new rx.subjects.ReplaySubject.ReplayProducer[0];

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            rx.Subscriber subscriber = (rx.Subscriber) obj;
            rx.subjects.ReplaySubject.ReplayProducer<T> replayProducer = new rx.subjects.ReplaySubject.ReplayProducer<>(subscriber, this);
            subscriber.add(replayProducer);
            subscriber.setProducer(replayProducer);
            while (true) {
                rx.subjects.ReplaySubject.ReplayProducer<T>[] replayProducerArr = get();
                if (replayProducerArr == Camera2StreamConfigurationMap) {
                    break;
                }
                int length = replayProducerArr.length;
                rx.subjects.ReplaySubject.ReplayProducer[] replayProducerArr2 = new rx.subjects.ReplaySubject.ReplayProducer[length + 1];
                java.lang.System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
                if (compareAndSet(replayProducerArr, replayProducerArr2)) {
                    if (replayProducer.isUnsubscribed()) {
                        getHighSpeedVideoFpsRangesFor(replayProducer);
                        return;
                    }
                }
            }
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(replayProducer);
        }

        public ReplayState(rx.subjects.ReplaySubject.ReplayBuffer<T> replayBuffer) {
            this.getHighSpeedVideoFpsRanges = replayBuffer;
            lazySet(getHighSpeedVideoSizes);
        }

        final void getHighSpeedVideoFpsRangesFor(rx.subjects.ReplaySubject.ReplayProducer<T> replayProducer) {
            rx.subjects.ReplaySubject.ReplayProducer<T>[] replayProducerArr;
            rx.subjects.ReplaySubject.ReplayProducer[] replayProducerArr2;
            do {
                replayProducerArr = get();
                if (replayProducerArr == Camera2StreamConfigurationMap || replayProducerArr == getHighSpeedVideoSizes) {
                    return;
                }
                int length = replayProducerArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (replayProducerArr[i] == replayProducer) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    replayProducerArr2 = getHighSpeedVideoSizes;
                } else {
                    rx.subjects.ReplaySubject.ReplayProducer[] replayProducerArr3 = new rx.subjects.ReplaySubject.ReplayProducer[length - 1];
                    java.lang.System.arraycopy(replayProducerArr, 0, replayProducerArr3, 0, i);
                    java.lang.System.arraycopy(replayProducerArr, i + 1, replayProducerArr3, i, (length - i) - 1);
                    replayProducerArr2 = replayProducerArr3;
                }
            } while (!compareAndSet(replayProducerArr, replayProducerArr2));
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            rx.subjects.ReplaySubject.ReplayBuffer<T> replayBuffer = this.getHighSpeedVideoFpsRanges;
            replayBuffer.getHighResolutionOutputSizeshNQ4ISI(t);
            for (rx.subjects.ReplaySubject.ReplayProducer<T> replayProducer : get()) {
                replayBuffer.getHighSpeedVideoFpsRangesFor(replayProducer);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            rx.subjects.ReplaySubject.ReplayBuffer<T> replayBuffer = this.getHighSpeedVideoFpsRanges;
            replayBuffer.Camera2StreamConfigurationMap(th);
            java.util.ArrayList arrayList = null;
            for (rx.subjects.ReplaySubject.ReplayProducer<T> replayProducer : getAndSet(Camera2StreamConfigurationMap)) {
                try {
                    replayBuffer.getHighSpeedVideoFpsRangesFor(replayProducer);
                } catch (java.lang.Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            rx.exceptions.Exceptions.throwIfAny(arrayList);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            rx.subjects.ReplaySubject.ReplayBuffer<T> replayBuffer = this.getHighSpeedVideoFpsRanges;
            replayBuffer.getHighResolutionOutputSizeshNQ4ISI();
            for (rx.subjects.ReplaySubject.ReplayProducer<T> replayProducer : getAndSet(Camera2StreamConfigurationMap)) {
                replayBuffer.getHighSpeedVideoFpsRangesFor(replayProducer);
            }
        }
    }

    static final class ReplayUnboundedBuffer<T> implements rx.subjects.ReplaySubject.ReplayBuffer<T> {
        volatile boolean Camera2StreamConfigurationMap;
        volatile int getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        final java.lang.Object[] getHighSpeedVideoSizes;
        int getInputFormats;
        java.lang.Object[] getOutputFormats;

        public ReplayUnboundedBuffer(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            java.lang.Object[] objArr = new java.lang.Object[i + 1];
            this.getHighSpeedVideoSizes = objArr;
            this.getOutputFormats = objArr;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final void getHighResolutionOutputSizeshNQ4ISI(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            int i = this.getInputFormats;
            java.lang.Object[] objArr = this.getOutputFormats;
            if (i == objArr.length - 1) {
                java.lang.Object[] objArr2 = new java.lang.Object[objArr.length];
                objArr2[0] = t;
                this.getInputFormats = 1;
                objArr[i] = objArr2;
                this.getOutputFormats = objArr2;
            } else {
                objArr[i] = t;
                this.getInputFormats = i + 1;
            }
            this.getHighResolutionOutputSizeshNQ4ISI++;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                rx.plugins.RxJavaHooks.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = th;
                this.Camera2StreamConfigurationMap = true;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final void getHighResolutionOutputSizeshNQ4ISI() {
            this.Camera2StreamConfigurationMap = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r13 != r6) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
        
            if (r2.isUnsubscribed() == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
        
            r12 = r17.Camera2StreamConfigurationMap;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
        
            if (r10 != r17.getHighResolutionOutputSizeshNQ4ISI) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
        
            r16 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
        
            if (r12 == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
        
            if (r16 == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
        
            r18.getHighSpeedVideoSizes = null;
            r1 = r17.getHighSpeedVideoFpsRanges;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
        
            if (r1 == null) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
        
            r2.onError(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0089, code lost:
        
            r2.onCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x008c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0070, code lost:
        
            r18.getHighSpeedVideoSizes = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0072, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0091, code lost:
        
            if (r13 == 0) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x009a, code lost:
        
            if (r6 == Long.MAX_VALUE) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009c, code lost:
        
            rx.internal.operators.BackpressureUtils.produced(r18.getHighResolutionOutputSizeshNQ4ISI, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
        
            r18.getHighSpeedVideoFpsRangesFor = r10;
            r18.getInputSizeshNQ4ISI = r9;
            r18.getHighSpeedVideoSizes = r8;
            r5 = r18.addAndGet(-r5);
         */
        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void getHighSpeedVideoFpsRangesFor(rx.subjects.ReplaySubject.ReplayProducer<T> replayProducer) {
            if (replayProducer.getAndIncrement() == 0) {
                rx.Subscriber<? super T> subscriber = replayProducer.Camera2StreamConfigurationMap;
                int i = this.getHighSpeedVideoFpsRangesFor;
                int i2 = 1;
                do {
                    long j = replayProducer.getHighResolutionOutputSizeshNQ4ISI.get();
                    java.lang.Object[] objArr = (java.lang.Object[]) replayProducer.getHighSpeedVideoSizes;
                    if (objArr == null) {
                        objArr = this.getHighSpeedVideoSizes;
                    }
                    int i3 = replayProducer.getInputSizeshNQ4ISI;
                    int i4 = replayProducer.getHighSpeedVideoFpsRangesFor;
                    long j2 = 0;
                    while (true) {
                        boolean z = false;
                        if (j2 == j) {
                            break;
                        }
                        if (subscriber.isUnsubscribed()) {
                            replayProducer.getHighSpeedVideoSizes = null;
                            return;
                        }
                        boolean z2 = this.Camera2StreamConfigurationMap;
                        boolean z3 = i4 == this.getHighResolutionOutputSizeshNQ4ISI;
                        if (!z2 || !z3) {
                            if (z3) {
                                break;
                            }
                            if (i3 == i) {
                                objArr = (java.lang.Object[]) objArr[i3];
                                i3 = 0;
                            }
                            subscriber.onNext(objArr[i3]);
                            j2++;
                            i3++;
                            i4++;
                        } else {
                            replayProducer.getHighSpeedVideoSizes = null;
                            java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
                            if (th != null) {
                                subscriber.onError(th);
                                return;
                            } else {
                                subscriber.onCompleted();
                                return;
                            }
                        }
                    }
                } while (i2 != 0);
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final java.lang.Throwable Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final T getHighSpeedVideoFpsRanges() {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                return null;
            }
            java.lang.Object[] objArr = this.getHighSpeedVideoSizes;
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            while (i >= i2) {
                objArr = (java.lang.Object[]) objArr[i2];
                i -= i2;
            }
            return (T) objArr[i - 1];
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final int getHighSpeedVideoFpsRangesFor() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final boolean getHighSpeedVideoSizes() {
            return this.getHighResolutionOutputSizeshNQ4ISI == 0;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final T[] getHighSpeedVideoSizes(T[] tArr) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (tArr.length < i) {
                tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            java.lang.Object[] objArr = this.getHighSpeedVideoSizes;
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            int i3 = 0;
            while (true) {
                int i4 = i3 + i2;
                if (i4 >= i) {
                    break;
                }
                java.lang.System.arraycopy(objArr, 0, tArr, i3, i2);
                objArr = objArr[i2];
                i3 = i4;
            }
            java.lang.System.arraycopy(objArr, 0, tArr, i3, i - i3);
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }
    }

    static final class ReplaySizeBoundBuffer<T> implements rx.subjects.ReplaySubject.ReplayBuffer<T> {
        volatile boolean Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        volatile rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node<T> getHighSpeedVideoFpsRangesFor;
        java.lang.Throwable getHighSpeedVideoSizes;
        rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node<T> getInputFormats;

        public ReplaySizeBoundBuffer(int i) {
            this.getHighSpeedVideoFpsRanges = i;
            rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node<T> node = new rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node<>(null);
            this.getInputFormats = node;
            this.getHighSpeedVideoFpsRangesFor = node;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final void getHighResolutionOutputSizeshNQ4ISI(T t) {
            rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node<T> node = new rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node<>(t);
            this.getInputFormats.set(node);
            this.getInputFormats = node;
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.get();
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = th;
            this.Camera2StreamConfigurationMap = true;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final void getHighResolutionOutputSizeshNQ4ISI() {
            this.Camera2StreamConfigurationMap = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        
            if (r10 != r5) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
        
            if (r2.isUnsubscribed() == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
        
            r3 = r17.Camera2StreamConfigurationMap;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
        
            if (r7.get() != null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
        
            if (r3 == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
        
            if (r13 == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
        
            r18.getHighSpeedVideoSizes = null;
            r1 = r17.getHighSpeedVideoSizes;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
        
            if (r1 == null) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
        
            r2.onError(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
        
            r2.onCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0064, code lost:
        
            r18.getHighSpeedVideoSizes = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0066, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
        
            if (r10 == 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x008d, code lost:
        
            if (r5 == Long.MAX_VALUE) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
        
            rx.internal.operators.BackpressureUtils.produced(r18.getHighResolutionOutputSizeshNQ4ISI, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0094, code lost:
        
            r18.getHighSpeedVideoSizes = r7;
            r4 = r18.addAndGet(-r4);
         */
        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void getHighSpeedVideoFpsRangesFor(rx.subjects.ReplaySubject.ReplayProducer<T> replayProducer) {
            if (replayProducer.getAndIncrement() == 0) {
                rx.Subscriber<? super T> subscriber = replayProducer.Camera2StreamConfigurationMap;
                int i = 1;
                do {
                    long j = replayProducer.getHighResolutionOutputSizeshNQ4ISI.get();
                    rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node<T> node = (rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node) replayProducer.getHighSpeedVideoSizes;
                    if (node == null) {
                        node = this.getHighSpeedVideoFpsRangesFor;
                    }
                    long j2 = 0;
                    while (true) {
                        boolean z = false;
                        if (j2 == j) {
                            break;
                        }
                        if (subscriber.isUnsubscribed()) {
                            replayProducer.getHighSpeedVideoSizes = null;
                            return;
                        }
                        boolean z2 = this.Camera2StreamConfigurationMap;
                        rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node<T> node2 = node.get();
                        boolean z3 = node2 == null;
                        if (!z2 || !z3) {
                            if (z3) {
                                break;
                            }
                            subscriber.onNext(node2.getHighSpeedVideoFpsRanges);
                            j2++;
                            node = node2;
                        } else {
                            replayProducer.getHighSpeedVideoSizes = null;
                            java.lang.Throwable th = this.getHighSpeedVideoSizes;
                            if (th != null) {
                                subscriber.onError(th);
                                return;
                            } else {
                                subscriber.onCompleted();
                                return;
                            }
                        }
                    }
                } while (i != 0);
            }
        }

        static final class Node<T> extends java.util.concurrent.atomic.AtomicReference<rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final T getHighSpeedVideoFpsRanges;

            public Node(T t) {
                this.getHighSpeedVideoFpsRanges = t;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final java.lang.Throwable Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final T getHighSpeedVideoFpsRanges() {
            rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node<T> node = this.getHighSpeedVideoFpsRangesFor;
            while (true) {
                rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.getHighSpeedVideoFpsRanges;
                }
                node = node2;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final int getHighSpeedVideoFpsRangesFor() {
            rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node<T> node = this.getHighSpeedVideoFpsRangesFor.get();
            int i = 0;
            while (node != null && i != Integer.MAX_VALUE) {
                node = node.get();
                i++;
            }
            return i;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final boolean getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoFpsRangesFor.get() == null;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final T[] getHighSpeedVideoSizes(T[] tArr) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node<T> node = this.getHighSpeedVideoFpsRangesFor.get(); node != null; node = node.get()) {
                arrayList.add(node.getHighSpeedVideoFpsRanges);
            }
            return (T[]) arrayList.toArray(tArr);
        }
    }

    static final class ReplaySizeAndTimeBoundBuffer<T> implements rx.subjects.ReplaySubject.ReplayBuffer<T> {
        final long Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        java.lang.Throwable getHighSpeedVideoFpsRangesFor;
        volatile rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        final rx.Scheduler getInputFormats;
        rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> getOutputMinFrameDuration;

        public ReplaySizeAndTimeBoundBuffer(int i, long j, rx.Scheduler scheduler) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode = new rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<>(null, 0L);
            this.getOutputMinFrameDuration = timedNode;
            this.getHighSpeedVideoSizes = timedNode;
            this.Camera2StreamConfigurationMap = j;
            this.getInputFormats = scheduler;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final void getHighResolutionOutputSizeshNQ4ISI(T t) {
            rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode;
            long now = this.getInputFormats.now();
            rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode2 = new rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<>(t, now);
            this.getOutputMinFrameDuration.set(timedNode2);
            this.getOutputMinFrameDuration = timedNode2;
            long j = this.Camera2StreamConfigurationMap;
            int i = this.getHighSpeedVideoSizesFor;
            rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode3 = this.getHighSpeedVideoSizes;
            if (i == this.getHighResolutionOutputSizeshNQ4ISI) {
                timedNode = timedNode3.get();
            } else {
                i++;
                timedNode = timedNode3;
            }
            while (true) {
                rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode4 = timedNode.get();
                if (timedNode4 == null || timedNode4.getHighSpeedVideoFpsRanges > now - j) {
                    break;
                }
                i--;
                timedNode = timedNode4;
            }
            this.getHighSpeedVideoSizesFor = i;
            if (timedNode != timedNode3) {
                this.getHighSpeedVideoSizes = timedNode;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            getInputFormats();
            this.getHighSpeedVideoFpsRangesFor = th;
            this.getHighSpeedVideoFpsRanges = true;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final void getHighResolutionOutputSizeshNQ4ISI() {
            getInputFormats();
            this.getHighSpeedVideoFpsRanges = true;
        }

        private void getInputFormats() {
            long now = this.getInputFormats.now();
            long j = this.Camera2StreamConfigurationMap;
            rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode = this.getHighSpeedVideoSizes;
            rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode2 = timedNode;
            while (true) {
                rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode3 = timedNode2.get();
                if (timedNode3 == null || timedNode3.getHighSpeedVideoFpsRanges > now - j) {
                    break;
                } else {
                    timedNode2 = timedNode3;
                }
            }
            if (timedNode != timedNode2) {
                this.getHighSpeedVideoSizes = timedNode2;
            }
        }

        private rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> getOutputFormats() {
            long now = this.getInputFormats.now();
            long j = this.Camera2StreamConfigurationMap;
            rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode = this.getHighSpeedVideoSizes;
            while (true) {
                rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null || timedNode2.getHighSpeedVideoFpsRanges > now - j) {
                    break;
                }
                timedNode = timedNode2;
            }
            return timedNode;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        
            if (r10 != r5) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
        
            if (r2.isUnsubscribed() == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        
            r3 = r17.getHighSpeedVideoFpsRanges;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        
            if (r7.get() != null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
        
            if (r3 == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
        
            if (r13 == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
        
            r18.getHighSpeedVideoSizes = null;
            r1 = r17.getHighSpeedVideoFpsRangesFor;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
        
            if (r1 == null) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
        
            r2.onError(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
        
            r2.onCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0066, code lost:
        
            r18.getHighSpeedVideoSizes = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0068, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
        
            if (r10 == 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x008f, code lost:
        
            if (r5 == Long.MAX_VALUE) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0091, code lost:
        
            rx.internal.operators.BackpressureUtils.produced(r18.getHighResolutionOutputSizeshNQ4ISI, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0096, code lost:
        
            r18.getHighSpeedVideoSizes = r7;
            r4 = r18.addAndGet(-r4);
         */
        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void getHighSpeedVideoFpsRangesFor(rx.subjects.ReplaySubject.ReplayProducer<T> replayProducer) {
            if (replayProducer.getAndIncrement() == 0) {
                rx.Subscriber<? super T> subscriber = replayProducer.Camera2StreamConfigurationMap;
                int i = 1;
                do {
                    long j = replayProducer.getHighResolutionOutputSizeshNQ4ISI.get();
                    rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode = (rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode) replayProducer.getHighSpeedVideoSizes;
                    if (timedNode == null) {
                        timedNode = getOutputFormats();
                    }
                    long j2 = 0;
                    while (true) {
                        boolean z = false;
                        if (j2 == j) {
                            break;
                        }
                        if (subscriber.isUnsubscribed()) {
                            replayProducer.getHighSpeedVideoSizes = null;
                            return;
                        }
                        boolean z2 = this.getHighSpeedVideoFpsRanges;
                        rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode2 = timedNode.get();
                        boolean z3 = timedNode2 == null;
                        if (!z2 || !z3) {
                            if (z3) {
                                break;
                            }
                            subscriber.onNext(timedNode2.Camera2StreamConfigurationMap);
                            j2++;
                            timedNode = timedNode2;
                        } else {
                            replayProducer.getHighSpeedVideoSizes = null;
                            java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
                            if (th != null) {
                                subscriber.onError(th);
                                return;
                            } else {
                                subscriber.onCompleted();
                                return;
                            }
                        }
                    }
                } while (i != 0);
            }
        }

        static final class TimedNode<T> extends java.util.concurrent.atomic.AtomicReference<rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final T Camera2StreamConfigurationMap;
            final long getHighSpeedVideoFpsRanges;

            public TimedNode(T t, long j) {
                this.Camera2StreamConfigurationMap = t;
                this.getHighSpeedVideoFpsRanges = j;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final java.lang.Throwable Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final T getHighSpeedVideoFpsRanges() {
            rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> outputFormats = getOutputFormats();
            while (true) {
                rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode = outputFormats.get();
                if (timedNode == null) {
                    return outputFormats.Camera2StreamConfigurationMap;
                }
                outputFormats = timedNode;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final int getHighSpeedVideoFpsRangesFor() {
            rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode = getOutputFormats().get();
            int i = 0;
            while (timedNode != null && i != Integer.MAX_VALUE) {
                timedNode = timedNode.get();
                i++;
            }
            return i;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final boolean getHighSpeedVideoSizes() {
            return getOutputFormats().get() == null;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public final T[] getHighSpeedVideoSizes(T[] tArr) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode<T> timedNode = getOutputFormats().get(); timedNode != null; timedNode = timedNode.get()) {
                arrayList.add(timedNode.Camera2StreamConfigurationMap);
            }
            return (T[]) arrayList.toArray(tArr);
        }
    }

    static final class ReplayProducer<T> extends java.util.concurrent.atomic.AtomicInteger implements rx.Producer, rx.Subscription {
        private static final long serialVersionUID = -5006209596735204567L;
        final rx.Subscriber<? super T> Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicLong getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        final rx.subjects.ReplaySubject.ReplayState<T> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;
        int getInputSizeshNQ4ISI;

        public ReplayProducer(rx.Subscriber<? super T> subscriber, rx.subjects.ReplaySubject.ReplayState<T> replayState) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoFpsRanges = replayState;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this);
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.Camera2StreamConfigurationMap.isUnsubscribed();
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (j > 0) {
                rx.internal.operators.BackpressureUtils.getAndAddRequest(this.getHighResolutionOutputSizeshNQ4ISI, j);
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this);
            } else if (j < 0) {
                throw new java.lang.IllegalArgumentException("n >= required but it was ".concat(java.lang.String.valueOf(j)));
            }
        }
    }
}

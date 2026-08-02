package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorEagerConcatMap<T, R> implements rx.Observable.Operator<R, T> {
    final rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;

    public OperatorEagerConcatMap(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = func1;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = i2;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super R> subscriber) {
        final rx.internal.operators.OperatorEagerConcatMap.EagerOuterSubscriber eagerOuterSubscriber = new rx.internal.operators.OperatorEagerConcatMap.EagerOuterSubscriber(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, subscriber);
        eagerOuterSubscriber.getInputSizeshNQ4ISI = new rx.internal.operators.OperatorEagerConcatMap.EagerOuterProducer(eagerOuterSubscriber);
        eagerOuterSubscriber.add(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorEagerConcatMap.EagerOuterSubscriber.1
            @Override // rx.functions.Action0
            public void call() {
                rx.internal.operators.OperatorEagerConcatMap.EagerOuterSubscriber.this.getHighSpeedVideoFpsRanges = true;
                if (rx.internal.operators.OperatorEagerConcatMap.EagerOuterSubscriber.this.getOutputFormats.getAndIncrement() == 0) {
                    rx.internal.operators.OperatorEagerConcatMap.EagerOuterSubscriber.this.getHighSpeedVideoFpsRangesFor();
                }
            }
        }));
        eagerOuterSubscriber.getHighSpeedVideoSizes.add(eagerOuterSubscriber);
        eagerOuterSubscriber.getHighSpeedVideoSizes.setProducer(eagerOuterSubscriber.getInputSizeshNQ4ISI);
        return eagerOuterSubscriber;
    }

    static final class EagerOuterProducer extends java.util.concurrent.atomic.AtomicLong implements rx.Producer {
        private static final long serialVersionUID = -657299606803478389L;
        final rx.internal.operators.OperatorEagerConcatMap.EagerOuterSubscriber<?, ?> getHighResolutionOutputSizeshNQ4ISI;

        public EagerOuterProducer(rx.internal.operators.OperatorEagerConcatMap.EagerOuterSubscriber<?, ?> eagerOuterSubscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = eagerOuterSubscriber;
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (j < 0) {
                throw new java.lang.IllegalStateException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
            }
            if (j > 0) {
                rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j);
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
            }
        }
    }

    static final class EagerOuterSubscriber<T, R> extends rx.Subscriber<T> {
        java.lang.Throwable Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        final rx.Subscriber<? super R> getHighSpeedVideoSizes;
        final rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> getInputFormats;
        rx.internal.operators.OperatorEagerConcatMap.EagerOuterProducer getInputSizeshNQ4ISI;
        final java.util.Queue<rx.internal.operators.OperatorEagerConcatMap.EagerInnerSubscriber<R>> getHighSpeedVideoSizesFor = new java.util.LinkedList();
        final java.util.concurrent.atomic.AtomicInteger getOutputFormats = new java.util.concurrent.atomic.AtomicInteger();

        public EagerOuterSubscriber(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1, int i, int i2, rx.Subscriber<? super R> subscriber) {
            this.getInputFormats = func1;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoSizes = subscriber;
            request(i2 == Integer.MAX_VALUE ? Long.MAX_VALUE : i2);
        }

        final void getHighSpeedVideoFpsRangesFor() {
            java.util.ArrayList arrayList;
            synchronized (this.getHighSpeedVideoSizesFor) {
                arrayList = new java.util.ArrayList(this.getHighSpeedVideoSizesFor);
                this.getHighSpeedVideoSizesFor.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((rx.Subscription) it.next()).unsubscribe();
            }
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            try {
                rx.Observable<? extends R> call = this.getInputFormats.call(t);
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                rx.internal.operators.OperatorEagerConcatMap.EagerInnerSubscriber<R> eagerInnerSubscriber = new rx.internal.operators.OperatorEagerConcatMap.EagerInnerSubscriber<>(this, this.getHighSpeedVideoFpsRangesFor);
                synchronized (this.getHighSpeedVideoSizesFor) {
                    if (this.getHighSpeedVideoFpsRanges) {
                        return;
                    }
                    this.getHighSpeedVideoSizesFor.add(eagerInnerSubscriber);
                    if (this.getHighSpeedVideoFpsRanges) {
                        return;
                    }
                    call.unsafeSubscribe(eagerInnerSubscriber);
                    getHighSpeedVideoFpsRanges();
                }
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, this.getHighSpeedVideoSizes, t);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = th;
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            getHighSpeedVideoFpsRanges();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            getHighSpeedVideoFpsRanges();
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
        
            if (r12 == 0) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
        
            if (r8 == Long.MAX_VALUE) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0091, code lost:
        
            rx.internal.operators.BackpressureUtils.produced(r0, r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0094, code lost:
        
            if (r6 != false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0096, code lost:
        
            r7.request(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
        
            if (r6 == false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
        
            r4 = r17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighSpeedVideoFpsRanges() {
            rx.internal.operators.OperatorEagerConcatMap.EagerInnerSubscriber<R> peek;
            int i;
            if (this.getOutputFormats.getAndIncrement() == 0) {
                rx.internal.operators.OperatorEagerConcatMap.EagerOuterProducer eagerOuterProducer = this.getInputSizeshNQ4ISI;
                rx.Subscriber<? super R> subscriber = this.getHighSpeedVideoSizes;
                int i2 = 1;
                while (!this.getHighSpeedVideoFpsRanges) {
                    boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
                    synchronized (this.getHighSpeedVideoSizesFor) {
                        peek = this.getHighSpeedVideoSizesFor.peek();
                    }
                    boolean z2 = false;
                    boolean z3 = peek == null;
                    if (z) {
                        java.lang.Throwable th = this.Camera2StreamConfigurationMap;
                        if (th != null) {
                            getHighSpeedVideoFpsRangesFor();
                            subscriber.onError(th);
                            return;
                        } else if (z3) {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                    if (!z3) {
                        long j = eagerOuterProducer.get();
                        java.util.Queue<java.lang.Object> queue = peek.getHighSpeedVideoFpsRangesFor;
                        long j2 = 0;
                        while (true) {
                            boolean z4 = peek.Camera2StreamConfigurationMap;
                            java.lang.Object peek2 = queue.peek();
                            i = i2;
                            boolean z5 = peek2 == null;
                            if (z4) {
                                java.lang.Throwable th2 = peek.getHighSpeedVideoFpsRanges;
                                if (th2 == null) {
                                    if (z5) {
                                        synchronized (this.getHighSpeedVideoSizesFor) {
                                            this.getHighSpeedVideoSizesFor.poll();
                                        }
                                        peek.unsubscribe();
                                        request(1L);
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    getHighSpeedVideoFpsRangesFor();
                                    subscriber.onError(th2);
                                    return;
                                }
                            }
                            if (z5 || j == j2) {
                                break;
                            }
                            queue.poll();
                            try {
                                subscriber.onNext((java.lang.Object) rx.internal.operators.NotificationLite.getValue(peek2));
                                j2++;
                                i2 = i;
                            } catch (java.lang.Throwable th3) {
                                rx.exceptions.Exceptions.throwOrReport(th3, subscriber, peek2);
                                return;
                            }
                        }
                    } else {
                        i = i2;
                    }
                    i2 = this.getOutputFormats.addAndGet(-i);
                    if (i2 == 0) {
                        return;
                    }
                }
                getHighSpeedVideoFpsRangesFor();
            }
        }
    }

    static final class EagerInnerSubscriber<T> extends rx.Subscriber<T> {
        volatile boolean Camera2StreamConfigurationMap;
        final rx.internal.operators.OperatorEagerConcatMap.EagerOuterSubscriber<?, T> getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable getHighSpeedVideoFpsRanges;
        final java.util.Queue<java.lang.Object> getHighSpeedVideoFpsRangesFor;

        public EagerInnerSubscriber(rx.internal.operators.OperatorEagerConcatMap.EagerOuterSubscriber<?, T> eagerOuterSubscriber, int i) {
            java.util.Queue<java.lang.Object> spscAtomicArrayQueue;
            this.getHighResolutionOutputSizeshNQ4ISI = eagerOuterSubscriber;
            if (rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable()) {
                spscAtomicArrayQueue = new rx.internal.util.unsafe.SpscArrayQueue<>(i);
            } else {
                spscAtomicArrayQueue = new rx.internal.util.atomic.SpscAtomicArrayQueue<>(i);
            }
            this.getHighSpeedVideoFpsRangesFor = spscAtomicArrayQueue;
            request(i);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor.offer(rx.internal.operators.NotificationLite.next(t));
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = th;
            this.Camera2StreamConfigurationMap = true;
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.Camera2StreamConfigurationMap = true;
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
        }
    }
}

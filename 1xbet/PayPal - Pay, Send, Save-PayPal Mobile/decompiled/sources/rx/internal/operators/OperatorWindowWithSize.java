package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorWindowWithSize<T> implements rx.Observable.Operator<rx.Observable<T>, T> {
    final int getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoSizes;

    public OperatorWindowWithSize(int i, int i2) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super rx.Observable<T>> subscriber) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoSizes;
        if (i == i2) {
            final rx.internal.operators.OperatorWindowWithSize.WindowExact windowExact = new rx.internal.operators.OperatorWindowWithSize.WindowExact(subscriber, i2);
            subscriber.add(windowExact.Camera2StreamConfigurationMap);
            subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OperatorWindowWithSize.WindowExact.1
                @Override // rx.Producer
                public void request(long j) {
                    if (j < 0) {
                        throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
                    }
                    if (j != 0) {
                        rx.internal.operators.OperatorWindowWithSize.WindowExact.this.request(rx.internal.operators.BackpressureUtils.multiplyCap(rx.internal.operators.OperatorWindowWithSize.WindowExact.this.getHighSpeedVideoSizes, j));
                    }
                }
            });
            return windowExact;
        }
        if (i > i2) {
            rx.internal.operators.OperatorWindowWithSize.WindowSkip windowSkip = new rx.internal.operators.OperatorWindowWithSize.WindowSkip(subscriber, i2, i);
            subscriber.add(windowSkip.getHighSpeedVideoFpsRangesFor);
            subscriber.setProducer(new rx.internal.operators.OperatorWindowWithSize.WindowSkip.WindowSkipProducer());
            return windowSkip;
        }
        rx.internal.operators.OperatorWindowWithSize.WindowOverlap windowOverlap = new rx.internal.operators.OperatorWindowWithSize.WindowOverlap(subscriber, i2, i);
        subscriber.add(windowOverlap.getHighSpeedVideoFpsRangesFor);
        subscriber.setProducer(new rx.internal.operators.OperatorWindowWithSize.WindowOverlap.WindowOverlapProducer());
        return windowOverlap;
    }

    static final class WindowExact<T> extends rx.Subscriber<T> implements rx.functions.Action0 {
        final rx.Subscription Camera2StreamConfigurationMap;
        rx.subjects.Subject<T, T> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final rx.Subscriber<? super rx.Observable<T>> getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicInteger getInputFormats = new java.util.concurrent.atomic.AtomicInteger(1);

        public WindowExact(rx.Subscriber<? super rx.Observable<T>> subscriber, int i) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighSpeedVideoSizes = i;
            rx.Subscription create = rx.subscriptions.Subscriptions.create(this);
            this.Camera2StreamConfigurationMap = create;
            add(create);
            request(0L);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            int i = this.getHighSpeedVideoFpsRanges;
            rx.subjects.UnicastSubject unicastSubject = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                this.getInputFormats.getAndIncrement();
                unicastSubject = rx.subjects.UnicastSubject.create(this.getHighSpeedVideoSizes, this);
                this.getHighResolutionOutputSizeshNQ4ISI = unicastSubject;
                this.getHighSpeedVideoFpsRangesFor.onNext(unicastSubject);
            }
            int i2 = i + 1;
            unicastSubject.onNext(t);
            if (i2 == this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRanges = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                unicastSubject.onCompleted();
                return;
            }
            this.getHighSpeedVideoFpsRanges = i2;
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            rx.subjects.Subject<T, T> subject = this.getHighResolutionOutputSizeshNQ4ISI;
            if (subject != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                subject.onError(th);
            }
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            rx.subjects.Subject<T, T> subject = this.getHighResolutionOutputSizeshNQ4ISI;
            if (subject != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                subject.onCompleted();
            }
            this.getHighSpeedVideoFpsRangesFor.onCompleted();
        }

        @Override // rx.functions.Action0
        public final void call() {
            if (this.getInputFormats.decrementAndGet() == 0) {
                unsubscribe();
            }
        }
    }

    static final class WindowSkip<T> extends rx.Subscriber<T> implements rx.functions.Action0 {
        int Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final rx.Subscription getHighSpeedVideoFpsRangesFor;
        final rx.Subscriber<? super rx.Observable<T>> getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicInteger getInputFormats = new java.util.concurrent.atomic.AtomicInteger(1);
        rx.subjects.Subject<T, T> getInputSizeshNQ4ISI;

        public WindowSkip(rx.Subscriber<? super rx.Observable<T>> subscriber, int i, int i2) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRanges = i2;
            rx.Subscription create = rx.subscriptions.Subscriptions.create(this);
            this.getHighSpeedVideoFpsRangesFor = create;
            add(create);
            request(0L);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            int i = this.Camera2StreamConfigurationMap;
            rx.subjects.UnicastSubject unicastSubject = this.getInputSizeshNQ4ISI;
            if (i == 0) {
                this.getInputFormats.getAndIncrement();
                unicastSubject = rx.subjects.UnicastSubject.create(this.getHighResolutionOutputSizeshNQ4ISI, this);
                this.getInputSizeshNQ4ISI = unicastSubject;
                this.getHighSpeedVideoSizes.onNext(unicastSubject);
            }
            int i2 = i + 1;
            if (unicastSubject != null) {
                unicastSubject.onNext(t);
            }
            if (i2 == this.getHighResolutionOutputSizeshNQ4ISI) {
                this.Camera2StreamConfigurationMap = i2;
                this.getInputSizeshNQ4ISI = null;
                unicastSubject.onCompleted();
            } else if (i2 == this.getHighSpeedVideoFpsRanges) {
                this.Camera2StreamConfigurationMap = 0;
            } else {
                this.Camera2StreamConfigurationMap = i2;
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            rx.subjects.Subject<T, T> subject = this.getInputSizeshNQ4ISI;
            if (subject != null) {
                this.getInputSizeshNQ4ISI = null;
                subject.onError(th);
            }
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            rx.subjects.Subject<T, T> subject = this.getInputSizeshNQ4ISI;
            if (subject != null) {
                this.getInputSizeshNQ4ISI = null;
                subject.onCompleted();
            }
            this.getHighSpeedVideoSizes.onCompleted();
        }

        @Override // rx.functions.Action0
        public final void call() {
            if (this.getInputFormats.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        final class WindowSkipProducer extends java.util.concurrent.atomic.AtomicBoolean implements rx.Producer {
            private static final long serialVersionUID = 4625807964358024108L;

            WindowSkipProducer() {
            }

            @Override // rx.Producer
            public final void request(long j) {
                if (j < 0) {
                    throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
                }
                if (j != 0) {
                    rx.internal.operators.OperatorWindowWithSize.WindowSkip windowSkip = rx.internal.operators.OperatorWindowWithSize.WindowSkip.this;
                    if (get() || !compareAndSet(false, true)) {
                        windowSkip.request(rx.internal.operators.BackpressureUtils.multiplyCap(j, windowSkip.getHighSpeedVideoFpsRanges));
                    } else {
                        windowSkip.request(rx.internal.operators.BackpressureUtils.addCap(rx.internal.operators.BackpressureUtils.multiplyCap(j, windowSkip.getHighResolutionOutputSizeshNQ4ISI), rx.internal.operators.BackpressureUtils.multiplyCap(windowSkip.getHighSpeedVideoFpsRanges - windowSkip.getHighResolutionOutputSizeshNQ4ISI, j - 1)));
                    }
                }
            }
        }
    }

    static final class WindowOverlap<T> extends rx.Subscriber<T> implements rx.functions.Action0 {
        volatile boolean Camera2StreamConfigurationMap;
        final rx.Subscriber<? super rx.Observable<T>> getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscription getHighSpeedVideoFpsRangesFor;
        java.lang.Throwable getHighSpeedVideoSizes;
        final int getHighSpeedVideoSizesFor;
        int getInputFormats;
        int getInputSizeshNQ4ISI;
        final java.util.Queue<rx.subjects.Subject<T, T>> getOutputFormats;
        final int getOutputStallDuration;
        final java.util.concurrent.atomic.AtomicInteger getOutputSizes = new java.util.concurrent.atomic.AtomicInteger(1);
        final java.util.ArrayDeque<rx.subjects.Subject<T, T>> getOutputStallDurationlomOqCM = new java.util.ArrayDeque<>();
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.atomic.AtomicLong getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicLong();

        public WindowOverlap(rx.Subscriber<? super rx.Observable<T>> subscriber, int i, int i2) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getHighSpeedVideoSizesFor = i;
            this.getOutputStallDuration = i2;
            rx.Subscription create = rx.subscriptions.Subscriptions.create(this);
            this.getHighSpeedVideoFpsRangesFor = create;
            add(create);
            request(0L);
            this.getOutputFormats = new rx.internal.util.atomic.SpscLinkedArrayQueue((i + (i2 - 1)) / i2);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            int i = this.getInputSizeshNQ4ISI;
            java.util.ArrayDeque<rx.subjects.Subject<T, T>> arrayDeque = this.getOutputStallDurationlomOqCM;
            if (i == 0 && !this.getHighResolutionOutputSizeshNQ4ISI.isUnsubscribed()) {
                this.getOutputSizes.getAndIncrement();
                rx.subjects.UnicastSubject create = rx.subjects.UnicastSubject.create(16, this);
                arrayDeque.offer(create);
                this.getOutputFormats.offer(create);
                getHighSpeedVideoSizes();
            }
            java.util.Iterator<rx.subjects.Subject<T, T>> it = this.getOutputStallDurationlomOqCM.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            int i2 = this.getInputFormats + 1;
            if (i2 == this.getHighSpeedVideoSizesFor) {
                this.getInputFormats = i2 - this.getOutputStallDuration;
                rx.subjects.Subject<T, T> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.onCompleted();
                }
            } else {
                this.getInputFormats = i2;
            }
            int i3 = i + 1;
            if (i3 == this.getOutputStallDuration) {
                this.getInputSizeshNQ4ISI = 0;
            } else {
                this.getInputSizeshNQ4ISI = i3;
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            java.util.Iterator<rx.subjects.Subject<T, T>> it = this.getOutputStallDurationlomOqCM.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.getOutputStallDurationlomOqCM.clear();
            this.getHighSpeedVideoSizes = th;
            this.Camera2StreamConfigurationMap = true;
            getHighSpeedVideoSizes();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            java.util.Iterator<rx.subjects.Subject<T, T>> it = this.getOutputStallDurationlomOqCM.iterator();
            while (it.hasNext()) {
                it.next().onCompleted();
            }
            this.getOutputStallDurationlomOqCM.clear();
            this.Camera2StreamConfigurationMap = true;
            getHighSpeedVideoSizes();
        }

        @Override // rx.functions.Action0
        public final void call() {
            if (this.getOutputSizes.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void getHighSpeedVideoSizes() {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.getHighSpeedVideoFpsRanges;
            if (atomicInteger.getAndIncrement() == 0) {
                rx.Subscriber<? super rx.Observable<T>> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                java.util.Queue<rx.subjects.Subject<T, T>> queue = this.getOutputFormats;
                int i = 1;
                do {
                    long j = this.getOutputMinFrameDuration.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.Camera2StreamConfigurationMap;
                        rx.subjects.Subject<T, T> poll = queue.poll();
                        boolean z2 = poll == null;
                        if (!getHighSpeedVideoFpsRanges(z, z2, subscriber, queue)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == j && getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, queue.isEmpty(), subscriber, queue)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.getOutputMinFrameDuration.addAndGet(-j2);
                    }
                    i = atomicInteger.addAndGet(-i);
                } while (i != 0);
            }
        }

        private boolean getHighSpeedVideoFpsRanges(boolean z, boolean z2, rx.Subscriber<? super rx.subjects.Subject<T, T>> subscriber, java.util.Queue<rx.subjects.Subject<T, T>> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            java.lang.Throwable th = this.getHighSpeedVideoSizes;
            if (th != null) {
                queue.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        final class WindowOverlapProducer extends java.util.concurrent.atomic.AtomicBoolean implements rx.Producer {
            private static final long serialVersionUID = 4625807964358024108L;

            WindowOverlapProducer() {
            }

            @Override // rx.Producer
            public final void request(long j) {
                if (j < 0) {
                    throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
                }
                if (j != 0) {
                    rx.internal.operators.OperatorWindowWithSize.WindowOverlap windowOverlap = rx.internal.operators.OperatorWindowWithSize.WindowOverlap.this;
                    if (!get() && compareAndSet(false, true)) {
                        windowOverlap.request(rx.internal.operators.BackpressureUtils.addCap(rx.internal.operators.BackpressureUtils.multiplyCap(windowOverlap.getOutputStallDuration, j - 1), windowOverlap.getHighSpeedVideoSizesFor));
                    } else {
                        rx.internal.operators.OperatorWindowWithSize.WindowOverlap.this.request(rx.internal.operators.BackpressureUtils.multiplyCap(windowOverlap.getOutputStallDuration, j));
                    }
                    rx.internal.operators.BackpressureUtils.getAndAddRequest(windowOverlap.getOutputMinFrameDuration, j);
                    windowOverlap.getHighSpeedVideoSizes();
                }
            }
        }
    }
}

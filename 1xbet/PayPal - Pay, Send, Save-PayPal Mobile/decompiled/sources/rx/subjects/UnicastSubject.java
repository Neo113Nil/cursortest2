package rx.subjects;

/* loaded from: classes18.dex */
public final class UnicastSubject<T> extends rx.subjects.Subject<T, T> {
    final rx.subjects.UnicastSubject.State<T> getHighSpeedVideoFpsRanges;

    public static <T> rx.subjects.UnicastSubject<T> create() {
        return create(16);
    }

    public static <T> rx.subjects.UnicastSubject<T> create(int i) {
        return new rx.subjects.UnicastSubject<>(new rx.subjects.UnicastSubject.State(i, false, null));
    }

    public static <T> rx.subjects.UnicastSubject<T> create(boolean z) {
        return new rx.subjects.UnicastSubject<>(new rx.subjects.UnicastSubject.State(16, z, null));
    }

    public static <T> rx.subjects.UnicastSubject<T> create(int i, rx.functions.Action0 action0) {
        return new rx.subjects.UnicastSubject<>(new rx.subjects.UnicastSubject.State(i, false, action0));
    }

    public static <T> rx.subjects.UnicastSubject<T> create(int i, rx.functions.Action0 action0, boolean z) {
        return new rx.subjects.UnicastSubject<>(new rx.subjects.UnicastSubject.State(i, z, action0));
    }

    private UnicastSubject(rx.subjects.UnicastSubject.State<T> state) {
        super(state);
        this.getHighSpeedVideoFpsRanges = state;
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

    @Override // rx.subjects.Subject
    public final boolean hasObservers() {
        return this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration.get() != null;
    }

    static final class State<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer, rx.Observer<T>, rx.Observable.OnSubscribe<T>, rx.Subscription {
        private static final long serialVersionUID = -9044104859202255786L;
        volatile boolean Camera2StreamConfigurationMap;
        final boolean getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        boolean getHighSpeedVideoSizesFor;
        final java.util.Queue<java.lang.Object> getInputFormats;
        final java.util.concurrent.atomic.AtomicReference<rx.functions.Action0> getInputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicReference<rx.Subscriber<? super T>> getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>();

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            rx.Subscriber subscriber = (rx.Subscriber) obj;
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputMinFrameDuration, null, subscriber)) {
                subscriber.add(this);
                subscriber.setProducer(this);
            } else {
                subscriber.onError(new java.lang.IllegalStateException("Only a single subscriber is allowed"));
            }
        }

        public State(int i, boolean z, rx.functions.Action0 action0) {
            java.util.Queue<java.lang.Object> spscLinkedQueue;
            this.getInputSizeshNQ4ISI = action0 != null ? new java.util.concurrent.atomic.AtomicReference<>(action0) : null;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            if (i > 1) {
                spscLinkedQueue = rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable() ? new rx.internal.util.unsafe.SpscUnboundedArrayQueue<>(i) : new rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue<>(i);
            } else {
                spscLinkedQueue = rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable() ? new rx.internal.util.unsafe.SpscLinkedQueue<>() : new rx.internal.util.atomic.SpscLinkedAtomicQueue<>();
            }
            this.getInputFormats = spscLinkedQueue;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            boolean z;
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            if (!this.Camera2StreamConfigurationMap) {
                synchronized (this) {
                    if (this.Camera2StreamConfigurationMap) {
                        z = false;
                    } else {
                        this.getInputFormats.offer(rx.internal.operators.NotificationLite.next(t));
                        z = true;
                    }
                }
                if (z) {
                    Camera2StreamConfigurationMap();
                    return;
                }
            }
            rx.Subscriber<? super T> subscriber = this.getOutputMinFrameDuration.get();
            try {
                subscriber.onNext(t);
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, subscriber, t);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            boolean z;
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            getHighSpeedVideoFpsRangesFor();
            this.getHighSpeedVideoFpsRanges = th;
            this.getHighSpeedVideoSizes = true;
            if (!this.Camera2StreamConfigurationMap) {
                synchronized (this) {
                    z = this.Camera2StreamConfigurationMap;
                }
                if (!z) {
                    Camera2StreamConfigurationMap();
                    return;
                }
            }
            this.getOutputMinFrameDuration.get().onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            boolean z;
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            getHighSpeedVideoFpsRangesFor();
            this.getHighSpeedVideoSizes = true;
            if (!this.Camera2StreamConfigurationMap) {
                synchronized (this) {
                    z = this.Camera2StreamConfigurationMap;
                }
                if (!z) {
                    Camera2StreamConfigurationMap();
                    return;
                }
            }
            this.getOutputMinFrameDuration.get().onCompleted();
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("n >= 0 required");
            }
            if (j > 0) {
                rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j);
                Camera2StreamConfigurationMap();
            } else if (this.getHighSpeedVideoSizes) {
                Camera2StreamConfigurationMap();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x0080, code lost:
        
            if (r7 == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
        
            if (r0.isEmpty() == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0088, code lost:
        
            r15.Camera2StreamConfigurationMap = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008a, code lost:
        
            r15.getHighSpeedVideoFpsRangesFor = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void Camera2StreamConfigurationMap() {
            boolean z;
            synchronized (this) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    this.getHighSpeedVideoSizesFor = true;
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = true;
                java.util.Queue<java.lang.Object> queue = this.getInputFormats;
                boolean z2 = this.getHighResolutionOutputSizeshNQ4ISI;
                while (true) {
                    rx.Subscriber<? super T> subscriber = this.getOutputMinFrameDuration.get();
                    if (subscriber == null) {
                        z = false;
                    } else {
                        if (getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, queue.isEmpty(), z2, subscriber)) {
                            return;
                        }
                        long j = get();
                        z = j == Long.MAX_VALUE;
                        long j2 = 0;
                        while (j != 0) {
                            boolean z3 = this.getHighSpeedVideoSizes;
                            java.lang.Object poll = queue.poll();
                            boolean z4 = poll == null;
                            if (!getHighResolutionOutputSizeshNQ4ISI(z3, z4, z2, subscriber)) {
                                if (z4) {
                                    break;
                                }
                                a.d dVar = (java.lang.Object) rx.internal.operators.NotificationLite.getValue(poll);
                                try {
                                    subscriber.onNext(dVar);
                                    j--;
                                    j2++;
                                } catch (java.lang.Throwable th) {
                                    queue.clear();
                                    rx.exceptions.Exceptions.throwIfFatal(th);
                                    subscriber.onError(rx.exceptions.OnErrorThrowable.addValueAsLastCause(th, dVar));
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (!z && j2 != 0) {
                            addAndGet(-j2);
                        }
                    }
                    synchronized (this) {
                        if (!this.getHighSpeedVideoSizesFor) {
                            break;
                        } else {
                            this.getHighSpeedVideoSizesFor = false;
                        }
                    }
                }
            }
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            getHighSpeedVideoFpsRangesFor();
            this.getHighSpeedVideoSizes = true;
            synchronized (this) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = true;
                this.getInputFormats.clear();
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighSpeedVideoSizes;
        }

        private boolean getHighResolutionOutputSizeshNQ4ISI(boolean z, boolean z2, boolean z3, rx.Subscriber<? super T> subscriber) {
            if (subscriber.isUnsubscribed()) {
                this.getInputFormats.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
            if (th != null && !z3) {
                this.getInputFormats.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            if (th != null) {
                subscriber.onError(th);
            } else {
                subscriber.onCompleted();
            }
            return true;
        }

        private void getHighSpeedVideoFpsRangesFor() {
            rx.functions.Action0 action0;
            java.util.concurrent.atomic.AtomicReference<rx.functions.Action0> atomicReference = this.getInputSizeshNQ4ISI;
            if (atomicReference == null || (action0 = atomicReference.get()) == null || !androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, action0, null)) {
                return;
            }
            action0.call();
        }
    }
}

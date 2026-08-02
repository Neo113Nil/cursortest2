package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorSwitch<T> implements rx.Observable.Operator<T, rx.Observable<? extends T>> {
    final boolean getHighSpeedVideoFpsRangesFor;

    static final class Holder {
        static final rx.internal.operators.OperatorSwitch<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = new rx.internal.operators.OperatorSwitch<>(false);

        Holder() {
        }
    }

    static final class HolderDelayError {
        static final rx.internal.operators.OperatorSwitch<java.lang.Object> getHighSpeedVideoSizes = new rx.internal.operators.OperatorSwitch<>(true);

        HolderDelayError() {
        }
    }

    public static <T> rx.internal.operators.OperatorSwitch<T> instance(boolean z) {
        if (z) {
            return (rx.internal.operators.OperatorSwitch<T>) rx.internal.operators.OperatorSwitch.HolderDelayError.getHighSpeedVideoSizes;
        }
        return (rx.internal.operators.OperatorSwitch<T>) rx.internal.operators.OperatorSwitch.Holder.getHighResolutionOutputSizeshNQ4ISI;
    }

    OperatorSwitch(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super rx.Observable<? extends T>> call(rx.Subscriber<? super T> subscriber) {
        final rx.internal.operators.OperatorSwitch.SwitchSubscriber switchSubscriber = new rx.internal.operators.OperatorSwitch.SwitchSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor);
        subscriber.add(switchSubscriber);
        switchSubscriber.getHighSpeedVideoFpsRangesFor.add(switchSubscriber.getOutputMinFrameDurationlomOqCM);
        switchSubscriber.getHighSpeedVideoFpsRangesFor.add(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorSwitch.SwitchSubscriber.1
            @Override // rx.functions.Action0
            public void call() {
                rx.internal.operators.OperatorSwitch.SwitchSubscriber switchSubscriber2 = rx.internal.operators.OperatorSwitch.SwitchSubscriber.this;
                synchronized (switchSubscriber2) {
                    switchSubscriber2.getInputSizeshNQ4ISI = null;
                }
            }
        }));
        switchSubscriber.getHighSpeedVideoFpsRangesFor.setProducer(new rx.Producer() { // from class: rx.internal.operators.OperatorSwitch.SwitchSubscriber.2
            @Override // rx.Producer
            public void request(long j) {
                rx.Producer producer;
                if (j <= 0) {
                    if (j < 0) {
                        throw new java.lang.IllegalArgumentException("n >= 0 expected but it was ".concat(java.lang.String.valueOf(j)));
                    }
                    return;
                }
                rx.internal.operators.OperatorSwitch.SwitchSubscriber switchSubscriber2 = rx.internal.operators.OperatorSwitch.SwitchSubscriber.this;
                synchronized (switchSubscriber2) {
                    producer = switchSubscriber2.getInputSizeshNQ4ISI;
                    switchSubscriber2.getOutputSizeshNQ4ISI = rx.internal.operators.BackpressureUtils.addCap(switchSubscriber2.getOutputSizeshNQ4ISI, j);
                }
                if (producer != null) {
                    producer.request(j);
                }
                switchSubscriber2.Camera2StreamConfigurationMap();
            }
        });
        return switchSubscriber;
    }

    static final class SwitchSubscriber<T> extends rx.Subscriber<rx.Observable<? extends T>> {
        static final java.lang.Throwable Camera2StreamConfigurationMap = new java.lang.Throwable("Terminal error");
        final boolean getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final rx.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        java.lang.Throwable getHighSpeedVideoSizes;
        boolean getHighSpeedVideoSizesFor;
        volatile boolean getInputFormats;
        rx.Producer getInputSizeshNQ4ISI;
        boolean getOutputMinFrameDuration;
        long getOutputSizeshNQ4ISI;
        final rx.subscriptions.SerialSubscription getOutputMinFrameDurationlomOqCM = new rx.subscriptions.SerialSubscription();
        final java.util.concurrent.atomic.AtomicLong getOutputFormats = new java.util.concurrent.atomic.AtomicLong();
        final rx.internal.util.atomic.SpscLinkedArrayQueue<java.lang.Object> getOutputStallDuration = new rx.internal.util.atomic.SpscLinkedArrayQueue<>(rx.internal.util.RxRingBuffer.SIZE);

        @Override // rx.Observer
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            rx.internal.operators.OperatorSwitch.InnerSubscriber innerSubscriber;
            rx.Observable observable = (rx.Observable) obj;
            long incrementAndGet = this.getOutputFormats.incrementAndGet();
            rx.Subscription subscription = this.getOutputMinFrameDurationlomOqCM.get();
            if (subscription != null) {
                subscription.unsubscribe();
            }
            synchronized (this) {
                innerSubscriber = new rx.internal.operators.OperatorSwitch.InnerSubscriber(incrementAndGet, this);
                this.getOutputMinFrameDuration = true;
                this.getInputSizeshNQ4ISI = null;
            }
            this.getOutputMinFrameDurationlomOqCM.set(innerSubscriber);
            observable.unsafeSubscribe(innerSubscriber);
        }

        SwitchSubscriber(rx.Subscriber<? super T> subscriber, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            boolean highSpeedVideoSizes;
            synchronized (this) {
                highSpeedVideoSizes = getHighSpeedVideoSizes(th);
            }
            if (highSpeedVideoSizes) {
                this.getInputFormats = true;
                Camera2StreamConfigurationMap();
            } else {
                rx.plugins.RxJavaHooks.onError(th);
            }
        }

        final boolean getHighSpeedVideoSizes(java.lang.Throwable th) {
            java.lang.Throwable th2 = this.getHighSpeedVideoSizes;
            if (th2 == Camera2StreamConfigurationMap) {
                return false;
            }
            if (th2 == null) {
                this.getHighSpeedVideoSizes = th;
                return true;
            }
            if (th2 instanceof rx.exceptions.CompositeException) {
                java.util.ArrayList arrayList = new java.util.ArrayList(((rx.exceptions.CompositeException) th2).getExceptions());
                arrayList.add(th);
                this.getHighSpeedVideoSizes = new rx.exceptions.CompositeException(arrayList);
                return true;
            }
            this.getHighSpeedVideoSizes = new rx.exceptions.CompositeException(th2, th);
            return true;
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getInputFormats = true;
            Camera2StreamConfigurationMap();
        }

        static void getHighSpeedVideoFpsRangesFor(java.lang.Throwable th) {
            rx.plugins.RxJavaHooks.onError(th);
        }

        final void Camera2StreamConfigurationMap() {
            java.lang.Throwable th;
            java.lang.Throwable th2;
            synchronized (this) {
                if (this.getHighSpeedVideoFpsRanges) {
                    this.getHighSpeedVideoSizesFor = true;
                    return;
                }
                this.getHighSpeedVideoFpsRanges = true;
                boolean z = this.getOutputMinFrameDuration;
                long j = this.getOutputSizeshNQ4ISI;
                java.lang.Throwable th3 = this.getHighSpeedVideoSizes;
                if (th3 != null && th3 != (th2 = Camera2StreamConfigurationMap) && !this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighSpeedVideoSizes = th2;
                }
                rx.internal.util.atomic.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.getOutputStallDuration;
                java.util.concurrent.atomic.AtomicLong atomicLong = this.getOutputFormats;
                rx.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRangesFor;
                long j2 = j;
                java.lang.Throwable th4 = th3;
                boolean z2 = this.getInputFormats;
                while (true) {
                    long j3 = 0;
                    while (j3 != j2) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        boolean isEmpty = spscLinkedArrayQueue.isEmpty();
                        if (!getHighSpeedVideoFpsRanges(z2, z, th4, spscLinkedArrayQueue, subscriber, isEmpty)) {
                            if (isEmpty) {
                                break;
                            }
                            rx.internal.operators.OperatorSwitch.InnerSubscriber innerSubscriber = (rx.internal.operators.OperatorSwitch.InnerSubscriber) spscLinkedArrayQueue.poll();
                            amex.AMEXKernel aMEXKernel = (java.lang.Object) rx.internal.operators.NotificationLite.getValue(spscLinkedArrayQueue.poll());
                            if (atomicLong.get() == innerSubscriber.getHighResolutionOutputSizeshNQ4ISI) {
                                subscriber.onNext(aMEXKernel);
                                j3++;
                            }
                        } else {
                            return;
                        }
                    }
                    if (j3 == j2) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        if (getHighSpeedVideoFpsRanges(this.getInputFormats, z, th4, spscLinkedArrayQueue, subscriber, spscLinkedArrayQueue.isEmpty())) {
                            return;
                        }
                    }
                    synchronized (this) {
                        long j4 = this.getOutputSizeshNQ4ISI;
                        if (j4 != Long.MAX_VALUE) {
                            j4 -= j3;
                            this.getOutputSizeshNQ4ISI = j4;
                        }
                        j2 = j4;
                        if (!this.getHighSpeedVideoSizesFor) {
                            this.getHighSpeedVideoFpsRanges = false;
                            return;
                        }
                        this.getHighSpeedVideoSizesFor = false;
                        z2 = this.getInputFormats;
                        z = this.getOutputMinFrameDuration;
                        th4 = this.getHighSpeedVideoSizes;
                        if (th4 != null && th4 != (th = Camera2StreamConfigurationMap) && !this.getHighResolutionOutputSizeshNQ4ISI) {
                            this.getHighSpeedVideoSizes = th;
                        }
                    }
                }
            }
        }

        private boolean getHighSpeedVideoFpsRanges(boolean z, boolean z2, java.lang.Throwable th, rx.internal.util.atomic.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue, rx.Subscriber<? super T> subscriber, boolean z3) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (!z || z2 || !z3) {
                    return false;
                }
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onCompleted();
                }
                return true;
            }
            if (th != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z || z2 || !z3) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }
    }

    static final class InnerSubscriber<T> extends rx.Subscriber<T> {
        private final long getHighResolutionOutputSizeshNQ4ISI;
        private final rx.internal.operators.OperatorSwitch.SwitchSubscriber<T> getHighSpeedVideoFpsRangesFor;

        InnerSubscriber(long j, rx.internal.operators.OperatorSwitch.SwitchSubscriber<T> switchSubscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.getHighSpeedVideoFpsRangesFor = switchSubscriber;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            rx.internal.operators.OperatorSwitch.SwitchSubscriber<T> switchSubscriber = this.getHighSpeedVideoFpsRangesFor;
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            synchronized (switchSubscriber) {
                if (switchSubscriber.getOutputFormats.get() != j) {
                    return;
                }
                long j2 = switchSubscriber.getOutputSizeshNQ4ISI;
                switchSubscriber.getInputSizeshNQ4ISI = producer;
                producer.request(j2);
            }
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            rx.internal.operators.OperatorSwitch.SwitchSubscriber<T> switchSubscriber = this.getHighSpeedVideoFpsRangesFor;
            synchronized (switchSubscriber) {
                if (switchSubscriber.getOutputFormats.get() != this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                switchSubscriber.getOutputStallDuration.offer(this, rx.internal.operators.NotificationLite.next(t));
                switchSubscriber.Camera2StreamConfigurationMap();
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            boolean z;
            rx.internal.operators.OperatorSwitch.SwitchSubscriber<T> switchSubscriber = this.getHighSpeedVideoFpsRangesFor;
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            synchronized (switchSubscriber) {
                if (switchSubscriber.getOutputFormats.get() == j) {
                    z = switchSubscriber.getHighSpeedVideoSizes(th);
                    switchSubscriber.getOutputMinFrameDuration = false;
                    switchSubscriber.getInputSizeshNQ4ISI = null;
                } else {
                    z = true;
                }
            }
            if (z) {
                switchSubscriber.Camera2StreamConfigurationMap();
            } else {
                rx.internal.operators.OperatorSwitch.SwitchSubscriber.getHighSpeedVideoFpsRangesFor(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            rx.internal.operators.OperatorSwitch.SwitchSubscriber<T> switchSubscriber = this.getHighSpeedVideoFpsRangesFor;
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            synchronized (switchSubscriber) {
                if (switchSubscriber.getOutputFormats.get() != j) {
                    return;
                }
                switchSubscriber.getOutputMinFrameDuration = false;
                switchSubscriber.getInputSizeshNQ4ISI = null;
                switchSubscriber.Camera2StreamConfigurationMap();
            }
        }
    }
}

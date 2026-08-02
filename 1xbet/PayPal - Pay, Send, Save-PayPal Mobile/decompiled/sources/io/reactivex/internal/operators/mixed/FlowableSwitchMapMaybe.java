package io.reactivex.internal.operators.mixed;

/* loaded from: classes3.dex */
public final class FlowableSwitchMapMaybe<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.Flowable<T> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRangesFor;

    public FlowableSwitchMapMaybe(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, boolean z) {
        this.Camera2StreamConfigurationMap = flowable;
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.Camera2StreamConfigurationMap.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class SwitchMapMaybeSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        static final io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<java.lang.Object> getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        final boolean Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super R> getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getHighSpeedVideoSizesFor;
        long getInputFormats;
        org.reactivestreams.Subscription getOutputStallDurationlomOqCM;
        final io.reactivex.internal.util.AtomicThrowable getOutputFormats = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicLong getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R>> getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>();

        SwitchMapMaybeSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getHighSpeedVideoSizesFor = function;
            this.Camera2StreamConfigurationMap = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputStallDurationlomOqCM, subscription)) {
                this.getOutputStallDurationlomOqCM = subscription;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R> switchMapMaybeObserver;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = this.getOutputMinFrameDuration.get();
            if (switchMapMaybeObserver2 != null) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapMaybeObserver2);
            }
            try {
                io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizesFor.apply(t), "The mapper returned a null MaybeSource");
                io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver switchMapMaybeObserver3 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver(this);
                do {
                    switchMapMaybeObserver = this.getOutputMinFrameDuration.get();
                    if (switchMapMaybeObserver == getHighSpeedVideoFpsRangesFor) {
                        return;
                    }
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputMinFrameDuration, switchMapMaybeObserver, switchMapMaybeObserver3));
                maybeSource.subscribe(switchMapMaybeObserver3);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getOutputStallDurationlomOqCM.cancel();
                this.getOutputMinFrameDuration.getAndSet(getHighSpeedVideoFpsRangesFor);
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputFormats.addThrowable(th)) {
                if (!this.Camera2StreamConfigurationMap) {
                    Camera2StreamConfigurationMap();
                }
                this.getHighSpeedVideoSizes = true;
                getHighSpeedVideoFpsRanges();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizes = true;
            getHighSpeedVideoFpsRanges();
        }

        final void Camera2StreamConfigurationMap() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R>> atomicReference = this.getOutputMinFrameDuration;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<java.lang.Object> switchMapMaybeObserver = getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<java.lang.Object> switchMapMaybeObserver2 = (io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 == null || switchMapMaybeObserver2 == switchMapMaybeObserver) {
                return;
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapMaybeObserver2);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.util.BackpressureHelper.add(this.getInputSizeshNQ4ISI, j);
            getHighSpeedVideoFpsRanges();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges = true;
            this.getOutputStallDurationlomOqCM.cancel();
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R>> atomicReference = this.getOutputMinFrameDuration;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<java.lang.Object> switchMapMaybeObserver = getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<java.lang.Object> switchMapMaybeObserver2 = (io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 == null || switchMapMaybeObserver2 == switchMapMaybeObserver) {
                return;
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapMaybeObserver2);
        }

        final void getHighSpeedVideoFpsRanges() {
            if (getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super R> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getOutputFormats;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R>> atomicReference = this.getOutputMinFrameDuration;
                java.util.concurrent.atomic.AtomicLong atomicLong = this.getInputSizeshNQ4ISI;
                long j = this.getInputFormats;
                int i = 1;
                while (!this.getHighSpeedVideoFpsRanges) {
                    if (atomicThrowable.get() != null && !this.Camera2StreamConfigurationMap) {
                        subscriber.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z = this.getHighSpeedVideoSizes;
                    io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
                    boolean z2 = switchMapMaybeObserver == null;
                    if (z && z2) {
                        java.lang.Throwable terminate = atomicThrowable.terminate();
                        if (terminate != null) {
                            subscriber.onError(terminate);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (!z2 && switchMapMaybeObserver.getHighSpeedVideoSizes != null && j != atomicLong.get()) {
                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapMaybeObserver, null);
                        subscriber.onNext(switchMapMaybeObserver.getHighSpeedVideoSizes);
                        j++;
                    } else {
                        this.getInputFormats = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
            }
        }

        static final class SwitchMapMaybeObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            final io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber<?, R> getHighSpeedVideoFpsRangesFor;
            volatile R getHighSpeedVideoSizes;

            SwitchMapMaybeObserver(io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber<?, R> switchMapMaybeSubscriber) {
                this.getHighSpeedVideoFpsRangesFor = switchMapMaybeSubscriber;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(R r) {
                this.getHighSpeedVideoSizes = r;
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber<?, R> switchMapMaybeSubscriber = this.getHighSpeedVideoFpsRangesFor;
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapMaybeSubscriber.getOutputMinFrameDuration, this, null) && switchMapMaybeSubscriber.getOutputFormats.addThrowable(th)) {
                    if (!switchMapMaybeSubscriber.Camera2StreamConfigurationMap) {
                        switchMapMaybeSubscriber.getOutputStallDurationlomOqCM.cancel();
                        switchMapMaybeSubscriber.Camera2StreamConfigurationMap();
                    }
                    switchMapMaybeSubscriber.getHighSpeedVideoFpsRanges();
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber<?, R> switchMapMaybeSubscriber = this.getHighSpeedVideoFpsRangesFor;
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapMaybeSubscriber.getOutputMinFrameDuration, this, null)) {
                    switchMapMaybeSubscriber.getHighSpeedVideoFpsRanges();
                }
            }
        }
    }
}

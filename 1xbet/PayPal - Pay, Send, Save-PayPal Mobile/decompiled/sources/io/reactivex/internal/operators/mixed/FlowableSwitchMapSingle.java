package io.reactivex.internal.operators.mixed;

/* loaded from: classes3.dex */
public final class FlowableSwitchMapSingle<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.Flowable<T> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoSizes;

    public FlowableSwitchMapSingle(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, boolean z) {
        this.Camera2StreamConfigurationMap = flowable;
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.Camera2StreamConfigurationMap.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class SwitchMapSingleSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        static final io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<java.lang.Object> getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        final org.reactivestreams.Subscriber<? super R> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getInputFormats;
        long getOutputFormats;
        org.reactivestreams.Subscription getOutputMinFrameDurationlomOqCM;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizesFor = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicLong getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R>> getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>();

        SwitchMapSingleSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, boolean z) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getInputFormats = function;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputMinFrameDurationlomOqCM, subscription)) {
                this.getOutputMinFrameDurationlomOqCM = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R> switchMapSingleObserver;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.getOutputMinFrameDuration.get();
            if (switchMapSingleObserver2 != null) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapSingleObserver2);
            }
            try {
                io.reactivex.SingleSource singleSource = (io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputFormats.apply(t), "The mapper returned a null SingleSource");
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver switchMapSingleObserver3 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver(this);
                do {
                    switchMapSingleObserver = this.getOutputMinFrameDuration.get();
                    if (switchMapSingleObserver == getHighSpeedVideoFpsRangesFor) {
                        return;
                    }
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputMinFrameDuration, switchMapSingleObserver, switchMapSingleObserver3));
                singleSource.subscribe(switchMapSingleObserver3);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getOutputMinFrameDurationlomOqCM.cancel();
                this.getOutputMinFrameDuration.getAndSet(getHighSpeedVideoFpsRangesFor);
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizesFor.addThrowable(th)) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    getHighResolutionOutputSizeshNQ4ISI();
                }
                this.getHighSpeedVideoSizes = true;
                Camera2StreamConfigurationMap();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizes = true;
            Camera2StreamConfigurationMap();
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R>> atomicReference = this.getOutputMinFrameDuration;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<java.lang.Object> switchMapSingleObserver = getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<java.lang.Object> switchMapSingleObserver2 = (io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapSingleObserver2);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.util.BackpressureHelper.add(this.getInputSizeshNQ4ISI, j);
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getOutputMinFrameDurationlomOqCM.cancel();
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R>> atomicReference = this.getOutputMinFrameDuration;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<java.lang.Object> switchMapSingleObserver = getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<java.lang.Object> switchMapSingleObserver2 = (io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapSingleObserver2);
        }

        final void Camera2StreamConfigurationMap() {
            if (getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super R> subscriber = this.Camera2StreamConfigurationMap;
                io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getHighSpeedVideoSizesFor;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R>> atomicReference = this.getOutputMinFrameDuration;
                java.util.concurrent.atomic.AtomicLong atomicLong = this.getInputSizeshNQ4ISI;
                long j = this.getOutputFormats;
                int i = 1;
                while (!this.getHighResolutionOutputSizeshNQ4ISI) {
                    if (atomicThrowable.get() != null && !this.getHighSpeedVideoFpsRanges) {
                        subscriber.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z = this.getHighSpeedVideoSizes;
                    io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                    boolean z2 = switchMapSingleObserver == null;
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
                    if (!z2 && switchMapSingleObserver.getHighSpeedVideoFpsRanges != null && j != atomicLong.get()) {
                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapSingleObserver, null);
                        subscriber.onNext(switchMapSingleObserver.getHighSpeedVideoFpsRanges);
                        j++;
                    } else {
                        this.getOutputFormats = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
            }
        }

        static final class SwitchMapSingleObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            final io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber<?, R> Camera2StreamConfigurationMap;
            volatile R getHighSpeedVideoFpsRanges;

            SwitchMapSingleObserver(io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber) {
                this.Camera2StreamConfigurationMap = switchMapSingleSubscriber;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r) {
                this.getHighSpeedVideoFpsRanges = r;
                this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap();
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber = this.Camera2StreamConfigurationMap;
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapSingleSubscriber.getOutputMinFrameDuration, this, null) && switchMapSingleSubscriber.getHighSpeedVideoSizesFor.addThrowable(th)) {
                    if (!switchMapSingleSubscriber.getHighSpeedVideoFpsRanges) {
                        switchMapSingleSubscriber.getOutputMinFrameDurationlomOqCM.cancel();
                        switchMapSingleSubscriber.getHighResolutionOutputSizeshNQ4ISI();
                    }
                    switchMapSingleSubscriber.Camera2StreamConfigurationMap();
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}

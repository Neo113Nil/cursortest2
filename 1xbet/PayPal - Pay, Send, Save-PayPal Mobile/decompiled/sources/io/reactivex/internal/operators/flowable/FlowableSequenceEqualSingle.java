package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableSequenceEqualSingle<T> extends io.reactivex.Single<java.lang.Boolean> implements io.reactivex.internal.fuseable.FuseToFlowable<java.lang.Boolean> {
    final int getHighResolutionOutputSizeshNQ4ISI;
    final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoFpsRanges;
    final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.BiPredicate<? super T, ? super T> getHighSpeedVideoSizes;

    public FlowableSequenceEqualSingle(org.reactivestreams.Publisher<? extends T> publisher, org.reactivestreams.Publisher<? extends T> publisher2, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.getHighSpeedVideoFpsRangesFor = publisher;
        this.getHighSpeedVideoFpsRanges = publisher2;
        this.getHighSpeedVideoSizes = biPredicate;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle.EqualCoordinator equalCoordinator = new io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle.EqualCoordinator(singleObserver, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        singleObserver.onSubscribe(equalCoordinator);
        org.reactivestreams.Publisher<? extends T> publisher = this.getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Publisher<? extends T> publisher2 = this.getHighSpeedVideoFpsRanges;
        publisher.subscribe(equalCoordinator.Camera2StreamConfigurationMap);
        publisher2.subscribe(equalCoordinator.getHighSpeedVideoFpsRangesFor);
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final io.reactivex.Flowable<java.lang.Boolean> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableSequenceEqual(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class EqualCoordinator<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper {
        private static final long serialVersionUID = -6178010334400373240L;
        final io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<T> Camera2StreamConfigurationMap;
        final io.reactivex.internal.util.AtomicThrowable getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.SingleObserver<? super java.lang.Boolean> getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<T> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.BiPredicate<? super T, ? super T> getHighSpeedVideoSizes;
        T getHighSpeedVideoSizesFor;
        T getInputFormats;

        EqualCoordinator(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver, int i, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate) {
            this.getHighSpeedVideoFpsRanges = singleObserver;
            this.getHighSpeedVideoSizes = biPredicate;
            this.Camera2StreamConfigurationMap = new io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<>(this, i);
            this.getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<>(this, i);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.Camera2StreamConfigurationMap);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRangesFor);
            if (getAndIncrement() == 0) {
                io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
                if (simpleQueue != null) {
                    simpleQueue.clear();
                }
                io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue2 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                if (simpleQueue2 != null) {
                    simpleQueue2.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(this.Camera2StreamConfigurationMap.get());
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.Camera2StreamConfigurationMap);
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRangesFor);
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue2 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
            if (simpleQueue2 != null) {
                simpleQueue2.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public final void getHighSpeedVideoFpsRanges() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
                    io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue2 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                    if (simpleQueue != null && simpleQueue2 != null) {
                        while (!isDisposed()) {
                            if (this.getHighResolutionOutputSizeshNQ4ISI.get() != null) {
                                getHighResolutionOutputSizeshNQ4ISI();
                                this.getHighSpeedVideoFpsRanges.onError(this.getHighResolutionOutputSizeshNQ4ISI.terminate());
                                return;
                            }
                            boolean z = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
                            T t = this.getHighSpeedVideoSizesFor;
                            if (t == null) {
                                try {
                                    t = simpleQueue.poll();
                                    this.getHighSpeedVideoSizesFor = t;
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    getHighResolutionOutputSizeshNQ4ISI();
                                    this.getHighResolutionOutputSizeshNQ4ISI.addThrowable(th);
                                    this.getHighSpeedVideoFpsRanges.onError(this.getHighResolutionOutputSizeshNQ4ISI.terminate());
                                    return;
                                }
                            }
                            boolean z2 = t == null;
                            boolean z3 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                            T t2 = this.getInputFormats;
                            if (t2 == null) {
                                try {
                                    t2 = simpleQueue2.poll();
                                    this.getInputFormats = t2;
                                } catch (java.lang.Throwable th2) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                    getHighResolutionOutputSizeshNQ4ISI();
                                    this.getHighResolutionOutputSizeshNQ4ISI.addThrowable(th2);
                                    this.getHighSpeedVideoFpsRanges.onError(this.getHighResolutionOutputSizeshNQ4ISI.terminate());
                                    return;
                                }
                            }
                            boolean z4 = t2 == null;
                            if (z && z3 && z2 && z4) {
                                this.getHighSpeedVideoFpsRanges.onSuccess(java.lang.Boolean.TRUE);
                                return;
                            }
                            if (z && z3 && z2 != z4) {
                                getHighResolutionOutputSizeshNQ4ISI();
                                this.getHighSpeedVideoFpsRanges.onSuccess(java.lang.Boolean.FALSE);
                                return;
                            }
                            if (!z2 && !z4) {
                                try {
                                    if (!this.getHighSpeedVideoSizes.test(t, t2)) {
                                        getHighResolutionOutputSizeshNQ4ISI();
                                        this.getHighSpeedVideoFpsRanges.onSuccess(java.lang.Boolean.FALSE);
                                        return;
                                    } else {
                                        this.getHighSpeedVideoSizesFor = null;
                                        this.getInputFormats = null;
                                        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
                                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges();
                                    }
                                } catch (java.lang.Throwable th3) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                    getHighResolutionOutputSizeshNQ4ISI();
                                    this.getHighResolutionOutputSizeshNQ4ISI.addThrowable(th3);
                                    this.getHighSpeedVideoFpsRanges.onError(this.getHighResolutionOutputSizeshNQ4ISI.terminate());
                                    return;
                                }
                            }
                        }
                        io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue3 = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
                        if (simpleQueue3 != null) {
                            simpleQueue3.clear();
                        }
                        io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue4 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                        if (simpleQueue4 != null) {
                            simpleQueue4.clear();
                            return;
                        }
                        return;
                    }
                    if (!isDisposed()) {
                        if (this.getHighResolutionOutputSizeshNQ4ISI.get() != null) {
                            getHighResolutionOutputSizeshNQ4ISI();
                            this.getHighSpeedVideoFpsRanges.onError(this.getHighResolutionOutputSizeshNQ4ISI.terminate());
                            return;
                        }
                    } else {
                        io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue5 = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
                        if (simpleQueue5 != null) {
                            simpleQueue5.clear();
                        }
                        io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue6 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                        if (simpleQueue6 != null) {
                            simpleQueue6.clear();
                            return;
                        }
                        return;
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.addThrowable(th)) {
                getHighSpeedVideoFpsRanges();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}

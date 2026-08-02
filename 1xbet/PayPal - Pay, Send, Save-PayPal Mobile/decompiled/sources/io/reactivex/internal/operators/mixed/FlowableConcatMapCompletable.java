package io.reactivex.internal.operators.mixed;

/* loaded from: classes3.dex */
public final class FlowableConcatMapCompletable<T> extends io.reactivex.Completable {
    final io.reactivex.Flowable<T> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.internal.util.ErrorMode getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    public FlowableConcatMapCompletable(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, io.reactivex.internal.util.ErrorMode errorMode, int i) {
        this.Camera2StreamConfigurationMap = flowable;
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.getHighSpeedVideoFpsRangesFor = errorMode;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.Camera2StreamConfigurationMap.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable.ConcatMapCompletableObserver(completableObserver, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class ConcatMapCompletableObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getInputFormats;
        final io.reactivex.internal.util.ErrorMode getInputSizeshNQ4ISI;
        final int getOutputMinFrameDuration;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> getOutputMinFrameDurationlomOqCM;
        org.reactivestreams.Subscription getOutputSizeshNQ4ISI;
        final io.reactivex.internal.util.AtomicThrowable getOutputFormats = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable.ConcatMapCompletableObserver.ConcatMapInnerObserver getHighSpeedVideoSizesFor = new io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable.ConcatMapCompletableObserver.ConcatMapInnerObserver(this);

        ConcatMapCompletableObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, io.reactivex.internal.util.ErrorMode errorMode, int i) {
            this.getHighSpeedVideoFpsRangesFor = completableObserver;
            this.getInputFormats = function;
            this.getInputSizeshNQ4ISI = errorMode;
            this.getOutputMinFrameDuration = i;
            this.getOutputMinFrameDurationlomOqCM = new io.reactivex.internal.queue.SpscArrayQueue(i);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputSizeshNQ4ISI, subscription)) {
                this.getOutputSizeshNQ4ISI = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                subscription.request(this.getOutputMinFrameDuration);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getOutputMinFrameDurationlomOqCM.offer(t)) {
                getHighSpeedVideoFpsRangesFor();
            } else {
                this.getOutputSizeshNQ4ISI.cancel();
                onError(new io.reactivex.exceptions.MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputFormats.addThrowable(th)) {
                if (this.getInputSizeshNQ4ISI != io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                    this.Camera2StreamConfigurationMap = true;
                    getHighSpeedVideoFpsRangesFor();
                    return;
                }
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizesFor);
                java.lang.Throwable terminate = this.getOutputFormats.terminate();
                if (terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                    this.getHighSpeedVideoFpsRangesFor.onError(terminate);
                }
                if (getAndIncrement() == 0) {
                    this.getOutputMinFrameDurationlomOqCM.clear();
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = true;
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges = true;
            this.getOutputSizeshNQ4ISI.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizesFor);
            if (getAndIncrement() == 0) {
                this.getOutputMinFrameDurationlomOqCM.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges;
        }

        final void getHighSpeedVideoFpsRangesFor() {
            if (getAndIncrement() == 0) {
                while (!this.getHighSpeedVideoFpsRanges) {
                    if (!this.getHighSpeedVideoSizes) {
                        if (this.getInputSizeshNQ4ISI == io.reactivex.internal.util.ErrorMode.BOUNDARY && this.getOutputFormats.get() != null) {
                            this.getOutputMinFrameDurationlomOqCM.clear();
                            this.getHighSpeedVideoFpsRangesFor.onError(this.getOutputFormats.terminate());
                            return;
                        }
                        boolean z = this.Camera2StreamConfigurationMap;
                        T poll = this.getOutputMinFrameDurationlomOqCM.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            java.lang.Throwable terminate = this.getOutputFormats.terminate();
                            if (terminate != null) {
                                this.getHighSpeedVideoFpsRangesFor.onError(terminate);
                                return;
                            } else {
                                this.getHighSpeedVideoFpsRangesFor.onComplete();
                                return;
                            }
                        }
                        if (!z2) {
                            int i = this.getOutputMinFrameDuration;
                            int i2 = i - (i >> 1);
                            int i3 = this.getHighResolutionOutputSizeshNQ4ISI + 1;
                            if (i3 == i2) {
                                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                                this.getOutputSizeshNQ4ISI.request(i2);
                            } else {
                                this.getHighResolutionOutputSizeshNQ4ISI = i3;
                            }
                            try {
                                io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputFormats.apply(poll), "The mapper returned a null CompletableSource");
                                this.getHighSpeedVideoSizes = true;
                                completableSource.subscribe(this.getHighSpeedVideoSizesFor);
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                this.getOutputMinFrameDurationlomOqCM.clear();
                                this.getOutputSizeshNQ4ISI.cancel();
                                this.getOutputFormats.addThrowable(th);
                                this.getHighSpeedVideoFpsRangesFor.onError(this.getOutputFormats.terminate());
                                return;
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.getOutputMinFrameDurationlomOqCM.clear();
            }
        }

        static final class ConcatMapInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = 5638352172918776687L;
            final io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable.ConcatMapCompletableObserver<?> getHighResolutionOutputSizeshNQ4ISI;

            ConcatMapInnerObserver(io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable.ConcatMapCompletableObserver<?> concatMapCompletableObserver) {
                this.getHighResolutionOutputSizeshNQ4ISI = concatMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable.ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.getHighResolutionOutputSizeshNQ4ISI;
                if (concatMapCompletableObserver.getOutputFormats.addThrowable(th)) {
                    if (concatMapCompletableObserver.getInputSizeshNQ4ISI == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                        concatMapCompletableObserver.getOutputSizeshNQ4ISI.cancel();
                        java.lang.Throwable terminate = concatMapCompletableObserver.getOutputFormats.terminate();
                        if (terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                            concatMapCompletableObserver.getHighSpeedVideoFpsRangesFor.onError(terminate);
                        }
                        if (concatMapCompletableObserver.getAndIncrement() == 0) {
                            concatMapCompletableObserver.getOutputMinFrameDurationlomOqCM.clear();
                            return;
                        }
                        return;
                    }
                    concatMapCompletableObserver.getHighSpeedVideoSizes = false;
                    concatMapCompletableObserver.getHighSpeedVideoFpsRangesFor();
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable.ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.getHighResolutionOutputSizeshNQ4ISI;
                concatMapCompletableObserver.getHighSpeedVideoSizes = false;
                concatMapCompletableObserver.getHighSpeedVideoFpsRangesFor();
            }
        }
    }
}

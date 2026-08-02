package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableConcat extends io.reactivex.Completable {
    final int getHighSpeedVideoFpsRanges;
    final org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> getHighSpeedVideoSizes;

    public CompletableConcat(org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> publisher, int i) {
        this.getHighSpeedVideoSizes = publisher;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.completable.CompletableConcat.CompletableConcatSubscriber(completableObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class CompletableConcatSubscriber extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<io.reactivex.CompletableSource>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 9032184911934499404L;
        int Camera2StreamConfigurationMap;
        final io.reactivex.CompletableObserver getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final io.reactivex.internal.operators.completable.CompletableConcat.CompletableConcatSubscriber.ConcatInnerObserver getHighSpeedVideoSizes = new io.reactivex.internal.operators.completable.CompletableConcat.CompletableConcatSubscriber.ConcatInnerObserver(this);
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicBoolean();
        final int getInputFormats;
        final int getInputSizeshNQ4ISI;
        org.reactivestreams.Subscription getOutputFormats;
        io.reactivex.internal.fuseable.SimpleQueue<io.reactivex.CompletableSource> getOutputMinFrameDuration;
        int getOutputSizeshNQ4ISI;

        @Override // org.reactivestreams.Subscriber
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) obj;
            if (this.getOutputSizeshNQ4ISI == 0 && !this.getOutputMinFrameDuration.offer(completableSource)) {
                onError(new io.reactivex.exceptions.MissingBackpressureException());
            } else {
                getHighSpeedVideoSizes();
            }
        }

        CompletableConcatSubscriber(io.reactivex.CompletableObserver completableObserver, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = completableObserver;
            this.getInputSizeshNQ4ISI = i;
            this.getInputFormats = i - (i >> 2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputFormats, subscription)) {
                this.getOutputFormats = subscription;
                int i = this.getInputSizeshNQ4ISI;
                long j = i == Integer.MAX_VALUE ? Long.MAX_VALUE : i;
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.getOutputSizeshNQ4ISI = requestFusion;
                        this.getOutputMinFrameDuration = queueSubscription;
                        this.getHighSpeedVideoFpsRangesFor = true;
                        this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                        getHighSpeedVideoSizes();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getOutputSizeshNQ4ISI = requestFusion;
                        this.getOutputMinFrameDuration = queueSubscription;
                        this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                        subscription.request(j);
                        return;
                    }
                }
                if (this.getInputSizeshNQ4ISI == Integer.MAX_VALUE) {
                    this.getOutputMinFrameDuration = new io.reactivex.internal.queue.SpscLinkedArrayQueue(io.reactivex.Flowable.bufferSize());
                } else {
                    this.getOutputMinFrameDuration = new io.reactivex.internal.queue.SpscArrayQueue(this.getInputSizeshNQ4ISI);
                }
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                subscription.request(j);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizesFor.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizes);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor = true;
            getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getOutputFormats.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizes);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoSizes.get());
        }

        final void getHighSpeedVideoSizes() {
            if (getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.getHighSpeedVideoFpsRanges) {
                        boolean z = this.getHighSpeedVideoFpsRangesFor;
                        try {
                            io.reactivex.CompletableSource poll = this.getOutputMinFrameDuration.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                if (this.getHighSpeedVideoSizesFor.compareAndSet(false, true)) {
                                    this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
                                    return;
                                }
                                return;
                            } else if (!z2) {
                                this.getHighSpeedVideoFpsRanges = true;
                                poll.subscribe(this.getHighSpeedVideoSizes);
                                if (this.getOutputSizeshNQ4ISI != 1) {
                                    int i = this.Camera2StreamConfigurationMap + 1;
                                    if (i == this.getInputFormats) {
                                        this.Camera2StreamConfigurationMap = 0;
                                        this.getOutputFormats.request(i);
                                    } else {
                                        this.Camera2StreamConfigurationMap = i;
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            getHighResolutionOutputSizeshNQ4ISI(th);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizesFor.compareAndSet(false, true)) {
                this.getOutputFormats.cancel();
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        static final class ConcatInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = -5454794857847146511L;
            final io.reactivex.internal.operators.completable.CompletableConcat.CompletableConcatSubscriber getHighResolutionOutputSizeshNQ4ISI;

            ConcatInnerObserver(io.reactivex.internal.operators.completable.CompletableConcat.CompletableConcatSubscriber completableConcatSubscriber) {
                this.getHighResolutionOutputSizeshNQ4ISI = completableConcatSubscriber;
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(th);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.completable.CompletableConcat.CompletableConcatSubscriber completableConcatSubscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                completableConcatSubscriber.getHighSpeedVideoFpsRanges = false;
                completableConcatSubscriber.getHighSpeedVideoSizes();
            }
        }
    }
}

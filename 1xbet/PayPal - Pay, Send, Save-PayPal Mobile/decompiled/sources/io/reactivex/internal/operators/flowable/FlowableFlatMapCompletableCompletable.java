package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableFlatMapCompletableCompletable<T> extends io.reactivex.Completable implements io.reactivex.internal.fuseable.FuseToFlowable<T> {
    final io.reactivex.Flowable<T> getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getHighSpeedVideoSizes;

    public FlowableFlatMapCompletableCompletable(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = flowable;
        this.getHighSpeedVideoSizes = function;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable.FlatMapCompletableMainSubscriber(completableObserver, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges));
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final io.reactivex.Flowable<T> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapCompletableMainSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getHighSpeedVideoFpsRanges;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizesFor;
        final int getInputSizeshNQ4ISI;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizes = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.disposables.CompositeDisposable getOutputFormats = new io.reactivex.disposables.CompositeDisposable();

        FlatMapCompletableMainSubscriber(io.reactivex.CompletableObserver completableObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z, int i) {
            this.getHighSpeedVideoFpsRangesFor = completableObserver;
            this.getHighSpeedVideoFpsRanges = function;
            this.Camera2StreamConfigurationMap = z;
            this.getInputSizeshNQ4ISI = i;
            lazySet(1);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizesFor, subscription)) {
                this.getHighSpeedVideoSizesFor = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                int i = this.getInputSizeshNQ4ISI;
                if (i == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            try {
                io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable.FlatMapCompletableMainSubscriber.InnerObserver innerObserver = new io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable.FlatMapCompletableMainSubscriber.InnerObserver();
                if (this.getHighResolutionOutputSizeshNQ4ISI || !this.getOutputFormats.add(innerObserver)) {
                    return;
                }
                completableSource.subscribe(innerObserver);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizesFor.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes.addThrowable(th)) {
                if (this.Camera2StreamConfigurationMap) {
                    if (decrementAndGet() == 0) {
                        this.getHighSpeedVideoFpsRangesFor.onError(this.getHighSpeedVideoSizes.terminate());
                        return;
                    } else {
                        if (this.getInputSizeshNQ4ISI != Integer.MAX_VALUE) {
                            this.getHighSpeedVideoSizesFor.request(1L);
                            return;
                        }
                        return;
                    }
                }
                dispose();
                if (getAndSet(0) > 0) {
                    this.getHighSpeedVideoFpsRangesFor.onError(this.getHighSpeedVideoSizes.terminate());
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                java.lang.Throwable terminate = this.getHighSpeedVideoSizes.terminate();
                if (terminate != null) {
                    this.getHighSpeedVideoFpsRangesFor.onError(terminate);
                    return;
                } else {
                    this.getHighSpeedVideoFpsRangesFor.onComplete();
                    return;
                }
            }
            if (this.getInputSizeshNQ4ISI != Integer.MAX_VALUE) {
                this.getHighSpeedVideoSizesFor.request(1L);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizesFor.cancel();
            this.getOutputFormats.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getOutputFormats.isDisposed();
        }

        final class InnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerObserver() {
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable.FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable.FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.getOutputFormats.delete(this);
                flatMapCompletableMainSubscriber.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable.FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable.FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.getOutputFormats.delete(this);
                flatMapCompletableMainSubscriber.onError(th);
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
            }
        }
    }
}

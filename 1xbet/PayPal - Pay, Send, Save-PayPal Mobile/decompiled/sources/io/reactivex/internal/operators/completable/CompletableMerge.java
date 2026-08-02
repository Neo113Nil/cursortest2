package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableMerge extends io.reactivex.Completable {
    final boolean Camera2StreamConfigurationMap;
    final int getHighSpeedVideoFpsRangesFor;
    final org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> getHighSpeedVideoSizes;

    public CompletableMerge(org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> publisher, int i, boolean z) {
        this.getHighSpeedVideoSizes = publisher;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber(completableObserver, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class CompletableMergeSubscriber extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<io.reactivex.CompletableSource>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2108443387387077490L;
        final int getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRanges;
        final boolean getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;
        final io.reactivex.disposables.CompositeDisposable getOutputFormats = new io.reactivex.disposables.CompositeDisposable();
        final io.reactivex.internal.util.AtomicThrowable Camera2StreamConfigurationMap = new io.reactivex.internal.util.AtomicThrowable();

        @Override // org.reactivestreams.Subscriber
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            getAndIncrement();
            io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber.MergeInnerObserver mergeInnerObserver = new io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber.MergeInnerObserver();
            this.getOutputFormats.add(mergeInnerObserver);
            ((io.reactivex.CompletableSource) obj).subscribe(mergeInnerObserver);
        }

        CompletableMergeSubscriber(io.reactivex.CompletableObserver completableObserver, int i, boolean z) {
            this.getHighSpeedVideoFpsRanges = completableObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRangesFor = z;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes.cancel();
            this.getOutputFormats.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getOutputFormats.isDisposed();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizes, subscription)) {
                this.getHighSpeedVideoSizes = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (!this.getHighSpeedVideoFpsRangesFor) {
                this.getOutputFormats.dispose();
                if (this.Camera2StreamConfigurationMap.addThrowable(th)) {
                    if (getAndSet(0) > 0) {
                        this.getHighSpeedVideoFpsRanges.onError(this.Camera2StreamConfigurationMap.terminate());
                        return;
                    }
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            if (this.Camera2StreamConfigurationMap.addThrowable(th)) {
                if (decrementAndGet() == 0) {
                    this.getHighSpeedVideoFpsRanges.onError(this.Camera2StreamConfigurationMap.terminate());
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                if (this.Camera2StreamConfigurationMap.get() != null) {
                    this.getHighSpeedVideoFpsRanges.onError(this.Camera2StreamConfigurationMap.terminate());
                } else {
                    this.getHighSpeedVideoFpsRanges.onComplete();
                }
            }
        }

        final class MergeInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = 251330541679988317L;

            MergeInnerObserver() {
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber completableMergeSubscriber = io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber.this;
                completableMergeSubscriber.getOutputFormats.delete(this);
                if (!completableMergeSubscriber.getHighSpeedVideoFpsRangesFor) {
                    completableMergeSubscriber.getHighSpeedVideoSizes.cancel();
                    completableMergeSubscriber.getOutputFormats.dispose();
                    if (completableMergeSubscriber.Camera2StreamConfigurationMap.addThrowable(th)) {
                        if (completableMergeSubscriber.getAndSet(0) > 0) {
                            completableMergeSubscriber.getHighSpeedVideoFpsRanges.onError(completableMergeSubscriber.Camera2StreamConfigurationMap.terminate());
                            return;
                        }
                        return;
                    }
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                    return;
                }
                if (completableMergeSubscriber.Camera2StreamConfigurationMap.addThrowable(th)) {
                    if (completableMergeSubscriber.decrementAndGet() == 0) {
                        completableMergeSubscriber.getHighSpeedVideoFpsRanges.onError(completableMergeSubscriber.Camera2StreamConfigurationMap.terminate());
                        return;
                    } else {
                        if (completableMergeSubscriber.getHighResolutionOutputSizeshNQ4ISI != Integer.MAX_VALUE) {
                            completableMergeSubscriber.getHighSpeedVideoSizes.request(1L);
                            return;
                        }
                        return;
                    }
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber completableMergeSubscriber = io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber.this;
                completableMergeSubscriber.getOutputFormats.delete(this);
                if (completableMergeSubscriber.decrementAndGet() == 0) {
                    java.lang.Throwable th = completableMergeSubscriber.Camera2StreamConfigurationMap.get();
                    if (th != null) {
                        completableMergeSubscriber.getHighSpeedVideoFpsRanges.onError(th);
                        return;
                    } else {
                        completableMergeSubscriber.getHighSpeedVideoFpsRanges.onComplete();
                        return;
                    }
                }
                if (completableMergeSubscriber.getHighResolutionOutputSizeshNQ4ISI != Integer.MAX_VALUE) {
                    completableMergeSubscriber.getHighSpeedVideoSizes.request(1L);
                }
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }
        }
    }
}

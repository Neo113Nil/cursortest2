package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFlatMapIterableFlowable<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> Camera2StreamConfigurationMap;
    final io.reactivex.MaybeSource<T> getHighResolutionOutputSizeshNQ4ISI;

    public MaybeFlatMapIterableFlowable(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
        this.getHighResolutionOutputSizeshNQ4ISI = maybeSource;
        this.Camera2StreamConfigurationMap = function;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapIterableFlowable.FlatMapIterableObserver(subscriber, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapIterableObserver<T, R> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<R> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        volatile boolean Camera2StreamConfigurationMap;
        volatile java.util.Iterator<? extends R> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super R> getHighSpeedVideoFpsRangesFor;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicLong getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        boolean getOutputMinFrameDuration;

        FlatMapIterableObserver(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            try {
                java.util.Iterator<? extends R> it = this.getHighSpeedVideoFpsRanges.apply(t).iterator();
                if (!it.hasNext()) {
                    this.getHighSpeedVideoFpsRangesFor.onComplete();
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI = it;
                    getHighSpeedVideoFpsRanges();
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getInputSizeshNQ4ISI, j);
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoSizes.dispose();
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        private void getHighSpeedVideoFpsRanges() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super R> subscriber = this.getHighSpeedVideoFpsRangesFor;
            java.util.Iterator<? extends R> it = this.getHighResolutionOutputSizeshNQ4ISI;
            if (this.getOutputMinFrameDuration && it != null) {
                subscriber.onNext(null);
                subscriber.onComplete();
                return;
            }
            int i = 1;
            while (true) {
                if (it != null) {
                    long j = this.getInputSizeshNQ4ISI.get();
                    if (j == Long.MAX_VALUE) {
                        while (!this.Camera2StreamConfigurationMap) {
                            try {
                                subscriber.onNext(it.next());
                                if (this.Camera2StreamConfigurationMap) {
                                    return;
                                }
                                try {
                                    if (!it.hasNext()) {
                                        subscriber.onComplete();
                                        return;
                                    }
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    subscriber.onError(th);
                                    return;
                                }
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                subscriber.onError(th2);
                                return;
                            }
                        }
                        return;
                    }
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.Camera2StreamConfigurationMap) {
                            return;
                        }
                        try {
                            subscriber.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                            if (this.Camera2StreamConfigurationMap) {
                                return;
                            }
                            j2++;
                            try {
                                if (!it.hasNext()) {
                                    subscriber.onComplete();
                                    return;
                                }
                            } catch (java.lang.Throwable th3) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                subscriber.onError(th3);
                                return;
                            }
                        } catch (java.lang.Throwable th4) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
                            subscriber.onError(th4);
                            return;
                        }
                    }
                    if (j2 != 0) {
                        io.reactivex.internal.util.BackpressureHelper.produced(this.getInputSizeshNQ4ISI, j2);
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                if (it == null) {
                    it = this.getHighResolutionOutputSizeshNQ4ISI;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.getOutputMinFrameDuration = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighResolutionOutputSizeshNQ4ISI == null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final R poll() throws java.lang.Exception {
            java.util.Iterator<? extends R> it = this.getHighResolutionOutputSizeshNQ4ISI;
            if (it == null) {
                return null;
            }
            R r = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
            return r;
        }
    }
}

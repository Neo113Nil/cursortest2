package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleFlatMapIterableFlowable<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.SingleSource<T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> getHighSpeedVideoFpsRangesFor;

    public SingleFlatMapIterableFlowable(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
        this.getHighResolutionOutputSizeshNQ4ISI = singleSource;
        this.getHighSpeedVideoFpsRangesFor = function;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.single.SingleFlatMapIterableFlowable.FlatMapIterableObserver(subscriber, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapIterableObserver<T, R> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<R> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        final org.reactivestreams.Subscriber<? super R> Camera2StreamConfigurationMap;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> getHighResolutionOutputSizeshNQ4ISI;
        volatile java.util.Iterator<? extends R> getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        boolean getHighSpeedVideoSizesFor;
        final java.util.concurrent.atomic.AtomicLong getInputFormats = new java.util.concurrent.atomic.AtomicLong();

        FlatMapIterableObserver(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = function;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            try {
                java.util.Iterator<? extends R> it = this.getHighResolutionOutputSizeshNQ4ISI.apply(t).iterator();
                if (!it.hasNext()) {
                    this.Camera2StreamConfigurationMap.onComplete();
                } else {
                    this.getHighSpeedVideoFpsRanges = it;
                    getHighResolutionOutputSizeshNQ4ISI();
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getInputFormats, j);
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoSizes = true;
            this.getHighSpeedVideoFpsRangesFor.dispose();
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super R> subscriber = this.Camera2StreamConfigurationMap;
            java.util.Iterator<? extends R> it = this.getHighSpeedVideoFpsRanges;
            if (this.getHighSpeedVideoSizesFor && it != null) {
                subscriber.onNext(null);
                subscriber.onComplete();
                return;
            }
            int i = 1;
            while (true) {
                if (it != null) {
                    long j = this.getInputFormats.get();
                    if (j == Long.MAX_VALUE) {
                        while (!this.getHighSpeedVideoSizes) {
                            try {
                                subscriber.onNext(it.next());
                                if (this.getHighSpeedVideoSizes) {
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
                        if (this.getHighSpeedVideoSizes) {
                            return;
                        }
                        try {
                            subscriber.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                            if (this.getHighSpeedVideoSizes) {
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
                        io.reactivex.internal.util.BackpressureHelper.produced(this.getInputFormats, j2);
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                if (it == null) {
                    it = this.getHighSpeedVideoFpsRanges;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.getHighSpeedVideoSizesFor = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighSpeedVideoFpsRanges = null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighSpeedVideoFpsRanges == null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final R poll() throws java.lang.Exception {
            java.util.Iterator<? extends R> it = this.getHighSpeedVideoFpsRanges;
            if (it == null) {
                return null;
            }
            R r = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.getHighSpeedVideoFpsRanges = null;
            }
            return r;
        }
    }
}

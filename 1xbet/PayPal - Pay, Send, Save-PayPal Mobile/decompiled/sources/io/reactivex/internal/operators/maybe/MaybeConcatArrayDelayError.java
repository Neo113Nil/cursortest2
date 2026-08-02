package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeConcatArrayDelayError<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.MaybeSource<? extends T>[] getHighSpeedVideoFpsRangesFor;

    public MaybeConcatArrayDelayError(io.reactivex.MaybeSource<? extends T>[] maybeSourceArr) {
        this.getHighSpeedVideoFpsRangesFor = maybeSourceArr;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.maybe.MaybeConcatArrayDelayError.ConcatMaybeObserver concatMaybeObserver = new io.reactivex.internal.operators.maybe.MaybeConcatArrayDelayError.ConcatMaybeObserver(subscriber, this.getHighSpeedVideoFpsRangesFor);
        subscriber.onSubscribe(concatMaybeObserver);
        concatMaybeObserver.getHighResolutionOutputSizeshNQ4ISI();
    }

    /* loaded from: classes17.dex */
    static final class ConcatMaybeObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.MaybeObserver<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3520831347801429610L;
        final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final io.reactivex.MaybeSource<? extends T>[] getInputFormats;
        long getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicLong getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>(io.reactivex.internal.util.NotificationLite.COMPLETE);
        final io.reactivex.internal.util.AtomicThrowable Camera2StreamConfigurationMap = new io.reactivex.internal.util.AtomicThrowable();

        ConcatMaybeObserver(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.MaybeSource<? extends T>[] maybeSourceArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getInputFormats = maybeSourceArr;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getInputSizeshNQ4ISI, j);
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRangesFor.replace(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoSizes.lazySet(t);
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.lazySet(io.reactivex.internal.util.NotificationLite.COMPLETE);
            if (this.Camera2StreamConfigurationMap.addThrowable(th)) {
                getHighResolutionOutputSizeshNQ4ISI();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoSizes.lazySet(io.reactivex.internal.util.NotificationLite.COMPLETE);
            getHighResolutionOutputSizeshNQ4ISI();
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (getAndIncrement() == 0) {
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this.getHighSpeedVideoSizes;
                org.reactivestreams.Subscriber<? super T> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = this.getHighSpeedVideoFpsRangesFor;
                while (!sequentialDisposable.isDisposed()) {
                    java.lang.Object obj = atomicReference.get();
                    if (obj != null) {
                        if (obj != io.reactivex.internal.util.NotificationLite.COMPLETE) {
                            long j = this.getOutputMinFrameDuration;
                            if (j != this.getInputSizeshNQ4ISI.get()) {
                                this.getOutputMinFrameDuration = j + 1;
                                atomicReference.lazySet(null);
                                subscriber.onNext(obj);
                            }
                        } else {
                            atomicReference.lazySet(null);
                        }
                        if (!sequentialDisposable.isDisposed()) {
                            int i = this.getHighSpeedVideoFpsRanges;
                            io.reactivex.MaybeSource<? extends T>[] maybeSourceArr = this.getInputFormats;
                            if (i == maybeSourceArr.length) {
                                if (this.Camera2StreamConfigurationMap.get() != null) {
                                    subscriber.onError(this.Camera2StreamConfigurationMap.terminate());
                                    return;
                                } else {
                                    subscriber.onComplete();
                                    return;
                                }
                            }
                            this.getHighSpeedVideoFpsRanges = i + 1;
                            maybeSourceArr[i].subscribe(this);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }
    }
}

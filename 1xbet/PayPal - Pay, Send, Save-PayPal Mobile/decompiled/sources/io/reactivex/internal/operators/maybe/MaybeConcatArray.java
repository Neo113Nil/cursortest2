package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeConcatArray<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.MaybeSource<? extends T>[] getHighSpeedVideoFpsRangesFor;

    public MaybeConcatArray(io.reactivex.MaybeSource<? extends T>[] maybeSourceArr) {
        this.getHighSpeedVideoFpsRangesFor = maybeSourceArr;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.maybe.MaybeConcatArray.ConcatMaybeObserver concatMaybeObserver = new io.reactivex.internal.operators.maybe.MaybeConcatArray.ConcatMaybeObserver(subscriber, this.getHighSpeedVideoFpsRangesFor);
        subscriber.onSubscribe(concatMaybeObserver);
        concatMaybeObserver.getHighSpeedVideoFpsRanges();
    }

    /* loaded from: classes17.dex */
    static final class ConcatMaybeObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.MaybeObserver<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3520831347801429610L;
        int Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizes;
        final io.reactivex.MaybeSource<? extends T>[] getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicLong getInputFormats = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.disposables.SequentialDisposable getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(io.reactivex.internal.util.NotificationLite.COMPLETE);

        ConcatMaybeObserver(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.MaybeSource<? extends T>[] maybeSourceArr) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getOutputMinFrameDuration = maybeSourceArr;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getInputFormats, j);
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighResolutionOutputSizeshNQ4ISI.replace(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRanges.lazySet(t);
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.lazySet(io.reactivex.internal.util.NotificationLite.COMPLETE);
            getHighSpeedVideoFpsRanges();
        }

        final void getHighSpeedVideoFpsRanges() {
            if (getAndIncrement() == 0) {
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this.getHighSpeedVideoFpsRanges;
                org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRangesFor;
                io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = this.getHighResolutionOutputSizeshNQ4ISI;
                while (!sequentialDisposable.isDisposed()) {
                    java.lang.Object obj = atomicReference.get();
                    if (obj != null) {
                        if (obj != io.reactivex.internal.util.NotificationLite.COMPLETE) {
                            long j = this.getHighSpeedVideoSizes;
                            if (j != this.getInputFormats.get()) {
                                this.getHighSpeedVideoSizes = j + 1;
                                atomicReference.lazySet(null);
                                subscriber.onNext(obj);
                            }
                        } else {
                            atomicReference.lazySet(null);
                        }
                        if (!sequentialDisposable.isDisposed()) {
                            int i = this.Camera2StreamConfigurationMap;
                            io.reactivex.MaybeSource<? extends T>[] maybeSourceArr = this.getOutputMinFrameDuration;
                            if (i == maybeSourceArr.length) {
                                subscriber.onComplete();
                                return;
                            } else {
                                this.Camera2StreamConfigurationMap = i + 1;
                                maybeSourceArr[i].subscribe(this);
                            }
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

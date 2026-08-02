package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeConcatIterable<T> extends io.reactivex.Flowable<T> {
    final java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> getHighResolutionOutputSizeshNQ4ISI;

    public MaybeConcatIterable(java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> iterable) {
        this.getHighResolutionOutputSizeshNQ4ISI = iterable;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        try {
            io.reactivex.internal.operators.maybe.MaybeConcatIterable.ConcatMaybeObserver concatMaybeObserver = new io.reactivex.internal.operators.maybe.MaybeConcatIterable.ConcatMaybeObserver(subscriber, (java.util.Iterator) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.iterator(), "The sources Iterable returned a null Iterator"));
            subscriber.onSubscribe(concatMaybeObserver);
            concatMaybeObserver.getHighSpeedVideoFpsRangesFor();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    /* loaded from: classes17.dex */
    static final class ConcatMaybeObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.MaybeObserver<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3520831347801429610L;
        long getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;
        final java.util.Iterator<? extends io.reactivex.MaybeSource<? extends T>> getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicLong getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicReference<java.lang.Object> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>(io.reactivex.internal.util.NotificationLite.COMPLETE);

        ConcatMaybeObserver(org.reactivestreams.Subscriber<? super T> subscriber, java.util.Iterator<? extends io.reactivex.MaybeSource<? extends T>> it) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getOutputMinFrameDuration = it;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getHighResolutionOutputSizeshNQ4ISI, j);
                getHighSpeedVideoFpsRangesFor();
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
            this.Camera2StreamConfigurationMap.lazySet(t);
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.lazySet(io.reactivex.internal.util.NotificationLite.COMPLETE);
            getHighSpeedVideoFpsRangesFor();
        }

        final void getHighSpeedVideoFpsRangesFor() {
            if (getAndIncrement() == 0) {
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this.Camera2StreamConfigurationMap;
                org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoSizes;
                io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = this.getHighSpeedVideoFpsRangesFor;
                while (!sequentialDisposable.isDisposed()) {
                    java.lang.Object obj = atomicReference.get();
                    if (obj != null) {
                        if (obj != io.reactivex.internal.util.NotificationLite.COMPLETE) {
                            long j = this.getHighSpeedVideoFpsRanges;
                            if (j != this.getHighResolutionOutputSizeshNQ4ISI.get()) {
                                this.getHighSpeedVideoFpsRanges = j + 1;
                                atomicReference.lazySet(null);
                                subscriber.onNext(obj);
                            }
                        } else {
                            atomicReference.lazySet(null);
                        }
                        if (!sequentialDisposable.isDisposed()) {
                            try {
                                if (this.getOutputMinFrameDuration.hasNext()) {
                                    try {
                                        ((io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputMinFrameDuration.next(), "The source Iterator returned a null MaybeSource")).subscribe(this);
                                    } catch (java.lang.Throwable th) {
                                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                        subscriber.onError(th);
                                        return;
                                    }
                                } else {
                                    subscriber.onComplete();
                                }
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                subscriber.onError(th2);
                                return;
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

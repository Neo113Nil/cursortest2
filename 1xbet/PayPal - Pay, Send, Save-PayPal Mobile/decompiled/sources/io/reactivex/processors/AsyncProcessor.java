package io.reactivex.processors;

/* loaded from: classes17.dex */
public final class AsyncProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[]> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoFpsRangesFor);
    java.lang.Throwable getHighSpeedVideoSizes;
    T getHighSpeedVideoSizesFor;
    static final io.reactivex.processors.AsyncProcessor.AsyncSubscription[] getHighSpeedVideoFpsRangesFor = new io.reactivex.processors.AsyncProcessor.AsyncSubscription[0];
    static final io.reactivex.processors.AsyncProcessor.AsyncSubscription[] Camera2StreamConfigurationMap = new io.reactivex.processors.AsyncProcessor.AsyncSubscription[0];

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.AsyncProcessor<T> create() {
        return new io.reactivex.processors.AsyncProcessor<>();
    }

    AsyncProcessor() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.get() == Camera2StreamConfigurationMap) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighResolutionOutputSizeshNQ4ISI.get() == Camera2StreamConfigurationMap) {
            return;
        }
        this.getHighSpeedVideoSizesFor = t;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr = this.getHighResolutionOutputSizeshNQ4ISI.get();
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr2 = Camera2StreamConfigurationMap;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.getHighSpeedVideoSizesFor = null;
        this.getHighSpeedVideoSizes = th;
        for (io.reactivex.processors.AsyncProcessor.AsyncSubscription<T> asyncSubscription : this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(asyncSubscriptionArr2)) {
            asyncSubscription.getHighSpeedVideoFpsRanges(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr = this.getHighResolutionOutputSizeshNQ4ISI.get();
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr2 = Camera2StreamConfigurationMap;
        if (asyncSubscriptionArr != asyncSubscriptionArr2) {
            T t = this.getHighSpeedVideoSizesFor;
            io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] andSet = this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(asyncSubscriptionArr2);
            int i = 0;
            if (t == null) {
                int length = andSet.length;
                while (i < length) {
                    andSet[i].getHighSpeedVideoFpsRangesFor();
                    i++;
                }
                return;
            }
            int length2 = andSet.length;
            while (i < length2) {
                andSet[i].complete(t);
                i++;
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasSubscribers() {
        return this.getHighResolutionOutputSizeshNQ4ISI.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasThrowable() {
        return this.getHighResolutionOutputSizeshNQ4ISI.get() == Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasComplete() {
        return this.getHighResolutionOutputSizeshNQ4ISI.get() == Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final java.lang.Throwable getThrowable() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.get() == Camera2StreamConfigurationMap) {
            return this.getHighSpeedVideoSizes;
        }
        return null;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr;
        io.reactivex.processors.AsyncProcessor.AsyncSubscription[] asyncSubscriptionArr2;
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T> asyncSubscription = new io.reactivex.processors.AsyncProcessor.AsyncSubscription<>(subscriber, this);
        subscriber.onSubscribe(asyncSubscription);
        do {
            asyncSubscriptionArr = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (asyncSubscriptionArr == Camera2StreamConfigurationMap) {
                java.lang.Throwable th = this.getHighSpeedVideoSizes;
                if (th != null) {
                    subscriber.onError(th);
                    return;
                }
                T t = this.getHighSpeedVideoSizesFor;
                if (t != null) {
                    asyncSubscription.complete(t);
                    return;
                } else {
                    asyncSubscription.getHighSpeedVideoFpsRangesFor();
                    return;
                }
            }
            int length = asyncSubscriptionArr.length;
            asyncSubscriptionArr2 = new io.reactivex.processors.AsyncProcessor.AsyncSubscription[length + 1];
            java.lang.System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr2, 0, length);
            asyncSubscriptionArr2[length] = asyncSubscription;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, asyncSubscriptionArr, asyncSubscriptionArr2));
        if (asyncSubscription.isCancelled()) {
            getHighSpeedVideoFpsRangesFor(asyncSubscription);
        }
    }

    final void getHighSpeedVideoFpsRangesFor(io.reactivex.processors.AsyncProcessor.AsyncSubscription<T> asyncSubscription) {
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr;
        io.reactivex.processors.AsyncProcessor.AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.getHighResolutionOutputSizeshNQ4ISI.get();
            int length = asyncSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (asyncSubscriptionArr[i] == asyncSubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                asyncSubscriptionArr2 = getHighSpeedVideoFpsRangesFor;
            } else {
                io.reactivex.processors.AsyncProcessor.AsyncSubscription[] asyncSubscriptionArr3 = new io.reactivex.processors.AsyncProcessor.AsyncSubscription[length - 1];
                java.lang.System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr3, 0, i);
                java.lang.System.arraycopy(asyncSubscriptionArr, i + 1, asyncSubscriptionArr3, i, (length - i) - 1);
                asyncSubscriptionArr2 = asyncSubscriptionArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, asyncSubscriptionArr, asyncSubscriptionArr2));
    }

    public final boolean hasValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI.get() == Camera2StreamConfigurationMap && this.getHighSpeedVideoSizesFor != null;
    }

    public final T getValue() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.get() == Camera2StreamConfigurationMap) {
            return this.getHighSpeedVideoSizesFor;
        }
        return null;
    }

    @java.lang.Deprecated
    public final java.lang.Object[] getValues() {
        T value = getValue();
        return value != null ? new java.lang.Object[]{value} : new java.lang.Object[0];
    }

    @java.lang.Deprecated
    public final T[] getValues(T[] tArr) {
        T value = getValue();
        if (value == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) java.util.Arrays.copyOf(tArr, 1);
        }
        tArr[0] = value;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    static final class AsyncSubscription<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final io.reactivex.processors.AsyncProcessor<T> getHighSpeedVideoSizes;

        AsyncSubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.processors.AsyncProcessor<T> asyncProcessor) {
            super(subscriber);
            this.getHighSpeedVideoSizes = asyncProcessor;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            if (super.tryCancel()) {
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(this);
            }
        }

        final void getHighSpeedVideoFpsRangesFor() {
            if (isCancelled()) {
                return;
            }
            this.actual.onComplete();
        }

        final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
            if (isCancelled()) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.actual.onError(th);
            }
        }
    }
}

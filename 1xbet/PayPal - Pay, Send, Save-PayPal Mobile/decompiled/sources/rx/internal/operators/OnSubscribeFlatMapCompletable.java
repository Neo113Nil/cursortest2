package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeFlatMapCompletable<T> implements rx.Observable.OnSubscribe<T> {
    final rx.functions.Func1<? super T, ? extends rx.Completable> Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final rx.Observable<T> getHighSpeedVideoFpsRangesFor;

    public OnSubscribeFlatMapCompletable(rx.Observable<T> observable, rx.functions.Func1<? super T, ? extends rx.Completable> func1, boolean z, int i) {
        if (func1 == null) {
            throw new java.lang.NullPointerException("mapper is null");
        }
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("maxConcurrency > 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        this.getHighSpeedVideoFpsRangesFor = observable;
        this.Camera2StreamConfigurationMap = func1;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        rx.internal.operators.OnSubscribeFlatMapCompletable.FlatMapCompletableSubscriber flatMapCompletableSubscriber = new rx.internal.operators.OnSubscribeFlatMapCompletable.FlatMapCompletableSubscriber(subscriber, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
        subscriber.add(flatMapCompletableSubscriber);
        subscriber.add(flatMapCompletableSubscriber.getOutputFormats);
        this.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(flatMapCompletableSubscriber);
    }

    static final class FlatMapCompletableSubscriber<T> extends rx.Subscriber<T> {
        final int getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        final rx.functions.Func1<? super T, ? extends rx.Completable> getHighSpeedVideoFpsRangesFor;
        final boolean getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicInteger getInputFormats = new java.util.concurrent.atomic.AtomicInteger(1);
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
        final rx.subscriptions.CompositeSubscription getOutputFormats = new rx.subscriptions.CompositeSubscription();

        FlatMapCompletableSubscriber(rx.Subscriber<? super T> subscriber, rx.functions.Func1<? super T, ? extends rx.Completable> func1, boolean z, int i) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getHighSpeedVideoFpsRangesFor = func1;
            this.getHighSpeedVideoSizes = z;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            request(i != Integer.MAX_VALUE ? i : Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            try {
                rx.Completable call = this.getHighSpeedVideoFpsRangesFor.call(t);
                if (call == null) {
                    throw new java.lang.NullPointerException("The mapper returned a null Completable");
                }
                rx.internal.operators.OnSubscribeFlatMapCompletable.FlatMapCompletableSubscriber.InnerSubscriber innerSubscriber = new rx.internal.operators.OnSubscribeFlatMapCompletable.FlatMapCompletableSubscriber.InnerSubscriber();
                this.getOutputFormats.add(innerSubscriber);
                this.getInputFormats.getAndIncrement();
                call.unsafeSubscribe(innerSubscriber);
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(th);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                rx.internal.util.ExceptionsUtils.addThrowable(this.Camera2StreamConfigurationMap, th);
                onCompleted();
                return;
            }
            this.getOutputFormats.unsubscribe();
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, null, th)) {
                this.getHighSpeedVideoFpsRanges.onError(rx.internal.util.ExceptionsUtils.terminate(this.Camera2StreamConfigurationMap));
            } else {
                rx.plugins.RxJavaHooks.onError(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            getHighSpeedVideoSizes();
        }

        final boolean getHighSpeedVideoSizes() {
            if (this.getInputFormats.decrementAndGet() != 0) {
                return false;
            }
            java.lang.Throwable terminate = rx.internal.util.ExceptionsUtils.terminate(this.Camera2StreamConfigurationMap);
            if (terminate != null) {
                this.getHighSpeedVideoFpsRanges.onError(terminate);
                return true;
            }
            this.getHighSpeedVideoFpsRanges.onCompleted();
            return true;
        }

        final class InnerSubscriber extends java.util.concurrent.atomic.AtomicReference<rx.Subscription> implements rx.CompletableSubscriber, rx.Subscription {
            private static final long serialVersionUID = -8588259593722659900L;

            InnerSubscriber() {
            }

            @Override // rx.Subscription
            public final void unsubscribe() {
                rx.Subscription andSet = getAndSet(this);
                if (andSet == null || andSet == this) {
                    return;
                }
                andSet.unsubscribe();
            }

            @Override // rx.Subscription
            public final boolean isUnsubscribed() {
                return get() == this;
            }

            @Override // rx.CompletableSubscriber
            public final void onCompleted() {
                rx.internal.operators.OnSubscribeFlatMapCompletable.FlatMapCompletableSubscriber flatMapCompletableSubscriber = rx.internal.operators.OnSubscribeFlatMapCompletable.FlatMapCompletableSubscriber.this;
                flatMapCompletableSubscriber.getOutputFormats.remove(this);
                if (flatMapCompletableSubscriber.getHighSpeedVideoSizes() || flatMapCompletableSubscriber.getHighResolutionOutputSizeshNQ4ISI == Integer.MAX_VALUE) {
                    return;
                }
                flatMapCompletableSubscriber.request(1L);
            }

            @Override // rx.CompletableSubscriber
            public final void onError(java.lang.Throwable th) {
                rx.internal.operators.OnSubscribeFlatMapCompletable.FlatMapCompletableSubscriber flatMapCompletableSubscriber = rx.internal.operators.OnSubscribeFlatMapCompletable.FlatMapCompletableSubscriber.this;
                flatMapCompletableSubscriber.getOutputFormats.remove(this);
                if (flatMapCompletableSubscriber.getHighSpeedVideoSizes) {
                    rx.internal.util.ExceptionsUtils.addThrowable(flatMapCompletableSubscriber.Camera2StreamConfigurationMap, th);
                    if (flatMapCompletableSubscriber.getHighSpeedVideoSizes() || flatMapCompletableSubscriber.getHighResolutionOutputSizeshNQ4ISI == Integer.MAX_VALUE) {
                        return;
                    }
                    flatMapCompletableSubscriber.request(1L);
                    return;
                }
                flatMapCompletableSubscriber.getOutputFormats.unsubscribe();
                flatMapCompletableSubscriber.unsubscribe();
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(flatMapCompletableSubscriber.Camera2StreamConfigurationMap, null, th)) {
                    flatMapCompletableSubscriber.getHighSpeedVideoFpsRanges.onError(rx.internal.util.ExceptionsUtils.terminate(flatMapCompletableSubscriber.Camera2StreamConfigurationMap));
                } else {
                    rx.plugins.RxJavaHooks.onError(th);
                }
            }

            @Override // rx.CompletableSubscriber
            public final void onSubscribe(rx.Subscription subscription) {
                if (compareAndSet(null, subscription)) {
                    return;
                }
                subscription.unsubscribe();
                if (get() != this) {
                    rx.plugins.RxJavaHooks.onError(new java.lang.IllegalStateException("Subscription already set!"));
                }
            }
        }
    }
}

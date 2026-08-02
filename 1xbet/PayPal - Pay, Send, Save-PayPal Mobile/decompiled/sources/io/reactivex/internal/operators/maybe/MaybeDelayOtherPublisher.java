package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeDelayOtherPublisher<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> getHighSpeedVideoFpsRanges;

    public MaybeDelayOtherPublisher(io.reactivex.MaybeSource<T> maybeSource, org.reactivestreams.Publisher<U> publisher) {
        super(maybeSource);
        this.getHighSpeedVideoFpsRanges = publisher;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher.DelayMaybeObserver(maybeObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class DelayMaybeObserver<T, U> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Publisher<U> getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher.OtherSubscriber<T> getHighSpeedVideoSizes;

        DelayMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, org.reactivestreams.Publisher<U> publisher) {
            this.getHighSpeedVideoSizes = new io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher.OtherSubscriber<>(maybeObserver);
            this.getHighSpeedVideoFpsRanges = publisher;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoSizes);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(this.getHighSpeedVideoSizes.get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes = t;
            this.getHighSpeedVideoFpsRanges.subscribe(this.getHighSpeedVideoSizes);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap = th;
            this.getHighSpeedVideoFpsRanges.subscribe(this.getHighSpeedVideoSizes);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRanges.subscribe(this.getHighSpeedVideoSizes);
        }
    }

    /* loaded from: classes17.dex */
    static final class OtherSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        private static final long serialVersionUID = -1215060610805418006L;
        java.lang.Throwable Camera2StreamConfigurationMap;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRangesFor;
        T getHighSpeedVideoSizes;

        OtherSubscriber(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighSpeedVideoFpsRangesFor = maybeObserver;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(java.lang.Object obj) {
            org.reactivestreams.Subscription subscription = get();
            if (subscription != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                subscription.cancel();
                onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            java.lang.Throwable th2 = this.Camera2StreamConfigurationMap;
            if (th2 == null) {
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            } else {
                this.getHighSpeedVideoFpsRangesFor.onError(new io.reactivex.exceptions.CompositeException(th2, th));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            java.lang.Throwable th = this.Camera2StreamConfigurationMap;
            if (th != null) {
                this.getHighSpeedVideoFpsRangesFor.onError(th);
                return;
            }
            T t = this.getHighSpeedVideoSizes;
            if (t != null) {
                this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
            } else {
                this.getHighSpeedVideoFpsRangesFor.onComplete();
            }
        }
    }
}

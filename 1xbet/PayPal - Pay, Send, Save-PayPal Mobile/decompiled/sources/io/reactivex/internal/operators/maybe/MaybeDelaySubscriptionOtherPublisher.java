package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> getHighSpeedVideoFpsRangesFor;

    public MaybeDelaySubscriptionOtherPublisher(io.reactivex.MaybeSource<T> maybeSource, org.reactivestreams.Publisher<U> publisher) {
        super(maybeSource);
        this.getHighSpeedVideoFpsRangesFor = publisher;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher.OtherSubscriber(maybeObserver, this.source));
    }

    /* loaded from: classes17.dex */
    static final class OtherSubscriber<T> implements io.reactivex.FlowableSubscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        io.reactivex.MaybeSource<T> Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher.DelayMaybeObserver<T> getHighSpeedVideoSizes;

        OtherSubscriber(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.MaybeSource<T> maybeSource) {
            this.getHighSpeedVideoSizes = new io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher.DelayMaybeObserver<>(maybeObserver);
            this.Camera2StreamConfigurationMap = maybeSource;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(java.lang.Object obj) {
            if (this.getHighSpeedVideoFpsRanges != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                this.getHighSpeedVideoFpsRanges.cancel();
                this.getHighSpeedVideoFpsRanges = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                io.reactivex.MaybeSource<T> maybeSource = this.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = null;
                maybeSource.subscribe(this.getHighSpeedVideoSizes);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                this.getHighSpeedVideoFpsRanges = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                this.getHighSpeedVideoFpsRanges = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                io.reactivex.MaybeSource<T> maybeSource = this.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = null;
                maybeSource.subscribe(this.getHighSpeedVideoSizes);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoSizes.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges.cancel();
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizes);
        }
    }

    /* loaded from: classes17.dex */
    static final class DelayMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 706635022205076709L;
        final io.reactivex.MaybeObserver<? super T> Camera2StreamConfigurationMap;

        DelayMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.Camera2StreamConfigurationMap = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.Camera2StreamConfigurationMap.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.onComplete();
        }
    }
}

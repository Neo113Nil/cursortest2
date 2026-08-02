package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableReduceMaybe<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.HasUpstreamPublisher<T>, io.reactivex.internal.fuseable.FuseToFlowable<T> {
    final io.reactivex.Flowable<T> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.BiFunction<T, T, T> getHighSpeedVideoSizes;

    public FlowableReduceMaybe(io.reactivex.Flowable<T> flowable, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
        this.getHighSpeedVideoFpsRangesFor = flowable;
        this.getHighSpeedVideoSizes = biFunction;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public final org.reactivestreams.Publisher<T> source() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final io.reactivex.Flowable<T> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableReduce(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes));
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableReduceMaybe.ReduceSubscriber(maybeObserver, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class ReduceSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        boolean Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiFunction<T, T, T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRanges;
        T getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;

        ReduceSubscriber(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
            this.getHighSpeedVideoFpsRanges = maybeObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes.cancel();
            this.Camera2StreamConfigurationMap = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizes, subscription)) {
                this.getHighSpeedVideoSizes = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            T t2 = this.getHighSpeedVideoFpsRangesFor;
            if (t2 == null) {
                this.getHighSpeedVideoFpsRangesFor = t;
                return;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor = (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(t2, t), "The reducer returned a null value");
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizes.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            T t = this.getHighSpeedVideoFpsRangesFor;
            if (t != null) {
                this.getHighSpeedVideoFpsRanges.onSuccess(t);
            } else {
                this.getHighSpeedVideoFpsRanges.onComplete();
            }
        }
    }
}

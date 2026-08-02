package io.reactivex.internal.operators.mixed;

/* loaded from: classes3.dex */
public final class FlowableSwitchMapCompletable<T> extends io.reactivex.Completable {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> Camera2StreamConfigurationMap;
    final boolean getHighSpeedVideoFpsRanges;
    final io.reactivex.Flowable<T> getHighSpeedVideoSizes;

    public FlowableSwitchMapCompletable(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z) {
        this.getHighSpeedVideoSizes = flowable;
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighSpeedVideoSizes.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver(completableObserver, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class SwitchMapCompletableObserver<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver Camera2StreamConfigurationMap = new io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver(null);
        volatile boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRangesFor;
        final boolean getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getInputSizeshNQ4ISI;
        org.reactivestreams.Subscription getOutputFormats;
        final io.reactivex.internal.util.AtomicThrowable getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver> getInputFormats = new java.util.concurrent.atomic.AtomicReference<>();

        SwitchMapCompletableObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = completableObserver;
            this.getInputSizeshNQ4ISI = function;
            this.getHighSpeedVideoSizes = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputFormats, subscription)) {
                this.getOutputFormats = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver switchMapInnerObserver;
            try {
                io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputSizeshNQ4ISI.apply(t), "The mapper returned a null CompletableSource");
                io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver switchMapInnerObserver2 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = this.getInputFormats.get();
                    if (switchMapInnerObserver == Camera2StreamConfigurationMap) {
                        return;
                    }
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputFormats, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapInnerObserver);
                }
                completableSource.subscribe(switchMapInnerObserver2);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getOutputFormats.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.addThrowable(th)) {
                if (this.getHighSpeedVideoSizes) {
                    onComplete();
                    return;
                }
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver> atomicReference = this.getInputFormats;
                io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver switchMapInnerObserver = Camera2StreamConfigurationMap;
                io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
                if (andSet != null && andSet != switchMapInnerObserver) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(andSet);
                }
                java.lang.Throwable terminate = this.getHighResolutionOutputSizeshNQ4ISI.terminate();
                if (terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                    this.getHighSpeedVideoFpsRangesFor.onError(terminate);
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges = true;
            if (this.getInputFormats.get() == null) {
                java.lang.Throwable terminate = this.getHighResolutionOutputSizeshNQ4ISI.terminate();
                if (terminate == null) {
                    this.getHighSpeedVideoFpsRangesFor.onComplete();
                } else {
                    this.getHighSpeedVideoFpsRangesFor.onError(terminate);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getOutputFormats.cancel();
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver> atomicReference = this.getInputFormats;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver switchMapInnerObserver = Camera2StreamConfigurationMap;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet == null || andSet == switchMapInnerObserver) {
                return;
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(andSet);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getInputFormats.get() == Camera2StreamConfigurationMap;
        }

        static final class SwitchMapInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = -8003404460084760287L;
            final io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver<?> getHighSpeedVideoFpsRanges;

            SwitchMapInnerObserver(io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.getHighSpeedVideoFpsRanges = switchMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.getHighSpeedVideoFpsRanges;
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapCompletableObserver.getInputFormats, this, null) && switchMapCompletableObserver.getHighResolutionOutputSizeshNQ4ISI.addThrowable(th)) {
                    if (switchMapCompletableObserver.getHighSpeedVideoSizes) {
                        if (switchMapCompletableObserver.getHighSpeedVideoFpsRanges) {
                            switchMapCompletableObserver.getHighSpeedVideoFpsRangesFor.onError(switchMapCompletableObserver.getHighResolutionOutputSizeshNQ4ISI.terminate());
                            return;
                        }
                        return;
                    }
                    switchMapCompletableObserver.dispose();
                    java.lang.Throwable terminate = switchMapCompletableObserver.getHighResolutionOutputSizeshNQ4ISI.terminate();
                    if (terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                        switchMapCompletableObserver.getHighSpeedVideoFpsRangesFor.onError(terminate);
                        return;
                    }
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.getHighSpeedVideoFpsRanges;
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapCompletableObserver.getInputFormats, this, null) && switchMapCompletableObserver.getHighSpeedVideoFpsRanges) {
                    java.lang.Throwable terminate = switchMapCompletableObserver.getHighResolutionOutputSizeshNQ4ISI.terminate();
                    if (terminate == null) {
                        switchMapCompletableObserver.getHighSpeedVideoFpsRangesFor.onComplete();
                    } else {
                        switchMapCompletableObserver.getHighSpeedVideoFpsRangesFor.onError(terminate);
                    }
                }
            }
        }
    }
}

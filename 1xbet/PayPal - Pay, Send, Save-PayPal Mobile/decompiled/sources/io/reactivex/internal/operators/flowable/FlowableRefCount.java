package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableRefCount<T> extends io.reactivex.Flowable<T> {
    io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.flowables.ConnectableFlowable<T> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.Scheduler getHighSpeedVideoSizes;
    final java.util.concurrent.TimeUnit getInputSizeshNQ4ISI;
    final long getOutputMinFrameDuration;

    public FlowableRefCount(io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable) {
        this(connectableFlowable, 1, 0L, java.util.concurrent.TimeUnit.NANOSECONDS, io.reactivex.schedulers.Schedulers.trampoline());
    }

    public FlowableRefCount(io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable, int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.getHighSpeedVideoFpsRangesFor = connectableFlowable;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getOutputMinFrameDuration = j;
        this.getInputSizeshNQ4ISI = timeUnit;
        this.getHighSpeedVideoSizes = scheduler;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection refConnection;
        boolean z;
        synchronized (this) {
            refConnection = this.Camera2StreamConfigurationMap;
            if (refConnection == null) {
                refConnection = new io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection(this);
                this.Camera2StreamConfigurationMap = refConnection;
            }
            long j = refConnection.Camera2StreamConfigurationMap;
            if (j == 0 && refConnection.getHighSpeedVideoFpsRangesFor != null) {
                refConnection.getHighSpeedVideoFpsRangesFor.dispose();
            }
            long j2 = j + 1;
            refConnection.Camera2StreamConfigurationMap = j2;
            if (refConnection.getHighSpeedVideoSizes || j2 != this.getHighResolutionOutputSizeshNQ4ISI) {
                z = false;
            } else {
                z = true;
                refConnection.getHighSpeedVideoSizes = true;
            }
        }
        this.getHighSpeedVideoFpsRangesFor.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableRefCount.RefCountSubscriber(subscriber, this, refConnection));
        if (z) {
            this.getHighSpeedVideoFpsRangesFor.connect(refConnection);
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection refConnection) {
        synchronized (this) {
            if (this.Camera2StreamConfigurationMap != null) {
                this.Camera2StreamConfigurationMap = null;
                if (refConnection.getHighSpeedVideoFpsRangesFor != null) {
                    refConnection.getHighSpeedVideoFpsRangesFor.dispose();
                }
                io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable = this.getHighSpeedVideoFpsRangesFor;
                if (connectableFlowable instanceof io.reactivex.disposables.Disposable) {
                    ((io.reactivex.disposables.Disposable) connectableFlowable).dispose();
                }
            }
        }
    }

    final void getHighSpeedVideoSizes(io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.Camera2StreamConfigurationMap == 0 && refConnection == this.Camera2StreamConfigurationMap) {
                this.Camera2StreamConfigurationMap = null;
                io.reactivex.internal.disposables.DisposableHelper.dispose(refConnection);
                io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable = this.getHighSpeedVideoFpsRangesFor;
                if (connectableFlowable instanceof io.reactivex.disposables.Disposable) {
                    ((io.reactivex.disposables.Disposable) connectableFlowable).dispose();
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class RefConnection extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements java.lang.Runnable, io.reactivex.functions.Consumer<io.reactivex.disposables.Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;
        long Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.flowable.FlowableRefCount<?> getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(io.reactivex.disposables.Disposable disposable) throws java.lang.Exception {
            io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
        }

        RefConnection(io.reactivex.internal.operators.flowable.FlowableRefCount<?> flowableRefCount) {
            this.getHighSpeedVideoFpsRanges = flowableRefCount;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(this);
        }
    }

    /* loaded from: classes17.dex */
    static final class RefCountSubscriber<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -7419642935409022375L;
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.flowable.FlowableRefCount<T> getHighResolutionOutputSizeshNQ4ISI;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection getHighSpeedVideoFpsRangesFor;

        RefCountSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.internal.operators.flowable.FlowableRefCount<T> flowableRefCount, io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection refConnection) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = flowableRefCount;
            this.getHighSpeedVideoFpsRangesFor = refConnection;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.Camera2StreamConfigurationMap.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (compareAndSet(false, true)) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
                this.Camera2StreamConfigurationMap.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
                this.Camera2StreamConfigurationMap.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoFpsRanges.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges.cancel();
            if (compareAndSet(false, true)) {
                io.reactivex.internal.operators.flowable.FlowableRefCount<T> flowableRefCount = this.getHighResolutionOutputSizeshNQ4ISI;
                io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection refConnection = this.getHighSpeedVideoFpsRangesFor;
                synchronized (flowableRefCount) {
                    if (flowableRefCount.Camera2StreamConfigurationMap == null) {
                        return;
                    }
                    long j = refConnection.Camera2StreamConfigurationMap - 1;
                    refConnection.Camera2StreamConfigurationMap = j;
                    if (j == 0 && refConnection.getHighSpeedVideoSizes) {
                        if (flowableRefCount.getOutputMinFrameDuration == 0) {
                            flowableRefCount.getHighSpeedVideoSizes(refConnection);
                            return;
                        }
                        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
                        refConnection.getHighSpeedVideoFpsRangesFor = sequentialDisposable;
                        sequentialDisposable.replace(flowableRefCount.getHighSpeedVideoSizes.scheduleDirect(refConnection, flowableRefCount.getOutputMinFrameDuration, flowableRefCount.getInputSizeshNQ4ISI));
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }
    }
}

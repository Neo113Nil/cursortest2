package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleTimeout<T> implements rx.Single.OnSubscribe<T> {
    final rx.Single.OnSubscribe<T> Camera2StreamConfigurationMap;
    final rx.Scheduler getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoFpsRanges;
    final rx.Single.OnSubscribe<? extends T> getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.TimeUnit getHighSpeedVideoSizes;

    public SingleTimeout(rx.Single.OnSubscribe<T> onSubscribe, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler, rx.Single.OnSubscribe<? extends T> onSubscribe2) {
        this.Camera2StreamConfigurationMap = onSubscribe;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoSizes = timeUnit;
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        this.getHighSpeedVideoFpsRangesFor = onSubscribe2;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        rx.internal.operators.SingleTimeout.TimeoutSingleSubscriber timeoutSingleSubscriber = new rx.internal.operators.SingleTimeout.TimeoutSingleSubscriber(singleSubscriber, this.getHighSpeedVideoFpsRangesFor);
        rx.Scheduler.Worker createWorker = this.getHighResolutionOutputSizeshNQ4ISI.createWorker();
        timeoutSingleSubscriber.add(createWorker);
        singleSubscriber.add(timeoutSingleSubscriber);
        createWorker.schedule(timeoutSingleSubscriber, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        this.Camera2StreamConfigurationMap.call(timeoutSingleSubscriber);
    }

    static final class TimeoutSingleSubscriber<T> extends rx.SingleSubscriber<T> implements rx.functions.Action0 {
        final rx.SingleSubscriber<? super T> Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
        final rx.Single.OnSubscribe<? extends T> getHighSpeedVideoSizes;

        TimeoutSingleSubscriber(rx.SingleSubscriber<? super T> singleSubscriber, rx.Single.OnSubscribe<? extends T> onSubscribe) {
            this.Camera2StreamConfigurationMap = singleSubscriber;
            this.getHighSpeedVideoSizes = onSubscribe;
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
                try {
                    this.Camera2StreamConfigurationMap.onSuccess(t);
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // rx.SingleSubscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
                try {
                    this.Camera2StreamConfigurationMap.onError(th);
                    return;
                } finally {
                    unsubscribe();
                }
            }
            rx.plugins.RxJavaHooks.onError(th);
        }

        @Override // rx.functions.Action0
        public final void call() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
                try {
                    rx.Single.OnSubscribe<? extends T> onSubscribe = this.getHighSpeedVideoSizes;
                    if (onSubscribe == null) {
                        this.Camera2StreamConfigurationMap.onError(new java.util.concurrent.TimeoutException());
                    } else {
                        rx.internal.operators.SingleTimeout.TimeoutSingleSubscriber.OtherSubscriber otherSubscriber = new rx.internal.operators.SingleTimeout.TimeoutSingleSubscriber.OtherSubscriber(this.Camera2StreamConfigurationMap);
                        this.Camera2StreamConfigurationMap.add(otherSubscriber);
                        onSubscribe.call(otherSubscriber);
                    }
                } finally {
                    unsubscribe();
                }
            }
        }

        static final class OtherSubscriber<T> extends rx.SingleSubscriber<T> {
            final rx.SingleSubscriber<? super T> getHighSpeedVideoFpsRangesFor;

            OtherSubscriber(rx.SingleSubscriber<? super T> singleSubscriber) {
                this.getHighSpeedVideoFpsRangesFor = singleSubscriber;
            }

            @Override // rx.SingleSubscriber
            public final void onSuccess(T t) {
                this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
            }

            @Override // rx.SingleSubscriber
            public final void onError(java.lang.Throwable th) {
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }
    }
}

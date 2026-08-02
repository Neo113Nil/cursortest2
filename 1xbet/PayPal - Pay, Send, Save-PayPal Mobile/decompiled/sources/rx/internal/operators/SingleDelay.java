package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleDelay<T> implements rx.Single.OnSubscribe<T> {
    final rx.Single.OnSubscribe<T> Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final rx.Scheduler getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.TimeUnit getHighSpeedVideoSizes;

    public SingleDelay(rx.Single.OnSubscribe<T> onSubscribe, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        this.Camera2StreamConfigurationMap = onSubscribe;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizes = timeUnit;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        rx.Scheduler.Worker createWorker = this.getHighSpeedVideoFpsRangesFor.createWorker();
        rx.internal.operators.SingleDelay.ObserveOnSingleSubscriber observeOnSingleSubscriber = new rx.internal.operators.SingleDelay.ObserveOnSingleSubscriber(singleSubscriber, createWorker, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        singleSubscriber.add(createWorker);
        singleSubscriber.add(observeOnSingleSubscriber);
        this.Camera2StreamConfigurationMap.call(observeOnSingleSubscriber);
    }

    static final class ObserveOnSingleSubscriber<T> extends rx.SingleSubscriber<T> implements rx.functions.Action0 {
        final rx.SingleSubscriber<? super T> Camera2StreamConfigurationMap;
        final java.util.concurrent.TimeUnit getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRanges;
        T getHighSpeedVideoFpsRangesFor;
        java.lang.Throwable getHighSpeedVideoSizes;
        final rx.Scheduler.Worker getInputSizeshNQ4ISI;

        public ObserveOnSingleSubscriber(rx.SingleSubscriber<? super T> singleSubscriber, rx.Scheduler.Worker worker, long j, java.util.concurrent.TimeUnit timeUnit) {
            this.Camera2StreamConfigurationMap = singleSubscriber;
            this.getInputSizeshNQ4ISI = worker;
            this.getHighSpeedVideoFpsRanges = j;
            this.getHighResolutionOutputSizeshNQ4ISI = timeUnit;
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRangesFor = t;
            this.getInputSizeshNQ4ISI.schedule(this, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // rx.SingleSubscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = th;
            this.getInputSizeshNQ4ISI.schedule(this, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // rx.functions.Action0
        public final void call() {
            try {
                java.lang.Throwable th = this.getHighSpeedVideoSizes;
                if (th != null) {
                    this.getHighSpeedVideoSizes = null;
                    this.Camera2StreamConfigurationMap.onError(th);
                } else {
                    T t = this.getHighSpeedVideoFpsRangesFor;
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.Camera2StreamConfigurationMap.onSuccess(t);
                }
            } finally {
                this.getInputSizeshNQ4ISI.unsubscribe();
            }
        }
    }
}

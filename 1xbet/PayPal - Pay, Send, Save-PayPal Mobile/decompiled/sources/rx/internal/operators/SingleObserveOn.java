package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleObserveOn<T> implements rx.Single.OnSubscribe<T> {
    final rx.Single.OnSubscribe<T> getHighResolutionOutputSizeshNQ4ISI;
    final rx.Scheduler getHighSpeedVideoFpsRanges;

    public SingleObserveOn(rx.Single.OnSubscribe<T> onSubscribe, rx.Scheduler scheduler) {
        this.getHighResolutionOutputSizeshNQ4ISI = onSubscribe;
        this.getHighSpeedVideoFpsRanges = scheduler;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        rx.Scheduler.Worker createWorker = this.getHighSpeedVideoFpsRanges.createWorker();
        rx.internal.operators.SingleObserveOn.ObserveOnSingleSubscriber observeOnSingleSubscriber = new rx.internal.operators.SingleObserveOn.ObserveOnSingleSubscriber(singleSubscriber, createWorker);
        singleSubscriber.add(createWorker);
        singleSubscriber.add(observeOnSingleSubscriber);
        this.getHighResolutionOutputSizeshNQ4ISI.call(observeOnSingleSubscriber);
    }

    static final class ObserveOnSingleSubscriber<T> extends rx.SingleSubscriber<T> implements rx.functions.Action0 {
        final rx.Scheduler.Worker Camera2StreamConfigurationMap;
        java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
        final rx.SingleSubscriber<? super T> getHighSpeedVideoFpsRanges;
        T getHighSpeedVideoSizes;

        public ObserveOnSingleSubscriber(rx.SingleSubscriber<? super T> singleSubscriber, rx.Scheduler.Worker worker) {
            this.getHighSpeedVideoFpsRanges = singleSubscriber;
            this.Camera2StreamConfigurationMap = worker;
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            this.getHighSpeedVideoSizes = t;
            this.Camera2StreamConfigurationMap.schedule(this);
        }

        @Override // rx.SingleSubscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = th;
            this.Camera2StreamConfigurationMap.schedule(this);
        }

        @Override // rx.functions.Action0
        public final void call() {
            try {
                java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
                if (th != null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    this.getHighSpeedVideoFpsRanges.onError(th);
                } else {
                    T t = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRanges.onSuccess(t);
                }
            } finally {
                this.Camera2StreamConfigurationMap.unsubscribe();
            }
        }
    }
}

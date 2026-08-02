package rx.internal.util;

/* loaded from: classes18.dex */
public final class ScalarSynchronousSingle<T> extends rx.Single<T> {
    final T getHighSpeedVideoFpsRanges;

    public static <T> rx.internal.util.ScalarSynchronousSingle<T> create(T t) {
        return new rx.internal.util.ScalarSynchronousSingle<>(t);
    }

    protected ScalarSynchronousSingle(final T t) {
        super(new rx.Single.OnSubscribe<T>() { // from class: rx.internal.util.ScalarSynchronousSingle.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.functions.Action1
            public /* synthetic */ void call(java.lang.Object obj) {
                ((rx.SingleSubscriber) obj).onSuccess(t);
            }
        });
        this.getHighSpeedVideoFpsRanges = t;
    }

    public final T get() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final rx.Single<T> scalarScheduleOn(rx.Scheduler scheduler) {
        if (scheduler instanceof rx.internal.schedulers.EventLoopsScheduler) {
            return create((rx.Single.OnSubscribe) new rx.internal.util.ScalarSynchronousSingle.DirectScheduledEmission((rx.internal.schedulers.EventLoopsScheduler) scheduler, this.getHighSpeedVideoFpsRanges));
        }
        return create((rx.Single.OnSubscribe) new rx.internal.util.ScalarSynchronousSingle.NormalScheduledEmission(scheduler, this.getHighSpeedVideoFpsRanges));
    }

    static final class DirectScheduledEmission<T> implements rx.Single.OnSubscribe<T> {
        private final T Camera2StreamConfigurationMap;
        private final rx.internal.schedulers.EventLoopsScheduler getHighSpeedVideoSizes;

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            rx.SingleSubscriber singleSubscriber = (rx.SingleSubscriber) obj;
            singleSubscriber.add(this.getHighSpeedVideoSizes.scheduleDirect(new rx.internal.util.ScalarSynchronousSingle.ScalarSynchronousSingleAction(singleSubscriber, this.Camera2StreamConfigurationMap)));
        }

        DirectScheduledEmission(rx.internal.schedulers.EventLoopsScheduler eventLoopsScheduler, T t) {
            this.getHighSpeedVideoSizes = eventLoopsScheduler;
            this.Camera2StreamConfigurationMap = t;
        }
    }

    static final class NormalScheduledEmission<T> implements rx.Single.OnSubscribe<T> {
        private final rx.Scheduler getHighSpeedVideoFpsRangesFor;
        private final T getHighSpeedVideoSizes;

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            rx.SingleSubscriber singleSubscriber = (rx.SingleSubscriber) obj;
            rx.Scheduler.Worker createWorker = this.getHighSpeedVideoFpsRangesFor.createWorker();
            singleSubscriber.add(createWorker);
            createWorker.schedule(new rx.internal.util.ScalarSynchronousSingle.ScalarSynchronousSingleAction(singleSubscriber, this.getHighSpeedVideoSizes));
        }

        NormalScheduledEmission(rx.Scheduler scheduler, T t) {
            this.getHighSpeedVideoFpsRangesFor = scheduler;
            this.getHighSpeedVideoSizes = t;
        }
    }

    static final class ScalarSynchronousSingleAction<T> implements rx.functions.Action0 {
        private final rx.SingleSubscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        private final T getHighSpeedVideoFpsRangesFor;

        ScalarSynchronousSingleAction(rx.SingleSubscriber<? super T> singleSubscriber, T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = singleSubscriber;
            this.getHighSpeedVideoFpsRangesFor = t;
        }

        @Override // rx.functions.Action0
        public final void call() {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(this.getHighSpeedVideoFpsRangesFor);
            } catch (java.lang.Throwable th) {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }
    }

    public final <R> rx.Single<R> scalarFlatMap(final rx.functions.Func1<? super T, ? extends rx.Single<? extends R>> func1) {
        return create((rx.Single.OnSubscribe) new rx.Single.OnSubscribe<R>() { // from class: rx.internal.util.ScalarSynchronousSingle.2
            @Override // rx.functions.Action1
            public /* synthetic */ void call(java.lang.Object obj) {
                final rx.SingleSubscriber singleSubscriber = (rx.SingleSubscriber) obj;
                rx.Single single = (rx.Single) func1.call(rx.internal.util.ScalarSynchronousSingle.this.getHighSpeedVideoFpsRanges);
                if (single instanceof rx.internal.util.ScalarSynchronousSingle) {
                    singleSubscriber.onSuccess(((rx.internal.util.ScalarSynchronousSingle) single).getHighSpeedVideoFpsRanges);
                    return;
                }
                rx.SingleSubscriber<R> singleSubscriber2 = new rx.SingleSubscriber<R>() { // from class: rx.internal.util.ScalarSynchronousSingle.2.1
                    @Override // rx.SingleSubscriber
                    public void onError(java.lang.Throwable th) {
                        singleSubscriber.onError(th);
                    }

                    @Override // rx.SingleSubscriber
                    public void onSuccess(R r) {
                        singleSubscriber.onSuccess(r);
                    }
                };
                singleSubscriber.add(singleSubscriber2);
                single.subscribe(singleSubscriber2);
            }
        });
    }
}

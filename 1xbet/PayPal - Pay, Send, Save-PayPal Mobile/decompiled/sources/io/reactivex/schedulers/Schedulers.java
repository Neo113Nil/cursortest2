package io.reactivex.schedulers;

/* loaded from: classes3.dex */
public final class Schedulers {
    static final io.reactivex.Scheduler getHighSpeedVideoSizes = io.reactivex.plugins.RxJavaPlugins.initSingleScheduler(new io.reactivex.schedulers.Schedulers.SingleTask());
    static final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI = io.reactivex.plugins.RxJavaPlugins.initComputationScheduler(new io.reactivex.schedulers.Schedulers.ComputationTask());
    static final io.reactivex.Scheduler Camera2StreamConfigurationMap = io.reactivex.plugins.RxJavaPlugins.initIoScheduler(new io.reactivex.schedulers.Schedulers.IOTask());
    static final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor = io.reactivex.internal.schedulers.TrampolineScheduler.instance();
    static final io.reactivex.Scheduler getHighSpeedVideoFpsRanges = io.reactivex.plugins.RxJavaPlugins.initNewThreadScheduler(new io.reactivex.schedulers.Schedulers.NewThreadTask());

    /* loaded from: classes17.dex */
    static final class SingleHolder {
        static final io.reactivex.Scheduler getHighSpeedVideoSizes = new io.reactivex.internal.schedulers.SingleScheduler();

        SingleHolder() {
        }
    }

    /* loaded from: classes17.dex */
    static final class ComputationHolder {
        static final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.schedulers.ComputationScheduler();

        ComputationHolder() {
        }
    }

    /* loaded from: classes17.dex */
    static final class IoHolder {
        static final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.schedulers.IoScheduler();

        IoHolder() {
        }
    }

    /* loaded from: classes17.dex */
    static final class NewThreadHolder {
        static final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.schedulers.NewThreadScheduler();

        NewThreadHolder() {
        }
    }

    private Schedulers() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static io.reactivex.Scheduler computation() {
        return io.reactivex.plugins.RxJavaPlugins.onComputationScheduler(getHighResolutionOutputSizeshNQ4ISI);
    }

    public static io.reactivex.Scheduler io() {
        return io.reactivex.plugins.RxJavaPlugins.onIoScheduler(Camera2StreamConfigurationMap);
    }

    public static io.reactivex.Scheduler trampoline() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static io.reactivex.Scheduler newThread() {
        return io.reactivex.plugins.RxJavaPlugins.onNewThreadScheduler(getHighSpeedVideoFpsRanges);
    }

    public static io.reactivex.Scheduler single() {
        return io.reactivex.plugins.RxJavaPlugins.onSingleScheduler(getHighSpeedVideoSizes);
    }

    public static io.reactivex.Scheduler from(java.util.concurrent.Executor executor) {
        return new io.reactivex.internal.schedulers.ExecutorScheduler(executor);
    }

    public static void shutdown() {
        computation().shutdown();
        io().shutdown();
        newThread().shutdown();
        single().shutdown();
        trampoline().shutdown();
        io.reactivex.internal.schedulers.SchedulerPoolFactory.shutdown();
    }

    public static void start() {
        computation().start();
        io().start();
        newThread().start();
        single().start();
        trampoline().start();
        io.reactivex.internal.schedulers.SchedulerPoolFactory.start();
    }

    /* loaded from: classes17.dex */
    static final class IOTask implements java.util.concurrent.Callable<io.reactivex.Scheduler> {
        IOTask() {
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ io.reactivex.Scheduler call() throws java.lang.Exception {
            return io.reactivex.schedulers.Schedulers.IoHolder.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    /* loaded from: classes17.dex */
    static final class NewThreadTask implements java.util.concurrent.Callable<io.reactivex.Scheduler> {
        NewThreadTask() {
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ io.reactivex.Scheduler call() throws java.lang.Exception {
            return io.reactivex.schedulers.Schedulers.NewThreadHolder.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    /* loaded from: classes17.dex */
    static final class SingleTask implements java.util.concurrent.Callable<io.reactivex.Scheduler> {
        SingleTask() {
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ io.reactivex.Scheduler call() throws java.lang.Exception {
            return io.reactivex.schedulers.Schedulers.SingleHolder.getHighSpeedVideoSizes;
        }
    }

    /* loaded from: classes17.dex */
    static final class ComputationTask implements java.util.concurrent.Callable<io.reactivex.Scheduler> {
        ComputationTask() {
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ io.reactivex.Scheduler call() throws java.lang.Exception {
            return io.reactivex.schedulers.Schedulers.ComputationHolder.getHighSpeedVideoFpsRangesFor;
        }
    }
}

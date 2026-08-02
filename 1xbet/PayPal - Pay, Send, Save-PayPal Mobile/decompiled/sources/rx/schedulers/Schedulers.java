package rx.schedulers;

/* loaded from: classes18.dex */
public final class Schedulers {
    private static final java.util.concurrent.atomic.AtomicReference<rx.schedulers.Schedulers> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
    private final rx.Scheduler getHighResolutionOutputSizeshNQ4ISI;
    private final rx.Scheduler getHighSpeedVideoFpsRangesFor;
    private final rx.Scheduler getHighSpeedVideoSizes;

    private static rx.schedulers.Schedulers getHighSpeedVideoFpsRanges() {
        while (true) {
            java.util.concurrent.atomic.AtomicReference<rx.schedulers.Schedulers> atomicReference = Camera2StreamConfigurationMap;
            rx.schedulers.Schedulers schedulers = atomicReference.get();
            if (schedulers != null) {
                return schedulers;
            }
            rx.schedulers.Schedulers schedulers2 = new rx.schedulers.Schedulers();
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, schedulers2)) {
                return schedulers2;
            }
            schedulers2.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    private Schedulers() {
        rx.plugins.RxJavaSchedulersHook schedulersHook = rx.plugins.RxJavaPlugins.getInstance().getSchedulersHook();
        rx.Scheduler computationScheduler = schedulersHook.getComputationScheduler();
        if (computationScheduler != null) {
            this.getHighSpeedVideoSizes = computationScheduler;
        } else {
            this.getHighSpeedVideoSizes = rx.plugins.RxJavaSchedulersHook.createComputationScheduler();
        }
        rx.Scheduler iOScheduler = schedulersHook.getIOScheduler();
        if (iOScheduler != null) {
            this.getHighSpeedVideoFpsRangesFor = iOScheduler;
        } else {
            this.getHighSpeedVideoFpsRangesFor = rx.plugins.RxJavaSchedulersHook.createIoScheduler();
        }
        rx.Scheduler newThreadScheduler = schedulersHook.getNewThreadScheduler();
        if (newThreadScheduler != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = newThreadScheduler;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = rx.plugins.RxJavaSchedulersHook.createNewThreadScheduler();
        }
    }

    public static rx.Scheduler immediate() {
        return rx.internal.schedulers.ImmediateScheduler.INSTANCE;
    }

    public static rx.Scheduler trampoline() {
        return rx.internal.schedulers.TrampolineScheduler.INSTANCE;
    }

    public static rx.Scheduler newThread() {
        return rx.plugins.RxJavaHooks.onNewThreadScheduler(getHighSpeedVideoFpsRanges().getHighResolutionOutputSizeshNQ4ISI);
    }

    public static rx.Scheduler computation() {
        return rx.plugins.RxJavaHooks.onComputationScheduler(getHighSpeedVideoFpsRanges().getHighSpeedVideoSizes);
    }

    public static rx.Scheduler io() {
        return rx.plugins.RxJavaHooks.onIOScheduler(getHighSpeedVideoFpsRanges().getHighSpeedVideoFpsRangesFor);
    }

    public static rx.schedulers.TestScheduler test() {
        return new rx.schedulers.TestScheduler();
    }

    public static rx.Scheduler from(java.util.concurrent.Executor executor) {
        return new rx.internal.schedulers.ExecutorScheduler(executor);
    }

    public static void reset() {
        rx.schedulers.Schedulers andSet = Camera2StreamConfigurationMap.getAndSet(null);
        if (andSet != null) {
            andSet.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    public static void start() {
        rx.schedulers.Schedulers highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        synchronized (highSpeedVideoFpsRanges) {
            java.lang.Object obj = highSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            if (obj instanceof rx.internal.schedulers.SchedulerLifecycle) {
                ((rx.internal.schedulers.SchedulerLifecycle) obj).start();
            }
            java.lang.Object obj2 = highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            if (obj2 instanceof rx.internal.schedulers.SchedulerLifecycle) {
                ((rx.internal.schedulers.SchedulerLifecycle) obj2).start();
            }
            java.lang.Object obj3 = highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            if (obj3 instanceof rx.internal.schedulers.SchedulerLifecycle) {
                ((rx.internal.schedulers.SchedulerLifecycle) obj3).start();
            }
        }
        synchronized (highSpeedVideoFpsRanges) {
            rx.internal.schedulers.GenericScheduledExecutorService.INSTANCE.start();
        }
    }

    public static void shutdown() {
        rx.schedulers.Schedulers highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI();
        synchronized (highSpeedVideoFpsRanges) {
            rx.internal.schedulers.GenericScheduledExecutorService.INSTANCE.shutdown();
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        synchronized (this) {
            java.lang.Object obj = this.getHighSpeedVideoSizes;
            if (obj instanceof rx.internal.schedulers.SchedulerLifecycle) {
                ((rx.internal.schedulers.SchedulerLifecycle) obj).shutdown();
            }
            java.lang.Object obj2 = this.getHighSpeedVideoFpsRangesFor;
            if (obj2 instanceof rx.internal.schedulers.SchedulerLifecycle) {
                ((rx.internal.schedulers.SchedulerLifecycle) obj2).shutdown();
            }
            java.lang.Object obj3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (obj3 instanceof rx.internal.schedulers.SchedulerLifecycle) {
                ((rx.internal.schedulers.SchedulerLifecycle) obj3).shutdown();
            }
        }
    }
}

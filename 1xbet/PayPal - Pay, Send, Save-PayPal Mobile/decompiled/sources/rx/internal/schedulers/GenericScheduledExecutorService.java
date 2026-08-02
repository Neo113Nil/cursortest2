package rx.internal.schedulers;

/* loaded from: classes18.dex */
public final class GenericScheduledExecutorService implements rx.internal.schedulers.SchedulerLifecycle {
    private static int Camera2StreamConfigurationMap;
    public static final rx.internal.schedulers.GenericScheduledExecutorService INSTANCE;
    private static final java.util.concurrent.ScheduledExecutorService[] getHighSpeedVideoFpsRangesFor = new java.util.concurrent.ScheduledExecutorService[0];
    private static final java.util.concurrent.ScheduledExecutorService getHighSpeedVideoSizes;
    private final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService[]> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoFpsRangesFor);

    static {
        java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(0);
        getHighSpeedVideoSizes = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        INSTANCE = new rx.internal.schedulers.GenericScheduledExecutorService();
    }

    private GenericScheduledExecutorService() {
        start();
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public final void start() {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors /= 2;
        }
        if (availableProcessors > 8) {
            availableProcessors = 8;
        }
        java.util.concurrent.ScheduledExecutorService[] scheduledExecutorServiceArr = new java.util.concurrent.ScheduledExecutorService[availableProcessors];
        int i = 0;
        for (int i2 = 0; i2 < availableProcessors; i2++) {
            scheduledExecutorServiceArr[i2] = rx.internal.schedulers.GenericScheduledExecutorServiceFactory.Camera2StreamConfigurationMap();
        }
        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, getHighSpeedVideoFpsRangesFor, scheduledExecutorServiceArr)) {
            while (i < availableProcessors) {
                scheduledExecutorServiceArr[i].shutdownNow();
                i++;
            }
        } else {
            while (i < availableProcessors) {
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i];
                if (!rx.internal.schedulers.NewThreadWorker.tryEnableCancelPolicy(scheduledExecutorService) && (scheduledExecutorService instanceof java.util.concurrent.ScheduledThreadPoolExecutor)) {
                    rx.internal.schedulers.NewThreadWorker.registerExecutor((java.util.concurrent.ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
        }
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public final void shutdown() {
        java.util.concurrent.ScheduledExecutorService[] scheduledExecutorServiceArr;
        java.util.concurrent.ScheduledExecutorService[] scheduledExecutorServiceArr2;
        do {
            scheduledExecutorServiceArr = this.getHighResolutionOutputSizeshNQ4ISI.get();
            scheduledExecutorServiceArr2 = getHighSpeedVideoFpsRangesFor;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, scheduledExecutorServiceArr, scheduledExecutorServiceArr2));
        for (java.util.concurrent.ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            rx.internal.schedulers.NewThreadWorker.deregisterExecutor(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    public static java.util.concurrent.ScheduledExecutorService getInstance() {
        java.util.concurrent.ScheduledExecutorService[] scheduledExecutorServiceArr = INSTANCE.getHighResolutionOutputSizeshNQ4ISI.get();
        if (scheduledExecutorServiceArr == getHighSpeedVideoFpsRangesFor) {
            return getHighSpeedVideoSizes;
        }
        int i = Camera2StreamConfigurationMap + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        Camera2StreamConfigurationMap = i;
        return scheduledExecutorServiceArr[i];
    }
}

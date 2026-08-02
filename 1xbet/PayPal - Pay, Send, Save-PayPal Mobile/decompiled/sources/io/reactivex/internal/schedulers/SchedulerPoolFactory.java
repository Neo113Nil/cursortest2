package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
public final class SchedulerPoolFactory {
    public static final boolean PURGE_ENABLED;
    public static final int PURGE_PERIOD_SECONDS;
    static final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();
    static final java.util.Map<java.util.concurrent.ScheduledThreadPoolExecutor, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.ConcurrentHashMap();

    private SchedulerPoolFactory() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    static {
        java.util.Properties properties = java.lang.System.getProperties();
        io.reactivex.internal.schedulers.SchedulerPoolFactory.PurgeProperties purgeProperties = new io.reactivex.internal.schedulers.SchedulerPoolFactory.PurgeProperties();
        if (properties.containsKey("rx2.purge-enabled")) {
            purgeProperties.getHighSpeedVideoFpsRanges = java.lang.Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
        } else {
            purgeProperties.getHighSpeedVideoFpsRanges = true;
        }
        if (purgeProperties.getHighSpeedVideoFpsRanges && properties.containsKey("rx2.purge-period-seconds")) {
            try {
                purgeProperties.getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (java.lang.NumberFormatException unused) {
            }
            PURGE_ENABLED = purgeProperties.getHighSpeedVideoFpsRanges;
            PURGE_PERIOD_SECONDS = purgeProperties.getHighResolutionOutputSizeshNQ4ISI;
            start();
        }
        purgeProperties.getHighResolutionOutputSizeshNQ4ISI = 1;
        PURGE_ENABLED = purgeProperties.getHighSpeedVideoFpsRanges;
        PURGE_PERIOD_SECONDS = purgeProperties.getHighResolutionOutputSizeshNQ4ISI;
        start();
    }

    public static void start() {
        if (!PURGE_ENABLED) {
            return;
        }
        while (true) {
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> atomicReference = getHighSpeedVideoSizes;
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, new io.reactivex.internal.schedulers.RxThreadFactory("RxSchedulerPurge"));
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                io.reactivex.internal.schedulers.SchedulerPoolFactory.ScheduledTask scheduledTask = new io.reactivex.internal.schedulers.SchedulerPoolFactory.ScheduledTask();
                long j = PURGE_PERIOD_SECONDS;
                newScheduledThreadPool.scheduleAtFixedRate(scheduledTask, j, j, java.util.concurrent.TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }

    public static void shutdown() {
        java.util.concurrent.ScheduledExecutorService andSet = getHighSpeedVideoSizes.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        getHighResolutionOutputSizeshNQ4ISI.clear();
    }

    static final class PurgeProperties {
        int getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;

        PurgeProperties() {
        }
    }

    public static java.util.concurrent.ScheduledExecutorService create(java.util.concurrent.ThreadFactory threadFactory) {
        java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, threadFactory);
        if (PURGE_ENABLED && (newScheduledThreadPool instanceof java.util.concurrent.ScheduledThreadPoolExecutor)) {
            getHighResolutionOutputSizeshNQ4ISI.put((java.util.concurrent.ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }

    static final class ScheduledTask implements java.lang.Runnable {
        ScheduledTask() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.util.Iterator it = new java.util.ArrayList(io.reactivex.internal.schedulers.SchedulerPoolFactory.getHighResolutionOutputSizeshNQ4ISI.keySet()).iterator();
            while (it.hasNext()) {
                java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (java.util.concurrent.ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    io.reactivex.internal.schedulers.SchedulerPoolFactory.getHighResolutionOutputSizeshNQ4ISI.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }
}

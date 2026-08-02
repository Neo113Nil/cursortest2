package androidx.work.impl.utils;

/* loaded from: classes7.dex */
public class WorkTimer {
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.work.Logger.tagWithPrefix("WorkTimer");
    final androidx.work.RunnableScheduler getHighSpeedVideoFpsRangesFor;
    final java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.utils.WorkTimer.WorkTimerRunnable> getHighSpeedVideoSizes = new java.util.HashMap();
    final java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
    final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();

    public interface TimeLimitExceededListener {
        void onTimeLimitExceeded(androidx.work.impl.model.WorkGenerationalId workGenerationalId);
    }

    public WorkTimer(androidx.work.RunnableScheduler runnableScheduler) {
        this.getHighSpeedVideoFpsRangesFor = runnableScheduler;
    }

    public void startTimer(androidx.work.impl.model.WorkGenerationalId workGenerationalId, long j, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener timeLimitExceededListener) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            androidx.work.Logger logger = androidx.work.Logger.get();
            java.lang.String str = Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Starting timer for ");
            sb.append(workGenerationalId);
            logger.debug(str, sb.toString());
            stopTimer(workGenerationalId);
            androidx.work.impl.utils.WorkTimer.WorkTimerRunnable workTimerRunnable = new androidx.work.impl.utils.WorkTimer.WorkTimerRunnable(this, workGenerationalId);
            this.getHighSpeedVideoSizes.put(workGenerationalId, workTimerRunnable);
            this.getHighResolutionOutputSizeshNQ4ISI.put(workGenerationalId, timeLimitExceededListener);
            this.getHighSpeedVideoFpsRangesFor.scheduleWithDelay(j, workTimerRunnable);
        }
    }

    public void stopTimer(androidx.work.impl.model.WorkGenerationalId workGenerationalId) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoSizes.remove(workGenerationalId) != null) {
                androidx.work.Logger logger = androidx.work.Logger.get();
                java.lang.String str = Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Stopping timer for ");
                sb.append(workGenerationalId);
                logger.debug(str, sb.toString());
                this.getHighResolutionOutputSizeshNQ4ISI.remove(workGenerationalId);
            }
        }
    }

    public java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.utils.WorkTimer.WorkTimerRunnable> getTimerMap() {
        java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.utils.WorkTimer.WorkTimerRunnable> map;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            map = this.getHighSpeedVideoSizes;
        }
        return map;
    }

    public java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener> getListeners() {
        java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener> map;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            map = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return map;
    }

    public static class WorkTimerRunnable implements java.lang.Runnable {
        private final androidx.work.impl.model.WorkGenerationalId getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.work.impl.utils.WorkTimer getHighSpeedVideoFpsRanges;

        WorkTimerRunnable(androidx.work.impl.utils.WorkTimer workTimer, androidx.work.impl.model.WorkGenerationalId workGenerationalId) {
            this.getHighSpeedVideoFpsRanges = workTimer;
            this.getHighResolutionOutputSizeshNQ4ISI = workGenerationalId;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges) {
                if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes.remove(this.getHighResolutionOutputSizeshNQ4ISI) != null) {
                    androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener remove = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.remove(this.getHighResolutionOutputSizeshNQ4ISI);
                    if (remove != null) {
                        remove.onTimeLimitExceeded(this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                } else {
                    androidx.work.Logger.get().debug("WrkTimerRunnable", java.lang.String.format("Timer with %s is already marked as complete.", this.getHighResolutionOutputSizeshNQ4ISI));
                }
            }
        }
    }
}

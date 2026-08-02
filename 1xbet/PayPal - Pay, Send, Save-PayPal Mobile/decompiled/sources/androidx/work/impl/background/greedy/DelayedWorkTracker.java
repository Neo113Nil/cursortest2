package androidx.work.impl.background.greedy;

/* loaded from: classes3.dex */
public class DelayedWorkTracker {
    static final java.lang.String Camera2StreamConfigurationMap = androidx.work.Logger.tagWithPrefix("DelayedWorkTracker");
    final androidx.work.impl.Scheduler getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Map<java.lang.String, java.lang.Runnable> getHighSpeedVideoFpsRanges = new java.util.HashMap();
    private final androidx.work.RunnableScheduler getHighSpeedVideoFpsRangesFor;
    private final androidx.work.Clock getHighSpeedVideoSizes;

    public DelayedWorkTracker(androidx.work.impl.Scheduler scheduler, androidx.work.RunnableScheduler runnableScheduler, androidx.work.Clock clock) {
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        this.getHighSpeedVideoFpsRangesFor = runnableScheduler;
        this.getHighSpeedVideoSizes = clock;
    }

    public void schedule(final androidx.work.impl.model.WorkSpec workSpec, long j) {
        java.lang.Runnable remove = this.getHighSpeedVideoFpsRanges.remove(workSpec.id);
        if (remove != null) {
            this.getHighSpeedVideoFpsRangesFor.cancel(remove);
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.work.impl.background.greedy.DelayedWorkTracker.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.work.Logger logger = androidx.work.Logger.get();
                java.lang.String str = androidx.work.impl.background.greedy.DelayedWorkTracker.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Scheduling work ");
                sb.append(workSpec.id);
                logger.debug(str, sb.toString());
                androidx.work.impl.background.greedy.DelayedWorkTracker.this.getHighResolutionOutputSizeshNQ4ISI.schedule(workSpec);
            }
        };
        this.getHighSpeedVideoFpsRanges.put(workSpec.id, runnable);
        this.getHighSpeedVideoFpsRangesFor.scheduleWithDelay(j - this.getHighSpeedVideoSizes.currentTimeMillis(), runnable);
    }

    public void unschedule(java.lang.String str) {
        java.lang.Runnable remove = this.getHighSpeedVideoFpsRanges.remove(str);
        if (remove != null) {
            this.getHighSpeedVideoFpsRangesFor.cancel(remove);
        }
    }
}

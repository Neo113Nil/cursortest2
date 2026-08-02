package androidx.work.impl.background.greedy;

/* loaded from: classes3.dex */
public class GreedyScheduler implements androidx.work.impl.Scheduler, androidx.work.impl.constraints.OnConstraintsStateChangedListener, androidx.work.impl.ExecutionListener {
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.work.Logger.tagWithPrefix("GreedyScheduler");
    private final androidx.work.impl.constraints.WorkConstraintsTracker Camera2StreamConfigurationMap;
    private final androidx.work.Configuration getHighSpeedVideoFpsRangesFor;
    java.lang.Boolean getHighSpeedVideoSizes;
    private final androidx.work.impl.Processor getHighSpeedVideoSizesFor;
    private androidx.work.impl.background.greedy.DelayedWorkTracker getInputSizeshNQ4ISI;
    private final android.content.Context getOutputMinFrameDuration;
    private final androidx.work.impl.background.greedy.TimeLimiter getOutputMinFrameDurationlomOqCM;
    private final androidx.work.impl.utils.taskexecutor.TaskExecutor getOutputSizes;
    private boolean getOutputStallDuration;
    private final androidx.work.impl.WorkLauncher getOutputStallDurationlomOqCM;
    private final java.util.Map<androidx.work.impl.model.WorkGenerationalId, kotlinx.coroutines.Job> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
    private final java.lang.Object getOutputFormats = new java.lang.Object();
    private final androidx.work.impl.StartStopTokens getOutputSizeshNQ4ISI = androidx.work.impl.StartStopTokens.create();
    private final java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.background.greedy.GreedyScheduler.AttemptData> getInputFormats = new java.util.HashMap();

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return false;
    }

    public GreedyScheduler(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.constraints.trackers.Trackers trackers, androidx.work.impl.Processor processor, androidx.work.impl.WorkLauncher workLauncher, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        this.getOutputMinFrameDuration = context;
        androidx.work.RunnableScheduler runnableScheduler = configuration.getRunnableScheduler();
        this.getInputSizeshNQ4ISI = new androidx.work.impl.background.greedy.DelayedWorkTracker(this, runnableScheduler, configuration.getClock());
        this.getOutputMinFrameDurationlomOqCM = new androidx.work.impl.background.greedy.TimeLimiter(runnableScheduler, workLauncher);
        this.getOutputSizes = taskExecutor;
        this.Camera2StreamConfigurationMap = new androidx.work.impl.constraints.WorkConstraintsTracker(trackers);
        this.getHighSpeedVideoFpsRangesFor = configuration;
        this.getHighSpeedVideoSizesFor = processor;
        this.getOutputStallDurationlomOqCM = workLauncher;
    }

    public void setDelayedWorkTracker(androidx.work.impl.background.greedy.DelayedWorkTracker delayedWorkTracker) {
        this.getInputSizeshNQ4ISI = delayedWorkTracker;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(androidx.work.impl.model.WorkSpec... workSpecArr) {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = java.lang.Boolean.valueOf(androidx.work.impl.utils.ProcessUtils.isDefaultProcess(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor));
        }
        if (!this.getHighSpeedVideoSizes.booleanValue()) {
            androidx.work.Logger.get().info(getHighSpeedVideoFpsRanges, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.getOutputStallDuration) {
            this.getHighSpeedVideoSizesFor.addExecutionListener(this);
            this.getOutputStallDuration = true;
        }
        java.util.HashSet<androidx.work.impl.model.WorkSpec> hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (androidx.work.impl.model.WorkSpec workSpec : workSpecArr) {
            if (!this.getOutputSizeshNQ4ISI.contains(androidx.work.impl.model.WorkSpecKt.generationalId(workSpec))) {
                long max = java.lang.Math.max(workSpec.calculateNextRunTime(), Camera2StreamConfigurationMap(workSpec));
                long currentTimeMillis = this.getHighSpeedVideoFpsRangesFor.getClock().currentTimeMillis();
                if (workSpec.state == androidx.work.WorkInfo.State.ENQUEUED) {
                    if (currentTimeMillis < max) {
                        androidx.work.impl.background.greedy.DelayedWorkTracker delayedWorkTracker = this.getInputSizeshNQ4ISI;
                        if (delayedWorkTracker != null) {
                            delayedWorkTracker.schedule(workSpec, max);
                        }
                    } else if (workSpec.hasConstraints()) {
                        androidx.work.Constraints constraints = workSpec.constraints;
                        if (constraints.getCamera2StreamConfigurationMap()) {
                            androidx.work.Logger logger = androidx.work.Logger.get();
                            java.lang.String str = getHighSpeedVideoFpsRanges;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ignoring ");
                            sb.append(workSpec);
                            sb.append(". Requires device idle.");
                            logger.debug(str, sb.toString());
                        } else if (constraints.hasContentUriTriggers()) {
                            androidx.work.Logger logger2 = androidx.work.Logger.get();
                            java.lang.String str2 = getHighSpeedVideoFpsRanges;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Ignoring ");
                            sb2.append(workSpec);
                            sb2.append(". Requires ContentUri triggers.");
                            logger2.debug(str2, sb2.toString());
                        } else {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.id);
                        }
                    } else if (!this.getOutputSizeshNQ4ISI.contains(androidx.work.impl.model.WorkSpecKt.generationalId(workSpec))) {
                        androidx.work.Logger logger3 = androidx.work.Logger.get();
                        java.lang.String str3 = getHighSpeedVideoFpsRanges;
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Starting work for ");
                        sb3.append(workSpec.id);
                        logger3.debug(str3, sb3.toString());
                        androidx.work.impl.StartStopToken startStopToken = this.getOutputSizeshNQ4ISI.tokenFor(workSpec);
                        this.getOutputMinFrameDurationlomOqCM.track(startStopToken);
                        this.getOutputStallDurationlomOqCM.startWork(startStopToken);
                    }
                }
            }
        }
        synchronized (this.getOutputFormats) {
            if (!hashSet.isEmpty()) {
                java.lang.String join = android.text.TextUtils.join(",", hashSet2);
                androidx.work.Logger logger4 = androidx.work.Logger.get();
                java.lang.String str4 = getHighSpeedVideoFpsRanges;
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append("Starting tracking for ");
                sb4.append(join);
                logger4.debug(str4, sb4.toString());
                for (androidx.work.impl.model.WorkSpec workSpec2 : hashSet) {
                    androidx.work.impl.model.WorkGenerationalId generationalId = androidx.work.impl.model.WorkSpecKt.generationalId(workSpec2);
                    if (!this.getHighResolutionOutputSizeshNQ4ISI.containsKey(generationalId)) {
                        this.getHighResolutionOutputSizeshNQ4ISI.put(generationalId, androidx.work.impl.constraints.WorkConstraintsTrackerKt.listen(this.Camera2StreamConfigurationMap, workSpec2, this.getOutputSizes.getTaskCoroutineDispatcher(), this));
                    }
                }
            }
        }
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(java.lang.String str) {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = java.lang.Boolean.valueOf(androidx.work.impl.utils.ProcessUtils.isDefaultProcess(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor));
        }
        if (!this.getHighSpeedVideoSizes.booleanValue()) {
            androidx.work.Logger.get().info(getHighSpeedVideoFpsRanges, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.getOutputStallDuration) {
            this.getHighSpeedVideoSizesFor.addExecutionListener(this);
            this.getOutputStallDuration = true;
        }
        androidx.work.Logger.get().debug(getHighSpeedVideoFpsRanges, "Cancelling work ID ".concat(java.lang.String.valueOf(str)));
        androidx.work.impl.background.greedy.DelayedWorkTracker delayedWorkTracker = this.getInputSizeshNQ4ISI;
        if (delayedWorkTracker != null) {
            delayedWorkTracker.unschedule(str);
        }
        for (androidx.work.impl.StartStopToken startStopToken : this.getOutputSizeshNQ4ISI.remove(str)) {
            this.getOutputMinFrameDurationlomOqCM.cancel(startStopToken);
            this.getOutputStallDurationlomOqCM.stopWork(startStopToken);
        }
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(androidx.work.impl.model.WorkSpec workSpec, androidx.work.impl.constraints.ConstraintsState constraintsState) {
        androidx.work.impl.model.WorkGenerationalId generationalId = androidx.work.impl.model.WorkSpecKt.generationalId(workSpec);
        if (constraintsState instanceof androidx.work.impl.constraints.ConstraintsState.ConstraintsMet) {
            if (this.getOutputSizeshNQ4ISI.contains(generationalId)) {
                return;
            }
            androidx.work.Logger.get().debug(getHighSpeedVideoFpsRanges, "Constraints met: Scheduling work ID ".concat(java.lang.String.valueOf(generationalId)));
            androidx.work.impl.StartStopToken startStopToken = this.getOutputSizeshNQ4ISI.tokenFor(generationalId);
            this.getOutputMinFrameDurationlomOqCM.track(startStopToken);
            this.getOutputStallDurationlomOqCM.startWork(startStopToken);
            return;
        }
        androidx.work.Logger.get().debug(getHighSpeedVideoFpsRanges, "Constraints not met: Cancelling work ID ".concat(java.lang.String.valueOf(generationalId)));
        androidx.work.impl.StartStopToken remove = this.getOutputSizeshNQ4ISI.remove(generationalId);
        if (remove != null) {
            this.getOutputMinFrameDurationlomOqCM.cancel(remove);
            this.getOutputStallDurationlomOqCM.stopWorkWithReason(remove, ((androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet) constraintsState).getReason());
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(androidx.work.impl.model.WorkGenerationalId workGenerationalId, boolean z) {
        kotlinx.coroutines.Job remove;
        androidx.work.impl.StartStopToken remove2 = this.getOutputSizeshNQ4ISI.remove(workGenerationalId);
        if (remove2 != null) {
            this.getOutputMinFrameDurationlomOqCM.cancel(remove2);
        }
        synchronized (this.getOutputFormats) {
            remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(workGenerationalId);
        }
        if (remove != null) {
            androidx.work.Logger.get().debug(getHighSpeedVideoFpsRanges, "Stopping tracking for ".concat(java.lang.String.valueOf(workGenerationalId)));
            remove.cancel((java.util.concurrent.CancellationException) null);
        }
        if (z) {
            return;
        }
        synchronized (this.getOutputFormats) {
            this.getInputFormats.remove(workGenerationalId);
        }
    }

    private long Camera2StreamConfigurationMap(androidx.work.impl.model.WorkSpec workSpec) {
        long j;
        long max;
        synchronized (this.getOutputFormats) {
            androidx.work.impl.model.WorkGenerationalId generationalId = androidx.work.impl.model.WorkSpecKt.generationalId(workSpec);
            androidx.work.impl.background.greedy.GreedyScheduler.AttemptData attemptData = this.getInputFormats.get(generationalId);
            byte b = 0;
            if (attemptData == null) {
                attemptData = new androidx.work.impl.background.greedy.GreedyScheduler.AttemptData(workSpec.runAttemptCount, this.getHighSpeedVideoFpsRangesFor.getClock().currentTimeMillis(), b);
                this.getInputFormats.put(generationalId, attemptData);
            }
            j = attemptData.getHighSpeedVideoSizes;
            max = java.lang.Math.max((workSpec.runAttemptCount - attemptData.Camera2StreamConfigurationMap) - 5, 0);
        }
        return j + (max * 30000);
    }

    static class AttemptData {
        final int Camera2StreamConfigurationMap;
        final long getHighSpeedVideoSizes;

        /* synthetic */ AttemptData(int i, long j, byte b) {
            this(i, j);
        }

        private AttemptData(int i, long j) {
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoSizes = j;
        }
    }
}

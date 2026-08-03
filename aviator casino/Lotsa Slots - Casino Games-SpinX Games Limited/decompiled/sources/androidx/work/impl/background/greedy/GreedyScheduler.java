package androidx.work.impl.background.greedy;

/* loaded from: classes2.dex */
public class GreedyScheduler implements androidx.work.impl.Scheduler, androidx.work.impl.constraints.WorkConstraintsCallback, androidx.work.impl.ExecutionListener {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("GreedyScheduler");
    private final android.content.Context mContext;
    private androidx.work.impl.background.greedy.DelayedWorkTracker mDelayedWorkTracker;
    java.lang.Boolean mInDefaultProcess;
    private boolean mRegisteredExecutionListener;
    private final androidx.work.impl.constraints.WorkConstraintsTracker mWorkConstraintsTracker;
    private final androidx.work.impl.WorkManagerImpl mWorkManagerImpl;
    private final java.util.Set<androidx.work.impl.model.WorkSpec> mConstrainedWorkSpecs = new java.util.HashSet();
    private final androidx.work.impl.StartStopTokens mStartStopTokens = new androidx.work.impl.StartStopTokens();
    private final java.lang.Object mLock = new java.lang.Object();

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return false;
    }

    public GreedyScheduler(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.constraints.trackers.Trackers trackers, androidx.work.impl.WorkManagerImpl workManagerImpl) {
        this.mContext = context;
        this.mWorkManagerImpl = workManagerImpl;
        this.mWorkConstraintsTracker = new androidx.work.impl.constraints.WorkConstraintsTrackerImpl(trackers, this);
        this.mDelayedWorkTracker = new androidx.work.impl.background.greedy.DelayedWorkTracker(this, configuration.getRunnableScheduler());
    }

    public GreedyScheduler(android.content.Context context, androidx.work.impl.WorkManagerImpl workManagerImpl, androidx.work.impl.constraints.WorkConstraintsTracker workConstraintsTracker) {
        this.mContext = context;
        this.mWorkManagerImpl = workManagerImpl;
        this.mWorkConstraintsTracker = workConstraintsTracker;
    }

    public void setDelayedWorkTracker(androidx.work.impl.background.greedy.DelayedWorkTracker delayedWorkTracker) {
        this.mDelayedWorkTracker = delayedWorkTracker;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(androidx.work.impl.model.WorkSpec... workSpecs) {
        if (this.mInDefaultProcess == null) {
            checkDefaultProcess();
        }
        if (!this.mInDefaultProcess.booleanValue()) {
            androidx.work.Logger.get().info(TAG, "Ignoring schedule request in a secondary process");
            return;
        }
        registerExecutionListenerIfNeeded();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (androidx.work.impl.model.WorkSpec workSpec : workSpecs) {
            if (!this.mStartStopTokens.contains(androidx.work.impl.model.WorkSpecKt.generationalId(workSpec))) {
                long calculateNextRunTime = workSpec.calculateNextRunTime();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (workSpec.state == androidx.work.WorkInfo.State.ENQUEUED) {
                    if (currentTimeMillis < calculateNextRunTime) {
                        androidx.work.impl.background.greedy.DelayedWorkTracker delayedWorkTracker = this.mDelayedWorkTracker;
                        if (delayedWorkTracker != null) {
                            delayedWorkTracker.schedule(workSpec);
                        }
                    } else if (workSpec.hasConstraints()) {
                        if (android.os.Build.VERSION.SDK_INT >= 23 && workSpec.constraints.getRequiresDeviceIdle()) {
                            androidx.work.Logger.get().debug(TAG, "Ignoring " + workSpec + ". Requires device idle.");
                        } else if (android.os.Build.VERSION.SDK_INT >= 24 && workSpec.constraints.hasContentUriTriggers()) {
                            androidx.work.Logger.get().debug(TAG, "Ignoring " + workSpec + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.id);
                        }
                    } else if (!this.mStartStopTokens.contains(androidx.work.impl.model.WorkSpecKt.generationalId(workSpec))) {
                        androidx.work.Logger.get().debug(TAG, "Starting work for " + workSpec.id);
                        this.mWorkManagerImpl.startWork(this.mStartStopTokens.tokenFor(workSpec));
                    }
                }
            }
        }
        synchronized (this.mLock) {
            if (!hashSet.isEmpty()) {
                androidx.work.Logger.get().debug(TAG, "Starting tracking for " + android.text.TextUtils.join(",", hashSet2));
                this.mConstrainedWorkSpecs.addAll(hashSet);
                this.mWorkConstraintsTracker.replace(this.mConstrainedWorkSpecs);
            }
        }
    }

    private void checkDefaultProcess() {
        this.mInDefaultProcess = java.lang.Boolean.valueOf(androidx.work.impl.utils.ProcessUtils.isDefaultProcess(this.mContext, this.mWorkManagerImpl.getConfiguration()));
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(java.lang.String workSpecId) {
        if (this.mInDefaultProcess == null) {
            checkDefaultProcess();
        }
        if (!this.mInDefaultProcess.booleanValue()) {
            androidx.work.Logger.get().info(TAG, "Ignoring schedule request in non-main process");
            return;
        }
        registerExecutionListenerIfNeeded();
        androidx.work.Logger.get().debug(TAG, "Cancelling work ID " + workSpecId);
        androidx.work.impl.background.greedy.DelayedWorkTracker delayedWorkTracker = this.mDelayedWorkTracker;
        if (delayedWorkTracker != null) {
            delayedWorkTracker.unschedule(workSpecId);
        }
        java.util.Iterator<androidx.work.impl.StartStopToken> it = this.mStartStopTokens.remove(workSpecId).iterator();
        while (it.hasNext()) {
            this.mWorkManagerImpl.stopWork(it.next());
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(java.util.List<androidx.work.impl.model.WorkSpec> workSpecs) {
        java.util.Iterator<androidx.work.impl.model.WorkSpec> it = workSpecs.iterator();
        while (it.hasNext()) {
            androidx.work.impl.model.WorkGenerationalId generationalId = androidx.work.impl.model.WorkSpecKt.generationalId(it.next());
            if (!this.mStartStopTokens.contains(generationalId)) {
                androidx.work.Logger.get().debug(TAG, "Constraints met: Scheduling work ID " + generationalId);
                this.mWorkManagerImpl.startWork(this.mStartStopTokens.tokenFor(generationalId));
            }
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(java.util.List<androidx.work.impl.model.WorkSpec> workSpecs) {
        java.util.Iterator<androidx.work.impl.model.WorkSpec> it = workSpecs.iterator();
        while (it.hasNext()) {
            androidx.work.impl.model.WorkGenerationalId generationalId = androidx.work.impl.model.WorkSpecKt.generationalId(it.next());
            androidx.work.Logger.get().debug(TAG, "Constraints not met: Cancelling work ID " + generationalId);
            androidx.work.impl.StartStopToken remove = this.mStartStopTokens.remove(generationalId);
            if (remove != null) {
                this.mWorkManagerImpl.stopWork(remove);
            }
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    /* renamed from: onExecuted */
    public void m4930lambda$runOnExecuted$1$androidxworkimplProcessor(androidx.work.impl.model.WorkGenerationalId id, boolean needsReschedule) {
        this.mStartStopTokens.remove(id);
        removeConstraintTrackingFor(id);
    }

    private void removeConstraintTrackingFor(androidx.work.impl.model.WorkGenerationalId id) {
        synchronized (this.mLock) {
            java.util.Iterator<androidx.work.impl.model.WorkSpec> it = this.mConstrainedWorkSpecs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.work.impl.model.WorkSpec next = it.next();
                if (androidx.work.impl.model.WorkSpecKt.generationalId(next).equals(id)) {
                    androidx.work.Logger.get().debug(TAG, "Stopping tracking for " + id);
                    this.mConstrainedWorkSpecs.remove(next);
                    this.mWorkConstraintsTracker.replace(this.mConstrainedWorkSpecs);
                    break;
                }
            }
        }
    }

    private void registerExecutionListenerIfNeeded() {
        if (this.mRegisteredExecutionListener) {
            return;
        }
        this.mWorkManagerImpl.getProcessor().addExecutionListener(this);
        this.mRegisteredExecutionListener = true;
    }
}

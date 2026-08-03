package androidx.work.impl.background.systemalarm;

/* loaded from: classes2.dex */
public class DelayMetCommandHandler implements androidx.work.impl.constraints.WorkConstraintsCallback, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener {
    private static final int STATE_INITIAL = 0;
    private static final int STATE_START_REQUESTED = 1;
    private static final int STATE_STOP_REQUESTED = 2;
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("DelayMetCommandHandler");
    private final android.content.Context mContext;
    private int mCurrentState;
    private final androidx.work.impl.background.systemalarm.SystemAlarmDispatcher mDispatcher;
    private boolean mHasConstraints;
    private final java.lang.Object mLock;
    private final java.util.concurrent.Executor mMainThreadExecutor;
    private final java.util.concurrent.Executor mSerialExecutor;
    private final int mStartId;
    private final androidx.work.impl.StartStopToken mToken;
    private android.os.PowerManager.WakeLock mWakeLock;
    private final androidx.work.impl.constraints.WorkConstraintsTrackerImpl mWorkConstraintsTracker;
    private final androidx.work.impl.model.WorkGenerationalId mWorkGenerationalId;

    DelayMetCommandHandler(android.content.Context context, int startId, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher, androidx.work.impl.StartStopToken startStopToken) {
        this.mContext = context;
        this.mStartId = startId;
        this.mDispatcher = dispatcher;
        this.mWorkGenerationalId = startStopToken.getId();
        this.mToken = startStopToken;
        androidx.work.impl.constraints.trackers.Trackers trackers = dispatcher.getWorkManager().getTrackers();
        this.mSerialExecutor = dispatcher.getTaskExecutor().getSerialTaskExecutor();
        this.mMainThreadExecutor = dispatcher.getTaskExecutor().getMainThreadExecutor();
        this.mWorkConstraintsTracker = new androidx.work.impl.constraints.WorkConstraintsTrackerImpl(trackers, this);
        this.mHasConstraints = false;
        this.mCurrentState = 0;
        this.mLock = new java.lang.Object();
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(java.util.List<androidx.work.impl.model.WorkSpec> workSpecs) {
        java.util.Iterator<androidx.work.impl.model.WorkSpec> it = workSpecs.iterator();
        while (it.hasNext()) {
            if (androidx.work.impl.model.WorkSpecKt.generationalId(it.next()).equals(this.mWorkGenerationalId)) {
                this.mSerialExecutor.execute(new java.lang.Runnable() { // from class: androidx.work.impl.background.systemalarm.DelayMetCommandHandler$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.work.impl.background.systemalarm.DelayMetCommandHandler.this.startWork();
                    }
                });
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startWork() {
        if (this.mCurrentState == 0) {
            this.mCurrentState = 1;
            androidx.work.Logger.get().debug(TAG, "onAllConstraintsMet for " + this.mWorkGenerationalId);
            if (this.mDispatcher.getProcessor().startWork(this.mToken)) {
                this.mDispatcher.getWorkTimer().startTimer(this.mWorkGenerationalId, com.facebook.AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED, this);
                return;
            } else {
                cleanUp();
                return;
            }
        }
        androidx.work.Logger.get().debug(TAG, "Already started work for " + this.mWorkGenerationalId);
    }

    void onExecuted(boolean needsReschedule) {
        androidx.work.Logger.get().debug(TAG, "onExecuted " + this.mWorkGenerationalId + ", " + needsReschedule);
        cleanUp();
        if (needsReschedule) {
            this.mMainThreadExecutor.execute(new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.AddRunnable(this.mDispatcher, androidx.work.impl.background.systemalarm.CommandHandler.createScheduleWorkIntent(this.mContext, this.mWorkGenerationalId), this.mStartId));
        }
        if (this.mHasConstraints) {
            this.mMainThreadExecutor.execute(new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.AddRunnable(this.mDispatcher, androidx.work.impl.background.systemalarm.CommandHandler.createConstraintsChangedIntent(this.mContext), this.mStartId));
        }
    }

    @Override // androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
    public void onTimeLimitExceeded(androidx.work.impl.model.WorkGenerationalId id) {
        androidx.work.Logger.get().debug(TAG, "Exceeded time limits on execution for " + id);
        this.mSerialExecutor.execute(new androidx.work.impl.background.systemalarm.DelayMetCommandHandler$$ExternalSyntheticLambda0(this));
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(java.util.List<androidx.work.impl.model.WorkSpec> workSpecs) {
        this.mSerialExecutor.execute(new androidx.work.impl.background.systemalarm.DelayMetCommandHandler$$ExternalSyntheticLambda0(this));
    }

    void handleProcessWork() {
        java.lang.String workSpecId = this.mWorkGenerationalId.getWorkSpecId();
        this.mWakeLock = androidx.work.impl.utils.WakeLocks.newWakeLock(this.mContext, workSpecId + " (" + this.mStartId + ")");
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String str = TAG;
        logger.debug(str, "Acquiring wakelock " + this.mWakeLock + "for WorkSpec " + workSpecId);
        this.mWakeLock.acquire();
        androidx.work.impl.model.WorkSpec workSpec = this.mDispatcher.getWorkManager().getWorkDatabase().workSpecDao().getWorkSpec(workSpecId);
        if (workSpec == null) {
            this.mSerialExecutor.execute(new androidx.work.impl.background.systemalarm.DelayMetCommandHandler$$ExternalSyntheticLambda0(this));
            return;
        }
        boolean hasConstraints = workSpec.hasConstraints();
        this.mHasConstraints = hasConstraints;
        if (!hasConstraints) {
            androidx.work.Logger.get().debug(str, "No constraints for " + workSpecId);
            onAllConstraintsMet(java.util.Collections.singletonList(workSpec));
            return;
        }
        this.mWorkConstraintsTracker.replace(java.util.Collections.singletonList(workSpec));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopWork() {
        java.lang.String workSpecId = this.mWorkGenerationalId.getWorkSpecId();
        if (this.mCurrentState < 2) {
            this.mCurrentState = 2;
            androidx.work.Logger logger = androidx.work.Logger.get();
            java.lang.String str = TAG;
            logger.debug(str, "Stopping work for WorkSpec " + workSpecId);
            this.mMainThreadExecutor.execute(new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.AddRunnable(this.mDispatcher, androidx.work.impl.background.systemalarm.CommandHandler.createStopWorkIntent(this.mContext, this.mWorkGenerationalId), this.mStartId));
            if (this.mDispatcher.getProcessor().isEnqueued(this.mWorkGenerationalId.getWorkSpecId())) {
                androidx.work.Logger.get().debug(str, "WorkSpec " + workSpecId + " needs to be rescheduled");
                this.mMainThreadExecutor.execute(new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.AddRunnable(this.mDispatcher, androidx.work.impl.background.systemalarm.CommandHandler.createScheduleWorkIntent(this.mContext, this.mWorkGenerationalId), this.mStartId));
                return;
            }
            androidx.work.Logger.get().debug(str, "Processor does not have WorkSpec " + workSpecId + ". No need to reschedule");
            return;
        }
        androidx.work.Logger.get().debug(TAG, "Already stopped work for " + workSpecId);
    }

    private void cleanUp() {
        synchronized (this.mLock) {
            this.mWorkConstraintsTracker.reset();
            this.mDispatcher.getWorkTimer().stopTimer(this.mWorkGenerationalId);
            android.os.PowerManager.WakeLock wakeLock = this.mWakeLock;
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.Logger.get().debug(TAG, "Releasing wakelock " + this.mWakeLock + "for WorkSpec " + this.mWorkGenerationalId);
                this.mWakeLock.release();
            }
        }
    }
}

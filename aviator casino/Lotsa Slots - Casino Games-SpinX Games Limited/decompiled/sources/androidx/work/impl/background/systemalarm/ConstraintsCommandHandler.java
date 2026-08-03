package androidx.work.impl.background.systemalarm;

/* loaded from: classes2.dex */
class ConstraintsCommandHandler {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("ConstraintsCmdHandler");
    private final android.content.Context mContext;
    private final androidx.work.impl.background.systemalarm.SystemAlarmDispatcher mDispatcher;
    private final int mStartId;
    private final androidx.work.impl.constraints.WorkConstraintsTrackerImpl mWorkConstraintsTracker;

    ConstraintsCommandHandler(android.content.Context context, int startId, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
        this.mContext = context;
        this.mStartId = startId;
        this.mDispatcher = dispatcher;
        this.mWorkConstraintsTracker = new androidx.work.impl.constraints.WorkConstraintsTrackerImpl(dispatcher.getWorkManager().getTrackers(), (androidx.work.impl.constraints.WorkConstraintsCallback) null);
    }

    void handleConstraintsChanged() {
        java.util.List<androidx.work.impl.model.WorkSpec> scheduledWork = this.mDispatcher.getWorkManager().getWorkDatabase().workSpecDao().getScheduledWork();
        androidx.work.impl.background.systemalarm.ConstraintProxy.updateAll(this.mContext, scheduledWork);
        this.mWorkConstraintsTracker.replace(scheduledWork);
        java.util.ArrayList<androidx.work.impl.model.WorkSpec> arrayList = new java.util.ArrayList(scheduledWork.size());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (androidx.work.impl.model.WorkSpec workSpec : scheduledWork) {
            java.lang.String str = workSpec.id;
            if (currentTimeMillis >= workSpec.calculateNextRunTime() && (!workSpec.hasConstraints() || this.mWorkConstraintsTracker.areAllConstraintsMet(str))) {
                arrayList.add(workSpec);
            }
        }
        for (androidx.work.impl.model.WorkSpec workSpec2 : arrayList) {
            java.lang.String str2 = workSpec2.id;
            android.content.Intent createDelayMetIntent = androidx.work.impl.background.systemalarm.CommandHandler.createDelayMetIntent(this.mContext, androidx.work.impl.model.WorkSpecKt.generationalId(workSpec2));
            androidx.work.Logger.get().debug(TAG, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.mDispatcher.getTaskExecutor().getMainThreadExecutor().execute(new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.AddRunnable(this.mDispatcher, createDelayMetIntent, this.mStartId));
        }
        this.mWorkConstraintsTracker.reset();
    }
}

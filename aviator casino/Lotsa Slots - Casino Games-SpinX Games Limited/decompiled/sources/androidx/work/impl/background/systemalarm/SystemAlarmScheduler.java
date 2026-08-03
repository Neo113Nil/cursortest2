package androidx.work.impl.background.systemalarm;

/* loaded from: classes2.dex */
public class SystemAlarmScheduler implements androidx.work.impl.Scheduler {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("SystemAlarmScheduler");
    private final android.content.Context mContext;

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    public SystemAlarmScheduler(android.content.Context context) {
        this.mContext = context.getApplicationContext();
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(androidx.work.impl.model.WorkSpec... workSpecs) {
        for (androidx.work.impl.model.WorkSpec workSpec : workSpecs) {
            scheduleWorkSpec(workSpec);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(java.lang.String workSpecId) {
        this.mContext.startService(androidx.work.impl.background.systemalarm.CommandHandler.createStopWorkIntent(this.mContext, workSpecId));
    }

    private void scheduleWorkSpec(androidx.work.impl.model.WorkSpec workSpec) {
        androidx.work.Logger.get().debug(TAG, "Scheduling work with workSpecId " + workSpec.id);
        this.mContext.startService(androidx.work.impl.background.systemalarm.CommandHandler.createScheduleWorkIntent(this.mContext, androidx.work.impl.model.WorkSpecKt.generationalId(workSpec)));
    }
}

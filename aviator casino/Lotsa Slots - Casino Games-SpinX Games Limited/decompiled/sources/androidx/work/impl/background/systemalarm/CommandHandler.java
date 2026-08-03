package androidx.work.impl.background.systemalarm;

/* loaded from: classes2.dex */
public class CommandHandler implements androidx.work.impl.ExecutionListener {
    static final java.lang.String ACTION_CONSTRAINTS_CHANGED = "ACTION_CONSTRAINTS_CHANGED";
    static final java.lang.String ACTION_DELAY_MET = "ACTION_DELAY_MET";
    static final java.lang.String ACTION_EXECUTION_COMPLETED = "ACTION_EXECUTION_COMPLETED";
    static final java.lang.String ACTION_RESCHEDULE = "ACTION_RESCHEDULE";
    static final java.lang.String ACTION_SCHEDULE_WORK = "ACTION_SCHEDULE_WORK";
    static final java.lang.String ACTION_STOP_WORK = "ACTION_STOP_WORK";
    private static final java.lang.String KEY_NEEDS_RESCHEDULE = "KEY_NEEDS_RESCHEDULE";
    private static final java.lang.String KEY_WORKSPEC_GENERATION = "KEY_WORKSPEC_GENERATION";
    private static final java.lang.String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("CommandHandler");
    static final long WORK_PROCESSING_TIME_IN_MS = 600000;
    private final android.content.Context mContext;
    private final androidx.work.impl.StartStopTokens mStartStopTokens;
    private final java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.background.systemalarm.DelayMetCommandHandler> mPendingDelayMet = new java.util.HashMap();
    private final java.lang.Object mLock = new java.lang.Object();

    static android.content.Intent createScheduleWorkIntent(android.content.Context context, androidx.work.impl.model.WorkGenerationalId id) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction(ACTION_SCHEDULE_WORK);
        return writeWorkGenerationalId(intent, id);
    }

    private static android.content.Intent writeWorkGenerationalId(android.content.Intent intent, androidx.work.impl.model.WorkGenerationalId id) {
        intent.putExtra(KEY_WORKSPEC_ID, id.getWorkSpecId());
        intent.putExtra(KEY_WORKSPEC_GENERATION, id.getGeneration());
        return intent;
    }

    static androidx.work.impl.model.WorkGenerationalId readWorkGenerationalId(android.content.Intent intent) {
        return new androidx.work.impl.model.WorkGenerationalId(intent.getStringExtra(KEY_WORKSPEC_ID), intent.getIntExtra(KEY_WORKSPEC_GENERATION, 0));
    }

    static android.content.Intent createDelayMetIntent(android.content.Context context, androidx.work.impl.model.WorkGenerationalId id) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction(ACTION_DELAY_MET);
        return writeWorkGenerationalId(intent, id);
    }

    static android.content.Intent createStopWorkIntent(android.content.Context context, java.lang.String workSpecId) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction(ACTION_STOP_WORK);
        intent.putExtra(KEY_WORKSPEC_ID, workSpecId);
        return intent;
    }

    static android.content.Intent createStopWorkIntent(android.content.Context context, androidx.work.impl.model.WorkGenerationalId id) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction(ACTION_STOP_WORK);
        return writeWorkGenerationalId(intent, id);
    }

    static android.content.Intent createConstraintsChangedIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction(ACTION_CONSTRAINTS_CHANGED);
        return intent;
    }

    static android.content.Intent createRescheduleIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction(ACTION_RESCHEDULE);
        return intent;
    }

    static android.content.Intent createExecutionCompletedIntent(android.content.Context context, androidx.work.impl.model.WorkGenerationalId id, boolean needsReschedule) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction(ACTION_EXECUTION_COMPLETED);
        intent.putExtra(KEY_NEEDS_RESCHEDULE, needsReschedule);
        return writeWorkGenerationalId(intent, id);
    }

    CommandHandler(android.content.Context context, androidx.work.impl.StartStopTokens startStopTokens) {
        this.mContext = context;
        this.mStartStopTokens = startStopTokens;
    }

    @Override // androidx.work.impl.ExecutionListener
    /* renamed from: onExecuted */
    public void m4930lambda$runOnExecuted$1$androidxworkimplProcessor(androidx.work.impl.model.WorkGenerationalId id, boolean needsReschedule) {
        synchronized (this.mLock) {
            androidx.work.impl.background.systemalarm.DelayMetCommandHandler remove = this.mPendingDelayMet.remove(id);
            this.mStartStopTokens.remove(id);
            if (remove != null) {
                remove.onExecuted(needsReschedule);
            }
        }
    }

    boolean hasPendingCommands() {
        boolean z;
        synchronized (this.mLock) {
            z = !this.mPendingDelayMet.isEmpty();
        }
        return z;
    }

    void onHandleIntent(android.content.Intent intent, int startId, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
        java.lang.String action = intent.getAction();
        if (ACTION_CONSTRAINTS_CHANGED.equals(action)) {
            handleConstraintsChanged(intent, startId, dispatcher);
            return;
        }
        if (ACTION_RESCHEDULE.equals(action)) {
            handleReschedule(intent, startId, dispatcher);
            return;
        }
        if (!hasKeys(intent.getExtras(), KEY_WORKSPEC_ID)) {
            androidx.work.Logger.get().error(TAG, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if (ACTION_SCHEDULE_WORK.equals(action)) {
            handleScheduleWorkIntent(intent, startId, dispatcher);
            return;
        }
        if (ACTION_DELAY_MET.equals(action)) {
            handleDelayMet(intent, startId, dispatcher);
            return;
        }
        if (ACTION_STOP_WORK.equals(action)) {
            handleStopWork(intent, dispatcher);
            return;
        }
        if (ACTION_EXECUTION_COMPLETED.equals(action)) {
            handleExecutionCompleted(intent, startId);
            return;
        }
        androidx.work.Logger.get().warning(TAG, "Ignoring intent " + intent);
    }

    private void handleScheduleWorkIntent(android.content.Intent intent, int startId, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
        androidx.work.impl.model.WorkGenerationalId readWorkGenerationalId = readWorkGenerationalId(intent);
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String str = TAG;
        logger.debug(str, "Handling schedule work for " + readWorkGenerationalId);
        androidx.work.impl.WorkDatabase workDatabase = dispatcher.getWorkManager().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            androidx.work.impl.model.WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(readWorkGenerationalId.getWorkSpecId());
            if (workSpec == null) {
                androidx.work.Logger.get().warning(str, "Skipping scheduling " + readWorkGenerationalId + " because it's no longer in the DB");
                return;
            }
            if (workSpec.state.isFinished()) {
                androidx.work.Logger.get().warning(str, "Skipping scheduling " + readWorkGenerationalId + "because it is finished.");
                return;
            }
            long calculateNextRunTime = workSpec.calculateNextRunTime();
            if (!workSpec.hasConstraints()) {
                androidx.work.Logger.get().debug(str, "Setting up Alarms for " + readWorkGenerationalId + "at " + calculateNextRunTime);
                androidx.work.impl.background.systemalarm.Alarms.setAlarm(this.mContext, workDatabase, readWorkGenerationalId, calculateNextRunTime);
            } else {
                androidx.work.Logger.get().debug(str, "Opportunistically setting an alarm for " + readWorkGenerationalId + "at " + calculateNextRunTime);
                androidx.work.impl.background.systemalarm.Alarms.setAlarm(this.mContext, workDatabase, readWorkGenerationalId, calculateNextRunTime);
                dispatcher.getTaskExecutor().getMainThreadExecutor().execute(new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.AddRunnable(dispatcher, createConstraintsChangedIntent(this.mContext), startId));
            }
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
        }
    }

    private void handleDelayMet(android.content.Intent intent, int startId, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
        synchronized (this.mLock) {
            androidx.work.impl.model.WorkGenerationalId readWorkGenerationalId = readWorkGenerationalId(intent);
            androidx.work.Logger logger = androidx.work.Logger.get();
            java.lang.String str = TAG;
            logger.debug(str, "Handing delay met for " + readWorkGenerationalId);
            if (!this.mPendingDelayMet.containsKey(readWorkGenerationalId)) {
                androidx.work.impl.background.systemalarm.DelayMetCommandHandler delayMetCommandHandler = new androidx.work.impl.background.systemalarm.DelayMetCommandHandler(this.mContext, startId, dispatcher, this.mStartStopTokens.tokenFor(readWorkGenerationalId));
                this.mPendingDelayMet.put(readWorkGenerationalId, delayMetCommandHandler);
                delayMetCommandHandler.handleProcessWork();
            } else {
                androidx.work.Logger.get().debug(str, "WorkSpec " + readWorkGenerationalId + " is is already being handled for ACTION_DELAY_MET");
            }
        }
    }

    private void handleStopWork(android.content.Intent intent, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
        java.util.List<androidx.work.impl.StartStopToken> remove;
        android.os.Bundle extras = intent.getExtras();
        java.lang.String string = extras.getString(KEY_WORKSPEC_ID);
        if (extras.containsKey(KEY_WORKSPEC_GENERATION)) {
            int i = extras.getInt(KEY_WORKSPEC_GENERATION);
            remove = new java.util.ArrayList<>(1);
            androidx.work.impl.StartStopToken remove2 = this.mStartStopTokens.remove(new androidx.work.impl.model.WorkGenerationalId(string, i));
            if (remove2 != null) {
                remove.add(remove2);
            }
        } else {
            remove = this.mStartStopTokens.remove(string);
        }
        for (androidx.work.impl.StartStopToken startStopToken : remove) {
            androidx.work.Logger.get().debug(TAG, "Handing stopWork work for " + string);
            dispatcher.getWorkManager().stopWork(startStopToken);
            androidx.work.impl.background.systemalarm.Alarms.cancelAlarm(this.mContext, dispatcher.getWorkManager().getWorkDatabase(), startStopToken.getId());
            dispatcher.m4930lambda$runOnExecuted$1$androidxworkimplProcessor(startStopToken.getId(), false);
        }
    }

    private void handleConstraintsChanged(android.content.Intent intent, int startId, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
        androidx.work.Logger.get().debug(TAG, "Handling constraints changed " + intent);
        new androidx.work.impl.background.systemalarm.ConstraintsCommandHandler(this.mContext, startId, dispatcher).handleConstraintsChanged();
    }

    private void handleReschedule(android.content.Intent intent, int startId, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
        androidx.work.Logger.get().debug(TAG, "Handling reschedule " + intent + ", " + startId);
        dispatcher.getWorkManager().rescheduleEligibleWork();
    }

    private void handleExecutionCompleted(android.content.Intent intent, int startId) {
        androidx.work.impl.model.WorkGenerationalId readWorkGenerationalId = readWorkGenerationalId(intent);
        boolean z = intent.getExtras().getBoolean(KEY_NEEDS_RESCHEDULE);
        androidx.work.Logger.get().debug(TAG, "Handling onExecutionCompleted " + intent + ", " + startId);
        m4930lambda$runOnExecuted$1$androidxworkimplProcessor(readWorkGenerationalId, z);
    }

    private static boolean hasKeys(android.os.Bundle bundle, java.lang.String... keys) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (java.lang.String str : keys) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }
}

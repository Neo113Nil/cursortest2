package androidx.work.impl.utils;

/* loaded from: classes2.dex */
public class ForceStopRunnable implements java.lang.Runnable {
    static final java.lang.String ACTION_FORCE_STOP_RESCHEDULE = "ACTION_FORCE_STOP_RESCHEDULE";
    private static final int ALARM_ID = -1;
    private static final long BACKOFF_DURATION_MS = 300;
    static final int MAX_ATTEMPTS = 3;
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("ForceStopRunnable");
    private static final long TEN_YEARS = java.util.concurrent.TimeUnit.DAYS.toMillis(3650);
    private final android.content.Context mContext;
    private final androidx.work.impl.utils.PreferenceUtils mPreferenceUtils;
    private int mRetryCount = 0;
    private final androidx.work.impl.WorkManagerImpl mWorkManager;

    public ForceStopRunnable(android.content.Context context, androidx.work.impl.WorkManagerImpl workManager) {
        this.mContext = context.getApplicationContext();
        this.mWorkManager = workManager;
        this.mPreferenceUtils = workManager.getPreferenceUtils();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (multiProcessChecks()) {
                while (true) {
                    try {
                        androidx.work.impl.WorkDatabasePathHelper.migrateDatabase(this.mContext);
                        androidx.work.Logger.get().debug(TAG, "Performing cleanup operations.");
                        try {
                            forceStopRunnable();
                            break;
                        } catch (android.database.sqlite.SQLiteAccessPermException | android.database.sqlite.SQLiteCantOpenDatabaseException | android.database.sqlite.SQLiteConstraintException | android.database.sqlite.SQLiteDatabaseCorruptException | android.database.sqlite.SQLiteDatabaseLockedException | android.database.sqlite.SQLiteDiskIOException | android.database.sqlite.SQLiteTableLockedException e) {
                            i = this.mRetryCount + 1;
                            this.mRetryCount = i;
                            if (i >= 3) {
                                androidx.work.Logger logger = androidx.work.Logger.get();
                                java.lang.String str = TAG;
                                logger.error(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                                androidx.core.util.Consumer<java.lang.Throwable> initializationExceptionHandler = this.mWorkManager.getConfiguration().getInitializationExceptionHandler();
                                if (initializationExceptionHandler != null) {
                                    androidx.work.Logger.get().debug(str, "Routing exception to the specified exception handler", illegalStateException);
                                    initializationExceptionHandler.accept(illegalStateException);
                                } else {
                                    throw illegalStateException;
                                }
                            } else {
                                long j = i * BACKOFF_DURATION_MS;
                                androidx.work.Logger.get().debug(TAG, "Retrying after " + j, e);
                                sleep(((long) this.mRetryCount) * BACKOFF_DURATION_MS);
                            }
                        }
                        long j2 = i * BACKOFF_DURATION_MS;
                        androidx.work.Logger.get().debug(TAG, "Retrying after " + j2, e);
                        sleep(((long) this.mRetryCount) * BACKOFF_DURATION_MS);
                    } catch (android.database.sqlite.SQLiteException e2) {
                        androidx.work.Logger.get().error(TAG, "Unexpected SQLite exception during migrations");
                        java.lang.IllegalStateException illegalStateException2 = new java.lang.IllegalStateException("Unexpected SQLite exception during migrations", e2);
                        androidx.core.util.Consumer<java.lang.Throwable> initializationExceptionHandler2 = this.mWorkManager.getConfiguration().getInitializationExceptionHandler();
                        if (initializationExceptionHandler2 != null) {
                            initializationExceptionHandler2.accept(illegalStateException2);
                        } else {
                            throw illegalStateException2;
                        }
                    }
                }
            }
        } finally {
            this.mWorkManager.onForceStopRunnableCompleted();
        }
    }

    public boolean isForceStopped() {
        try {
            android.app.PendingIntent pendingIntent = getPendingIntent(this.mContext, android.os.Build.VERSION.SDK_INT >= 31 ? 570425344 : 536870912);
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                if (pendingIntent != null) {
                    pendingIntent.cancel();
                }
                java.util.List<android.app.ApplicationExitInfo> historicalProcessExitReasons = ((android.app.ActivityManager) this.mContext.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long lastForceStopEventMillis = this.mPreferenceUtils.getLastForceStopEventMillis();
                    for (int i = 0; i < historicalProcessExitReasons.size(); i++) {
                        android.app.ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i);
                        if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= lastForceStopEventMillis) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntent == null) {
                setAlarm(this.mContext);
                return true;
            }
            return false;
        } catch (java.lang.IllegalArgumentException | java.lang.SecurityException e) {
            androidx.work.Logger.get().warning(TAG, "Ignoring exception", e);
            return true;
        }
    }

    public void forceStopRunnable() {
        boolean cleanUp = cleanUp();
        if (shouldRescheduleWorkers()) {
            androidx.work.Logger.get().debug(TAG, "Rescheduling Workers.");
            this.mWorkManager.rescheduleEligibleWork();
            this.mWorkManager.getPreferenceUtils().setNeedsReschedule(false);
        } else if (isForceStopped()) {
            androidx.work.Logger.get().debug(TAG, "Application was force-stopped, rescheduling.");
            this.mWorkManager.rescheduleEligibleWork();
            this.mPreferenceUtils.setLastForceStopEventMillis(java.lang.System.currentTimeMillis());
        } else if (cleanUp) {
            androidx.work.Logger.get().debug(TAG, "Found unfinished work, scheduling it.");
            androidx.work.impl.Schedulers.schedule(this.mWorkManager.getConfiguration(), this.mWorkManager.getWorkDatabase(), this.mWorkManager.getSchedulers());
        }
    }

    public boolean cleanUp() {
        boolean reconcileJobs = android.os.Build.VERSION.SDK_INT >= 23 ? androidx.work.impl.background.systemjob.SystemJobScheduler.reconcileJobs(this.mContext, this.mWorkManager) : false;
        androidx.work.impl.WorkDatabase workDatabase = this.mWorkManager.getWorkDatabase();
        androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        androidx.work.impl.model.WorkProgressDao workProgressDao = workDatabase.workProgressDao();
        workDatabase.beginTransaction();
        try {
            java.util.List<androidx.work.impl.model.WorkSpec> runningWork = workSpecDao.getRunningWork();
            boolean z = (runningWork == null || runningWork.isEmpty()) ? false : true;
            if (z) {
                for (androidx.work.impl.model.WorkSpec workSpec : runningWork) {
                    workSpecDao.setState(androidx.work.WorkInfo.State.ENQUEUED, workSpec.id);
                    workSpecDao.markWorkSpecScheduled(workSpec.id, -1L);
                }
            }
            workProgressDao.deleteAll();
            workDatabase.setTransactionSuccessful();
            return z || reconcileJobs;
        } finally {
            workDatabase.endTransaction();
        }
    }

    public boolean shouldRescheduleWorkers() {
        return this.mWorkManager.getPreferenceUtils().getNeedsReschedule();
    }

    public boolean multiProcessChecks() {
        androidx.work.Configuration configuration = this.mWorkManager.getConfiguration();
        if (android.text.TextUtils.isEmpty(configuration.getDefaultProcessName())) {
            androidx.work.Logger.get().debug(TAG, "The default process name was not specified.");
            return true;
        }
        boolean isDefaultProcess = androidx.work.impl.utils.ProcessUtils.isDefaultProcess(this.mContext, configuration);
        androidx.work.Logger.get().debug(TAG, "Is default app process = " + isDefaultProcess);
        return isDefaultProcess;
    }

    public void sleep(long duration) {
        try {
            java.lang.Thread.sleep(duration);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    private static android.app.PendingIntent getPendingIntent(android.content.Context context, int flags) {
        return android.app.PendingIntent.getBroadcast(context, -1, getIntent(context), flags);
    }

    static android.content.Intent getIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(context, (java.lang.Class<?>) androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver.class));
        intent.setAction(ACTION_FORCE_STOP_RESCHEDULE);
        return intent;
    }

    static void setAlarm(android.content.Context context) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM);
        android.app.PendingIntent pendingIntent = getPendingIntent(context, android.os.Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = java.lang.System.currentTimeMillis() + TEN_YEARS;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, pendingIntent);
        }
    }

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (intent == null || !androidx.work.impl.utils.ForceStopRunnable.ACTION_FORCE_STOP_RESCHEDULE.equals(intent.getAction())) {
                return;
            }
            androidx.work.Logger.get().verbose(TAG, "Rescheduling alarm that keeps track of force-stops.");
            androidx.work.impl.utils.ForceStopRunnable.setAlarm(context);
        }
    }
}

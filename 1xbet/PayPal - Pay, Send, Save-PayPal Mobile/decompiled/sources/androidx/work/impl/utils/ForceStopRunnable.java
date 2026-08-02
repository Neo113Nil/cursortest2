package androidx.work.impl.utils;

/* loaded from: classes3.dex */
public class ForceStopRunnable implements java.lang.Runnable {
    private final androidx.work.impl.utils.PreferenceUtils Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRangesFor = 0;
    private final android.content.Context getHighSpeedVideoSizes;
    private final androidx.work.impl.WorkManagerImpl getInputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.work.Logger.tagWithPrefix("ForceStopRunnable");
    private static final long getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.TimeUnit.DAYS.toMillis(3650);

    public ForceStopRunnable(android.content.Context context, androidx.work.impl.WorkManagerImpl workManagerImpl) {
        this.getHighSpeedVideoSizes = context.getApplicationContext();
        this.getInputSizeshNQ4ISI = workManagerImpl;
        this.Camera2StreamConfigurationMap = workManagerImpl.getPreferenceUtils();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        java.lang.String str;
        try {
            if (multiProcessChecks()) {
                while (true) {
                    try {
                        androidx.work.impl.WorkDatabasePathHelper.migrateDatabase(this.getHighSpeedVideoSizes);
                        androidx.work.Logger.get().debug(getHighSpeedVideoFpsRanges, "Performing cleanup operations.");
                        try {
                            forceStopRunnable();
                            break;
                        } catch (android.database.sqlite.SQLiteAccessPermException | android.database.sqlite.SQLiteCantOpenDatabaseException | android.database.sqlite.SQLiteConstraintException | android.database.sqlite.SQLiteDatabaseCorruptException | android.database.sqlite.SQLiteDatabaseLockedException | android.database.sqlite.SQLiteDiskIOException | android.database.sqlite.SQLiteFullException | android.database.sqlite.SQLiteTableLockedException e) {
                            i = this.getHighSpeedVideoFpsRangesFor + 1;
                            this.getHighSpeedVideoFpsRangesFor = i;
                            if (i >= 3) {
                                if (androidx.core.os.UserManagerCompat.isUserUnlocked(this.getHighSpeedVideoSizes)) {
                                    str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                                } else {
                                    str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                }
                                androidx.work.Logger logger = androidx.work.Logger.get();
                                java.lang.String str2 = getHighSpeedVideoFpsRanges;
                                logger.error(str2, str, e);
                                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(str, e);
                                androidx.core.util.Consumer<java.lang.Throwable> initializationExceptionHandler = this.getInputSizeshNQ4ISI.getConfiguration().getInitializationExceptionHandler();
                                if (initializationExceptionHandler != null) {
                                    androidx.work.Logger.get().debug(str2, "Routing exception to the specified exception handler", illegalStateException);
                                    initializationExceptionHandler.accept(illegalStateException);
                                } else {
                                    throw illegalStateException;
                                }
                            } else {
                                androidx.work.Logger logger2 = androidx.work.Logger.get();
                                java.lang.String str3 = getHighSpeedVideoFpsRanges;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append("Retrying after ");
                                sb.append(i * 300);
                                logger2.debug(str3, sb.toString(), e);
                                sleep(this.getHighSpeedVideoFpsRangesFor * 300);
                            }
                        }
                        androidx.work.Logger logger22 = androidx.work.Logger.get();
                        java.lang.String str32 = getHighSpeedVideoFpsRanges;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("Retrying after ");
                        sb2.append(i * 300);
                        logger22.debug(str32, sb2.toString(), e);
                        sleep(this.getHighSpeedVideoFpsRangesFor * 300);
                    } catch (android.database.sqlite.SQLiteException e2) {
                        androidx.work.Logger.get().error(getHighSpeedVideoFpsRanges, "Unexpected SQLite exception during migrations");
                        java.lang.IllegalStateException illegalStateException2 = new java.lang.IllegalStateException("Unexpected SQLite exception during migrations", e2);
                        androidx.core.util.Consumer<java.lang.Throwable> initializationExceptionHandler2 = this.getInputSizeshNQ4ISI.getConfiguration().getInitializationExceptionHandler();
                        if (initializationExceptionHandler2 != null) {
                            initializationExceptionHandler2.accept(illegalStateException2);
                        } else {
                            throw illegalStateException2;
                        }
                    }
                }
            }
        } finally {
            this.getInputSizeshNQ4ISI.onForceStopRunnableCompleted();
        }
    }

    public boolean isForceStopped() {
        try {
            android.app.PendingIntent highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, android.os.Build.VERSION.SDK_INT >= 31 ? 570425344 : 536870912);
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                if (highResolutionOutputSizeshNQ4ISI != null) {
                    highResolutionOutputSizeshNQ4ISI.cancel();
                }
                java.util.List<android.app.ApplicationExitInfo> historicalProcessExitReasons = ((android.app.ActivityManager) this.getHighSpeedVideoSizes.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long lastForceStopEventMillis = this.Camera2StreamConfigurationMap.getLastForceStopEventMillis();
                    for (int i = 0; i < historicalProcessExitReasons.size(); i++) {
                        android.app.ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i);
                        if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= lastForceStopEventMillis) {
                            return true;
                        }
                    }
                }
            } else if (highResolutionOutputSizeshNQ4ISI == null) {
                getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
                return true;
            }
            return false;
        } catch (java.lang.IllegalArgumentException | java.lang.SecurityException e) {
            androidx.work.Logger.get().warning(getHighSpeedVideoFpsRanges, "Ignoring exception", e);
            return true;
        }
    }

    public void forceStopRunnable() {
        boolean cleanUp = cleanUp();
        if (shouldRescheduleWorkers()) {
            androidx.work.Logger.get().debug(getHighSpeedVideoFpsRanges, "Rescheduling Workers.");
            this.getInputSizeshNQ4ISI.rescheduleEligibleWork();
            this.getInputSizeshNQ4ISI.getPreferenceUtils().setNeedsReschedule(false);
        } else if (isForceStopped()) {
            androidx.work.Logger.get().debug(getHighSpeedVideoFpsRanges, "Application was force-stopped, rescheduling.");
            this.getInputSizeshNQ4ISI.rescheduleEligibleWork();
            this.Camera2StreamConfigurationMap.setLastForceStopEventMillis(this.getInputSizeshNQ4ISI.getConfiguration().getClock().currentTimeMillis());
        } else if (cleanUp) {
            androidx.work.Logger.get().debug(getHighSpeedVideoFpsRanges, "Found unfinished work, scheduling it.");
            androidx.work.impl.Schedulers.schedule(this.getInputSizeshNQ4ISI.getConfiguration(), this.getInputSizeshNQ4ISI.getWorkDatabase(), this.getInputSizeshNQ4ISI.getSchedulers());
        }
    }

    public boolean cleanUp() {
        boolean reconcileJobs = androidx.work.impl.background.systemjob.SystemJobScheduler.reconcileJobs(this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI.getWorkDatabase());
        androidx.work.impl.WorkDatabase workDatabase = this.getInputSizeshNQ4ISI.getWorkDatabase();
        androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        androidx.work.impl.model.WorkProgressDao workProgressDao = workDatabase.workProgressDao();
        workDatabase.beginTransaction();
        try {
            java.util.List<androidx.work.impl.model.WorkSpec> runningWork = workSpecDao.getRunningWork();
            boolean z = (runningWork == null || runningWork.isEmpty()) ? false : true;
            if (z) {
                for (androidx.work.impl.model.WorkSpec workSpec : runningWork) {
                    workSpecDao.setState(androidx.work.WorkInfo.State.ENQUEUED, workSpec.id);
                    workSpecDao.setStopReason(workSpec.id, androidx.work.WorkInfo.STOP_REASON_UNKNOWN);
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
        return this.getInputSizeshNQ4ISI.getPreferenceUtils().getNeedsReschedule();
    }

    public boolean multiProcessChecks() {
        androidx.work.Configuration configuration = this.getInputSizeshNQ4ISI.getConfiguration();
        if (android.text.TextUtils.isEmpty(configuration.getDefaultProcessName())) {
            androidx.work.Logger.get().debug(getHighSpeedVideoFpsRanges, "The default process name was not specified.");
            return true;
        }
        boolean isDefaultProcess = androidx.work.impl.utils.ProcessUtils.isDefaultProcess(this.getHighSpeedVideoSizes, configuration);
        androidx.work.Logger.get().debug(getHighSpeedVideoFpsRanges, "Is default app process = ".concat(java.lang.String.valueOf(isDefaultProcess)));
        return isDefaultProcess;
    }

    public void sleep(long j) {
        try {
            java.lang.Thread.sleep(j);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    static void getHighSpeedVideoFpsRanges(android.content.Context context) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM);
        android.app.PendingIntent highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(context, android.os.Build.VERSION.SDK_INT >= 31 ? 167772160 : androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j = getHighResolutionOutputSizeshNQ4ISI;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis + j, highResolutionOutputSizeshNQ4ISI);
        }
    }

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.work.Logger.tagWithPrefix("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            androidx.work.Logger.get().verbose(getHighSpeedVideoFpsRanges, "Rescheduling alarm that keeps track of force-stops.");
            androidx.work.impl.utils.ForceStopRunnable.getHighSpeedVideoFpsRanges(context);
        }
    }

    private static android.app.PendingIntent getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, int i) {
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(context, (java.lang.Class<?>) androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return android.app.PendingIntent.getBroadcast(context, -1, intent, i);
    }
}

package androidx.work.impl;

/* loaded from: classes2.dex */
public class Schedulers {
    public static final java.lang.String GCM_SCHEDULER = "androidx.work.impl.background.gcm.GcmScheduler";
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("Schedulers");

    public static void schedule(androidx.work.Configuration configuration, androidx.work.impl.WorkDatabase workDatabase, java.util.List<androidx.work.impl.Scheduler> schedulers) {
        if (schedulers == null || schedulers.size() == 0) {
            return;
        }
        androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            java.util.List<androidx.work.impl.model.WorkSpec> eligibleWorkForScheduling = workSpecDao.getEligibleWorkForScheduling(configuration.getMaxSchedulerLimit());
            java.util.List<androidx.work.impl.model.WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
            if (eligibleWorkForScheduling != null && eligibleWorkForScheduling.size() > 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.Iterator<androidx.work.impl.model.WorkSpec> it = eligibleWorkForScheduling.iterator();
                while (it.hasNext()) {
                    workSpecDao.markWorkSpecScheduled(it.next().id, currentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            if (eligibleWorkForScheduling != null && eligibleWorkForScheduling.size() > 0) {
                androidx.work.impl.model.WorkSpec[] workSpecArr = (androidx.work.impl.model.WorkSpec[]) eligibleWorkForScheduling.toArray(new androidx.work.impl.model.WorkSpec[eligibleWorkForScheduling.size()]);
                for (androidx.work.impl.Scheduler scheduler : schedulers) {
                    if (scheduler.hasLimitedSchedulingSlots()) {
                        scheduler.schedule(workSpecArr);
                    }
                }
            }
            if (allEligibleWorkSpecsForScheduling == null || allEligibleWorkSpecsForScheduling.size() <= 0) {
                return;
            }
            androidx.work.impl.model.WorkSpec[] workSpecArr2 = (androidx.work.impl.model.WorkSpec[]) allEligibleWorkSpecsForScheduling.toArray(new androidx.work.impl.model.WorkSpec[allEligibleWorkSpecsForScheduling.size()]);
            for (androidx.work.impl.Scheduler scheduler2 : schedulers) {
                if (!scheduler2.hasLimitedSchedulingSlots()) {
                    scheduler2.schedule(workSpecArr2);
                }
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    static androidx.work.impl.Scheduler createBestAvailableBackgroundScheduler(android.content.Context context, androidx.work.impl.WorkManagerImpl workManager) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            androidx.work.impl.background.systemjob.SystemJobScheduler systemJobScheduler = new androidx.work.impl.background.systemjob.SystemJobScheduler(context, workManager);
            androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(context, androidx.work.impl.background.systemjob.SystemJobService.class, true);
            androidx.work.Logger.get().debug(TAG, "Created SystemJobScheduler and enabled SystemJobService");
            return systemJobScheduler;
        }
        androidx.work.impl.Scheduler tryCreateGcmBasedScheduler = tryCreateGcmBasedScheduler(context);
        if (tryCreateGcmBasedScheduler != null) {
            return tryCreateGcmBasedScheduler;
        }
        androidx.work.impl.background.systemalarm.SystemAlarmScheduler systemAlarmScheduler = new androidx.work.impl.background.systemalarm.SystemAlarmScheduler(context);
        androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(context, androidx.work.impl.background.systemalarm.SystemAlarmService.class, true);
        androidx.work.Logger.get().debug(TAG, "Created SystemAlarmScheduler");
        return systemAlarmScheduler;
    }

    private static androidx.work.impl.Scheduler tryCreateGcmBasedScheduler(android.content.Context context) {
        try {
            androidx.work.impl.Scheduler scheduler = (androidx.work.impl.Scheduler) java.lang.Class.forName(GCM_SCHEDULER).getConstructor(android.content.Context.class).newInstance(context);
            androidx.work.Logger.get().debug(TAG, "Created androidx.work.impl.background.gcm.GcmScheduler");
            return scheduler;
        } catch (java.lang.Throwable th) {
            androidx.work.Logger.get().debug(TAG, "Unable to create GCM Scheduler", th);
            return null;
        }
    }

    private Schedulers() {
    }
}

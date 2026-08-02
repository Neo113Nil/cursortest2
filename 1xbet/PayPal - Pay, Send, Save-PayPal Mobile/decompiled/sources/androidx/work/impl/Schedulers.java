package androidx.work.impl;

/* loaded from: classes3.dex */
public class Schedulers {
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.work.Logger.tagWithPrefix("Schedulers");

    public static void registerRescheduling(final java.util.List<androidx.work.impl.Scheduler> list, androidx.work.impl.Processor processor, final java.util.concurrent.Executor executor, final androidx.work.impl.WorkDatabase workDatabase, final androidx.work.Configuration configuration) {
        processor.addExecutionListener(new androidx.work.impl.ExecutionListener() { // from class: androidx.work.impl.Schedulers$$ExternalSyntheticLambda0
            @Override // androidx.work.impl.ExecutionListener
            public final void onExecuted(androidx.work.impl.model.WorkGenerationalId workGenerationalId, boolean z) {
                executor.execute(new java.lang.Runnable() { // from class: androidx.work.impl.Schedulers$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.work.impl.Schedulers.getHighSpeedVideoFpsRangesFor(r1, workGenerationalId, r3, r4);
                    }
                });
            }
        });
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.util.List list, androidx.work.impl.model.WorkGenerationalId workGenerationalId, androidx.work.Configuration configuration, androidx.work.impl.WorkDatabase workDatabase) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((androidx.work.impl.Scheduler) it.next()).cancel(workGenerationalId.getWorkSpecId());
        }
        schedule(configuration, workDatabase, list);
    }

    public static void schedule(androidx.work.Configuration configuration, androidx.work.impl.WorkDatabase workDatabase, java.util.List<androidx.work.impl.Scheduler> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            java.util.List<androidx.work.impl.model.WorkSpec> eligibleWorkForSchedulingWithContentUris = workSpecDao.getEligibleWorkForSchedulingWithContentUris();
            getHighSpeedVideoFpsRanges(workSpecDao, configuration.getClock(), eligibleWorkForSchedulingWithContentUris);
            java.util.List<androidx.work.impl.model.WorkSpec> eligibleWorkForScheduling = workSpecDao.getEligibleWorkForScheduling(configuration.getMaxSchedulerLimit());
            getHighSpeedVideoFpsRanges(workSpecDao, configuration.getClock(), eligibleWorkForScheduling);
            if (eligibleWorkForSchedulingWithContentUris != null) {
                eligibleWorkForScheduling.addAll(eligibleWorkForSchedulingWithContentUris);
            }
            java.util.List<androidx.work.impl.model.WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (eligibleWorkForScheduling.size() > 0) {
                androidx.work.impl.model.WorkSpec[] workSpecArr = (androidx.work.impl.model.WorkSpec[]) eligibleWorkForScheduling.toArray(new androidx.work.impl.model.WorkSpec[eligibleWorkForScheduling.size()]);
                for (androidx.work.impl.Scheduler scheduler : list) {
                    if (scheduler.hasLimitedSchedulingSlots()) {
                        scheduler.schedule(workSpecArr);
                    }
                }
            }
            if (allEligibleWorkSpecsForScheduling.size() > 0) {
                androidx.work.impl.model.WorkSpec[] workSpecArr2 = (androidx.work.impl.model.WorkSpec[]) allEligibleWorkSpecsForScheduling.toArray(new androidx.work.impl.model.WorkSpec[allEligibleWorkSpecsForScheduling.size()]);
                for (androidx.work.impl.Scheduler scheduler2 : list) {
                    if (!scheduler2.hasLimitedSchedulingSlots()) {
                        scheduler2.schedule(workSpecArr2);
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    static androidx.work.impl.Scheduler getHighSpeedVideoFpsRanges(android.content.Context context, androidx.work.impl.WorkDatabase workDatabase, androidx.work.Configuration configuration) {
        androidx.work.impl.background.systemjob.SystemJobScheduler systemJobScheduler = new androidx.work.impl.background.systemjob.SystemJobScheduler(context, workDatabase, configuration);
        androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(context, androidx.work.impl.background.systemjob.SystemJobService.class, true);
        androidx.work.Logger.get().debug(Camera2StreamConfigurationMap, "Created SystemJobScheduler and enabled SystemJobService");
        return systemJobScheduler;
    }

    private Schedulers() {
    }

    private static void getHighSpeedVideoFpsRanges(androidx.work.impl.model.WorkSpecDao workSpecDao, androidx.work.Clock clock, java.util.List<androidx.work.impl.model.WorkSpec> list) {
        if (list.size() > 0) {
            long currentTimeMillis = clock.currentTimeMillis();
            java.util.Iterator<androidx.work.impl.model.WorkSpec> it = list.iterator();
            while (it.hasNext()) {
                workSpecDao.markWorkSpecScheduled(it.next().id, currentTimeMillis);
            }
        }
    }
}

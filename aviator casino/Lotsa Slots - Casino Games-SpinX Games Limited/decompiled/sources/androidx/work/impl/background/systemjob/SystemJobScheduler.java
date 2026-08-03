package androidx.work.impl.background.systemjob;

/* loaded from: classes2.dex */
public class SystemJobScheduler implements androidx.work.impl.Scheduler {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("SystemJobScheduler");
    private final android.content.Context mContext;
    private final android.app.job.JobScheduler mJobScheduler;
    private final androidx.work.impl.background.systemjob.SystemJobInfoConverter mSystemJobInfoConverter;
    private final androidx.work.impl.WorkManagerImpl mWorkManager;

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    public SystemJobScheduler(android.content.Context context, androidx.work.impl.WorkManagerImpl workManager) {
        this(context, workManager, (android.app.job.JobScheduler) context.getSystemService("jobscheduler"), new androidx.work.impl.background.systemjob.SystemJobInfoConverter(context));
    }

    public SystemJobScheduler(android.content.Context context, androidx.work.impl.WorkManagerImpl workManager, android.app.job.JobScheduler jobScheduler, androidx.work.impl.background.systemjob.SystemJobInfoConverter systemJobInfoConverter) {
        this.mContext = context;
        this.mWorkManager = workManager;
        this.mJobScheduler = jobScheduler;
        this.mSystemJobInfoConverter = systemJobInfoConverter;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(androidx.work.impl.model.WorkSpec... workSpecs) {
        java.util.List<java.lang.Integer> pendingJobIds;
        int nextJobSchedulerIdWithRange;
        androidx.work.impl.WorkDatabase workDatabase = this.mWorkManager.getWorkDatabase();
        androidx.work.impl.utils.IdGenerator idGenerator = new androidx.work.impl.utils.IdGenerator(workDatabase);
        for (androidx.work.impl.model.WorkSpec workSpec : workSpecs) {
            workDatabase.beginTransaction();
            try {
                androidx.work.impl.model.WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(workSpec.id);
                if (workSpec2 == null) {
                    androidx.work.Logger.get().warning(TAG, "Skipping scheduling " + workSpec.id + " because it's no longer in the DB");
                    workDatabase.setTransactionSuccessful();
                } else if (workSpec2.state != androidx.work.WorkInfo.State.ENQUEUED) {
                    androidx.work.Logger.get().warning(TAG, "Skipping scheduling " + workSpec.id + " because it is no longer enqueued");
                    workDatabase.setTransactionSuccessful();
                } else {
                    androidx.work.impl.model.WorkGenerationalId generationalId = androidx.work.impl.model.WorkSpecKt.generationalId(workSpec);
                    androidx.work.impl.model.SystemIdInfo systemIdInfo = workDatabase.systemIdInfoDao().getSystemIdInfo(generationalId);
                    int nextJobSchedulerIdWithRange2 = systemIdInfo != null ? systemIdInfo.systemId : idGenerator.nextJobSchedulerIdWithRange(this.mWorkManager.getConfiguration().getMinJobSchedulerId(), this.mWorkManager.getConfiguration().getMaxJobSchedulerId());
                    if (systemIdInfo == null) {
                        this.mWorkManager.getWorkDatabase().systemIdInfoDao().insertSystemIdInfo(androidx.work.impl.model.SystemIdInfoKt.systemIdInfo(generationalId, nextJobSchedulerIdWithRange2));
                    }
                    scheduleInternal(workSpec, nextJobSchedulerIdWithRange2);
                    if (android.os.Build.VERSION.SDK_INT == 23 && (pendingJobIds = getPendingJobIds(this.mContext, this.mJobScheduler, workSpec.id)) != null) {
                        int indexOf = pendingJobIds.indexOf(java.lang.Integer.valueOf(nextJobSchedulerIdWithRange2));
                        if (indexOf >= 0) {
                            pendingJobIds.remove(indexOf);
                        }
                        if (!pendingJobIds.isEmpty()) {
                            nextJobSchedulerIdWithRange = pendingJobIds.get(0).intValue();
                        } else {
                            nextJobSchedulerIdWithRange = idGenerator.nextJobSchedulerIdWithRange(this.mWorkManager.getConfiguration().getMinJobSchedulerId(), this.mWorkManager.getConfiguration().getMaxJobSchedulerId());
                        }
                        scheduleInternal(workSpec, nextJobSchedulerIdWithRange);
                    }
                    workDatabase.setTransactionSuccessful();
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    public void scheduleInternal(androidx.work.impl.model.WorkSpec workSpec, int jobId) {
        android.app.job.JobInfo convert = this.mSystemJobInfoConverter.convert(workSpec, jobId);
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String str = TAG;
        logger.debug(str, "Scheduling work ID " + workSpec.id + "Job ID " + jobId);
        try {
            if (this.mJobScheduler.schedule(convert) == 0) {
                androidx.work.Logger.get().warning(str, "Unable to schedule work ID " + workSpec.id);
                if (workSpec.expedited && workSpec.outOfQuotaPolicy == androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.expedited = false;
                    androidx.work.Logger.get().debug(str, java.lang.String.format("Scheduling a non-expedited job (work ID %s)", workSpec.id));
                    scheduleInternal(workSpec, jobId);
                }
            }
        } catch (java.lang.IllegalStateException e) {
            java.util.List<android.app.job.JobInfo> pendingJobs = getPendingJobs(this.mContext, this.mJobScheduler);
            java.lang.String format = java.lang.String.format(java.util.Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", java.lang.Integer.valueOf(pendingJobs != null ? pendingJobs.size() : 0), java.lang.Integer.valueOf(this.mWorkManager.getWorkDatabase().workSpecDao().getScheduledWork().size()), java.lang.Integer.valueOf(this.mWorkManager.getConfiguration().getMaxSchedulerLimit()));
            androidx.work.Logger.get().error(TAG, format);
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(format, e);
            androidx.core.util.Consumer<java.lang.Throwable> schedulingExceptionHandler = this.mWorkManager.getConfiguration().getSchedulingExceptionHandler();
            if (schedulingExceptionHandler != null) {
                schedulingExceptionHandler.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (java.lang.Throwable th) {
            androidx.work.Logger.get().error(TAG, "Unable to schedule " + workSpec, th);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(java.lang.String workSpecId) {
        java.util.List<java.lang.Integer> pendingJobIds = getPendingJobIds(this.mContext, this.mJobScheduler, workSpecId);
        if (pendingJobIds == null || pendingJobIds.isEmpty()) {
            return;
        }
        java.util.Iterator<java.lang.Integer> it = pendingJobIds.iterator();
        while (it.hasNext()) {
            cancelJobById(this.mJobScheduler, it.next().intValue());
        }
        this.mWorkManager.getWorkDatabase().systemIdInfoDao().removeSystemIdInfo(workSpecId);
    }

    private static void cancelJobById(android.app.job.JobScheduler jobScheduler, int id) {
        try {
            jobScheduler.cancel(id);
        } catch (java.lang.Throwable th) {
            androidx.work.Logger.get().error(TAG, java.lang.String.format(java.util.Locale.getDefault(), "Exception while trying to cancel job (%d)", java.lang.Integer.valueOf(id)), th);
        }
    }

    public static void cancelAll(android.content.Context context) {
        java.util.List<android.app.job.JobInfo> pendingJobs;
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (pendingJobs = getPendingJobs(context, jobScheduler)) == null || pendingJobs.isEmpty()) {
            return;
        }
        java.util.Iterator<android.app.job.JobInfo> it = pendingJobs.iterator();
        while (it.hasNext()) {
            cancelJobById(jobScheduler, it.next().getId());
        }
    }

    public static boolean reconcileJobs(android.content.Context context, androidx.work.impl.WorkManagerImpl workManager) {
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
        java.util.List<android.app.job.JobInfo> pendingJobs = getPendingJobs(context, jobScheduler);
        java.util.List<java.lang.String> workSpecIds = workManager.getWorkDatabase().systemIdInfoDao().getWorkSpecIds();
        boolean z = false;
        java.util.HashSet hashSet = new java.util.HashSet(pendingJobs != null ? pendingJobs.size() : 0);
        if (pendingJobs != null && !pendingJobs.isEmpty()) {
            for (android.app.job.JobInfo jobInfo : pendingJobs) {
                androidx.work.impl.model.WorkGenerationalId workGenerationalIdFromJobInfo = getWorkGenerationalIdFromJobInfo(jobInfo);
                if (workGenerationalIdFromJobInfo != null) {
                    hashSet.add(workGenerationalIdFromJobInfo.getWorkSpecId());
                } else {
                    cancelJobById(jobScheduler, jobInfo.getId());
                }
            }
        }
        java.util.Iterator<java.lang.String> it = workSpecIds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                androidx.work.Logger.get().debug(TAG, "Reconciling jobs");
                z = true;
                break;
            }
        }
        if (z) {
            androidx.work.impl.WorkDatabase workDatabase = workManager.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                java.util.Iterator<java.lang.String> it2 = workSpecIds.iterator();
                while (it2.hasNext()) {
                    workSpecDao.markWorkSpecScheduled(it2.next(), -1L);
                }
                workDatabase.setTransactionSuccessful();
            } finally {
                workDatabase.endTransaction();
            }
        }
        return z;
    }

    private static java.util.List<android.app.job.JobInfo> getPendingJobs(android.content.Context context, android.app.job.JobScheduler jobScheduler) {
        java.util.List<android.app.job.JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (java.lang.Throwable th) {
            androidx.work.Logger.get().error(TAG, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        android.content.ComponentName componentName = new android.content.ComponentName(context, (java.lang.Class<?>) androidx.work.impl.background.systemjob.SystemJobService.class);
        for (android.app.job.JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static java.util.List<java.lang.Integer> getPendingJobIds(android.content.Context context, android.app.job.JobScheduler jobScheduler, java.lang.String workSpecId) {
        java.util.List<android.app.job.JobInfo> pendingJobs = getPendingJobs(context, jobScheduler);
        if (pendingJobs == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        for (android.app.job.JobInfo jobInfo : pendingJobs) {
            androidx.work.impl.model.WorkGenerationalId workGenerationalIdFromJobInfo = getWorkGenerationalIdFromJobInfo(jobInfo);
            if (workGenerationalIdFromJobInfo != null && workSpecId.equals(workGenerationalIdFromJobInfo.getWorkSpecId())) {
                arrayList.add(java.lang.Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static androidx.work.impl.model.WorkGenerationalId getWorkGenerationalIdFromJobInfo(android.app.job.JobInfo jobInfo) {
        android.os.PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new androidx.work.impl.model.WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (java.lang.NullPointerException unused) {
            return null;
        }
    }
}

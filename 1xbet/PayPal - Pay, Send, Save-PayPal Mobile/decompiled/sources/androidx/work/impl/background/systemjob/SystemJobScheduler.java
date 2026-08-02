package androidx.work.impl.background.systemjob;

/* loaded from: classes3.dex */
public class SystemJobScheduler implements androidx.work.impl.Scheduler {
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.work.Logger.tagWithPrefix("SystemJobScheduler");
    private final androidx.work.impl.background.systemjob.SystemJobInfoConverter Camera2StreamConfigurationMap;
    private final androidx.work.Configuration getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private final android.app.job.JobScheduler getHighSpeedVideoSizes;
    private final androidx.work.impl.WorkDatabase getOutputMinFrameDuration;

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    public SystemJobScheduler(android.content.Context context, androidx.work.impl.WorkDatabase workDatabase, androidx.work.Configuration configuration) {
        this(context, workDatabase, configuration, androidx.work.impl.background.systemjob.JobSchedulerExtKt.getWmJobScheduler(context), new androidx.work.impl.background.systemjob.SystemJobInfoConverter(context, configuration.getClock(), configuration.getGetHighResolutionOutputSizeshNQ4ISI()));
    }

    public SystemJobScheduler(android.content.Context context, androidx.work.impl.WorkDatabase workDatabase, androidx.work.Configuration configuration, android.app.job.JobScheduler jobScheduler, androidx.work.impl.background.systemjob.SystemJobInfoConverter systemJobInfoConverter) {
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizes = jobScheduler;
        this.Camera2StreamConfigurationMap = systemJobInfoConverter;
        this.getOutputMinFrameDuration = workDatabase;
        this.getHighResolutionOutputSizeshNQ4ISI = configuration;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(androidx.work.impl.model.WorkSpec... workSpecArr) {
        androidx.work.impl.utils.IdGenerator idGenerator = new androidx.work.impl.utils.IdGenerator(this.getOutputMinFrameDuration);
        for (androidx.work.impl.model.WorkSpec workSpec : workSpecArr) {
            this.getOutputMinFrameDuration.beginTransaction();
            try {
                androidx.work.impl.model.WorkSpec workSpec2 = this.getOutputMinFrameDuration.workSpecDao().getWorkSpec(workSpec.id);
                if (workSpec2 == null) {
                    androidx.work.Logger logger = androidx.work.Logger.get();
                    java.lang.String str = getHighSpeedVideoFpsRangesFor;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Skipping scheduling ");
                    sb.append(workSpec.id);
                    sb.append(" because it's no longer in the DB");
                    logger.warning(str, sb.toString());
                    this.getOutputMinFrameDuration.setTransactionSuccessful();
                } else if (workSpec2.state != androidx.work.WorkInfo.State.ENQUEUED) {
                    androidx.work.Logger logger2 = androidx.work.Logger.get();
                    java.lang.String str2 = getHighSpeedVideoFpsRangesFor;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append("Skipping scheduling ");
                    sb2.append(workSpec.id);
                    sb2.append(" because it is no longer enqueued");
                    logger2.warning(str2, sb2.toString());
                    this.getOutputMinFrameDuration.setTransactionSuccessful();
                } else {
                    androidx.work.impl.model.WorkGenerationalId generationalId = androidx.work.impl.model.WorkSpecKt.generationalId(workSpec);
                    androidx.work.impl.model.SystemIdInfo systemIdInfo = this.getOutputMinFrameDuration.systemIdInfoDao().getSystemIdInfo(generationalId);
                    int nextJobSchedulerIdWithRange = systemIdInfo != null ? systemIdInfo.systemId : idGenerator.nextJobSchedulerIdWithRange(this.getHighResolutionOutputSizeshNQ4ISI.getMinJobSchedulerId(), this.getHighResolutionOutputSizeshNQ4ISI.getMaxJobSchedulerId());
                    if (systemIdInfo == null) {
                        this.getOutputMinFrameDuration.systemIdInfoDao().insertSystemIdInfo(androidx.work.impl.model.SystemIdInfoKt.systemIdInfo(generationalId, nextJobSchedulerIdWithRange));
                    }
                    scheduleInternal(workSpec, nextJobSchedulerIdWithRange);
                    this.getOutputMinFrameDuration.setTransactionSuccessful();
                }
                this.getOutputMinFrameDuration.endTransaction();
            } catch (java.lang.Throwable th) {
                this.getOutputMinFrameDuration.endTransaction();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void scheduleInternal(androidx.work.impl.model.WorkSpec workSpec, int i) {
        int i2;
        java.lang.String traceTag;
        androidx.work.impl.background.systemjob.SystemJobInfoConverter systemJobInfoConverter = this.Camera2StreamConfigurationMap;
        androidx.work.Constraints constraints = workSpec.constraints;
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.id);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", workSpec.getGeneration());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.isPeriodic());
        android.app.job.JobInfo.Builder extras = new android.app.job.JobInfo.Builder(i, systemJobInfoConverter.getHighSpeedVideoFpsRangesFor).setRequiresCharging(constraints.getGetHighSpeedVideoSizes()).setRequiresDeviceIdle(constraints.getCamera2StreamConfigurationMap()).setExtras(persistableBundle);
        android.net.NetworkRequest requiredNetworkRequest = constraints.getRequiredNetworkRequest();
        if (android.os.Build.VERSION.SDK_INT >= 28 && requiredNetworkRequest != null) {
            androidx.work.impl.background.systemjob.SystemJobInfoConverterExtKt.setRequiredNetworkRequest(extras, requiredNetworkRequest);
        } else {
            androidx.work.NetworkType requiredNetworkType = constraints.getRequiredNetworkType();
            if (android.os.Build.VERSION.SDK_INT >= 30 && requiredNetworkType == androidx.work.NetworkType.TEMPORARILY_UNMETERED) {
                extras.setRequiredNetwork(new android.net.NetworkRequest.Builder().addCapability(25).build());
            } else {
                int i3 = androidx.work.impl.background.systemjob.SystemJobInfoConverter.AnonymousClass1.getHighSpeedVideoFpsRanges[requiredNetworkType.ordinal()];
                if (i3 != 1) {
                    i2 = 2;
                    if (i3 != 2) {
                        if (i3 != 3) {
                            i2 = 4;
                            if (i3 == 4) {
                                i2 = 3;
                            } else if (i3 != 5) {
                                androidx.work.Logger.get().debug(androidx.work.impl.background.systemjob.SystemJobInfoConverter.Camera2StreamConfigurationMap, "API version too low. Cannot convert network type value ".concat(java.lang.String.valueOf(requiredNetworkType)));
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            }
        }
        if (!constraints.getCamera2StreamConfigurationMap()) {
            extras.setBackoffCriteria(workSpec.backoffDelayDuration, workSpec.backoffPolicy == androidx.work.BackoffPolicy.LINEAR ? 0 : 1);
        }
        long max = java.lang.Math.max(workSpec.calculateNextRunTime() - systemJobInfoConverter.getHighResolutionOutputSizeshNQ4ISI.currentTimeMillis(), 0L);
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!workSpec.expedited && systemJobInfoConverter.getHighSpeedVideoFpsRanges) {
            extras.setImportantWhileForeground(true);
        }
        if (constraints.hasContentUriTriggers()) {
            for (androidx.work.Constraints.ContentUriTrigger contentUriTrigger : constraints.getContentUriTriggers()) {
                extras.addTriggerContentUri(new android.app.job.JobInfo.TriggerContentUri(contentUriTrigger.getUri(), contentUriTrigger.getIsTriggeredForDescendants() ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(constraints.getContentTriggerUpdateDelayMillis());
            extras.setTriggerContentMaxDelay(constraints.getContentTriggerMaxDelayMillis());
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(constraints.getGetHighSpeedVideoFpsRangesFor());
        extras.setRequiresStorageNotLow(constraints.getGetHighSpeedVideoFpsRanges());
        java.lang.Object[] objArr = workSpec.runAttemptCount > 0;
        java.lang.Object[] objArr2 = max > 0;
        if (android.os.Build.VERSION.SDK_INT >= 31 && workSpec.expedited && objArr == false && objArr2 == false) {
            extras.setExpedited(true);
        }
        if (android.os.Build.VERSION.SDK_INT >= 35 && (traceTag = workSpec.getTraceTag()) != null) {
            extras.setTraceTag(traceTag);
        }
        android.app.job.JobInfo build = extras.build();
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String str = getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Scheduling work ID ");
        sb.append(workSpec.id);
        sb.append("Job ID ");
        sb.append(i);
        logger.debug(str, sb.toString());
        try {
            if (this.getHighSpeedVideoSizes.schedule(build) == 0) {
                androidx.work.Logger logger2 = androidx.work.Logger.get();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to schedule work ID ");
                sb2.append(workSpec.id);
                logger2.warning(str, sb2.toString());
                if (workSpec.expedited && workSpec.outOfQuotaPolicy == androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.expedited = false;
                    androidx.work.Logger.get().debug(str, java.lang.String.format("Scheduling a non-expedited job (work ID %s)", workSpec.id));
                    scheduleInternal(workSpec, i);
                }
            }
        } catch (java.lang.IllegalStateException e) {
            java.lang.String createErrorMessage = androidx.work.impl.background.systemjob.JobSchedulerExtKt.createErrorMessage(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI);
            androidx.work.Logger.get().error(getHighSpeedVideoFpsRangesFor, createErrorMessage);
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(createErrorMessage, e);
            androidx.core.util.Consumer<java.lang.Throwable> schedulingExceptionHandler = this.getHighResolutionOutputSizeshNQ4ISI.getSchedulingExceptionHandler();
            if (schedulingExceptionHandler != null) {
                schedulingExceptionHandler.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (java.lang.Throwable th) {
            androidx.work.Logger.get().error(getHighSpeedVideoFpsRangesFor, "Unable to schedule ".concat(java.lang.String.valueOf(workSpec)), th);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(java.lang.String str) {
        java.util.ArrayList arrayList;
        java.util.List<android.app.job.JobInfo> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        if (highSpeedVideoFpsRanges == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
            for (android.app.job.JobInfo jobInfo : highSpeedVideoFpsRanges) {
                androidx.work.impl.model.WorkGenerationalId highSpeedVideoSizes = getHighSpeedVideoSizes(jobInfo);
                if (highSpeedVideoSizes != null && str.equals(highSpeedVideoSizes.getWorkSpecId())) {
                    arrayList2.add(java.lang.Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, ((java.lang.Integer) it.next()).intValue());
        }
        this.getOutputMinFrameDuration.systemIdInfoDao().removeSystemIdInfo(str);
    }

    private static void Camera2StreamConfigurationMap(android.app.job.JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (java.lang.Throwable th) {
            androidx.work.Logger.get().error(getHighSpeedVideoFpsRangesFor, java.lang.String.format(java.util.Locale.getDefault(), "Exception while trying to cancel job (%d)", java.lang.Integer.valueOf(i)), th);
        }
    }

    public static void cancelAllInAllNamespaces(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.work.impl.background.systemjob.JobSchedulerExtKt.getWmJobScheduler(context).cancelAll();
        }
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
        java.util.List<android.app.job.JobInfo> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(context, jobScheduler);
        if (highSpeedVideoFpsRanges == null || highSpeedVideoFpsRanges.isEmpty()) {
            return;
        }
        java.util.Iterator<android.app.job.JobInfo> it = highSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            Camera2StreamConfigurationMap(jobScheduler, it.next().getId());
        }
    }

    public static boolean reconcileJobs(android.content.Context context, androidx.work.impl.WorkDatabase workDatabase) {
        android.app.job.JobScheduler wmJobScheduler = androidx.work.impl.background.systemjob.JobSchedulerExtKt.getWmJobScheduler(context);
        java.util.List<android.app.job.JobInfo> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(context, wmJobScheduler);
        java.util.List<java.lang.String> workSpecIds = workDatabase.systemIdInfoDao().getWorkSpecIds();
        boolean z = false;
        java.util.HashSet hashSet = new java.util.HashSet(highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.size() : 0);
        if (highSpeedVideoFpsRanges != null && !highSpeedVideoFpsRanges.isEmpty()) {
            for (android.app.job.JobInfo jobInfo : highSpeedVideoFpsRanges) {
                androidx.work.impl.model.WorkGenerationalId highSpeedVideoSizes = getHighSpeedVideoSizes(jobInfo);
                if (highSpeedVideoSizes != null) {
                    hashSet.add(highSpeedVideoSizes.getWorkSpecId());
                } else {
                    Camera2StreamConfigurationMap(wmJobScheduler, jobInfo.getId());
                }
            }
        }
        java.util.Iterator<java.lang.String> it = workSpecIds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                androidx.work.Logger.get().debug(getHighSpeedVideoFpsRangesFor, "Reconciling jobs");
                z = true;
                break;
            }
        }
        if (!z) {
            return z;
        }
        workDatabase.beginTransaction();
        try {
            androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
            java.util.Iterator<java.lang.String> it2 = workSpecIds.iterator();
            while (it2.hasNext()) {
                workSpecDao.markWorkSpecScheduled(it2.next(), -1L);
            }
            workDatabase.setTransactionSuccessful();
            return z;
        } finally {
            workDatabase.endTransaction();
        }
    }

    static java.util.List<android.app.job.JobInfo> getHighSpeedVideoFpsRanges(android.content.Context context, android.app.job.JobScheduler jobScheduler) {
        java.util.List<android.app.job.JobInfo> safePendingJobs = androidx.work.impl.background.systemjob.JobSchedulerExtKt.getSafePendingJobs(jobScheduler);
        if (safePendingJobs == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(safePendingJobs.size());
        android.content.ComponentName componentName = new android.content.ComponentName(context, (java.lang.Class<?>) androidx.work.impl.background.systemjob.SystemJobService.class);
        for (android.app.job.JobInfo jobInfo : safePendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static androidx.work.impl.model.WorkGenerationalId getHighSpeedVideoSizes(android.app.job.JobInfo jobInfo) {
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

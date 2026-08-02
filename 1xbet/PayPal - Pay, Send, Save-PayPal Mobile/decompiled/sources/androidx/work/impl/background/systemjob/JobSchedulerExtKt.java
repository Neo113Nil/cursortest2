package androidx.work.impl.background.systemjob;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0019\u0010\r\u001a\u00070\u0006¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001d\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012*\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "", "createErrorMessage", "(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/Configuration;)Ljava/lang/String;", "WORKMANAGER_NAMESPACE", "Ljava/lang/String;", "Lorg/jspecify/annotations/NonNull;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Landroid/app/job/JobScheduler;", "getWmJobScheduler", "(Landroid/content/Context;)Landroid/app/job/JobScheduler;", "wmJobScheduler", "", "Landroid/app/job/JobInfo;", "getSafePendingJobs", "(Landroid/app/job/JobScheduler;)Ljava/util/List;", "safePendingJobs"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JobSchedulerExtKt {
    public static final java.lang.String WORKMANAGER_NAMESPACE = "androidx.work.systemjobscheduler";
    private static final java.lang.String getHighSpeedVideoFpsRanges;

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("SystemJobScheduler");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        getHighSpeedVideoFpsRanges = tagWithPrefix;
    }

    public static final android.app.job.JobScheduler getWmJobScheduler(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("jobscheduler");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) systemService;
        if (android.os.Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        androidx.work.impl.background.systemjob.JobScheduler34 jobScheduler34 = androidx.work.impl.background.systemjob.JobScheduler34.INSTANCE;
        return androidx.work.impl.background.systemjob.JobScheduler34.getHighSpeedVideoFpsRangesFor(jobScheduler);
    }

    public static final java.util.List<android.app.job.JobInfo> getSafePendingJobs(android.app.job.JobScheduler jobScheduler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jobScheduler, "");
        try {
            return androidx.work.impl.background.systemjob.JobScheduler21.INSTANCE.getHighSpeedVideoSizes(jobScheduler);
        } catch (java.lang.Throwable th) {
            androidx.work.Logger.get().error(getHighSpeedVideoFpsRanges, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    public static final java.lang.String createErrorMessage(android.content.Context context, androidx.work.impl.WorkDatabase workDatabase, androidx.work.Configuration configuration) {
        java.lang.String obj;
        java.lang.String obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        int i = android.os.Build.VERSION.SDK_INT >= 31 ? 150 : 100;
        int size = workDatabase.workSpecDao().getScheduledWork().size();
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            android.app.job.JobScheduler wmJobScheduler = getWmJobScheduler(context);
            java.util.List<android.app.job.JobInfo> safePendingJobs = getSafePendingJobs(wmJobScheduler);
            if (safePendingJobs != null) {
                java.util.List<android.app.job.JobInfo> highSpeedVideoFpsRanges = androidx.work.impl.background.systemjob.SystemJobScheduler.getHighSpeedVideoFpsRanges(context, wmJobScheduler);
                int size2 = highSpeedVideoFpsRanges != null ? safePendingJobs.size() - highSpeedVideoFpsRanges.size() : 0;
                java.lang.String str = null;
                if (size2 == 0) {
                    obj2 = null;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(size2);
                    sb.append(" of which are not owned by WorkManager");
                    obj2 = sb.toString();
                }
                java.lang.Object systemService = context.getSystemService("jobscheduler");
                kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
                java.util.List<android.app.job.JobInfo> highSpeedVideoFpsRanges2 = androidx.work.impl.background.systemjob.SystemJobScheduler.getHighSpeedVideoFpsRanges(context, (android.app.job.JobScheduler) systemService);
                int size3 = highSpeedVideoFpsRanges2 != null ? highSpeedVideoFpsRanges2.size() : 0;
                if (size3 != 0) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(size3);
                    sb2.append(" from WorkManager in the default namespace");
                    str = sb2.toString();
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(safePendingJobs.size());
                sb3.append(" jobs in \"androidx.work.systemjobscheduler\" namespace");
                obj = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{sb3.toString(), obj2, str}), ",\n", null, null, 0, null, null, 62, null);
            }
            obj = "<faulty JobScheduler failed to getPendingJobs>";
        } else {
            java.util.List<android.app.job.JobInfo> highSpeedVideoFpsRanges3 = androidx.work.impl.background.systemjob.SystemJobScheduler.getHighSpeedVideoFpsRanges(context, getWmJobScheduler(context));
            if (highSpeedVideoFpsRanges3 != null) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(highSpeedVideoFpsRanges3.size());
                sb4.append(" jobs from WorkManager");
                obj = sb4.toString();
            }
            obj = "<faulty JobScheduler failed to getPendingJobs>";
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("JobScheduler ");
        sb5.append(i);
        sb5.append(" job limit exceeded.\nIn JobScheduler there are ");
        sb5.append(obj);
        sb5.append(".\nThere are ");
        sb5.append(size);
        sb5.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
        sb5.append(configuration.getMaxSchedulerLimit());
        sb5.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        return sb5.toString();
    }
}

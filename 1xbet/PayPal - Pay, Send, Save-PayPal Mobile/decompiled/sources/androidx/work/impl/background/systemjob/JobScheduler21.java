package androidx.work.impl.background.systemjob;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/work/impl/background/systemjob/JobScheduler21;", "", "<init>", "()V", "Landroid/app/job/JobScheduler;", "p0", "", "Landroid/app/job/JobInfo;", "getHighSpeedVideoSizes", "(Landroid/app/job/JobScheduler;)Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class JobScheduler21 {
    public static final androidx.work.impl.background.systemjob.JobScheduler21 INSTANCE = new androidx.work.impl.background.systemjob.JobScheduler21();

    private JobScheduler21() {
    }

    public final java.util.List<android.app.job.JobInfo> getHighSpeedVideoSizes(android.app.job.JobScheduler p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.List<android.app.job.JobInfo> allPendingJobs = p0.getAllPendingJobs();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allPendingJobs, "");
        return allPendingJobs;
    }
}

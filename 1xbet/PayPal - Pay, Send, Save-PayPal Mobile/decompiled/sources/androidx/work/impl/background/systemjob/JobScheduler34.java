package androidx.work.impl.background.systemjob;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/work/impl/background/systemjob/JobScheduler34;", "", "<init>", "()V", "Landroid/app/job/JobScheduler;", "p0", "getHighSpeedVideoFpsRangesFor", "(Landroid/app/job/JobScheduler;)Landroid/app/job/JobScheduler;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class JobScheduler34 {
    public static final androidx.work.impl.background.systemjob.JobScheduler34 INSTANCE = new androidx.work.impl.background.systemjob.JobScheduler34();

    private JobScheduler34() {
    }

    public static android.app.job.JobScheduler getHighSpeedVideoFpsRangesFor(android.app.job.JobScheduler p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        android.app.job.JobScheduler forNamespace = p0.forNamespace(androidx.work.impl.background.systemjob.JobSchedulerExtKt.WORKMANAGER_NAMESPACE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forNamespace, "");
        return forNamespace;
    }
}

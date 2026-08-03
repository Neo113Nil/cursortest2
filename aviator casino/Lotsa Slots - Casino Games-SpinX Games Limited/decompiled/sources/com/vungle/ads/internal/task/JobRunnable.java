package com.vungle.ads.internal.task;

/* compiled from: JobRunnable.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/task/JobRunnable;", "Lcom/vungle/ads/internal/task/PriorityRunnable;", "jobinfo", "Lcom/vungle/ads/internal/task/JobInfo;", "creator", "Lcom/vungle/ads/internal/task/JobCreator;", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;", "threadPriorityHelper", "Lcom/vungle/ads/internal/task/ThreadPriorityHelper;", "(Lcom/vungle/ads/internal/task/JobInfo;Lcom/vungle/ads/internal/task/JobCreator;Lcom/vungle/ads/internal/task/JobRunner;Lcom/vungle/ads/internal/task/ThreadPriorityHelper;)V", "priority", "", "getPriority$annotations", "()V", "getPriority", "()I", "run", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class JobRunnable extends com.vungle.ads.internal.task.PriorityRunnable {
    private static final java.lang.String TAG = "JobRunnable";
    private final com.vungle.ads.internal.task.JobCreator creator;
    private final com.vungle.ads.internal.task.JobRunner jobRunner;
    private final com.vungle.ads.internal.task.JobInfo jobinfo;
    private final com.vungle.ads.internal.task.ThreadPriorityHelper threadPriorityHelper;

    public static /* synthetic */ void getPriority$annotations() {
    }

    public JobRunnable(com.vungle.ads.internal.task.JobInfo jobinfo, com.vungle.ads.internal.task.JobCreator creator, com.vungle.ads.internal.task.JobRunner jobRunner, com.vungle.ads.internal.task.ThreadPriorityHelper threadPriorityHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jobinfo, "jobinfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creator, "creator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        this.jobinfo = jobinfo;
        this.creator = creator;
        this.jobRunner = jobRunner;
        this.threadPriorityHelper = threadPriorityHelper;
    }

    @Override // com.vungle.ads.internal.task.PriorityRunnable
    public int getPriority() {
        return this.jobinfo.getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.vungle.ads.internal.task.ThreadPriorityHelper threadPriorityHelper = this.threadPriorityHelper;
        if (threadPriorityHelper != null) {
            try {
                int makeAndroidThreadPriority = threadPriorityHelper.makeAndroidThreadPriority(this.jobinfo);
                android.os.Process.setThreadPriority(makeAndroidThreadPriority);
                com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
                java.lang.String TAG2 = TAG;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                companion.d(TAG2, "Setting process thread prio = " + makeAndroidThreadPriority + " for " + this.jobinfo.getJobTag());
            } catch (java.lang.Throwable unused) {
                com.vungle.ads.internal.util.Logger.Companion companion2 = com.vungle.ads.internal.util.Logger.INSTANCE;
                java.lang.String TAG3 = TAG;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                companion2.e(TAG3, "Error on setting process thread priority");
            }
        }
        try {
            java.lang.String jobTag = this.jobinfo.getJobTag();
            android.os.Bundle extras = this.jobinfo.getExtras();
            com.vungle.ads.internal.util.Logger.Companion companion3 = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG4 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            companion3.d(TAG4, "Start job " + jobTag + "Thread " + java.lang.Thread.currentThread().getName());
            int onRunJob = this.creator.create(jobTag).onRunJob(extras, this.jobRunner);
            com.vungle.ads.internal.util.Logger.Companion companion4 = com.vungle.ads.internal.util.Logger.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            companion4.d(TAG4, "On job finished " + jobTag + " with result " + onRunJob);
            if (onRunJob == 2) {
                long makeNextRescedule = this.jobinfo.makeNextRescedule();
                if (makeNextRescedule > 0) {
                    this.jobinfo.setDelay(makeNextRescedule);
                    this.jobRunner.execute(this.jobinfo);
                    com.vungle.ads.internal.util.Logger.Companion companion5 = com.vungle.ads.internal.util.Logger.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                    companion5.d(TAG4, "Rescheduling " + jobTag + " in " + makeNextRescedule);
                }
            }
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.Companion companion6 = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG5 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
            companion6.e(TAG5, "Cannot create job" + e.getLocalizedMessage());
        }
    }
}

package com.vungle.ads.internal.task;

/* compiled from: VungleJobRunner.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001b\u001c\u001dB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\r\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\b\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/internal/task/VungleJobRunner;", "Lcom/vungle/ads/internal/task/JobRunner;", "creator", "Lcom/vungle/ads/internal/task/JobCreator;", "executor", "Ljava/util/concurrent/Executor;", "threadPriorityHelper", "Lcom/vungle/ads/internal/task/ThreadPriorityHelper;", "(Lcom/vungle/ads/internal/task/JobCreator;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/task/ThreadPriorityHelper;)V", "nextCheck", "", "pendingJobs", "", "Lcom/vungle/ads/internal/task/VungleJobRunner$PendingJob;", "pendingRunnable", "Ljava/lang/Runnable;", "cancelPendingJob", "", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "", "execute", "jobInfo", "Lcom/vungle/ads/internal/task/JobInfo;", "executePendingJobs", "getPendingJobSize", "", "getPendingJobSize$vungle_ads_release", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "PendingJob", "PendingRunnable", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleJobRunner implements com.vungle.ads.internal.task.JobRunner {
    private final com.vungle.ads.internal.task.JobCreator creator;
    private final java.util.concurrent.Executor executor;
    private long nextCheck;
    private final java.util.List<com.vungle.ads.internal.task.VungleJobRunner.PendingJob> pendingJobs;
    private final java.lang.Runnable pendingRunnable;
    private final com.vungle.ads.internal.task.ThreadPriorityHelper threadPriorityHelper;
    private static final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
    private static final java.lang.String TAG = "VungleJobRunner";

    public VungleJobRunner(com.vungle.ads.internal.task.JobCreator creator, java.util.concurrent.Executor executor, com.vungle.ads.internal.task.ThreadPriorityHelper threadPriorityHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creator, "creator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        this.creator = creator;
        this.executor = executor;
        this.threadPriorityHelper = threadPriorityHelper;
        this.nextCheck = Long.MAX_VALUE;
        this.pendingJobs = new java.util.concurrent.CopyOnWriteArrayList();
        this.pendingRunnable = new com.vungle.ads.internal.task.VungleJobRunner.PendingRunnable(new java.lang.ref.WeakReference(this));
    }

    /* compiled from: VungleJobRunner.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/vungle/ads/internal/task/VungleJobRunner$PendingJob;", "", "uptimeMillis", "", "info", "Lcom/vungle/ads/internal/task/JobInfo;", "(JLcom/vungle/ads/internal/task/JobInfo;)V", "getInfo", "()Lcom/vungle/ads/internal/task/JobInfo;", "setInfo", "(Lcom/vungle/ads/internal/task/JobInfo;)V", "getUptimeMillis", "()J", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class PendingJob {
        private com.vungle.ads.internal.task.JobInfo info;
        private final long uptimeMillis;

        public PendingJob(long j, com.vungle.ads.internal.task.JobInfo jobInfo) {
            this.uptimeMillis = j;
            this.info = jobInfo;
        }

        public final com.vungle.ads.internal.task.JobInfo getInfo() {
            return this.info;
        }

        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }

        public final void setInfo(com.vungle.ads.internal.task.JobInfo jobInfo) {
            this.info = jobInfo;
        }
    }

    /* compiled from: VungleJobRunner.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/task/VungleJobRunner$PendingRunnable;", "Ljava/lang/Runnable;", "runner", "Ljava/lang/ref/WeakReference;", "Lcom/vungle/ads/internal/task/VungleJobRunner;", "(Ljava/lang/ref/WeakReference;)V", "getRunner", "()Ljava/lang/ref/WeakReference;", "setRunner", "run", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class PendingRunnable implements java.lang.Runnable {
        private java.lang.ref.WeakReference<com.vungle.ads.internal.task.VungleJobRunner> runner;

        public PendingRunnable(java.lang.ref.WeakReference<com.vungle.ads.internal.task.VungleJobRunner> runner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runner, "runner");
            this.runner = runner;
        }

        public final java.lang.ref.WeakReference<com.vungle.ads.internal.task.VungleJobRunner> getRunner() {
            return this.runner;
        }

        public final void setRunner(java.lang.ref.WeakReference<com.vungle.ads.internal.task.VungleJobRunner> weakReference) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.runner = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.vungle.ads.internal.task.VungleJobRunner vungleJobRunner = this.runner.get();
            if (vungleJobRunner != null) {
                vungleJobRunner.executePendingJobs();
            }
        }
    }

    @Override // com.vungle.ads.internal.task.JobRunner
    public synchronized void execute(com.vungle.ads.internal.task.JobInfo jobInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
        com.vungle.ads.internal.task.JobInfo copy = jobInfo.copy();
        if (copy != null) {
            java.lang.String jobTag = copy.getJobTag();
            long delay = copy.getDelay();
            copy.setDelay(0L);
            if (copy.getUpdateCurrent()) {
                for (com.vungle.ads.internal.task.VungleJobRunner.PendingJob pendingJob : this.pendingJobs) {
                    com.vungle.ads.internal.task.JobInfo info = pendingJob.getInfo();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(info != null ? info.getJobTag() : null, jobTag)) {
                        com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
                        java.lang.String TAG2 = TAG;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                        companion.d(TAG2, "replacing pending job with new " + jobTag);
                        this.pendingJobs.remove(pendingJob);
                    }
                }
            }
            this.pendingJobs.add(new com.vungle.ads.internal.task.VungleJobRunner.PendingJob(android.os.SystemClock.uptimeMillis() + delay, copy));
            executePendingJobs();
        }
    }

    public final int getPendingJobSize$vungle_ads_release() {
        return this.pendingJobs.size();
    }

    @Override // com.vungle.ads.internal.task.JobRunner
    public synchronized void cancelPendingJob(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.vungle.ads.internal.task.VungleJobRunner.PendingJob pendingJob : this.pendingJobs) {
            com.vungle.ads.internal.task.JobInfo info = pendingJob.getInfo();
            if (kotlin.jvm.internal.Intrinsics.areEqual(info != null ? info.getJobTag() : null, tag)) {
                arrayList.add(pendingJob);
            }
        }
        this.pendingJobs.removeAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executePendingJobs() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j = Long.MAX_VALUE;
        for (com.vungle.ads.internal.task.VungleJobRunner.PendingJob pendingJob : this.pendingJobs) {
            if (uptimeMillis >= pendingJob.getUptimeMillis()) {
                this.pendingJobs.remove(pendingJob);
                com.vungle.ads.internal.task.JobInfo info = pendingJob.getInfo();
                if (info != null) {
                    this.executor.execute(new com.vungle.ads.internal.task.JobRunnable(info, this.creator, this, this.threadPriorityHelper));
                }
            } else {
                j = java.lang.Math.min(j, pendingJob.getUptimeMillis());
            }
        }
        if (j != Long.MAX_VALUE && j != this.nextCheck) {
            android.os.Handler handler2 = handler;
            handler2.removeCallbacks(this.pendingRunnable);
            handler2.postAtTime(this.pendingRunnable, TAG, j);
        }
        this.nextCheck = j;
    }
}

package com.izettle.android.auth.sync;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/izettle/android/auth/sync/SyncManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "scheduleInJobService", "()V", "scheduleSync", "Landroid/content/Context;", "", "hasScheduled", "Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SyncManager {
    private final android.content.Context context;
    private volatile boolean hasScheduled;

    public SyncManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
    }

    private final void scheduleInJobService() {
        android.app.job.JobInfo.Builder builder = new android.app.job.JobInfo.Builder(0, new android.content.ComponentName(this.context, (java.lang.Class<?>) com.izettle.android.auth.sync.ZettleSyncService.class));
        builder.setPeriodic(androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        builder.setRequiredNetworkType(1);
        java.lang.Object systemService = this.context.getSystemService("jobscheduler");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        ((android.app.job.JobScheduler) systemService).schedule(builder.build());
    }

    public final void scheduleSync() {
        if (this.hasScheduled) {
            return;
        }
        this.hasScheduled = true;
        scheduleInJobService();
    }
}

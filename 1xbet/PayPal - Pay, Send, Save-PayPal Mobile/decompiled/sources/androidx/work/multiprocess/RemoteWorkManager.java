package androidx.work.multiprocess;

/* loaded from: classes7.dex */
public abstract class RemoteWorkManager {
    public static final long DEFAULT_SESSION_TIMEOUT_MILLIS = 600000;
    public static final long MAX_SESSION_TIMEOUT_MILLIS = 1200000;

    public abstract androidx.work.multiprocess.RemoteWorkContinuation beginUniqueWork(java.lang.String str, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<androidx.work.OneTimeWorkRequest> list);

    public abstract androidx.work.multiprocess.RemoteWorkContinuation beginWith(java.util.List<androidx.work.OneTimeWorkRequest> list);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelAllWork();

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelAllWorkByTag(java.lang.String str);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelUniqueWork(java.lang.String str);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelWorkById(java.util.UUID uuid);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue(androidx.work.WorkContinuation workContinuation);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue(androidx.work.WorkRequest workRequest);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue(java.util.List<androidx.work.WorkRequest> list);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueueUniquePeriodicWork(java.lang.String str, androidx.work.ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, androidx.work.PeriodicWorkRequest periodicWorkRequest);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueueUniqueWork(java.lang.String str, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<androidx.work.OneTimeWorkRequest> list);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos(androidx.work.WorkQuery workQuery);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setForegroundAsync(java.lang.String str, androidx.work.ForegroundInfo foregroundInfo);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setProgress(java.util.UUID uuid, androidx.work.Data data);

    protected RemoteWorkManager() {
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueueUniqueWork(java.lang.String str, androidx.work.ExistingWorkPolicy existingWorkPolicy, androidx.work.OneTimeWorkRequest oneTimeWorkRequest) {
        return enqueueUniqueWork(str, existingWorkPolicy, java.util.Collections.singletonList(oneTimeWorkRequest));
    }

    public final androidx.work.multiprocess.RemoteWorkContinuation beginWith(androidx.work.OneTimeWorkRequest oneTimeWorkRequest) {
        return beginWith(java.util.Collections.singletonList(oneTimeWorkRequest));
    }

    public final androidx.work.multiprocess.RemoteWorkContinuation beginUniqueWork(java.lang.String str, androidx.work.ExistingWorkPolicy existingWorkPolicy, androidx.work.OneTimeWorkRequest oneTimeWorkRequest) {
        return beginUniqueWork(str, existingWorkPolicy, java.util.Collections.singletonList(oneTimeWorkRequest));
    }

    public static androidx.work.multiprocess.RemoteWorkManager getInstance(android.content.Context context) {
        androidx.work.multiprocess.RemoteWorkManager remoteWorkManager = androidx.work.impl.WorkManagerImpl.getInstance(context).getRemoteWorkManager();
        if (remoteWorkManager != null) {
            return remoteWorkManager;
        }
        throw new java.lang.IllegalStateException("Unable to initialize RemoteWorkManager");
    }
}

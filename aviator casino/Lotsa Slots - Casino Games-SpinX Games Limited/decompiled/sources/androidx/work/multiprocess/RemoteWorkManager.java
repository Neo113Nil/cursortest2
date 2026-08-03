package androidx.work.multiprocess;

/* loaded from: classes2.dex */
public abstract class RemoteWorkManager {
    public abstract androidx.work.multiprocess.RemoteWorkContinuation beginUniqueWork(java.lang.String uniqueWorkName, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<androidx.work.OneTimeWorkRequest> work);

    public abstract androidx.work.multiprocess.RemoteWorkContinuation beginWith(java.util.List<androidx.work.OneTimeWorkRequest> work);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelAllWork();

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelAllWorkByTag(java.lang.String tag);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelUniqueWork(java.lang.String uniqueWorkName);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelWorkById(java.util.UUID id);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue(androidx.work.WorkContinuation continuation);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue(androidx.work.WorkRequest request);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue(java.util.List<androidx.work.WorkRequest> requests);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueueUniquePeriodicWork(java.lang.String uniqueWorkName, androidx.work.ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, androidx.work.PeriodicWorkRequest periodicWork);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueueUniqueWork(java.lang.String uniqueWorkName, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<androidx.work.OneTimeWorkRequest> work);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos(androidx.work.WorkQuery workQuery);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setForegroundAsync(java.lang.String id, androidx.work.ForegroundInfo foregroundInfo);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setProgress(java.util.UUID id, androidx.work.Data data);

    protected RemoteWorkManager() {
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueueUniqueWork(java.lang.String uniqueWorkName, androidx.work.ExistingWorkPolicy existingWorkPolicy, androidx.work.OneTimeWorkRequest work) {
        return enqueueUniqueWork(uniqueWorkName, existingWorkPolicy, java.util.Collections.singletonList(work));
    }

    public final androidx.work.multiprocess.RemoteWorkContinuation beginWith(androidx.work.OneTimeWorkRequest work) {
        return beginWith(java.util.Collections.singletonList(work));
    }

    public final androidx.work.multiprocess.RemoteWorkContinuation beginUniqueWork(java.lang.String uniqueWorkName, androidx.work.ExistingWorkPolicy existingWorkPolicy, androidx.work.OneTimeWorkRequest work) {
        return beginUniqueWork(uniqueWorkName, existingWorkPolicy, java.util.Collections.singletonList(work));
    }

    public static androidx.work.multiprocess.RemoteWorkManager getInstance(android.content.Context context) {
        androidx.work.multiprocess.RemoteWorkManager remoteWorkManager = androidx.work.impl.WorkManagerImpl.getInstance(context).getRemoteWorkManager();
        if (remoteWorkManager != null) {
            return remoteWorkManager;
        }
        throw new java.lang.IllegalStateException("Unable to initialize RemoteWorkManager");
    }
}

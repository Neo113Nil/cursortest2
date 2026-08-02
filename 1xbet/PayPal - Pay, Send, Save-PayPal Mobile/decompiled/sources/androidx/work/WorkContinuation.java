package androidx.work;

/* loaded from: classes.dex */
public abstract class WorkContinuation {
    protected abstract androidx.work.WorkContinuation combineInternal(java.util.List<androidx.work.WorkContinuation> list);

    public abstract androidx.work.Operation enqueue();

    public abstract com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos();

    public abstract androidx.view.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosLiveData();

    public abstract androidx.work.WorkContinuation then(java.util.List<androidx.work.OneTimeWorkRequest> list);

    public final androidx.work.WorkContinuation then(androidx.work.OneTimeWorkRequest oneTimeWorkRequest) {
        return then(java.util.Collections.singletonList(oneTimeWorkRequest));
    }

    public static androidx.work.WorkContinuation combine(java.util.List<androidx.work.WorkContinuation> list) {
        return list.get(0).combineInternal(list);
    }
}

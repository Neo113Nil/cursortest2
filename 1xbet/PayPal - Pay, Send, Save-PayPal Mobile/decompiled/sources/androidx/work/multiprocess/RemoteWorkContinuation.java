package androidx.work.multiprocess;

/* loaded from: classes7.dex */
public abstract class RemoteWorkContinuation {
    protected abstract androidx.work.multiprocess.RemoteWorkContinuation combineInternal(java.util.List<androidx.work.multiprocess.RemoteWorkContinuation> list);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue();

    public abstract androidx.work.multiprocess.RemoteWorkContinuation then(java.util.List<androidx.work.OneTimeWorkRequest> list);

    protected RemoteWorkContinuation() {
    }

    public final androidx.work.multiprocess.RemoteWorkContinuation then(androidx.work.OneTimeWorkRequest oneTimeWorkRequest) {
        return then(java.util.Collections.singletonList(oneTimeWorkRequest));
    }

    public static androidx.work.multiprocess.RemoteWorkContinuation combine(java.util.List<androidx.work.multiprocess.RemoteWorkContinuation> list) {
        return list.get(0).combineInternal(list);
    }
}

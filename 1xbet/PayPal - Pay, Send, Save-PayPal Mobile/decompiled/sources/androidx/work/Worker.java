package androidx.work;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/work/Worker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "()Landroidx/work/ListenableWorker$Result;", "Lcom/google/common/util/concurrent/ListenableFuture;", "startWork", "()Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ForegroundInfo;", "getForegroundInfoAsync", "getForegroundInfo", "()Landroidx/work/ForegroundInfo;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Worker extends androidx.work.ListenableWorker {
    public abstract androidx.work.ListenableWorker.Result doWork();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    @Override // androidx.work.ListenableWorker
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork() {
        java.util.concurrent.Executor backgroundExecutor = getBackgroundExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "");
        return androidx.work.WorkerKt.access$future(backgroundExecutor, new kotlin.jvm.functions.Function0() { // from class: androidx.work.Worker$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.work.ListenableWorker.Result doWork;
                doWork = androidx.work.Worker.this.doWork();
                return doWork;
            }
        });
    }

    @Override // androidx.work.ListenableWorker
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.ForegroundInfo> getForegroundInfoAsync() {
        java.util.concurrent.Executor backgroundExecutor = getBackgroundExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "");
        return androidx.work.WorkerKt.access$future(backgroundExecutor, new kotlin.jvm.functions.Function0() { // from class: androidx.work.Worker$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.work.ForegroundInfo foregroundInfo;
                foregroundInfo = androidx.work.Worker.this.getForegroundInfo();
                return foregroundInfo;
            }
        });
    }

    public androidx.work.ForegroundInfo getForegroundInfo() {
        throw new java.lang.IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }
}

package androidx.work.impl.workers;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\n\u001a\u00070\b¢\u0006\u0002\b\tH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/work/impl/workers/CombineContinuationsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "Lorg/jspecify/annotations/NonNull;", "doWork", "()Landroidx/work/ListenableWorker$Result;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CombineContinuationsWorker extends androidx.work.Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    @Override // androidx.work.Worker
    public final androidx.work.ListenableWorker.Result doWork() {
        androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success(getInputData());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "");
        return success;
    }
}

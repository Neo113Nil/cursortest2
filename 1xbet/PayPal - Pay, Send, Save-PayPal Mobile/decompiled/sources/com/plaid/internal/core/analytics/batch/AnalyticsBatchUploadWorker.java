package com.plaid.internal.core.analytics.batch;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/plaid/internal/core/analytics/batch/AnalyticsBatchUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AnalyticsBatchUploadWorker extends androidx.work.CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsBatchUploadWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    @Override // androidx.work.CoroutineWorker
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "");
        return success;
    }
}

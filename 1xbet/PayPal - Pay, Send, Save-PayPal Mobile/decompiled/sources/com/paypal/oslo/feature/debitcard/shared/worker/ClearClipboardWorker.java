package com.paypal.oslo.feature.debitcard.shared.worker;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/worker/ClearClipboardWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "()Landroidx/work/ListenableWorker$Result;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClearClipboardWorker extends androidx.work.Worker {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearClipboardWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    @Override // androidx.work.Worker
    public final androidx.work.ListenableWorker.Result doWork() {
        java.lang.Object systemService = getApplicationContext().getSystemService("clipboard");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager.COPY_CARD_NUMBER_LABEL, ""));
        androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "");
        return success;
    }
}

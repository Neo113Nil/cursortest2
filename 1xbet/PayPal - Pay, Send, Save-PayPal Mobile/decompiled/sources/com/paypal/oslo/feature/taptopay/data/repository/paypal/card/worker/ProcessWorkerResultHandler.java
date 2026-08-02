package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0018B\u001f\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0011\u001a\u00020\u00102\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0001\u0006\u0019\u001a\u001b\u001c\u001d\u001e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessWorkerResultHandler;", "T", "E", "", "Landroid/content/Context;", "p0", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/WriteStore;", "p1", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/WriteStore;)V", "Larrow/core/Either;", "", "result", "", "runAttemptCount", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/work/ListenableWorker$Result;", "invoke", "(Larrow/core/Either;ILjava/lang/Object;)Landroidx/work/ListenableWorker$Result;", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/WriteStore;", "Companion", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessNotifyAddCardResultHandler;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessNotifyDeleteCardResultHandler;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessNotifyResumeCardResultHandler;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessNotifySuspendCardResultHandler;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessNotifyUpdateCardResultHandler;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessUploadTnCResultHandler;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ProcessWorkerResultHandler<T, E> {

    @java.lang.Deprecated
    public static final int MAX_RETRIES = 5;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.WriteStore<T> getHighResolutionOutputSizeshNQ4ISI;
    private static final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessWorkerResultHandler.Companion Companion = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessWorkerResultHandler.Companion(null);
    public static final int $stable = 8;

    private ProcessWorkerResultHandler(android.content.Context context, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.WriteStore<T> writeStore) {
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighResolutionOutputSizeshNQ4ISI = writeStore;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessWorkerResultHandler$Companion;", "", "<init>", "()V", "", "MAX_RETRIES", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final androidx.work.ListenableWorker.Result invoke(arrow.core.Either<? extends E, kotlin.Unit> result, int runAttemptCount, T data) {
        androidx.work.ListenableWorker.Result failure;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (result instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Worker completed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessWorkerResultHandlerKt.access$toLogString(this)), kotlin.TuplesKt.to("runAttemptCount", java.lang.Integer.valueOf(runAttemptCount))), null, 4, null);
            failure = androidx.work.ListenableWorker.Result.success();
        } else {
            if (!(result instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.Object value = ((arrow.core.Either.Left) result).getValue();
            if (runAttemptCount < 5) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Worker will be retried", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessWorkerResultHandlerKt.access$toLogString(this)), kotlin.TuplesKt.to("error", java.lang.String.valueOf(value)), kotlin.TuplesKt.to("runAttemptCount", java.lang.Integer.valueOf(runAttemptCount))), null, 4, null);
                failure = androidx.work.ListenableWorker.Result.retry();
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Exceeded max attempts for worker, discarding worker forever", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessWorkerResultHandlerKt.access$toLogString(this)), kotlin.TuplesKt.to("error", java.lang.String.valueOf(value)), kotlin.TuplesKt.to("runAttemptCount", java.lang.Integer.valueOf(runAttemptCount))), null, 4, null);
                failure = androidx.work.ListenableWorker.Result.failure(com.paypal.oslo.feature.taptopay.data.mapper.ReplenishPaymentMapper.INSTANCE.toErrorData("Exceeded max attempts for worker. Discarding worker forever"));
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure, "");
        return failure;
    }

    public /* synthetic */ ProcessWorkerResultHandler(android.content.Context context, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.WriteStore writeStore, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, writeStore);
    }
}

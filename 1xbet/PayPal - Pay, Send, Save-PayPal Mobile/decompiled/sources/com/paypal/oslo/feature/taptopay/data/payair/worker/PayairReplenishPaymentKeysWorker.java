package com.paypal.oslo.feature.taptopay.data.payair.worker;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/worker/PayairReplenishPaymentKeysWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/replenishment/payair/PayairReplenishPaymentKeysUseCase;", "payairReplenishPaymentKeysUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/paypal/oslo/feature/taptopay/domain/usecase/replenishment/payair/PayairReplenishPaymentKeysUseCase;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/replenishment/payair/PayairReplenishPaymentKeysUseCase;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayairReplenishPaymentKeysWorker extends androidx.work.CoroutineWorker {
    public static final int MAX_RETRIES = 5;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase getHighResolutionOutputSizeshNQ4ISI;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public PayairReplenishPaymentKeysWorker(@dagger.assisted.Assisted android.content.Context context, @dagger.assisted.Assisted androidx.work.WorkerParameters workerParameters, com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase payairReplenishPaymentKeysUseCase) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payairReplenishPaymentKeysUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = payairReplenishPaymentKeysUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker$doWork$1 payairReplenishPaymentKeysWorker$doWork$1;
        int i;
        arrow.core.Either either;
        androidx.work.ListenableWorker.Result failure;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker$doWork$1) {
            payairReplenishPaymentKeysWorker$doWork$1 = (com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker$doWork$1) continuation;
            if ((payairReplenishPaymentKeysWorker$doWork$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                payairReplenishPaymentKeysWorker$doWork$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = payairReplenishPaymentKeysWorker$doWork$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairReplenishPaymentKeysWorker$doWork$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.data.mapper.ReplenishPaymentMapper replenishPaymentMapper = com.paypal.oslo.feature.taptopay.data.mapper.ReplenishPaymentMapper.INSTANCE;
                    androidx.work.Data inputData = getInputData();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData, "");
                    com.paypal.oslo.feature.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams replenishPaymentKeysParams = replenishPaymentMapper.toReplenishPaymentKeysParams(inputData);
                    if (replenishPaymentKeysParams != null) {
                        com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase payairReplenishPaymentKeysUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.String tokenizedCardId = replenishPaymentKeysParams.getTokenizedCardId();
                        payairReplenishPaymentKeysWorker$doWork$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(replenishPaymentKeysParams);
                        payairReplenishPaymentKeysWorker$doWork$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        payairReplenishPaymentKeysWorker$doWork$1.getHighSpeedVideoSizes = 1;
                        obj = payairReplenishPaymentKeysUseCase.invoke(tokenizedCardId, payairReplenishPaymentKeysWorker$doWork$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No params data", null, null, 6, null);
                    androidx.work.ListenableWorker.Result failure2 = androidx.work.ListenableWorker.Result.failure(com.paypal.oslo.feature.taptopay.data.mapper.ReplenishPaymentMapper.INSTANCE.toErrorData("One or more of the required inputs are null"));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure2, "");
                    return failure2;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i2 = payairReplenishPaymentKeysWorker$doWork$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "The replenishment call was completed.", null, null, 6, null);
                    failure = androidx.work.ListenableWorker.Result.success();
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.domain.model.replenishment.ReplenishPaymentKeysError replenishPaymentKeysError = (com.paypal.oslo.feature.taptopay.domain.model.replenishment.ReplenishPaymentKeysError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Replenishment failure", null, null, 6, null);
                    if (getRunAttemptCount() <= 5) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Worker will be retried", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", "PayairReplenishPaymentKeysWorker"), kotlin.TuplesKt.to("error", replenishPaymentKeysError.toString()), kotlin.TuplesKt.to("runAttemptCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(getRunAttemptCount()))), null, 4, null);
                        failure = androidx.work.ListenableWorker.Result.retry();
                    } else {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Exceeded max attempts for worker, discarding worker forever", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", "PayairReplenishPaymentKeysWorker"), kotlin.TuplesKt.to("errorMessage", replenishPaymentKeysError.toString()), kotlin.TuplesKt.to("runAttemptCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(getRunAttemptCount()))), null, 4, null);
                        failure = androidx.work.ListenableWorker.Result.failure(com.paypal.oslo.feature.taptopay.data.mapper.ReplenishPaymentMapper.INSTANCE.toErrorData("Exceeded max attempts for worker. Discarding worker forever"));
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (failure != null) {
                    return failure;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No params data", null, null, 6, null);
                androidx.work.ListenableWorker.Result failure22 = androidx.work.ListenableWorker.Result.failure(com.paypal.oslo.feature.taptopay.data.mapper.ReplenishPaymentMapper.INSTANCE.toErrorData("One or more of the required inputs are null"));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure22, "");
                return failure22;
            }
        }
        payairReplenishPaymentKeysWorker$doWork$1 = new com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker$doWork$1(this, continuation);
        java.lang.Object obj2 = payairReplenishPaymentKeysWorker$doWork$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairReplenishPaymentKeysWorker$doWork$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        if (failure != null) {
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No params data", null, null, 6, null);
        androidx.work.ListenableWorker.Result failure222 = androidx.work.ListenableWorker.Result.failure(com.paypal.oslo.feature.taptopay.data.mapper.ReplenishPaymentMapper.INSTANCE.toErrorData("One or more of the required inputs are null"));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure222, "");
        return failure222;
    }
}

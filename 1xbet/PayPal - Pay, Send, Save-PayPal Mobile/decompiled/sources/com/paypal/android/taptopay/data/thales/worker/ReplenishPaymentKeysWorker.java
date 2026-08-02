package com.paypal.android.taptopay.data.thales.worker;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/worker/ReplenishPaymentKeysWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/paypal/android/taptopay/data/thales/replenishment/ReplenishPaymentKeysUseCase;", "replenishPaymentKeysUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/paypal/android/taptopay/data/thales/replenishment/ReplenishPaymentKeysUseCase;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/android/taptopay/data/thales/replenishment/ReplenishPaymentKeysUseCase;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReplenishPaymentKeysWorker extends androidx.work.CoroutineWorker {
    public static final int MAX_RETRIES = 5;
    private final com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public ReplenishPaymentKeysWorker(@dagger.assisted.Assisted android.content.Context context, @dagger.assisted.Assisted androidx.work.WorkerParameters workerParameters, com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase replenishPaymentKeysUseCase) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replenishPaymentKeysUseCase, "");
        this.getHighSpeedVideoFpsRanges = replenishPaymentKeysUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker$doWork$1 replenishPaymentKeysWorker$doWork$1;
        int i;
        androidx.work.ListenableWorker.Result result;
        com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker replenishPaymentKeysWorker;
        com.paypal.android.taptopay.domain.Result result2;
        if (continuation instanceof com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker$doWork$1) {
            replenishPaymentKeysWorker$doWork$1 = (com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker$doWork$1) continuation;
            if ((replenishPaymentKeysWorker$doWork$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                replenishPaymentKeysWorker$doWork$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = replenishPaymentKeysWorker$doWork$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = replenishPaymentKeysWorker$doWork$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Starting replenishment worker", null, null, 6, null);
                    androidx.work.Data inputData = getInputData();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData, "");
                    com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams replenishPaymentKeysParams = com.paypal.android.taptopay.domain.model.replenishment.ExtensionsKt.toReplenishPaymentKeysParams(inputData);
                    if (replenishPaymentKeysParams == null) {
                        result = null;
                        replenishPaymentKeysWorker = this;
                        if (result != null) {
                            return result;
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "No params data", null, null, 6, null);
                        androidx.work.ListenableWorker.Result failure = androidx.work.ListenableWorker.Result.failure(com.paypal.android.taptopay.domain.model.replenishment.ExtensionsKt.toErrorData("One or more of the required inputs are null"));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure, "");
                        return failure;
                    }
                    com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase replenishPaymentKeysUseCase = this.getHighSpeedVideoFpsRanges;
                    java.lang.String tokenizedCardId = replenishPaymentKeysParams.getTokenizedCardId();
                    boolean forceReplenishment = replenishPaymentKeysParams.getForceReplenishment();
                    replenishPaymentKeysWorker$doWork$1.Camera2StreamConfigurationMap = this;
                    replenishPaymentKeysWorker$doWork$1.getHighSpeedVideoSizes = 1;
                    obj = replenishPaymentKeysUseCase.invoke(tokenizedCardId, forceReplenishment, replenishPaymentKeysWorker$doWork$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    replenishPaymentKeysWorker = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    replenishPaymentKeysWorker = (com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker) replenishPaymentKeysWorker$doWork$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                result2 = (com.paypal.android.taptopay.domain.Result) obj;
                if (!(result2 instanceof com.paypal.android.taptopay.domain.Result.Success)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Replenishment success", null, null, 6, null);
                    result = androidx.work.ListenableWorker.Result.success();
                } else if (result2 instanceof com.paypal.android.taptopay.domain.Result.Failure) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Replenishment failure", null, null, 6, null);
                    if (replenishPaymentKeysWorker.getRunAttemptCount() <= 5) {
                        com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
                        kotlin.Pair[] pairArr = new kotlin.Pair[3];
                        pairArr[0] = kotlin.TuplesKt.to("type", "ReplenishPaymentKeysWorker");
                        com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError replenishPaymentKeysError = (com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError) ((com.paypal.android.taptopay.domain.Result.Failure) result2).getError();
                        if (replenishPaymentKeysError instanceof com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError.DefaultError) {
                            pairArr[1] = kotlin.TuplesKt.to("error", ((com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError.DefaultError) replenishPaymentKeysError).getMessage());
                            pairArr[2] = kotlin.TuplesKt.to("runAttemptCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(replenishPaymentKeysWorker.getRunAttemptCount()));
                            com.paypal.android.logger.Logger.i$default(log, "Worker will be retried", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                            result = androidx.work.ListenableWorker.Result.retry();
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    } else {
                        com.paypal.android.logger.Logger log2 = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
                        pairArr2[0] = kotlin.TuplesKt.to("type", "ReplenishPaymentKeysWorker");
                        com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError replenishPaymentKeysError2 = (com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError) ((com.paypal.android.taptopay.domain.Result.Failure) result2).getError();
                        if (replenishPaymentKeysError2 instanceof com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError.DefaultError) {
                            pairArr2[1] = kotlin.TuplesKt.to("errorMessage", ((com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError.DefaultError) replenishPaymentKeysError2).getMessage());
                            pairArr2[2] = kotlin.TuplesKt.to("runAttemptCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(replenishPaymentKeysWorker.getRunAttemptCount()));
                            com.paypal.android.logger.Logger.w$default(log2, "Exceeded max attempts for worker, discarding worker forever", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                            result = androidx.work.ListenableWorker.Result.failure(com.paypal.android.taptopay.domain.model.replenishment.ExtensionsKt.toErrorData("Exceeded max attempts for worker. Discarding worker forever"));
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (result != null) {
                }
            }
        }
        replenishPaymentKeysWorker$doWork$1 = new com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker$doWork$1(this, continuation);
        java.lang.Object obj2 = replenishPaymentKeysWorker$doWork$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = replenishPaymentKeysWorker$doWork$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        result2 = (com.paypal.android.taptopay.domain.Result) obj2;
        if (!(result2 instanceof com.paypal.android.taptopay.domain.Result.Success)) {
        }
        if (result != null) {
        }
    }
}

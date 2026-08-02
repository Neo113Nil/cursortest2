package com.paypal.oslo.feature.pushnotification.delivery.data.worker;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/data/worker/ProcessNotificationActionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessNotificationActionUseCase;", "useCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessNotificationActionUseCase;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessNotificationActionUseCase;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProcessNotificationActionWorker extends androidx.work.CoroutineWorker {
    public static final java.lang.String KEY_ACTION_ID = "action_id";
    public static final java.lang.String KEY_CODE = "code";
    public static final int MAX_RETRIES = 3;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public ProcessNotificationActionWorker(@dagger.assisted.Assisted android.content.Context context, @dagger.assisted.Assisted androidx.work.WorkerParameters workerParameters, com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase processNotificationActionUseCase) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processNotificationActionUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = processNotificationActionUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker$doWork$1 processNotificationActionWorker$doWork$1;
        int i;
        arrow.core.Either either;
        androidx.work.ListenableWorker.Result retry;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker$doWork$1) {
            processNotificationActionWorker$doWork$1 = (com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker$doWork$1) continuation;
            if ((processNotificationActionWorker$doWork$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                processNotificationActionWorker$doWork$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = processNotificationActionWorker$doWork$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = processNotificationActionWorker$doWork$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (getRunAttemptCount() >= 3) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "ProcessNotificationActionWorker: max retries exceeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attempt", java.lang.String.valueOf(getRunAttemptCount()))), null, 4, null);
                        androidx.work.ListenableWorker.Result failure = androidx.work.ListenableWorker.Result.failure();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure, "");
                        return failure;
                    }
                    java.lang.String string = getInputData().getString("action_id");
                    java.lang.String string2 = getInputData().getString("code");
                    if (string == null || string2 == null) {
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        pairArr[0] = kotlin.TuplesKt.to("actionId_null", java.lang.String.valueOf(string == null));
                        pairArr[1] = kotlin.TuplesKt.to("code_null", java.lang.String.valueOf(string2 == null));
                        com.paypal.android.logger.Logger.w$default(logger, "ProcessNotificationActionWorker: missing input data keys", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        androidx.work.ListenableWorker.Result failure2 = androidx.work.ListenableWorker.Result.failure();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure2, "");
                        return failure2;
                    }
                    com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase processNotificationActionUseCase = this.getHighSpeedVideoFpsRangesFor;
                    processNotificationActionWorker$doWork$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(string);
                    processNotificationActionWorker$doWork$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(string2);
                    processNotificationActionWorker$doWork$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = processNotificationActionUseCase.invoke(string, string2, processNotificationActionWorker$doWork$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    retry = androidx.work.ListenableWorker.Result.success();
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError processActionError = (com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError) ((arrow.core.Either.Left) either).getValue();
                    if (processActionError instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.InvalidInput) {
                        retry = androidx.work.ListenableWorker.Result.failure();
                    } else if (processActionError instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.NotAuthenticated) {
                        retry = androidx.work.ListenableWorker.Result.retry();
                    } else {
                        if (!(processActionError instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.ApiCallFailed)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        retry = androidx.work.ListenableWorker.Result.retry();
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(retry, "");
                return retry;
            }
        }
        processNotificationActionWorker$doWork$1 = new com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker$doWork$1(this, continuation);
        java.lang.Object obj2 = processNotificationActionWorker$doWork$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = processNotificationActionWorker$doWork$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(retry, "");
        return retry;
    }
}

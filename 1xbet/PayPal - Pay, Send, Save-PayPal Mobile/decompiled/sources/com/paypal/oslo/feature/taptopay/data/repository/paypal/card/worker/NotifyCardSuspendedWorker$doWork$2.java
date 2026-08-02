package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\f0\u0001¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0003*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lorg/jspecify/annotations/NonNull;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardSuspendedWorker$doWork$2", f = "NotifyCardSuspendedWorker.kt", i = {0}, l = {49}, m = "invokeSuspend", n = {"deviceWalletServiceCardId"}, nl = {50}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class NotifyCardSuspendedWorker$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardSuspendedWorker getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardSuspendedNotifier cardSuspendedNotifier;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId;
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifySuspendCardResultHandler processNotifySuspendCardResultHandler;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.work.Data inputData = this.getHighSpeedVideoFpsRanges.getInputData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData, "");
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId2 = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toDeviceWalletServiceCardId(inputData);
            if (deviceWalletServiceCardId2 != null) {
                cardSuspendedNotifier = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = deviceWalletServiceCardId2;
                this.getHighSpeedVideoSizes = 1;
                java.lang.Object invoke$taptopay_prodRelease = cardSuspendedNotifier.invoke$taptopay_prodRelease(deviceWalletServiceCardId2, this);
                if (invoke$taptopay_prodRelease == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deviceWalletServiceCardId = deviceWalletServiceCardId2;
                obj = invoke$taptopay_prodRelease;
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Worker failed due to missing input data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", "NotifyCardSuspendedWorker")), null, 4, null);
                return androidx.work.ListenableWorker.Result.failure(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toErrorData("Worker failed, device wallet id is null"));
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceWalletServiceCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        processNotifySuspendCardResultHandler = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
        return processNotifySuspendCardResultHandler.invoke((arrow.core.Either) obj, this.getHighSpeedVideoFpsRanges.getRunAttemptCount(), deviceWalletServiceCardId);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardSuspendedWorker$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardSuspendedWorker$doWork$2(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotifyCardSuspendedWorker$doWork$2(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardSuspendedWorker notifyCardSuspendedWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardSuspendedWorker$doWork$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = notifyCardSuspendedWorker;
    }
}

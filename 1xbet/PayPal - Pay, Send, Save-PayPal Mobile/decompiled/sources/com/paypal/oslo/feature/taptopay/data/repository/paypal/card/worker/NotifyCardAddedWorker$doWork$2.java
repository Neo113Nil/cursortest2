package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\f0\u0001¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0003*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lorg/jspecify/annotations/NonNull;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker$doWork$2", f = "NotifyCardAddedWorker.kt", i = {0}, l = {49}, m = "invokeSuspend", n = {"idGroup"}, nl = {50}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class NotifyCardAddedWorker$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier cardAddedNotifier;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyAddCardResultHandler processNotifyAddCardResultHandler;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.work.Data inputData = this.getHighSpeedVideoSizes.getInputData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData, "");
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup2 = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toCardIdGroup(inputData);
            if (cardIdGroup2 != null) {
                cardAddedNotifier = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRangesFor = cardIdGroup2;
                this.getHighSpeedVideoFpsRanges = 1;
                java.lang.Object invoke$taptopay_prodRelease = cardAddedNotifier.invoke$taptopay_prodRelease(cardIdGroup2, this);
                if (invoke$taptopay_prodRelease == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cardIdGroup = cardIdGroup2;
                obj = invoke$taptopay_prodRelease;
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Worker failed due to missing input data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", "NotifyCardAddedWorker")), null, 4, null);
                return androidx.work.ListenableWorker.Result.failure(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toErrorData("One or more of the required inputs are null"));
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        processNotifyAddCardResultHandler = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
        return processNotifyAddCardResultHandler.invoke((arrow.core.Either) obj, this.getHighSpeedVideoSizes.getRunAttemptCount(), cardIdGroup);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker$doWork$2(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotifyCardAddedWorker$doWork$2(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker notifyCardAddedWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker$doWork$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = notifyCardAddedWorker;
    }
}

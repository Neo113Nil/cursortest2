package com.paypal.android.taptopay.data.thales.replenishment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher$replenishKeysIfNeeded$1", f = "CardPaymentKeysReplenisher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class CardPaymentKeysReplenisher$replenishKeysIfNeeded$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.gemalto.mfs.mwsdk.dcm.DigitalizedCard getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.taptopay.data.thales.worker.BackgroundSyncWorkerUseCase access$getBackgroundSyncWorkerUseCase$p = com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher.access$getBackgroundSyncWorkerUseCase$p(this.Camera2StreamConfigurationMap);
        java.lang.String tokenizedCardID = this.getHighSpeedVideoSizes.getTokenizedCardID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tokenizedCardID, "");
        androidx.work.Data data = com.paypal.android.taptopay.domain.model.replenishment.ExtensionsKt.toData(new com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams(tokenizedCardID, this.getHighSpeedVideoFpsRangesFor));
        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", "ReplenishPaymentKeysWorker"), kotlin.TuplesKt.to("tag", null)), null, 4, null);
        androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker.class);
        if (data != null) {
            builder.setInputData(data);
        }
        builder.setConstraints(access$getBackgroundSyncWorkerUseCase$p.getHighResolutionOutputSizeshNQ4ISI);
        builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(access$getBackgroundSyncWorkerUseCase$p.getHighSpeedVideoFpsRangesFor.enqueue(builder.build()), "");
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher$replenishKeysIfNeeded$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher$replenishKeysIfNeeded$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardPaymentKeysReplenisher$replenishKeysIfNeeded$1(com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher cardPaymentKeysReplenisher, com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, boolean z, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher$replenishKeysIfNeeded$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = cardPaymentKeysReplenisher;
        this.getHighSpeedVideoSizes = digitalizedCard;
        this.getHighSpeedVideoFpsRangesFor = z;
    }
}

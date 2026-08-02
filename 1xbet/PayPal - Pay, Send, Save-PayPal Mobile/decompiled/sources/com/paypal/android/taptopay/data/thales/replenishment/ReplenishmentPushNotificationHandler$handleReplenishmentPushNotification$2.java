package com.paypal.android.taptopay.data.thales.replenishment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$handleReplenishmentPushNotification$2", f = "ReplenishmentPushNotificationHandler.kt", i = {0}, l = {57}, m = "invokeSuspend", n = {"digitalizedCard"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class ReplenishmentPushNotificationHandler$handleReplenishmentPushNotification$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.fcm.model.PushNotification getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard;
        com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher cardPaymentKeysReplenisher;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
        } catch (java.lang.Throwable th) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler.REPLENISHMENT_ERROR_MESSAGE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", "Exception")), null, th, 4, null);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Handling MG replenishment push notification", com.paypal.android.taptopay.data.thales.logging.ExtensionsKt.toLogAttributes(this.getHighSpeedVideoFpsRangesFor), null, 4, null);
            com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard2 = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalizedCard(this.getHighSpeedVideoFpsRangesFor.getDigitalCardId());
            if (digitalizedCard2 != null) {
                this.getHighSpeedVideoFpsRanges = digitalizedCard2;
                this.getHighSpeedVideoSizes = 1;
                java.lang.Object thalesCardStatus = com.paypal.android.taptopay.data.thales.card.ExtensionsKt.getThalesCardStatus(digitalizedCard2, this);
                if (thalesCardStatus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                digitalizedCard = digitalizedCard2;
                obj = thalesCardStatus;
            } else {
                com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler.REPLENISHMENT_ERROR_MESSAGE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", "CardNotFound"), kotlin.TuplesKt.to("digitalCardId", this.getHighSpeedVideoFpsRangesFor.getDigitalCardId())), null, null, 12, null);
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            digitalizedCard = (com.gemalto.mfs.mwsdk.dcm.DigitalizedCard) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.android.taptopay.domain.Result result = (com.paypal.android.taptopay.domain.Result) obj;
        if (result instanceof com.paypal.android.taptopay.domain.Result.Success) {
            cardPaymentKeysReplenisher = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(digitalizedCard);
            cardPaymentKeysReplenisher.replenishKeysIfNeeded(digitalizedCard, (com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus) ((com.paypal.android.taptopay.domain.Result.Success) result).getResult(), true);
        } else if (result instanceof com.paypal.android.taptopay.domain.Result.Failure) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler.REPLENISHMENT_ERROR_MESSAGE, kotlin.collections.MapsKt.plus(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", "GetCardStatusFailure"), kotlin.TuplesKt.to("digitalCardId", this.getHighSpeedVideoFpsRangesFor.getDigitalCardId())), com.paypal.android.taptopay.domain.logging.ExtensionsKt.toLogAttributes((com.paypal.android.taptopay.domain.model.card.GetCardError) ((com.paypal.android.taptopay.domain.Result.Failure) result).getError())), null, null, 12, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$handleReplenishmentPushNotification$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$handleReplenishmentPushNotification$2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReplenishmentPushNotificationHandler$handleReplenishmentPushNotification$2(com.paypal.android.taptopay.data.thales.fcm.model.PushNotification pushNotification, com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler replenishmentPushNotificationHandler, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$handleReplenishmentPushNotification$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = pushNotification;
        this.getHighResolutionOutputSizeshNQ4ISI = replenishmentPushNotificationHandler;
    }
}

package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$handleMessage$1", f = "TransactionPushNotificationHandler.kt", i = {0}, l = {53}, m = "invokeSuspend", n = {"digitalCardId"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class TransactionPushNotificationHandler$handleMessage$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.taptopay.data.thales.fcm.model.PushNotification Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.String str;
        com.paypal.android.taptopay.data.thales.payment.TransactionDataSource transactionDataSource;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String digitalCardId = this.Camera2StreamConfigurationMap.getDigitalCardId();
            this.getHighResolutionOutputSizeshNQ4ISI = digitalCardId;
            this.getHighSpeedVideoSizes = 1;
            Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(digitalCardId, this);
            if (Camera2StreamConfigurationMap == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = digitalCardId;
            obj = Camera2StreamConfigurationMap;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction> list = (java.util.List) obj;
        if (list != null) {
            com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler transactionPushNotificationHandler = this.getHighSpeedVideoFpsRanges;
            if (!list.isEmpty()) {
                com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = kotlin.TuplesKt.to("digitalCardId", str);
                java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction> list2 = list;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (com.paypal.android.taptopay.domain.model.payment.Transaction transaction : list2) {
                    arrayList.add(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("id", transaction.getId()), kotlin.TuplesKt.to("transactionDate", transaction.getTransactionDate())));
                }
                pairArr[1] = kotlin.TuplesKt.to("transactions", arrayList);
                com.paypal.android.logger.Logger.i$default(log, "Rehydrating transaction data source", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                transactionDataSource = transactionPushNotificationHandler.getHighSpeedVideoSizes;
                transactionDataSource.rehydrate(list);
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Could not get transactions for push notification", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitalCardId", str)), null, 4, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$handleMessage$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$handleMessage$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionPushNotificationHandler$handleMessage$1(com.paypal.android.taptopay.data.thales.fcm.model.PushNotification pushNotification, com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler transactionPushNotificationHandler, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$handleMessage$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = pushNotification;
        this.getHighSpeedVideoFpsRanges = transactionPushNotificationHandler;
    }
}

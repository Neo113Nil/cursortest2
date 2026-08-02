package com.paypal.oslo.feature.activity.ui.ledger.model.helper;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "item"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper$injectIntoPagingData$1", f = "ActivityActionCardHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityActionCardHelper$injectIntoPagingData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.getHighSpeedVideoFpsRanges.getIsActionCardInjected() && (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction)) {
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction transaction = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem;
            if (com.paypal.oslo.feature.activity.domain.ledger.models.extension.ActivityTransactionModelExtensionsKt.isMerchantPhysicalGoodsTransaction(transaction.getData())) {
                this.getHighSpeedVideoFpsRanges.isActionCardInjected = true;
                return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard(transaction.getData(), com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper.access$buildActionCardModel(this.getHighSpeedVideoFpsRanges), 0L, 4, null);
            }
        }
        return activityItem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper$injectIntoPagingData$1) create(activityItem, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper$injectIntoPagingData$1 activityActionCardHelper$injectIntoPagingData$1 = new com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper$injectIntoPagingData$1(this.getHighSpeedVideoFpsRanges, continuation);
        activityActionCardHelper$injectIntoPagingData$1.Camera2StreamConfigurationMap = obj;
        return activityActionCardHelper$injectIntoPagingData$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityActionCardHelper$injectIntoPagingData$1(com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper activityActionCardHelper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper$injectIntoPagingData$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = activityActionCardHelper;
    }
}

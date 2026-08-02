package com.paypal.oslo.feature.activity.domain.usecase.ledger;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "item"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$filterSupportedAction$1", f = "ActivityLedgerUserActivitiesPaginationUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerUserActivitiesPaginationUseCase$filterSupportedAction$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel copy;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!(activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction)) {
            return activityItem;
        }
        java.util.ArrayList emptyList = kotlin.collections.CollectionsKt.emptyList();
        if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> action = ((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem).getData().getAction();
            if (action != null) {
                java.util.Set<java.lang.String> set = this.getHighResolutionOutputSizeshNQ4ISI;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : action) {
                    if (set.contains(((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj2).getType().getRawValue())) {
                        arrayList.add(obj2);
                    }
                }
                emptyList = arrayList;
            } else {
                emptyList = null;
            }
        }
        java.util.List list = emptyList;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction transaction = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem;
        copy = r3.copy((r41 & 1) != 0 ? r3.id : null, (r41 & 2) != 0 ? r3.groupId : null, (r41 & 4) != 0 ? r3.invoiceId : null, (r41 & 8) != 0 ? r3.avatar : null, (r41 & 16) != 0 ? r3.title : null, (r41 & 32) != 0 ? r3.date : null, (r41 & 64) != 0 ? r3.createdTime : null, (r41 & 128) != 0 ? r3.amountInformation : null, (r41 & 256) != 0 ? r3.transactionShortDescription : null, (r41 & 512) != 0 ? r3.paymentStatus : null, (r41 & 1024) != 0 ? r3.transactionETANote : null, (r41 & 2048) != 0 ? r3.additionalInfo : null, (r41 & 4096) != 0 ? r3.rewardInfo : null, (r41 & 8192) != 0 ? r3.activityMoneyMovementDirection : null, (r41 & 16384) != 0 ? r3.action : list, (r41 & 32768) != 0 ? r3.type : null, (r41 & 65536) != 0 ? r3.activityStatus : null, (r41 & 131072) != 0 ? r3.shipmentPackages : null, (r41 & 262144) != 0 ? r3.activityFlags : null, (r41 & 524288) != 0 ? r3.activityPartnerInfo : null, (r41 & 1048576) != 0 ? r3.subdomain : null, (r41 & 2097152) != 0 ? r3.channels : null, (r41 & 4194304) != 0 ? transaction.getData().purposes : null);
        return com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction.copy$default(transaction, copy, 0L, 2, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> continuation) {
        return ((com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$filterSupportedAction$1) create(activityItem, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$filterSupportedAction$1 activityLedgerUserActivitiesPaginationUseCase$filterSupportedAction$1 = new com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$filterSupportedAction$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        activityLedgerUserActivitiesPaginationUseCase$filterSupportedAction$1.Camera2StreamConfigurationMap = obj;
        return activityLedgerUserActivitiesPaginationUseCase$filterSupportedAction$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerUserActivitiesPaginationUseCase$filterSupportedAction$1(java.util.Set<java.lang.String> set, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$filterSupportedAction$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = set;
    }
}

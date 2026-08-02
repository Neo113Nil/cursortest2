package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/businesscustomers/api/navigation/result/RecipientSelectedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$purchaseDetailsEntry$1$1$1", f = "RequestManagementNavigationEntries.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class RequestManagementNavigationEntriesKt$purchaseDetailsEntry$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult recipientSelectedNavResult = (com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.sendReceipt(recipientSelectedNavResult.getRecipient());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult recipientSelectedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$purchaseDetailsEntry$1$1$1) create(recipientSelectedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$purchaseDetailsEntry$1$1$1 requestManagementNavigationEntriesKt$purchaseDetailsEntry$1$1$1 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$purchaseDetailsEntry$1$1$1(this.Camera2StreamConfigurationMap, continuation);
        requestManagementNavigationEntriesKt$purchaseDetailsEntry$1$1$1.getHighSpeedVideoFpsRangesFor = obj;
        return requestManagementNavigationEntriesKt$purchaseDetailsEntry$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestManagementNavigationEntriesKt$purchaseDetailsEntry$1$1$1(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel purchaseDetailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$purchaseDetailsEntry$1$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = purchaseDetailsViewModel;
    }
}

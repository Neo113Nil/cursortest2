package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$sendReceipt$1", f = "PurchaseDetailsViewModel.kt", i = {0}, l = {171}, m = "invokeSuspend", n = {"email"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class PurchaseDetailsViewModel$sendReceipt$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState copy;
        java.lang.String email;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState copy2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            do {
                value = mutableStateFlow.getValue();
                copy = r5.copy((r39 & 1) != 0 ? r5.paymentId : null, (r39 & 2) != 0 ? r5.isLoading : false, (r39 & 4) != 0 ? r5.receipt : null, (r39 & 8) != 0 ? r5.status : null, (r39 & 16) != 0 ? r5.items : null, (r39 & 32) != 0 ? r5.issuedDate : null, (r39 & 64) != 0 ? r5.amountPaidFormatted : null, (r39 & 128) != 0 ? r5.subtotalFormatted : null, (r39 & 256) != 0 ? r5.feeFormatted : null, (r39 & 512) != 0 ? r5.netAmountFormatted : null, (r39 & 1024) != 0 ? r5.taxFormatted : null, (r39 & 2048) != 0 ? r5.totalFormatted : null, (r39 & 4096) != 0 ? r5.toastMessage : null, (r39 & 8192) != 0 ? r5.isSendingReceipt : true, (r39 & 16384) != 0 ? r5.isRefunding : false, (r39 & 32768) != 0 ? r5.showRefundConfirmation : false, (r39 & 65536) != 0 ? r5.showRefundError : false, (r39 & 131072) != 0 ? r5.showSendReceiptError : false, (r39 & 262144) != 0 ? r5.canRefund : false, (r39 & 524288) != 0 ? r5.isRefundPurchase : false, (r39 & 1048576) != 0 ? ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState) value).originalPurchaseUuid : null);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient recipient = this.getHighResolutionOutputSizeshNQ4ISI;
            if (recipient instanceof com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient) {
                email = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ((com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient) recipient).getCustomer().getEmails());
            } else {
                if (!(recipient instanceof com.paypal.oslo.feature.businesscustomers.api.domain.model.EmailRecipient)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                email = ((com.paypal.oslo.feature.businesscustomers.api.domain.model.EmailRecipient) recipient).getEmail();
            }
            if (email == null) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log;
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(this.getHighResolutionOutputSizeshNQ4ISI.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = "";
                }
                com.paypal.android.logger.Logger.d$default(logger, "No email available for receipt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("recipientType", simpleName)), null, 4, null);
                mutableStateFlow2 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                do {
                    value2 = mutableStateFlow2.getValue();
                    copy2 = r5.copy((r39 & 1) != 0 ? r5.paymentId : null, (r39 & 2) != 0 ? r5.isLoading : false, (r39 & 4) != 0 ? r5.receipt : null, (r39 & 8) != 0 ? r5.status : null, (r39 & 16) != 0 ? r5.items : null, (r39 & 32) != 0 ? r5.issuedDate : null, (r39 & 64) != 0 ? r5.amountPaidFormatted : null, (r39 & 128) != 0 ? r5.subtotalFormatted : null, (r39 & 256) != 0 ? r5.feeFormatted : null, (r39 & 512) != 0 ? r5.netAmountFormatted : null, (r39 & 1024) != 0 ? r5.taxFormatted : null, (r39 & 2048) != 0 ? r5.totalFormatted : null, (r39 & 4096) != 0 ? r5.toastMessage : null, (r39 & 8192) != 0 ? r5.isSendingReceipt : false, (r39 & 16384) != 0 ? r5.isRefunding : false, (r39 & 32768) != 0 ? r5.showRefundConfirmation : false, (r39 & 65536) != 0 ? r5.showRefundError : false, (r39 & 131072) != 0 ? r5.showSendReceiptError : true, (r39 & 262144) != 0 ? r5.canRefund : false, (r39 & 524288) != 0 ? r5.isRefundPurchase : false, (r39 & 1048576) != 0 ? ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState) value2).originalPurchaseUuid : null);
                } while (!mutableStateFlow2.compareAndSet(value2, copy2));
                return kotlin.Unit.INSTANCE;
            }
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(email);
            this.getHighSpeedVideoFpsRanges = 1;
            if (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel.access$sendReceiptToEmail(this.getHighSpeedVideoSizes, email, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$sendReceipt$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$sendReceipt$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseDetailsViewModel$sendReceipt$1(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel purchaseDetailsViewModel, com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient recipient, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$sendReceipt$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = purchaseDetailsViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = recipient;
    }
}

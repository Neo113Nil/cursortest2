package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$onRefundConfirmed$1", f = "PurchaseDetailsViewModel.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PurchaseDetailsViewModel$onRefundConfirmed$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState copy;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.RefundPurchaseUseCase refundPurchaseUseCase;
        java.lang.String str;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState copy2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState copy3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            do {
                value = mutableStateFlow.getValue();
                copy = r5.copy((r39 & 1) != 0 ? r5.paymentId : null, (r39 & 2) != 0 ? r5.isLoading : false, (r39 & 4) != 0 ? r5.receipt : null, (r39 & 8) != 0 ? r5.status : null, (r39 & 16) != 0 ? r5.items : null, (r39 & 32) != 0 ? r5.issuedDate : null, (r39 & 64) != 0 ? r5.amountPaidFormatted : null, (r39 & 128) != 0 ? r5.subtotalFormatted : null, (r39 & 256) != 0 ? r5.feeFormatted : null, (r39 & 512) != 0 ? r5.netAmountFormatted : null, (r39 & 1024) != 0 ? r5.taxFormatted : null, (r39 & 2048) != 0 ? r5.totalFormatted : null, (r39 & 4096) != 0 ? r5.toastMessage : null, (r39 & 8192) != 0 ? r5.isSendingReceipt : false, (r39 & 16384) != 0 ? r5.isRefunding : true, (r39 & 32768) != 0 ? r5.showRefundConfirmation : false, (r39 & 65536) != 0 ? r5.showRefundError : false, (r39 & 131072) != 0 ? r5.showSendReceiptError : false, (r39 & 262144) != 0 ? r5.canRefund : false, (r39 & 524288) != 0 ? r5.isRefundPurchase : false, (r39 & 1048576) != 0 ? ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState) value).originalPurchaseUuid : null);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            refundPurchaseUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            str = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            invoke = refundPurchaseUseCase.invoke(str, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel purchaseDetailsViewModel = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            mutableStateFlow3 = purchaseDetailsViewModel.getHighSpeedVideoSizes;
            do {
                value3 = mutableStateFlow3.getValue();
                copy3 = r4.copy((r39 & 1) != 0 ? r4.paymentId : null, (r39 & 2) != 0 ? r4.isLoading : false, (r39 & 4) != 0 ? r4.receipt : null, (r39 & 8) != 0 ? r4.status : com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiStateKt.toUiState(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.PENDING_REFUND_CONFIRMATION), (r39 & 16) != 0 ? r4.items : null, (r39 & 32) != 0 ? r4.issuedDate : null, (r39 & 64) != 0 ? r4.amountPaidFormatted : null, (r39 & 128) != 0 ? r4.subtotalFormatted : null, (r39 & 256) != 0 ? r4.feeFormatted : null, (r39 & 512) != 0 ? r4.netAmountFormatted : null, (r39 & 1024) != 0 ? r4.taxFormatted : null, (r39 & 2048) != 0 ? r4.totalFormatted : null, (r39 & 4096) != 0 ? r4.toastMessage : kotlin.coroutines.jvm.internal.Boxing.boxInt(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_refund_in_progress_toast), (r39 & 8192) != 0 ? r4.isSendingReceipt : false, (r39 & 16384) != 0 ? r4.isRefunding : false, (r39 & 32768) != 0 ? r4.showRefundConfirmation : false, (r39 & 65536) != 0 ? r4.showRefundError : false, (r39 & 131072) != 0 ? r4.showSendReceiptError : false, (r39 & 262144) != 0 ? r4.canRefund : false, (r39 & 524288) != 0 ? r4.isRefundPurchase : false, (r39 & 1048576) != 0 ? ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState) value3).originalPurchaseUuid : null);
            } while (!mutableStateFlow3.compareAndSet(value3, copy3));
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow2 = purchaseDetailsViewModel.getHighSpeedVideoSizes;
            do {
                value2 = mutableStateFlow2.getValue();
                copy2 = r3.copy((r39 & 1) != 0 ? r3.paymentId : null, (r39 & 2) != 0 ? r3.isLoading : false, (r39 & 4) != 0 ? r3.receipt : null, (r39 & 8) != 0 ? r3.status : null, (r39 & 16) != 0 ? r3.items : null, (r39 & 32) != 0 ? r3.issuedDate : null, (r39 & 64) != 0 ? r3.amountPaidFormatted : null, (r39 & 128) != 0 ? r3.subtotalFormatted : null, (r39 & 256) != 0 ? r3.feeFormatted : null, (r39 & 512) != 0 ? r3.netAmountFormatted : null, (r39 & 1024) != 0 ? r3.taxFormatted : null, (r39 & 2048) != 0 ? r3.totalFormatted : null, (r39 & 4096) != 0 ? r3.toastMessage : null, (r39 & 8192) != 0 ? r3.isSendingReceipt : false, (r39 & 16384) != 0 ? r3.isRefunding : false, (r39 & 32768) != 0 ? r3.showRefundConfirmation : false, (r39 & 65536) != 0 ? r3.showRefundError : true, (r39 & 131072) != 0 ? r3.showSendReceiptError : false, (r39 & 262144) != 0 ? r3.canRefund : false, (r39 & 524288) != 0 ? r3.isRefundPurchase : false, (r39 & 1048576) != 0 ? ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState) value2).originalPurchaseUuid : null);
            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$onRefundConfirmed$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$onRefundConfirmed$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseDetailsViewModel$onRefundConfirmed$1(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel purchaseDetailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$onRefundConfirmed$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = purchaseDetailsViewModel;
    }
}

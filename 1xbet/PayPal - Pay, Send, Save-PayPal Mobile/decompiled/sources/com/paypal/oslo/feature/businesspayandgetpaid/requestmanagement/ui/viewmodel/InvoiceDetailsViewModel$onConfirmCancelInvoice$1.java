package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$onConfirmCancelInvoice$1", f = "InvoiceDetailsViewModel.kt", i = {0}, l = {204}, m = "invokeSuspend", n = {"sendCopy"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, s = {"Z$0"}, v = 2)
/* loaded from: classes11.dex */
final class InvoiceDetailsViewModel$onConfirmCancelInvoice$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.CancelInvoiceUseCase cancelInvoiceUseCase;
        java.lang.String str;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getInputFormats;
            do {
                value = mutableStateFlow.getValue();
                copy = r5.copy((r57 & 1) != 0 ? r5.id : null, (r57 & 2) != 0 ? r5.invoiceNumber : null, (r57 & 4) != 0 ? r5.isLoading : false, (r57 & 8) != 0 ? r5.isSendingReminder : false, (r57 & 16) != 0 ? r5.isCancelling : true, (r57 & 32) != 0 ? r5.error : null, (r57 & 64) != 0 ? r5.invoiceCancelled : false, (r57 & 128) != 0 ? r5.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r5.showCancelConfirmation : false, (r57 & 512) != 0 ? r5.sendCopyOnCancel : false, (r57 & 1024) != 0 ? r5.sendReminderAllowed : false, (r57 & 2048) != 0 ? r5.showReminderConfirmation : false, (r57 & 4096) != 0 ? r5.sendCopyOnReminder : false, (r57 & 8192) != 0 ? r5.status : null, (r57 & 16384) != 0 ? r5.customerName : null, (r57 & 32768) != 0 ? r5.amountDueFormatted : null, (r57 & 65536) != 0 ? r5.tipAmountFormatted : null, (r57 & 131072) != 0 ? r5.tipsAllowed : false, (r57 & 262144) != 0 ? r5.amountPaidFormatted : null, (r57 & 524288) != 0 ? r5.refundedFormatted : null, (r57 & 1048576) != 0 ? r5.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r5.invoiceDate : null, (r57 & 4194304) != 0 ? r5.dueDate : null, (r57 & 8388608) != 0 ? r5.subtotalFormatted : null, (r57 & 16777216) != 0 ? r5.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r5.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r5.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r5.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r5.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r5.items : null, (r57 & 1073741824) != 0 ? r5.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r5.customerEmail : null, (r58 & 1) != 0 ? r5.customerPhones : null, (r58 & 2) != 0 ? r5.customerPhoneFormatted : null, (r58 & 4) != 0 ? r5.shareUrl : null, (r58 & 8) != 0 ? r5.actions : null, (r58 & 16) != 0 ? r5.autoCancelRule : null, (r58 & 32) != 0 ? r5.earlyPaymentDiscountRule : null, (r58 & 64) != 0 ? ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState) value).isEarlyPaymentDiscountExpired : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            boolean sendCopyOnCancel = this.getHighSpeedVideoFpsRanges.getUiState().getValue().getSendCopyOnCancel();
            cancelInvoiceUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            str = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = sendCopyOnCancel;
            this.Camera2StreamConfigurationMap = 1;
            invoke = cancelInvoiceUseCase.invoke(str, sendCopyOnCancel, this);
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
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel invoiceDetailsViewModel = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice invoice = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow3 = invoiceDetailsViewModel.getInputFormats;
            do {
                value3 = mutableStateFlow3.getValue();
                copy3 = r6.copy((r57 & 1) != 0 ? r6.id : null, (r57 & 2) != 0 ? r6.invoiceNumber : null, (r57 & 4) != 0 ? r6.isLoading : false, (r57 & 8) != 0 ? r6.isSendingReminder : false, (r57 & 16) != 0 ? r6.isCancelling : false, (r57 & 32) != 0 ? r6.error : null, (r57 & 64) != 0 ? r6.invoiceCancelled : true, (r57 & 128) != 0 ? r6.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r6.showCancelConfirmation : false, (r57 & 512) != 0 ? r6.sendCopyOnCancel : false, (r57 & 1024) != 0 ? r6.sendReminderAllowed : false, (r57 & 2048) != 0 ? r6.showReminderConfirmation : false, (r57 & 4096) != 0 ? r6.sendCopyOnReminder : false, (r57 & 8192) != 0 ? r6.status : null, (r57 & 16384) != 0 ? r6.customerName : null, (r57 & 32768) != 0 ? r6.amountDueFormatted : null, (r57 & 65536) != 0 ? r6.tipAmountFormatted : null, (r57 & 131072) != 0 ? r6.tipsAllowed : false, (r57 & 262144) != 0 ? r6.amountPaidFormatted : null, (r57 & 524288) != 0 ? r6.refundedFormatted : null, (r57 & 1048576) != 0 ? r6.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r6.invoiceDate : null, (r57 & 4194304) != 0 ? r6.dueDate : null, (r57 & 8388608) != 0 ? r6.subtotalFormatted : null, (r57 & 16777216) != 0 ? r6.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r6.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r6.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r6.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r6.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r6.items : null, (r57 & 1073741824) != 0 ? r6.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r6.customerEmail : null, (r58 & 1) != 0 ? r6.customerPhones : null, (r58 & 2) != 0 ? r6.customerPhoneFormatted : null, (r58 & 4) != 0 ? r6.shareUrl : null, (r58 & 8) != 0 ? r6.actions : null, (r58 & 16) != 0 ? r6.autoCancelRule : null, (r58 & 32) != 0 ? r6.earlyPaymentDiscountRule : null, (r58 & 64) != 0 ? com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiStateKt.toUiState(invoice).isEarlyPaymentDiscountExpired : false);
            } while (!mutableStateFlow3.compareAndSet(value3, copy3));
            mutableSharedFlow = invoiceDetailsViewModel.getOutputFormats;
            mutableStateFlow4 = invoiceDetailsViewModel.getInputFormats;
            java.lang.String invoiceNumber = ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState) mutableStateFlow4.getValue()).getInvoiceNumber();
            if (invoiceNumber == null) {
                invoiceNumber = "";
            }
            mutableStateFlow5 = invoiceDetailsViewModel.getInputFormats;
            java.lang.String shareUrl = ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState) mutableStateFlow5.getValue()).getShareUrl();
            mutableSharedFlow.tryEmit(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToInvoiceCancelled(invoiceNumber, shareUrl != null ? shareUrl : ""));
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow2 = invoiceDetailsViewModel.getInputFormats;
            do {
                value2 = mutableStateFlow2.getValue();
                copy2 = r3.copy((r57 & 1) != 0 ? r3.id : null, (r57 & 2) != 0 ? r3.invoiceNumber : null, (r57 & 4) != 0 ? r3.isLoading : false, (r57 & 8) != 0 ? r3.isSendingReminder : false, (r57 & 16) != 0 ? r3.isCancelling : false, (r57 & 32) != 0 ? r3.error : com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError.CancelError.INSTANCE, (r57 & 64) != 0 ? r3.invoiceCancelled : false, (r57 & 128) != 0 ? r3.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r3.showCancelConfirmation : false, (r57 & 512) != 0 ? r3.sendCopyOnCancel : false, (r57 & 1024) != 0 ? r3.sendReminderAllowed : false, (r57 & 2048) != 0 ? r3.showReminderConfirmation : false, (r57 & 4096) != 0 ? r3.sendCopyOnReminder : false, (r57 & 8192) != 0 ? r3.status : null, (r57 & 16384) != 0 ? r3.customerName : null, (r57 & 32768) != 0 ? r3.amountDueFormatted : null, (r57 & 65536) != 0 ? r3.tipAmountFormatted : null, (r57 & 131072) != 0 ? r3.tipsAllowed : false, (r57 & 262144) != 0 ? r3.amountPaidFormatted : null, (r57 & 524288) != 0 ? r3.refundedFormatted : null, (r57 & 1048576) != 0 ? r3.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r3.invoiceDate : null, (r57 & 4194304) != 0 ? r3.dueDate : null, (r57 & 8388608) != 0 ? r3.subtotalFormatted : null, (r57 & 16777216) != 0 ? r3.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r3.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r3.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r3.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r3.items : null, (r57 & 1073741824) != 0 ? r3.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r3.customerEmail : null, (r58 & 1) != 0 ? r3.customerPhones : null, (r58 & 2) != 0 ? r3.customerPhoneFormatted : null, (r58 & 4) != 0 ? r3.shareUrl : null, (r58 & 8) != 0 ? r3.actions : null, (r58 & 16) != 0 ? r3.autoCancelRule : null, (r58 & 32) != 0 ? r3.earlyPaymentDiscountRule : null, (r58 & 64) != 0 ? ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState) value2).isEarlyPaymentDiscountExpired : false);
            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$onConfirmCancelInvoice$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$onConfirmCancelInvoice$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvoiceDetailsViewModel$onConfirmCancelInvoice$1(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel invoiceDetailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$onConfirmCancelInvoice$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = invoiceDetailsViewModel;
    }
}

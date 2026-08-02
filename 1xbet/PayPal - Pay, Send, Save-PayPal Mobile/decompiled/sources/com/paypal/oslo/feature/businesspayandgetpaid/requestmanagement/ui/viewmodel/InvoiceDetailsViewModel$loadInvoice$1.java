package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$loadInvoice$1", f = "InvoiceDetailsViewModel.kt", i = {1, 1, 1, 1, 1}, l = {71, 78}, m = "invokeSuspend", n = {"this_$iv", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "baseState", "$i$f$fold", "$i$a$-fold-InvoiceDetailsViewModel$loadInvoice$1$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, 80}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class InvoiceDetailsViewModel$loadInvoice$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        if (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel.access$loadConditionalRules(r5, r7, r46) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0116, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0047, code lost:
    
        if (r2 != r1) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceDetailsUseCase getInvoiceDetailsUseCase;
        java.lang.String str;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getInvoiceDetailsUseCase = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor;
            str = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI;
            this.getOutputFormats = 1;
            invoke = getInvoiceDetailsUseCase.invoke(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel invoiceDetailsViewModel = this.getOutputMinFrameDuration;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice invoice = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice) ((arrow.core.Either.Right) either).getValue();
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState uiState = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiStateKt.toUiState(invoice);
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConfiguration configuration = invoice.getConfiguration();
            if (configuration == null || !configuration.getConditionalRulesApply()) {
                mutableStateFlow2 = invoiceDetailsViewModel.getInputFormats;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiStateKt.toUiState(invoice)));
            } else {
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoice);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uiState);
                this.Camera2StreamConfigurationMap = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getOutputFormats = 2;
            }
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow = invoiceDetailsViewModel.getInputFormats;
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r57 & 1) != 0 ? r3.id : null, (r57 & 2) != 0 ? r3.invoiceNumber : null, (r57 & 4) != 0 ? r3.isLoading : false, (r57 & 8) != 0 ? r3.isSendingReminder : false, (r57 & 16) != 0 ? r3.isCancelling : false, (r57 & 32) != 0 ? r3.error : com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError.GeneralError.INSTANCE, (r57 & 64) != 0 ? r3.invoiceCancelled : false, (r57 & 128) != 0 ? r3.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r3.showCancelConfirmation : false, (r57 & 512) != 0 ? r3.sendCopyOnCancel : false, (r57 & 1024) != 0 ? r3.sendReminderAllowed : false, (r57 & 2048) != 0 ? r3.showReminderConfirmation : false, (r57 & 4096) != 0 ? r3.sendCopyOnReminder : false, (r57 & 8192) != 0 ? r3.status : null, (r57 & 16384) != 0 ? r3.customerName : null, (r57 & 32768) != 0 ? r3.amountDueFormatted : null, (r57 & 65536) != 0 ? r3.tipAmountFormatted : null, (r57 & 131072) != 0 ? r3.tipsAllowed : false, (r57 & 262144) != 0 ? r3.amountPaidFormatted : null, (r57 & 524288) != 0 ? r3.refundedFormatted : null, (r57 & 1048576) != 0 ? r3.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r3.invoiceDate : null, (r57 & 4194304) != 0 ? r3.dueDate : null, (r57 & 8388608) != 0 ? r3.subtotalFormatted : null, (r57 & 16777216) != 0 ? r3.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r3.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r3.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r3.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r3.items : null, (r57 & 1073741824) != 0 ? r3.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r3.customerEmail : null, (r58 & 1) != 0 ? r3.customerPhones : null, (r58 & 2) != 0 ? r3.customerPhoneFormatted : null, (r58 & 4) != 0 ? r3.shareUrl : null, (r58 & 8) != 0 ? r3.actions : null, (r58 & 16) != 0 ? r3.autoCancelRule : null, (r58 & 32) != 0 ? r3.earlyPaymentDiscountRule : null, (r58 & 64) != 0 ? ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState) value).isEarlyPaymentDiscountExpired : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$loadInvoice$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$loadInvoice$1(this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvoiceDetailsViewModel$loadInvoice$1(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel invoiceDetailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$loadInvoice$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = invoiceDetailsViewModel;
    }
}

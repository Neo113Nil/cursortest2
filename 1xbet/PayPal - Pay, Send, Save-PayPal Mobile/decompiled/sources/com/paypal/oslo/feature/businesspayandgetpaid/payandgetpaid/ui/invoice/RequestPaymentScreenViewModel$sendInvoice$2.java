package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel$sendInvoice$2", f = "RequestPaymentScreenViewModel.kt", i = {0, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {72, 74, 82, 79}, m = "invokeSuspend", n = {"invoiceId", "invoiceId", "invoiceId", "result", "this_$iv", "updatedInvoice", "$i$f$fold", "$i$a$-fold-RequestPaymentScreenViewModel$sendInvoice$2$2", "invoiceId", "result", "this_$iv", "it", "$i$f$fold", "$i$a$-fold-RequestPaymentScreenViewModel$sendInvoice$2$1"}, nl = {74, 71, 83, 80}, s = {"L$0", "L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class RequestPaymentScreenViewModel$sendInvoice$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel getInputSizeshNQ4ISI;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ed, code lost:
    
        if (r4.send(r5, r8) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0125, code lost:
    
        if (r4.send(r5, r8) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r9 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (r9 != r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.String id;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase sendInvoiceUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase updateInvoiceUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        arrow.core.Either either;
        kotlinx.coroutines.channels.Channel channel;
        kotlinx.coroutines.channels.Channel channel2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            id = ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState) mutableStateFlow.getValue()).getInvoice().getId();
            if (id != null) {
                updateInvoiceUseCase = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                mutableStateFlow3 = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                this.getHighSpeedVideoSizesFor = 1;
                obj = updateInvoiceUseCase.invoke(id, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState) mutableStateFlow3.getValue()).getInvoice(), this);
            } else {
                sendInvoiceUseCase = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                mutableStateFlow2 = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                this.getHighSpeedVideoSizesFor = 2;
                obj = sendInvoiceUseCase.invoke(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState) mutableStateFlow2.getValue()).getInvoice(), this);
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            id = (java.lang.String) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            either = (arrow.core.Either) obj;
        } else if (i == 2) {
            id = (java.lang.String) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            either = (arrow.core.Either) obj;
        } else {
            if (i == 3) {
            } else {
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel requestPaymentScreenViewModel = this.getInputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice) ((arrow.core.Either.Right) either).getValue();
            channel2 = requestPaymentScreenViewModel.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToInvoiceSent navigateToInvoiceSent = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToInvoiceSent(invoice);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoice);
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighSpeedVideoSizesFor = 3;
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError invoiceError = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError) ((arrow.core.Either.Left) either).getValue();
            channel = requestPaymentScreenViewModel.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateBackWithError navigateBackWithError = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateBackWithError.INSTANCE;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoiceError);
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighSpeedVideoSizesFor = 4;
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel$sendInvoice$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel$sendInvoice$2(this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestPaymentScreenViewModel$sendInvoice$2(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel requestPaymentScreenViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel$sendInvoice$2> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = requestPaymentScreenViewModel;
    }
}

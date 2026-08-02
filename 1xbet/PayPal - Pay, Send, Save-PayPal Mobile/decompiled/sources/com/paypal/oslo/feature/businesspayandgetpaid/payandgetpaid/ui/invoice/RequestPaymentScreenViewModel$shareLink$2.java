package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel$shareLink$2", f = "RequestPaymentScreenViewModel.kt", i = {1, 1, 1, 1, 2, 2, 2, 2}, l = {104, 109, 106}, m = "invokeSuspend", n = {"this_$iv", "updatedInvoice", "$i$f$fold", "$i$a$-fold-RequestPaymentScreenViewModel$shareLink$2$2", "this_$iv", "it", "$i$f$fold", "$i$a$-fold-RequestPaymentScreenViewModel$shareLink$2$1"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 110, 107}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class RequestPaymentScreenViewModel$shareLink$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r1.send(r4, r6) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        if (r1.send(r4, r6) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r7 != r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase sendInvoiceUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.channels.Channel channel;
        kotlinx.coroutines.channels.Channel channel2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sendInvoiceUseCase = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
            mutableStateFlow = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = sendInvoiceUseCase.invoke(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState) mutableStateFlow.getValue()).getInvoice(), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel requestPaymentScreenViewModel = this.getOutputMinFrameDuration;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice) ((arrow.core.Either.Right) either).getValue();
            channel2 = requestPaymentScreenViewModel.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToShareLink navigateToShareLink = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToShareLink(invoice);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoice);
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 2;
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError invoiceError = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError) ((arrow.core.Either.Left) either).getValue();
            channel = requestPaymentScreenViewModel.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateBackWithError navigateBackWithError = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateBackWithError.INSTANCE;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoiceError);
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 3;
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel$shareLink$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel$shareLink$2(this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestPaymentScreenViewModel$shareLink$2(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel requestPaymentScreenViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel$shareLink$2> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = requestPaymentScreenViewModel;
    }
}

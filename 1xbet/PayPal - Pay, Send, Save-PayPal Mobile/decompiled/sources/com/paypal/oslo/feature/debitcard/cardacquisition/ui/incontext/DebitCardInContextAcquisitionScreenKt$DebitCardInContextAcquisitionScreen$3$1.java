package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/ConfirmBankFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.DebitCardInContextAcquisitionScreenKt$DebitCardInContextAcquisitionScreen$3$1", f = "DebitCardInContextAcquisitionScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardInContextAcquisitionScreenKt$DebitCardInContextAcquisitionScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult confirmBankFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.DebitCardInContextAcquisitionScreenKt.handleConfirmBankFlowNavResult(confirmBankFlowNavResult, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult confirmBankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.DebitCardInContextAcquisitionScreenKt$DebitCardInContextAcquisitionScreen$3$1) create(confirmBankFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.DebitCardInContextAcquisitionScreenKt$DebitCardInContextAcquisitionScreen$3$1 debitCardInContextAcquisitionScreenKt$DebitCardInContextAcquisitionScreen$3$1 = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.DebitCardInContextAcquisitionScreenKt$DebitCardInContextAcquisitionScreen$3$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        debitCardInContextAcquisitionScreenKt$DebitCardInContextAcquisitionScreen$3$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return debitCardInContextAcquisitionScreenKt$DebitCardInContextAcquisitionScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardInContextAcquisitionScreenKt$DebitCardInContextAcquisitionScreen$3$1(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel fundingOptionsComponentViewModel, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.DebitCardInContextAcquisitionScreenKt$DebitCardInContextAcquisitionScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = fundingOptionsComponentViewModel;
        this.getHighSpeedVideoFpsRangesFor = debitCardProductName;
    }
}

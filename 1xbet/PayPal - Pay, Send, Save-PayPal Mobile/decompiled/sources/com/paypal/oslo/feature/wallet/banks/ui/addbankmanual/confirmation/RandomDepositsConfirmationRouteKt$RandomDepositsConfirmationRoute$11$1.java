package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/ConfirmBankFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$11$1", f = "RandomDepositsConfirmationRoute.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$11$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult confirmBankFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRangesFor.ibcFlowResultHandler(confirmBankFlowNavResult);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult confirmBankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$11$1) create(confirmBankFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$11$1 randomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$11$1 = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$11$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        randomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$11$1.getHighSpeedVideoSizes = obj;
        return randomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$11$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$11$1(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$11$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = confirmBankAccountViewModel;
    }
}

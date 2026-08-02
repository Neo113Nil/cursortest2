package com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/wallet/navigation/result/SelectCurrencyNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$1$1", f = "TransferAmountEntryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency, kotlin.Unit>> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult selectCurrencyNavResult = (com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt.access$AutoShowCurrencySelectorEffect$lambda$1(this.getHighSpeedVideoSizes).invoke(selectCurrencyNavResult.getSelectedCurrency());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult selectCurrencyNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$1$1) create(selectCurrencyNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$1$1 transferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$1$1 = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$1$1(this.getHighSpeedVideoSizes, continuation);
        transferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$1$1.getHighSpeedVideoFpsRangesFor = obj;
        return transferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$1$1(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency, kotlin.Unit>> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = state;
    }
}

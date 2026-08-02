package com.paypal.oslo.feature.bnplservicing.ui.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.common.WalletNavigationKt$AddCardFlowResultHandler$3$1", f = "WalletNavigation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class WalletNavigationKt$AddCardFlowResultHandler$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.bnplservicing.ui.common.WalletNavigationKt.handleAddCardFlowResult(addCardFlowNavResult, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.common.WalletNavigationKt$AddCardFlowResultHandler$3$1) create(addCardFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.common.WalletNavigationKt$AddCardFlowResultHandler$3$1 walletNavigationKt$AddCardFlowResultHandler$3$1 = new com.paypal.oslo.feature.bnplservicing.ui.common.WalletNavigationKt$AddCardFlowResultHandler$3$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        walletNavigationKt$AddCardFlowResultHandler$3$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return walletNavigationKt$AddCardFlowResultHandler$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WalletNavigationKt$AddCardFlowResultHandler$3$1(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.common.WalletNavigationKt$AddCardFlowResultHandler$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoFpsRangesFor = function12;
    }
}

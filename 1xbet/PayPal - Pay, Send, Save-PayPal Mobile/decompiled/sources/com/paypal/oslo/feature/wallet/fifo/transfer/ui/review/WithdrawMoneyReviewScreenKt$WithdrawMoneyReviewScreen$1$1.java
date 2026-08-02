package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1", f = "WithdrawMoneyReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult withdrawMoneyNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult withdrawMoneyNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(withdrawMoneyNavResult);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult withdrawMoneyNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1) create(withdrawMoneyNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1 withdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1 = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1(this.Camera2StreamConfigurationMap, continuation);
        withdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1.getHighSpeedVideoSizes = obj;
        return withdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = appNavigator;
    }
}

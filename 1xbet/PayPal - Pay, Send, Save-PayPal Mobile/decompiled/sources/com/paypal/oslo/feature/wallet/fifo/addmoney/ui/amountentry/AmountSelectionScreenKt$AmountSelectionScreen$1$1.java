package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/AddMoneyNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$1$1", f = "AmountSelectionScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AmountSelectionScreenKt$AmountSelectionScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult addMoneyNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.resetState();
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$1$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult addMoneyNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(addMoneyNavResult);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult addMoneyNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$1$1) create(addMoneyNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$1$1 amountSelectionScreenKt$AmountSelectionScreen$1$1 = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        amountSelectionScreenKt$AmountSelectionScreen$1$1.Camera2StreamConfigurationMap = obj;
        return amountSelectionScreenKt$AmountSelectionScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmountSelectionScreenKt$AmountSelectionScreen$1$1(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel amountSelectionViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = amountSelectionViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }
}

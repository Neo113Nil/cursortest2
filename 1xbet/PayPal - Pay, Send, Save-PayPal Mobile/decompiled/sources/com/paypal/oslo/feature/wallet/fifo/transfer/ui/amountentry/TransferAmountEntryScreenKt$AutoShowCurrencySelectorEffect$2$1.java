package com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$2$1", f = "TransferAmountEntryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    int getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighSpeedVideoSizes) {
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.Camera2StreamConfigurationMap;
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig> state = this.getHighResolutionOutputSizeshNQ4ISI;
            appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$2$1.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt.access$AutoShowCurrencySelectorEffect$lambda$2(this.getHighSpeedVideoFpsRanges).invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State state, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination(com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt.access$AutoShowCurrencySelectorEffect$lambda$0(state)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$2$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$2$1(boolean z, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt$AutoShowCurrencySelectorEffect$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = z;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.getHighSpeedVideoFpsRanges = state2;
    }
}

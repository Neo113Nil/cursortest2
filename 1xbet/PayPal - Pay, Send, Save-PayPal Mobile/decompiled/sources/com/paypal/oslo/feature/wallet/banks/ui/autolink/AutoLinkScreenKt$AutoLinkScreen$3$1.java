package com.paypal.oslo.feature.wallet.banks.ui.autolink;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$3$1", f = "AutoLinkScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AutoLinkScreenKt$AutoLinkScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent access$AutoLinkScreen$lambda$5 = com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt.access$AutoLinkScreen$lambda$5(this.Camera2StreamConfigurationMap);
        if (access$AutoLinkScreen$lambda$5 instanceof com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Outcome) {
            com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent access$AutoLinkScreen$lambda$52 = com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt.access$AutoLinkScreen$lambda$5(this.Camera2StreamConfigurationMap);
            kotlin.jvm.internal.Intrinsics.checkNotNull(access$AutoLinkScreen$lambda$52, "");
            bankSharedViewModel.finishFlowWithResult(((com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Outcome) access$AutoLinkScreen$lambda$52).getOutcome());
        } else if (access$AutoLinkScreen$lambda$5 instanceof com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Success) {
            com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent access$AutoLinkScreen$lambda$53 = com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt.access$AutoLinkScreen$lambda$5(this.Camera2StreamConfigurationMap);
            kotlin.jvm.internal.Intrinsics.checkNotNull(access$AutoLinkScreen$lambda$53, "");
            com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Success success = (com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Success) access$AutoLinkScreen$lambda$53;
            final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen addBankSummaryScreen = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen(success.getLinkedBankAccounts(), success.getFailedBankAccounts(), success.getBankName(), success.getBankLogo());
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$3$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (access$AutoLinkScreen$lambda$5 != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen addBankSummaryScreen, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(addBankSummaryScreen);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$3$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AutoLinkScreenKt$AutoLinkScreen$3$1(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = bankSharedViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.Camera2StreamConfigurationMap = state;
    }
}

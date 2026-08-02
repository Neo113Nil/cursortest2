package com.paypal.oslo.feature.wallet.banks.ui.router;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterScreenKt$AddBankRouterScreen$1$1", f = "AddBankRouterScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddBankRouterScreenKt$AddBankRouterScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        boolean shouldHideManualAddBank = this.Camera2StreamConfigurationMap.getShouldHideManualAddBank();
        boolean skipSuccessScreen = this.Camera2StreamConfigurationMap.getSkipSuccessScreen();
        com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig = this.Camera2StreamConfigurationMap.getTopBarConfig();
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.setConfig$default(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, true ^ skipSuccessScreen, shouldHideManualAddBank, (topBarConfig != null ? topBarConfig.getStartNavAction() : null) == com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK, null, 16, null);
        this.getHighResolutionOutputSizeshNQ4ISI.setAddBankConfig(this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoSizes.initialize(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterScreenKt$AddBankRouterScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterScreenKt$AddBankRouterScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddBankRouterScreenKt$AddBankRouterScreen$1$1(com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterViewModel addBankRouterViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterScreenKt$AddBankRouterScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = addBankConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = bankSharedViewModel;
        this.getHighSpeedVideoFpsRangesFor = addFIAnalyticsContext;
        this.getHighSpeedVideoSizes = addBankRouterViewModel;
    }
}

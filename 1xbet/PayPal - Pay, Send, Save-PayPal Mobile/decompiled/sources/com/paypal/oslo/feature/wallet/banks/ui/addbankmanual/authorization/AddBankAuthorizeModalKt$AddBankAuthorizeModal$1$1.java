package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$AddBankAuthorizeModal$1$1", f = "AddBankAuthorizeModal.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddBankAuthorizeModalKt$AddBankAuthorizeModal$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.pds.components.BottomSheetController Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome access$AddBankAuthorizeModal$lambda$0 = com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt.access$AddBankAuthorizeModal$lambda$0(this.getHighSpeedVideoFpsRanges);
        if (access$AddBankAuthorizeModal$lambda$0 != null) {
            com.paypal.pds.components.BottomSheetController bottomSheetController = this.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel = this.getHighSpeedVideoSizes;
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRangesFor;
            bottomSheetController.hideSheet();
            manualAddBankViewModel.clearAddBankResult();
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$AddBankAuthorizeModal$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$AddBankAuthorizeModal$1$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(outcome));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$AddBankAuthorizeModal$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$AddBankAuthorizeModal$1$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddBankAuthorizeModalKt$AddBankAuthorizeModal$1$1(androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome> state, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$AddBankAuthorizeModal$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = state;
        this.Camera2StreamConfigurationMap = bottomSheetController;
        this.getHighSpeedVideoSizes = manualAddBankViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }
}

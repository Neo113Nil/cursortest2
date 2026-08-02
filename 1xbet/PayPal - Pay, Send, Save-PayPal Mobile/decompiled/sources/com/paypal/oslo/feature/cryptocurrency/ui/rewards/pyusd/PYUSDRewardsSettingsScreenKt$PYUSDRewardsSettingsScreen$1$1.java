package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoProvisioningNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$1$1", f = "PYUSDRewardsSettingsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult cryptoProvisioningNavResult = (com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult.Outcome outcome = cryptoProvisioningNavResult.getOutcome();
        if (kotlin.jvm.internal.Intrinsics.areEqual(outcome, com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult.Outcome.Completed.INSTANCE)) {
            this.getHighResolutionOutputSizeshNQ4ISI.handleEvent$cryptocurrency_prodRelease(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.ProvisioningCompleted.INSTANCE);
        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(outcome, com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult.Outcome.Canceled.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult cryptoProvisioningNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$1$1) create(cryptoProvisioningNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$1$1 pYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$1$1 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$1$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        pYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$1$1.Camera2StreamConfigurationMap = obj;
        return pYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$1$1(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pYUSDRewardsSettingsViewModel;
    }
}

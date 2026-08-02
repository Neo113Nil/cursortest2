package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$2$1", f = "DonationSummaryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DonationSummaryScreenKt$DonationSummaryScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState access$DonationSummaryScreen$lambda$0 = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt.access$DonationSummaryScreen$lambda$0(this.getHighSpeedVideoFpsRangesFor);
        if (access$DonationSummaryScreen$lambda$0 instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming) {
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$2$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState redeemState, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming redeeming = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming) redeemState;
        navigationScope.push(new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep.CONFIRMATION, redeeming.getRedeemType(), redeeming.getAvailablePoints()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$2$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DonationSummaryScreenKt$DonationSummaryScreen$2$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = state;
    }
}

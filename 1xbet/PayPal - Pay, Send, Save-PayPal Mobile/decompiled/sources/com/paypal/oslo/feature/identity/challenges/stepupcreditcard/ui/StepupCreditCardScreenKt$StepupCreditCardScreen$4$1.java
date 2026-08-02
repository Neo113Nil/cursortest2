package com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardScreen$4$1", f = "StepupCreditCardScreen.kt", i = {0}, l = {150}, m = "invokeSuspend", n = {"maxAttemptsState"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class StepupCreditCardScreenKt$StepupCreditCardScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt.access$StepupCreditCardScreen$lambda$2(this.getHighResolutionOutputSizeshNQ4ISI) instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached) {
                com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState access$StepupCreditCardScreen$lambda$2 = com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt.access$StepupCreditCardScreen$lambda$2(this.getHighResolutionOutputSizeshNQ4ISI);
                kotlin.jvm.internal.Intrinsics.checkNotNull(access$StepupCreditCardScreen$lambda$2, "");
                com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached maxAttemptsReached = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached) access$StepupCreditCardScreen$lambda$2;
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(maxAttemptsReached);
                this.getHighSpeedVideoSizesFor = 1;
                if (com.paypal.oslo.feature.identity.challenges.shared.ui.MaxAttemptsNavigationKt.navigateOnMaxAttemptsReached(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.getType(), maxAttemptsReached.getAvailableChallenges(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardScreen$4$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StepupCreditCardScreenKt$StepupCreditCardScreen$4$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = challengeContext;
        this.getHighSpeedVideoFpsRangesFor = challenge;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
    }
}

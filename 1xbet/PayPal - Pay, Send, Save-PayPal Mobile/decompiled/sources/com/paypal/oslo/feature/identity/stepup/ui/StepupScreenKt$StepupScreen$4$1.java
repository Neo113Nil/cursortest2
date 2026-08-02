package com.paypal.oslo.feature.identity.stepup.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$4$1", f = "StepupScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, nl = {313}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class StepupScreenKt$StepupScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect> uiEffect = this.Camera2StreamConfigurationMap.getUiEffect();
            final com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRanges;
            final java.lang.String str = this.getHighSpeedVideoSizes;
            final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$4$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect stepupUiEffect = (com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect) obj2;
                    if (!(stepupUiEffect instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.AutoRedirect)) {
                        if (!(stepupUiEffect instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.NavigateToChallenge)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.this, str, ((com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.NavigateToChallenge) stepupUiEffect).getChallengeData(), challengeResult.getChallengeContext(), true, challengeResult.getAvailableChallenges());
                    } else {
                        com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.this, str, ((com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.AutoRedirect) stepupUiEffect).getChallengeData(), challengeResult.getChallengeContext(), false, challengeResult.getAvailableChallenges());
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
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
        return ((com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$4$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupScreenKt$StepupScreen$4$1(com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel stepupViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$4$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = stepupViewModel;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = challengeResult;
    }
}

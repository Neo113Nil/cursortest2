package com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionScreen$3$1", f = "StepupSecurityQuestionScreen.kt", i = {0}, l = {120}, m = "invokeSuspend", n = {"maxAttemptsState"}, nl = {128}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class StepupSecurityQuestionScreenKt$SecurityQuestionScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState> getHighSpeedVideoSizes;
    int getInputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt.access$SecurityQuestionScreen$lambda$1(this.getHighSpeedVideoSizes) instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached) {
                com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState access$SecurityQuestionScreen$lambda$1 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt.access$SecurityQuestionScreen$lambda$1(this.getHighSpeedVideoSizes);
                kotlin.jvm.internal.Intrinsics.checkNotNull(access$SecurityQuestionScreen$lambda$1, "");
                com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached maxAttemptsReached = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached) access$SecurityQuestionScreen$lambda$1;
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(maxAttemptsReached);
                this.getInputFormats = 1;
                if (com.paypal.oslo.feature.identity.challenges.shared.ui.MaxAttemptsNavigationKt.navigateOnMaxAttemptsReached(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI.getType(), maxAttemptsReached.getAvailableChallenges(), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionScreen$3$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StepupSecurityQuestionScreenKt$SecurityQuestionScreen$3$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = challengeContext;
        this.getHighResolutionOutputSizeshNQ4ISI = challenge;
        this.getHighSpeedVideoSizes = state;
    }
}

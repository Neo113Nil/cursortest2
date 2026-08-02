package com.paypal.oslo.feature.identity.challenges.stepupotp.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$StepupOtpVerificationScreen$3$1", f = "StepupOtpVerificationScreen.kt", i = {0}, l = {143}, m = "invokeSuspend", n = {"maxAttemptsState"}, nl = {151}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class StepupOtpVerificationScreenKt$StepupOtpVerificationScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt.access$StepupOtpVerificationScreen$lambda$3(this.getHighSpeedVideoFpsRanges) instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached) {
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState access$StepupOtpVerificationScreen$lambda$3 = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt.access$StepupOtpVerificationScreen$lambda$3(this.getHighSpeedVideoFpsRanges);
                kotlin.jvm.internal.Intrinsics.checkNotNull(access$StepupOtpVerificationScreen$lambda$3, "");
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached maxAttemptsReached = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached) access$StepupOtpVerificationScreen$lambda$3;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(maxAttemptsReached);
                this.getInputSizeshNQ4ISI = 1;
                if (com.paypal.oslo.feature.identity.challenges.shared.ui.MaxAttemptsNavigationKt.navigateOnMaxAttemptsReached(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor.getType(), maxAttemptsReached.getLatestChallenges(), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$StepupOtpVerificationScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$StepupOtpVerificationScreen$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StepupOtpVerificationScreenKt$StepupOtpVerificationScreen$3$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$StepupOtpVerificationScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = challengeContext;
        this.getHighSpeedVideoFpsRangesFor = challenge;
        this.getHighSpeedVideoFpsRanges = state;
    }
}

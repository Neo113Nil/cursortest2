package com.paypal.oslo.feature.identity.challenges.stepupotp.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$StepupOtpVerificationScreen$2$1", f = "StepupOtpVerificationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class StepupOtpVerificationScreenKt$StepupOtpVerificationScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes.initializeChallenge(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$StepupOtpVerificationScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$StepupOtpVerificationScreen$2$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StepupOtpVerificationScreenKt$StepupOtpVerificationScreen$2$1(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$StepupOtpVerificationScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = stepupOtpVerificationViewModel;
        this.Camera2StreamConfigurationMap = challenge;
        this.getHighSpeedVideoFpsRanges = challengeContext;
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }
}

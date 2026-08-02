package com.paypal.oslo.feature.identity.stepup.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$2$1", f = "StepupScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class StepupScreenKt$StepupScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Iterator<T> it = this.getHighResolutionOutputSizeshNQ4ISI.getAvailableChallenges().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj2;
            if (challenge.getType() == com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH && challenge.isEligible()) {
                break;
            }
        }
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj2;
        if (this.getHighResolutionOutputSizeshNQ4ISI.getChallengeContext().getPriorityStrategy() != com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.SilentAuthFirst || challenge2 == null) {
            this.getHighSpeedVideoFpsRangesFor.initialize$identity_prodRelease(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData(challenge2, false, (java.util.Map) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), this.getHighResolutionOutputSizeshNQ4ISI.getChallengeContext(), false, this.getHighResolutionOutputSizeshNQ4ISI.getAvailableChallenges());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupScreenKt$StepupScreen$2$1(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel stepupViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = challengeResult;
        this.getHighSpeedVideoSizes = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = stepupViewModel;
    }
}

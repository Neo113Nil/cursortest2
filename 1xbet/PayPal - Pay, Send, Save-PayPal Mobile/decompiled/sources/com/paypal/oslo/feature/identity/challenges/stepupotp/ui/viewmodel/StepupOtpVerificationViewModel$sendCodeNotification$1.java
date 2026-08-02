package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel$sendCodeNotification$1", f = "StepupOtpVerificationViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m = "invokeSuspend", n = {"input"}, nl = {1005}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class StepupOtpVerificationViewModel$sendCodeNotification$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.String getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    final /* synthetic */ boolean getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext;
        com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase notifyChallengeUseCase;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType type = this.Camera2StreamConfigurationMap.getType();
            java.lang.String str3 = this.getHighSpeedVideoFpsRanges;
            java.lang.String str4 = this.getHighSpeedVideoSizes;
            java.lang.String str5 = this.getInputFormats;
            challengeContext = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext3 = null;
            if (challengeContext == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                challengeContext = null;
            }
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyChallengeInput notifyChallengeInput = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyChallengeInput(str, str2, type, str3, str4, str5, challengeContext.getAuthIntent());
            notifyChallengeUseCase = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            challengeContext2 = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
            if (challengeContext2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                challengeContext3 = challengeContext2;
            }
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(notifyChallengeInput);
            this.getHighSpeedVideoSizesFor = 1;
            obj = notifyChallengeUseCase.invoke(notifyChallengeInput, challengeContext3.getFlowType(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel = this.getInputSizeshNQ4ISI;
        java.lang.String str6 = this.getHighSpeedVideoFpsRanges;
        boolean z = this.getOutputMinFrameDuration;
        java.lang.String str7 = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.access$handleNotifySuccess(stepupOtpVerificationViewModel, (com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult) ((arrow.core.Either.Right) either).getValue(), str6, z, str7);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.access$handleNotifyError(stepupOtpVerificationViewModel, (com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError) ((arrow.core.Either.Left) either).getValue());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel$sendCodeNotification$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel$sendCodeNotification$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupOtpVerificationViewModel$sendCodeNotification$1(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel$sendCodeNotification$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.Camera2StreamConfigurationMap = challenge;
        this.getHighSpeedVideoFpsRanges = str3;
        this.getHighSpeedVideoSizes = str4;
        this.getInputFormats = str5;
        this.getInputSizeshNQ4ISI = stepupOtpVerificationViewModel;
        this.getOutputMinFrameDuration = z;
    }
}

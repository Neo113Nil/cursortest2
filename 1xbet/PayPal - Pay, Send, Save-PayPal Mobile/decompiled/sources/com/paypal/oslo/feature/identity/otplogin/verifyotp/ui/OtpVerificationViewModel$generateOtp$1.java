package com.paypal.oslo.feature.identity.otplogin.verifyotp.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel$generateOtp$1", f = "OtpVerificationViewModel.kt", i = {0}, l = {225}, m = "invokeSuspend", n = {"request"}, nl = {226}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class OtpVerificationViewModel$generateOtp$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase otpGenerationUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationRequest otpGenerationRequest = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationRequest(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, "", com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN);
            otpGenerationUseCase = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(otpGenerationRequest);
            this.getInputFormats = 1;
            obj = otpGenerationUseCase.invoke(otpGenerationRequest, this);
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
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            function1.invoke(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpSent.INSTANCE);
        } else if (either instanceof arrow.core.Either.Left) {
            function1.invoke(new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpFailed(((com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError) ((arrow.core.Either.Left) either).getValue()).toString()));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel$generateOtp$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel$generateOtp$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OtpVerificationViewModel$generateOtp$1(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel otpVerificationViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel$generateOtp$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.Camera2StreamConfigurationMap = str3;
        this.getOutputMinFrameDuration = otpVerificationViewModel;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}

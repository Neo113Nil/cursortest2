package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel$resendOtp$1", f = "EmailConfirmationViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE}, m = "invokeSuspend", n = {}, nl = {269}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class EmailConfirmationViewModel$resendOtp$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.RequestEmailVerificationCodeUseCase requestEmailVerificationCodeUseCase;
        java.lang.String str;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper otpErrorDisplayMapper;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(((com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState) mutableStateFlow2.getValue()).copy(null, true));
            requestEmailVerificationCodeUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            str = this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor;
            this.Camera2StreamConfigurationMap = 1;
            obj = requestEmailVerificationCodeUseCase.m16345invokeE4ilnuY(str, this);
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
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel emailConfirmationViewModel = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            mutableStateFlow5 = emailConfirmationViewModel.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow6 = emailConfirmationViewModel.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow5.setValue(com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState.copy$default((com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState) mutableStateFlow6.getValue(), null, false, 1, null));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError = (com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError) ((arrow.core.Either.Left) either).getValue();
            mutableStateFlow3 = emailConfirmationViewModel.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow4 = emailConfirmationViewModel.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState emailConfirmationState = (com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState) mutableStateFlow4.getValue();
            otpErrorDisplayMapper = emailConfirmationViewModel.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow3.setValue(emailConfirmationState.copy(otpErrorDisplayMapper.mapToOtpErrorDisplay(apiCallError), false));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel$resendOtp$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel$resendOtp$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailConfirmationViewModel$resendOtp$1(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel emailConfirmationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel$resendOtp$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = emailConfirmationViewModel;
    }
}

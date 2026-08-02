package com.paypal.oslo.feature.onboarding.signup.phone.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$resendOtp$1", f = "PhoneOtpVerificationViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PhoneOtpVerificationViewModel$resendOtp$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.RequestPhoneVerificationCodeUseCase requestPhoneVerificationCodeUseCase;
        java.lang.String str;
        java.lang.String str2;
        int i;
        java.lang.String str3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper otpErrorDisplayMapper;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizes.getOutputFormats;
            mutableStateFlow2 = this.getHighSpeedVideoSizes.getOutputFormats;
            mutableStateFlow.setValue(((com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) mutableStateFlow2.getValue()).copy(null, true));
            requestPhoneVerificationCodeUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            str = this.getHighSpeedVideoSizes.getOutputSizes;
            java.lang.String m15979constructorimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15979constructorimpl(str);
            str2 = this.getHighSpeedVideoSizes.getOutputStallDuration;
            i = this.getHighSpeedVideoSizes.getOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone phone = new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone(m15979constructorimpl, str2, i, null);
            str3 = this.getHighSpeedVideoSizes.getOutputStallDuration;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = requestPhoneVerificationCodeUseCase.m16405invokeAttygxE(phone, str3, new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneConfirmationDetails(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneConfirmationType.SMS, com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType.ANDROID), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            mutableStateFlow5 = phoneOtpVerificationViewModel.getOutputFormats;
            mutableStateFlow6 = phoneOtpVerificationViewModel.getOutputFormats;
            mutableStateFlow5.setValue(com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState.copy$default((com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) mutableStateFlow6.getValue(), null, false, 1, null));
            com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel.access$startSmsRetrieval(phoneOtpVerificationViewModel);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError = (com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError) ((arrow.core.Either.Left) either).getValue();
            mutableStateFlow3 = phoneOtpVerificationViewModel.getOutputFormats;
            mutableStateFlow4 = phoneOtpVerificationViewModel.getOutputFormats;
            com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState phoneOtpVerificationState = (com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) mutableStateFlow4.getValue();
            otpErrorDisplayMapper = phoneOtpVerificationViewModel.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow3.setValue(phoneOtpVerificationState.copy(otpErrorDisplayMapper.mapToOtpErrorDisplay(apiCallError), false));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$resendOtp$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$resendOtp$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneOtpVerificationViewModel$resendOtp$1(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$resendOtp$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = phoneOtpVerificationViewModel;
    }
}

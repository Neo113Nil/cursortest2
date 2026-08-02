package com.paypal.oslo.feature.onboarding.signup.phone.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$submitVerificationCode$1", f = "PhoneOtpVerificationViewModel.kt", i = {1, 1, 1, 1, 1}, l = {325, com.visa.cbp.getCertUsage.isReperso}, m = "invokeSuspend", n = {"result", "this_$iv", "confirmationState", "$i$f$fold", "$i$a$-fold-PhoneOtpVerificationViewModel$submitVerificationCode$1$2"}, nl = {327, 350}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class PhoneOtpVerificationViewModel$submitVerificationCode$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel getInputFormats;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bb, code lost:
    
        if (r6.emit(r9, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0110, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r11 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.ConfirmPhoneVerificationCodeUseCase confirmPhoneVerificationCodeUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper otpErrorDisplayMapper;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow7;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow8;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.String str;
        java.lang.String str2;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputMinFrameDuration;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputFormats.getOutputFormats;
            mutableStateFlow2 = this.getInputFormats.getOutputFormats;
            mutableStateFlow.setValue(((com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) mutableStateFlow2.getValue()).copy(null, true));
            confirmPhoneVerificationCodeUseCase = this.getInputFormats.getHighSpeedVideoFpsRangesFor;
            this.getOutputMinFrameDuration = 1;
            obj = confirmPhoneVerificationCodeUseCase.m16404invokeLcHNf2w(com.paypal.oslo.feature.onboarding.signup.domain.model.OtpCode.m16307constructorimpl(this.getHighSpeedVideoFpsRangesFor), this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel = this.getInputFormats;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState confirmationState = (com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState) ((arrow.core.Either.Right) either).getValue();
            if (confirmationState instanceof com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState.Confirmed) {
                mutableStateFlow7 = phoneOtpVerificationViewModel.getOutputFormats;
                mutableStateFlow8 = phoneOtpVerificationViewModel.getOutputFormats;
                mutableStateFlow7.setValue(((com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) mutableStateFlow8.getValue()).copy(null, false));
                mutableSharedFlow = phoneOtpVerificationViewModel.getHighSpeedVideoSizesFor;
                str = phoneOtpVerificationViewModel.getOutputSizes;
                str2 = phoneOtpVerificationViewModel.getOutputStallDuration;
                i = phoneOtpVerificationViewModel.getOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationResult phoneOtpVerificationResult = new com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationResult(str, str2, i, null);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmationState);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.Camera2StreamConfigurationMap = 0;
                this.getOutputMinFrameDuration = 2;
            } else if (confirmationState instanceof com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState.Initiated) {
                mutableStateFlow5 = phoneOtpVerificationViewModel.getOutputFormats;
                mutableStateFlow6 = phoneOtpVerificationViewModel.getOutputFormats;
                mutableStateFlow5.setValue(((com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) mutableStateFlow6.getValue()).copy(null, false));
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
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
        return ((com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$submitVerificationCode$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$submitVerificationCode$1(this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneOtpVerificationViewModel$submitVerificationCode$1(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$submitVerificationCode$1> continuation) {
        super(2, continuation);
        this.getInputFormats = phoneOtpVerificationViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}

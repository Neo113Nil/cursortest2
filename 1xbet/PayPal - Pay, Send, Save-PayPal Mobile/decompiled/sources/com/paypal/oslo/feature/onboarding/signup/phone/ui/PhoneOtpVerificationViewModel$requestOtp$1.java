package com.paypal.oslo.feature.onboarding.signup.phone.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$requestOtp$1", f = "PhoneOtpVerificationViewModel.kt", i = {1, 1, 1, 1, 1}, l = {204, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m = "invokeSuspend", n = {"result", "this_$iv", "confirmationState", "$i$f$fold", "$i$a$-fold-PhoneOtpVerificationViewModel$requestOtp$1$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, 238}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class PhoneOtpVerificationViewModel$requestOtp$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b6, code lost:
    
        if (r3.emit(r9, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x010e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (r11 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.RequestPhoneVerificationCodeUseCase requestPhoneVerificationCodeUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper otpErrorDisplayMapper;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.String str;
        java.lang.String str2;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getInputFormats;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            requestPhoneVerificationCodeUseCase = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges;
            this.getInputFormats = 1;
            obj = requestPhoneVerificationCodeUseCase.m16405invokeAttygxE(new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone(com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15979constructorimpl(this.getHighSpeedVideoFpsRanges), this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null), this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneConfirmationDetails(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneConfirmationType.SMS, com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType.ANDROID), this);
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
        com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel = this.getHighSpeedVideoSizesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState confirmationState = (com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState) ((arrow.core.Either.Right) either).getValue();
            if (confirmationState instanceof com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState.Confirmed) {
                mutableStateFlow5 = phoneOtpVerificationViewModel.getOutputFormats;
                mutableStateFlow6 = phoneOtpVerificationViewModel.getOutputFormats;
                mutableStateFlow5.setValue(com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState.copy$default((com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) mutableStateFlow6.getValue(), null, false, 1, null));
                mutableSharedFlow = phoneOtpVerificationViewModel.getHighSpeedVideoSizesFor;
                str = phoneOtpVerificationViewModel.getOutputSizes;
                str2 = phoneOtpVerificationViewModel.getOutputStallDuration;
                i = phoneOtpVerificationViewModel.getOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationResult phoneOtpVerificationResult = new com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationResult(str, str2, i, null);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmationState);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getInputFormats = 2;
            } else if (confirmationState instanceof com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState.Initiated) {
                mutableStateFlow3 = phoneOtpVerificationViewModel.getOutputFormats;
                mutableStateFlow4 = phoneOtpVerificationViewModel.getOutputFormats;
                mutableStateFlow3.setValue(com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState.copy$default((com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) mutableStateFlow4.getValue(), null, false, 1, null));
                com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel.access$startSmsRetrieval(phoneOtpVerificationViewModel);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError = (com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError) ((arrow.core.Either.Left) either).getValue();
            mutableStateFlow = phoneOtpVerificationViewModel.getOutputFormats;
            mutableStateFlow2 = phoneOtpVerificationViewModel.getOutputFormats;
            com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState phoneOtpVerificationState = (com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) mutableStateFlow2.getValue();
            otpErrorDisplayMapper = phoneOtpVerificationViewModel.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow.setValue(phoneOtpVerificationState.copy(otpErrorDisplayMapper.mapToOtpErrorDisplay(apiCallError), false));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$requestOtp$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$requestOtp$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneOtpVerificationViewModel$requestOtp$1(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel, java.lang.String str, java.lang.String str2, int i, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$requestOtp$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = phoneOtpVerificationViewModel;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = str2;
        this.Camera2StreamConfigurationMap = i;
    }
}

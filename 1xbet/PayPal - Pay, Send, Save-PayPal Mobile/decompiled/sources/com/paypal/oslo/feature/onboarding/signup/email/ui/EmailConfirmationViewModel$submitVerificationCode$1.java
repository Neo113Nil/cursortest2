package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel$submitVerificationCode$1", f = "EmailConfirmationViewModel.kt", i = {1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, 231}, m = "invokeSuspend", n = {"result", "this_$iv", "confirmationState", "$i$f$fold", "$i$a$-fold-EmailConfirmationViewModel$submitVerificationCode$1$2"}, nl = {215, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class EmailConfirmationViewModel$submitVerificationCode$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
    
        if (r1.emit(r4, r8) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0101, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r9 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ConfirmEmailVerificationCodeUseCase confirmEmailVerificationCodeUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper otpErrorDisplayMapper;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow7;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow8;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow2 = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(((com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState) mutableStateFlow2.getValue()).copy(null, true));
            confirmEmailVerificationCodeUseCase = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDuration = 1;
            obj = confirmEmailVerificationCodeUseCase.m16344invokeLcHNf2w(com.paypal.oslo.feature.onboarding.signup.domain.model.OtpCode.m16307constructorimpl(this.Camera2StreamConfigurationMap), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel emailConfirmationViewModel = this.getHighSpeedVideoSizesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState confirmationState = (com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState) ((arrow.core.Either.Right) either).getValue();
            if (confirmationState instanceof com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState.Confirmed) {
                mutableStateFlow7 = emailConfirmationViewModel.getHighSpeedVideoFpsRangesFor;
                mutableStateFlow8 = emailConfirmationViewModel.getHighSpeedVideoFpsRangesFor;
                mutableStateFlow7.setValue(((com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState) mutableStateFlow8.getValue()).copy(null, false));
                mutableSharedFlow = emailConfirmationViewModel.getOutputMinFrameDuration;
                com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailOtpVerificationResult.Success success = com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailOtpVerificationResult.Success.INSTANCE;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmationState);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getOutputMinFrameDuration = 2;
            } else if (confirmationState instanceof com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState.Initiated) {
                mutableStateFlow5 = emailConfirmationViewModel.getHighSpeedVideoFpsRangesFor;
                mutableStateFlow6 = emailConfirmationViewModel.getHighSpeedVideoFpsRangesFor;
                mutableStateFlow5.setValue(((com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState) mutableStateFlow6.getValue()).copy(null, false));
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
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
        return ((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel$submitVerificationCode$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel$submitVerificationCode$1(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailConfirmationViewModel$submitVerificationCode$1(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel emailConfirmationViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel$submitVerificationCode$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = emailConfirmationViewModel;
        this.Camera2StreamConfigurationMap = str;
    }
}

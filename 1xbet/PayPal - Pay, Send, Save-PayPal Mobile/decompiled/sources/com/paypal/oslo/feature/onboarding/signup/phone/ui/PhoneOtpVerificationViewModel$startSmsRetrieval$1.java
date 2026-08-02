package com.paypal.oslo.feature.onboarding.signup.phone.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$startSmsRetrieval$1", f = "PhoneOtpVerificationViewModel.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, nl = {167}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PhoneOtpVerificationViewModel$startSmsRetrieval$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StartSmsRetrieverUseCase startSmsRetrieverUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            startSmsRetrieverUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState> invoke = startSmsRetrieverUseCase.invoke();
            final com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$startSmsRetrieval$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                    com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState smsRetrieverState = (com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState) obj2;
                    mutableStateFlow = com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel.this.getInputSizeshNQ4ISI;
                    mutableStateFlow.setValue(smsRetrieverState);
                    if (smsRetrieverState instanceof com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Success) {
                        com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel.this.submitVerificationCode(((com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Success) smsRetrieverState).m16403getOtpCodeQfjPZuI());
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
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
        return ((com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$startSmsRetrieval$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$startSmsRetrieval$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneOtpVerificationViewModel$startSmsRetrieval$1(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel$startSmsRetrieval$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = phoneOtpVerificationViewModel;
    }
}

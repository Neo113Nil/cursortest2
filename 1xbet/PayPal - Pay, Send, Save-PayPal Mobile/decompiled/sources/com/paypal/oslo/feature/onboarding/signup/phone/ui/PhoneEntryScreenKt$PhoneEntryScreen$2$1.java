package com.paypal.oslo.feature.onboarding.signup.phone.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/onboarding/api/navigation/PhoneOtpVerificationNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt$PhoneEntryScreen$2$1", f = "PhoneEntryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PhoneEntryScreenKt$PhoneEntryScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI.clearApiError();
        this.Camera2StreamConfigurationMap.getOnNavigateNext().invoke();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationNavResult phoneOtpVerificationNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt$PhoneEntryScreen$2$1) create(phoneOtpVerificationNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt$PhoneEntryScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneEntryScreenKt$PhoneEntryScreen$2$1(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel phoneEntryViewModel, com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt$PhoneEntryScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = phoneEntryViewModel;
        this.Camera2StreamConfigurationMap = stepCallbacks;
    }
}

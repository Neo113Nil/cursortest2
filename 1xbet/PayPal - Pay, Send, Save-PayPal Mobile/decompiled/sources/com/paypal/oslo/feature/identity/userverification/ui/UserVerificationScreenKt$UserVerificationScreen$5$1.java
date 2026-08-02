package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "signupFlowNavResult", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$5$1", f = "UserVerificationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class UserVerificationScreenKt$UserVerificationScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult signupFlowNavResult = (com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.handleSignupFlowResult(signupFlowNavResult, this.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult signupFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$5$1) create(signupFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$5$1 userVerificationScreenKt$UserVerificationScreen$5$1 = new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$5$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        userVerificationScreenKt$UserVerificationScreen$5$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return userVerificationScreenKt$UserVerificationScreen$5$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserVerificationScreenKt$UserVerificationScreen$5$1(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$5$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = userVerificationViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}

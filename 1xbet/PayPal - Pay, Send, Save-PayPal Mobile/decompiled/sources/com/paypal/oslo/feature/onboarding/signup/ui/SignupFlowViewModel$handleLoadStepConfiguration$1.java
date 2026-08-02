package com.paypal.oslo.feature.onboarding.signup.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel", f = "SignupFlowViewModel.kt", i = {0, 0}, l = {239}, m = "handleLoadStepConfiguration-4HgBkxg", n = {"stepId", "currentFlowState"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class SignupFlowViewModel$handleLoadStepConfiguration$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.m16441access$handleLoadStepConfiguration4HgBkxg(this.getHighSpeedVideoSizes, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SignupFlowViewModel$handleLoadStepConfiguration$1(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$handleLoadStepConfiguration$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = signupFlowViewModel;
    }
}

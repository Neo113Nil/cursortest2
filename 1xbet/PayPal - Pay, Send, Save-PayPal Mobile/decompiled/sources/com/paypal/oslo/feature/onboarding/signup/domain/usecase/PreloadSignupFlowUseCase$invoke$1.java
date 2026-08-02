package com.paypal.oslo.feature.onboarding.signup.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase", f = "PreloadSignupFlowUseCase.kt", i = {0, 0}, l = {46}, m = "invoke-k3UT_Go", n = {com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY}, nl = {51}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class PreloadSignupFlowUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.m16332invokek3UT_Go(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreloadSignupFlowUseCase$invoke$1(com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase preloadSignupFlowUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = preloadSignupFlowUseCase;
    }
}

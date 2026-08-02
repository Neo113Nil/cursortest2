package com.paypal.oslo.feature.onboarding.signup.welcome.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$2$1", f = "WelcomeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class WelcomeScreenKt$WelcomeScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.airbnb.lottie.compose.LottieCompositionResult getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.airbnb.lottie.LottieComposition value;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        value = this.getHighSpeedVideoFpsRangesFor.getValue();
        if (value != null) {
            com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel.updateFrame$default(this.getHighResolutionOutputSizeshNQ4ISI, null, 1, null);
            if (!this.getHighSpeedVideoSizes) {
                this.getHighResolutionOutputSizeshNQ4ISI.startAnimation();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WelcomeScreenKt$WelcomeScreen$2$1(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel, boolean z, com.airbnb.lottie.compose.LottieCompositionResult lottieCompositionResult, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = welcomeViewModel;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = lottieCompositionResult;
    }
}

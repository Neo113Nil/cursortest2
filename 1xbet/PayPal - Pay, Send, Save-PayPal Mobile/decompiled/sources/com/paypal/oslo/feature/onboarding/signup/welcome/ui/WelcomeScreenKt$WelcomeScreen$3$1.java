package com.paypal.oslo.feature.onboarding.signup.welcome.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$3$1", f = "WelcomeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class WelcomeScreenKt$WelcomeScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.onboarding.signup.welcome.analytics.WelcomeAnalytics.INSTANCE.trackScreenAppeared$onboarding_prodRelease(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.access$WelcomeScreen$lambda$1(this.getHighSpeedVideoFpsRangesFor));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$3$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WelcomeScreenKt$WelcomeScreen$3$1(androidx.compose.runtime.State<? extends com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = state;
    }
}

package com.paypal.oslo.feature.cryptocurrency.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "navResult", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$1$1", f = "CryptoOnboardingScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoOnboardingScreenKt$CryptoOnboardingScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult oneOnboardingFlowNavResult = (com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt.handleNavigationEffect(this.getHighSpeedVideoFpsRanges.mapStatusToEffect(oneOnboardingFlowNavResult.getStatus()), this.getHighSpeedVideoSizes);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult oneOnboardingFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$1$1) create(oneOnboardingFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$1$1 cryptoOnboardingScreenKt$CryptoOnboardingScreen$1$1 = new com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        cryptoOnboardingScreenKt$CryptoOnboardingScreen$1$1.getHighSpeedVideoFpsRangesFor = obj;
        return cryptoOnboardingScreenKt$CryptoOnboardingScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOnboardingScreenKt$CryptoOnboardingScreen$1$1(com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel cryptoOnboardingViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = cryptoOnboardingViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
    }
}

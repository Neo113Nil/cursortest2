package com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/onboarding/OnboardingTapToPayNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$AddNfcScreenContent$1$1$1", f = "AddNfcScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AddNfcScreenKt$AddNfcScreenContent$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.NfcResultHandler getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult onboardingTapToPayNavResult = (com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.handleResult(onboardingTapToPayNavResult);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult onboardingTapToPayNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$AddNfcScreenContent$1$1$1) create(onboardingTapToPayNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$AddNfcScreenContent$1$1$1 addNfcScreenKt$AddNfcScreenContent$1$1$1 = new com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$AddNfcScreenContent$1$1$1(this.getHighSpeedVideoFpsRanges, continuation);
        addNfcScreenKt$AddNfcScreenContent$1$1$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return addNfcScreenKt$AddNfcScreenContent$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddNfcScreenKt$AddNfcScreenContent$1$1$1(com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.NfcResultHandler nfcResultHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$AddNfcScreenContent$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = nfcResultHandler;
    }
}

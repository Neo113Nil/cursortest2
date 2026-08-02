package com.paypal.oslo.feature.smartroute.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsOnBoardingNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SavingsOnboardingResultHandler$1$1", f = "SmartRouteDistributionViewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SmartRouteDistributionViewScreenKt$SavingsOnboardingResultHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.savings.api.navigation.result.SavingsOnBoardingNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.api.navigation.result.SavingsOnBoardingNavResult savingsOnBoardingNavResult = (com.paypal.oslo.feature.savings.api.navigation.result.SavingsOnBoardingNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent handleSavingsOnboardingResult = com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.handleSavingsOnboardingResult(savingsOnBoardingNavResult);
        if (handleSavingsOnboardingResult != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(handleSavingsOnboardingResult);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.savings.api.navigation.result.SavingsOnBoardingNavResult savingsOnBoardingNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SavingsOnboardingResultHandler$1$1) create(savingsOnBoardingNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SavingsOnboardingResultHandler$1$1 smartRouteDistributionViewScreenKt$SavingsOnboardingResultHandler$1$1 = new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SavingsOnboardingResultHandler$1$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        smartRouteDistributionViewScreenKt$SavingsOnboardingResultHandler$1$1.getHighSpeedVideoSizes = obj;
        return smartRouteDistributionViewScreenKt$SavingsOnboardingResultHandler$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SmartRouteDistributionViewScreenKt$SavingsOnboardingResultHandler$1$1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SavingsOnboardingResultHandler$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}
